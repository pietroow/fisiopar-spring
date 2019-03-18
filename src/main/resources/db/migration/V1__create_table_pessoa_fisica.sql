create table fisiopar.pessoa_fisica(
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

create table fisiopar.fisioterapeuta(
id UUID PRIMARY KEY,
especialidade VARCHAR(20) NOT NULL,
crefito VARCHAR(15) NOT NULL,
FOREIGN KEY (id) REFERENCES fisiopar.pessoa_fisica(id)
);

create table fisiopar.aluno(
id UUID PRIMARY KEY,
ra CHAR(12) NOT NULL,
curso CHAR(11) NOT NULL,
coordenador CHAR(11) NOT NULL,
FOREIGN KEY (id) REFERENCES fisiopar.pessoa_fisica(id)
);

create table fisiopar.paciente(
id UUID PRIMARY KEY,
convenio CHAR(12) NOT NULL,
observacoes CHAR(11) NOT NULL,
FOREIGN KEY (id) REFERENCES fisiopar.pessoa_fisica(id)
);
--
--
--    <!-- ====================================================================================== -->
--
--    <changeSet id="createTablePaciente" author="pietro">
--        <createTable tableName="paciente">
--            <column name="id" type="uuid">
--                <constraints
--                        primaryKey="true"
--                        primaryKeyName="paciente_id_pk"
--                        foreignKeyName="paciente_id_fk"
--                        referencedTableName="pessoa_fisica"
--                        referencedColumnNames="id"/>
--            </column>
--
--            <column name="convenio" type="varchar(25)">
--                <constraints nullable="false"/>
--            </column>
--
--            <column name="observacoes" type="text"/>
--
--        </createTable>
--    </changeSet>
--
--    <changeSet id="createTableCurso" author="pietro">
--        <createTable tableName="curso">
--            <column name="id" type="uuid">
--                <constraints primaryKey="true" primaryKeyName="curso_id_pk"/>
--            </column>
--            <column name="nome" type="varchar(50)">
--                <constraints nullable="false"/>
--            </column>
--        </createTable>
--    </changeSet>