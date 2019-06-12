CREATE TABLE usuario (
	id UUID PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	senha VARCHAR(150) NOT NULL
);

CREATE TABLE permissao (
	id UUID PRIMARY KEY,
	descricao VARCHAR(50) NOT NULL
);

CREATE TABLE usuario_permissao (
	usuario_fk UUID NOT NULL,
	permissao_fk UUID NOT NULL,
	PRIMARY KEY (usuario_fk, permissao_fk),
	FOREIGN KEY (usuario_fk) REFERENCES usuario(id),
	FOREIGN KEY (permissao_fk) REFERENCES permissao(id)
);

INSERT INTO usuario (id, nome, email, senha) values ('c6f5ce3e-77be-4d36-94a1-b156973910bb', 'Administrador', 'admin@unopar.com', '$2a$10$thuNxuVP4Pe4ljS7PIvia.SBs3hL66x.E2rpCdgcFK1rHKMPEWt76'); --admin
INSERT INTO usuario (id, nome, email, senha) values ('38097ef2-cb39-4b5d-8d0c-731082b938af', 'Victor Pietro', 'pietro@unopar.com', '$2a$10$C4GmlbTpcZ2z20F21RRLi.3fNmCH.mTKQnlrpVWglS8TDlG66nW9C'); --123mudar

INSERT INTO permissao (id, descricao) values ('d52fb455-b82f-4cfb-a71d-078a3cfa1142', 'ROLE_CADASTRAR_FISIOTERAPEUTA');
INSERT INTO permissao (id, descricao) values ('a0042bab-ff35-45ec-9052-f53cd94a41cb', 'ROLE_PESQUISAR_FISIOTERAPEUTA');
INSERT INTO permissao (id, descricao) values ('cdb5dbe9-7e8a-4011-ba7c-7af7f60316b1', 'ROLE_REMOVER_FISIOTERAPEUTA');

INSERT INTO permissao (id, descricao) values ('ae58c539-ffd7-492d-b739-eebbdb890ed6', 'ROLE_CADASTRAR_PACIENTE');
INSERT INTO permissao (id, descricao) values ('1763105e-3e99-4822-8e53-129e169a661b', 'ROLE_REMOVER_PACIENTE');
INSERT INTO permissao (id, descricao) values ('50a6a187-ac69-48a5-9e1b-ffbd531add88', 'ROLE_PESQUISAR_PACIENTE');


-- ADMIN
INSERT INTO usuario_permissao (usuario_fk, permissao_fk) values ('c6f5ce3e-77be-4d36-94a1-b156973910bb', 'd52fb455-b82f-4cfb-a71d-078a3cfa1142');
INSERT INTO usuario_permissao (usuario_fk, permissao_fk) values ('c6f5ce3e-77be-4d36-94a1-b156973910bb', 'a0042bab-ff35-45ec-9052-f53cd94a41cb');
INSERT INTO usuario_permissao (usuario_fk, permissao_fk) values ('c6f5ce3e-77be-4d36-94a1-b156973910bb', 'cdb5dbe9-7e8a-4011-ba7c-7af7f60316b1');
INSERT INTO usuario_permissao (usuario_fk, permissao_fk) values ('c6f5ce3e-77be-4d36-94a1-b156973910bb', 'ae58c539-ffd7-492d-b739-eebbdb890ed6');
INSERT INTO usuario_permissao (usuario_fk, permissao_fk) values ('c6f5ce3e-77be-4d36-94a1-b156973910bb', '1763105e-3e99-4822-8e53-129e169a661b');
INSERT INTO usuario_permissao (usuario_fk, permissao_fk) values ('c6f5ce3e-77be-4d36-94a1-b156973910bb', '50a6a187-ac69-48a5-9e1b-ffbd531add88');


-- PIETRO
INSERT INTO usuario_permissao (usuario_fk, permissao_fk) values ('38097ef2-cb39-4b5d-8d0c-731082b938af', 'ae58c539-ffd7-492d-b739-eebbdb890ed6');
INSERT INTO usuario_permissao (usuario_fk, permissao_fk) values ('38097ef2-cb39-4b5d-8d0c-731082b938af', '1763105e-3e99-4822-8e53-129e169a661b');
INSERT INTO usuario_permissao (usuario_fk, permissao_fk) values ('38097ef2-cb39-4b5d-8d0c-731082b938af', '50a6a187-ac69-48a5-9e1b-ffbd531add88');