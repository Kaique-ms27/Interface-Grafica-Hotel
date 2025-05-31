/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hotel.elysian.grove;

/**
 *
 * @author 25170620
 */
public class Loading extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        for(int i=1; i<=100; i++){
            try{
                Thread.sleep(20);
            }catch(Exception e){
                e.printStackTrace();
            }
            lbl_count.setText(i+"%");
            progressbar.setValue(i);
        }
        dispose();
        new Menu().setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_count = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(42, 79, 61));
        jPanel1.setLayout(null);
        jPanel1.add(lbl_count);
        lbl_count.setBounds(460, 510, 50, 30);
        jPanel1.add(progressbar);
        progressbar.setBounds(330, 510, 300, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(212, 175, 55));
        jLabel2.setText("Hotel Elysian Grove - Beatus Ille");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 0, 560, 48);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(139, 107, 77));
        jLabel7.setText("Onde o luxo encontra a paz da natureza.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 50, 360, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\GitHub\\Interface-Grafica-Hotel\\Hotel-Elysian-Grove\\src\\main\\java\\com\\mycompany\\hotel\\elysian\\grove\\images\\loading-gif.gif")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 70, 500, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_count;
    private javax.swing.JProgressBar progressbar;
    // End of variables declaration//GEN-END:variables
}
