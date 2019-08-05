package GUI.EditarEliminarArticulo;

import GUI.EEAdjudicacion.*;
import GUI.EditarEliminar.Postulación.*;
import GUI.EditarEliminar.Investigador.*;
import GUI.AGREGAR.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import Clases.Item;
import GUI.MenuPrincipal;
import java.text.DateFormat;
import javax.swing.DefaultListModel;
/**
 *
 * @author Felipe
 */
public class FormEditarArticulo extends javax.swing.JFrame {

    private static FormEditarArticulo instancia;
    private Item articulo;
    
    public FormEditarArticulo(Item art) {
        initComponents();
        articulo = art;
    }
    
    public static FormEditarArticulo getInstancia(Item art) {
        if(instancia == null)
        {
            instancia = new FormEditarArticulo(art);
        }
        
        return instancia;
    }
    
    // instancia siempre nueva
    public static FormEditarArticulo getInstanciaNueva(Item art) {
        
        instancia = new FormEditarArticulo(art);      
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

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rutPostulanteBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tituloNuevoText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tituloAntiguoText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelo = new DefaultListModel();
        listaAutores = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        eliminarAutorButton = new javax.swing.JButton();
        agregarAutorBox = new javax.swing.JComboBox<>();
        eliminarAutorBox = new javax.swing.JComboBox<>();
        agregarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Editar artículo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Editar Artículo");

        jLabel4.setText("Título nuevo");

        tituloNuevoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloNuevoTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Título antiguo");

        tituloAntiguoText.setEditable(false);
        tituloAntiguoText.setBackground(new java.awt.Color(204, 204, 255));

        listaAutores.setModel(modelo);
        jScrollPane1.setViewportView(listaAutores);

        jLabel2.setText("Autores");

        jButton2.setText("Agregar autor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        eliminarAutorButton.setText("Eliminar autor");
        eliminarAutorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAutorButtonActionPerformed(evt);
            }
        });

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(tituloNuevoText, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tituloAntiguoText, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)))
                        .addGap(292, 292, 292))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(agregarAutorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarButton))
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminarButton)
                            .addComponent(eliminarAutorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarAutorButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tituloAntiguoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tituloNuevoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(eliminarAutorButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarAutorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarAutorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarButton)
                            .addComponent(eliminarButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            
            MenuPrincipal.Conexion();
            Statement s = MenuPrincipal.connection.createStatement();
            
            
            // titulonuevo
            String tituloNuevo = tituloNuevoText.getText();           
            
            
            //edita el artículo con el nuevo dato
            int z = s.executeUpdate("UPDATE ARTICULO SET titulo='"
            +tituloNuevo+"'where codigoarticulo="+articulo.getIdString());
            
            
            if(z == 1){ JOptionPane.showMessageDialog(this, "Se editó el artículo exitosamente");  }
            
            
        } catch(Exception e)
        {
            
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
         try{
            agregarAutorBox.setVisible(false);
            eliminarAutorBox.setVisible(false);
            agregarButton.setVisible(false);
            eliminarButton.setVisible(false);
             
            MenuPrincipal.Conexion();  
            Statement s = MenuPrincipal.connection.createStatement();
            System.out.println(articulo.getName());
            
            // obtiene nombre del investigador y titulo del proyecto para mostrarlos en textfields
            ResultSet resultTitulo = s.executeQuery("SELECT titulo FROM ARTICULO WHERE codigoarticulo="
                    + articulo.getIdString());
            while(resultTitulo.next())
            {
                tituloAntiguoText.setText(resultTitulo.getString("titulo"));
            }
            
            
            
            // agrega los autores del artículo a una lista
            ResultSet resultAutor = s.executeQuery("SELECT i.rut, i.nombreinvestigador FROM ESCRIBE e, INVESTIGADOR i WHERE i.rut=e.rut AND e.codigoarticulo="
                    + articulo.getIdString());
            modelo.clear();
            while(resultAutor.next())
            {
                
                modelo.addElement(resultAutor.getString("nombreinvestigador"));
            }
            
           
            
            
            
       
        }
        catch(Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage());    
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        
    }//GEN-LAST:event_formWindowOpened

    private void tituloNuevoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloNuevoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloNuevoTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        agregarAutorBox.setVisible(true);
        agregarButton.setVisible(true); 
        try
        {
            MenuPrincipal.Conexion();
            Statement s = MenuPrincipal.connection.createStatement();
          
           ResultSet resultAgregarAutor = s.executeQuery("SELECT i.nombreinvestigador, i.rut FROM ESCRIBE e, INVESTIGADOR i WHERE i.rut!=e.rut AND e.codigoarticulo="
                    + articulo.getIdString());
           
           agregarAutorBox.removeAllItems();
            while(resultAgregarAutor.next())
            {
                agregarAutorBox.addItem((new Item(resultAgregarAutor.getString("rut"), resultAgregarAutor.getString("nombreinvestigador"))));
                
            }
        
        
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        try
        {
            MenuPrincipal.Conexion();
            Statement s = MenuPrincipal.connection.createStatement();
            
            Item a = (Item)agregarAutorBox.getSelectedItem();
            
           int z = s.executeUpdate("INSERT INTO ESCRIBE values('"
            +a.getIdString()+"', "+ articulo.getIdString() + ")");
            
            if(z==1)
            {
                JOptionPane.showMessageDialog(this, "Autor agregado exitosamente");
            }
        
        
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void eliminarAutorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAutorButtonActionPerformed
        eliminarAutorBox.setVisible(true);
        eliminarButton.setVisible(true);
        try
        {
            MenuPrincipal.Conexion();
            Statement s = MenuPrincipal.connection.createStatement();
            
           ResultSet resultAgregarAutor = s.executeQuery("SELECT i.nombreinvestigador, i.rut FROM ESCRIBE e, INVESTIGADOR i WHERE i.rut=e.rut AND e.codigoarticulo="
                    + articulo.getIdString());
           
           eliminarAutorBox.removeAllItems();
            while(resultAgregarAutor.next())
            {
                eliminarAutorBox.addItem((new Item(resultAgregarAutor.getString("rut"), resultAgregarAutor.getString("nombreinvestigador"))));
                
            }
        
        
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_eliminarAutorButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        try
        {
            MenuPrincipal.Conexion();
            Statement s = MenuPrincipal.connection.createStatement();
            
            
           Item a = (Item)eliminarAutorBox.getSelectedItem();
           int z = s.executeUpdate("DELETE FROM ESCRIBE WHERE codigoarticulo="
            +articulo.getIdString()+" AND rut='"+a.getIdString()+"'");
            
            if(z==1)
            {
                JOptionPane.showMessageDialog(this, "Autor asociado eliminado exitosamente");
            }
        
        
        
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditarArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Item> agregarAutorBox;
    private javax.swing.JButton agregarButton;
    private javax.swing.JComboBox<Item> eliminarAutorBox;
    private javax.swing.JButton eliminarAutorButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaAutores;
    private DefaultListModel modelo;
    private javax.swing.JComboBox<String> rutPostulanteBox1;
    private javax.swing.JTextField tituloAntiguoText;
    private javax.swing.JTextField tituloNuevoText;
    // End of variables declaration//GEN-END:variables
}
