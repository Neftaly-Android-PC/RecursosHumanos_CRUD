
package ESTUDIANTECRUD;

import java.sql.SQLException;
import java.util.Scanner;


public class ActualizarRegistros {
    
    ActualizarRegistros() throws SQLException{
    Scanner leer = new Scanner (System.in);
    Estudiante estu = new Estudiante();
    ConexionCRUD_data_base_Estudiante utilerias = new ConexionCRUD_data_base_Estudiante();
    
    System.out.println("-------ACTUALIZAR REGISTROS-------");
    
    System.out.println("Ingresar el id del registro a modificar: ");
    estu.setIdEstudiante(leer.nextInt());
    
    String tablaBuscar = "tb_estudiante";
    String camposBuscar = "id_estudiante,carnet_estudiante , nom_estudiante, ape_estudiante, edad_estudiante";
    String condicionBuscar = "id_estudiante = " + estu.getIdEstudiante();
    utilerias.desplegarRegistros(tablaBuscar, camposBuscar, condicionBuscar);
    
        System.out.println("Ingrese el carnet del estudiante: ");
        estu.setCarnetEstudiante(leer.nextLine());
        
        System.out.println("Ingrese el nombre del estudiante: ");
        estu.setNomEstudiante(leer.nextLine());
        
        System.out.println("Ingrese el apellido del estudiante: ");
        estu.setApeEstudiante(leer.nextLine());
        
        System.out.println("Ingrese la edad del estudiante: ");
        estu.setEdadEstudiante(Integer.parseInt(leer.nextLine()));
        
        String tabla = "tb_estudiante";
        String camposValoresNuevos = "carnet_estudiante = '" + estu.getCarnetEstudiante() + "nom_estudiante = '" +
                estu.getNomEstudiante() + "', ape_estudiante = '" + estu.getApeEstudiante() + "', edad_estudiante = '" + estu.getEdadEstudiante() + "'";
        
        utilerias.actualizarEliminarRegistro(tabla, camposValoresNuevos, condicionBuscar);
        System.out.println("El registro se a Actualizado Correctamente!");
        
        MenuInicio.desplieguedeMenu();
    }
}
