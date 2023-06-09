

package VISTA;

import MODELO.vendedores;
import MODELO.vendedoresDAORelacional;
import MODELO.vendedores_new;
import VISTA.ModuloVentas;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author NELSON
 */
public class POS extends javax.swing.JFrame {

    int contador = 3;
    /**
     * Creates new form POS
     */
    public POS() {
        initComponents();
        funciones();
    }
    
    public void funciones(){
        
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_contrasenia = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        pswContrasenia = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        p1.setBackground(new java.awt.Color(204, 255, 255));

        lbl_codigo.setText("Código:");

        lbl_contrasenia.setText("Contraseña:");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btn_login.setText("Iniciar Sesión");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("POS");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_contrasenia)
                    .addComponent(lbl_codigo))
                .addGap(38, 38, 38)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pswContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(149, 149, 149))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contrasenia)
                    .addComponent(pswContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btn_login)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if (contador > 0) {
            login();
        } else {
            JOptionPane.showMessageDialog(null, "No tienes oportunidades");
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private LinkedList<vendedores_new> listaVendedores = new LinkedList<vendedores_new>();

    
//    public void cargar(){
//        try {
//            FileInputStream fileIn = new FileInputStream("vendedores.dat");
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            
//            //tomamos la lista ya creada
//            listaVendedores = (LinkedList<vendedores>) in.readObject();
//            in.close();
//            fileIn.close();
//            System.out.println("La lista se ha deserializado correctamente");
//           
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    
    public void cargar(){
    try {
        
    vendedoresDAORelacional vd = new vendedoresDAORelacional();
    // Obtener la lista de vendedores desde la base de datos
        listaVendedores = vd.listar_new();

        System.out.println("La lista se ha cargado correctamente desde la base de datos");

    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
//    public void login() {
//    cargar(); // Cargar la lista de vendedores desde el archivo
//    
//    if (txtCodigo.getText().equals("admin") && pswContrasenia.getText().equals("admin")) {
//        Modulos ad = new Modulos();
//        ad.cambioVendedor(true);
//        dispose();
//    } else if 
//            (
//            //condicion para validar si el vendedor esta en mi lista de vendedores SQL
//            ){
//         ModuloVentas ad2 = new ModuloVentas();
//         ad2.cambioModuloVentas(false);
//    }
//    }

    public static String nombreVendedor;
    
    public void login() {
    cargar(); // Cargar la lista de vendedores desde el archivo

    String codigoVendedor = txtCodigo.getText();
    String contrasenia = pswContrasenia.getText();

    if (codigoVendedor.equals("admin") && contrasenia.equals("admin")) {
        Modulos ad = new Modulos();
        ad.cambioVendedor(true);
        dispose();
    } else {
        vendedoresDAORelacional vd = new vendedoresDAORelacional();
        LinkedList<vendedores_new> vendedores = vd.listar_new();

        boolean vendedorEncontrado = false;
        for (vendedores_new vendedor : vendedores) {
            if (vendedor.getCodigo() == Integer.parseInt(codigoVendedor) && vendedor.getContrasenia().equals(contrasenia)) {
                vendedorEncontrado = true;
                
                 nombreVendedor = vendedor.getNombre();
                break;
            }
        }

        if (vendedorEncontrado) {
            ModuloVentas ad2 = new ModuloVentas();
            ad2.cambioModuloVentas(false);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Código de vendedor o contraseña incorrectos");
        }
    }
    
}


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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_contrasenia;
    private javax.swing.JPanel p1;
    private javax.swing.JPasswordField pswContrasenia;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
