
package ESTUDIANTECRUD;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuInicio {
    public static void main(String[] args) throws SQLException {
        desplieguedeMenu();
    }
    
    public static void desplieguedeMenu() throws SQLException{
        Scanner lectorSeleccion = new Scanner (System.in);
        String menudeOpciones;
        
        System.out.println("*********************************************");
        System.out.println("|           CRUD DE JAVA EN CONSOLA         |");
        System.out.println("*********************************************");
        System.out.println("| Opciones:                                 |");
        System.out.println("|           1. Crear registro               |");
        System.out.println("|           2. Consultar registros          |");
        System.out.println("|           3. Actualizar registros         |");
        System.out.println("|           4. Eliminar registros           |");
        System.out.println("|           5. Salir                        |");
        System.out.println("*********************************************");
        System.out.println("Seleccione la opcion que desea realizar: ");
        menudeOpciones = lectorSeleccion.next();
        
        
        switch (menudeOpciones){
            case "1":
                CrearRegistro crear = new CrearRegistro();
                break;
            case "2":
                ConsultarRegistros consul= new ConsultarRegistros();
                break;
            case "3":
                ActualizarRegistros update = new ActualizarRegistros();
                break;
            case "4":
                EliminarRegistros delete = new EliminarRegistros();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Error! Seleccion no encontrada!");
                break;
        }
    }
}
