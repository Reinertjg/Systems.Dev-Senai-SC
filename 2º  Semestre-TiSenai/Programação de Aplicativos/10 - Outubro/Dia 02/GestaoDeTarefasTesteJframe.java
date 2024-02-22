package gestaodetarefas;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class gestaodetarefas {

    String titulo;
    String descricao;
    Date dataVencimento;

    // Construtor da classe Tarefa
    public gestaodetarefas (String titulo, String descricao, Date dataVencimento) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
    }

    public String getTitulo() {

        return titulo;

    }

    public String getDescricao() {

        return descricao;

    }

    public Date getDataVencimento() {

        return dataVencimento;

    }

}

public class GestaoDeTarefasTesteJframe {

    static int cc = 0;
    static ArrayList<Tarefa> listaTarefas = new ArrayList<>();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    static DefaultTableModel model = new DefaultTableModel();
    static JTable table = new JTable(model);
    static JFrame frame = new JFrame("Tabela De Tarefas Cadastradas");

    public static void main(String[] args) {

        // Cria um Jframe para a tabela
        CreateJframe();

        while (true) {
            frame.setVisible(false);
            // Array de opções para o menu
            Object[] opcoes = {"Cadastro de Tarefas", "Vizualizar Tarefas", "Atualizar a Tarefa", "Excluir Tarefa",
                "Data de Vencimento das Tarefas", "Sair"};

            // Exibe um menu de escolha
            Object escolha = JOptionPane.showInputDialog(null, "Sistema de Gestão de Tarefas", "Menu",
                    JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            String escolhaOpcao = (String) escolha;

            switch (escolhaOpcao) {

                case "Cadastro de Tarefas" ->
                    CadastrarTarefa();

                case "Vizualizar Tarefas" ->
                    ListarTarefas();

                case "Atualizar a Tarefa" ->
                    AtualizarTarefa();

                case "Excluir Tarefa" ->
                    ExcluirTarefa();

                case "Data de Vencimento das Tarefas" ->
                    VencimentoTarefas();

                case "Sair" ->
                    Sair();

            }

        }

    }

    public static void CadastrarTarefa() {
        // Solicita ao usuário as informações da nova tarefa
        String titulo = JOptionPane.showInputDialog("Digite o título da tarefa:");
        String descricao = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
        String dataStr = JOptionPane.showInputDialog("Digite a data de vencimento (dd/MM/yyyy):");

        try {
            // Tenta converter a string de data em um objeto Date
            Date dataVencimento = dateFormat.parse(dataStr);

            // Cria um objeto Tarefa com as informações fornecidas
            Tarefa tarefa = new Tarefa(titulo, descricao, dataVencimento);

            // Adiciona a tarefa à lista de tarefas
            listaTarefas.add(tarefa);

            JOptionPane.showMessageDialog(null, "Tarefa cadastrada com sucesso.");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao cadastrar tarefa. Verifique a data.");
        }
    }

    public static void ListarTarefas() {
        // Se a lista de tarefas estiver vazia, exibe uma mensagem informativa
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há tarefas cadastradas.");
            return;
        }

        // Exibe a tabela
        Jframe();

        JOptionPane.showMessageDialog(null, "Clique OK para continuar.");

    }

    public static void AtualizarTarefa() {
        // Exibe a tabela
        Jframe();

        String titulo = JOptionPane.showInputDialog("Digite o título da tarefa que deseja atualizar:");
        Tarefa tarefa = encontrarTarefaPorTitulo(titulo);

        if (tarefa != null) {
            String novoTitulo = JOptionPane.showInputDialog("Digite o novo título:");
            String novaDescricao = JOptionPane.showInputDialog("Digite a nova descrição:");
            String novaDataStr = JOptionPane.showInputDialog("Digite a nova data de vencimento (dd/MM/yyyy): ");

            try {
                Date novaDataVencimento = dateFormat.parse(novaDataStr);
                tarefa.titulo = novoTitulo;
                tarefa.descricao = novaDescricao;
                tarefa.dataVencimento = novaDataVencimento;
                cc++;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data inválida. Verifique a data");
            }
        } else {
            cc--;
            JOptionPane.showMessageDialog(null, "Tarefa não encontrada.");
        }

        if (cc == 1) {
            // Exibe a tabela atualizada para o usuário
            Jframe();
            JOptionPane.showMessageDialog(null, "Tarefa atualizada com sucesso.");
        }
    }

    public static void ExcluirTarefa() {
        // Exibe a tabela
        Jframe();

        String titulo = JOptionPane.showInputDialog("Digite o título da tarefa que deseja excluir:");
        Tarefa tarefa = encontrarTarefaPorTitulo(titulo);

        if (tarefa != null) {
            // Remove a tarefa da lista
            listaTarefas.remove(tarefa);
            JOptionPane.showMessageDialog(null, "Tarefa excluída com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Tarefa não encontrada.");
        }
    }

    public static void VencimentoTarefas() {
        // Se a lista de tarefas estiver vazia, exibe uma mensagem informativa
        if (listaTarefas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há tarefas cadastradas.");
            return;
        }
        // Cria um objeto que verifica a data atual do computador
        Date dataAtual = new Date();

        // Remove todas as linhas do modelo da tabela.
        model.setRowCount(0);

        for (Tarefa tarefa : listaTarefas) {

            if (tarefa.getDataVencimento().before(dataAtual)) {
                // Cria um objeto que alimenta a linha da tabela com o título, descrição e data de vencimento da tarefa vencida.
                Object[] rowData = {tarefa.getTitulo(), tarefa.getDescricao(),
                    dateFormat.format(tarefa.getDataVencimento())};
                //Adiciona uma linha na Tabela
                model.addRow(rowData);
                cc++;

            }
            if (tarefa.getDataVencimento().before(dataAtual)) {

                frame.setVisible(true);
                JOptionPane.showMessageDialog(null, "Tarefas Vencidas", "Tarefas Vencidas",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        }

        if (cc == 0) {
            JOptionPane.showMessageDialog(null, "Não há Tarefas Vencidas ", "Tarefas Vencidas",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        cc = 0;

    }

    public static void CreateJframe() {
        //Cria as colunas da tabela
        model.addColumn("Titulo");
        model.addColumn("Descrição");
        model.addColumn("Data de Vencimento");
        
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Adiciona um componente gráfico "JScrollPane(table)" que contem uma tabela
        frame.getContentPane().add(new JScrollPane(table));
        //Ajusta automaticamente o tamanho do JFrame
        frame.pack();

        // Obtém o tamanho da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Obtém o tamanho do componente
        Dimension frameSize = frame.getSize();

        // Calcula a posição X para centralizar o componente na tela
        int x = (screenSize.width - frameSize.width) / 2;

        frame.setLocation(x, 0);
    }

    public static void Jframe() {
        //Zera as linhas da tabela
        model.setRowCount(0);
        for (Tarefa tarefa : listaTarefas) {
            //Adiciona 
            Object[] rowData = {tarefa.getTitulo(), tarefa.getDescricao(),
                dateFormat.format(tarefa.getDataVencimento())};
            model.addRow(rowData);
        }
        // Exibe a lista de tarefas
        frame.setVisible(true);

    }

    public static void Sair() {
        JOptionPane.showMessageDialog(null, "Saindo do Programa!", "ENCERRANDO", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    //método auxiliar para localizar uma tarefa com base no título
    public static Tarefa encontrarTarefaPorTitulo(String titulo) {
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                return tarefa;
            }
        }
        return null; //Retorna null se a tarefa não for encontrada
    }

}
