-- ##############################
-- #######  DIA 3 - JAVA   ######
-- ##############################

create database SIH;
use SIH;

create table persona (
	id int primary key not null,
    nombre varchar(150) not null,
    direccion varchar (26)not null,
    titulo text
);

create table paciente(
	id int primary key not null,
    id_persona int,
    foreign key (id_persona) references persona(id)
);