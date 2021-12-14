package modelo;
//Diego saavedra

/*
Proyecto Final
Integrantes:
José Barra
Diego Saavedra
Felipe Fuentes
*/

public class Automovil {
    
    //Atributos
    private String nombreConductor;  //Tres cadenas de texto de tipo privada:nombre, patente y modelo
    private String patente;
    private String modelo;
    
    //Constructores
    public Automovil() {  //Constructor vacío
    }

    public Automovil(String nombreConductor, String patente, String modelo) {  //Constructor lleno con los tres atributos
        this.nombreConductor = nombreConductor;
        this.patente = patente;
        this.modelo = modelo;
    }

    //Getters y Setters
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
