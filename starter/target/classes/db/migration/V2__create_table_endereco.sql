create table endereco(
id UUID primary key,
cep CHAR(8) NOT NULL,
logradouro VARCHAR(200) NOT NULL,
numero VARCHAR(20) NOT NULL,
bairro VARCHAR(50) NOT NULL,
uf CHAR(2) NOT NULL,
cidade VARCHAR(50) NOT NULL,
complemento VARCHAR(25),
pessoa_id UUID NOT NULL,
FOREIGN KEY (pessoa_id) REFERENCES pessoa_fisica(id)
);