/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Juan
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Button7 = new javax.swing.JButton();
        TextField = new javax.swing.JTextField();
        Button4 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ButtonDot = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        ButtonDIV = new javax.swing.JButton();
        ButtonMULT = new javax.swing.JButton();
        ButtonRESTA = new javax.swing.JButton();
        ButtonSUM = new javax.swing.JButton();
        ButtonDEL = new javax.swing.JButton();
        ButtonEQUAL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(750, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        Button7.setBackground(new java.awt.Color(102, 102, 102));
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setText("7");
        Button7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button7.setFocusPainted(false);
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        TextField.setBackground(new java.awt.Color(102, 102, 102));
        TextField.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        TextField.setForeground(new java.awt.Color(255, 255, 255));
        TextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(102, 102, 102));
        Button4.setForeground(new java.awt.Color(255, 255, 255));
        Button4.setText("4");
        Button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button4.setFocusPainted(false);
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(102, 102, 102));
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setText("1");
        Button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button1.setFocusPainted(false);
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button0.setBackground(new java.awt.Color(102, 102, 102));
        Button0.setForeground(new java.awt.Color(255, 255, 255));
        Button0.setText("0");
        Button0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button0.setFocusPainted(false);
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        ButtonDot.setBackground(new java.awt.Color(102, 102, 102));
        ButtonDot.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDot.setText(".");
        ButtonDot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDot.setFocusPainted(false);
        ButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDotActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(102, 102, 102));
        Button2.setForeground(new java.awt.Color(255, 255, 255));
        Button2.setText("2");
        Button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button2.setFocusPainted(false);
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(102, 102, 102));
        Button5.setForeground(new java.awt.Color(255, 255, 255));
        Button5.setText("5");
        Button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button5.setFocusPainted(false);
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(102, 102, 102));
        Button8.setForeground(new java.awt.Color(255, 255, 255));
        Button8.setText("8");
        Button8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button8.setFocusPainted(false);
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(102, 102, 102));
        Button3.setForeground(new java.awt.Color(255, 255, 255));
        Button3.setText("3");
        Button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button3.setFocusPainted(false);
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(102, 102, 102));
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setText("6");
        Button6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button6.setFocusPainted(false);
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(102, 102, 102));
        Button9.setForeground(new java.awt.Color(255, 255, 255));
        Button9.setText("9");
        Button9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button9.setFocusPainted(false);
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        ButtonDIV.setBackground(new java.awt.Color(102, 102, 102));
        ButtonDIV.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDIV.setText("/");
        ButtonDIV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDIV.setFocusPainted(false);
        ButtonDIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDIVActionPerformed(evt);
            }
        });

        ButtonMULT.setBackground(new java.awt.Color(102, 102, 102));
        ButtonMULT.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMULT.setText("x");
        ButtonMULT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonMULT.setFocusPainted(false);
        ButtonMULT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMULTActionPerformed(evt);
            }
        });

        ButtonRESTA.setBackground(new java.awt.Color(102, 102, 102));
        ButtonRESTA.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRESTA.setText("-");
        ButtonRESTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonRESTA.setFocusPainted(false);
        ButtonRESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRESTAActionPerformed(evt);
            }
        });

        ButtonSUM.setBackground(new java.awt.Color(102, 102, 102));
        ButtonSUM.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSUM.setText("+");
        ButtonSUM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSUM.setFocusPainted(false);
        ButtonSUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSUMActionPerformed(evt);
            }
        });

        ButtonDEL.setBackground(new java.awt.Color(102, 102, 102));
        ButtonDEL.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDEL.setText("DEL");
        ButtonDEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDEL.setFocusPainted(false);
        ButtonDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDELActionPerformed(evt);
            }
        });

        ButtonEQUAL.setBackground(new java.awt.Color(102, 102, 102));
        ButtonEQUAL.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEQUAL.setText("=");
        ButtonEQUAL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonEQUAL.setFocusPainted(false);
        ButtonEQUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEQUALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonMULT, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonRESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonSUM, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonEQUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(TextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ButtonSUM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ButtonEQUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonMULT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonRESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //Números y TextField
    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        TextField.setText(TextField.getText() + Integer.toString(8));
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        
        TextField.setText(TextField.getText() + Integer.toString(7));
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
         TextField.setText(TextField.getText() + Integer.toString(9));
    }//GEN-LAST:event_Button9ActionPerformed

    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed

    }//GEN-LAST:event_TextFieldActionPerformed

    private void ButtonDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDELActionPerformed
        TextField.setText(null);
    }//GEN-LAST:event_ButtonDELActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
         TextField.setText(TextField.getText() + Integer.toString(4));
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
         TextField.setText(TextField.getText() + Integer.toString(5));
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
         TextField.setText(TextField.getText() + Integer.toString(6));
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
         TextField.setText(TextField.getText() + Integer.toString(1));
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
         TextField.setText(TextField.getText() + Integer.toString(2));
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
         TextField.setText(TextField.getText() + Integer.toString(3));
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
         TextField.setText(TextField.getText() + Integer.toString(0));
    }//GEN-LAST:event_Button0ActionPerformed

    private void ButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDotActionPerformed
         TextField.setText(TextField.getText() + ".");
    }//GEN-LAST:event_ButtonDotActionPerformed

    
    //Operadores Logicos
    private void ButtonDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDIVActionPerformed
         TextField.setText(TextField.getText() + "/");
    }//GEN-LAST:event_ButtonDIVActionPerformed

    private void ButtonMULTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMULTActionPerformed
         TextField.setText(TextField.getText() + "x");
    }//GEN-LAST:event_ButtonMULTActionPerformed

    private void ButtonRESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRESTAActionPerformed
         TextField.setText(TextField.getText() + "-");
    }//GEN-LAST:event_ButtonRESTAActionPerformed

    private void ButtonSUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSUMActionPerformed
         TextField.setText(TextField.getText() + "+");
    }//GEN-LAST:event_ButtonSUMActionPerformed

    private void ButtonEQUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEQUALActionPerformed
        if(TextField.getText().contains("+")){
            String[] text_split = TextField.getText().split("\\+");        
            int acomuladorsum = 0;
            for(int i = 0; i < text_split.length; i++){
                acomuladorsum = acomuladorsum + Integer.parseInt(text_split[i]);
            }
            TextField.setText(Integer.toString(acomuladorsum));
        }        
    }//GEN-LAST:event_ButtonEQUALActionPerformed
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonDEL;
    private javax.swing.JButton ButtonDIV;
    private javax.swing.JButton ButtonDot;
    private javax.swing.JButton ButtonEQUAL;
    private javax.swing.JButton ButtonMULT;
    private javax.swing.JButton ButtonRESTA;
    private javax.swing.JButton ButtonSUM;
    private javax.swing.JTextField TextField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
