
package CRUD;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class FormBuku_Read extends javax.swing.JFrame {

    public FormBuku_Read() {
        Components();
        load_table();
    }

    private void Components() {

        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 18)); // NOI18N
        jLabel1.setText("PERPUSTAKAAN TEKNOLOGI INFORMASI");

        btn_tambah.setText("TAMBAH DATA");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        tabel_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_data);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_tambah)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed

        new FormBuku_Create().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void load_table()
    {
        DefaultTableModel kolom = new DefaultTableModel();
        
        
        //Membuat tampilan Tabel
        kolom.addColumn("NO");
        kolom.addColumn("ID BUKU");
        kolom.addColumn("JUDUL");
        kolom.addColumn("PENGARANG");
        kolom.addColumn("HALAMAN");
        kolom.addColumn("PENERBIT");
        
        //Menampilkan Data Pada Database ke Dalam Tabel
        
        try
        {
            int no=1;
            String mysql = "SELECT * FROM tbl_buku";
            java.sql.Connection conn = (Connection)FormBuku_ConnectDB.DB_Connection();
            java.sql.Statement stmt = conn.createStatement();
            java.sql.ResultSet result = stmt.executeQuery(mysql);
            
            while(result.next())
            {
                kolom.addRow(new Object[]{no++,result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5)});
            }
            tabel_data.setModel(kolom);
        }
        catch (SQLException e)
        {
            
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku_Read().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_data;
    // End of variables declaration//GEN-END:variables
}
