package Persona;

public class Cliente {
    
    private int orden;

    private int id;
    private String nombreCliente;
    private String telefono;
    private String direccion;
    
    public Cliente (){
              
    }

    public Cliente(int orden) {
        this.orden = orden;
    }
    
    public Cliente (int id, String nombreCliente, String telefono, String direccion) {
        
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.direccion = direccion;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    

    
}