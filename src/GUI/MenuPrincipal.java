/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.AGREGAR.FormAgregarRegion;
import GUI.AGREGAR.FormAgregarAreaDeInvestigacion;
import GUI.AGREGAR.FormAgregarProyecto;
import GUI.AGREGAR.FormAgregarTipoProyecto;
import GUI.AGREGAR.FormAgregarPostulacion;
import GUI.AGREGAR.FormAgregarArticulo;
import GUI.AGREGAR.FormAgregarAdjudicacion;
import GUI.AGREGAR.FormAgregarCiudad;
import GUI.AGREGAR.FormAgregarInvestigador;
import GUI.Consultas.Consulta1;
import GUI.Consultas.Consulta2;
import GUI.Consultas.Consulta3;
import GUI.Consultas.Consulta4;
import GUI.Consultas.Consulta5;
import GUI.EEAdjudicacion.FormEEAdjudicacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import GUI.EditarEliminar.Investigador.FormEEInvestigador;
import GUI.EditarEliminar.Postulación.FormEEPostulacion;
import GUI.EditarEliminarAreaInvestigacion.FormEEArea;
import GUI.EditarEliminarArticulo.FormEEArticulo;
import GUI.EditarEliminarCiudad.FormEECiudad;
import GUI.EditarEliminarProyecto.FormEEProyecto;
import GUI.EditarEliminarRegion.FormEERegion;
import GUI.EditarEliminarTipoProyecto.FormEETipoProyecto;

/**
 *
 * @author Felipe
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }
    
    
    // variables para conexión
    public static Connection connection = null;
    public static ResultSet rs=null;
    public static Statement s=null;
    
    public static void Conexion(){
        if(connection != null){
            return;
        }
        
        String url = "jdbc:postgresql://localhost:5432/trabajo3";
        String password = "";
        try{
            Class.forName("org.postgresql.Driver");
            
            connection = DriverManager.getConnection(url, "postgres", password);
            if(connection != null)
            {
                System.out.println("Conectando a base de datos...");
            }
        }
        catch(Exception e)
        {
            System.out.println("Problemas de Conexión");
        }
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        Proyecto = new javax.swing.JMenu();
        agregarInvestigador = new javax.swing.JMenuItem();
        agregarPostulación = new javax.swing.JMenuItem();
        agregarAdjudicación = new javax.swing.JMenuItem();
        agregarArtículos = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        agregaCiudadButton = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        tipoProyectoButton = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        EEadjudicaButton = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        EECiudadButton = new javax.swing.JMenuItem();
        regionButton = new javax.swing.JMenuItem();
        editaAreaButton = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        consultaunoButton = new javax.swing.JMenuItem();
        consulta2Button = new javax.swing.JMenuItem();
        consulta3 = new javax.swing.JMenuItem();
        contasulta4Button = new javax.swing.JMenuItem();
        consulta5Button = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrega 3 - Felipe Jiménez");

        Proyecto.setText("Agregar");

        agregarInvestigador.setText("Investigador asociado a universidad");
        agregarInvestigador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarInvestigadorActionPerformed(evt);
            }
        });
        Proyecto.add(agregarInvestigador);

        agregarPostulación.setText("Postulación");
        agregarPostulación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPostulaciónActionPerformed(evt);
            }
        });
        Proyecto.add(agregarPostulación);

        agregarAdjudicación.setText("Adjudicación");
        agregarAdjudicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAdjudicaciónActionPerformed(evt);
            }
        });
        Proyecto.add(agregarAdjudicación);

        agregarArtículos.setText("Artículos");
        agregarArtículos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarArtículosActionPerformed(evt);
            }
        });
        Proyecto.add(agregarArtículos);

        jMenuItem6.setText("Proyecto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Proyecto.add(jMenuItem6);

        jMenuItem4.setText("Tipo de proyecto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Proyecto.add(jMenuItem4);

        agregaCiudadButton.setText("Ciudad");
        agregaCiudadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaCiudadButtonActionPerformed(evt);
            }
        });
        Proyecto.add(agregaCiudadButton);

        jMenuItem2.setText("Región");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Proyecto.add(jMenuItem2);

        jMenuItem3.setText("Área de investigación");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Proyecto.add(jMenuItem3);

        jMenuBar1.add(Proyecto);

        tipoProyectoButton.setText("Editar o eliminar");

        jMenuItem5.setText("Investigador");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        tipoProyectoButton.add(jMenuItem5);

        jMenuItem7.setText("Postulación");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        tipoProyectoButton.add(jMenuItem7);

        EEadjudicaButton.setText("Adjudicación");
        EEadjudicaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EEadjudicaButtonActionPerformed(evt);
            }
        });
        tipoProyectoButton.add(EEadjudicaButton);

        jMenuItem9.setText("Artículos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        tipoProyectoButton.add(jMenuItem9);

        jMenuItem10.setText("Proyecto");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        tipoProyectoButton.add(jMenuItem10);

        jMenuItem11.setText("TipoProyecto");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        tipoProyectoButton.add(jMenuItem11);

        EECiudadButton.setText("Ciudad");
        EECiudadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EECiudadButtonActionPerformed(evt);
            }
        });
        tipoProyectoButton.add(EECiudadButton);

        regionButton.setText("Región");
        regionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionButtonActionPerformed(evt);
            }
        });
        tipoProyectoButton.add(regionButton);

        editaAreaButton.setText("Área de investigación");
        editaAreaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaAreaButtonActionPerformed(evt);
            }
        });
        tipoProyectoButton.add(editaAreaButton);

        jMenuBar1.add(tipoProyectoButton);

        jMenu4.setText("Consultas");

        consultaunoButton.setText("Consulta 1");
        consultaunoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaunoButtonActionPerformed(evt);
            }
        });
        jMenu4.add(consultaunoButton);

        consulta2Button.setText("Consulta 2");
        consulta2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta2ButtonActionPerformed(evt);
            }
        });
        jMenu4.add(consulta2Button);

        consulta3.setText("Consulta 3");
        consulta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta3ActionPerformed(evt);
            }
        });
        jMenu4.add(consulta3);

        contasulta4Button.setText("Consulta 4");
        contasulta4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contasulta4ButtonActionPerformed(evt);
            }
        });
        jMenu4.add(contasulta4Button);

        consulta5Button.setText("Consulta 5");
        consulta5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta5ButtonActionPerformed(evt);
            }
        });
        jMenu4.add(consulta5Button);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarInvestigadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarInvestigadorActionPerformed
        FormAgregarInvestigador ventanita = FormAgregarInvestigador.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_agregarInvestigadorActionPerformed

    private void agregarArtículosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarArtículosActionPerformed
        FormAgregarArticulo ventanita = FormAgregarArticulo.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_agregarArtículosActionPerformed

    private void agregarPostulaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPostulaciónActionPerformed
        FormAgregarPostulacion ventanita = FormAgregarPostulacion.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_agregarPostulaciónActionPerformed

    private void agregarAdjudicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAdjudicaciónActionPerformed
        FormAgregarAdjudicacion ventanita = FormAgregarAdjudicacion.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_agregarAdjudicaciónActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FormAgregarRegion ventanita = FormAgregarRegion.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FormAgregarTipoProyecto ventanita = FormAgregarTipoProyecto.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FormAgregarProyecto ventanita = FormAgregarProyecto.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FormAgregarAreaDeInvestigacion ventanita = FormAgregarAreaDeInvestigacion.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FormEEInvestigador ventanita = FormEEInvestigador.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        FormEEPostulacion ventanita = FormEEPostulacion.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        FormEEArticulo ventanita = FormEEArticulo.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void EEadjudicaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EEadjudicaButtonActionPerformed
        FormEEAdjudicacion ventanita = FormEEAdjudicacion.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_EEadjudicaButtonActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        FormEEProyecto ventanita = FormEEProyecto.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        FormEETipoProyecto ventanita = FormEETipoProyecto.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void regionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionButtonActionPerformed
        FormEERegion ventanita = FormEERegion.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_regionButtonActionPerformed

    private void agregaCiudadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaCiudadButtonActionPerformed
        FormAgregarCiudad ventanita = FormAgregarCiudad.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_agregaCiudadButtonActionPerformed

    private void EECiudadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EECiudadButtonActionPerformed
        FormEECiudad ventanita = FormEECiudad.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_EECiudadButtonActionPerformed

    private void editaAreaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaAreaButtonActionPerformed
        FormEEArea ventanita = FormEEArea.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_editaAreaButtonActionPerformed

    private void consultaunoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaunoButtonActionPerformed
        Consulta1 ventanita = Consulta1.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_consultaunoButtonActionPerformed

    private void consulta2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta2ButtonActionPerformed
        Consulta2 ventanita = Consulta2.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_consulta2ButtonActionPerformed

    private void consulta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta3ActionPerformed
        Consulta3 ventanita = Consulta3.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_consulta3ActionPerformed

    private void contasulta4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contasulta4ButtonActionPerformed
        Consulta4 ventanita = Consulta4.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_contasulta4ButtonActionPerformed

    private void consulta5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta5ButtonActionPerformed
        Consulta5 ventanita = Consulta5.getInstancia();
        ventanita.setVisible(true);
    }//GEN-LAST:event_consulta5ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EECiudadButton;
    private javax.swing.JMenuItem EEadjudicaButton;
    private javax.swing.JMenu Proyecto;
    private javax.swing.JMenuItem agregaCiudadButton;
    private javax.swing.JMenuItem agregarAdjudicación;
    private javax.swing.JMenuItem agregarArtículos;
    private javax.swing.JMenuItem agregarInvestigador;
    private javax.swing.JMenuItem agregarPostulación;
    private javax.swing.JMenuItem consulta2Button;
    private javax.swing.JMenuItem consulta3;
    private javax.swing.JMenuItem consulta5Button;
    private javax.swing.JMenuItem consultaunoButton;
    private javax.swing.JMenuItem contasulta4Button;
    private javax.swing.JMenuItem editaAreaButton;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem regionButton;
    private javax.swing.JMenu tipoProyectoButton;
    // End of variables declaration//GEN-END:variables
}
