create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;
create table tb_categoria(
id bigint(5)auto_increment,
categoria varchar(255),
descricao varchar(255),
primary key(id)

);

create table tb_produtos(
id bigint(5)auto_increment,
nome varchar(255)not null,
preco decimal(10,2)not null,
ativo boolean not null,
qtdaulas varchar(255)not null,
categoria_id bigint not null,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)

);

insert into tb_categoria(categoria,descricao) values ("Banco de dados","cursos com ferramentas de banco de dados"); -- 1
insert into tb_categoria(categoria,descricao) values ("Programação","cursos com linguagens de programação"); -- 2
insert into tb_categoria(categoria,descricao) values ("Frontend","cursos com lingugagens de frontend"); -- 3
insert into tb_categoria(categoria,descricao) values ("Sistemas operacionais","cursos com sistemas operacionais"); -- 4

insert into tb_produtos(nome,preco,ativo,qtdaulas,categoria_id) values ("Java",100.00,true,"18",2);
insert into tb_produtos(nome,preco,ativo,qtdaulas,categoria_id) values ("Python",800.00,true,"22",2);
insert into tb_produtos(nome,preco,ativo,qtdaulas,categoria_id) values ("MySQL",350.00,true,"16",1);
insert into tb_produtos(nome,preco,ativo,qtdaulas,categoria_id) values ("Angular",200.00,true,"15",3);
insert into tb_produtos(nome,preco,ativo,qtdaulas,categoria_id) values ("Linux",160.00,true,"10",4);
insert into tb_produtos(nome,preco,ativo,qtdaulas,categoria_id) values ("C#",700.00,true,"24",2);
insert into tb_produtos(nome,preco,ativo,qtdaulas,categoria_id) values ("Windows",100.00,true,"9",4);

select * from tb_produtos where preco >50;
select * from tb_produtos where preco >=3 and preco <=60;
select * from tb_produtos where nome like "%JAV%";

select * from tb_produtos inner join  tb_categoria on tb_categoria.id = tb_produtos.categoria_id;
select * from tb_produtos 
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id
where categoria = "Programação"
