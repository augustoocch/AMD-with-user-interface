package Persona;

public class Paramedico {
    
    private int idParamedicos;
    
    private int licencia;
    private String nombreParamed;
    private String email;
    
    public Paramedico () {

    }

    public Paramedico(int idParamedicos) {
        this.idParamedicos = idParamedicos;
    }
    
    public Paramedico (int licencia, String nombreParamed, String email) {
        
        this.licencia = licencia;
        this.email = email;
        this.nombreParamed = nombreParamed;
        
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public String getNombreParamed() {
        return nombreParamed;
    }

    public void setNombreParamed(String nombreParamed) {
        this.nombreParamed = nombreParamed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdParamedicos() {
        return idParamedicos;
    }

    public void setIdParamedicos(int idParamedicos) {
        this.idParamedicos = idParamedicos;
    }


    
    
}
