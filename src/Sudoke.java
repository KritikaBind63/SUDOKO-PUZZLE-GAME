
import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Sudoke extends javax.swing.JFrame {

    /**
     * Creates new form Sudoke
     */
    
    private String turn="1";
    private boolean globalflag=true;
    public String solvedBoard[][]={
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"},
    };
    
    public Sudoke() {
        initComponents();
    }
    public void resetBoard()
    {
        JButton buttons[]={txtbt4,txtbt7,txtbt8,txtbt9,txtbt10,txtbt14,txtbt15,
        txtbt16,txtbt18,txtbt19,txtbt21,txtbt23,txtbt26,txtbt32,txtbt33,txtbt35,
        txtbt38,txtbt39,txtbt43,txtbt44,txtbt47,txtbt49,txtbt50,txtbt56,txtbt59,
        txtbt61,txtbt63,txtbt64,txtbt66,txtbt67,txtbt68,txtbt72,
        txtbt73,txtbt74,txtbt75,txtbt78};
        JButton board[][]={
            {txtbt1,txtbt2,txtbt3,txtbt4,txtbt5,txtbt6,txtbt7,txtbt8,txtbt9},
            {txtbt10,txtbt11,txtbt12,txtbt13,txtbt14,txtbt15,txtbt16,txtbt17,txtbt18},
            {txtbt19,txtbt20,txtbt21,txtbt22,txtbt23,txtbt24,txtbt25,txtbt26,txtbt27},
            {txtbt28,txtbt29,txtbt30,txtbt31,txtbt32,txtbt33,txtbt34,txtbt35,txtbt36},
            {txtbt37,txtbt38,txtbt39,txtbt40,txtbt41,txtbt42,txtbt43,txtbt44,txtbt45},
            {txtbt46,txtbt47,txtbt48,txtbt49,txtbt50,txtbt51,txtbt52,txtbt53,txtbt54},
            {txtbt55,txtbt56,txtbt57,txtbt58,txtbt59,txtbt60,txtbt61,txtbt62,txtbt63},
            {txtbt64,txtbt65,txtbt66,txtbt67,txtbt68,txtbt69,txtbt70,txtbt71,txtbt72},
            {txtbt73,txtbt74,txtbt75,txtbt76,txtbt77,txtbt78,txtbt79,txtbt80,txtbt81},
        };
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                boolean flag=true;
                for(int x=0; x<buttons.length; x++)
                {
                    if(board[i][j]==buttons[x])
                        flag=false;
                }
                if(flag==true)
                {
                    board[i][j].setText("");
                    board[i][j].setBackground(white);
                }
            }
        }
    }
    public void seeSolution()
    {
JButton buttons[]={txtbt4,txtbt7,txtbt8,txtbt9,txtbt10,txtbt14,txtbt15,
        txtbt16,txtbt18,txtbt19,txtbt21,txtbt23,txtbt26,txtbt32,txtbt33,txtbt35,
        txtbt38,txtbt39,txtbt43,txtbt44,txtbt47,txtbt49,txtbt50,txtbt56,txtbt59,
        txtbt61,txtbt63,txtbt64,txtbt66,txtbt67,txtbt68,txtbt72,
        txtbt73,txtbt74,txtbt75,txtbt78};
        JButton board[][]={
            {txtbt1,txtbt2,txtbt3,txtbt4,txtbt5,txtbt6,txtbt7,txtbt8,txtbt9},
             {txtbt10,txtbt11,txtbt12,txtbt13,txtbt14,txtbt15,txtbt16,txtbt17,txtbt18},
              {txtbt19,txtbt20,txtbt21,txtbt22,txtbt23,txtbt24,txtbt25,txtbt26,txtbt27},
            {txtbt28,txtbt29,txtbt30,txtbt31,txtbt32,txtbt33,txtbt34,txtbt35,txtbt36},
            {txtbt37,txtbt38,txtbt39,txtbt40,txtbt41,txtbt42,txtbt43,txtbt44,txtbt45},
            {txtbt46,txtbt47,txtbt48,txtbt49,txtbt50,txtbt51,txtbt52,txtbt53,txtbt54},
            {txtbt55,txtbt56,txtbt57,txtbt58,txtbt59,txtbt60,txtbt61,txtbt62,txtbt63},
            {txtbt64,txtbt65,txtbt66,txtbt67,txtbt68,txtbt69,txtbt70,txtbt71,txtbt72},
            {txtbt73,txtbt74,txtbt75,txtbt76,txtbt77,txtbt78,txtbt79,txtbt80,txtbt81},
        };
        if(globalflag==true)
        {
            globalflag=false;
            solutionbtn.setText("HIDE SOLU");
            for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                boolean flag=true;
                for(int x=0; x<buttons.length; x++)
                {
                    if(board[i][j]==buttons[x])
                        flag=false;
                }
                if(flag==true)
                {
                    board[i][j].setText(solvedBoard[i][j]);
                    board[i][j].setForeground(white);
                    board[i][j].setBackground(black);
                }
            }
        }
            
            
        }
        else
            {
                solutionbtn.setText("SOLUTION");
                globalflag=true;
                    resetBoard();
             }
    }
        public void chechMoves()
        {
            JButton buttons[]={txtbt4,txtbt7,txtbt8,txtbt9,txtbt10,txtbt14,txtbt15,
        txtbt16,txtbt18,txtbt19,txtbt21,txtbt23,txtbt26,txtbt32,txtbt33,txtbt35,
        txtbt38,txtbt39,txtbt43,txtbt44,txtbt47,txtbt49,txtbt50,txtbt56,txtbt59,
        txtbt61,txtbt63,txtbt64,txtbt66,txtbt67,txtbt68,txtbt72,
        txtbt73,txtbt74,txtbt75,txtbt78};
        JButton board[][]={
            {txtbt1,txtbt2,txtbt3,txtbt4,txtbt5,txtbt6,txtbt7,txtbt8,txtbt9},
             {txtbt10,txtbt11,txtbt12,txtbt13,txtbt14,txtbt15,txtbt16,txtbt17,txtbt18},
              {txtbt19,txtbt20,txtbt21,txtbt22,txtbt23,txtbt24,txtbt25,txtbt26,txtbt27},
            {txtbt28,txtbt29,txtbt30,txtbt31,txtbt32,txtbt33,txtbt34,txtbt35,txtbt36},
            {txtbt37,txtbt38,txtbt39,txtbt40,txtbt41,txtbt42,txtbt43,txtbt44,txtbt45},
            {txtbt46,txtbt47,txtbt48,txtbt49,txtbt50,txtbt51,txtbt52,txtbt53,txtbt54},
            {txtbt55,txtbt56,txtbt57,txtbt58,txtbt59,txtbt60,txtbt61,txtbt62,txtbt63},
            {txtbt64,txtbt65,txtbt66,txtbt67,txtbt68,txtbt69,txtbt70,txtbt71,txtbt72},
            {txtbt73,txtbt74,txtbt75,txtbt76,txtbt77,txtbt78,txtbt79,txtbt80,txtbt81},
        };
        for(int i=0; i<9; i++){
        for(int j=0; j<9; j++)
        {
            if(board[i][j].getText()!="" && board[i][j].getText()!=solvedBoard[i][j])
            {
                board[i][j].setBackground(red);
            }
        }
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

        jPanel1 = new javax.swing.JPanel();
        txtbt1 = new javax.swing.JButton();
        txtbt2 = new javax.swing.JButton();
        txtbt3 = new javax.swing.JButton();
        txtbt10 = new javax.swing.JButton();
        txtbt11 = new javax.swing.JButton();
        txtbt12 = new javax.swing.JButton();
        txtbt19 = new javax.swing.JButton();
        txtbt20 = new javax.swing.JButton();
        txtbt21 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtbt28 = new javax.swing.JButton();
        txtbt29 = new javax.swing.JButton();
        txtbt30 = new javax.swing.JButton();
        txtbt37 = new javax.swing.JButton();
        txtbt38 = new javax.swing.JButton();
        txtbt39 = new javax.swing.JButton();
        txtbt46 = new javax.swing.JButton();
        txtbt47 = new javax.swing.JButton();
        txtbt48 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtbt55 = new javax.swing.JButton();
        txtbt56 = new javax.swing.JButton();
        txtbt57 = new javax.swing.JButton();
        txtbt64 = new javax.swing.JButton();
        txtbt65 = new javax.swing.JButton();
        txtbt66 = new javax.swing.JButton();
        txtbt73 = new javax.swing.JButton();
        txtbt74 = new javax.swing.JButton();
        txtbt75 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtbt4 = new javax.swing.JButton();
        txtbt5 = new javax.swing.JButton();
        txtbt6 = new javax.swing.JButton();
        txtbt13 = new javax.swing.JButton();
        txtbt14 = new javax.swing.JButton();
        txtbt15 = new javax.swing.JButton();
        txtbt22 = new javax.swing.JButton();
        txtbt23 = new javax.swing.JButton();
        txtbt24 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtbt31 = new javax.swing.JButton();
        txtbt32 = new javax.swing.JButton();
        txtbt33 = new javax.swing.JButton();
        txtbt40 = new javax.swing.JButton();
        txtbt41 = new javax.swing.JButton();
        txtbt42 = new javax.swing.JButton();
        txtbt49 = new javax.swing.JButton();
        txtbt50 = new javax.swing.JButton();
        txtbt51 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtbt58 = new javax.swing.JButton();
        txtbt59 = new javax.swing.JButton();
        txtbt60 = new javax.swing.JButton();
        txtbt67 = new javax.swing.JButton();
        txtbt68 = new javax.swing.JButton();
        txtbt69 = new javax.swing.JButton();
        txtbt76 = new javax.swing.JButton();
        txtbt77 = new javax.swing.JButton();
        txtbt78 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtbt7 = new javax.swing.JButton();
        txtbt8 = new javax.swing.JButton();
        txtbt9 = new javax.swing.JButton();
        txtbt16 = new javax.swing.JButton();
        txtbt17 = new javax.swing.JButton();
        txtbt18 = new javax.swing.JButton();
        txtbt25 = new javax.swing.JButton();
        txtbt26 = new javax.swing.JButton();
        txtbt27 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        txtbt34 = new javax.swing.JButton();
        txtbt35 = new javax.swing.JButton();
        txtbt36 = new javax.swing.JButton();
        txtbt43 = new javax.swing.JButton();
        txtbt44 = new javax.swing.JButton();
        txtbt45 = new javax.swing.JButton();
        txtbt52 = new javax.swing.JButton();
        txtbt53 = new javax.swing.JButton();
        txtbt54 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        txtbt61 = new javax.swing.JButton();
        txtbt62 = new javax.swing.JButton();
        txtbt63 = new javax.swing.JButton();
        txtbt70 = new javax.swing.JButton();
        txtbt71 = new javax.swing.JButton();
        txtbt72 = new javax.swing.JButton();
        txtbt79 = new javax.swing.JButton();
        txtbt80 = new javax.swing.JButton();
        txtbt81 = new javax.swing.JButton();
        selectionbt1 = new javax.swing.JButton();
        selectionbt2 = new javax.swing.JButton();
        selectionbt3 = new javax.swing.JButton();
        selectionbt4 = new javax.swing.JButton();
        selectionbt5 = new javax.swing.JButton();
        selectionbt6 = new javax.swing.JButton();
        selectionbt7 = new javax.swing.JButton();
        selectionbt8 = new javax.swing.JButton();
        selectionbt9 = new javax.swing.JButton();
        checkmovesbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        solutionbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoke Puzzle Game");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt1ActionPerformed(evt);
            }
        });

        txtbt2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt2ActionPerformed(evt);
            }
        });

        txtbt3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt3ActionPerformed(evt);
            }
        });

        txtbt10.setBackground(new java.awt.Color(153, 153, 255));
        txtbt10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt10.setText("4");
        txtbt10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt11ActionPerformed(evt);
            }
        });

        txtbt12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt12ActionPerformed(evt);
            }
        });

        txtbt19.setBackground(new java.awt.Color(153, 153, 255));
        txtbt19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt19.setText("7");
        txtbt19.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt20.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt20ActionPerformed(evt);
            }
        });

        txtbt21.setBackground(new java.awt.Color(153, 153, 255));
        txtbt21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt21.setText("6");
        txtbt21.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbt10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtbt19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbt28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt28.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt28ActionPerformed(evt);
            }
        });

        txtbt29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt29.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt29ActionPerformed(evt);
            }
        });

        txtbt30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt30.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt30ActionPerformed(evt);
            }
        });

        txtbt37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt37.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt37ActionPerformed(evt);
            }
        });

        txtbt38.setBackground(new java.awt.Color(153, 153, 255));
        txtbt38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt38.setText("3");
        txtbt38.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt39.setBackground(new java.awt.Color(153, 153, 255));
        txtbt39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt39.setText("4");
        txtbt39.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt46.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt46ActionPerformed(evt);
            }
        });

        txtbt47.setBackground(new java.awt.Color(153, 153, 255));
        txtbt47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt47.setText("6");
        txtbt47.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt48.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtbt28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtbt37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtbt46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbt55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt55.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt55ActionPerformed(evt);
            }
        });

        txtbt56.setBackground(new java.awt.Color(153, 153, 255));
        txtbt56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt56.setText("4");
        txtbt56.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt56ActionPerformed(evt);
            }
        });

        txtbt57.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt57.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt57ActionPerformed(evt);
            }
        });

        txtbt64.setBackground(new java.awt.Color(153, 153, 255));
        txtbt64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt64.setText("3");
        txtbt64.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt65.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt65ActionPerformed(evt);
            }
        });

        txtbt66.setBackground(new java.awt.Color(153, 153, 255));
        txtbt66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt66.setText("5");
        txtbt66.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt66ActionPerformed(evt);
            }
        });

        txtbt73.setBackground(new java.awt.Color(153, 153, 255));
        txtbt73.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt73.setText("6");
        txtbt73.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt73ActionPerformed(evt);
            }
        });

        txtbt74.setBackground(new java.awt.Color(153, 153, 255));
        txtbt74.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt74.setText("8");
        txtbt74.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt74ActionPerformed(evt);
            }
        });

        txtbt75.setBackground(new java.awt.Color(153, 153, 255));
        txtbt75.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt75.setText("9");
        txtbt75.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtbt55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtbt64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtbt73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt57, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt56, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt55, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt65, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt66, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt73, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt74, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt75, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbt4.setBackground(new java.awt.Color(153, 153, 255));
        txtbt4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt4.setText("5");
        txtbt4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt5ActionPerformed(evt);
            }
        });

        txtbt6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt6ActionPerformed(evt);
            }
        });

        txtbt13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt13ActionPerformed(evt);
            }
        });

        txtbt14.setBackground(new java.awt.Color(153, 153, 255));
        txtbt14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt14.setText("7");
        txtbt14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt15.setBackground(new java.awt.Color(153, 153, 255));
        txtbt15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt15.setText("8");
        txtbt15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt22.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt22ActionPerformed(evt);
            }
        });

        txtbt23.setBackground(new java.awt.Color(153, 153, 255));
        txtbt23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt23.setText("4");
        txtbt23.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtbt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtbt13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtbt22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbt31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt31.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt31ActionPerformed(evt);
            }
        });

        txtbt32.setBackground(new java.awt.Color(153, 153, 255));
        txtbt32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt32.setText("3");
        txtbt32.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt33.setBackground(new java.awt.Color(153, 153, 255));
        txtbt33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt33.setText("5");
        txtbt33.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt40.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt40ActionPerformed(evt);
            }
        });

        txtbt41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt41.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt41ActionPerformed(evt);
            }
        });

        txtbt42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt42.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt42ActionPerformed(evt);
            }
        });

        txtbt49.setBackground(new java.awt.Color(153, 153, 255));
        txtbt49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt49.setText("1");
        txtbt49.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt50.setBackground(new java.awt.Color(153, 153, 255));
        txtbt50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt50.setText("8");
        txtbt50.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt51.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt51ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtbt31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtbt40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtbt49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt51, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbt58.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt58.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt58ActionPerformed(evt);
            }
        });

        txtbt59.setBackground(new java.awt.Color(153, 153, 255));
        txtbt59.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt59.setText("5");
        txtbt59.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt59ActionPerformed(evt);
            }
        });

        txtbt60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt60.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt60ActionPerformed(evt);
            }
        });

        txtbt67.setBackground(new java.awt.Color(153, 153, 255));
        txtbt67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt67.setText("9");
        txtbt67.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt67ActionPerformed(evt);
            }
        });

        txtbt68.setBackground(new java.awt.Color(153, 153, 255));
        txtbt68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt68.setText("6");
        txtbt68.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt69.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt69ActionPerformed(evt);
            }
        });

        txtbt76.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt76.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt76ActionPerformed(evt);
            }
        });

        txtbt77.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt77.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt77ActionPerformed(evt);
            }
        });

        txtbt78.setBackground(new java.awt.Color(153, 153, 255));
        txtbt78.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt78.setText("1");
        txtbt78.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtbt58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtbt67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtbt76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt59, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt67, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt69, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt76, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt77, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt78, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbt7.setBackground(new java.awt.Color(153, 153, 255));
        txtbt7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt7.setText("7");
        txtbt7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt8.setBackground(new java.awt.Color(153, 153, 255));
        txtbt8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt8.setText("3");
        txtbt8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt8ActionPerformed(evt);
            }
        });

        txtbt9.setBackground(new java.awt.Color(153, 153, 255));
        txtbt9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt9.setText("4");
        txtbt9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt16.setBackground(new java.awt.Color(153, 153, 255));
        txtbt16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt16.setText("5");
        txtbt16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt16ActionPerformed(evt);
            }
        });

        txtbt17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt17ActionPerformed(evt);
            }
        });

        txtbt18.setBackground(new java.awt.Color(153, 153, 255));
        txtbt18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt18.setText("9");
        txtbt18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt25.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt25ActionPerformed(evt);
            }
        });

        txtbt26.setBackground(new java.awt.Color(153, 153, 255));
        txtbt26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt26.setText("2");
        txtbt26.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt27.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtbt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtbt16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtbt25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbt34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt34.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt34ActionPerformed(evt);
            }
        });

        txtbt35.setBackground(new java.awt.Color(153, 153, 255));
        txtbt35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt35.setText("9");
        txtbt35.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt35ActionPerformed(evt);
            }
        });

        txtbt36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt36.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt36ActionPerformed(evt);
            }
        });

        txtbt43.setBackground(new java.awt.Color(153, 153, 255));
        txtbt43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt43.setText("2");
        txtbt43.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt43ActionPerformed(evt);
            }
        });

        txtbt44.setBackground(new java.awt.Color(153, 153, 255));
        txtbt44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt44.setText("8");
        txtbt44.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt45.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt45ActionPerformed(evt);
            }
        });

        txtbt52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt52.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt52ActionPerformed(evt);
            }
        });

        txtbt53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt53.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt53ActionPerformed(evt);
            }
        });

        txtbt54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt54.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt54ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtbt34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtbt43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(txtbt52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt52, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt53, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt54, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbt61.setBackground(new java.awt.Color(153, 153, 255));
        txtbt61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt61.setText("9");
        txtbt61.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt62.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt62ActionPerformed(evt);
            }
        });

        txtbt63.setBackground(new java.awt.Color(153, 153, 255));
        txtbt63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt63.setText("6");
        txtbt63.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtbt70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt70.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt70ActionPerformed(evt);
            }
        });

        txtbt71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt71.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt71ActionPerformed(evt);
            }
        });

        txtbt72.setBackground(new java.awt.Color(153, 153, 255));
        txtbt72.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt72.setText("2");
        txtbt72.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt72ActionPerformed(evt);
            }
        });

        txtbt79.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt79.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt79ActionPerformed(evt);
            }
        });

        txtbt80.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt80.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt80ActionPerformed(evt);
            }
        });

        txtbt81.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbt81.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtbt81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbt81ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtbt61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtbt70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtbt79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbt81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt62, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt61, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt70, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt71, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt72, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbt79, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt80, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbt81, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selectionbt1.setBackground(new java.awt.Color(51, 51, 255));
        selectionbt1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectionbt1.setForeground(new java.awt.Color(255, 255, 255));
        selectionbt1.setText("1");
        selectionbt1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectionbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbt1ActionPerformed(evt);
            }
        });

        selectionbt2.setBackground(new java.awt.Color(0, 0, 0));
        selectionbt2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectionbt2.setForeground(new java.awt.Color(255, 255, 255));
        selectionbt2.setText("2");
        selectionbt2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectionbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbt2ActionPerformed(evt);
            }
        });

        selectionbt3.setBackground(new java.awt.Color(0, 0, 0));
        selectionbt3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectionbt3.setForeground(new java.awt.Color(255, 255, 255));
        selectionbt3.setText("3");
        selectionbt3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectionbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbt3ActionPerformed(evt);
            }
        });

        selectionbt4.setBackground(new java.awt.Color(0, 0, 0));
        selectionbt4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectionbt4.setForeground(new java.awt.Color(255, 255, 255));
        selectionbt4.setText("4");
        selectionbt4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectionbt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbt4ActionPerformed(evt);
            }
        });

        selectionbt5.setBackground(new java.awt.Color(0, 0, 0));
        selectionbt5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectionbt5.setForeground(new java.awt.Color(255, 255, 255));
        selectionbt5.setText("5");
        selectionbt5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectionbt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbt5ActionPerformed(evt);
            }
        });

        selectionbt6.setBackground(new java.awt.Color(0, 0, 0));
        selectionbt6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectionbt6.setForeground(new java.awt.Color(255, 255, 255));
        selectionbt6.setText("6");
        selectionbt6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectionbt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbt6ActionPerformed(evt);
            }
        });

        selectionbt7.setBackground(new java.awt.Color(0, 0, 0));
        selectionbt7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectionbt7.setForeground(new java.awt.Color(255, 255, 255));
        selectionbt7.setText("7");
        selectionbt7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectionbt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbt7ActionPerformed(evt);
            }
        });

        selectionbt8.setBackground(new java.awt.Color(0, 0, 0));
        selectionbt8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectionbt8.setForeground(new java.awt.Color(255, 255, 255));
        selectionbt8.setText("8");
        selectionbt8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectionbt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbt8ActionPerformed(evt);
            }
        });

        selectionbt9.setBackground(new java.awt.Color(0, 0, 0));
        selectionbt9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectionbt9.setForeground(new java.awt.Color(255, 255, 255));
        selectionbt9.setText("9");
        selectionbt9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        selectionbt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbt9ActionPerformed(evt);
            }
        });

        checkmovesbtn.setBackground(new java.awt.Color(153, 255, 153));
        checkmovesbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkmovesbtn.setText("CHECK MOVES");
        checkmovesbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        checkmovesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkmovesbtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(102, 204, 255));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        solutionbtn.setBackground(new java.awt.Color(255, 255, 102));
        solutionbtn.setText("SOLUTION");
        solutionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 153, 51));
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(selectionbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(selectionbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selectionbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selectionbt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(selectionbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selectionbt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selectionbt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(selectionbt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selectionbt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(exitbtn)))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(solutionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(checkmovesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectionbt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkmovesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solutionbtn)
                    .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectionbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbt2ActionPerformed
        // TODO add your handling code here:
        turn="2";
        selectionbt2.setBackground(blue);
        selectionbt1.setBackground(black);
        selectionbt5.setBackground(black);
        selectionbt3.setBackground(black);
        selectionbt4.setBackground(black);
        selectionbt6.setBackground(black);
        selectionbt7.setBackground(black);
        selectionbt8.setBackground(black);
        selectionbt9.setBackground(black);
    }//GEN-LAST:event_selectionbt2ActionPerformed

    private void selectionbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbt3ActionPerformed
        // TODO add your handling code here:
        turn="3";
        selectionbt3.setBackground(blue);
        selectionbt1.setBackground(black);
        selectionbt5.setBackground(black);
        selectionbt2.setBackground(black);
        selectionbt4.setBackground(black);
        selectionbt6.setBackground(black);
        selectionbt7.setBackground(black);
        selectionbt8.setBackground(black);
        selectionbt9.setBackground(black);
    }//GEN-LAST:event_selectionbt3ActionPerformed

    private void selectionbt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbt5ActionPerformed
        // TODO add your handling code here
        turn="5";
        selectionbt5.setBackground(blue);
        selectionbt1.setBackground(black);
        selectionbt2.setBackground(black);
        selectionbt3.setBackground(black);
        selectionbt4.setBackground(black);
        //selectionbt5.setBackground(black);
        selectionbt6.setBackground(black);
        selectionbt7.setBackground(black);
        selectionbt8.setBackground(black);
        selectionbt9.setBackground(black);
        
        
    }//GEN-LAST:event_selectionbt5ActionPerformed

    private void selectionbt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbt6ActionPerformed
        // TODO add your handling code here:
        turn="6";
        selectionbt6.setBackground(blue);
        selectionbt1.setBackground(black);
        selectionbt5.setBackground(black);
        selectionbt3.setBackground(black);
        selectionbt4.setBackground(black);
        selectionbt2.setBackground(black);
        selectionbt7.setBackground(black);
        selectionbt8.setBackground(black);
        selectionbt9.setBackground(black);
    }//GEN-LAST:event_selectionbt6ActionPerformed

    private void selectionbt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbt8ActionPerformed
        // TODO add your handling code here:
        turn="8";
        selectionbt8.setBackground(blue);
        selectionbt1.setBackground(black);
        selectionbt5.setBackground(black);
        selectionbt3.setBackground(black);
        selectionbt4.setBackground(black);
        selectionbt6.setBackground(black);
        selectionbt7.setBackground(black);
        selectionbt2.setBackground(black);
        selectionbt9.setBackground(black);
    }//GEN-LAST:event_selectionbt8ActionPerformed

    private void selectionbt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbt9ActionPerformed
        // TODO add your handling code here:
        turn="9";
        selectionbt9.setBackground(blue);
        selectionbt1.setBackground(black);
        selectionbt5.setBackground(black);
        selectionbt3.setBackground(black);
        selectionbt4.setBackground(black);
        selectionbt6.setBackground(black);
        selectionbt7.setBackground(black);
        selectionbt8.setBackground(black);
        selectionbt2.setBackground(black);
    }//GEN-LAST:event_selectionbt9ActionPerformed

    private void txtbt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt8ActionPerformed

    private void txtbt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt16ActionPerformed

    private void txtbt43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt43ActionPerformed

    private void txtbt56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt56ActionPerformed

    private void txtbt66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt66ActionPerformed

    private void txtbt73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt73ActionPerformed

    private void txtbt74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt74ActionPerformed

    private void txtbt67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt67ActionPerformed

    private void txtbt69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt69ActionPerformed
        // TODO add your handling code here:
        txtbt69.setText(turn);
        txtbt69.setBackground(white);
    }//GEN-LAST:event_txtbt69ActionPerformed

    private void txtbt59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt59ActionPerformed

    private void txtbt72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt72ActionPerformed

    private void txtbt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt27ActionPerformed
txtbt27.setText(turn);
        txtbt27.setBackground(white);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt27ActionPerformed

    private void txtbt35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbt35ActionPerformed

    private void txtbt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt31ActionPerformed
        // TODO add your handling code here:
        txtbt31.setText(turn);
        txtbt31.setBackground(white);
    }//GEN-LAST:event_txtbt31ActionPerformed

    private void selectionbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbt1ActionPerformed
        // TODO add your handling code here:
        turn="1";
        selectionbt1.setBackground(blue);
        selectionbt2.setBackground(black);
        selectionbt5.setBackground(black);
        selectionbt3.setBackground(black);
        selectionbt4.setBackground(black);
        selectionbt6.setBackground(black);
        selectionbt7.setBackground(black);
        selectionbt8.setBackground(black);
        selectionbt9.setBackground(black);
    }//GEN-LAST:event_selectionbt1ActionPerformed

    private void selectionbt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbt4ActionPerformed
        // TODO add your handling code here:
        turn="4";
        selectionbt4.setBackground(blue);
        selectionbt1.setBackground(black);
        selectionbt5.setBackground(black);
        selectionbt3.setBackground(black);
        selectionbt2.setBackground(black);
        selectionbt6.setBackground(black);
        selectionbt7.setBackground(black);
        selectionbt8.setBackground(black);
        selectionbt9.setBackground(black);
    }//GEN-LAST:event_selectionbt4ActionPerformed

    private void selectionbt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbt7ActionPerformed
        // TODO add your handling code here:
        turn="7";
        selectionbt7.setBackground(blue);
        selectionbt1.setBackground(black);
        selectionbt5.setBackground(black);
        selectionbt3.setBackground(black);
        selectionbt4.setBackground(black);
        selectionbt6.setBackground(black);
        selectionbt2.setBackground(black);
        selectionbt8.setBackground(black);
        selectionbt9.setBackground(black);
    }//GEN-LAST:event_selectionbt7ActionPerformed

    private void txtbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt1ActionPerformed
        // TODO add your handling code here:
        txtbt1.setText(turn);
        txtbt1.setBackground(white);
    }//GEN-LAST:event_txtbt1ActionPerformed

    private void txtbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt2ActionPerformed
        // TODO add your handling code here:
        txtbt2.setText(turn);
        txtbt2.setBackground(white);
    }//GEN-LAST:event_txtbt2ActionPerformed

    private void txtbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt3ActionPerformed
        // TODO add your handling code here:
        txtbt3.setText(turn);
        txtbt3.setBackground(white);
    }//GEN-LAST:event_txtbt3ActionPerformed

    private void txtbt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt13ActionPerformed
        // TODO add your handling code here:
        txtbt13.setText(turn);
        txtbt13.setBackground(white);
    }//GEN-LAST:event_txtbt13ActionPerformed

    private void txtbt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt5ActionPerformed
        // TODO add your handling code here:
        txtbt5.setText(turn);
        txtbt5.setBackground(white);
    }//GEN-LAST:event_txtbt5ActionPerformed

    private void txtbt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt6ActionPerformed
        // TODO add your handling code here:
        txtbt6.setText(turn);
        txtbt6.setBackground(white);
    }//GEN-LAST:event_txtbt6ActionPerformed

    private void txtbt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt11ActionPerformed
        // TODO add your handling code here:
        txtbt11.setText(turn);
        txtbt11.setBackground(white);
    }//GEN-LAST:event_txtbt11ActionPerformed

    private void txtbt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt12ActionPerformed
        // TODO add your handling code here:
        txtbt12.setText(turn);
        txtbt12.setBackground(white);
    }//GEN-LAST:event_txtbt12ActionPerformed

    private void txtbt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt17ActionPerformed
        // TODO add your handling code here:
        txtbt17.setText(turn);
        txtbt17.setBackground(white);
    }//GEN-LAST:event_txtbt17ActionPerformed

    private void txtbt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt20ActionPerformed
        // TODO add your handling code here:
        txtbt20.setText(turn);
        txtbt20.setBackground(white);
    }//GEN-LAST:event_txtbt20ActionPerformed

    private void txtbt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt22ActionPerformed
        // TODO add your handling code here:
        txtbt22.setText(turn);
        txtbt22.setBackground(white);
    }//GEN-LAST:event_txtbt22ActionPerformed

    private void txtbt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt24ActionPerformed
        // TODO add your handling code here:
        txtbt24.setText(turn);
        txtbt24.setBackground(white);
    }//GEN-LAST:event_txtbt24ActionPerformed

    private void txtbt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt25ActionPerformed
        // TODO add your handling code here:
        txtbt25.setText(turn);
        txtbt25.setBackground(white);
    }//GEN-LAST:event_txtbt25ActionPerformed

    private void txtbt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt28ActionPerformed
        // TODO add your handling code here:
        txtbt28.setText(turn);
        txtbt28.setBackground(white);
    }//GEN-LAST:event_txtbt28ActionPerformed

    private void txtbt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt29ActionPerformed
        // TODO add your handling code here:
        txtbt29.setText(turn);
        txtbt29.setBackground(white);
    }//GEN-LAST:event_txtbt29ActionPerformed

    private void txtbt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt30ActionPerformed
        // TODO add your handling code here:
        txtbt30.setText(turn);
        txtbt30.setBackground(white);
    }//GEN-LAST:event_txtbt30ActionPerformed

    private void txtbt34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt34ActionPerformed
        // TODO add your handling code here:
        txtbt34.setText(turn);
        txtbt34.setBackground(white);
    }//GEN-LAST:event_txtbt34ActionPerformed

    private void txtbt36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt36ActionPerformed
        // TODO add your handling code here:
        txtbt36.setText(turn);
        txtbt36.setBackground(white);
    }//GEN-LAST:event_txtbt36ActionPerformed

    private void txtbt37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt37ActionPerformed
        // TODO add your handling code here:
        txtbt37.setText(turn);
        txtbt37.setBackground(white);
    }//GEN-LAST:event_txtbt37ActionPerformed

    private void txtbt40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt40ActionPerformed
        // TODO add your handling code here:
        txtbt40.setText(turn);
        txtbt40.setBackground(white);
    }//GEN-LAST:event_txtbt40ActionPerformed

    private void txtbt41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt41ActionPerformed
        // TODO add your handling code here:
        txtbt41.setText(turn);
        txtbt41.setBackground(white);
    }//GEN-LAST:event_txtbt41ActionPerformed

    private void txtbt42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt42ActionPerformed
        // TODO add your handling code here:
        txtbt42.setText(turn);
        txtbt42.setBackground(white);
    }//GEN-LAST:event_txtbt42ActionPerformed

    private void txtbt45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt45ActionPerformed
        // TODO add your handling code here:
        txtbt45.setText(turn);
        txtbt45.setBackground(white);
    }//GEN-LAST:event_txtbt45ActionPerformed

    private void txtbt46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt46ActionPerformed
        // TODO add your handling code here:
        txtbt46.setText(turn);
        txtbt46.setBackground(white);
    }//GEN-LAST:event_txtbt46ActionPerformed

    private void txtbt48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt48ActionPerformed
        // TODO add your handling code here:
        txtbt48.setText(turn);
        txtbt48.setBackground(white);
    }//GEN-LAST:event_txtbt48ActionPerformed

    private void txtbt51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt51ActionPerformed
        // TODO add your handling code here:
        txtbt51.setText(turn);
        txtbt51.setBackground(white);
    }//GEN-LAST:event_txtbt51ActionPerformed

    private void txtbt52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt52ActionPerformed
        // TODO add your handling code here:
        txtbt52.setText(turn);
        txtbt52.setBackground(white);
    }//GEN-LAST:event_txtbt52ActionPerformed

    private void txtbt53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt53ActionPerformed
        // TODO add your handling code here:
        txtbt53.setText(turn);
        txtbt53.setBackground(white);
    }//GEN-LAST:event_txtbt53ActionPerformed

    private void txtbt54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt54ActionPerformed
        // TODO add your handling code here:
        txtbt54.setText(turn);
        txtbt54.setBackground(white);
    }//GEN-LAST:event_txtbt54ActionPerformed

    private void txtbt55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt55ActionPerformed
        // TODO add your handling code here:
        txtbt55.setText(turn);
        txtbt55.setBackground(white);
    }//GEN-LAST:event_txtbt55ActionPerformed

    private void txtbt57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt57ActionPerformed
        // TODO add your handling code here:
        txtbt57.setText(turn);
        txtbt57.setBackground(white);
    }//GEN-LAST:event_txtbt57ActionPerformed

    private void txtbt58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt58ActionPerformed
        // TODO add your handling code here:
        txtbt58.setText(turn);
        txtbt58.setBackground(white);
    }//GEN-LAST:event_txtbt58ActionPerformed

    private void txtbt60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt60ActionPerformed
        // TODO add your handling code here
        txtbt60.setText(turn);
        txtbt60.setBackground(white);
    }//GEN-LAST:event_txtbt60ActionPerformed

    private void txtbt62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt62ActionPerformed
        // TODO add your handling code here:
        txtbt62.setText(turn);
        txtbt62.setBackground(white);
    }//GEN-LAST:event_txtbt62ActionPerformed

    private void txtbt65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt65ActionPerformed
        // TODO add your handling code here:
        txtbt65.setText(turn);
        txtbt65.setBackground(white);
    }//GEN-LAST:event_txtbt65ActionPerformed

    private void txtbt70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt70ActionPerformed
        // TODO add your handling code here:
        txtbt70.setText(turn);
        txtbt70.setBackground(white);
    }//GEN-LAST:event_txtbt70ActionPerformed

    private void txtbt71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt71ActionPerformed
        // TODO add your handling code here:
        txtbt71.setText(turn);
        txtbt71.setBackground(white);
    }//GEN-LAST:event_txtbt71ActionPerformed

    private void txtbt76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt76ActionPerformed
        // TODO add your handling code here:
        txtbt76.setText(turn);
        txtbt76.setBackground(white);
    }//GEN-LAST:event_txtbt76ActionPerformed

    private void txtbt77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt77ActionPerformed
        // TODO add your handling code here:
        txtbt77.setText(turn);
        txtbt77.setBackground(white);
    }//GEN-LAST:event_txtbt77ActionPerformed

    private void txtbt79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt79ActionPerformed
        // TODO add your handling code here:
        txtbt79.setText(turn);
        txtbt79.setBackground(white);
    }//GEN-LAST:event_txtbt79ActionPerformed

    private void txtbt80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt80ActionPerformed
        // TODO add your handling code here:
        txtbt80.setText(turn);
        txtbt80.setBackground(white);
    }//GEN-LAST:event_txtbt80ActionPerformed

    private void txtbt81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbt81ActionPerformed
        // TODO add your handling code here:
        txtbt81.setText(turn);
        txtbt81.setBackground(white);
    }//GEN-LAST:event_txtbt81ActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"continue if you want to exit","SUDOKO PUZZLE GAME",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_exitbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame,"continue if you want to reset","SUDOKO PUZZLE GAME",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
           resetBoard();
        }
        
    }//GEN-LAST:event_resetbtnActionPerformed

    private void solutionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionbtnActionPerformed
        // TODO add your handling code here:
        seeSolution();
    }//GEN-LAST:event_solutionbtnActionPerformed

    private void checkmovesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkmovesbtnActionPerformed
        // TODO add your handling code here:
        chechMoves();
    }//GEN-LAST:event_checkmovesbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Sudoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkmovesbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton selectionbt1;
    private javax.swing.JButton selectionbt2;
    private javax.swing.JButton selectionbt3;
    private javax.swing.JButton selectionbt4;
    private javax.swing.JButton selectionbt5;
    private javax.swing.JButton selectionbt6;
    private javax.swing.JButton selectionbt7;
    private javax.swing.JButton selectionbt8;
    private javax.swing.JButton selectionbt9;
    private javax.swing.JButton solutionbtn;
    private javax.swing.JButton txtbt1;
    private javax.swing.JButton txtbt10;
    private javax.swing.JButton txtbt11;
    private javax.swing.JButton txtbt12;
    private javax.swing.JButton txtbt13;
    private javax.swing.JButton txtbt14;
    private javax.swing.JButton txtbt15;
    private javax.swing.JButton txtbt16;
    private javax.swing.JButton txtbt17;
    private javax.swing.JButton txtbt18;
    private javax.swing.JButton txtbt19;
    private javax.swing.JButton txtbt2;
    private javax.swing.JButton txtbt20;
    private javax.swing.JButton txtbt21;
    private javax.swing.JButton txtbt22;
    private javax.swing.JButton txtbt23;
    private javax.swing.JButton txtbt24;
    private javax.swing.JButton txtbt25;
    private javax.swing.JButton txtbt26;
    private javax.swing.JButton txtbt27;
    private javax.swing.JButton txtbt28;
    private javax.swing.JButton txtbt29;
    private javax.swing.JButton txtbt3;
    private javax.swing.JButton txtbt30;
    private javax.swing.JButton txtbt31;
    private javax.swing.JButton txtbt32;
    private javax.swing.JButton txtbt33;
    private javax.swing.JButton txtbt34;
    private javax.swing.JButton txtbt35;
    private javax.swing.JButton txtbt36;
    private javax.swing.JButton txtbt37;
    private javax.swing.JButton txtbt38;
    private javax.swing.JButton txtbt39;
    private javax.swing.JButton txtbt4;
    private javax.swing.JButton txtbt40;
    private javax.swing.JButton txtbt41;
    private javax.swing.JButton txtbt42;
    private javax.swing.JButton txtbt43;
    private javax.swing.JButton txtbt44;
    private javax.swing.JButton txtbt45;
    private javax.swing.JButton txtbt46;
    private javax.swing.JButton txtbt47;
    private javax.swing.JButton txtbt48;
    private javax.swing.JButton txtbt49;
    private javax.swing.JButton txtbt5;
    private javax.swing.JButton txtbt50;
    private javax.swing.JButton txtbt51;
    private javax.swing.JButton txtbt52;
    private javax.swing.JButton txtbt53;
    private javax.swing.JButton txtbt54;
    private javax.swing.JButton txtbt55;
    private javax.swing.JButton txtbt56;
    private javax.swing.JButton txtbt57;
    private javax.swing.JButton txtbt58;
    private javax.swing.JButton txtbt59;
    private javax.swing.JButton txtbt6;
    private javax.swing.JButton txtbt60;
    private javax.swing.JButton txtbt61;
    private javax.swing.JButton txtbt62;
    private javax.swing.JButton txtbt63;
    private javax.swing.JButton txtbt64;
    private javax.swing.JButton txtbt65;
    private javax.swing.JButton txtbt66;
    private javax.swing.JButton txtbt67;
    private javax.swing.JButton txtbt68;
    private javax.swing.JButton txtbt69;
    private javax.swing.JButton txtbt7;
    private javax.swing.JButton txtbt70;
    private javax.swing.JButton txtbt71;
    private javax.swing.JButton txtbt72;
    private javax.swing.JButton txtbt73;
    private javax.swing.JButton txtbt74;
    private javax.swing.JButton txtbt75;
    private javax.swing.JButton txtbt76;
    private javax.swing.JButton txtbt77;
    private javax.swing.JButton txtbt78;
    private javax.swing.JButton txtbt79;
    private javax.swing.JButton txtbt8;
    private javax.swing.JButton txtbt80;
    private javax.swing.JButton txtbt81;
    private javax.swing.JButton txtbt9;
    // End of variables declaration//GEN-END:variables
}
