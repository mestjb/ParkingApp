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
import java.util.ArrayList;  //Importacion de la clase Arraylist
import javax.swing.JOptionPane;  //Importacion de la clase JOptionPane 
import javax.swing.JScrollPane;  //Importacion de la clase JScrollPane
import javax.swing.JTable;  //Importacion de la clase JTable
import javax.swing.table.DefaultTableModel;  //Importacion de de la clase DefaultTableModel
import modelo.Estacionamiento;  //importacion de la clase estacionamiento
import modelo.Registro;  //importacion de la clase registro

public class Historial extends javax.swing.JFrame {

    private Estacionamiento estacionamiento;  
    
    public Historial(Estacionamiento estacionamiento) {  //Constructor
        this.estacionamiento=estacionamiento;
        initComponents();
        listarAutos();
        this.setLocationRelativeTo(null); 
        this.jLabelTarifa.setText("Tarifa: $"+this.estacionamiento.getTarifa());  //Tarifa actualizada 
        this.jLabelDinero.setText("Dinero Recaudado: $"+this.estacionamiento.getDineroRecaudado());  //Dinero recaudado

    }

    public Image getIconImage() {  //Icono de la ventana
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logonocrown100px.png"));
        return retValue;
    }
    
    public void listarAutos(){  //Metodo llenar la tabla con los registros de automoviles
        DefaultTableModel dtf = (DefaultTableModel) this.jTableRegistros.getModel(); 
        ArrayList<Registro> r=this.estacionamiento.getRegistros();  
        for (int i = 0; i < r.size(); i++) {  
            String[] fila = {r.get(i).getAuto().getNombreConductor(), 
                r.get(i).getAuto().getModelo(),  
                r.get(i).getAuto().getPatente(),  
                r.get(i).getFechaInicio()};  
            dtf.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistros = new javax.swing.JTable();
        jLabelTarifa = new javax.swing.JLabel();
        jLabelDinero = new javax.swing.JLabel();
        BotonEditar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Historial de Ingresos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        BotonAtras.setText("Atrás");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 150, 40));

        jTableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Conductor", "Modelo", "Patente", "Fecha de Ingreso"
            }
        ));
        jScrollPane1.setViewportView(jTableRegistros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 540, 180));

        jLabelTarifa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTarifa.setText("Tarifa");
        getContentPane().add(jLabelTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 30));

        jLabelDinero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDinero.setText("Dinero Recaudado");
        getContentPane().add(jLabelDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 290, 30));

        BotonEditar.setText("Editar Automovil");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 160, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper600400.png"))); // NOI18N
        jLabelFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Botón atrás
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuPrincipal obj= new MenuPrincipal(this.estacionamiento);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed
    
    //Botón editar automovil
    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        try {
            int row = this.jTableRegistros.getSelectedRow(); 
            EditarAuto editar=new EditarAuto(this.estacionamiento,row); 
            editar.setVisible(true);  //se hace visible 
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione un automovil"); 
        }
    }//GEN-LAST:event_BotonEditarActionPerformed

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTableRegistros() {
        return jTableRegistros;
    }

    public void setjTableRegistros(JTable jTableRegistros) {
        this.jTableRegistros = jTableRegistros;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDinero;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTarifa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistros;
    // End of variables declaration//GEN-END:variables
}
