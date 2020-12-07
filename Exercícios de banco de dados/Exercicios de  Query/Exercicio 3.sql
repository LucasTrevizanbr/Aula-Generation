create database db_escola;
use  db_escola;
create table tb_alunos(
id bigint (5) auto_increment,
nome varchar(255)not null,
nota double(3,2),
serie varchar(255),
registro varchar(11),
horario varchar(255),
primary key(id)

);
insert into tb_alunos(nome,nota,serie,registro,horario) values("Jose carlos",6.8,"6°série","112233","Manhã");
insert into tb_alunos(nome,nota,serie,registro,horario) values("Maria Roberta",8.9,"7°série","112244","Manhã");
insert into tb_alunos(nome,nota,serie,registro,horario) values("Bruno almeida",4.2,"7°série","112255","Manhã");
insert into tb_alunos(nome,nota,serie,registro,horario) values("Mario",7.7,"6°série","112266","Manhã");
insert into tb_alunos(nome,nota,serie,registro,horario) values("Josefa almeida",9.8,"8°série","112277","Tarde");

select * from tb_alunos where nota>7;
select * from tb_alunos where nota<7;

update tb_alunos set nota = 9.8 where id=3;

select * from tb_alunos;