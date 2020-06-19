/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.StudentRecordController;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Fikri
 */
public class FromStudentRecord extends javax.swing.JFrame {

    /**
     * Creates new form FromStudentRecord
     */
    StudentRecordController controller;
    public FromStudentRecord() {
        initComponents();
        controller = new StudentRecordController(this);
        controller.bersihFrom();
    }

    public JTextField getTxtAddress() {
        return txtAddress;
    }

    public JTextField getTxtAge() {
        return txtAge;
    }

    public JTextField getTxtEnglishGrade() {
        return txtEnglishGrade;
    }

    public JTextField getTxtMathGrade() {
        return txtMathGrade;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JTextField getTxtScienceGrade() {
        return txtScienceGrade;
    }

    public JTable getTableStudentRecord() {
        return TableStudentRecord;
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        studentRecord1 = new Model.StudentRecord();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMathGrade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        txtEnglishGrade = new javax.swing.JTextField();
        txtScienceGrade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableStudentRecord = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnedit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 180, 110, 50);

        txtName.setText("jTextField1");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(190, 170, 190, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 250, 60, 50);

        txtAddress.setText("jTextField2");
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress);
        txtAddress.setBounds(190, 250, 190, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Umur");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 310, 50, 40);

        txtAge.setText("jTextField3");
        getContentPane().add(txtAge);
        txtAge.setBounds(190, 310, 190, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Matematika");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 390, 80, 17);

        txtMathGrade.setText("jTextField4");
        txtMathGrade.setToolTipText("");
        getContentPane().add(txtMathGrade);
        txtMathGrade.setBounds(190, 380, 190, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Bahasa Inggris");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 440, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Pengetahuan Alam");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 490, 120, 40);

        btnInsert.setText("Insert");
        btnInsert.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnInsertAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                btnInsertAncestorRemoved(evt);
            }
        });
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(50, 570, 100, 30);

        txtEnglishGrade.setText("jTextField5");
        getContentPane().add(txtEnglishGrade);
        txtEnglishGrade.setBounds(190, 440, 190, 40);

        txtScienceGrade.setText("jTextField6");
        getContentPane().add(txtScienceGrade);
        txtScienceGrade.setBounds(190, 500, 190, 40);

        TableStudentRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Alamat", "Umur", "Matematika", "Bahasa Inggris", "Pengetahuan Alam", "Rata - Rata", "Jumlah"
            }
        ));
        TableStudentRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableStudentRecordMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableStudentRecord);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 650, 630, 100);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Student");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 30, 260, 50);

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit);
        btnedit.setBounds(160, 570, 110, 30);

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel);
        btncancel.setBounds(400, 570, 110, 30);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(280, 570, 110, 30);

        setBounds(0, 0, 725, 834);
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.viewTable();
        controller.bersihFrom();
    }//GEN-LAST:event_btneditActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        controller.bersihFrom();
    }//GEN-LAST:event_btncancelActionPerformed

    private void TableStudentRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableStudentRecordMouseClicked
        // TODO add your handling code here:
        controller.onClickTable();
    }//GEN-LAST:event_TableStudentRecordMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
        controller.viewTable();
        controller.bersihFrom();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.viewTable();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnInsertAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnInsertAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertAncestorRemoved

    private void btnInsertAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnInsertAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertAncestorAdded

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(FromStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromStudentRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableStudentRecord;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private Model.StudentRecord studentRecord1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEnglishGrade;
    private javax.swing.JTextField txtMathGrade;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScienceGrade;
    // End of variables declaration//GEN-END:variables

   
}
