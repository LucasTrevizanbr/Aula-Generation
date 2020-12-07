create table tb_cargo(
id bigint(5)auto_increment,
cargo  varchar(255)not null,
salario decimal(10,2),
tempo varchar(255),
primary key(id)

);
create table tb_funcionarios(
id bigint(5) auto_increment,
nome varchar(255),
dependentes boolean,
ativo boolean,
vp boolean,
vl boolean,
cargo_id bigint not null,
primary key(id),
foreign key(cargo_id) references tb_cargo(id)

);
insert into tb_cargo(cargo,salario,tempo) values ("CEO",20000.00,"30 anos de empresa");
insert into tb_cargo(cargo,salario,tempo) values ("Alquimista",10000.00,"20 anos de empresa");
insert into tb_cargo(cargo,salario,tempo) values ("Desenvolvedor junior",2000.00,"1 ano de empresa");
insert into tb_cargo(cargo,salario,tempo) values ("Tia da cozinha",1900.00,"5 anos de empresa");
insert into tb_cargo(cargo,salario,tempo) values ("Guru espiritual",60000.00,"3 meses de empresa");

insert into tb_funcionarios(nome,dependentes,ativo,vp,vl,cargo_id)values("Jorge",true,true,true,true,1);
insert into tb_funcionarios(nome,dependentes,ativo,vp,vl,cargo_id)values("Gertrude",true,true,false,false,4);
insert into tb_funcionarios(nome,dependentes,ativo,vp,vl,cargo_id)values("Mario",true,true,true,true,3);
insert into tb_funcionarios(nome,dependentes,ativo,vp,vl,cargo_id)values("Singed",true,true,true,true,2);
insert into tb_funcionarios(nome,dependentes,ativo,vp,vl,cargo_id)values("Udyr",true,true,true,true,5);
insert into tb_funcionarios(nome,dependentes,ativo,vp,vl,cargo_id)values("Aphelios",true,true,false,false,4);
insert into tb_funcionarios(nome,dependentes,ativo,vp,vl,cargo_id)values("Alípio",true,true,true,true,1);
insert into tb_funcionarios(nome,dependentes,ativo,vp,vl,cargo_id)values("Elias Maluco",true,true,true,true,2);
insert into tb_funcionarios(nome,dependentes,ativo,vp,vl,cargo_id)values("Claugrace Morethz",true,true,true,true,5);

select * from tb_cargo where salario>2000;
select * from tb_cargo where salario<2000;

select * from tb_funcionarios  where nome  like "%c%";
-- A PARTIR DAQUI CORRINGINDO MEU BANCO DE DADOS 
select * from tb_cargo;
alter table tb_cargo modify column salario varchar(255);
alter table tb_cargo change salario nivel varchar(256);
select * from tb_cargo;
update tb_cargo set nivel = "Senior" where id = 1;
select * from tb_cargo;
update tb_cargo set nivel = "Pleno" where id= 2;
update tb_cargo set nivel = "Junior" where id= 3;
update tb_cargo set nivel = "senior" where id= 5;
update tb_cargo set nivel = "pleno" where id= 4;

alter table tb_funcionarios change vp salario decimal(10,2);
update tb_funcionarios set salario = 9000.00 where id= 1;
update tb_funcionarios set salario = 1600.00 where id= 2;   
update tb_funcionarios set salario = 3000.00 where id= 3;
update tb_funcionarios set salario = 6000.00 where id= 4; 
update tb_funcionarios set salario = 90000.00 where id= 5;
update tb_funcionarios set salario = 1500.00 where id= 6;
update tb_funcionarios set salario = 19000.00 where id= 1;
update tb_funcionarios set salario = 20000.00 where id= 7;
update tb_funcionarios set salario = 3000.00 where id= 8;
update tb_funcionarios set salario = 100000.00 where id= 9;

select * from tb_funcionarios where salario >2000;
select * from tb_funcionarios where salario <2000;
select * from tb_funcionarios where salario >=1000 and salario<=2000;
select * from tb_funcionarios where nome like "c%"