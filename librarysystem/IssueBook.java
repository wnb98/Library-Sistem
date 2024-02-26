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
public class IssueBook extends javax.swing.JFrame {
        Connection Con = null; 
	PreparedStatement Pst= null; 
	ResultSet Rs = null, Rs1 = null; 
	Statement St = null, St1 = null;
    /** Creates new form IssueBook */
    public IssueBook() {
        initComponents();
        DisplayBooks(); 
        GetStudents(); 
        DisplayRentals();
        //UpdateBook();
    }

    private void DisplayBooks() //to display books and list the books in the table
    {
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from BookTbl");
            BookTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {

        }
    }
    
    private void GetStudents() {
       try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select * from StudentTbl");
            while (Rs1.next()) {
                int SId = Rs1.getInt("StId"); //take it from Student Table 
                String s=String.valueOf(SId);
                StdIdCom.addItem(s);
            }
       } catch (Exception e){
          JOptionPane.showMessageDialog(this, e);  

       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBook = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        StdIdCom = new javax.swing.JComboBox<>();
        BDate = new com.toedter.calendar.JDateChooser();
        lblBook1 = new javax.swing.JLabel();
        lblBook2 = new javax.swing.JLabel();
        lblBook3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BookTable = new javax.swing.JTable();
        BookTb = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        RentalTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 250, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 51, 51));

        jLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Issue Book to Student");

        jLabel3.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Library Managment System");

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/weam/NetBeansProjects/LibraryManagmentSystem/IssueBook.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Issue Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 146, -1, -1));

        lblBook.setText("Book:");
        jPanel1.add(lblBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        lblAuthor.setText("Student:");
        jPanel1.add(lblAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        SaveBtn.setText("Borrow");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        EditBtn.setText("Reset");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, -1, -1));

        DeleteBtn.setText("Back");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 580, -1, -1));

        StdIdCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StdIdComActionPerformed(evt);
            }
        });
        jPanel1.add(StdIdCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 160, -1));
        jPanel1.add(BDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 160, -1));

        lblBook1.setText("Date:");
        jPanel1.add(lblBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        lblBook2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblBook2.setText("Rental List");
        jPanel1.add(lblBook2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, -1));

        lblBook3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblBook3.setText("Books List");
        jPanel1.add(lblBook3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        BookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author", "Price", "Quntity", "Cover"
            }
        ));
        BookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BookTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 570, 241));

        BookTb.setEditable(false);
        jPanel1.add(BookTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, -1));

        RentalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Student", "Book", "Date"
            }
        ));
        RentalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentalTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RentalTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 530, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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

int IId; 
private void CountRental()
{ 
	try {
		St1 = Con.createStatement();
		Rs1 = St1.executeQuery("Select Max (INum) from IssueTbl");
		Rs1.next();
		IId = Rs1.getInt(1)+1;  
	} catch (Exception e) {
		
	}
}
private void UpdateBook()
{
  try {
      int NewQty = Integer.valueOf(AvailBook)-1; 
                String UpdateQuery = "Update BookTbl set  Qty=? where BId=?";
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
                PreparedStatement Save = Con.prepareStatement(UpdateQuery);
                Save.setInt(2, BookID);
                Save.setInt(1, NewQty);
                
                if (Save.executeUpdate() == 1) 
                {
                    DisplayBooks();
                    //JOptionPane.showMessageDialog(this, "Librarian Updated!");
                } else {
                   // JOptionPane.showMessageDialog(this, "Something Went wrong!");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }
}
    int BookID = -1; 
    int AvailBook,Price; 
    private void BookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookTableMouseClicked
        // when we clicked to row in the table will apear in the text fild 
        DefaultTableModel model = (DefaultTableModel) BookTable.getModel();
        int MyIndex = BookTable.getSelectedRow();
        BookID = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        BookTb.setText(model.getValueAt(MyIndex, 1).toString());
        Price= Integer.valueOf(model.getValueAt(MyIndex, 3).toString());
        AvailBook=Integer.valueOf(model.getValueAt(MyIndex, 4).toString());
       
    }//GEN-LAST:event_BookTableMouseClicked

    private void RentalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentalTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RentalTableMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    int Borrowed;
private void CountBorrowed()
{
 try {
		St1 = Con.createStatement();
		Rs1 = St1.executeQuery("Select Count (*) from IssueTbl where StdId=" + StdIdCom.getSelectedItem());
		Rs1.next();
		Borrowed = Rs1.getInt(1);  
	} catch (Exception e) {
		
	}   
}
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // borrow button code
        CountBorrowed(); //calling the function 
        if (BookTb.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Select a book!");
        } else if(AvailBook == 0) 
                {
          JOptionPane.showMessageDialog(this, "Book Not Available !");
                }
        else if (Borrowed >= 3) 
        {
          JOptionPane.showMessageDialog(this, "Can not Borrow more tan 3 Books!");
        }
        else{
            try {
                CountRental();
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah"); //java.lang.nullpointerexception ???
                PreparedStatement Save = Con.prepareStatement("insert into IssueTbl values(?,?,?,?)");
                Save.setInt(1,IId);
                Save.setInt(2, Integer.valueOf(StdIdCom.getSelectedItem().toString() ));
                Save.setInt(3, BookID);
                String RentDate = BDate.getDate().toString().toString().substring(0,13);
                Save.setString(4, RentDate);
                
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Book Borrowed!");
                Con.close();
                DisplayRentals(); //display from database
                UpdateBook();
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
    } 
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
       // reset code
        BookTb.setText("");
        BookID = -1; 
    }//GEN-LAST:event_EditBtnActionPerformed
//---------- updateBook here 

    private void StdIdComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StdIdComActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this, StdIdCom.getSelectedItem());

    }//GEN-LAST:event_StdIdComActionPerformed

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        new Library().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeleteBtnMouseClicked

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser BDate;
    private javax.swing.JTable BookTable;
    private javax.swing.JTextField BookTb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTable RentalTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> StdIdCom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblBook1;
    private javax.swing.JLabel lblBook2;
    private javax.swing.JLabel lblBook3;
    // End of variables declaration//GEN-END:variables

}
