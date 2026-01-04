
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 26nandtanu
 */
public class TicTacToeFrame extends javax.swing.JFrame {

    int turn = 0; //determines who's turn it is
    boolean xFirst = true;
    
    int scorex = 0;
    int scoreo = 0;
    int numTie = 0;

    /**
     * Creates new form TicTacToeFrame
     */
    public TicTacToeFrame() {
        initComponents();
    }
//add TIE
    public void checkWin() {
        //X Winning Check
        //1. UPPER HORIZONTAL Win
        if (ulBUT.getText().equals("X") && umBUT.getText().equals("X") && urBUT.getText().equals("X")) {
            ulBUT.setBackground(new Color(255,102,102));
            umBUT.setBackground(new Color(255,102,102));
            urBUT.setBackground(new Color(255,102,102));
            JOptionPane.showMessageDialog(this, "Player X Wins\nUpper Horizontal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scorex++;
            scorexLBL.setText(Integer.toString(scorex));
        } 
        //2. MIDDLE HORIZONTAL Win
        else if (mlBUT.getText().equals("X") && mBUT.getText().equals("X") && mrBUT.getText().equals("X")) {
            mlBUT.setBackground(new Color(255, 102, 102));
            mBUT.setBackground(new Color(255, 102, 102));
            mrBUT.setBackground(new Color(255, 102, 102));
            JOptionPane.showMessageDialog(this, "Player X Wins\nMiddle Horizontal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scorex++;
            scorexLBL.setText(Integer.toString(scorex));
        }
        //3. LOWER HORIZONTAL Win
        else if (llBUT.getText().equals("X") && lmBUT.getText().equals("X") && lrBUT.getText().equals("X")) {
            llBUT.setBackground(new Color(255,102,102));
            lmBUT.setBackground(new Color(255,102,102));
            lrBUT.setBackground(new Color(255,102,102));
            JOptionPane.showMessageDialog(this, "Player X Wins\nLower Horizontal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scorex++;
            scorexLBL.setText(Integer.toString(scorex));
        }
        //4. LEFT TO RIGHT DIAGONAL Win
        else if (ulBUT.getText().equals("X") && mBUT.getText().equals("X") && lrBUT.getText().equals("X")) {
            ulBUT.setBackground(new Color(255,102,102));
            mBUT.setBackground(new Color(255,102,102));
            lrBUT.setBackground(new Color(255,102,102));
            JOptionPane.showMessageDialog(this, "Player X Wins\nLeft to Right Diagonal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scorex++;
            scorexLBL.setText(Integer.toString(scorex));
        }
        //5. RIGHT VERTCAL Win
        else if (urBUT.getText().equals("X") && mrBUT.getText().equals("X") && lrBUT.getText().equals("X")) {
            urBUT.setBackground(new Color(255,102,102));
            mrBUT.setBackground(new Color(255,102,102));
            lrBUT.setBackground(new Color(255,102,102));
            JOptionPane.showMessageDialog(this, "Player X Wins\nRight Vertical", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scorex++;
            scorexLBL.setText(Integer.toString(scorex));
        }
        //6. MIDDLE VERTICAL Win
        else if (umBUT.getText().equals("X") && mBUT.getText().equals("X") && lmBUT.getText().equals("X")) {
            umBUT.setBackground(new Color(255,102,102));
            mBUT.setBackground(new Color(255,102,102));
            lmBUT.setBackground(new Color(255,102,102));
            JOptionPane.showMessageDialog(this, "Player X Wins\nMiddle Vertical", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scorex++;
            scorexLBL.setText(Integer.toString(scorex));
        }
        //7. LEFT VERTICAL Win
        else if (ulBUT.getText().equals("X") && mlBUT.getText().equals("X") && llBUT.getText().equals("X")) {
            ulBUT.setBackground(new Color(255,102,102));
            mlBUT.setBackground(new Color(255,102,102));
            llBUT.setBackground(new Color(255,102,102));
            JOptionPane.showMessageDialog(this, "Player X Wins\nLeft Vertical", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scorex++;
            scorexLBL.setText(Integer.toString(scorex));
        }
        //8. RIGHT TO LEFT DIAGONAL Win
        else if (urBUT.getText().equals("X") && mBUT.getText().equals("X") && llBUT.getText().equals("X")) {
            urBUT.setBackground(new Color(255,102,102));
            mBUT.setBackground(new Color(255,102,102));
            llBUT.setBackground(new Color(255,102,102));
            JOptionPane.showMessageDialog(this, "Player X Wins\nRight to Left Diagonal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scorex++;
            scorexLBL.setText(Integer.toString(scorex));
        }
        //O Winning Check
        //1. UPPER HORIZONTAL Win
        else if (ulBUT.getText().equals("O") && umBUT.getText().equals("O") && urBUT.getText().equals("O")) {
            ulBUT.setBackground(new Color(102,153,255));
            umBUT.setBackground(new Color(102,153,255));
            urBUT.setBackground(new Color(102,153,255));
            JOptionPane.showMessageDialog(this, "Player O Wins\nUpper Horizontal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scoreo++;
            scoreoLBL.setText(Integer.toString(scoreo));
        } 
        //2. MIDDLE HORIZONTAL Win
        else if (mlBUT.getText().equals("O") && mBUT.getText().equals("O") && mrBUT.getText().equals("O")) {
            mlBUT.setBackground(new Color(102,153,255));
            mBUT.setBackground(new Color(102,153,255));
            mrBUT.setBackground(new Color(102,153,255));
            JOptionPane.showMessageDialog(this, "Player O Wins\nMiddle Horizontal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scoreo++;
            scoreoLBL.setText(Integer.toString(scoreo));
        }
        //3. LOWER HORIZONTAL Win
        else if (llBUT.getText().equals("O") && lmBUT.getText().equals("O") && lrBUT.getText().equals("O")) {
            llBUT.setBackground(new Color(102,153,255));
            lmBUT.setBackground(new Color(102,153,255));
            lrBUT.setBackground(new Color(102,153,255));
            JOptionPane.showMessageDialog(this, "Player O Wins\nLower Horizontal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scoreo++;
            scoreoLBL.setText(Integer.toString(scoreo));
        }
        //4. LEFT TO RIGHT DIAGONAL Win
        else if (ulBUT.getText().equals("O") && mBUT.getText().equals("O") && lrBUT.getText().equals("O")) {
            ulBUT.setBackground(new Color(102,153,255));
            mBUT.setBackground(new Color(102,153,255));
            lrBUT.setBackground(new Color(102,153,255));
            JOptionPane.showMessageDialog(this, "Player O Wins\nLeft to Right Diagonal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scoreo++;
            scoreoLBL.setText(Integer.toString(scoreo));
        }
        //5. RIGHT VERTCAL Win
        else if (urBUT.getText().equals("O") && mrBUT.getText().equals("O") && lrBUT.getText().equals("O")) {
            urBUT.setBackground(new Color(102,153,255));
            mrBUT.setBackground(new Color(102,153,255));
            lrBUT.setBackground(new Color(102,153,255));
            JOptionPane.showMessageDialog(this, "Player O Wins\nRight Vertical", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scoreo++;
            scoreoLBL.setText(Integer.toString(scoreo));
        }
        //6. MIDDLE VERTICAL Win
        else if (umBUT.getText().equals("O") && mBUT.getText().equals("O") && lmBUT.getText().equals("O")) {
            umBUT.setBackground(new Color(102,153,255));
            mBUT.setBackground(new Color(102,153,255));
            lmBUT.setBackground(new Color(102,153,255));
            JOptionPane.showMessageDialog(this, "Player O Wins\nMiddle Vertical", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scoreo++;
            scoreoLBL.setText(Integer.toString(scoreo));
        }
        //7. LEFT VERTICAL Win
        else if (ulBUT.getText().equals("O") && mlBUT.getText().equals("O") && llBUT.getText().equals("O")) {
            ulBUT.setBackground(new Color(102,153,255));
            mlBUT.setBackground(new Color(102,153,255));
            llBUT.setBackground(new Color(102,153,255));
            JOptionPane.showMessageDialog(this, "Player O Wins\nLeft Vertical", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scoreo++;
            scoreoLBL.setText(Integer.toString(scoreo));
        }
        //8. RIGHT TO LEFT DIAGONAL Win
        else if (urBUT.getText().equals("O") && mBUT.getText().equals("O") && llBUT.getText().equals("O")) {
            urBUT.setBackground(new Color(102,153,255));
            mBUT.setBackground(new Color(102,153,255));
            llBUT.setBackground(new Color(102,153,255));
            JOptionPane.showMessageDialog(this, "Player O Wins\nRight to Left Diagonal", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            scoreo++;
            scoreoLBL.setText(Integer.toString(scoreo));
        }
        //tie when X starts first
        else if (turn == 9 && xFirst){
            JOptionPane.showMessageDialog(this, "Tie", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            numTie++;
            numTiesLBL.setText(Integer.toString(numTie));
        }
        //tie when O starts first
        else if (turn == 10 && !xFirst){
            JOptionPane.showMessageDialog(this, "Tie", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            numTie++;
            numTiesLBL.setText(Integer.toString(numTie));
        }
    }
    
    public void updateMove(){
        if(turn%2==0){
            statusLBL.setText("Player X Turn");
        } else {
            statusLBL.setText("Player O Turn");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ulBUT = new javax.swing.JButton();
        umBUT = new javax.swing.JButton();
        urBUT = new javax.swing.JButton();
        mlBUT = new javax.swing.JButton();
        mBUT = new javax.swing.JButton();
        mrBUT = new javax.swing.JButton();
        llBUT = new javax.swing.JButton();
        lmBUT = new javax.swing.JButton();
        lrBUT = new javax.swing.JButton();
        titlePNL = new javax.swing.JPanel();
        titleLBL = new javax.swing.JLabel();
        scorePNL = new javax.swing.JPanel();
        playerxLBL = new javax.swing.JLabel();
        scorexLBL = new javax.swing.JLabel();
        scoreoLBL = new javax.swing.JLabel();
        playeroLBL = new javax.swing.JLabel();
        tieLBL = new javax.swing.JLabel();
        numTiesLBL = new javax.swing.JLabel();
        resetBUT = new javax.swing.JButton();
        statusLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ulBUT.setBackground(new java.awt.Color(204, 204, 255));
        ulBUT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ulBUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ulBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulBUTActionPerformed(evt);
            }
        });

        umBUT.setBackground(new java.awt.Color(204, 204, 255));
        umBUT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        umBUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        umBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umBUTActionPerformed(evt);
            }
        });

        urBUT.setBackground(new java.awt.Color(204, 204, 255));
        urBUT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        urBUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        urBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urBUTActionPerformed(evt);
            }
        });

        mlBUT.setBackground(new java.awt.Color(204, 204, 255));
        mlBUT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        mlBUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mlBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlBUTActionPerformed(evt);
            }
        });

        mBUT.setBackground(new java.awt.Color(204, 204, 255));
        mBUT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        mBUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBUTActionPerformed(evt);
            }
        });

        mrBUT.setBackground(new java.awt.Color(204, 204, 255));
        mrBUT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        mrBUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mrBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrBUTActionPerformed(evt);
            }
        });

        llBUT.setBackground(new java.awt.Color(204, 204, 255));
        llBUT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        llBUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        llBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llBUTActionPerformed(evt);
            }
        });

        lmBUT.setBackground(new java.awt.Color(204, 204, 255));
        lmBUT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lmBUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lmBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lmBUTActionPerformed(evt);
            }
        });

        lrBUT.setBackground(new java.awt.Color(204, 204, 255));
        lrBUT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lrBUT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lrBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lrBUTActionPerformed(evt);
            }
        });

        titlePNL.setBackground(new java.awt.Color(204, 204, 255));

        titleLBL.setFont(new java.awt.Font("Castellar", 1, 48)); // NOI18N
        titleLBL.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout titlePNLLayout = new javax.swing.GroupLayout(titlePNL);
        titlePNL.setLayout(titlePNLLayout);
        titlePNLLayout.setHorizontalGroup(
            titlePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePNLLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(titleLBL)
                .addGap(134, 134, 134))
        );
        titlePNLLayout.setVerticalGroup(
            titlePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLBL)
                .addGap(23, 23, 23))
        );

        scorePNL.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));

        playerxLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playerxLBL.setForeground(new java.awt.Color(255, 102, 102));
        playerxLBL.setText("Player X:");

        scorexLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        scorexLBL.setText("0");

        scoreoLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        scoreoLBL.setText("0");

        playeroLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        playeroLBL.setForeground(new java.awt.Color(102, 153, 255));
        playeroLBL.setText("Player O:");

        tieLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tieLBL.setText("Ties:");

        numTiesLBL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        numTiesLBL.setText("0");

        javax.swing.GroupLayout scorePNLLayout = new javax.swing.GroupLayout(scorePNL);
        scorePNL.setLayout(scorePNLLayout);
        scorePNLLayout.setHorizontalGroup(
            scorePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePNLLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(scorePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerxLBL)
                    .addComponent(playeroLBL)
                    .addComponent(tieLBL))
                .addGap(87, 87, 87)
                .addGroup(scorePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreoLBL)
                    .addComponent(scorexLBL)
                    .addComponent(numTiesLBL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scorePNLLayout.setVerticalGroup(
            scorePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePNLLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(scorePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerxLBL)
                    .addComponent(scorexLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(scorePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tieLBL)
                    .addComponent(numTiesLBL))
                .addGap(21, 21, 21)
                .addGroup(scorePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scoreoLBL)
                    .addComponent(playeroLBL))
                .addGap(50, 50, 50))
        );

        resetBUT.setBackground(new java.awt.Color(153, 204, 255));
        resetBUT.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        resetBUT.setText("Reset");
        resetBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBUTActionPerformed(evt);
            }
        });

        statusLBL.setBackground(new java.awt.Color(255, 255, 255));
        statusLBL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        statusLBL.setText("Player X Turn");
        statusLBL.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statusLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mlBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mrBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ulBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(umBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(urBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(llBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lmBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lrBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scorePNL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titlePNL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ulBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(umBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mlBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mrBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(llBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lmBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lrBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scorePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addComponent(statusLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBUTActionPerformed
        xFirst = !xFirst;
        if(xFirst)
            turn=0;
        else
            turn=1;
        
        //reset text
        ulBUT.setText("");
        umBUT.setText("");
        urBUT.setText("");
        mlBUT.setText("");
        mBUT.setText("");
        mrBUT.setText("");
        llBUT.setText("");
        lmBUT.setText("");
        lrBUT.setText("");
        
        //reset colors
        ulBUT.setBackground(new Color(204,204,255));
        umBUT.setBackground(new Color(204,204,255));
        urBUT.setBackground(new Color(204,204,255));
        mlBUT.setBackground(new Color(204,204,255));
        mBUT.setBackground(new Color(204,204,255));
        mrBUT.setBackground(new Color(204,204,255));
        llBUT.setBackground(new Color(204,204,255));
        lmBUT.setBackground(new Color(204,204,255));
        lrBUT.setBackground(new Color(204,204,255));
        
    }//GEN-LAST:event_resetBUTActionPerformed

    private void ulBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulBUTActionPerformed
        if (ulBUT.getText().equals("")){
            if (turn%2 == 0){
                ulBUT.setText("X");
            } else {
                ulBUT.setText("O");
            }
            turn++;
            checkWin();
            updateMove();
        }
    }//GEN-LAST:event_ulBUTActionPerformed

    private void umBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umBUTActionPerformed
        if (umBUT.getText().equals("")){
            if (turn%2 == 0){
                umBUT.setText("X");
            } else {
                umBUT.setText("O");
            }
            turn++;
            checkWin();
            updateMove();
        }
    }//GEN-LAST:event_umBUTActionPerformed

    private void urBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urBUTActionPerformed
        if (urBUT.getText().equals("")){
            if (turn%2 == 0){
                urBUT.setText("X");
            } else {
                urBUT.setText("O");
            }
            turn++;
            checkWin();
            updateMove();
        }
    }//GEN-LAST:event_urBUTActionPerformed

    private void mlBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlBUTActionPerformed
        if (mlBUT.getText().equals("")){
            if (turn%2 == 0){
                mlBUT.setText("X");
            } else {
                mlBUT.setText("O");
            }
            turn++;
            checkWin();
            updateMove();
        }
    }//GEN-LAST:event_mlBUTActionPerformed

    private void mBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBUTActionPerformed
        if (mBUT.getText().equals("")){
            if (turn%2 == 0){
                mBUT.setText("X");
            } else {
                mBUT.setText("O");
            }
            turn++;
            checkWin();
            updateMove();
        }
    }//GEN-LAST:event_mBUTActionPerformed

    private void mrBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrBUTActionPerformed
        if (mrBUT.getText().equals("")){
            if (turn%2 == 0){
                mrBUT.setText("X");
            } else {
                mrBUT.setText("O");
            }
            turn++;
            checkWin();
            updateMove();
        }
    }//GEN-LAST:event_mrBUTActionPerformed

    private void llBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llBUTActionPerformed
        if (llBUT.getText().equals("")){
            if (turn%2 == 0){
                llBUT.setText("X");
            } else {
                llBUT.setText("O");
            }
            turn++;
            checkWin();
            updateMove();
        }
    }//GEN-LAST:event_llBUTActionPerformed

    private void lmBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lmBUTActionPerformed
        if (lmBUT.getText().equals("")){
            if (turn%2 == 0){
                lmBUT.setText("X");
            } else {
                lmBUT.setText("O");
            }
            turn++;
            checkWin();
            updateMove();
        }
    }//GEN-LAST:event_lmBUTActionPerformed

    private void lrBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lrBUTActionPerformed
        if (lrBUT.getText().equals("")){
            if (turn%2 == 0){
                lrBUT.setText("X");
            } else {
                lrBUT.setText("O");
            }
            turn++;
            checkWin();
            updateMove();
        }
    }//GEN-LAST:event_lrBUTActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton llBUT;
    private javax.swing.JButton lmBUT;
    private javax.swing.JButton lrBUT;
    private javax.swing.JButton mBUT;
    private javax.swing.JButton mlBUT;
    private javax.swing.JButton mrBUT;
    private javax.swing.JLabel numTiesLBL;
    private javax.swing.JLabel playeroLBL;
    private javax.swing.JLabel playerxLBL;
    private javax.swing.JButton resetBUT;
    private javax.swing.JPanel scorePNL;
    private javax.swing.JLabel scoreoLBL;
    private javax.swing.JLabel scorexLBL;
    private javax.swing.JLabel statusLBL;
    private javax.swing.JLabel tieLBL;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JPanel titlePNL;
    private javax.swing.JButton ulBUT;
    private javax.swing.JButton umBUT;
    private javax.swing.JButton urBUT;
    // End of variables declaration//GEN-END:variables
}
