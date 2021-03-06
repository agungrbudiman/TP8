/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agungrb
 */
public class ViewMenuPenyewaan extends javax.swing.JFrame implements View {

    /**
     * Creates new form ViewMenuPenyewaan
     */
    public ViewMenuPenyewaan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radio6jam = new javax.swing.JRadioButton();
        radio12jam = new javax.swing.JRadioButton();
        radio24jam = new javax.swing.JRadioButton();
        radio1minggu = new javax.swing.JRadioButton();
        btnSewa = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMobil = new javax.swing.JTable();

        buttonGroup1.add(radio6jam);
        buttonGroup1.add(radio12jam);
        buttonGroup1.add(radio24jam);
        buttonGroup1.add(radio1minggu);
        radio6jam.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu Penyewaan");

        jLabel2.setText("Pilih Mobil");

        jLabel3.setText("Lama Waktu Penyewaan");

        radio6jam.setText("6 jam");
        radio6jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio6jamActionPerformed(evt);
            }
        });

        radio12jam.setText("12 jam");
        radio12jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio12jamActionPerformed(evt);
            }
        });

        radio24jam.setText("24 jam");

        radio1minggu.setText("1 minggu");

        btnSewa.setText("Sewa");

        btnKembali.setText("Kembali");

        tabelMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Kategori", "Jml.Kursi", "Hrg.Sewa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelMobil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKembali))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio6jam)
                                    .addComponent(radio12jam)
                                    .addComponent(radio24jam)
                                    .addComponent(radio1minggu)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(radio6jam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio12jam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio24jam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio1minggu)
                        .addGap(18, 18, 18)
                        .addComponent(btnSewa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btnKembali))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio12jamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio12jamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio12jamActionPerformed

    private void radio6jamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio6jamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio6jamActionPerformed

    public JButton getBtnKembali() {
        return btnKembali;
    }

    public JButton getBtnSewa() {
        return btnSewa;
    }

    /**
     * @param args the command line arguments
     */
    
     
    public int getLamaSewa() {
        if(radio6jam.isSelected()) {
            return 6;
        }
        else if(radio12jam.isSelected()) {
            return 12;
        }
        else if(radio24jam.isSelected()) {
            return 24;
        }
        else {
            return 1;
        }
    }
    
    public void showMobil(String nama, String kategori, int kursi, long sewa,int i) {
        tabelMobil.getModel().setValueAt(nama, i, 0);
        tabelMobil.getModel().setValueAt(kategori, i, 1);
        tabelMobil.getModel().setValueAt(kursi, i, 2);
        tabelMobil.getModel().setValueAt(sewa, i, 3);
        tabelMobil.changeSelection(0, 0, false, false);
    }
    
    public int getMobil() {
        return tabelMobil.getSelectedRow();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSewa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radio12jam;
    private javax.swing.JRadioButton radio1minggu;
    private javax.swing.JRadioButton radio24jam;
    private javax.swing.JRadioButton radio6jam;
    private javax.swing.JTable tabelMobil;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addListener(ActionListener e) {
        btnKembali.addActionListener(e);
        btnSewa.addActionListener(e);
    }
}
