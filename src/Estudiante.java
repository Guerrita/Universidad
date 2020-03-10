import java.util.ArrayList;

public class Estudiante {
    private String nombres,
            apellidos,
            id;
    private char genero;
    private int programaAcademico;
    private ArrayList<Nota> notas = new ArrayList<>();

    public Estudiante(String nombres, String apellidos, String id, char genero, int programaAcademico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.genero = genero;
        this.programaAcademico = programaAcademico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(int programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
}
