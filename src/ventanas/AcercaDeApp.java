package ventanas;
//Felipe

/*
Proyecto Final
Integrantes:
José Barra
Diego Saavedra
Felipe Fuentes
*/

//Importación de Librerías y Paquetes
import java.awt.Image; //Importación de la clase Image para poder asignarle un icono a la ventana 
import java.awt.Toolkit;  //Importación de la clase Toolkit usado en la asignación del icono a la ventana
import modelo.Estacionamiento;  //Importación de la clase estacionamiento

public class AcercaDeApp extends javax.swing.JFrame {
    
    private Estacionamiento estacionamiento;  //Se inicializa un objeto de tipo estacionamiento

    public AcercaDeApp(Estacionamiento estacionamiento) {  //Constructor
        this.estacionamiento=estacionamiento;
        initComponents();
        this.setLocationRelativeTo(null);  //código centra la ventana
        this.jLabelTarifa.setText("Tarifa: $"+this.estacionamiento.getTarifa());  //tarifa actualizada panel superior
        this.jLabelDinero.setText("Dinero Recaudado: $"+this.estacionamiento.getDineroRecaudado());  //dinero recaudado panel superior
    }

    public Image getIconImage() {  //Asignación del icono a la ventana
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logonocrown100px.png"));  //icono de la ventana
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();
        jLabelTarifa = new javax.swing.JLabel();
        jLabelDinero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Acerca de la aplicación");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/slogan.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 450, 140));

        BotonAtras.setText("Atrás");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

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

    //Botón "atrás" en la ventana, vuelve al menú principal de la app
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuPrincipal obj= new MenuPrincipal(this.estacionamiento);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDinero;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTarifa;
    // End of variables declaration//GEN-END:variables
}
