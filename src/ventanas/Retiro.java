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
import java.time.LocalDateTime;  //Importacion de LocaldateTime
import java.time.format.DateTimeFormatter;  //Importacion del DateTimeFormatter
import javax.swing.JOptionPane;  //Importacion de la clase JOptionPane
import modelo.Estacionamiento;  //Importacion de la clase estacionamiento
import modelo.Registro;  //Importacion de la clase registro

public class Retiro extends javax.swing.JFrame {
    
    private Estacionamiento estacionamiento;

    public Retiro(Estacionamiento estacionamiento) {  //Constructor
        this.estacionamiento=estacionamiento;
        initComponents();
        this.setLocationRelativeTo(null);  //Codigo que Centra la ventana
        this.jLabelTarifa.setText("Tarifa: $"+this.estacionamiento.getTarifa());  //Tarifa actualizada
        this.jLabelDinero.setText("Dinero Recaudado: $"+this.estacionamiento.getDineroRecaudado());  //Dinero recaudado

    }
    
    public void vaciar(){  //Metodo vaciar textfields
        this.TextFieldPatente.setText("");
        this.TextFieldHoraIngreso.setText("");
        this.TextFieldTarifa.setText("");
        this.jTextFieldMinutos.setText("");
    }

    public Image getIconImage() {  //Icono de la ventana
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logonocrown100px.png"));
        return retValue;
    }
    
    public String capturarError(String texto){  //Validar campos vacios
        if (texto.length()==0) {
            throw new IllegalArgumentException();
        }else{
            return texto;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonEliminar = new javax.swing.JButton();
        LabelTarifa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldTarifa = new javax.swing.JTextField();
        BotonAtras = new javax.swing.JButton();
        LabelPatente = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        TextFieldPatente = new javax.swing.JTextField();
        TextFieldHoraIngreso = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        jLabelTarifa = new javax.swing.JLabel();
        jLabelDinero = new javax.swing.JLabel();
        jTextFieldMinutos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonEliminar.setText("Retirar Automovil");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 150, 40));

        LabelTarifa.setText("Tarifa a Pagar");
        getContentPane().add(LabelTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Retiro de Automóvil");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        TextFieldTarifa.setEditable(false);
        TextFieldTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldTarifaActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 220, -1));

        BotonAtras.setText("Atrás");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 150, 40));

        LabelPatente.setText("Patente del Automóvil");
        getContentPane().add(LabelPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 20));

        LabelHora.setText("Hora Ingreso");
        getContentPane().add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, 20));

        TextFieldPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPatenteActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 220, -1));

        TextFieldHoraIngreso.setEditable(false);
        TextFieldHoraIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldHoraIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldHoraIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 220, -1));

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, 20));

        jLabelTarifa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTarifa.setText("Tarifa");
        getContentPane().add(jLabelTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 30));

        jLabelDinero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDinero.setText("Dinero Recaudado");
        getContentPane().add(jLabelDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 290, 30));

        jTextFieldMinutos.setEditable(false);
        getContentPane().add(jTextFieldMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 220, -1));

        jLabel1.setText("Minutos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper600400.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botón retirar auto
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        try {
            String patente = capturarError(this.TextFieldPatente.getText());  //textfield
            Registro r=this.estacionamiento.buscarAuto(patente);  //buscar automovil
            if (r==null) {  
                throw new IllegalArgumentException(); 
            }
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  //se formatea el patron
            String horaActual=""+dtf.format(LocalDateTime.now()); 
            int minutos=r.calcularTarifa(horaActual);  //minutos de estadia
            
            int tarifaPagar=this.estacionamiento.getTarifa()*(int)minutos/60;  //calculo
            
            this.estacionamiento.eliminarRegistro(r);  //eliminar auto del registro
            
            this.estacionamiento.setDineroRecaudado(this.estacionamiento.getDineroRecaudado()+tarifaPagar);  //dinero actualizado
            JOptionPane.showMessageDialog(null, "Automovil retirado con exito"); 
            vaciar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Patente no encontrada"); 
            vaciar();
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void TextFieldTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldTarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldTarifaActionPerformed

    //Botón atrás
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuPrincipal obj= new MenuPrincipal(this.estacionamiento);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void TextFieldPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPatenteActionPerformed

    }//GEN-LAST:event_TextFieldPatenteActionPerformed

    private void TextFieldHoraIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldHoraIngresoActionPerformed

    }//GEN-LAST:event_TextFieldHoraIngresoActionPerformed
    
    //Botón Buscar automovil
    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed

        try {
            String patente = capturarError(this.TextFieldPatente.getText());  //textfield
            Registro r=this.estacionamiento.buscarAuto(patente);   //busca auto
            if (r==null) {  
                throw new IllegalArgumentException(); 
            }
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  //formato de patron
            String horaActual=""+dtf.format(LocalDateTime.now());  
            
            int minutos=r.calcularTarifa(horaActual);   //minutos estadia
            
            int tarifaPagar=this.estacionamiento.getTarifa()*(int)minutos/60;  //calculo tarifa
            
            this.TextFieldHoraIngreso.setText(r.getFechaInicio());  //relleno de textfields
            this.TextFieldTarifa.setText(""+tarifaPagar); 
            this.jTextFieldMinutos.setText(""+minutos);  
            JOptionPane.showMessageDialog(null, "Automovil encontrado con exito");  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Patente no encontrada");  
            vaciar();
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelPatente;
    private javax.swing.JLabel LabelTarifa;
    private javax.swing.JTextField TextFieldHoraIngreso;
    private javax.swing.JTextField TextFieldPatente;
    private javax.swing.JTextField TextFieldTarifa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDinero;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTarifa;
    private javax.swing.JTextField jTextFieldMinutos;
    // End of variables declaration//GEN-END:variables
}
