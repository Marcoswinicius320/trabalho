create database av3;


create table usuarios (

id_usuario int auto_increment primary key, 

nome_usuario varchar(45),

senha_usuario varchar(45),

perfil enum ("Admin","Funcionário","Cliente"));



insert into usuarios (nome_usuario, senha_usuario, perfil)
 
 values ("Admin","12345","Admin");

select * from usuarios;




