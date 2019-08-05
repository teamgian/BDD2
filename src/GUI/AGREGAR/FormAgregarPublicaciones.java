/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.AGREGAR;
import Clases.Item;
import GUI.MenuPrincipal;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
/**
 *
 * @author Felipe
 */
public class FormAgregarPublicaciones extends javax.swing.JFrame {

    static FormAgregarPublicaciones instancia;
    String codigoarticulo;
    /**
     * Creates new form FormAgregarAutores
     */
    public FormAgregarPublicaciones(String codigoarticulo) {
        initComponents();
        this.codigoarticulo = codigoarticulo;
    }
    
    public static FormAgregarPublicaciones getInstancia(String codigoarticulo) {
        if(instancia == null)
        {
            instancia = new FormAgregarPublicaciones(codigoarticulo);
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
        revistaBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloRevista = new DefaultListModel();
        listaRevista = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        agregarRevistaButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        conferenciaBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        agregarConferenciaButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        modeloConferencia = new DefaultListModel();
        listaConferencia = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        paginaInicioRevistaText = new javax.swing.JTextField();
        paginaFinRevistaText = new javax.swing.JTextField();
        volumenRevistaText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        paginaInicioConferenciaText = new javax.swing.JTextField();
        paginaFinConferenciaText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Publicaciones del artículo en revistas y conferencias");

        jLabel2.setText("Revista");

        listaRevista.setModel(modeloRevista);
        jScrollPane1.setViewportView(listaRevista);

        jLabel3.setText("Revista en que se publicó:");

        agregarRevistaButton.setText("AGREGAR REVISTA");
        agregarRevistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarRevistaButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Conferencia");

        jLabel5.setText("Conferencias en que se presentó");

        agregarConferenciaButton.setText("AGREGAR CONFERENCIA");
        agregarConferenciaButton.setMaximumSize(new java.awt.Dimension(113, 25));
        agregarConferenciaButton.setMinimumSize(new java.awt.Dimension(113, 25));
        agregarConferenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarConferenciaButtonActionPerformed(evt);
            }
        });

        listaConferencia.setModel(modeloConferencia);
        jScrollPane2.setViewportView(listaConferencia);

        jLabel6.setText("Página de inicio:");

        jLabel7.setText("Página de fin:");

        jLabel8.setText("Volumen revista:");

        paginaInicioRevistaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaInicioRevistaTextActionPerformed(evt);
            }
        });

        jLabel9.setText("Página inicio:");

        jLabel10.setText("Página fin:");

        paginaInicioConferenciaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaInicioConferenciaTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(volumenRevistaText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(paginaFinRevistaText)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(revistaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paginaInicioRevistaText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)
                        .addComponent(agregarRevistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(agregarConferenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conferenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(paginaFinConferenciaText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(paginaInicioConferenciaText)))
                        .addGap(134, 134, 134))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(541, 541, 541)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(139, 139, 139)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(342, 342, 342)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(167, 228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(revistaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(conferenciaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(paginaInicioRevistaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(paginaInicioConferenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paginaFinRevistaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(paginaFinConferenciaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(volumenRevistaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarRevistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarConferenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
        try{
            
            MenuPrincipal.Conexion();  
            Statement s = MenuPrincipal.connection.createStatement();
            
            // AGREGA OPCIONES AL COMBOBOX DE REVISTA
            ResultSet resultRevista = s.executeQuery("SELECT nombrerevista, codigorevista FROM REVISTA");
            while(resultRevista.next())
            {
                revistaBox.addItem(new Item(resultRevista.getString("codigorevista"), resultRevista.getString("nombrerevista")));
            }   
            
            // AGREGA OPCIONES AL COMBOBOX DE CONFERENCIA
            ResultSet resultConferencia = s.executeQuery("SELECT codigoconferencia, nombre FROM CONFERENCIA");
            while(resultConferencia.next())
            {
                conferenciaBox.addItem(new Item(resultConferencia.getString("codigoconferencia"), resultConferencia.getString("nombre")));
            }
  
        }
        catch(Exception e){
                    JOptionPane.showMessageDialog(this, e.getMessage());    
        }
       
    }//GEN-LAST:event_formWindowActivated

    private void agregarRevistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarRevistaButtonActionPerformed
        
        try{
            String codigorevista = ((Item)revistaBox.getSelectedItem()).getIdString();
            String nombrerevista = ((Item)revistaBox.getSelectedItem()).getName();
            String paginainicio = paginaInicioRevistaText.getText();
            String paginafin = paginaFinRevistaText.getText();
            String volumenrevista = volumenRevistaText.getText();
            
         Statement s = MenuPrincipal.connection.createStatement();
            
            int z = s.executeUpdate("INSERT INTO publicaenrevista(codigorevista, codigoarticulo, paginainicio, paginafin, volumenrevista)"
                    +"values ("
            +codigorevista+", "+this.codigoarticulo+", "+paginainicio+", "+paginafin+", "+volumenrevista+")");
            
            if(z==1){ 
                modeloRevista.addElement(nombrerevista);
                JOptionPane.showMessageDialog(this, "Se agregó publicación en revista exitosamente");  }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
    }//GEN-LAST:event_agregarRevistaButtonActionPerformed

    private void paginaInicioRevistaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaInicioRevistaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paginaInicioRevistaTextActionPerformed

    private void paginaInicioConferenciaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaInicioConferenciaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paginaInicioConferenciaTextActionPerformed

    private void agregarConferenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarConferenciaButtonActionPerformed
        try{
            String codigoconferencia = ((Item)conferenciaBox.getSelectedItem()).getIdString();
            String nombre = ((Item)conferenciaBox.getSelectedItem()).getName();
            String paginainicioC = paginaInicioConferenciaText.getText();
            String paginafinC = paginaFinConferenciaText.getText();
            
            
         Statement s = MenuPrincipal.connection.createStatement();
            
            int z = s.executeUpdate("INSERT INTO PUBLICACONFERENCIA(codigoconferencia, codigoarticulo, paginainicio, paginafin)"
                    +"values ("
            +codigoconferencia+", "+this.codigoarticulo+", "+paginainicioC+", "+paginafinC+")");
            
            if(z==1){ 
                modeloConferencia.addElement(nombre);
                JOptionPane.showMessageDialog(this, "Se agregó publicación en conferencia exitosamente");  }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_agregarConferenciaButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(this, "Listo!");
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormAgregarPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAgregarPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAgregarPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAgregarPublicaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarConferenciaButton;
    private javax.swing.JButton agregarRevistaButton;
    private javax.swing.JComboBox<Item> conferenciaBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaConferencia;
    private DefaultListModel modeloConferencia;
    private javax.swing.JList<String> listaRevista;
    private DefaultListModel modeloRevista;
    private javax.swing.JTextField paginaFinConferenciaText;
    private javax.swing.JTextField paginaFinRevistaText;
    private javax.swing.JTextField paginaInicioConferenciaText;
    private javax.swing.JTextField paginaInicioRevistaText;
    private javax.swing.JComboBox<Item> revistaBox;
    private javax.swing.JTextField volumenRevistaText;
    // End of variables declaration//GEN-END:variables
}
