create table fisiopar.documento(
id UUID primary key,
tipo VARCHAR(20) NOT NULL,
numero VARCHAR(25) NOT NULL UNIQUE,
pessoa_id UUID NOT NULL,
FOREIGN KEY (pessoa_id) REFERENCES fisiopar.pessoa_fisica(id)
);

create table fisiopar.documento_cpf(
id UUID primary key,
FOREIGN KEY (id) REFERENCES fisiopar.documento(id)
);

create table fisiopar.documento_cartao_sus(
id UUID primary key,
FOREIGN KEY (id) REFERENCES fisiopar.documento(id)
);

create table fisiopar.documento_rg(
id UUID primary key,
FOREIGN KEY (id) REFERENCES fisiopar.documento(id)
);

create table fisiopar.cor(
id UUID primary key,
name varchar(100),
data_criacao date
);