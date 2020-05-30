
import java.io.*;
import java.nio.charset.StandardCharsets;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.IOUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhta
 */
public class ServerGUI extends javax.swing.JFrame {

    /**
     * Creates new form TextChat
     */
    public ServerGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        serverEnter = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        porttxt = new javax.swing.JTextField();
        PortEnter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ChatTxt = new javax.swing.JTextField();
        Exit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Send = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChatHis = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        serverEnter.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        serverEnter.setText("CREATE SERVER");
        serverEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverEnterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        jLabel2.setText("PORT :");

        porttxt.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        porttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porttxtActionPerformed(evt);
            }
        });

        PortEnter.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        PortEnter.setText("DIS-CONNECT");
        PortEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortEnterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        jLabel3.setText("CHAT HISTORY");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        jLabel4.setText("CHAT :");

        ChatTxt.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        ChatTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChatTxtActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Send.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        Send.setText("SEND");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        ChatHis.setColumns(20);
        ChatHis.setLineWrap(true);
        ChatHis.setRows(5);
        jScrollPane1.setViewportView(ChatHis);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ChatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Send))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(porttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(serverEnter)
                        .addGap(18, 18, 18)
                        .addComponent(PortEnter)
                        .addGap(18, 18, 18)
                        .addComponent(Back)
                        .addGap(18, 18, 18)
                        .addComponent(Exit))
                    .addComponent(jScrollPane1))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(porttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serverEnter)
                    .addComponent(PortEnter)
                    .addComponent(Back)
                    .addComponent(Exit))
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ChatTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Send))
                .addGap(32, 32, 32))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String Text;
    String ServerText;
    String ClientText;
    
    private void ChatTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChatTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChatTxtActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
        new ServerClient().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void serverEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverEnterActionPerformed
       
        Server S = new Server();
        S.port = Integer.parseInt(porttxt.getText());    
        try {
            S.Server();
        } catch (IOException ex) {
            Logger.getLogger(ServerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        ChatHis.append("Server Connect With Client");
        ChatHis.append("\n");
        
    }//GEN-LAST:event_serverEnterActionPerformed

    private void PortEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PortEnterActionPerformed

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        ServerText = ChatTxt.getText();
        InputStream stream = new ByteArrayInputStream(ServerText.getBytes(StandardCharsets.UTF_8));
        BufferedReader Br = new BufferedReader(new InputStreamReader(stream));
        StringBuilder inputStringBuilder = new StringBuilder();
        
        try{
        String line = Br.readLine();
        while(line != null){
            inputStringBuilder.append(line);inputStringBuilder.append('\n');
            line = Br.readLine();
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        ChatHis.append("From Server: "+inputStringBuilder.toString());
        
        ClintGUI CG = new ClintGUI();
        CG.SetText(inputStringBuilder.toString());
        ChatTxt.setText("");
        
    }//GEN-LAST:event_SendActionPerformed

    private void porttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porttxtActionPerformed

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
            java.util.logging.Logger.getLogger(ClintGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClintGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClintGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClintGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClintGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextArea ChatHis;
    private javax.swing.JTextField ChatTxt;
    private javax.swing.JButton Exit;
    private javax.swing.JButton PortEnter;
    private javax.swing.JButton Send;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField porttxt;
    private javax.swing.JButton serverEnter;
    // End of variables declaration//GEN-END:variables
}