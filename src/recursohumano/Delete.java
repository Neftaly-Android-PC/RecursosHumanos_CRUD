
package recursohumano;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
    
    Delete() throws SQLException{
        Scanner leer = new Scanner (System.in);
        ConexionCRUD utilerias = new ConexionCRUD();
        System.out.println("<< ELIMINAR REGISTRO >>");
        
        System.out.println("Ingresar el id del registro: ");
        String idContactoEliminar = leer.next();
        //Reingreso de datos para actualizar
        String tabla = "tb_contacto";
        String campo = "*";
        String condicion = "id_contacto = " + idContactoEliminar;
        utilerias.desplegarRegistros(tabla, campo, condicion);
        
        System.out.println("Presionar << Y >> para confirmar: ");
        String confirmarBorrar = leer.next();
        
        if("Y".equals(confirmarBorrar)) {
            /*Sel el deja vacio para el metodo actualiazarEliminarRegistro
              envie solamente los parametros de tabla y condicion y poder eliminar
            */
            String valoresCamposNuevos = "";
            
            utilerias.actualizarEliminarRegistro(tabla, valoresCamposNuevos, condicion);
            System.out.println("Registro borrado satisfactoriamente!");
        }
        MenuPrincipal.desplegarMenu();
    }
}
