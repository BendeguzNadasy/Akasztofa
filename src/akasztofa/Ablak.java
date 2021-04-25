package akasztofa;

public class Ablak extends javax.swing.JFrame {

    public Ablak() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblKiir = new javax.swing.JLabel();
        lblHibak = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTipp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKorabbiTippek = new javax.swing.JTextField();
        btnMegfejtes = new javax.swing.JButton();
        btnUjSzo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuUjJatek = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuMentes = new javax.swing.JMenuItem();
        mnuBetoltes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        rbKonnyu = new javax.swing.JRadioButtonMenuItem();
        rbNehez = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Akasztófa 1.0");

        jLabel1.setText("Kitalálandó szó:");

        lblKiir.setText("_  _  _  _  _  _  _");

        lblHibak.setText("Hibák száma: 0");

        jLabel2.setText("Tipp:");

        jLabel3.setText("Korábbi tippek:");

        btnMegfejtes.setText("Megfejtés");

        btnUjSzo.setText("Új szó");

        mnuUjJatek.setText("Játék");

        jMenuItem1.setText("Új játék");
        mnuUjJatek.add(jMenuItem1);

        mnuMentes.setText("Mentés");
        mnuUjJatek.add(mnuMentes);

        mnuBetoltes.setText("Betöltés");
        mnuUjJatek.add(mnuBetoltes);

        jMenuBar1.add(mnuUjJatek);

        jMenu2.setText("Nehézség");

        buttonGroup1.add(rbKonnyu);
        rbKonnyu.setSelected(true);
        rbKonnyu.setText("Könnyű");
        jMenu2.add(rbKonnyu);

        buttonGroup1.add(rbNehez);
        rbNehez.setText("Nehéz");
        jMenu2.add(rbNehez);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblKiir)
                            .addComponent(lblHibak))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtKorabbiTippek, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMegfejtes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUjSzo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtTipp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKiir)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHibak)
                    .addComponent(txtKorabbiTippek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMegfejtes)
                    .addComponent(btnUjSzo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ablak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ablak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegfejtes;
    private javax.swing.JButton btnUjSzo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblHibak;
    private javax.swing.JLabel lblKiir;
    private javax.swing.JMenuItem mnuBetoltes;
    private javax.swing.JMenuItem mnuMentes;
    private javax.swing.JMenu mnuUjJatek;
    private javax.swing.JRadioButtonMenuItem rbKonnyu;
    private javax.swing.JRadioButtonMenuItem rbNehez;
    private javax.swing.JTextField txtKorabbiTippek;
    private javax.swing.JTextField txtTipp;
    // End of variables declaration//GEN-END:variables
}
