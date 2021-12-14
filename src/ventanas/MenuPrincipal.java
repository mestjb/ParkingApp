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
import modelo.Estacionamiento;  //Importacion de la clase estacionamiento

public class MenuPrincipal extends javax.swing.JFrame {

    private Estacionamiento estacionamiento; //Se inicializa un objeto de tipo Estacionamiento
    
    public MenuPrincipal(Estacionamiento estacionamiento) {
        this.estacionamiento=estacionamiento;
        initComponents();
        this.setLocationRelativeTo(null);  //Codigo que centra la ventana
        this.jLabelTarifa.setText("Tarifa: $"+this.estacionamiento.getTarifa());  //Tarifa actualizada panel superior
        this.jLabelDinero.setText("Dinero Recaudado: $"+this.estacionamiento.getDineroRecaudado());  //Dinero recaudado actualizado panel superior
    }

    public Image getIconImage() {  //Asignacion del icono de la ventana
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logonocrown100px.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcono = new javax.swing.JLabel();
        BotonIngresar = new javax.swing.JButton();
        BotonRetirar = new javax.swing.JButton();
        BotonHistorial = new javax.swing.JButton();
        BotonEditarTarifa = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelTarifa = new javax.swing.JLabel();
        jLabelDinero = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/parkingfinal.png"))); // NOI18N
        getContentPane().add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 230, 170));

        BotonIngresar.setText("Ingresar Automóvil");
        BotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, 40));

        BotonRetirar.setText("Retirar Automóvil");
        BotonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRetirarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 150, 40));

        BotonHistorial.setText("Historial de Ingresos");
        BotonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(BotonHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 150, 40));

        BotonEditarTarifa.setText("Editar Tarifa");
        BotonEditarTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarTarifaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEditarTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 150, 40));

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 150, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bmw300.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 300, 210));

        jButton2.setText("Acerca de la aplicación");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 170, 30));

        jLabelTarifa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTarifa.setText("Tarifa");
        getContentPane().add(jLabelTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 30));

        jLabelDinero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDinero.setText("Tarifa");
        getContentPane().add(jLabelDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 290, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper600400.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Botón de ingreso de un automóvil
    private void BotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresarActionPerformed
        MenuIngreso obj= new MenuIngreso(this.estacionamiento);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonIngresarActionPerformed

    //Botón para salir del software
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);  //Codigo para salir del programa
    }//GEN-LAST:event_BotonSalirActionPerformed

    //Botón de Acerca de la APP
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AcercaDeApp obj= new AcercaDeApp(this.estacionamiento);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    //Botón para Editar Tarifa
    private void BotonEditarTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarTarifaActionPerformed
        EditarTarifa obj= new EditarTarifa(this.estacionamiento);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonEditarTarifaActionPerformed

    //Botón para Retiro de Auto
    private void BotonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRetirarActionPerformed
        Retiro obj= new Retiro(this.estacionamiento);
        obj.setVisible(true);
        dispose();   
    }//GEN-LAST:event_BotonRetirarActionPerformed

    //Botón de Historial de Ingresos
    private void BotonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHistorialActionPerformed
        Historial obj= new Historial(this.estacionamiento);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonHistorialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEditarTarifa;
    private javax.swing.JButton BotonHistorial;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonRetirar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDinero;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelTarifa;
    // End of variables declaration//GEN-END:variables
}
