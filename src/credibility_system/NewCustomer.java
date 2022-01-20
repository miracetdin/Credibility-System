/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credibility_system;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Miracetdin
 */
public class NewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form NewCustomer
     */
    public NewCustomer() {
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

        currentCustomerPanel = new javax.swing.JPanel();
        MainLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        educationLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        incomeLabel = new javax.swing.JLabel();
        incomeTextField = new javax.swing.JTextField();
        homeLabel = new javax.swing.JLabel();
        debtLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        debtTextField = new javax.swing.JTextField();
        sexComboBox = new javax.swing.JComboBox<>();
        educationComboBox = new javax.swing.JComboBox<>();
        homeComboBox = new javax.swing.JComboBox<>();
        amountComboBox = new javax.swing.JComboBox<>();
        saveLabel = new javax.swing.JLabel();
        infoLabel1 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        acceptComboBox = new javax.swing.JComboBox<>();
        noLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 250));

        currentCustomerPanel.setBackground(new java.awt.Color(0, 0, 255));

        MainLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MainLabel.setForeground(new java.awt.Color(255, 255, 255));
        MainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainLabel.setText("New Customer");

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back_to_24px.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        saveButton.setForeground(new java.awt.Color(0, 51, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name");

        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age");

        sexLabel.setForeground(new java.awt.Color(255, 255, 255));
        sexLabel.setText("Sex");

        educationLabel.setForeground(new java.awt.Color(255, 255, 255));
        educationLabel.setText("Education");

        nameTextField.setText("Surname, Name");
        nameTextField.setMinimumSize(new java.awt.Dimension(99, 22));
        nameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTextFieldMouseClicked(evt);
            }
        });

        incomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        incomeLabel.setText("Income");

        incomeTextField.setText("Annual Salary");
        incomeTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incomeTextFieldMouseClicked(evt);
            }
        });

        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setText("Home");

        debtLabel.setForeground(new java.awt.Color(255, 255, 255));
        debtLabel.setText("Debt");

        amountLabel.setForeground(new java.awt.Color(255, 255, 255));
        amountLabel.setText("Amount");

        sexComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        educationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uneducated", "High School", "Graduate", "Post-Graduate", "Doctarate" }));

        homeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Own", "Rent", "Mortgage" }));

        amountComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10000", "50000", "100000", "200000", "500000" }));

        saveLabel.setForeground(new java.awt.Color(255, 255, 255));
        saveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        infoLabel1.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        calculateButton.setForeground(new java.awt.Color(0, 51, 255));
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        acceptComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accepted", "Not Accepted" }));

        noLabel.setForeground(new java.awt.Color(255, 255, 255));
        noLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout currentCustomerPanelLayout = new javax.swing.GroupLayout(currentCustomerPanel);
        currentCustomerPanel.setLayout(currentCustomerPanelLayout);
        currentCustomerPanelLayout.setHorizontalGroup(
            currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentCustomerPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(educationLabel)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ageTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexComboBox, 0, 102, Short.MAX_VALUE)
                    .addComponent(educationComboBox, 0, 1, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(amountLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(incomeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(homeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentCustomerPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(homeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 102, Short.MAX_VALUE)
                            .addComponent(amountComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(debtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentCustomerPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(incomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentCustomerPanelLayout.createSequentialGroup()
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(currentCustomerPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(currentCustomerPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(noLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acceptComboBox, 0, 129, Short.MAX_VALUE))
                .addGap(51, 51, 51))
            .addGroup(currentCustomerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(currentCustomerPanelLayout.createSequentialGroup()
                        .addComponent(saveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(currentCustomerPanelLayout.createSequentialGroup()
                        .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(MainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        currentCustomerPanelLayout.setVerticalGroup(
            currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentCustomerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incomeLabel)
                    .addComponent(incomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeLabel)
                    .addComponent(homeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel)
                    .addComponent(debtLabel)
                    .addComponent(debtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(educationLabel)
                    .addComponent(amountLabel)
                    .addComponent(educationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateButton))
                .addGap(18, 18, 18)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acceptComboBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(currentCustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentCustomerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_backLabelMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(idLabel.getText());
        String accept = acceptComboBox.getSelectedItem().toString();
        Database.updateCustomerAccept("Accept", id, accept);
        saveLabel.setText("Registration Successful.");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void nameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTextFieldMouseClicked
        // TODO add your handling code here:
        nameTextField.setText("");
    }//GEN-LAST:event_nameTextFieldMouseClicked

    private void incomeTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomeTextFieldMouseClicked
        // TODO add your handling code here:
        incomeTextField.setText("");
    }//GEN-LAST:event_incomeTextFieldMouseClicked
         
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        String SQL = "select max(id) from customer";
        int id = 0;
        Statement statement;
        try {
            statement = Database.connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            if(rs.next()){
               id = rs.getInt("max");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        id++;
        
        String name = nameTextField.getText();
        int age = Integer.parseInt(ageTextField.getText());
        String sex = sexComboBox.getSelectedItem().toString();
        String education = educationComboBox.getSelectedItem().toString();
        int income = Integer.parseInt(incomeTextField.getText());
        String home = homeComboBox.getSelectedItem().toString();
        int debt = Integer.parseInt(debtTextField.getText());
        int amount = Integer.parseInt(amountComboBox.getSelectedItem().toString());
        
        int score = knowladgeBase.calAgeScore(age);
        score += knowladgeBase.calEduScore(education);
        score += knowladgeBase.calIncScore(income);
        score += knowladgeBase.calHomScore(home);
        score += knowladgeBase.calDebScore(debt);
        score += knowladgeBase.calAmoScore(amount);

        String loan = null;
        double rate = 0.0;
        String accept = null;
        if(score < 10){
            loan = "Denied";
            accept = "Not Accepted";
        }
        else if(score < 15){
            loan = "Approved";
            rate = 2.79;
            accept = "Accept";
        }
        else if(score < 20){
            loan = "Approved";
            rate = 2.54;
            accept = "Accept";
        }
        else {
            loan = "Approved";
            rate = 2.01;
            accept = "Accept";
        }
                
        if(loan.equals("Approved")){
            infoLabel1.setText("Rate: " + rate);
        }
        else{
            infoLabel1.setText("Your loan request were not approved!");
        }
        
        if(loan.equals("Denied")){
            accept = "Not Accepted";
        }
        
        if(loan.equals("Approved")){
            if(acceptComboBox.getSelectedItem().toString().equals("Accept")){
                accept = "Accepted";
            }
            if(acceptComboBox.getSelectedItem().toString().equals("Not Accept")){
                accept = "Not Accepted";
            }
        }
        else{
            accept = "Not Accepted";
        }
        
        noLabel.setText("ID: ");
        idLabel.setText(String.valueOf(id));
        Database.insertCustomer(id, name, age, sex, education, income, home, debt, amount, loan, rate, accept, score);
        
    }//GEN-LAST:event_calculateButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainLabel;
    private javax.swing.JComboBox<String> acceptComboBox;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JComboBox<String> amountComboBox;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JPanel currentCustomerPanel;
    private javax.swing.JLabel debtLabel;
    private javax.swing.JTextField debtTextField;
    private javax.swing.JComboBox<String> educationComboBox;
    private javax.swing.JLabel educationLabel;
    private javax.swing.JComboBox<String> homeComboBox;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel incomeLabel;
    private javax.swing.JTextField incomeTextField;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel noLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel saveLabel;
    private javax.swing.JComboBox<String> sexComboBox;
    private javax.swing.JLabel sexLabel;
    // End of variables declaration//GEN-END:variables
}