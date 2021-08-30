import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private ArrayList<Curso>cursos = new ArrayList<>();
    private ArrayList<Estudiante>estudiantes= new ArrayList<>();
    public static void main(String[] args) {
        String menu = ("1. Registrar estudiante.\n" +
                "2. Registrar curso.\n" +
                "3. Registrar.\n" +
                "4. Generar reporte.\n" +
                "5. Salir.");
        String menuReporte = ("1. Cantidad de estudiantes por programa académico.\n" +
                "2. porcentaje de estudiantes por género en cada programa.\n" +
                "3. porcentaje de estudiantes por género en general.\n" +
                "4. estudiante con el mayor promedio crédito.\n" +
                "5. estudiante con el menor promedio.");
        String opcion ="";
        String opcionReporte ="";
        do {
            opcion = JOptionPane.showInputDialog(menu);
            switch (opcion){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    opcionReporte = JOptionPane.showInputDialog(menuReporte);
                    reportes(opcionReporte);
                    break;
                case "5":
                    break;
            }

        }while (!opcion.equals("5"));
    }
    public static void reportes(String s){
        switch (s){
            case "1"://cantidad de estudiantes por programa académico
                break;
            case "2"://porcentaje de estudiantes por género en cada programa
                break;
            case "3": //porcentaje de estudiantes por género en general
                break;
            case "4"://estudiante con el mayor promedio crédito
                break;
            case "5"://estudiante con el menor promedio.
                break;
        }
    }
}
