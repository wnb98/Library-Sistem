package librarysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author weam
 */
public class ReturnBook extends javax.swing.JFrame {

        
        
    public ReturnBook() {
        initComponents();
        DisplayRentals();
        DisplayReturn(); 
    }
        Connection Con = null; 
	PreparedStatement Pst= null; 
	ResultSet Rs = null, Rs1 = null; 
	Statement St = null, St1 = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RentDateTb = new javax.swing.JTextField();
        lblBook = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        ReturnBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        lblBook1 = new javax.swing.JLabel();
        lblBook2 = new javax.swing.JLabel();
        lblBook3 = new javax.swing.JLabel();
        BookTb = new javax.swing.JTextField();
        lblAuthor1 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        ReturnDate = new com.toedter.calendar.JDateChooser();
        StudentTb = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReturnTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        RentalTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 250, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 51, 51));

        jLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Return Book");

        jLabel3.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Library Managment System");

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/weam/Desktop/return.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2)))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Return Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 146, -1, -1));

        RentDateTb.setEditable(false);
        RentDateTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentDateTbActionPerformed(evt);
            }
        });
        jPanel1.add(RentDateTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 195, 31));

        lblBook.setText("Book:");
        jPanel1.add(lblBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        lblAuthor.setText("Student:");
        jPanel1.add(lblAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, -1, -1));

        ReturnBtn.setText("Return");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        lblBook1.setText("Return Date: ");
        jPanel1.add(lblBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        lblBook2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblBook2.setText("Rental List");
        jPanel1.add(lblBook2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, -1));

        lblBook3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblBook3.setText("Returned Books");
        jPanel1.add(lblBook3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        BookTb.setEditable(false);
        jPanel1.add(BookTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 195, 31));

        lblAuthor1.setText("Rental Date:");
        jPanel1.add(lblAuthor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 660, -1, -1));
        jPanel1.add(ReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 195, 31));

        StudentTb.setEditable(false);
        jPanel1.add(StudentTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 195, 31));

        ReturnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Book Name", "Author", "Price", "Quantity", "Cover"
            }
        ));
        ReturnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ReturnTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 550, 286));

        RentalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student", "Book", "Librarian", "Return Date", "Rent Date"
            }
        ));
        RentalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentalTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RentalTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 580, 286));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code 
    }//GEN-LAST:event_ResetBtnActionPerformed
 
     
    private void ReturnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnTableMouseClicked
        // display information on the text box when we click the mouse 
       /* DefaultTableModel model = (DefaultTableModel) ReturnTable.getModel();
        int MyIndex = ReturnTable.getSelectedRow();
        RentId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        StId = Integer.valueOf(model.getValueAt(MyIndex, 1).toString());
        StudentTb.setText(model.getValueAt(MyIndex, 2).toString());
        BookId = Integer.valueOf(model.getValueAt(MyIndex, 2).toString());
        BookTb.setText(model.getValueAt(MyIndex, 2).toString());
        String RentDate = model.getValueAt(MyIndex, 3).toString().substring(0,13); //display the date date, how much
        RentDateTb.setText(RentDate); */

    }//GEN-LAST:event_ReturnTableMouseClicked
private void DisplayRentals() //to display books and list the books in the rental table
    {
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from IssueTbl");
            RentalTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {

        }
    }
    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new Library().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed
int RId; 
private void CountReturn()
{ 
	try {
		St1 = Con.createStatement();
		Rs1 = St1.executeQuery("Select Max (RetNum) from ReturnTbl");
		Rs1.next();
		RId = Rs1.getInt(1)+1;  
	} catch (Exception e) {
		
	}
}
private void DisplayReturn()
{
    try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from ReturnTbl");
            ReturnTable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {

        }
}
int StId;
int BookId; 
int RentId=-1;
    private void RentalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentalTableMouseClicked
        
        DefaultTableModel model = (DefaultTableModel) RentalTable.getModel();
        int MyIndex = RentalTable.getSelectedRow();
        RentId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        StId = Integer.valueOf(model.getValueAt(MyIndex, 1).toString());
        StudentTb.setText(model.getValueAt(MyIndex, 2).toString());
        BookId = Integer.valueOf(model.getValueAt(MyIndex, 2).toString());
        BookTb.setText(model.getValueAt(MyIndex, 2).toString());
        String RentDate = model.getValueAt(MyIndex, 3).toString().substring(0,13); //display the date date, how much
        RentDateTb.setText(RentDate);
       
        
    }//GEN-LAST:event_RentalTableMouseClicked

    private void RentDateTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentDateTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentDateTbActionPerformed
private void GetAvailabelQty()
{
  try {
		St1 = Con.createStatement();
		Rs1 = St1.executeQuery("Select Qty from BookTbl where"+ BookId);
		Rs1.next();
		AvailBook = Rs1.getInt(1);  
	} catch (Exception e) {
		
	}  
}
private void DeleteRental()
{
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
                String Query = "Delete from IssueTbl where INum =" + RentId;
                Statement Del = Con.createStatement();
                Del.executeLargeUpdate(Query);
                //JOptionPane.showMessageDialog(this, "Book deleted!");
                

            } catch (Exception e) {
            }

        
}
    int AvailBook; 
    private void UpdateBook()
{
    GetAvailabelQty(); //when we return a book the quantity will icrease in the book table 
  try { 
      int NewQty = Integer.valueOf(AvailBook)+1; 
                String UpdateQuery = "Update BookTbl set  Qty=? where BId=?";
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
                PreparedStatement Save = Con.prepareStatement(UpdateQuery);
                Save.setInt(2, BookId);
                Save.setInt(1, NewQty);
                
                if (Save.executeUpdate() == 1) 
                {
                    //DisplayBooks();
                    //JOptionPane.showMessageDialog(this, "Librarian Updated!");
                } else {
                   // JOptionPane.showMessageDialog(this, "Something Went wrong!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }
}
    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed
        
         if (RentId == -1) 
        {
            JOptionPane.showMessageDialog(this, "Select a Book To Return!");
        }
        else{
            CountReturn();
            try {
                
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah"); //java.lang.nullpointerexception ???
                PreparedStatement Save = Con.prepareStatement("insert into ReturnTbl values(?,?,?,?,?,?)");
                Save.setInt(1,RId);
                Save.setInt(2,StId);
                Save.setInt(3, Integer.valueOf(BookId));
                Save.setInt(4, 1);
                String RetDate = ReturnDate.getDate().toString().substring(0, 13);
                Save.setString(5, RetDate);
                String RentDate = RentDateTb.getText();
                Save.setString(6, RentDate);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Book Returned!");
                Con.close();
                
                UpdateBook();
                DeleteRental();
                DisplayReturn(); //display from database
                DisplayRentals();
                
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
    } 
    }//GEN-LAST:event_ReturnBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField BookTb;
    private javax.swing.JTextField RentDateTb;
    private javax.swing.JTable RentalTable;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton ReturnBtn;
    private com.toedter.calendar.JDateChooser ReturnDate;
    private javax.swing.JTable ReturnTable;
    private javax.swing.JTextField StudentTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblAuthor1;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblBook1;
    private javax.swing.JLabel lblBook2;
    private javax.swing.JLabel lblBook3;
    // End of variables declaration//GEN-END:variables
}
