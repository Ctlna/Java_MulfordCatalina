package Ejemplo2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(
            nombre: "Pepa Pig",
            documento: "019019",
            codigoEstudiante: "1000"
        );
        System.out.println(estudiante1.getNombre());
    }
}