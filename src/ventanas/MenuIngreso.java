package ventanas;

/*
Proyecto Final
Integrantes:
José Barra
Diego Saavedra
Felipe Fuentes
*/

//Importación de clases
import java.awt.Image;  //Importación de la clase Image 
import java.awt.Toolkit;  //Importación de la clase Toolkit 
import java.util.Calendar;  //Importacion de la clase Calendar
import java.util.Date;  //Importacion de la clase Date 
import java.util.GregorianCalendar;  //Importacion de la clase Gregoriancalendar 
import javax.swing.JOptionPane; //Importacion de la clase JOptionPane
import modelo.Automovil;  //Importacion de la clase automovil
import modelo.Estacionamiento;  //Importacion de la clase estacionamiento
import modelo.Registro;  //Importacion de la clase registro

public class MenuIngreso extends javax.swing.JFrame implements  Runnable{  
    String hora,minuto,segundo; 
    Thread hilo;  
    
    private Estacionamiento estacionamiento; 

    public MenuIngreso(Estacionamiento estacionamiento) {  //Constructor
        this.estacionamiento=estacionamiento;
        initComponents();
        hilo=new Thread(this);
        hilo.start();  
        this.setLocationRelativeTo(null);  
        this.jLabelTarifa.setText("Tarifa: $"+this.estacionamiento.getTarifa());  //Tarifa actualizada
        this.jLabelDinero.setText("Dinero Recaudado: $"+this.estacionamiento.getDineroRecaudado());  //Dinero recaudado
    }
    
    public void vaciar(){  //Metodo vaciar textfields
        this.TextFieldModelo.setText("");
        this.TextFieldNombre.setText("");
        this.TextFieldPatente.setText("");  
    }
    
    
    public void Hora(){  //Metodo para calcular la hora, minutos y segundos en tiempo real
        Calendar calendario = new GregorianCalendar();  
        Date Hora = new Date(); 
        calendario.setTime(Hora);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);  
        minuto = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);  
        segundo = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
        
    }
    
    public String fechaActualAutomatica() {  //Metodo para ver la fecha actual
        Calendar fecha = new GregorianCalendar();  
        int anio = fecha.get(Calendar.YEAR); 
        int mes = fecha.get(Calendar.MONTH);  
        int dia = fecha.get(Calendar.DAY_OF_MONTH); 
        return anio + "/" + (mes + 1) + "/" + dia;  
    }
    
    @Override
    public void run() {  //Metodo para hacer el efecto de reloj en vivo
        Thread current = Thread.currentThread(); 
        while (current==hilo) {  
            Hora();
            horaActual.setText(hora+":"+minuto+":"+segundo); 
        }
    }
    
    public String capturarError(String texto){  //Método validación de campos vacios
        if (texto.length()==0) {
            throw new IllegalArgumentException();
        }else{
            return texto;
        }
    }

    public Image getIconImage() {  //Icono de la ventana
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logonocrown100px.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        BotonIngresar = new javax.swing.JButton();
        LabelPatente = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelModelo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldPatente = new javax.swing.JTextField();
        TextFieldModelo = new javax.swing.JTextField();
        BotonAtras = new javax.swing.JButton();
        horaActual = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jLabelTarifa = new javax.swing.JLabel();
        jLabelDinero = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonIngresar.setText("Ingresar Automóvil");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 150, 40));

        LabelPatente.setText("Patente del Automóvil");
        getContentPane().add(LabelPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        LabelNombre.setText("Nombre Conductor");
        getContentPane().add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        LabelModelo.setText("Modelo del Automovil");
        getContentPane().add(LabelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Ingreso de Automóvil");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 220, -1));

        TextFieldPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPatenteActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 220, -1));

        TextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldModeloActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 220, -1));

        BotonAtras.setText("Atrás");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 150, 40));

        horaActual.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        horaActual.setText("20:20:20");
        horaActual.setSelected(true);
        horaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActualActionPerformed(evt);
            }
        });
        getContentPane().add(horaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 150, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper600400.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 370));

        jLabelTarifa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTarifa.setText("Tarifa");
        getContentPane().add(jLabelTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 30));

        jLabelDinero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDinero.setText("Dinero Recaudado");
        getContentPane().add(jLabelDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 290, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Botón de ingresar automóvil
    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed

        try {
            String nombre = capturarError(this.TextFieldNombre.getText());  
            String patente = capturarError(this.TextFieldPatente.getText());  
            String modelo = capturarError(this.TextFieldModelo.getText());  
            String fechaActual = fechaActualAutomatica()+" "+hora+":"+minuto+":"+segundo;  

            Automovil auto=new Automovil(nombre,patente,modelo);  
            Registro registro=new Registro(auto,fechaActual);  
            this.estacionamiento.agregarRegistro(registro); 
            
            JOptionPane.showMessageDialog(null, "Automovil ingresado con exito"); 
            vaciar();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Llene todo los campos"); 
            vaciar();
        }
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void TextFieldPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPatenteActionPerformed

    private void TextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldModeloActionPerformed
    
    //Botón atrás
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuPrincipal obj= new MenuPrincipal(this.estacionamiento);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed
    
    //Botón con hora impresa
    private void horaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActualActionPerformed
        System.out.println(fechaActualAutomatica()+" "+hora+":"+minuto+":"+segundo);
    }//GEN-LAST:event_horaActualActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JLabel LabelModelo;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPatente;
    private javax.swing.JTextField TextFieldModelo;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldPatente;
    private javax.swing.JButton horaActual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDinero;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTarifa;
    // End of variables declaration//GEN-END:variables

}
