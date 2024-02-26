/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarysystem;

//import com.sun.jdi.connect.spi.Connection;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author weam
 */
public class Books extends javax.swing.JFrame {

   // private static String Key = null;
	Connection Con = null; 
	PreparedStatement Pst= null; 
	ResultSet Rs = null, Rs1 = null; 
	Statement St = null, St1 = null;
        
        
    public Books() {
        initComponents();
        DisplayBooks();
    }
    private void DisplayBooks() //to display books and list the books in the table
    {
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from BookTbl");
            bookTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {

        }
    }

int BookId; 
private void CountBooks()
{ 
	try {
		St1 = Con.createStatement();
		Rs1 = St1.executeQuery("Select Max (BId) from BookTbl");
		Rs1.next();
		BookId = Rs1.getInt(1)+1;  
	} catch (Exception e) {
		
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
        TFPrice = new javax.swing.JTextField();
        lblBook = new javax.swing.JLabel();
        lblQuant = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblAuthor = new javax.swing.JLabel();
        lblCover = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        TFBook = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        TFQuant = new javax.swing.JTextField();
        TFAuthor = new javax.swing.JTextField();
        lblBookCover = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 250, 240));

        jPanel3.setBackground(new java.awt.Color(102, 51, 51));

        jLabel2.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Book");

        jLabel3.setFont(new java.awt.Font("ITF Devanagari Marathi", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Library Managment System");

        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/weam/NetBeansProjects/LibraryManagmentSystem/book.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26))
        );

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Register Book");

        TFPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPriceActionPerformed(evt);
            }
        });

        lblBook.setText("Book:");

        lblQuant.setText("Quantity:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblAuthor.setText("Author:");

        lblCover.setText("Cover");

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
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
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable);

        lblPrice.setText("Price:");

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        TFQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFQuantActionPerformed(evt);
            }
        });

        lblBookCover.setText("BookCover");
        lblBookCover.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFBook, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBook))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAuthor)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TFAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPrice))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblQuant)
                                            .addComponent(TFQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(235, 235, 235)
                                        .addComponent(btnSave)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnEdit)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnDelete)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCover)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBrowse)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BackBtn)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(lblQuant)
                            .addComponent(lblAuthor)
                            .addComponent(lblBook))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnEdit)
                            .addComponent(btnDelete))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCover)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrowse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackBtn)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPriceActionPerformed

    private void TFQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFQuantActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (imgPath != null) 
        {
          try {
             InputStream img = new FileInputStream(imgPath); 
             String UpdateQuery = "Update BookTbl set BName=?, Author=?, Price=?, Qty=?, Cover=? where BId=?";
             Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
             PreparedStatement Save = Con.prepareStatement(UpdateQuery); 
              Save.setInt(6, Key);
              Save.setString(1, TFBook.getText());
              Save.setString(2, TFAuthor.getText());
              Save.setInt(3, Integer.valueOf(TFPrice.getText()));
              Save.setInt(4, Integer.valueOf(TFQuant.getText()));
              Save.setBlob(5,img);
              if (Save.executeUpdate() == 1)
              {
                  DisplayBooks();
                  JOptionPane.showMessageDialog(this, "Book Updated!");  
              } else {
                  JOptionPane.showMessageDialog(this, "Missing Information!");

              }
              

          } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Missing Information!");

          }
        } else {
            JOptionPane.showMessageDialog(this, "No Cover Selected!");

          }
        imgPath = null; 
    }//GEN-LAST:event_btnEditActionPerformed

    private void GetBookCover() //getting and display the book's cover
    {
        String Query = "select Cover from BookTbl where BId= " + Key;
        Statement St;
        ResultSet Rs;
        try {
            Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if (Rs.next()) {
                //JLabel lblBookCover = null;
                lblBookCover.setIcon(ResizeCover(null, Rs.getBytes("Cover")));
            } 
        } catch (Exception e) {

        }
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (Key == 0) {
            JOptionPane.showMessageDialog(this, "Select a Book!");

        } else {
            try {
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah");
                String Query = "Delete from BookTbl where BId =" + Key;
                Statement Del = Con.createStatement();
                Del.executeLargeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Book deleted!");
                DisplayBooks();

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    //----- brows the image 
    public ImageIcon ResizeCover(String ImagePath,byte[] pic)
        {
     ImageIcon MyImage = null; 
        if (ImagePath != null)
        {
            MyImage = new ImageIcon(ImagePath); 
	} else {
            MyImage = new ImageIcon(pic);
	}
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblBookCover.getWidth(),lblBookCover.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image; 
		}
    String imgPath;
    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
       
        //------- brows the image(window settings and labels )
	JFileChooser file = new JFileChooser(); 
	file.setCurrentDirectory(new File(System.getProperty("user.home")));
	FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png "); 
	file.addChoosableFileFilter(filter);
	int result = file.showSaveDialog(file); 
	if(result == JFileChooser.APPROVE_OPTION)
	{
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lblBookCover.setIcon(ResizeCover(path,null));
            imgPath = path;   
	} else if (result == JFileChooser.CANCEL_OPTION){
	  JOptionPane.showMessageDialog(this, "No File Selected!");

				}
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //----- code the database
	if (TFBook.getText().isEmpty() || TFAuthor.getText().isEmpty() || TFPrice.getText().isEmpty() || TFQuant.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information!");

        } else {
            try {
                CountBooks();
                //Class.forName("com.mysql.jdbc.Driver"); solution from internet 
                Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/LibraryDb", "root", "weamalbattah"); //java.lang.nullpointerexception ???
                PreparedStatement Save = Con.prepareStatement("insert into BookTbl values(?,?,?,?,?,?)");
                Save.setInt(1,BookId);
                Save.setString(2, TFBook.getText());
                Save.setString(3, TFAuthor.getText());
                Save.setInt(4, Integer.valueOf(TFPrice.getText()));
                Save.setInt(5, Integer.valueOf(TFQuant.getText()));
                InputStream img = new FileInputStream(imgPath);
                Save.setBlob(6, img);
                int row = Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Book Added Successfully ");
                Con.close();
                DisplayBooks(); //display from database

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);

            }}
    }//GEN-LAST:event_btnSaveActionPerformed

    int Key = 0;
    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) bookTable.getModel();
        int MyIndex = bookTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        TFBook.setText(model.getValueAt(MyIndex, 1).toString());
        TFAuthor.setText(model.getValueAt(MyIndex, 2).toString());
        TFPrice.setText(model.getValueAt(MyIndex, 3).toString());
        TFQuant.setText(model.getValueAt(MyIndex, 4).toString());
        GetBookCover();
    }//GEN-LAST:event_bookTableMouseClicked

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new Library().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField TFAuthor;
    private javax.swing.JTextField TFBook;
    private javax.swing.JTextField TFPrice;
    private javax.swing.JTextField TFQuant;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBook;
    private javax.swing.JLabel lblBookCover;
    private javax.swing.JLabel lblCover;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuant;
    // End of variables declaration//GEN-END:variables
}
