package datosMedicos;

import Conexion.ConexionBase;
import Persona.Medico;
import Persona.Paramedico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatosMedic {

    
    private Connection conexionBase;
    
    //Base de datos de medicos
    
    private static final String SQL_SELECT_M = "SELECT Orden, idMedico, nombreMedico, emailMedico FROM test.Medicos";
    private static final String SQL_INSERT_M = "INSERT INTO test.Medicos (idMedico, nombreMedico, emailMedico) VALUES (?, ?, ?)";
    private static final String SQL_UPDATE_M = "UPDATE test.Medicos SET idMedico = ?, nombreMedico = ?, emailMedico = ? WHERE Orden = ?";
    private static final String SQL_DELETE_M = "DELETE FROM test.Medicos WHERE Orden = ?";
    
    //Base de datos de Paramedicos
    
    private static final String SQL_SELECT_P = "SELECT idParamedicos, licenciaParamedico, nombreParamedico, emailParamedico  FROM test.Paramedicos";
    private static final String SQL_INSERT_P = "INSERT INTO test.Paramedicos (licenciaParamedico, nombreParamedico, emailParamedico) VALUES (?, ?, ?)";
    private static final String SQL_UPDATE_P = "UPDATE test.Paramedicos SET licenciaParamedico = ?, nombreParamedico = ?, emailParamedico = ? WHERE idParamedicos = ?";
    private static final String SQL_DELETE_P = "DELETE FROM test.Paramedicos WHERE idParamedicos = ?";

    public DatosMedic (){
        
    } 
    
    public DatosMedic (Connection conexion) {
        this.conexionBase = conexionBase;
    }

    
    
    public int agregarMedico(Medico medico) throws SQLException {

        Connection conexion = null;
        PreparedStatement state = null;
        int cant = 0;
        
            try {
                conexion = this.conexionBase != null ? this.conexionBase : ConexionBase.conexion();
                state = conexion.prepareStatement(SQL_INSERT_M);
                state.setInt(1,medico.getId());
                state.setString(2, medico.getNombre());
                state.setString(3, medico.getEmail());

                cant = state.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se agrego el medico con exito");
            } catch (SQLException ex) {
                ex.printStackTrace();
        } finally {
            state.close();
            conexion.close();
        }
        return cant;

    }


    public int modificarMedico(Medico medico) throws SQLException {

        Connection conexion = null;
        PreparedStatement state = null;
        int cant = 0;
        
            try {
                conexion = this.conexionBase != null ? this.conexionBase : ConexionBase.conexion();
                state = conexion.prepareStatement(SQL_UPDATE_M);
                state.setInt(1, medico.getId());
                state.setString(2, medico.getNombre());
                state.setString(3, medico.getEmail());
                state.setInt(4, medico.getOrden());

               
                cant = state.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se modifico el Medico con exito");
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                state.close();
                conexion.close();
            }
            return cant;
    }

 
    public int eliminarMedico(Medico medico) throws SQLException {

        
        Connection conexion = null;
        PreparedStatement state = null;
        int cant = 0;
        
            try {
                conexion = this.conexionBase != null ? this.conexionBase : ConexionBase.conexion();
                state = conexion.prepareStatement(SQL_DELETE_M);
                state.setInt(1, medico.getOrden());
                
                cant = state.executeUpdate();
                JOptionPane.showMessageDialog(null, "Medico eliminado");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } finally {
                state.close();
                conexion.close();
            }
            return cant;
        }


    public int agregarParamedico(Paramedico paramedico) throws SQLException {

        Connection conexion = null;
        PreparedStatement state = null;
        int cant = 0;
        
            try {
                conexion = this.conexionBase != null ? this.conexionBase : ConexionBase.conexion();
                state = conexion.prepareStatement(SQL_INSERT_P);
                state.setInt(1,paramedico.getLicencia());
                state.setString(2, paramedico.getNombreParamed());
                state.setString(3, paramedico.getEmail());

                cant = state.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se agrego el Paramedico con exito");
            } catch (SQLException ex) {
                ex.printStackTrace();
        } finally {
            state.close();
            conexion.close();
        }
        return cant;

    }


    public int modificarParamedico(Paramedico paramedico) throws SQLException {

        Connection conexion = null;
        PreparedStatement state = null;
        int cant = 0;
        
            try {
                conexion = this.conexionBase != null ? this.conexionBase : ConexionBase.conexion();
                state = conexion.prepareStatement(SQL_UPDATE_P);
                state.setInt(1, paramedico.getLicencia());
                state.setString(2, paramedico.getNombreParamed());
                state.setString(3, paramedico.getEmail());
                state.setInt(4, paramedico.getIdParamedicos());
               
                cant = state.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se modifico el Paramedico con exito");
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                state.close();
                conexion.close();
            }
            return cant;
    }

 
    public int eliminarParamedico (Paramedico paramedico) throws SQLException {

        
        Connection conexion = null;
        PreparedStatement state = null;
        int cant = 0;
        
            try {
                conexion = this.conexionBase != null ? this.conexionBase : ConexionBase.conexion();
                state = conexion.prepareStatement(SQL_DELETE_P);
                state.setInt(1, paramedico.getIdParamedicos());
                
                cant = state.executeUpdate();
                JOptionPane.showMessageDialog(null, "Paramedico eliminado");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } finally {
                state.close();
                conexion.close();
            }
            return cant;
        }
}       





