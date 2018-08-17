/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcos2103.Panel;

import java.awt.Font;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lymven
 */
public class Panel3 extends javax.swing.JPanel {

    // Should Make it OBJECT[] Array, but this is for an example
    int index = 0;

    // Arrays of Sample Data
    String[] data1 = {"92374-58-10-7", "99921-58-10-7", "12994-58-10-7"};
    String[] data2 = {"Qatar", "Singapore", "Greece"};
    String[] data3 = {"NCCAH", "World Scientific", "Sigma Publications"};
    int[] data4 = {10, 5, 2};
    Float[] data5 = {1200.00f, 1500.00f, 700.00f};

    String[] isbn = new String[10];
    String[] book_name = new String[10];
    String[] author = new String[10];
    int among[] = new int[10];
    Float price[] = new Float[10];

    void Insert(int K) {
        int J = index - 1;
        while (J >= K) {
            isbn[J + 1] = isbn[J];
            book_name[J + 1] = book_name[J];
            author[J + 1] = author[J];
            among[J + 1] = among[J];
            price[J + 1] = price[J];
            J--;
        }
        isbn[K] = jTextField1.getText();
        book_name[K] = jTextField2.getText();
        author[K] = jTextField3.getText();
        among[K] = Integer.parseInt(jTextField4.getText());
        price[K] = Float.parseFloat(jTextField5.getText());
        index = K;
        index++;
    }

    void Delete(int K) {
        if (K + 1 > index) {
            System.out.println("ไม่มีข้อมูลที่ตำแหน่งนั้น");
        } else {
            for (int J = K; J < index - 1; J++) {
                isbn[J] = isbn[J + 1];
                book_name[J] = book_name[J + 1];
                author[J] = author[J + 1];
                among[J] = among[J + 1];
                price[J] = price[J + 1];
            }
            index--;
            // Last Index (Data Still Exist)
            // Delete 
            isbn[index] = null;
            book_name[index] = null;
            author[index] = null;
            among[index] = 0;
            price[index] = null;
        }
    }

    void UpdateTable() {

        // Array Traversal
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Clear Row
        model.setRowCount(0);
        for (int i = 0; i < 10; i++) {
            model.addRow(new Object[]{isbn[i], book_name[i], author[i], among[i], price[i]});
        }
    }

    /**
     * Creates new form Panel3
     */
    public Panel3() {

        initComponents();
        jTable1.getTableHeader().setFont(new Font("TH Sarabun New", Font.BOLD, 18));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 360, -1));

        jTextField2.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 360, -1));

        jTextField3.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 360, -1));

        jTextField4.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 360, -1));

        jTextField5.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 360, -1));

        jButton1.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton1.setText("เพิ่มข้อมูลใน Array");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jButton2.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton2.setText("แทรก");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, -1, 30));

        jButton3.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton3.setText("ลบ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 60, 30));

        jTable1.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "ชื่อหนังสือ", "ชื่อผู้แต่ง", "จำนวนเล่ม", "ราคา"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 1020, 210));

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ISBN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ชื่อหนังสือ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ชื่อผู้แต่ง");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("จำนวนเล่ม");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ราคา");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jTextField6.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 220, 30));

        jLabel6.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("พบในตำแหน่งที่ :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, -1));

        jButton5.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton5.setText("เพิ่มข้อมูลตัวอย่าง");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, -1, -1));

        jComboBox1.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ISBN", "ชื่อหนังสือ", "ชื่อผู้แต่ง" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 90, 30));

        jLabel7.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ตำแหน่งที่ต้องการแทรก/ลบ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jTextField7.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 260, 30));

        jButton4.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton4.setText("ค้นหา");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ค้นหาด้วย");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ไม่พบ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Delete(Integer.parseInt(jTextField6.getText()));
        UpdateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Should Make Null Detection, Type Detection
        isbn[index] = jTextField1.getText();
        book_name[index] = jTextField2.getText();
        author[index] = jTextField3.getText();
        among[index] = Integer.parseInt(jTextField4.getText());
        price[index] = Float.parseFloat(jTextField5.getText());
        index++;
        UpdateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        // copy data to array and display to table
        for (int i = 0; i < data1.length; i++) {
            isbn[i] = data1[i];
        }
        for (int i = 0; i < data2.length; i++) {
            book_name[i] = data2[i];
        }
        for (int i = 0; i < data3.length; i++) {
            author[i] = data3[i];
        }
        for (int i = 0; i < data4.length; i++) {
            among[i] = data4[i];
        }
        for (int i = 0; i < data5.length; i++) {
            price[i] = data5[i];
        }
        index = 3;
        UpdateTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Insert(Integer.parseInt(jTextField6.getText()));
        UpdateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String searchItem = jTextField7.getText();

        String Result = "ไม่พบ";
        switch (jComboBox1.getSelectedIndex()) {
            case 0:
                for (int i = 0; i < 10; i++) {
                    if (searchItem.equals(isbn[i])) {
                        Result = String.valueOf(i);
                        break;
                    }
                }
                break;
            case 1:
                for (int i = 0; i < 10; i++) {
                    if (searchItem.equals(book_name[i])) {
                        Result = String.valueOf(i);
                        break;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < 10; i++) {
                    if (searchItem.equals(author[i])) {
                        Result = String.valueOf(i);
                        break;
                    }
                }
                break;
        }
        
        jLabel9.setText(String.valueOf(Result));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
