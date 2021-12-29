/*
 * Copyright © 2021 Erick Sena Godinho. All rights reserved.
 */

import javax.swing.JButton;
import javax.swing.JOptionPane;

public final class ScreenGame extends javax.swing.JFrame {

    /**
     * Creates new form ScreenGame
     */
    public ScreenGame() {
        initComponents();
        game = new TicTacToe();
        player1 = game.getPlayer1();
        player2 = game.getPlayer2();
        setValues(game);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGame = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        lblTurnsInfo = new javax.swing.JLabel();
        pnlScore = new javax.swing.JPanel();
        lblScore = new javax.swing.JLabel();
        lblNamePlayer1 = new javax.swing.JLabel();
        lblNamePlayer2 = new javax.swing.JLabel();
        lblScorePlayer1 = new javax.swing.JLabel();
        lblScorePlayer2 = new javax.swing.JLabel();
        lblVersionInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlGame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        pnlGame.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 80));

        btn4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        pnlGame.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 80));

        btn7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        pnlGame.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, 80));

        btn5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        pnlGame.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 80, 80));

        btn2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        pnlGame.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 80));

        btn8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        pnlGame.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 80, 80));

        btn3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        pnlGame.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 80, 80));

        btn6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        pnlGame.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 80, 80));

        btn9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        pnlGame.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 80, 80));

        lblTurnsInfo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTurnsInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurnsInfo.setText("Player 1's turn");
        pnlGame.add(lblTurnsInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 330, 30));

        pnlScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblScore.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore.setText("Score");

        lblNamePlayer1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNamePlayer1.setText("Player 1:");

        lblNamePlayer2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNamePlayer2.setText("Player 2:");

        lblScorePlayer1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblScorePlayer1.setText("10");

        lblScorePlayer2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblScorePlayer2.setText("10");

        lblVersionInfo.setText("Made by: Erick Sena | Version: 1.1.0");

        javax.swing.GroupLayout pnlScoreLayout = new javax.swing.GroupLayout(pnlScore);
        pnlScore.setLayout(pnlScoreLayout);
        pnlScoreLayout.setHorizontalGroup(
            pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlScoreLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamePlayer1)
                            .addComponent(lblNamePlayer2))
                        .addGap(18, 18, 18)
                        .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScorePlayer1)
                            .addComponent(lblScorePlayer2))
                        .addGap(76, 76, 76))
                    .addGroup(pnlScoreLayout.createSequentialGroup()
                        .addComponent(lblScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlScoreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVersionInfo)
                .addContainerGap())
        );
        pnlScoreLayout.setVerticalGroup(
            pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamePlayer1)
                    .addComponent(lblScorePlayer1))
                .addGap(18, 18, 18)
                .addGroup(pnlScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamePlayer2)
                    .addComponent(lblScorePlayer2))
                .addGap(194, 194, 194)
                .addComponent(lblVersionInfo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGame, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        makePlay(btn1, 0, 0);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        makePlay(btn2, 0, 1);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        makePlay(btn3, 0, 2);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        makePlay(btn4, 1, 0);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        makePlay(btn5, 1, 1);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        makePlay(btn6, 1, 2);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        makePlay(btn7, 2, 0);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        makePlay(btn8, 2, 1);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        makePlay(btn9, 2, 2);
    }//GEN-LAST:event_btn9ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ScreenGame().setVisible(true);
        });
    }

    private final TicTacToe game;
    private final Player player1;
    private final Player player2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel lblNamePlayer1;
    private javax.swing.JLabel lblNamePlayer2;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblScorePlayer1;
    private javax.swing.JLabel lblScorePlayer2;
    private javax.swing.JLabel lblTurnsInfo;
    private javax.swing.JLabel lblVersionInfo;
    private javax.swing.JPanel pnlGame;
    private javax.swing.JPanel pnlScore;
    // End of variables declaration//GEN-END:variables

    public void setValues(TicTacToe game) {
        lblNamePlayer1.setText(player1.getName());
        lblNamePlayer2.setText(player2.getName());
        lblScorePlayer1.setText(String.valueOf(player1.getScore()));
        lblScorePlayer2.setText(String.valueOf(player2.getScore()));
    }

    public void setInfo() {
        String playerName = game.getPlayerTime() == 1 ? player1.getName() : player2.getName();
        StringBuilder turnInfo = new StringBuilder("'s turn");
        turnInfo.insert(0, playerName);
        lblTurnsInfo.setText(turnInfo.toString());
    }

    public void makePlay(JButton button, int y, int x) {
        if (game.makePlay(y, x)) {
            int playerTime = game.getPlayerTime();

            Player player = playerTime == 1 ? game.getPlayer1() : game.getPlayer2();
            game.setPlayerTime(playerTime == 1 ? 10 : 1);
            button.setText(String.valueOf(player.getSymbol()));
            setValues(game);

            int stats = game.checkGameOver();
            switch (stats) {
                case 0:
                    restart();
                    break;
                case 1:
                    dispose();
                    break;
            }
            setInfo();
        } else {
            JOptionPane.showMessageDialog(this, "Field is already filled", "Invalid field", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void restart() {
        game.startBoard();
        setValues(game);
        restartButtons();
    }

    public void restartButtons() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }
}