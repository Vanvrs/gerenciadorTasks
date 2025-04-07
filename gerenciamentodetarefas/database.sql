/* 1 - Criação do Schema e utilização do mesmo*/
create database if not exists tasks;
use tasks;

/* 2 - Criação das tables */

/*Tabela de usuarios*/
create table users(
	id int(11) primary key auto_increment,
	name varchar(255) not null,
	email varchar(255) not null unique
);

/*Tabela de tarefas*/
create table tasks(
	id int(11) primary key auto_increment,
	title varchar(225) not null,
	end_date date,
	init_date date,
	user_id int(11)
);

/* 3 - Criação das chaves estrangeiras*/
alter table tasks
	add foreign key (user_id) references users (id);
	
