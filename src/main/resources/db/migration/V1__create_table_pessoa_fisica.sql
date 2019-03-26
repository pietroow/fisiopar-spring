create table pessoa_fisica(
id UUID primary key,
tipo VARCHAR(30) NOT NULL,
nome VARCHAR(100) NOT NULL,
data_nascimento DATE NOT NULL,
genero VARCHAR(15) NOT NULL,
estado_civil VARCHAR(13) NOT NULL,
etnia VARCHAR(20) NOT NULL,
nome_responsavel VARCHAR(100) NOT NULL,
nome_mae VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL
);

create table fisioterapeuta(
id UUID PRIMARY KEY,
especialidade VARCHAR(20) NOT NULL,
crefito VARCHAR(15) NOT NULL,
FOREIGN KEY (id) REFERENCES pessoa_fisica(id)
);

create table aluno(
id UUID PRIMARY KEY,
ra CHAR(12) NOT NULL,
curso CHAR(11) NOT NULL,
coordenador CHAR(11) NOT NULL,
FOREIGN KEY (id) REFERENCES pessoa_fisica(id)
);

create table paciente(
id UUID PRIMARY KEY,
convenio CHAR(12) NOT NULL,
observacoes CHAR(11) NOT NULL,
FOREIGN KEY (id) REFERENCES pessoa_fisica(id)
);
