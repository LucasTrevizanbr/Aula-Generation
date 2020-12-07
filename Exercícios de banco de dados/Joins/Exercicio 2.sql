create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;
create table tb_categoria(
id bigint(5)auto_increment,
categoria varchar(255),
descricao varchar(255),
primary key(id)

);

create table tb_produtos(
id bigint(5),
nome varchar(255)not null,
preco decimal(10,2)not null,
marca varchar(255),
garantia int,
descricao varchar(255),
categoria_id bigint not null,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_categoria(categoria,descricao) values ("Materias de construção","diversos"); -- 1
insert into tb_categoria(categoria,descricao) values ("Ferramentas","diversas"); -- 2
insert into tb_categoria(categoria,descricao) values ("Blocos e tijoloes ","diversos"); -- 3
insert into tb_categoria(categoria,descricao) values ("Telhas","diversas"); -- 4
insert into tb_categoria(categoria,descricao) values ("Calhas e rufos","diversos"); -- 5

-- Acabei apagando algumas alter table que fiz para corrigir a segunda tabela
-- especifimante o auto_increment no id e o tipo de dado da garantia(de int para varchar)

insert into tb_produtos(nome,preco,marca,garantia,descricao,categoria_id) values ("Raspador de rejunte",28.00,"CORTAG","6 meses", "vermelho",2);
insert into tb_produtos(nome,preco,marca,garantia,descricao,categoria_id) values ("Espátula",15.00,"Atlas","6 meses", "Aço carbono",2);
insert into tb_produtos(nome,preco,marca,garantia,descricao,categoria_id) values ("Adesivo selador de trincas",13.00,"Tekbound","2 meses", "425g branco",2);
insert into tb_produtos(nome,preco,marca,garantia,descricao,categoria_id) values ("Bloco de cimento",2.00,"Telhanorte","--", "cinza",3);
insert into tb_produtos(nome,preco,marca,garantia,descricao,categoria_id) values ("Cimento",30.00,"Votoran","6 meses", "Cimento para uso geral, 50kg",1);
insert into tb_produtos(nome,preco,marca,garantia,descricao,categoria_id) values ("Telha ondulada",40,"Confibra","6 meses", "cinza",4);
insert into tb_produtos(nome,preco,marca,garantia,descricao,categoria_id) values ("Calha moldura",66.00,"Calhaforte","12 meses", "marrom",5);

select * from tb_produtos where preco>50;
select * from tb_produtos where preco>=3 and preco<=60;
select * from tb_produtos where nome like "%ci%";

select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;
select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id
where categoria = "ferramentas"


