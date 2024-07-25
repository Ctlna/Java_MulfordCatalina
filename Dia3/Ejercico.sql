
-- ##############################
-- #######  DIA 3 - JAVA   ######
-- ##############################

create database SIH;
use SIH;

create table persona (
	id int primary key not null,
    nombre varchar(150) not null,
    direccion varchar (26)not null,
    titulo text not null
);
 
create table paciente(
	id int primary key not null,
    id_persona int not null,
    fecha_nacimiento date,
    fecha_ingreso date not null,
    foreign key (id_persona) references persona(id)
);

create table empleado(
	id int primary key not null,
    id_persona int not null,
    fecha_vinculacion date not null,
    salario float not null,
    foreign key (id_persona) references persona(id)
);

create table hospital (
	id int primary key not null,
    nombre varchar(80) not null
);

create table departamento (
	id int primary key not null,
    nombre varchar(80) not null,
    id_hospital int not null,
    foreign key (id_hospital) references hospital (id)
);

create table pabellon (
	id int primary key not null,
    nombre varchar(80) not null,
    id_hospital int not null,
    disponibilidad float not null,
    foreign key (id_hospital) references hospital (id)
);

create table equipos (
	id int not null auto_increment,
    id_doctor_lider int not null,
    id_doctor int not null,
    primary key (id,id_doctor_lider,id_doctor)
    foreign key (id_hospital) references hospital (id)
);

create table paciente_pabellon (
    id_paciente int not null,
    id_pabellon int not null,
    diagnostico text not null,
    primary key (id_paciente, id_pabellon),
    foreign key (id_paciente) references paciente (id),
    foreign key (id_pabellon) references pabellon (id)
);

create table empleado_departamento (
    id_personal int not null,
    id_departamento int not null,
    primary key(id_personal, id_departamento),
    foreign key (id_personal) references empleado (id),
    foreign key (id_departamento) references departamento (id)
);
