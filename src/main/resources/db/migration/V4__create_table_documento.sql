create table fisiopar.documento(
id UUID primary key,
tipo VARCHAR(20) NOT NULL,
numero VARCHAR(25) NOT NULL UNIQUE,
pessoa_fk UUID NOT NULL,
FOREIGN KEY (pessoa_fk) REFERENCES fisiopar.pessoa_fisica(id)
);

create table fisiopar.cor(
id UUID primary key,
name varchar(100),
data_criacao date,
hexa numeric(20,2)
);