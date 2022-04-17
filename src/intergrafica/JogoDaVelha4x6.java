package intergrafica;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JogoDaVelha4x6 extends javax.swing.JFrame {

    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    private boolean player;
    private final int colorBlock = -16777216;
    private int qtdeBlock;

    public JogoDaVelha4x6() {
        initComponents();
    }

    public void BloquearLiberarCampos(boolean acao) {
        Component[] componentes = jPanel1.getComponents();
        for (Component componente : componentes) {
            componente.setEnabled(acao);
        }
    }

    public void LimparCampos() {
        Component[] comp = jPanel1.getComponents();
        for (Component comp1 : comp) {
            if (comp1 instanceof JButton) {
                ((JButton) comp1).setText("");
                ((JButton) comp1).setBackground(Color.LIGHT_GRAY);
            }
        }
    }

    public void JogadorAtivo() {
        if (Jogador1Ativo == true) {
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        } else {
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
            case "F1": {
                F1.setBackground(Color.BLACK);
                break;
            }

            case "F2": {
                F2.setBackground(Color.BLACK);
                break;
            }

            case "F3": {
                F3.setBackground(Color.BLACK);
                break;
            }

            case "F4": {
                F4.setBackground(Color.BLACK);
                break;
            }

            default:
                JOptionPane.showMessageDialog(rootPane, "Posição não encontrada");
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
        F1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        F = new javax.swing.JLabel();
        N4 = new javax.swing.JLabel();
        N3 = new javax.swing.JLabel();
        N2 = new javax.swing.JLabel();
        N1 = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        E = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        caixaSimbolo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        SimboloAdversario = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SairDoJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabuleiro 4 x 6");
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

        F1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
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

        F2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
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

        F3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
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

        F4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        F.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        F.setText("F");

        N4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N4.setText("4");

        N3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N3.setText("3");

        N2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N2.setText("2");

        N1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N1.setText("1");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(N4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(A4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(N1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(N2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(N3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(A3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(B3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(D3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(F)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4, D1, D2, D3, D4, E1, E2, E3, E4, F1, F2, F3, F4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B)
                    .addComponent(C)
                    .addComponent(D)
                    .addComponent(E)
                    .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1)
                    .addComponent(B1)
                    .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1)
                    .addComponent(D1)
                    .addComponent(E1)
                    .addComponent(F1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F2)
                    .addComponent(E2)
                    .addComponent(D2)
                    .addComponent(C2)
                    .addComponent(B2)
                    .addComponent(A2)
                    .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A3)
                    .addComponent(B3)
                    .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3)
                    .addComponent(D3)
                    .addComponent(E3)
                    .addComponent(F3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A4)
                    .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4)
                    .addComponent(C4)
                    .addComponent(D4)
                    .addComponent(E4)
                    .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4, D1, D2, D3, D4, E1, E2, E3, E4, F1, F2, F3, F4});

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Jogador Tic Tac Toe     Símbolo:");

        caixaSimbolo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Número de Vitórias: 0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Jogador Adversário    ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Número de Vitórias: 0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Número de Empates: 0");

        SimboloAdversario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SimboloAdversario.setText("Simbolo : X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caixaSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SimboloAdversario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(caixaSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SimboloAdversario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        NovoJogo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NovoJogo.setText("Novo Jogo");
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SairDoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(NovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SairDoJogo)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NovoJogo, SairDoJogo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void EstrategiaInicial() {
        if ((B2.getText().equals("")) && (B2.getBackground().getRGB() != colorBlock)
                && (A1.getText().equals("")) && (A1.getBackground().getRGB() != colorBlock)
                && (C3.getText().equals("")) && (C3.getBackground().getRGB() != colorBlock)) {
            B2.setText("X");
            JogadorAtivo();
        } else if (B2.getText().equals("X") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock) {
            A1.setText("X");
            JogadorAtivo();
        } else if (B2.getText().equals("X") && A1.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
        } else if (A4.getText().equals("") && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
        } else if (A2.getText().equals("") && A2.getBackground().getRGB() != colorBlock
                && C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock) {
            A2.setText("X");
            JogadorAtivo();
        } else if (B4.getText().equals("") && B4.getBackground().getRGB() != colorBlock
                && D2.getText().equals("") && D2.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
        } else if ((C2.getText().equals("")) && (C2.getBackground().getRGB() != colorBlock)
                && (B1.getText().equals("")) && (B1.getBackground().getRGB() != colorBlock)
                && (D3.getText().equals("")) && (D3.getBackground().getRGB() != colorBlock)) {
            C2.setText("X");
            JogadorAtivo();
        } else if ((D2.getText().equals("")) && (D2.getBackground().getRGB() != colorBlock)
                && (C1.getText().equals("")) && (C1.getBackground().getRGB() != colorBlock)
                && (E3.getText().equals("")) && (E3.getBackground().getRGB() != colorBlock)) {
            D2.setText("X");
            JogadorAtivo();
        } else if ((E2.getText().equals("")) && (E2.getBackground().getRGB() != colorBlock)
                && (D1.getText().equals("")) && (D1.getBackground().getRGB() != colorBlock)
                && (E3.getText().equals("")) && (E3.getBackground().getRGB() != colorBlock)) {
            E2.setText("X");
            JogadorAtivo();
        } else if (F1.getText().equals("") && F1.getBackground().getRGB() != colorBlock) {
            F1.setText("X");
            JogadorAtivo();
        } else if (F4.getText().equals("") && F4.getBackground().getRGB() != colorBlock) {
            F4.setText("X");
            JogadorAtivo();
        } else if (F2.getText().equals("") && F2.getBackground().getRGB() != colorBlock) {
            F2.setText("X");
            JogadorAtivo();
        }
    }

    public void defensiva() {
        
        if (C4.getText().equals("O") && D3.getText().equals("O")
                && E2.getText().equals("") && E2.getBackground().getRGB() != colorBlock) {
            E2.setText("X");
            JogadorAtivo();
            return;
        } else if (D4.getText().equals("O") && E3.getText().equals("O")
                && F2.getText().equals("") && F2.getBackground().getRGB() != colorBlock) {
            F2.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("O") && C3.getText().equals("O")
                && C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        } else if (D2.getText().equals("O") && D3.getText().equals("O")
                && D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        } else if (C1.getText().equals("O") && C2.getText().equals("O")
                && C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        } else if (D2.getText().equals("O") && C2.getText().equals("O")
                && B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        } else if (D2.getText().equals("O") && F2.getText().equals("O")
                && E2.getText().equals("") && E2.getBackground().getRGB() != colorBlock) {
            E2.setText("X");
            JogadorAtivo();
            return;
        } else if (B2.getText().equals("O") && D2.getText().equals("O")
                && C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        } else if (A3.getText().equals("O") && B3.getText().equals("O")
                && C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("O") && D3.getText().equals("O")
                && B1.getText().equals("") && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        } else if (B2.getText().equals("O") && C2.getText().equals("O")
                && D2.getText().equals("") && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        } else if (F2.getText().equals("O") && E3.getText().equals("O")
                && D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        } else if (B3.getText().equals("O") && B4.getText().equals("O")
                && B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        } else if (A3.getText().equals("O") && B3.getText().equals("O")
                && C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        } else if (D2.getText().equals("O") && D3.getText().equals("O")
                && D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        } else if (C1.getText().equals("O") && C3.getText().equals("O")
                && C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        } else if (B2.getText().equals("O") && B3.getText().equals("O")
                && B1.getText().equals("") && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        } else if (D2.getText().equals("O") && E3.getText().equals("O")
                && F4.getText().equals("") && F4.getBackground().getRGB() != colorBlock) {
            F4.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("O") && D3.getText().equals("O")
                && E4.getText().equals("") && E4.getBackground().getRGB() != colorBlock) {
            E4.setText("X");
            JogadorAtivo();
            return;
        } else if (B2.getText().equals("O") && C2.getText().equals("O")
                && D2.getText().equals("") && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("O") && C4.getText().equals("O")
                && C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("O") && B3.getText().equals("O")
                && A4.getText().equals("") && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        } else if (B1.getText().equals("O") && C2.getText().equals("O")
                && D3.getText().equals("") && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        } else if (B3.getText().equals("O") && C2.getText().equals("O")
                && D1.getText().equals("") && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        } else if (A2.getText().equals("O") && C2.getText().equals("O")
                && B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("O") && C3.getText().equals("O")
                && C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        } else if (A1.getText().equals("O") && A2.getText().equals("O") && A3.getText().equals("") && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        } else if (A2.getText().equals("O") && A3.getText().equals("O") && A4.getText().equals("") && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        } else if (B1.getText().equals("O") && B2.getText().equals("O") && B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        } else if (B2.getText().equals("O") && "O".equals(B3.getText()) && B4.getText().equals("") && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        } else if (E2.getText().equals("O") && C4.getText().equals("O")
                && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        } else if (D4.getText().equals("O") && E4.getText().equals("O")
                && F4.getText().equals("") && F4.getBackground().getRGB() != colorBlock) {
            F4.setText("X");
            JogadorAtivo();
            return;

        } else if (F4.getText().equals("O") && E3.getText().equals("O")
                && D2.getText().equals("") && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        } else if (F4.getText().equals("O") && E4.getText().equals("O")
                && D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;

        } else if (E2.getText().equals("O") && E4.getText().equals("O")
                && E3.getText().equals("") && E3.getBackground().getRGB() != colorBlock) {
            E3.setText("X");
            JogadorAtivo();
            return;
        } else if (C1.getText().equals("O") && C2.getText().equals("O") && C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        } else if (B2.getText().equals("O") && B4.getText().equals("O")
                && B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("O") && C3.getText().equals("O") && C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        } else if (B1.getText().equals("O") && D3.getText().equals("O")
                && C2.getText().equals("O") && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        } else if (D1.getText().equals("O") && D2.getText().equals("O") && D3.getText().equals("") && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        } else if (D2.getText().equals("O") && D3.getText().equals("O") && D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        } else if (E1.getText().equals("O") && E2.getText().equals("O") && E3.getText().equals("") && E3.getBackground().getRGB() != colorBlock) {
            E3.setText("X");
            JogadorAtivo();
            return;
        } else if (E2.getText().equals("O") && E3.getText().equals("O") && E4.getText().equals("") && E4.getBackground().getRGB() != colorBlock) {
            E4.setText("X");
            JogadorAtivo();
            return;
        } else if (F1.getText().equals("O") && F2.getText().equals("O") && F3.getText().equals("") && F3.getBackground().getRGB() != colorBlock) {
            F3.setText("X");
            JogadorAtivo();
            return;
        } else if (F2.getText().equals("O") && F3.getText().equals("O") && F4.getText().equals("") && F4.getBackground().getRGB() != colorBlock) {
            F4.setText("X");
            JogadorAtivo();
            return;

            // VERTICAL
        } else if (A1.getText().equals("O") && B1.getText().equals("O") && C1.getText().equals("") && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        } else if (B1.getText().equals("O") && C1.getText().equals("O") && D1.getText().equals("") && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        } else if (C1.getText().equals("O") && D1.getText().equals("O") && E1.getText().equals("") && E1.getBackground().getRGB() != colorBlock) {
            E1.setText("X");
            JogadorAtivo();
            return;
        } else if (D1.getText().equals("O") && E1.getText().equals("O") && F1.getText().equals("") && F1.getBackground().getRGB() != colorBlock) {
            F1.setText("X");
            JogadorAtivo();
            return;
        } else if (A2.getText().equals("O") && B2.getText().equals("O") && C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        } else if (B2.getText().equals("O") && C2.getText().equals("O") && D2.getText().equals("") && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("O") && D2.getText().equals("O") && E2.getText().equals("") && E2.getBackground().getRGB() != colorBlock) {
            E2.setText("X");
            JogadorAtivo();
            return;
        } else if (D2.getText().equals("O") && E2.getText().equals("O") && F2.getText().equals("") && F2.getBackground().getRGB() != colorBlock) {
            F2.setText("X");
            JogadorAtivo();
            return;
        } else if (A3.getText().equals("O") && C3.getText().equals("O") && B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        } else if (A3.getText().equals('O') && C3.getText().equals("O") && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        } else if (B3.getText().equals("O") && C3.getText().equals("O") && D3.getText().equals("") && D3.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        } else if (C3.getText().equals("O") && D3.getText().equals("O") && E3.getText().equals("") && E3.getBackground().getRGB() != colorBlock) {
            E3.setText("X");
            JogadorAtivo();
            return;
        } else if (D3.getText().equals("O") && E3.getText().equals("O") && F3.getText().equals("") && F3.getBackground().getRGB() != colorBlock) {
            F3.setText("X");
            JogadorAtivo();
            return;
        } else if (A4.getText().equals("O") && B4.getText().equals("O") && C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        } else if (B4.getText().equals("O") && C4.getText().equals("O") && D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        } else if (C4.getText().equals("O") && D4.getText().equals("O") && E4.getText().equals("") && E4.getBackground().getRGB() != colorBlock) {
            E4.setText("X");
            JogadorAtivo();
            return;
        } else if (D4.getText().equals("O") && E4.getText().equals("O") && F4.getText().equals("") && F4.getBackground().getRGB() != colorBlock) {
            F4.setText("X");
            JogadorAtivo();
            return;
        } else if (A1.getText().equals("O") && B2.getText().equals("O") && C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        } else if (A2.getText().equals("O") && B3.getText().equals("O") && C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        } else if (A4.getText().equals("O") && B3.getText().equals("O") && C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        } else if (A3.getText().equals("O") && B2.getText().equals("O") && C1.getText().equals("") && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        } else {
            EstrategiaInicial();
        }
    }

    public void ofensiva() {    
        if (A1.getText().equals("X") && A3.getText().equals("X") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("X") && B2.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("X") && A4.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && D3.getText().equals("X") && E2.getText().equals("")
                && E2.getBackground().getRGB() != colorBlock) {
            E2.setText("X");
            JogadorAtivo();
            return;
        } else if (B3.getText().equals("X") && C2.getText().equals("X") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        } else if (A1.getText().equals("X") && C1.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        } else if (B2.getText().equals("X") && C2.getText().equals("X") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock) {
            A2.setText("X");
            JogadorAtivo();
            return;
        } else if (C4.getText().equals("X") && B4.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        } else if ("X".equals(A1.getText()) && "X".equals(A2.getText()) && A3.getText().equals("") && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        } else if ("X".equals(A2.getText()) && "X".equals(A3.getText()) && A4.getText().equals("") && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        } else if ("X".equals(B1.getText()) && "X".equals(B2.getText()) && B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        } else if ("X".equals(B2.getText()) && "X".equals(B3.getText()) && B4.getText().equals("") && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        } else if (C1.getText().equals("X") && C2.getText().equals("X") && C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("X") && C3.getText().equals("X") && C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        } else if (D1.getText().equals("X") && D2.getText().equals("X") && D3.getText().equals("") && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        } else if (D2.getText().equals("X") && D3.getText().equals("X") && D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        } else if (E1.getText().equals("X") && E2.getText().equals("X") && E3.getText().equals("") && E3.getBackground().getRGB() != colorBlock) {
            E3.setText("X");
            JogadorAtivo();
            return;
        } else if (E2.getText().equals("X") && E3.getText().equals("X") && E4.getText().equals("") && E4.getBackground().getRGB() != colorBlock) {
            E4.setText("X");
            JogadorAtivo();
            return;
        } else if (F1.getText().equals("X") && F2.getText().equals("X") && F3.getText().equals("") && F3.getBackground().getRGB() != colorBlock) {
            F3.setText("X");
            JogadorAtivo();
            return;
        } else if (F2.getText().equals("X") && F3.getText().equals("X") && F4.getText().equals("") && F4.getBackground().getRGB() != colorBlock) {
            F4.setText("X");
            JogadorAtivo();
            return;

            // VERTICAL
        } else if (A1.getText().equals("X") && B1.getText().equals("X") && C1.getText().equals("") && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        } else if (B1.getText().equals("X") && C1.getText().equals("X") && D1.getText().equals("") && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        } else if (B3.getText().equals("X") && B2.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        } else if (C1.getText().equals("X") && D1.getText().equals("X") && E1.getText().equals("") && E1.getBackground().getRGB() != colorBlock) {
            E1.setText("X");
            JogadorAtivo();
            return;
        } else if (D1.getText().equals("X") && E1.getText().equals("X") && F1.getText().equals("") && F1.getBackground().getRGB() != colorBlock) {
            F1.setText("X");
            JogadorAtivo();
            return;
        } else if (A2.getText().equals("X") && B2.getText().equals("X") && C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        } else if (B2.getText().equals("X") && C2.getText().equals("X") && D2.getText().equals("") && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        } else if (C2.getText().equals("X") && D2.getText().equals("X") && E2.getText().equals("") && E2.getBackground().getRGB() != colorBlock) {
            E2.setText("X");
            JogadorAtivo();
            return;
        } else if (D2.getText().equals("X") && E2.getText().equals("X") && F2.getText().equals("") && F2.getBackground().getRGB() != colorBlock) {
            F2.setText("X");
            JogadorAtivo();
            return;
        } else if (A3.getText().equals("X") && B3.getText().equals("X") && C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        } else if (B3.getText().equals("X") && C3.getText().equals("X") && D3.getText().equals("") && D3.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        } else if (C3.getText().equals("X") && D3.getText().equals("X") && E3.getText().equals("") && E3.getBackground().getRGB() != colorBlock) {
            E3.setText("X");
            JogadorAtivo();
            return;
        } else if (D3.getText().equals("X") && E3.getText().equals("X") && F3.getText().equals("") && F3.getBackground().getRGB() != colorBlock) {
            F3.setText("X");
            JogadorAtivo();
            return;
        } else if (A4.getText().equals("X") && B4.getText().equals("X") && C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        } else if (B4.getText().equals("X") && C4.getText().equals("X") && D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        } else if (C4.getText().equals("X") && D4.getText().equals("X") && E4.getText().equals("") && E4.getBackground().getRGB() != colorBlock) {
            E4.setText("X");
            JogadorAtivo();
            return;
        } else if (D4.getText().equals("X") && E4.getText().equals("X") && F4.getText().equals("") && F4.getBackground().getRGB() != colorBlock) {
            F4.setText("X");
            JogadorAtivo();
            return;
        } else if (A1.getText().equals("X") && B2.getText().equals("X") && C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        } else if (A2.getText().equals("X") && B3.getText().equals("X") && C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        } else if (A4.getText().equals("X") && B3.getText().equals("X") && C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        } else if (A3.getText().equals("X") && B2.getText().equals("X") && C1.getText().equals("") && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        } else {
            defensiva();
        }
    }

    public void setPlayer() {
        ofensiva();
   }

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        BloquearLiberarCampos(true);
        LimparCampos();
        for (qtdeBlock = 0; qtdeBlock < 2; qtdeBlock++) {
            String numero = JOptionPane.showInputDialog("Digite a " + (qtdeBlock + 1) + "ª posição bloqueada");
            Bloqueio(numero);
        }
        String response = JOptionPane.showInputDialog("Sou eu que começo ? \n 1 - Sim \n 2 - Não ");
        player = "1".equals(response);
        if (player) {
            ofensiva();
        } else {
            JogadorAtivo();
        }
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed

        if (A1.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (A1.getText().equals("")) {
            A1.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

        if (B1.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (B1.getText().equals("")) {
            B1.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed

        if (C1.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }
        if (C1.getText().equals("")) {
            C1.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed

        if (D1.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }
        if (D1.getText().equals("")) {
            D1.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_D1ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed

        if (E1.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }
        if (E1.getText().equals("")) {
            E1.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_E1ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        if (F1.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }
        if (F1.getText().equals("")) {
            F1.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_F1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        if (A2.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (A2.getText().equals("")) {
            A2.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_A2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if (B2.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (B2.getText().equals("")) {
            B2.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        if (C2.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (C2.getText().equals("")) {
            C2.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_C2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed

        if (D2.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (D2.getText().equals("")) {
            D2.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_D2ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed

        if (E2.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (E2.getText().equals("")) {
            E2.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_E2ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        if (F2.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (F2.getText().equals("")) {
            F2.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_F2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        if (A3.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (A3.getText().equals("")) {
            A3.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_A3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if (B3.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (B3.getText().equals("")) {
            B3.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        if (C3.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (C3.getText().equals("")) {
            C3.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        if (D3.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (D3.getText().equals("")) {
            D3.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_D3ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        if (E3.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }
        if (E3.getText().equals("")) {
            E3.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_E3ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed

        if (F3.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (F3.getText().equals("")) {
            F3.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_F3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed

        if (A4.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }
        if (A4.getText().equals("")) {
            A4.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_A4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if (B4.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }
        if (B4.getText().equals("")) {
            B4.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_B4ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed

        if (C4.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (C4.getText().equals("")) {
            C4.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_C4ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed

        if (D4.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (D4.getText().equals("")) {
            D4.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_D4ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        if (E4.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (E4.getText().equals("")) {
            E4.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_E4ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        if (F4.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }

        if (F4.getText().equals("")) {
            F4.setText("O");
            JogadorAtivo();
            setPlayer();
        }

    }//GEN-LAST:event_F4ActionPerformed

    private void SairDoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoJogoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairDoJogoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha4x6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JLabel B;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JLabel C;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JLabel D;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JLabel E;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JLabel F;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JLabel N1;
    private javax.swing.JLabel N2;
    private javax.swing.JLabel N3;
    private javax.swing.JLabel N4;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JButton SairDoJogo;
    private javax.swing.JLabel SimboloAdversario;
    private javax.swing.JTextField caixaSimbolo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
