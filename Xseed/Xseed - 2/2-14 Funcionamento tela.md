Pre-Screen (PS)
---
* A Pre-Screen é responsável por consultar a base de dados e apresentar os valores na tela.
* Após exibir os dados, a tela permanece ativa, aguardando alguma ação do usuário, momento em que a Pre-Linc é acionada.  

Pre-Linc (PL)
---
* A Pre-Linc realiza validações e lógicas da tela, manipulando os dados.
* Ela verifica se todos os campos foram preenchidos corretamente e se não há informações incorretas.
* Caso haja algum erro, a Pre-Linc não permitirá alterações no arquivo, informando a mensagem de erro e impedindo o início da lógica, evitando assim modificações em registros inválidos.

Lógica (LG)
--- 
* A Lógica é responsável por alterar os registros conforme as informações fornecidas pelo usuário na tela.
* Após a conclusão da alteração, a Lógica retorna à Pre-Screen para que os novos dados alterados sejam exibidos.
