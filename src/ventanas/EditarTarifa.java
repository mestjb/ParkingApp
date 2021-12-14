package ventanas;
//Diego

/*
Proyecto Final
Integrantes:
José Barra
Diego Saavedra
Felipe Fuentes
*/

//Importación de Librerías y Paquetes
import java.awt.Image;  //Importación de la clase Image para poder asignarle un icono a la ventana 
import java.awt.Toolkit;  //Importación de la clase Toolkit usado en la asignación del icono a la ventana
import javax.swing.JOptionPane;  //Importación de la clas JOptionPane para poder usar ventanas de aviso
import modelo.Estacionamiento;  //Importación de la clase estacionamiento

public class EditarTarifa extends javax.swing.JFrame {

    private Estacionamiento estacionamiento;  //Se inicializa un objeto de tipo Estacionamiento
    
    public EditarTarifa(Estacionamiento estacionamiento) {  //Constructor
        this.estacionamiento=estacionamiento;
        initComponents();
        this.setLocationRelativeTo(null);  //Codigo que centra la ventana
        this.jLabelTarifa.setText("Tarifa: $"+this.estacionamiento.getTarifa());  //Tarifa actualizada panel superior
        this.jLabelDinero.setText("Dinero Recaudado: $"+this.estacionamiento.getDineroRecaudado());  //Dinero recaudado actualizado panel superior

    }

    public Image getIconImage() {  //Asignacion del icono de la ventana
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logonocrown100px.png"));  //icono de la ventana
        return retValue;
    }
    
    public String capturarError(String texto){  //Metodo para validar los campos vacios
        if (texto.length()==0) {
            throw new IllegalArgumentException();
        }else{
            return texto;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonIngresar = new javax.swing.JButton();
        LabelModelo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldModelo = new javax.swing.JTextField();
        BotonAtras = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jLabelTarifa = new javax.swing.JLabel();
        jLabelDinero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonIngresar.setText("Guardar Cambios");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 150, 40));

        LabelModelo.setText("Tarifa nueva:");
        getContentPane().add(LabelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Editar Tarifa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        TextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldModeloActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 100, -1));

        BotonAtras.setText("Atrás");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 150, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper600400.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 370));

        jLabelTarifa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTarifa.setText("Tarifa");
        getContentPane().add(jLabelTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 30));

        jLabelDinero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDinero.setText("Tarifa");
        getContentPane().add(jLabelDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 290, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Botón de guardar cambios de edición de la tarifa
    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        try {
            String nuevaTarifa=capturarError(this.TextFieldModelo.getText());  //se valida el textfield
            JOptionPane.showMessageDialog(null, "Tarifa cambiada con exito");  //se muestra una ventana con mensaje de tarifa cambiada con exito
            this.estacionamiento.setTarifa(Integer.parseInt(nuevaTarifa));  //se asigna la nueva tarifa a la variable
            this.TextFieldModelo.setText("");  //el textfield vuelve a vacío
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(null, "Ingrese una tarifa valida");  //Excepción para tipeo erróneo
            this.TextFieldModelo.setText("");  //el textfield se vuelve a vacio
        }
    }//GEN-LAST:event_BotonIngresarActionPerformed

    private void TextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldModeloActionPerformed

    }//GEN-LAST:event_TextFieldModeloActionPerformed

    //Botón atrás para volver al menú principal
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuPrincipal obj= new MenuPrincipal(this.estacionamiento);
        obj.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BotonAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JLabel LabelModelo;
    private javax.swing.JTextField TextFieldModelo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDinero;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTarifa;
    // End of variables declaration//GEN-END:variables
}
