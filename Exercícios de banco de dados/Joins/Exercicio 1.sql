create database db_cidade_das_carnes;
use db_cidade_das_carnes;
create table tb_categoria(
id bigint(5)auto_increment,
categoria varchar(255),
descricao  varchar(255),
primary key(id)

);

create table tb_produtos(
id bigint(5) auto_increment,
nome varchar(255)not null,
preco decimal (10,2)not null,
ativo boolean not null,
descricao varchar(255),
categoria_id bigint not null,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)

);

insert into tb_categoria(categoria,descricao) values ("Bovino","carnes bovinas"); -- 1
insert into tb_categoria(categoria,descricao) values ("Aves","carne de aves"); -- 2
insert into tb_categoria(categoria,descricao) values ("Suino","carnes suinas"); -- 3
insert into tb_categoria(categoria,descricao) values ("Temperos ","temperos variados"); -- 4

insert into tb_produtos(nome,preco,ativo,descricao,categoria_id) values ("Picanha","90.00",true,"Tipo de corte",1);
insert into tb_produtos(nome,preco,ativo,descricao,categoria_id) values ("Sal","4.00",true,"Lebre",4);
insert into tb_produtos(nome,preco,ativo,descricao,categoria_id) values ("Bisteca","90.00",true,"Tipo de corte",3);
insert into tb_produtos(nome,preco,ativo,descricao,categoria_id) values ("Peito de frango","20.00",true,"Tipo de corte",2);
insert into tb_produtos(nome,preco,ativo,descricao,categoria_id) values ("Carne moida","22.00",true,"carne processada",1);
insert into tb_produtos(nome,preco,ativo,descricao,categoria_id) values ("Linguiceta","18.00",true,"carne processada",3);
insert into tb_produtos(nome,preco,ativo,descricao,categoria_id) values ("Coxa e sobrecoxa","22.00",true,"Tipo de corte ",2);

select * from tb_produtos where preco >50;
select * from tb_produtos where preco >=3 and preco <=60;
select * from tb_produtos where nome like "%co%";

select tb_produtos.nome, tb_produtos.preco, tb_produtos.descricao,tb_categoria.categoria
from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id
where tb_categoria.categoria = "aves"


