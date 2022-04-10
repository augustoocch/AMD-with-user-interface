package datosClientes;

import Conexion.ConexionBase;
import Persona.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatosClientes {

    private Connection conexionBase;
    
    private static final String SQL_SELECT = "SELECT Orden, id, nombreCliente, telefono, direccion FROM test.Clientes";
    private static final String SQL_INSERT = "INSERT INTO test.Clientes (id, nombreCliente, telefono, direccion) VALUES (?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE test.Clientes SET id = ?, nombreCliente = ? , telefono = ?, direccion = ? WHERE Orden = ?";
    private static final String SQL_DELETE = "DELETE FROM test.Clientes WHERE Orden = ?";

    public DatosClientes () {
        
    }
    
    public DatosClientes (Connection conexion) {
        this.conexionBase = conexionBase;
    }

 
    public int agregarCliente(Cliente cliente) throws SQLException {

        Connection conexion = null;
        PreparedStatement state = null;
        int cant = 0;
        
            try {
                conexion = this.conexionBase != null ? this.conexionBase : ConexionBase.conexion();
                state = conexion.prepareStatement(SQL_INSERT);
                state.setInt(1,cliente.getId());
                state.setString(2, cliente.getNombreCliente());
                state.setString(3, cliente.getTelefono());
                state.setString(4, cliente.getDireccion());

                cant = state.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se agrego el Cliente con exito");
            } catch (SQLException ex) {
                ex.printStackTrace();
        } finally {
            state.close();
            conexion.close();
        }
        return cant;

    }


    public int modificarCliente(Cliente cliente) throws SQLException {

        Connection conexion = null;
        PreparedStatement state = null;
        int cant = 0;
        
            try {
                conexion = this.conexionBase != null ? this.conexionBase : ConexionBase.conexion();
                state = conexion.prepareStatement(SQL_UPDATE);
                state.setInt(1, cliente.getId());
                state.setString(2, cliente.getNombreCliente());
                state.setString(3, cliente.getTelefono());
                state.setString(4, cliente.getDireccion());
                state.setInt(5, cliente.getOrden());
               
                cant = state.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se modifico el Cliente con exito");
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                state.close();
                conexion.close();
            }
            return cant;
    }

 
    public int eliminarCliente(Cliente cliente) throws SQLException {

        
        Connection conexion = null;
        PreparedStatement state = null;
        int cant = 0;
        
            try {
                conexion = this.conexionBase != null ? this.conexionBase : ConexionBase.conexion();
                state = conexion.prepareStatement(SQL_DELETE);
                state.setInt(1, cliente.getOrden());
                
                cant = state.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } finally {
                state.close();
                conexion.close();
            }
            return cant;
        }
}       


