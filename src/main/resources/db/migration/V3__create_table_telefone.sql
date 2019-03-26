create table telefone(
id UUID primary key,
numero VARCHAR(20) NOT NULL,
ddd VARCHAR(2) NOT NULL,
tipo VARCHAR(25) NOT NULL,
pessoa_id UUID NOT NULL,
FOREIGN KEY (pessoa_id) REFERENCES pessoa_fisica(id)
);