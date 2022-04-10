package Persona;

public class Medico {
   
    private int Orden;
    
    private int id;
    private String nombreMedico;
    private String email;
    
    
    
    public Medico () {

    }

    public Medico(int Orden) {
        this.Orden = Orden;
    }


    
    public Medico (int id, String nombreMedico, String email) {
        
      this.id = id;
      this.nombreMedico = nombreMedico;
      this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombreMedico;
    }

    public void setNombre(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOrden() {
        return Orden;
    }

    public void setOrden(int Orden) {
        this.Orden = Orden;
    }


    
}
