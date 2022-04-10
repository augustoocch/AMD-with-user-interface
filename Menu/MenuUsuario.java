package Menu;

import Persona.Cliente;
import Persona.Medico;
import Persona.Paramedico;
import datosClientes.DatosClientes;
import datosMedicos.DatosMedic;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MenuUsuario {
    public static void main(String[] args) throws SQLException {

        int opciones = 0;

        do {
            String ingreso = JOptionPane.showInputDialog(null, "Indique lo que quiere realizar: \n"
                    + "1: Clientes \n" + "2: Medicos \n" + "3: Paramedicos");

            switch (ingreso) {

                //PART CLIENTS---------------------------------------------------
                
                case "1":
                    ingreso = JOptionPane.showInputDialog(null, "1: Agregar Cliente \n"
                            + "2: Modificar Cliente \n" + "3: Eliminar Cliente \n" + "0: Salir \n");

                    if (ingreso.equals("1")) { //Toma datos para agregar  cliente
                        int document = Integer.parseInt(JOptionPane.showInputDialog(null, "Documento"));
                        String nombreApellido = JOptionPane.showInputDialog(null, "Nombre y Apellido");
                        String telefono = JOptionPane.showInputDialog(null, "Telefono");
                        String direccion = JOptionPane.showInputDialog(null, "Direccion");

                        Cliente cliente = new Cliente(document, nombreApellido, telefono, direccion);
                        DatosClientes nuevoRegistro = new DatosClientes();
                        nuevoRegistro.agregarCliente(cliente);

                    } else if (ingreso.equals("2")) { //toma datos para modificar cliente
                        
                        int document = Integer.parseInt(JOptionPane.showInputDialog(null, "Documento"));
                        String nombreApellido = JOptionPane.showInputDialog(null, "Nombre y Apellido");
                        String telefono = JOptionPane.showInputDialog(null, "Telefono");
                        String direccion = JOptionPane.showInputDialog(null, "Direccion");
                        int orden = Integer.parseInt(JOptionPane.showInputDialog(null, "Poner numero de registro a modificar"));

                        Cliente modificar = new Cliente();
                        modificar.setId(document);
                        modificar.setNombreCliente(nombreApellido);
                        modificar.setTelefono(telefono);
                        modificar.setDireccion(direccion);
                        modificar.setOrden(orden);
                        DatosClientes modificarRegistro = new DatosClientes();
                        modificarRegistro.modificarCliente(modificar);

                    } else if (ingreso.equals("3")) { //toma datos para eliminar cliente
                        int orden = Integer.parseInt(JOptionPane.showInputDialog(null, "Poner numero de registro a eliminar"));
                        Cliente cliente = new Cliente();
                        cliente.setOrden(orden);
                        DatosClientes eliminarCliente = new DatosClientes();
                        eliminarCliente.eliminarCliente(cliente);
                        
                    } else if (ingreso.equals("0")) {
                        System.exit(opciones);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion erronea");
                    }
                    break;

                //PART MEDICS---------------------------------------------------
                    
                case "2":
                    ingreso = JOptionPane.showInputDialog(null, "1: Agregar Medico \n"
                            + "2: Modificar Medico \n" + "3: Eliminar Medico \n" + "0: Salir \n");

                    if (ingreso.equals("1")) { //toma datos para agregar medico
                        int document = Integer.parseInt(JOptionPane.showInputDialog(null, "Documento"));
                        String nombreApellido = JOptionPane.showInputDialog(null, "Nombre y Apellido");
                        String email = JOptionPane.showInputDialog(null, "Email");

                        Medico medico = new Medico(document, nombreApellido, email);
                        DatosMedic nuevoRegistro = new DatosMedic();
                        nuevoRegistro.agregarMedico(medico);

                    } else if (ingreso.equals("2")) { //toma datos para modificar medico

                        int document = Integer.parseInt(JOptionPane.showInputDialog(null, "Documento"));
                        String nombreApellido = JOptionPane.showInputDialog(null, "Nombre y Apellido");
                        String email = JOptionPane.showInputDialog(null, "Email");
                        int orden = Integer.parseInt(JOptionPane.showInputDialog(null, "Poner numero de registro a modificar"));

                        Medico modificar = new Medico();
                        modificar.setId(document);
                        modificar.setNombre(nombreApellido);
                        modificar.setEmail(email);
                        modificar.setOrden(orden);
                        DatosMedic modificarRegistro = new DatosMedic();
                        modificarRegistro.modificarMedico(modificar);

                    } else if (ingreso.equals("3")) { //toma datos para eliminar medico
                        int orden = Integer.parseInt(JOptionPane.showInputDialog(null, "Poner numero de registro a eliminar"));
                        Medico medico = new Medico();
                        medico.setOrden(orden);
                        DatosMedic eliminarMedico = new DatosMedic();
                        eliminarMedico.eliminarMedico(medico);
                        
                    } else if (ingreso.equals("0")) {
                             System.exit(opciones);
                             
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion erronea");
                    }
                    break;
                    
                    //PART PARAMEDICS---------------------------------------------------
                    
                case "3":
                    ingreso = JOptionPane.showInputDialog(null, "1: Agregar Paramedico \n"
                            + "2: Modificar Paramedico \n" + "3: Eliminar Paramedico \n" + "0: Salir \n");

                    if (ingreso.equals("1")) { //toma datos para agregar paramedico
                        int licencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de Licencia"));
                        String nombreApellido = JOptionPane.showInputDialog(null, "Nombre y Apellido");
                        String email = JOptionPane.showInputDialog(null, "Email");
                        

                        Paramedico paramedico = new Paramedico(licencia, nombreApellido, email);
                        DatosMedic nuevoRegistro = new DatosMedic();
                        nuevoRegistro.agregarParamedico(paramedico);

                    } else if (ingreso.equals("2")) { //toma datos para modificar paramedico

                        int licencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de Licencia"));
                        String nombreApellido = JOptionPane.showInputDialog(null, "Nombre y Apellido");
                        String email = JOptionPane.showInputDialog(null, "Email");
                        int orden = Integer.parseInt(JOptionPane.showInputDialog(null, "Poner numero de registro a modificar"));

                        Paramedico modificar = new Paramedico();
                        modificar.setLicencia(licencia);
                        modificar.setNombreParamed(nombreApellido);
                        modificar.setEmail(email);
                        modificar.setIdParamedicos(orden);
                        DatosMedic modificarRegistro = new DatosMedic();
                        modificarRegistro.modificarParamedico(modificar);

                    } else if (ingreso.equals("3")) { //toma datos para eliminar paramedico
                        int orden = Integer.parseInt(JOptionPane.showInputDialog(null, "Poner numero de registro a eliminar"));
                        Paramedico paramedico = new Paramedico();
                        paramedico.setIdParamedicos(orden);
                        DatosMedic eliminarParamedico = new DatosMedic();
                        eliminarParamedico.eliminarParamedico(paramedico);
                        
                    } else if (ingreso.equals("0")) {
                        System.exit(opciones);
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion erronea");
                    }
                    break;
            }

        } while (opciones != 1 || opciones != 2 || opciones != 3);
        System.exit(opciones);
    }
}
