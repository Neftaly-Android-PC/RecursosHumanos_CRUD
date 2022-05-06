
package ESTUDIANTECRUD;

import java.sql.SQLException;
import java.util.Scanner;

public class CrearRegistro {
    
    CrearRegistro() throws SQLException {
    Estudiante estu = new Estudiante();
    Scanner leer = new Scanner (System.in);
    
        System.out.println("-------CREAR NUEVO REGISTRO-------");
        
        System.out.println("Ingrese el carnet del estudiante: ");
        estu.setCarnetEstudiante(leer.nextLine());
        
        System.out.println("Ingrese el nombre del estudiante: ");
        estu.setNomEstudiante(leer.nextLine());
        
        System.out.println("Ingrese el apellido del estudiante: ");
        estu.setApeEstudiante(leer.nextLine());
        
        System.out.println("Ingrese la edad del estudiante: ");
        estu.setEdadEstudiante(Integer.parseInt(leer.nextLine()));
        
        String tabla = "tb_estudiante";
        String camposTabla = "carnet_estudiante, nom_estudiante, ape_estudiante, edad_estudiante";
        String valoresCampos = "'" + estu.getCarnetEstudiante() + "','" + estu.getNomEstudiante() + "','" + estu.getApeEstudiante() + "','" + estu.getEdadEstudiante() + "'";
        ConexionCRUD_data_base_Estudiante utilerias = new ConexionCRUD_data_base_Estudiante();
        utilerias.guardaRegistros(tabla, camposTabla, valoresCampos);
        
        MenuInicio.desplieguedeMenu();
    
    }
    
}
