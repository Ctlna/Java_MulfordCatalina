/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacion;

/**
 *
 * @author camper
 */
public class Main {
    public static void main(String[] args) {
        Department dept = new Department("Engineering");
        Employee emp1 = new Employee ("Mozo");
        Employee emp2 = new Employee ("Daza");
        
        dept.addEmployee(emp1);
        dept.addEmployee(emp2);
        
        for (int i=0; i<dept.getEmployees().size();i++){
            System.out.println("Employee #"+(i+1)+":"+dept.getEmployees().get(i).getName());
        }
    }
}
