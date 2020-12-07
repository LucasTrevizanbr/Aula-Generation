create database db_ecommerce;
use db_ecommerce;
create table tb_categoria(
id bigint(5)auto_increment,
corrida  varchar(255),
 futebol varchar(255),
 academia varchar(255),
 primary key(id)
);

create table tb_produtos(
id bigint(5)auto_increment,
nome varchar(255),
preco decimal(10,5),
disponivel boolean,
cor varchar(255),
caracteristica varchar(255),
categoria_id bigint  not null,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);
insert into tb_categoria(corrida) values ("Produtos da categoria de corrida");
insert into tb_categoria(futebol) values ("Produtos da categoria de futebol");
insert into tb_categoria(academia) values ("Produtos da categoria de academia");

insert into tb_produtos(nome,preco,disponivel,cor,caracteristica,categoria_id)values("Anilhas",150.00,true,"preto","15kg",4);
insert into tb_produtos(nome,preco,disponivel,cor,caracteristica,categoria_id)values("Chuteiras",600.00,true,"Rosa","Adidas",2);
insert into tb_produtos(nome,preco,disponivel,cor,caracteristica,categoria_id)values("Viseira",2000.00,true,"Preto","Gucci",1);
insert into tb_produtos(nome,preco,disponivel,cor,caracteristica,categoria_id)values("Whey protein",90.00,true,"--","Sabor chocolate",4);
insert into tb_produtos(nome,preco,disponivel,cor,caracteristica,categoria_id)values("Bola",150.00,true,"preto/branco","Puma",2);
insert into tb_produtos(nome,preco,disponivel,cor,caracteristica,categoria_id)values("Protetor solar",60.00,true,"branco","Sunday",1);
insert into tb_produtos(nome,preco,disponivel,cor,caracteristica,categoria_id)values("Luvas de goleiro",320.00,true,"Roxo","Um par",2);
insert into tb_produtos(nome,preco,disponivel,cor,caracteristica,categoria_id)values("Bola de pilates",170.00,true,"Rosa","Plastico",4);
insert into tb_produtos(nome,preco,disponivel,cor,caracteristica,categoria_id)values("Colete",200.00,false,"verde/azul","duzia",2);

select * from tb_produtos where preco>2000;
select * from tb_produtos where  preco<200;
select * from tb_produtos where preco>=1000 and preco<=2000;
select * from tb_produtos where nome like "c%";