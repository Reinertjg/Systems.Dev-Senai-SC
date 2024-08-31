INSERT INTO tabelaAlunos (
    id_aluno, nome_aluno, data_nascimento, genero, endereco, telefone_contato, email
) VALUES 
(1,	'João Silva'	2005-03-15	'Masculino', 'Rua das Flores, 123',	(11) 9876-5432	'joao@email.com'),
(2,	'Maria Santos'	2006-06-20	'Feminino',	'Avenida Principal, 456',	(11) 8765-4321,	'maria@email.com'),
(3,	'Pedro Soares'	2004-01-10	'Masculino',	'Rua Central, 789',	(11) 7654-3210,	'pedro@email.com'),
(4,	'Ana Lima'	2005-04-02	'Feminino',	'Rua da Escola, 56',	(11) 8765-4321,	'ana@email.com'),
(5,	'Mariana Fernandes'	2005-08-12	'Feminino',	'Avenida da Paz, 789',	(11) 5678-1234,	'mariana@email.com'),
(6,	'Lucas Costa'	2003-11-25	'Masculino', 'Rua Principal, 456',	(11) 1234-5678,	'lucas@email.com)'),
(7,	'Isabela Santos'	2006-09-10	'Feminino',	'Rua da Amizade, 789',	(11) 9876-5432,	'isabela@email.com'),
(8,	'Gustavo Pereira'	2004-05-15	'Masculino',	'Avenida dos Sonhos, 123',	(11) 7654-3210,	'gustavo@email.com'),
(9,	'Carolina Oliveira'	2005-02-20	'Feminino',	'Rua da Alegria, 456',	(11) 8765-4321,	'carolina@email.com'),
(10, 'Daniel Silva'	2003-10-05	'Masculino',	'Avenida Central, 789',	(11) 1234-5678,	'daniel@email.com'),
(11, 'Larissa Souza'	2004-12-08	'Feminino',	'Rua da Felicidade, 123',	(11) 9876-5432,	'larissa@email.com'),
(12, 'Bruno Costa'	2005-07-30	'Masculino',	'Avenida Principal, 456',	(11) 7654-3210,	'bruno@email.co'm),
(13, 'Camila Rodrigues'	2006-03-22	'Feminino',	'Rua das Estrelas, 789',	(11) 8765-4321,	'camila@email.com'),
(14, 'Rafael Fernandes'	2004-11-18	'Masculino',	'Avenida dos Sonhos, 123',	(11) 1234-5678,	'rafael@email.com'),
(15, 'Letícia Oliveira'	2005-01-05	'Feminino',	'Rua da Alegria, 456',	(11) 9876-5432,	'leticia@email.com'),
(16, 'Fernanda Lima'	2004-02-12	'Feminino',	'Rua da Esperança, 789',	(11) 4567-8901,	'fernanda@email.com'),
(17, 'Vinícius Santos'	2003-07-28	'Masculino',	'Avenida da Amizade, 123',	(11) 8901-2345,	'vinicius@email.com'),
(18, 'Juliana Pereira'	2006-09-01	'Feminino',	'Rua das Rosas, 789',	(11) 3456-7890,	'juliana@email.com');

INSERT INTO tabelaProfessores (ID_Professor, Nome_Professor, Data_Nascimento, Genero, Telefone_Contato, Email) VALUES
(1, 'Ana Oliveira', '1980-05-25', 'Feminino', '(11) 1234-5678', 'ana@email.com'),
(2, 'Carlos Ferreira', '1975-09-12', 'Masculino', '(11) 2345-6789', 'carlos@email.com'),
(3, 'Mariana Santos', '1982-03-15', 'Feminino', '(11) 3456-7890', 'mariana@email.com'),
(4, 'Ricardo Silva', '1978-08-20', 'Masculino', '(11) 7890-1234', 'ricardo@email.com'),
(5, 'Fernanda Lima', '1985-01-30', 'Feminino', '(11) 4567-8901', 'fernanda@email.com');

INSERT INTO tabelaDisciplinas (
    ID_Disciplina, Nome_Disciplina, Descricao, Carga_Horaria, ID_Professor
) VALUES
(1, 'Matemática', 'Estudo de conceitos matemáticos avançados', 60, 1),
(2, 'História', 'História mundial e local', 45, 2),
(3, 'Física', 'Princípios fundamentais da física', 60, 1),
(4, 'Química', 'Estudo da química e suas aplicações', 45, 3),
(5, 'Inglês', 'Aulas de inglês para iniciantes', 45, 4),
(6, 'Artes', 'Exploração da criatividade artística', 30, 5);
