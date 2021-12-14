package modelo;
//Felipe

/*
Proyecto Final
Integrantes:
José Barra
Diego Saavedra
Felipe Fuentes
*/

//Importación de Librerías
import java.util.ArrayList;  //Se importa la clase arraylist para crear una lista
import javax.swing.JOptionPane;  //Se importa el paquete JOptionPane para usar ventanas de aviso


public class Estacionamiento {
    
    //Atributos
    private int tarifa;  //Dos variables tipo entero de tipo privadas: tarifa y dineroRecaudado
    private int dineroRecaudado;
    private ArrayList<Registro> registros;  //Arraylist para el registro importada arriba
    
    //Constructor
    public Estacionamiento() { 
        registros=new ArrayList<>();
        tarifa=10000;  //Se inicializa la tarifa con valor de $10.000 en el constructor
        dineroRecaudado=0;  //Se inicializ el dinero recaudado con valor cero
    }
    
    public void agregarRegistro(Registro r){ //Metodo para agregar un registro al arraylist
        this.registros.add(r);
    }
    
    public void eliminarRegistro(Registro r){ //Metodo para eliminar un registro del arraylist
        this.registros.remove(r);
    }
    
    public Registro buscarAuto(String patente){ // Metodo para buscar un automovil en el arraylist de registros
        
        for (int i = 0; i < this.registros.size(); i++) {  //bucle for parte de 0, es menor al tamaño de los registros, avanza de uno en uno
            if (this.registros.get(i).getAuto().getPatente().contains(patente)) {  //condicional if que busca la patente dentro de los registros
                return this.registros.get(i);  //retorno del automovil encontrado
            }
        }
        return null;
    }

    //Getters y Setters
    public int getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(int dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
}
