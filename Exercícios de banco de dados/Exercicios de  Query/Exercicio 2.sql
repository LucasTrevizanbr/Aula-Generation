use db_ecommerce;
create table tb_produtos(
id bigint(5) auto_increment,
nome varchar(255)not null,
preco decimal(10,2),
disponibilidade boolean,
cor varchar(255),
tamanho varchar(255),
primary  key (id)

);

insert into tb_produtos(nome,preco,disponibilidade,cor,tamanho) values("Camisa",298.00,true,"Verde","G");
insert into tb_produtos(nome,preco,disponibilidade,cor,tamanho) values("Skate",600.00,true,"preto","0,5M");
insert into tb_produtos(nome,preco,disponibilidade,cor,tamanho) values("Rolex",15.00,true,"roxo","20cm");
insert into tb_produtos(nome,preco,disponibilidade,cor,tamanho) values("Uno 2000",4000.00,true,"amarelo","3x4");
insert into tb_produtos(nome,preco,disponibilidade,cor,tamanho) values("Binóculo",237.00,true,"azul","40cm");
insert into tb_produtos(nome,preco,disponibilidade,cor,tamanho) values("Ayr Frier",300.00,true,"gelo","30cm");

select * from tb_produtos where preco>500;
select * from tb_produtos where preco<500;
update tb_produtos set disponibilidade = false where id IN(3,4,5,6,7,8,9,10,11,12,13,14);
delete from tb_produtos where id IN(3,4,5,6,7,8,9,10,11,12,13,14)
