
package ESTUDIANTECRUD;

import java.sql.SQLException;

public class ConsultarRegistros {
    
    public ConsultarRegistros() throws SQLException{
    System.out.println("-------CONSULTA DE REGISTROS-------");
        mostrarResultados();
    }
    
    private void mostrarResultados() throws SQLException {
        try{
            ConexionCRUD_data_base_Estudiante utilerias = new ConexionCRUD_data_base_Estudiante();
            String tabla = "tb_estudiante";
            String camposTabla = "*";
            String condicionBusqueda="";
            utilerias.desplegarRegistros(tabla, camposTabla, condicionBusqueda);
        } catch (SQLException ex){
            System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage());
        } finally {
            MenuInicio.desplieguedeMenu();
        }
    }

}
