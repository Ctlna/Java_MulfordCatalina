package Ejemplo2;

public class Estudiante extends Usuario{
    private String codigoEstudiante;

    public Estudiante(String nombre, String documento, String codigoEstudiante){
        super(nombre,documento);
        this.codigoEstudiante = codigoEstudiante;
    }
    public String getCodigoEstudiante(){
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
}
