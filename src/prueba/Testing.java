package prueba;
//Felipe

/*
Proyecto Final
Integrantes:
José Barra
Diego Saavedra
Felipe Fuentes
*/

//Importación de paquetes para poder hacer uso de ellas dentro del Testing
import modelo.Automovil;
import modelo.Estacionamiento;
import modelo.Registro;
import ventanas.MenuPrincipal;

public class Testing {

    public static void main(String[] args) {
        
        //Se crean tres ejemplos de prueba para el historial de ingresos
        Registro r1=new Registro(new Automovil("Arturo Vidal", "AV-23", "Ferrari"), "2015/07/12 16:16:03");
        Registro r2=new Registro(new Automovil("Chaleco Lopez", "CHA-21", "Maxus"), "2020/12/10 13:16:03");
        Registro r3=new Registro(new Automovil("Lewis Hamilton", "LEWI", "McLaren P1"), "2011/02/12 16:16:03");
        
        //Se agregan los tres ejemplos anteriores al registro
        Estacionamiento e=new Estacionamiento();
        e.agregarRegistro(r1);
        e.agregarRegistro(r2);
        e.agregarRegistro(r3);
        
        //Se hace visible la ejecución del programa desde el Testing
        MenuPrincipal menuPrincipal=new MenuPrincipal(e);
        menuPrincipal.setVisible(true);
    }
}
