package akasztofa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ablak extends javax.swing.JFrame {
    private Jatekos jatekos;
    private ArrayList<String> szavak;
    private String tippelendo;
    private int hdb;
    String[] allapot;

    public Ablak() {
        initComponents();
        btnOk.setEnabled(false);
        jatekos = new Jatekos();
        szavak = new ArrayList<>();
        hdb = 0;
        listaFeltolt();
        szotGeneral();
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
        btnOk = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuJatek = new javax.swing.JMenu();
        mnuUjJatek = new javax.swing.JMenuItem();
        mnuMentes = new javax.swing.JMenuItem();
        mnuBetoltes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        rbKonnyu = new javax.swing.JRadioButtonMenuItem();
        rbNehez = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Akasztófa 1.0");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Kitalálandó szó:");

        lblKiir.setText("_  _  _  _  _  _  _");

        lblHibak.setText("Hibák száma: 0");

        jLabel2.setText("Tipp:");

        txtTipp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTippKeyPressed(evt);
            }
        });

        jLabel3.setText("Korábbi tippek:");

        btnMegfejtes.setText("Megfejtés");
        btnMegfejtes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegfejtesActionPerformed(evt);
            }
        });

        btnUjSzo.setText("Új szó");
        btnUjSzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUjSzoActionPerformed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        mnuJatek.setText("Játék");

        mnuUjJatek.setText("Új játék");
        mnuUjJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUjJatekActionPerformed(evt);
            }
        });
        mnuJatek.add(mnuUjJatek);

        mnuMentes.setText("Mentés");
        mnuMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMentesActionPerformed(evt);
            }
        });
        mnuJatek.add(mnuMentes);

        mnuBetoltes.setText("Betöltés");
        mnuBetoltes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBetoltesActionPerformed(evt);
            }
        });
        mnuJatek.add(mnuBetoltes);

        jMenuBar1.add(mnuJatek);

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
                            .addComponent(txtKorabbiTippek)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTipp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 69, Short.MAX_VALUE))))
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
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtTipp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
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

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        String tipp = txtTipp.getText();
        //System.out.println(tipp);
        int ertek = (int)tipp.charAt(0);
        txtTipp.setText("");
        //System.out.println("ertek:" + ertek);
        
        if (tipp.length() == 1 && (65 <= ertek && ertek <= 122)) {
            System.out.println("nincs hiba");
            jatekos.addTipp(tipp);
            txtKorabbiTippek.setText(jatekos.getTippeltBetuk().toString());
            betuEllenoriz(tipp);
        }
        else {
            System.out.println("hiba");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnMegfejtesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegfejtesActionPerformed
        JOptionPane.showMessageDialog(this, "A megfejtés: " + tippelendo, "MEGFEJTÉS", JOptionPane.INFORMATION_MESSAGE);
        ujJatek();
    }//GEN-LAST:event_btnMegfejtesActionPerformed

    private void mnuUjJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUjJatekActionPerformed
        ujJatek();
    }//GEN-LAST:event_mnuUjJatekActionPerformed

    private void btnUjSzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUjSzoActionPerformed
        ujJatek();
    }//GEN-LAST:event_btnUjSzoActionPerformed

    private void txtTippKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTippKeyPressed
        btnOk.setEnabled(true);
    }//GEN-LAST:event_txtTippKeyPressed

    private void mnuMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMentesActionPerformed
        try {
            jatekos.setHdb(hdb);
            FileOutputStream fi = new FileOutputStream("akasztofa.bin");
            ObjectOutput obment = new ObjectOutputStream(fi);
            obment.writeObject(jatekos);
            obment.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ablak.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ablak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuMentesActionPerformed

    private void mnuBetoltesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBetoltesActionPerformed
        try {
            FileInputStream fi = new FileInputStream("akasztofa.bin");
            ObjectInputStream ob = new ObjectInputStream(fi);
            jatekos = (Jatekos)ob.readObject();
            ob.close();
            txtKorabbiTippek.setText(jatekos.getTippeltBetuk().toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ablak.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Ablak.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuBetoltesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int gomb = JOptionPane.showConfirmDialog(this, "Biztos kilép?", "KILÉPÉS", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (gomb == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnUjSzo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblHibak;
    private javax.swing.JLabel lblKiir;
    private javax.swing.JMenuItem mnuBetoltes;
    private javax.swing.JMenu mnuJatek;
    private javax.swing.JMenuItem mnuMentes;
    private javax.swing.JMenuItem mnuUjJatek;
    private javax.swing.JRadioButtonMenuItem rbKonnyu;
    private javax.swing.JRadioButtonMenuItem rbNehez;
    private javax.swing.JTextField txtKorabbiTippek;
    private javax.swing.JTextField txtTipp;
    // End of variables declaration//GEN-END:variables

    private void listaFeltolt() {
        szavak.add("alma");
        szavak.add("eper");
        szavak.add("iskola");
        szavak.add("kutya");
        szavak.add("macska");
        szavak.add("csirke");
        szavak.add("marha");
        szavak.add("laptop");
        szavak.add("telefon");
        szavak.add("fon");
    }

    private void szotGeneral() {
        int N = szavak.size();

        int rnd = (int) (Math.random() * N);
        System.out.println(rnd);

        tippelendo = szavak.get(rnd);
        System.out.println(tippelendo);
        
        int M = tippelendo.length();
        System.out.println(M);
        allapot = new String[M];
        String kiir = "";
        for (int i = 0; i < M; i++) {
            kiir += "_ "; 
        }
        lblKiir.setText(kiir);
    }

    private void betuEllenoriz(String tipp) {
        int M = allapot.length;
        boolean szobanVan = false;
        for (int i = 0; i < M; i++) {
            String c = tippelendo.charAt(i) + "";
            if (c.equals(tipp)) {
                allapot[i] = tipp;
                szobanVan = true;
            }
        }
        if (!szobanVan) {
            lblHibak.setText("Hibák száma: " + ++hdb);
        }
        String kiir = "";
        for (int i = 0; i < M; i++) {
            if (allapot[i] != null) {
                kiir += allapot[i] + " "; 
            }
            else {
                kiir += "_ ";
            }
        }

        lblKiir.setText(kiir);
    }

    private void ujJatek() {
        jatekos.listaUrit();
        szotGeneral();
        hdb = 0;
        lblHibak.setText("Hibák száma: 0");
        txtKorabbiTippek.setText("");
    }


}
