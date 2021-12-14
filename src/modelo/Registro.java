package modelo;
//Diego

/*
Proyecto Final
Integrantes:
José Barra
Diego Saavedra
Felipe Fuentes
*/

//Importación de Librerías
import java.text.ParseException;  //Importación de ParseException para el try and catch del método de calcular la tarifa
import java.text.SimpleDateFormat;  //Importación de SimpleDateFormat para la manipulación de fechas
import java.util.Date;  //Importación de Date para el uso de fechas dentro del método de calcular la tarifa

public class Registro {
    
    //Atributos
    private Automovil auto;  //Atributo auto de tipo Automovil de tipo privado
    private String fechaInicio;  //Atributo fecha de tipo string de tipo privado
    
    //Constructor
    public Registro(Automovil auto, String fechaInicio) {
        this.auto = auto;
        this.fechaInicio = fechaInicio;
    }
    
    //Método para calcular los minutos transcurridos desde la hora de ingreso hasta el retiro
    public int calcularTarifa(String dateStop){
                                               
        String dateStart = this.fechaInicio;  //se liga el string fechainicio a otro string con un nuevo nombre
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");  //se inicializa simpledateformat para poder trabajar las fechas

        Date d1 = null;  //se inicializan dos fechas nulas
        Date d2 = null;
        try {  //Try and catch para asegurarse de que el programa se siga ejecutando a pesar de algún fallo
            d1 = format.parse(dateStart);  //fecha de inicio 
            d2 = format.parse(dateStop);  //fecha de retiro
        } catch (ParseException e) {  //Caso de excepción
            e.printStackTrace();
        }    

        //Cálculo de la tarifa
        long diff = d2.getTime() - d1.getTime();  //variable long que resta la fecha de de retiro con la de ingreso     
        long diffMinutes = diff / (60 * 1000);    //cálculo para la diferencia de minutos                       
        return (int)diffMinutes;               //retorno del valor de diferencia de los minutos como entero
    }

    //Setters y Getters
    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Automovil getAuto() {
        return auto;
    }

    public void setAuto(Automovil auto) {
        this.auto = auto;
    }
    
    
}
