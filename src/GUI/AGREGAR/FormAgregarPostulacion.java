/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.AGREGAR;

import Clases.Item;
import GUI.MenuPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class FormAgregarPostulacion extends javax.swing.JFrame {

    private static FormAgregarPostulacion instancia;
    /**
     * Creates new form FormAgregarPostulacion
     */
    public FormAgregarPostulacion() {
        initComponents();
    }
    
    public static FormAgregarPostulacion getInstancia() {
        if(instancia == null)
        {
            instancia = new FormAgregarPostulacion();
        }
        
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Proyecto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        investigadorBox = new javax.swing.JComboBox<>();
        proyectoBox = new javax.swing.JComboBox<>();
        agregarPostulacion = new javax.swing.JButton();
        rolBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Postulante: ");

        Proyecto.setText("Proyecto:");

        jLabel3.setText("Rol del investigador:");

        agregarPostulacion.setText("Agregar postulación");
        agregarPostulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPostulacionActionPerformed(evt);
            }
        });

        rolBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Investigador responsable", "Co-investigador", "Investigador" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Agregar postulación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Proyecto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(proyectoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(investigadorBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregarPostulacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(investigadorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Proyecto)
                    .addComponent(proyectoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(agregarPostulacion)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try{
            MenuPrincipal.Conexion();  
            Statement s = MenuPrincipal.connection.createStatement();
            
            // AGREGA OPCIONES AL COMBOBOX DE INVESTIGADOR
            ResultSet resultInvestigador = s.executeQuery("SELECT nombreInvestigador, RUT FROM INVESTIGADOR");
            while(resultInvestigador.next())
            {
                investigadorBox.addItem(new Item(resultInvestigador.getString("RUT"), resultInvestigador.getString("nombreInvestigador")+": "+resultInvestigador.getString("RUT")));
            }   
            
            // AGREGA OPCIONES AL COMBOBOX DE PROYECTO
            ResultSet resultProyecto = s.executeQuery("SELECT codigoproyecto, titulo FROM PROYECTO");
            while(resultProyecto.next())
            {
                proyectoBox.addItem(new Item(resultProyecto.getString("codigoProyecto"), resultProyecto.getString("titulo")));
            }

        }
        catch(Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage());    
        }
        
        
    
    }//GEN-LAST:event_formWindowActivated

    private void agregarPostulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPostulacionActionPerformed
        // OBTIENE EL RUT DEL POSTULANTE
            String rut = ((Item)investigadorBox.getSelectedItem()).getIdString();
            
            // OBTIENE EL CÓDIGO DE PROYECTO AL QUE SE POSTULA
            String codProyecto = ((Item)proyectoBox.getSelectedItem()).getIdString();
        try{
            
            
            // OBTIENE EL ROL DEL INVESTIGADOR EN EL PROYECTO
            String rol = (String)rolBox.getSelectedItem();
            
            Statement s = MenuPrincipal.connection.createStatement();
            
            int z = s.executeUpdate("INSERT INTO POSTULA(rol_p, RUT, codigoproyecto) values ('"
            +rol+"', '"+rut+"', "+codProyecto+")");
            
            if(z==1){ JOptionPane.showMessageDialog(this, "Se agregó la postulación exitosamente");  }
               
        }
        catch(SQLException e){
                 
            
                 if(e.getSQLState().equals("23505"))
                 {
                     JOptionPane.showMessageDialog(this, "No se puede agregar la postulación debido a que ya existe una con las claves foráneas: "
                     + rut+" y "+codProyecto);
                 }  
                 else if(e.getSQLState().equals("42703"))
                 {
                     JOptionPane.showMessageDialog(this, "Monto inválido, por favor ingrese un número sin puntos ni otros caracteres");
                 }  
        }
    }//GEN-LAST:event_agregarPostulacionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAgregarPostulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgregarPostulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgregarPostulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgregarPostulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAgregarPostulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Proyecto;
    private javax.swing.JButton agregarPostulacion;
    private javax.swing.JComboBox<Item> investigadorBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<Item> proyectoBox;
    private javax.swing.JComboBox<String> rolBox;
    // End of variables declaration//GEN-END:variables
}