create table usuario(
	idusuario		uuid			primary key,
	nome			varchar(100)	not null,
	email			varchar(50)		not null unique,
	senha			varchar(40)		not null
);