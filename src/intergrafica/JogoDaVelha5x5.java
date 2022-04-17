
package intergrafica;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


public class JogoDaVelha5x5 extends javax.swing.JFrame {
       
    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    private final int colorBlock = -16777216;
    private int qtdeBlock;

   
    public JogoDaVelha5x5() {
        initComponents();   
    }
    
    public void BloquearLiberarCampos(boolean acao){
        Component[] componentes = jPanel1.getComponents();
            for(Component componente: componentes){
                componente.setEnabled(acao);
            }
    }
    public void JogadorAtivo(){
      if (Jogador1Ativo == true){
          Jogador1Ativo = false;
          Jogador2Ativo = true;
      }else{
          Jogador1Ativo = true;
          Jogador2Ativo = false;
      }
    }
    
    public void Bloqueio(String posicao) {
        String posicaoUpperCase;
        posicaoUpperCase = posicao.toUpperCase();
        

        switch (posicaoUpperCase) {
            case "A1": {
                A1.setBackground(Color.BLACK);
                break;
            }
            case "A2": {
                A2.setBackground(Color.BLACK);
                break;
            }
            case "A3": {
                A3.setBackground(Color.BLACK);
                break;
            }
            case "A4": {
                A4.setBackground(Color.BLACK);
                break;
            }
            case "A5": {
                A5.setBackground(Color.BLACK);
                break;
            }
            case "B1": {
                B1.setBackground(Color.BLACK);
                break;
            }
            case "B2": {
                B2.setBackground(Color.BLACK);
                break;
            }
            case "B3": {
                B3.setBackground(Color.BLACK);
                break;
            }
            case "B4": {
                B4.setBackground(Color.BLACK);
                break;
            }
            case "B5": {
                B5.setBackground(Color.BLACK);
                break;
            }
            case "C1": {
                C1.setBackground(Color.BLACK);
                break;
            }
            case "C2": {
                C2.setBackground(Color.BLACK);
                break;
            }

            case "C3": {
                C3.setBackground(Color.BLACK);
                break;
            }
            case "C4": {
                C4.setBackground(Color.BLACK);
                break;
            }

            case "C5": {
                C5.setBackground(Color.BLACK);
                break;
            }
            case "D1": {
                D1.setBackground(Color.BLACK);
                break;
            }
            case "D2": {
                D2.setBackground(Color.BLACK);
                break;
            }
            case "D3": {
                D3.setBackground(Color.BLACK);
                break;
            }

            case "D4": {
                D4.setBackground(Color.BLACK);
                break;
            }
            case "D5": {
                D5.setBackground(Color.BLACK);
                break;
            }

            case "E1": {
                E1.setBackground(Color.BLACK);
                break;
            }
            case "E2": {
                E2.setBackground(Color.BLACK);
                break;
            }
            case "E3": {
                E3.setBackground(Color.BLACK);
                break;
            }
            case "E4": {
                E4.setBackground(Color.BLACK);
                break;
            }
            case "E5": {
                E5.setBackground(Color.BLACK);
                break;
            }
            default:
                JOptionPane.showMessageDialog(rootPane,"Posição não encontrada");
                qtdeBlock = qtdeBlock - 1; 
        }
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        A1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        N1 = new javax.swing.JLabel();
        N2 = new javax.swing.JLabel();
        N3 = new javax.swing.JLabel();
        N4 = new javax.swing.JLabel();
        N6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NumeroDeVitoriasDoTicTacToe = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        NumeroDeVitoriasDoAdversario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        NumeroDeEmpate = new javax.swing.JLabel();
        caixaSimbolo = new javax.swing.JTextField();
        SimboloAdversario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SairDoJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabuleiro 5 x  5");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        D1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        E1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        A2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        C2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        D2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        E2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        A3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        C3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        D3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        E3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        A4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        C4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        D4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        E4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });

        A5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        C5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        D5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        E5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });

        A.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        A.setText("A");

        B.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        B.setText("B");

        C.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        C.setText("C");

        D.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        D.setText("D");

        E.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        E.setText("E");

        N1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N1.setText("1");

        N2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N2.setText("2");

        N3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N3.setText("3");

        N4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N4.setText("4");

        N6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N6.setText("5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(N1)
                    .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N3)
                    .addComponent(N2)
                    .addComponent(N6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(A4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(C4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(A3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(D3)
                            .addComponent(D4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(E3)
                            .addComponent(E4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {A1, A2, A3, A4, A5, B1, B2, B3, B4, B5, C1, C2, C3, C4, C5, D1, D2, D3, D4, D5, E1, E2, E3, E4, E5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B)
                            .addComponent(C)
                            .addComponent(D)
                            .addComponent(E))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(E1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(D1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(C1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(A1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B2)
                        .addComponent(C2)
                        .addComponent(D2)
                        .addComponent(E2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B3)
                            .addComponent(A3)
                            .addComponent(C3)
                            .addComponent(D3)
                            .addComponent(E3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A4)
                            .addComponent(B4)
                            .addComponent(C4)
                            .addComponent(D4)
                            .addComponent(E4))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D5)
                            .addComponent(C5)
                            .addComponent(B5)
                            .addComponent(A5)
                            .addComponent(E5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {A2, A3, A4, A5, B2, B3, B4, B5, C2, C3, C4, C5, D2, D3, D4, D5, E2, E3, E4, E5});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Jogador Tic Tac Toe     Símbolo:");

        NumeroDeVitoriasDoTicTacToe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeVitoriasDoTicTacToe.setText("Número de Vitórias: 0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Jogador Adversário      ");

        NumeroDeVitoriasDoAdversario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeVitoriasDoAdversario.setText("Número de Vitórias: 0");

        NumeroDeEmpate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeEmpate.setText("Número de Empates: 0");

        caixaSimbolo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        SimboloAdversario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SimboloAdversario.setText("Simbolo : X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(caixaSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NumeroDeVitoriasDoTicTacToe, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroDeVitoriasDoAdversario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroDeEmpate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SimboloAdversario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(caixaSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumeroDeVitoriasDoTicTacToe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SimboloAdversario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumeroDeVitoriasDoAdversario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeEmpate)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        NovoJogo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NovoJogo.setText("Iniciar Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        SairDoJogo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SairDoJogo.setText("Sair do Jogo");
        SairDoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SairDoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(NovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SairDoJogo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NovoJogo, SairDoJogo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
         BloquearLiberarCampos(true);  
        
        for (qtdeBlock = 0; qtdeBlock < 2; qtdeBlock++) {  
          String numero = JOptionPane.showInputDialog("Digite a "+ (qtdeBlock+1) +"ª posição bloqueada");
          Bloqueio(numero);
        }
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        
        if(A1.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(A1.getText().equals("")){
              A1.setText("X");
               JogadorAtivo();
           }
       }else{
           if(A1.getText().equals("")){
              A1.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
       
        if(B1.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(B1.getText().equals("")){
              B1.setText("X");
               JogadorAtivo();
           }
       }else{
           if(B1.getText().equals("")){
              B1.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        if(C1.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        if (Jogador1Ativo == true){
           if(C1.getText().equals("")){
              C1.setText("X");
               JogadorAtivo();
           }
       }else{
           if(C1.getText().equals("")){
              C1.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        
        if(D1.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        if (Jogador1Ativo == true){
           if(D1.getText().equals("")){
              D1.setText("X");
               JogadorAtivo();
           }
       }else{
           if(D1.getText().equals("")){
              D1.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_D1ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
       if(E1.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        if (Jogador1Ativo == true){
           if(E1.getText().equals("")){
              E1.setText("X");
               JogadorAtivo();
           }
       }else{
           if(E1.getText().equals("")){
              E1.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_E1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
     if(A2.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        
        
        if (Jogador1Ativo == true){
           if(A2.getText().equals("")){
              A2.setText("X");
               JogadorAtivo();
           }
       }else{
           if(A2.getText().equals("")){
              A2.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_A2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
       if(B2.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(B2.getText().equals("")){
              B2.setText("X");
               JogadorAtivo();
           }
       }else{
           if(B2.getText().equals("")){
              B2.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_B2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
      if(C2.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(C2.getText().equals("")){
              C2.setText("X");
               JogadorAtivo();
           }
       }else{
           if(C2.getText().equals("")){
              C2.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_C2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        if(D2.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        
        if (Jogador1Ativo == true){
           if(D2.getText().equals("")){
              D2.setText("X");
               JogadorAtivo();
           }
       }else{
           if(D2.getText().equals("")){
              D2.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_D2ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
       if(E2.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(E2.getText().equals("")){
              E2.setText("X");
               JogadorAtivo();
           }
       }else{
           if(E2.getText().equals("")){
              E2.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_E2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        if(A3.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        
        
        if (Jogador1Ativo == true){
           if(A3.getText().equals("")){
              A3.setText("X");
               JogadorAtivo();
           }
       }else{
           if(A3.getText().equals("")){
              A3.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_A3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if(B3.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(B3.getText().equals("")){
              B3.setText("X");
               JogadorAtivo();
           }
       }else{
           if(B3.getText().equals("")){
              B3.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_B3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        if(C3.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        
        if (Jogador1Ativo == true){
           if(C3.getText().equals("")){
              C3.setText("X");
               JogadorAtivo();
           }
       }else{
           if(C3.getText().equals("")){
              C3.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_C3ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
       if(D3.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(D3.getText().equals("")){
              D3.setText("X");
               JogadorAtivo();
           }
       }else{
           if(D3.getText().equals("")){
              D3.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_D3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
       if(A4.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        if (Jogador1Ativo == true){
           if(A4.getText().equals("")){
              A4.setText("X");
               JogadorAtivo();
           }
       }else{
           if(A4.getText().equals("")){
              A4.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_A4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
       if(B4.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        
        if (Jogador1Ativo == true){
           if(B4.getText().equals("")){
              B4.setText("X");
               JogadorAtivo();
           }
       }else{
           if(B4.getText().equals("")){
              B4.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_B4ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
       if(C4.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(C4.getText().equals("")){
              C4.setText("X");
               JogadorAtivo();
           }
       }else{
           if(C4.getText().equals("")){
              C4.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_C4ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
       if(D4.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        if (Jogador1Ativo == true){
           if(D4.getText().equals("")){
              D4.setText("X");
               JogadorAtivo();
           }
       }else{
           if(D4.getText().equals("")){
              D4.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_D4ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        if(E4.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        
        if (Jogador1Ativo == true){
           if(E4.getText().equals("")){
              E4.setText("X");
               JogadorAtivo();
           }
       }else{
           if(E4.getText().equals("")){
              E4.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_E4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
      if(A5.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(A5.getText().equals("")){
              A5.setText("X");
               JogadorAtivo();
           }
       }else{
           if(A5.getText().equals("")){
              A5.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_A5ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if(B5.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(B5.getText().equals("")){
              B5.setText("X");
               JogadorAtivo();
           }
       }else{
           if(B5.getText().equals("")){
              B5.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_B5ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
       if(C5.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
           if(C5.getText().equals("")){
              C5.setText("X");
               JogadorAtivo();
           }
       }else{
           if(C5.getText().equals("")){
              C5.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_C5ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        if(D5.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        
        if (Jogador1Ativo == true){
           if(D5.getText().equals("")){
              D5.setText("X");
               JogadorAtivo();
           }
       }else{
           if(D5.getText().equals("")){
              D5.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_D5ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
       if(E5.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        
        if (Jogador1Ativo == true){
           if(E5.getText().equals("")){
              E5.setText("X");
               JogadorAtivo();
           }
       }else{
           if(E5.getText().equals("")){
              E5.setText("O");
              JogadorAtivo();
           }
       }
    }//GEN-LAST:event_E5ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        if(E3.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        
        if (Jogador1Ativo == true){
            if(E3.getText().equals("")){
                E3.setText("X");
                JogadorAtivo();
            }
        }else{
            if(E3.getText().equals("")){
                E3.setText("O");
                JogadorAtivo();
            }
        }
    }//GEN-LAST:event_E3ActionPerformed

    private void SairDoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoJogoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairDoJogoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha5x5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha5x5().setVisible(true); 
                 
            }
        });
        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JLabel B;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JLabel C;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JLabel D;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JLabel E;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JLabel N1;
    private javax.swing.JLabel N2;
    private javax.swing.JLabel N3;
    private javax.swing.JLabel N4;
    private javax.swing.JLabel N6;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel NumeroDeEmpate;
    private javax.swing.JLabel NumeroDeVitoriasDoAdversario;
    private javax.swing.JLabel NumeroDeVitoriasDoTicTacToe;
    private javax.swing.JButton SairDoJogo;
    private javax.swing.JLabel SimboloAdversario;
    private javax.swing.JTextField caixaSimbolo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
