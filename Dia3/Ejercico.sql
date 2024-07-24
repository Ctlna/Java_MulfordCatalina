-- ##############################
-- #######  DIA 3 - JAVA   ######
-- ##############################

create database SIH;
use SIH;

/*
1 persona -> muchos hospitales
1 hospital -> muchos emplea/atiende muchas personas

persona: 
- nombre entero
- dirección
- titulo

pacientes:
- edad (calcula de su fecha nacimiento )
- fecha ingreso hospital o fecha actual
- asignados específicamente en un pabellón de acuerdo a su diagnóstico
	(si hay disponibilidad en la capacidad de dicho pabellón)

hospital:
- tiene departamentos (está vinculado el personal del hospital,)
- las principales actividades es realizado por personal administrativo, técnico 
	y de operaciones, quienes atienden a los pacientes.
-  los doctores se encuentran organizados en equipos que tiene un líder que debe ser 
	doctores asociados y doctores junior que participan en diagnósticos, aunque no 
    están al cargo de pacientes.

 personal:
 - fecha vinculacion
 - salario

*/