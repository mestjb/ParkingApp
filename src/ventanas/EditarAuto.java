package ventanas;

/*
Proyecto Final
Integrantes:
José Barra
Diego Saavedra
Felipe Fuentes
*/

//Importación de clases
import java.awt.Image;  //Importación del la clase Image
import java.awt.Toolkit;  //Importación de la clase Toolkit
import javax.swing.JOptionPane;  //Importación de clase JOptionPane
import modelo.Automovil;  //Importación de la clase automovil
import modelo.Estacionamiento;  //Importación de la clase estacionamiento
import modelo.Registro;  //Importacion de la clase registro

public class EditarAuto extends javax.swing.JFrame{
    
    private Estacionamiento estacionamiento;  
    private int posicion; 

    public EditarAuto(Estacionamiento estacionamiento,int posicion) {  //Constructor
        this.estacionamiento=estacionamiento;
        this.posicion=posicion;
        initComponents();
        this.setLocationRelativeTo(null); 
        this.jLabelTarifa.setText("Tarifa: $"+this.estacionamiento.getTarifa());  //Tarifa actualizada
        this.jLabelDinero.setText("Dinero Recaudado: $"+this.estacionamiento.getDineroRecaudado());  //Dinero recaudado
        rellenar(); 
    }
    
    public void rellenar(){  //Metodo relleno de textfields
        this.TextFieldModelo.setText(this.estacionamiento.getRegistros().get(posicion).getAuto().getModelo());  
        this.TextFieldNombre.setText(this.estacionamiento.getRegistros().get(posicion).getAuto().getNombreConductor());  
        this.TextFieldPatente.setText(this.estacionamiento.getRegistros().get(posicion).getAuto().getPatente());  
    }
    
    
        public String capturarError(String texto){  //Metodo validacion de campo vacíos
        if (texto.length()==0) {  
            throw new IllegalArgumentException(); //Metodo con argumento ilegal
        }else{
            return texto;
        }
    }

    public Image getIconImage() {  //Asignacion del icono de la ventana
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logonocrown100px.png")); 
        return retValue;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        LabelPatente = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        LabelModelo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldPatente = new javax.swing.JTextField();
        TextFieldModelo = new javax.swing.JTextField();
        BotonAtras = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jLabelTarifa = new javax.swing.JLabel();
        jLabelDinero = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonEditar.setText("Aceptar");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 150, 40));

        LabelPatente.setText("Patente del Automóvil");
        getContentPane().add(LabelPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        LabelNombre.setText("Nombre Conductor");
        getContentPane().add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        LabelModelo.setText("Modelo del Automovil");
        getContentPane().add(LabelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Editar Automóvil");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 220, -1));

        TextFieldPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPatenteActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 220, -1));

        TextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldModeloActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 220, -1));

        BotonAtras.setText("Atrás");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 150, 40));

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

    //Boton Guardar cambios
    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed

        try {
            this.estacionamiento.getRegistros().get(posicion).getAuto().setModelo(capturarError(this.TextFieldModelo.getText()));  
            this.estacionamiento.getRegistros().get(posicion).getAuto().setNombreConductor(capturarError(this.TextFieldNombre.getText()));  
            this.estacionamiento.getRegistros().get(posicion).getAuto().setPatente(capturarError(this.TextFieldPatente.getText()));  
            JOptionPane.showMessageDialog(null, "Automovil editado con exito"); 
            Historial obj= new Historial(this.estacionamiento);  
            obj.setVisible(true); 
            dispose(); 
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(null, "Llene todo los campos");  
        }
    }//GEN-LAST:event_BotonEditarActionPerformed

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
        Historial obj= new Historial(this.estacionamiento);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JLabel LabelModelo;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPatente;
    private javax.swing.JTextField TextFieldModelo;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldPatente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDinero;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTarifa;
    // End of variables declaration//GEN-END:variables

}
