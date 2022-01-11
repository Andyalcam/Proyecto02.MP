package esteganografia;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;


public class VentanaEncriptar extends javax.swing.JFrame {
    
    private String direccionArchivoDeTexto, direccionImagen;
    

    /** Creates new form VentanaCifrar */
    public VentanaEncriptar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ruta1 = new javax.swing.JTextField();
        abrir1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ruta = new javax.swing.JTextField();
        abrir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encriptar");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2")));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Encriptar");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, javax.swing.UIManager.getDefaults().getColor("Button.darcula.color2")));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jPanel5.setBackground(new java.awt.Color(32, 39, 50));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        ruta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruta1ActionPerformed(evt);
            }
        });

        abrir1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        abrir1.setText("Abrir");
        abrir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ruta1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(abrir1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrir1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 520, 50));

        jPanel4.setBackground(new java.awt.Color(32, 39, 50));

        jLabel5.setBackground(new java.awt.Color(32, 39, 50));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Busca la imagen que se va a encriptar:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

        jPanel3.setBackground(new java.awt.Color(32, 39, 50));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaActionPerformed(evt);
            }
        });

        abrir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        abrir.setText("Abrir");
        abrir.setAutoscrolls(true);
        abrir.setHideActionText(true);
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(abrir)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 520, 50));

        jPanel1.setBackground(new java.awt.Color(32, 39, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Busca el archivo de texto que se ocultará:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        JFileChooser jf = new JFileChooser(Prueba.path + "/Desktop");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt","txt");
        jf.setFileFilter(filtro);
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if(archivo != null){
            ruta.setText(archivo.getAbsolutePath());
            direccionArchivoDeTexto = ruta.getText();   
        }
    }//GEN-LAST:event_abrirActionPerformed

    private void ruta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruta1ActionPerformed

    private void abrir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir1ActionPerformed
        JFileChooser jf = new JFileChooser(Prueba.path + "/Desktop");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("image files","png","jpg");
        jf.setFileFilter(filtro);
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if(archivo != null){
            ruta1.setText(archivo.getAbsolutePath());
            direccionImagen = ruta1.getText();  
        }
    }//GEN-LAST:event_abrir1ActionPerformed

    /*public static String nameFile(String direccionImagen){
            String direccionTxt = "";
            String[] path = direccionImagen.split("\\\\");
            String[] nameFile = path[path.length-1].split("\\.");
            String aux = nameFile[0] + "Encriptado.png"; 
            path[path.length-1] = aux;
            for(String auxPath : path){
                direccionTxt += auxPath + "/";
            }
            direccionTxt = direccionTxt.substring(0, direccionTxt.length()-1);
            return direccionTxt;
    }*/
    
    private void validacion(String txt, String image) {
        String[] path = txt.split("\\\\");
        String[] nameFile = path[path.length-1].split("\\.");
        if(!nameFile[1].equals("txt"))
            throw new IllegalArgumentException();
        
        path = image.split("\\\\");
        nameFile = path[path.length-1].split("\\.");
        if(!nameFile[1].equals("jpg"))
            throw new IllegalArgumentException();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Prueba a = new Prueba();
        boolean estado = false;
        try {
            validacion(direccionArchivoDeTexto,direccionImagen);
            a.encriptacion(direccionArchivoDeTexto,direccionImagen);
            estado = true;
            if(estado == true){
                JOptionPane.showMessageDialog(null, "Operación realizada correctamente, la imagen se guardó en la misma carpeta que tu imagen ingresada");
                int option = JOptionPane.showOptionDialog(null, "Desea hacer otra operacion", "¿Desea Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"SI","NO"}, EXIT_ON_CLOSE);
                if(option == 0){
                    VentanaPrincipal newFrame = new VentanaPrincipal();
                    newFrame.setVisible(true);
                    this.dispose();
                }else{
                    System.exit(0);
                }
            }
        } catch (NullPointerException ex) {
            Logger.getLogger(VentanaEncriptar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Los datos introducidos son incorrectos", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        } catch (IllegalArgumentException e){
            Logger.getLogger(VentanaEncriptar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Verifica que el texto sea extensión .txt o la imagen sea .jpg", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }catch (Exception ex) {
            Logger.getLogger(VentanaEncriptar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            VentanaEncriptar newFrame = new VentanaEncriptar();
            newFrame.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaPrincipal newFrame = new VentanaPrincipal();
        newFrame.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(VentanaEncriptar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEncriptar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEncriptar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEncriptar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VentanaEncriptar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(VentanaEncriptar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(VentanaEncriptar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VentanaEncriptar.class.getName()).log(Level.SEVERE, null, ex);
                }
                new VentanaEncriptar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrir;
    private javax.swing.JButton abrir1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField ruta;
    private javax.swing.JTextField ruta1;
    // End of variables declaration//GEN-END:variables

    

}
