DROP SCHEMA IF EXISTS msep;
CREATE SCHEMA msep;
use msep;

CREATE TABLE info_pessoais_aluno (
    cpf VARCHAR(15) PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    tel_celular_resp VARCHAR(15) NOT NULL,
    tel_residencial_resp VARCHAR(15),
    email_resp VARCHAR(40) NOT NULL,
    status_info BOOL DEFAULT 1
);

CREATE TABLE aluno (
    num_matricula_aluno Integer AUTO_INCREMENT PRIMARY KEY,
    data_inicio_aluno DATE NOT NULL,
    cpf_aluno VARCHAR(15) UNIQUE NOT NULL,
    email_aluno VARCHAR(40),
    status_aluno BOOL DEFAULT 1,
    CONSTRAINT fk_cpf_aluno FOREIGN KEY (cpf_aluno) REFERENCES info_pessoais_aluno(cpf)
);

CREATE TABLE Competencia (
    nome VARCHAR(100) primary key,
    tipo ENUM ('socioemocional', 'basica', 'tecnica'),
    descricao TEXT
);


CREATE TABLE Criterio (
    id_criterio INT AUTO_INCREMENT PRIMARY KEY,
    id_Competencia varchar(100) NOT NULL,
    tipo ENUM ('Critica', 'Desejada'),
    nome VARCHAR(100) not null,
    constraint fk_competencia_capacidade foreign key(id_Competencia) references competencia (nome)
);

create table alunoCriterio (
id_alunoCriterio int auto_increment primary key,
id_criterioAluno int not null,
num_matricula_aluno_capacidade Integer not null,
Avaliado Enum('SIM','NAO','AVALIAR'),
constraint fk_aluno_capacidade foreign key (num_matricula_aluno_capacidade) references aluno (num_matricula_aluno),
constraint fk_AlunoCritrio foreign key (id_criterioAluno) references Criterio (id_criterio)
);

select nome from Criterio where id_competencia in(select id_competencia from competencia where tipo = 'basica');

INSERT INTO info_pessoais_aluno (cpf, nome, tel_celular_resp, email_resp)
VALUES
('123.456.789-01', 'Fernando Pereira', '016995678901', 'fernando@email.com'),
('987.654.321-02', 'Juliana Santos Silva', '016995432102', 'juliana@email.com'),
('456.789.123-03', 'Mariana Silva Almeida', '016998912303', 'mariana@email.com'),
('789.123.456-04', 'Marcelo Mendes', '016997891234', 'marcelo@email.com'),
('234.567.890-05', 'Luana Oliveira', '016992345678', 'luana@email.com');

INSERT INTO aluno (data_inicio_aluno, cpf_aluno, email_aluno)
VALUES
('2022-01-10', '123.456.789-01', 'fernando1@emaileduc.com'),
('2022-06-01', '987.654.321-02', 'juliana22@emaileduc.com'),
('2021-01-15', '456.789.123-03', 'mariana32@emaileduc.com'),
('2023-01-10', '789.123.456-04', 'marcelo11@emaileduc.com'),
('2023-06-01', '234.567.890-05', 'luana123@emaileduc.com');

insert into Competencia(tipo,nome,descricao)
values('basica','azer Programa em','O aluno soube desenvolver uma aplicação em java');

insert into Criterio(id_Competencia,tipo,nome)
values('azer Programa em','Desejada','desenvolver uma aplicaçao em java');

DELIMITER //
create function QtdAlunoTurma (codigo_turma_function int)
returns int deterministic
begin
	declare QTD_Aluno int;
	select COUNT(*) into QTD_Aluno from matricula
    where codigo_turma = codigo_turma_function;
	return QTD_Aluno;
end //
DELIMITER ;

select * from competencia;

select * from Criterio;


