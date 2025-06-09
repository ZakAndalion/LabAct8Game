
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Zak Andalion
 */
public class TicTacToeWindow extends javax.swing.JFrame {

    private String startGame = "X";
    public int xCount = 0;
    public int oCount = 0;
    boolean checker;
    
    public TicTacToeWindow() {
        initComponents();   
        setResizable(false);
        setLocationRelativeTo(null);
        setExtendedState(NORMAL);
    }

    private void gameScore(){
        jLabel8.setText(String.valueOf(xCount));
        jLabel6.setText(String.valueOf(oCount));
    }
    
    private void playerChoose(){
        if (startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }else{
            startGame = "X";
        }    
    }
    
    private void game(){
        String b1 = jBtn1.getText();
        String b2 = jBtn2.getText();
        String b3 = jBtn3.getText();
        String b4 = jBtn4.getText();
        String b5 = jBtn5.getText();
        String b6 = jBtn6.getText();
        String b7 = jBtn7.getText();
        String b8 = jBtn8.getText();
        String b9 = jBtn9.getText();
        
        if (b1 == "X" && b2 == "X" && b3 == "X"){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn1.setBackground(Color.RED);
            jBtn2.setBackground(Color.RED);
            jBtn3.setBackground(Color.RED);
            xCount++;
            gameScore();
        } else if (b4 == "X" && b5 == "X" && b6 == "X"){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn4.setBackground(Color.RED);
            jBtn5.setBackground(Color.RED);
            jBtn6.setBackground(Color.RED);
            xCount++;
            gameScore();
        } else if (b7 == "X" && b8 == "X" && b9 == "X"){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn7.setBackground(Color.RED);
            jBtn8.setBackground(Color.RED);
            jBtn9.setBackground(Color.RED);
            xCount++;
            gameScore();
        } else if (b1 == "X" && b4 == "X" && b7 == "X"){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn1.setBackground(Color.RED);
            jBtn4.setBackground(Color.RED);
            jBtn7.setBackground(Color.RED);
            xCount++;
            gameScore();
        } else if (b2 == "X" && b5 == "X" && b8 == "X"){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn2.setBackground(Color.RED);
            jBtn5.setBackground(Color.RED);
            jBtn8.setBackground(Color.RED);
            xCount++;
            gameScore();
        } else if (b3 == "X" && b6 == "X" && b9 == "X"){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn3.setBackground(Color.RED);
            jBtn6.setBackground(Color.RED);
            jBtn9.setBackground(Color.RED);
            xCount++;
            gameScore();
        } else if (b1 == "X" && b5 == "X" && b9 == "X"){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn1.setBackground(Color.RED);
            jBtn5.setBackground(Color.RED);
            jBtn9.setBackground(Color.RED);
            xCount++;
            gameScore();
        } else if (b3 == "X" && b5 == "X" && b7 == "X"){
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn3.setBackground(Color.RED);
            jBtn5.setBackground(Color.RED);
            jBtn7.setBackground(Color.RED);
            xCount++;
            gameScore();
        } else if (b1 == "O" && b2 == "O" && b3 == "O"){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn1.setBackground(Color.BLUE);
            jBtn2.setBackground(Color.BLUE);
            jBtn3.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        } else if (b4 == "O" && b5 == "O" && b6 == "O"){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn4.setBackground(Color.BLUE);
            jBtn5.setBackground(Color.BLUE);
            jBtn6.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        } else if (b7 == "O" && b8 == "O" && b9 == "O"){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn7.setBackground(Color.BLUE);
            jBtn8.setBackground(Color.BLUE);
            jBtn9.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        } else if (b1 == "O" && b4 == "O" && b7 == "O"){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn1.setBackground(Color.BLUE);
            jBtn4.setBackground(Color.BLUE);
            jBtn7.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        } else if (b2 == "O" && b5 == "O" && b8 == "O"){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn2.setBackground(Color.BLUE);
            jBtn5.setBackground(Color.BLUE);
            jBtn8.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        } else if (b3 == "O" && b6 == "O" && b9 == "O"){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn3.setBackground(Color.BLUE);
            jBtn6.setBackground(Color.BLUE);
            jBtn9.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        } else if (b1 == "O" && b5 == "O" && b9 == "O"){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn1.setBackground(Color.BLUE);
            jBtn5.setBackground(Color.BLUE);
            jBtn9.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        } else if (b3 == "O" && b5 == "O" && b7 == "O"){
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jBtn3.setBackground(Color.BLUE);
            jBtn5.setBackground(Color.BLUE);
            jBtn7.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jBtn1 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 350));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtn1.setBackground(new java.awt.Color(204, 204, 204));
        jBtn1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jBtn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jBtn1.setPreferredSize(new java.awt.Dimension(5, 5));
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 100));

        jBtn2.setBackground(new java.awt.Color(204, 204, 204));
        jBtn2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jBtn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jBtn2.setPreferredSize(new java.awt.Dimension(5, 5));
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, 100));

        jBtn5.setBackground(new java.awt.Color(204, 204, 204));
        jBtn5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jBtn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jBtn5.setPreferredSize(new java.awt.Dimension(5, 5));
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 100, 100));

        jBtn6.setBackground(new java.awt.Color(204, 204, 204));
        jBtn6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jBtn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jBtn6.setPreferredSize(new java.awt.Dimension(5, 5));
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 100, 100));

        jBtn4.setBackground(new java.awt.Color(204, 204, 204));
        jBtn4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jBtn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jBtn4.setPreferredSize(new java.awt.Dimension(5, 5));
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, 100));

        jBtn9.setBackground(new java.awt.Color(204, 204, 204));
        jBtn9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jBtn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jBtn9.setPreferredSize(new java.awt.Dimension(5, 5));
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 100, 100));

        jBtn8.setBackground(new java.awt.Color(204, 204, 204));
        jBtn8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jBtn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jBtn8.setPreferredSize(new java.awt.Dimension(5, 5));
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, 100));

        jBtn7.setBackground(new java.awt.Color(204, 204, 204));
        jBtn7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jBtn7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jBtn7.setPreferredSize(new java.awt.Dimension(5, 5));
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 100));

        jBtn3.setBackground(new java.awt.Color(204, 204, 204));
        jBtn3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 20)); // NOI18N
        jBtn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jBtn3.setPreferredSize(new java.awt.Dimension(5, 5));
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });
        jPanel2.add(jBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 360, 360));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 30)); // NOI18N
        jLabel1.setText("Player O:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 30)); // NOI18N
        jLabel5.setText("Game Counter:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");
        jLabel6.setOpaque(true);
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 80, -1));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 30)); // NOI18N
        jLabel7.setText("Player X:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");
        jLabel8.setOpaque(true);
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 80, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 300, 200));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jButton15.setText("Reset Game");
        jButton15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jButton15.setPreferredSize(new java.awt.Dimension(5, 5));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 60));

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jButton16.setText("Reset Counter");
        jButton16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jButton16.setPreferredSize(new java.awt.Dimension(5, 5));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 260, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 300, 150));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Gabriel Zak E. Andalion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Made by:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 40)); // NOI18N
        jLabel4.setText("TIC-TAC-TOE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        jBtn1.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        playerChoose();
        game();
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        jBtn2.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        playerChoose();
        game();
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        jBtn5.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        playerChoose();
        game();
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        jBtn6.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        playerChoose();
        game();
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        jBtn4.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        playerChoose();
        game();
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        jBtn9.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        playerChoose();
        game();
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        jBtn8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        playerChoose();
        game();
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        jBtn7.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        playerChoose();
        game();
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        jBtn3.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        playerChoose();
        game();
    }//GEN-LAST:event_jBtn3ActionPerformed
    
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jBtn1.setEnabled(true);
        jBtn2.setEnabled(true);
        jBtn5.setEnabled(true);
        jBtn6.setEnabled(true);
        jBtn4.setEnabled(true);
        jBtn9.setEnabled(true);
        jBtn8.setEnabled(true);
        jBtn7.setEnabled(true);
        jBtn3.setEnabled(true);
        
        jBtn1.setText("");
        jBtn2.setText("");
        jBtn5.setText("");
        jBtn6.setText("");
        jBtn4.setText("");
        jBtn9.setText("");
        jBtn8.setText("");
        jBtn7.setText("");
        jBtn3.setText("");
        
        jBtn1.setBackground(Color.LIGHT_GRAY);
        jBtn2.setBackground(Color.LIGHT_GRAY);
        jBtn5.setBackground(Color.LIGHT_GRAY);
        jBtn6.setBackground(Color.LIGHT_GRAY);
        jBtn4.setBackground(Color.LIGHT_GRAY);
        jBtn9.setBackground(Color.LIGHT_GRAY);
        jBtn8.setBackground(Color.LIGHT_GRAY);
        jBtn7.setBackground(Color.LIGHT_GRAY);
        jBtn3.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jBtn1.setEnabled(true);
        jBtn2.setEnabled(true);
        jBtn5.setEnabled(true);
        jBtn6.setEnabled(true);
        jBtn4.setEnabled(true);
        jBtn9.setEnabled(true);
        jBtn8.setEnabled(true);
        jBtn7.setEnabled(true);
        jBtn3.setEnabled(true);
        
        xCount = 0;
        oCount = 0;
        jLabel8.setText(String.valueOf(xCount));
        jLabel6.setText(String.valueOf(oCount));
        
        jBtn1.setText("");
        jBtn2.setText("");
        jBtn5.setText("");
        jBtn6.setText("");
        jBtn4.setText("");
        jBtn9.setText("");
        jBtn8.setText("");
        jBtn7.setText("");
        jBtn3.setText("");
        
        jBtn1.setBackground(Color.LIGHT_GRAY);
        jBtn2.setBackground(Color.LIGHT_GRAY);
        jBtn5.setBackground(Color.LIGHT_GRAY);
        jBtn6.setBackground(Color.LIGHT_GRAY);
        jBtn4.setBackground(Color.LIGHT_GRAY);
        jBtn9.setBackground(Color.LIGHT_GRAY);
        jBtn8.setBackground(Color.LIGHT_GRAY);
        jBtn7.setBackground(Color.LIGHT_GRAY);
        jBtn3.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
