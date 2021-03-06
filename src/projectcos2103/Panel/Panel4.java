/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcos2103.Panel;

/**
 *
 * @author Lymven
 */
public class Panel4 extends javax.swing.JPanel {

    final int size = 10;
    // Stack1
    int TOP1 = -1, MAXSTK1 = size - 1, STACK1[] = new int[size], ITEM1;
    // Stack2
    int TOP2 = -1, MAXSTK2 = size - 1, STACK2[] = new int[size], ITEM2;

    // Stack 1 Operation
    public void PUSH1(int item) {
        if (TOP1 == MAXSTK1) {
            System.out.println("OVERFLOW");
        } else {
            TOP1++;
            STACK1[TOP1] = item;
        }

        System.out.println("PUSH :" + item + "  OK.");
    }

    public void POP1() {
        if (TOP1 == -1) {
            System.out.println("UNDERFLOW");
        } else {
            ITEM1 = STACK1[TOP1];
            TOP1--;
        }
        System.out.println("Pop Data: " + ITEM1);

    }

    // Stack 2 Operation
    public void PUSH2(int item) {
        if (TOP2 == MAXSTK2) {
            System.out.println("OVERFLOW");
        } else {
            TOP2++;
            STACK2[TOP2] = item;
        }

        System.out.println("PUSH :" + item + "  OK.");
    }

    public void POP2() {
        if (TOP2 == -1) {
            System.out.println("UNDERFLOW");
        } else {
            ITEM2 = STACK2[TOP2];
            TOP2--;
        }
        System.out.println("Pop Data: " + ITEM2);

    }

    // Reverse all
    public void PopAllStack1toStack2() {

        while (TOP1 > -1) {
            PopStack1toStack2();
        }
    }

    public void PopAllStack2toStack1() {

        while (TOP2 > -1) {
            PopStack2toStack1();
        }
    }

    // Pop Stack 1 to Stack 2
    public void PopStack1toStack2() {

        if (TOP1 == -1) {
            System.out.println("UnderFlow");
        } else {
            POP1();
            PUSH2(ITEM1);
        }
    }

    // Pop Stack 2 to Stack 1
    public void PopStack2toStack1() {

        if (TOP2 == -1) {

            System.out.println("UnderFlow");
        } else {
            POP2();
            PUSH1(ITEM2);
        }
    }

    public void showDatainStack() {
        jTextArea1.setText("");

        System.out.print("Stack1:");
        for (int i = 0; i <= TOP1; i++) {
            System.out.print(STACK1[i] + ",");
            jTextArea1.setText(jTextArea1.getText() + "\n" + STACK1[i]);
        }

        jTextArea2.setText("");
        System.out.print("Stack2:");
        for (int i = 0; i <= TOP2; i++) {
            System.out.print(STACK2[i] + ",");
            jTextArea2.setText(jTextArea2.getText() + "\n" + STACK2[i]);
        }
    }

    /**
     * Creates new form Panel4
     */
    public Panel4() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Push ข้อมูลเข้าสแตก 1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jTextField1.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 198, -1));

        jButton1.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton1.setText("PUSH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 30));

        jButton2.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton2.setText("PUSH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, 30));

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pop ข้อมูลสแตก 1 ออก :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jButton3.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton3.setText("POP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 60, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 310));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 260, 310));

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Push ข้อมูลเข้าสแตก 2");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jTextField3.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 198, -1));

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pop ข้อมูลสแตก 2 ออก :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 60, -1));

        jButton4.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton4.setText("POP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 60, 30));

        jButton5.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton5.setText("POP สแตก1 ไป สแตก2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 160, -1));

        jButton6.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton6.setText("POP สแตก2 ไป สแตก1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, -1, -1));

        jButton7.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton7.setText(">>");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        jButton8.setFont(new java.awt.Font("TH Sarabun New", 1, 18)); // NOI18N
        jButton8.setText("<<");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(jTextField1.getText());
        PUSH1(value);
        System.out.println("TOP : " + TOP1);
        showDatainStack();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(jTextField3.getText());
        PUSH2(value);
        System.out.println("TOP : " + TOP2);
        showDatainStack();
        jTextField3.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        POP1();
        jTextField2.setText(String.valueOf(ITEM1));
        showDatainStack();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        POP2();
        jTextField4.setText(String.valueOf(ITEM2));
        showDatainStack();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        PopStack1toStack2();
        showDatainStack();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        PopStack2toStack1();
        showDatainStack();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here
        PopAllStack1toStack2();
        showDatainStack();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        PopAllStack2toStack1();
        showDatainStack();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
