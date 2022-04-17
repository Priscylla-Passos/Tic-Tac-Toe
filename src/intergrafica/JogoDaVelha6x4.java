package intergrafica;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JogoDaVelha6x4 extends javax.swing.JFrame {

    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    private boolean player;
    private final int colorBlock = -16777216;
    private int qtdeBlock;
    private int pv=0;
    

    
    public JogoDaVelha6x4() {
        initComponents(); 
    }
    
    public void BloquearLiberarCampos(boolean acao){
        Component[] componentes = jPanel1.getComponents();
            for(Component componente: componentes){
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
            case "A6": {
                A6.setBackground(Color.BLACK);
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
            
            case "B6": {
                B6.setBackground(Color.BLACK);
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
            
            case "C6": {
                A6.setBackground(Color.BLACK);
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
            
            case "D6": {
                D6.setBackground(Color.BLACK);
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
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        A = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        C = new javax.swing.JLabel();
        D = new javax.swing.JLabel();
        N1 = new javax.swing.JLabel();
        N2 = new javax.swing.JLabel();
        N3 = new javax.swing.JLabel();
        N4 = new javax.swing.JLabel();
        N5 = new javax.swing.JLabel();
        N6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        caixaSimbolo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        SimboloAdversario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SairDoJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabuleiro 6 x 4");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        A1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        D1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        A2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        C2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        D2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        A3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        C3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        D3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        A4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        C4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        D4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        A5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        C5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        D5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        A6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        C6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        D6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
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

        N1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N1.setText("1");

        N2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N2.setText("2");

        N3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N3.setText("3");

        N4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N4.setText("4");

        N5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N5.setText("5");

        N6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        N6.setText("6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(N5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(N3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(N4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(N2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(N1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(N6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(A1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D1)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {A1, A2, A3, A4, A5, A6, B1, B2, B3, B4, B5, B6, C1, C2, C3, C4, C5, C6, D1, D2, D3, D4, D5, D6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B)
                    .addComponent(C)
                    .addComponent(D))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1)
                    .addComponent(C1)
                    .addComponent(D1)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A2)
                    .addComponent(B2)
                    .addComponent(C2)
                    .addComponent(D2)
                    .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A3)
                    .addComponent(B3)
                    .addComponent(C3)
                    .addComponent(D3)
                    .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A4)
                    .addComponent(B4)
                    .addComponent(C4)
                    .addComponent(D4)
                    .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A5)
                    .addComponent(B5)
                    .addComponent(C5)
                    .addComponent(D5)
                    .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A6)
                    .addComponent(B6)
                    .addComponent(C6)
                    .addComponent(D6)
                    .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {A1, A2, A3, A4, A5, A6, B1, B2, B3, B4, B5, B6, C1, C2, C3, C4, C5, C6, D1, D2, D3, D4, D5, D6});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Jogador Tic Tac Toe     Símbolo:");

        caixaSimbolo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Número de Vitórias: 0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Jogador Adversário");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Número de Vitórias: 0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Número de Empates: 0");

        SimboloAdversario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SimboloAdversario.setText("Simbolo : X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caixaSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(SimboloAdversario, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(caixaSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SimboloAdversario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SairDoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(NovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SairDoJogo)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NovoJogo, SairDoJogo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        BloquearLiberarCampos(true);
        LimparCampos();
        for (qtdeBlock = 0; qtdeBlock < 2; qtdeBlock++) {  
            String numero = JOptionPane.showInputDialog("Digite a "+ (qtdeBlock+1) +"ª posição bloqueada");
            Bloqueio(numero);
        }
        String response = JOptionPane.showInputDialog("Sou eu quem começo? \n 1 - para Sim\n 2 - para Não");
        player = "1".equals(response);
        if(player){
            jogarPrimeiro();
        }else
            pv+=1;
            JogadorAtivo();
    }//GEN-LAST:event_NovoJogoActionPerformed
    public int verifiPosLiberada(String d,int a){
        if(d.equalsIgnoreCase("a")){
            switch(a){
                case 1:
                    if(A1.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(A1.getText().equals("O")){
                        return 2;    
                    }else if(A1.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 2:
                    if(A2.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(A2.getText().equals("O")){
                        return 2;    
                    }else if(A2.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 3:
                    if(A3.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(A3.getText().equals("O")){
                        return 2;    
                    }else if(A3.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 4:
                    if(A4.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(A4.getText().equals("O")){
                        return 2;    
                    }else if(A4.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 5:
                    if(A5.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(A5.getText().equals("O")){
                        return 2;    
                    }else if(A5.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 6:
                    if(A6.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(A6.getText().equals("O")){
                        return 2;    
                    }else if(A6.getText().equals("X")){
                        return 1;
                    }else return 3;
            }
        }else if(d.equalsIgnoreCase("b")){
            switch(a){
                case 1:
                    if(B1.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(B1.getText().equals("O")){
                        return 2;    
                    }else if(B1.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 2:
                    if(B2.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(B2.getText().equals("O")){
                        return 2;    
                    }else if(B2.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 3:
                    if(B3.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(B3.getText().equals("O")){
                        return 2;    
                    }else if(B3.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 4:
                    if(B4.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(B4.getText().equals("O")){
                        return 2;    
                    }else if(B4.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 5:
                    if(B6.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(B5.getText().equals("O")){
                        return 2;    
                    }else if(B5.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 6:
                    if(B6.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(B6.getText().equals("O")){
                        return 2;    
                    }else if(B6.getText().equals("X")){
                        return 1;
                    }else return 3;
            }
        }else if(d.equalsIgnoreCase("c")){
            switch(a){
                case 1:
                    if(C1.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(C1.getText().equals("O")){
                        return 2;    
                    }else if(C1.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 2:
                    if(C2.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(C2.getText().equals("O")){
                            return 2;    
                    }else if(C2.getText().equals("X")){
                            return 1;
                    }else return 3;
                case 3:
                    if(C3.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(C3.getText().equals("O")){
                        return 2;    
                    }else if(C3.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 4:
                    if(C4.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(C4.getText().equals("O")){
                        return 2;    
                    }else if(C1.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 5:
                    if(C5.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(C5.getText().equals("O")){
                        return 2;    
                    }else if(C5.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 6:
                    if(C5.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(C5.getText().equals("O")){
                        return 2;    
                    }else if(C5.getText().equals("X")){
                        return 1;
                    }else return 3;
            }
        }else if(d.equalsIgnoreCase("d")){
            switch(a){
                case 1:
                    if(D1.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(D1.getText().equals("O")){
                        return 2;    
                    }else if(D1.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 2:
                    if(D2.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(D2.getText().equals("O")){
                        return 2;    
                    }else if(D2.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 3:
                    if(D3.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(D3.getText().equals("O")){
                        return 2;    
                    }else if(D3.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 4:
                    if(D4.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(D4.getText().equals("O")){
                        return 2;    
                    }else if(D4.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 5:
                    if(D5.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(D5.getText().equals("O")){
                        return 2;    
                    }else if(D5.getText().equals("X")){
                        return 1;
                    }else return 3;
                case 6:
                    if(D6.getBackground().getRGB() == colorBlock){
                        return 0;
                    }else if(D6.getText().equals("O")){
                        return 2;    
                    }else if(D6.getText().equals("X")){
                        return 1;
                    }else return 3;
            }
        }
        return 0;
    }
    public void setPlayer(){
            ataque();
    }
    
    public void ataque(){
        if (A1.getText().equals("X") && A2.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("X") && B2.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("X") && B1.getText().equals("X") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("X") && C1.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("X") && B2.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("X") && C3.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("X") && A1.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("X") && A3.getText().equals("X") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("X") && A3.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("X") && A4.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("X") && B3.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("X") && C4.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("X") && B2.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("X") && C2.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && A2.getText().equals("X") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && A1.getText().equals("X") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && A4.getText().equals("X") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && A5.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && B4.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && C5.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && B2.getText().equals("X") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && C1.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && B3.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("X") && C3.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && A3.getText().equals("X") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && A2.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && B3.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && C2.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && B4.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && C4.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && B5.getText().equals("X") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && C6.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && A5.getText().equals("X") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && A6.getText().equals("X") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("X") && A4.getText().equals("X") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("X") && A6.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("X") && A4.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("X") && A3.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("X") && B4.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("X") && C3.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("X") && B5.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("X") && C5.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("X") && A5.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("X") && A4.getText().equals("X") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("X") && B5.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("X") && C4.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("X") && B6.getText().equals("X") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("X") && C6.getText().equals("X") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("X") && B2.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("X") && B3.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("X") && A1.getText().equals("X") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("X") && C1.getText().equals("X") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("X") && D1.getText().equals("X") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("X") && C1.getText().equals("X") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("X") && C2.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("X") && D3.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && C2.getText().equals("X") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && D2.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && A2.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && C2.getText().equals("X") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && B1.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && B3.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && B4.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && B3.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && A1.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && C3.getText().equals("X") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && C1.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && A3.getText().equals("X") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && D4.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("X") && C3.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && C3.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && D3.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && A3.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && C3.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && B2.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && B4.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && B2.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && B1.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && B4.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && B5.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && A2.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && C4.getText().equals("X") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && C2.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && A4.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && C4.getText().equals("X") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && D5.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && D1.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("X") && C2.getText().equals("X") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && C4.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && D4.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && A4.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && C4.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && B3.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && B5.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && B2.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && B3.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && B6.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && B5.getText().equals("X") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && A3.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && C5.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && C3.getText().equals("X") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && A5.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && C5.getText().equals("X") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && D6.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && D2.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("X") && C3.getText().equals("X") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && C5.getText().equals("X") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && D5.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && A5.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && C5.getText().equals("X") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && B4.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && B3.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && B4.getText().equals("X") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && B6.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && A6.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && C4.getText().equals("X") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && C6.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && A4.getText().equals("X") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && D3.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("X") && C4.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("X") && B5.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("X") && B4.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("X") && A6.getText().equals("X") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("X") && C6.getText().equals("X") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("X") && C5.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("X") && D4.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("X") && D6.getText().equals("X") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("X") && C6.getText().equals("X") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("X") && C2.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("X") && C3.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("X") && D1.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("X") && B1.getText().equals("X") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("X") && A1.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("X") && B1.getText().equals("X") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("X") && B2.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("X") && A3.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && B2.getText().equals("X") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && D2.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && A2.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && B2.getText().equals("X") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && C1.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && C3.getText().equals("X") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && C4.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && C3.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && D1.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && B3.getText().equals("X") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && B1.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && D3.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && A4.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && B3.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && B3.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && D3.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && A3.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && B3.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && C2.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && C4.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && C2.getText().equals("X") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && C1.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && C4.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && C5.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && D2.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && B4.getText().equals("X") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && B2.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && D4.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && B4.getText().equals("X") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && A5.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && A1.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("X") && B2.getText().equals("X") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && B4.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && A4.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && D4.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && B4.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && C3.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && C5.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && C2.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && C3.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && C6.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && C5.getText().equals("X") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && D3.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && B5.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && B3.getText().equals("X") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && D5.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && B5.getText().equals("X") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && A6.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && A2.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("X") && B3.getText().equals("X") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && B5.getText().equals("X") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && A5.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && D5.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && B5.getText().equals("X") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && C4.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && C3.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && C4.getText().equals("X") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && C6.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && D6.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && B4.getText().equals("X") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && B6.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && D4.getText().equals("X") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && A3.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("X") && B4.getText().equals("X") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("X") && C5.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("X") && C4.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("X") && D6.getText().equals("X") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("X") && B6.getText().equals("X") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("X") && B5.getText().equals("X") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("X") && A4.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("X") && A6.getText().equals("X") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("X") && B6.getText().equals("X") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("X") && D2.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("X") && D2.getText().equals("X") && D3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("X") && B1.getText().equals("X") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("X") && C1.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("X") && C2.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("X") && B3.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("X") && D1.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("X") && D3.getText().equals("X") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("X") && D3.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("X") && D4.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("X") && C3.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("X") && B4.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("X") && B2.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("X") && C2.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && D2.getText().equals("X") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && D1.getText().equals("X") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && D4.getText().equals("X") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && D5.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && C4.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && B5.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && C2.getText().equals("X") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && B1.getText().equals("X") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && B3.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && C3.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("X") && D3.getText().equals("X") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("X") && D2.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("X") && C3.getText().equals("X") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("X") && B2.getText().equals("X") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("X") && B4.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("X") && C4.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("X") && C5.getText().equals("X") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("X") && B6.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("X") && D5.getText().equals("X") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("X") && D6.getText().equals("X") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("X") && D4.getText().equals("X") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("X") && D6.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("X") && D4.getText().equals("X") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("X") && D3.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("X") && C4.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("X") && B3.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("X") && B5.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("X") && C5.getText().equals("X") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("X") && D5.getText().equals("X") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("X") && D4.getText().equals("X") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("X") && C5.getText().equals("X") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("X") && B4.getText().equals("X") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("X") && B6.getText().equals("X") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("X") && C6.getText().equals("X") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else defesa();
    }
    public void defesa(){
        if (A1.getText().equals("O") && A2.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && B2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && B1.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && C1.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && B2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && C3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && A1.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && A3.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && A3.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && A4.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && B3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && C4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && B2.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && C2.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && A2.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && A1.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && A4.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && A5.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && B4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && C5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && B2.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && C1.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && B3.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && C3.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && A3.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && A2.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && B3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && C2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && B4.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && C4.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && B5.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && C6.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && A5.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && A6.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && A4.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && A6.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && A4.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && A3.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && B4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && C3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && B5.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && C5.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && A5.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && A4.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && B5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && C4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && B6.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && C6.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && B2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && B3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && A1.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && C1.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && D1.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && C1.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && C2.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && D3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C2.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && D2.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && A2.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C2.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && B1.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && B3.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && B4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && B3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && A1.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C3.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C1.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && A3.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && D4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C3.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C3.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && D3.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && A3.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C3.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B2.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B4.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B2.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B1.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && A2.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C4.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C2.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && A4.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C4.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && D5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && D1.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C2.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C4.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && D4.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && A4.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C4.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B3.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B5.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B6.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B5.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && A3.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C5.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C3.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && A5.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C5.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && D6.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && D2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C3.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C5.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && D5.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && A5.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C5.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && B4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && B3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && B4.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && B6.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && A6.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C4.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C6.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && A4.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && D3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C4.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && B5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && B4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && A6.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && C6.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && C5.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && D4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && D6.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && C6.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && C2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && C3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && D1.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && B1.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && A1.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && B1.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && B2.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && A3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B2.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && D2.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && A2.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B2.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && C1.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && C3.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && C4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && C3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && D1.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B3.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B1.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && D3.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && A4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B3.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B3.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && D3.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && A3.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B3.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C2.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C4.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C2.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C1.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && D2.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B4.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B2.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && D4.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B4.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && A5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && A1.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B2.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B4.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && A4.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && D4.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B4.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C3.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C5.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C6.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C5.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && D3.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B5.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B3.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && D5.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B5.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && A6.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && A2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B3.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B5.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && A5.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && D5.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B5.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && C4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && C3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && C4.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && C6.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && D6.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B4.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B6.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && D4.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && A3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B4.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && C5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && C4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && D6.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && B6.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && B5.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && A4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && A6.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && B6.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && D2.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && D2.getText().equals("O") && D3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && B1.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && C1.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && C2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && B3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && D1.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && D3.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && D3.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && D4.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && C3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && B4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && B2.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && C2.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && D2.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && D1.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && D4.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && D5.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && C4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && B5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && C2.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && B1.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && B3.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && C3.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && D3.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && D2.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && C3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && B2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && B4.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && C4.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && C5.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && B6.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && D5.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && D6.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && D4.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && D6.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && D4.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && D3.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && C4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && B3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && B5.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && C5.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && D5.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && D4.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && C5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && B4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && B6.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && C6.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else estrategia();
    }
    public void estrategia(){
    int karl=0;
    if(B2.getBackground().getRGB() != colorBlock && !B2.getText().equals("O")){
        if(B2.getText().equals("X")){
            if(D2.getBackground().getRGB() != colorBlock && !D2.getText().equals("O")){
                if(D2.getText().equals("X")){
                    karl = verifiPosLiberada("c",3);
                        if(karl == 3){
                            C3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("c",1);
                            if(karl == 3){
                                C1.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D2.getText().equals("")){
                        D2.setText("X");
                        JogadorAtivo();
                }
            }else if(D4.getBackground().getRGB() != colorBlock && !D4.getText().equals("O")){
                if(D4.getText().equals("X")){
                    karl = verifiPosLiberada("c", 3);
                        if(karl == 3){
                            C3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",1);
                            if(karl == 3){
                                A1.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D4.getText().equals("")){
                        D4.setText("X");
                        JogadorAtivo();
                    }
            }else if(B4.getBackground().getRGB() != colorBlock && !B4.getText().equals("O")){
                if(B4.getText().equals("X")){
                    karl = verifiPosLiberada("b",3);
                        if(karl == 3){
                            B3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("b", 1);
                            if(karl == 3){
                                B1.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("b", 5);
                                if(karl == 3){
                                    B5.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(B4.getText().equals("")){
                        B4.setText("X");
                        JogadorAtivo();
                }
            }
        }else{
            B2.setText("X");
            JogadorAtivo();
        }
    }else if(C2.getBackground().getRGB() != colorBlock && !C2.getText().equals("O")){
        if(C2.getText().equals("X")){
            if(A2.getBackground().getRGB() != colorBlock && !A2.getText().equals("O")){
                if(A2.getText().equals("X")){
                    karl = verifiPosLiberada("b",2);
                    if(karl == 3){
                            B2.setText("X");
                            JogadorAtivo();
                    }else if(karl == 1){
                            karl = verifiPosLiberada("d",2);
                            if(karl == 3){
                                D2.setText("X");
                                JogadorAtivo();
                            }
                    }
                }else if(A2.getText().equals("")){
                        A2.setText("X");
                        JogadorAtivo();
                }
            }else if(A4.getBackground().getRGB() != colorBlock && !A4.getText().equals("O")){
                if(A4.getText().equals("X")){
                    karl = verifiPosLiberada("b", 3);
                    if(karl == 3){
                        B3.setText("X");
                        JogadorAtivo();
                    }else if(karl == 1){
                            karl = verifiPosLiberada("d", 1);
                            if(karl == 3){
                                D1.setText("X");
                                JogadorAtivo();
                            }
                    }
                }else if(A4.getText().equals("")){
                        A4.setText("X");
                        JogadorAtivo();
                }
            }else if(C4.getBackground().getRGB() != colorBlock && !C4.getText().equals("O")){
                if(C4.getText().equals("X")){
                    karl = verifiPosLiberada("c",3);
                        if(karl == 3){
                            C3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("c",1);
                            if(karl == 3){
                                C1.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("c",5);
                                if(karl == 3){
                                    C5.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(C4.getText().equals("")){
                        C4.setText("X");
                        JogadorAtivo();
                }
            }
        }else{
                C2.setText("X");
                JogadorAtivo();
        }
    }else if(C3.getBackground().getRGB() != colorBlock && !C3.getText().equals("O")){
        if(C3.getText().equals("X")){
            if(A3.getBackground().getRGB() != colorBlock && !A3.getText().equals("O")){
                if(A3.getText().equals("X")){
                    karl = verifiPosLiberada("b",3);
                        if(karl == 3){
                            B3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d", 3);
                            if(karl == 3){
                                D3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A3.getText().equals("")){
                        A3.setText("X");
                        JogadorAtivo();
                }
            }else if(A5.getBackground().getRGB() != colorBlock && !A5.getText().equals("O")){
                if(A5.getText().equals("X")){
                    karl = verifiPosLiberada("b", 4);
                        if(karl == 3){
                            B4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",2);
                            if(karl == 3){
                                D2.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A5.getText().equals("")){
                    A5.setText("X");
                    JogadorAtivo();
                }
            }else if(C5.getBackground().getRGB() != colorBlock && !C5.getText().equals("O")){
                if(C5.getText().equals("X")){
                    karl = verifiPosLiberada("c",4);
                        if(karl == 3){
                            C4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("c",2);
                            if(karl == 3){
                                C2.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("c", 6);
                                if(karl == 3){
                                    C6.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(C5.getText().equals("")){
                        C5.setText("X");
                        JogadorAtivo();
                }
            }
        }else{
                C3.setText("X");
                JogadorAtivo();
        }
    }else if(B3.getBackground().getRGB() != colorBlock && !B3.getText().equals("O")){
        if(B3.getText().equals("X")){
            if(D3.getBackground().getRGB() != colorBlock && !D3.getText().equals("O")){
                if(D3.getText().equals("X")){
                    karl = verifiPosLiberada("c",3);
                        if(karl == 3){
                            C3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 3);
                            if(karl == 3){
                                A3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D3.getText().equals("")){
                        D3.setText("X");
                        JogadorAtivo();
                }
            }else if(D1.getBackground().getRGB() != colorBlock && !D1.getText().equals("O")){
                if(D1.getText().equals("X")){
                    karl = verifiPosLiberada("c", 2);
                    if(karl == 3){
                            C2.setText("X");
                            JogadorAtivo();
                    }else if(karl == 1){
                        karl = verifiPosLiberada("a",4);
                            if(karl == 3){
                                A4.setText("X");
                                JogadorAtivo();
                            }
                    }
                }else if(D1.getText().equals("")){
                    D1.setText("X");
                    JogadorAtivo();
                }
            }else if(B1.getBackground().getRGB() != colorBlock && !B1.getText().equals("O")){
                if(B1.getText().equals("X")){
                    karl = verifiPosLiberada("b",2);
                        if(karl == 3){
                            B2.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("b",4);
                            if(karl == 3){
                                B4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B1.getText().equals("")){
                    B1.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                B3.setText("X");
                JogadorAtivo();
        }
    }else if(D1.getBackground().getRGB() != colorBlock && !D1.getText().equals("O")){
        if(D1.getText().equals("X")){
            if(D3.getBackground().getRGB() != colorBlock && !D3.getText().equals("O")){
                if(D3.getText().equals("X")){
                    karl = verifiPosLiberada("d",2);
                        if(karl == 3){
                            D2.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("D", 4);
                            if(karl == 3){
                                D4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D3.getText().equals("")){
                    D3.setText("X");
                    JogadorAtivo();
                }
            }else if(B3.getBackground().getRGB() != colorBlock && !B3.getText().equals("O")){
                if(B3.getText().equals("X")){
                    karl = verifiPosLiberada("c", 2);
                        if(karl == 3){
                            C2.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",4);
                            if(karl == 3){
                                A4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B3.getText().equals("")){
                    B3.setText("X");
                    JogadorAtivo();
                }
            }else if(B1.getBackground().getRGB() != colorBlock && !B1.getText().equals("O")){
                if(B1.getText().equals("X")){
                    karl = verifiPosLiberada("c",1);
                        if(karl == 3){
                            C1.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",1);
                            if(karl == 3){
                                A1.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B1.getText().equals("")){
                    B1.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                D1.setText("X");
                JogadorAtivo();
        }
    }else if(D5.getBackground().getRGB() != colorBlock && !D5.getText().equals("O")){
        if(D5.getText().equals("X")){
            if(D3.getBackground().getRGB() != colorBlock && !D3.getText().equals("O")){
                if(D3.getText().equals("X")){
                    karl = verifiPosLiberada("d",4);
                        if(karl == 3){
                            D4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d", 2);
                            if(karl == 3){
                                D2.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("d", 6);
                                if(karl == 3){
                                    D6.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(D3.getText().equals("")){
                    D3.setText("X");
                    JogadorAtivo();
                }
            }else if(B3.getBackground().getRGB() != colorBlock && !B3.getText().equals("O")){
                if(B3.getText().equals("X")){
                    karl = verifiPosLiberada("c", 4);
                        if(karl == 3){
                            C4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",2);
                            if(karl == 3){
                                A2.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B3.getText().equals("")){
                    B3.setText("X");
                    JogadorAtivo();
                }
            }else if(B5.getBackground().getRGB() != colorBlock && !B5.getText().equals("O")){
                if(B5.getText().equals("X")){
                    karl = verifiPosLiberada("c",5);
                        if(karl == 3){
                            C5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",5);
                            if(karl == 3){
                                A5.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B5.getText().equals("")){
                    B5.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                D5.setText("X");
                JogadorAtivo();
        }
    }else if(A1.getBackground().getRGB() != colorBlock && !A1.getText().equals("O")){
        if(A1.getText().equals("X")){
            if(A3.getBackground().getRGB() != colorBlock && !A3.getText().equals("O")){
                if(A3.getText().equals("X")){
                    karl = verifiPosLiberada("a",2);
                        if(karl == 3){
                            A2.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 4);
                            if(karl == 3){
                                A4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A3.getText().equals("")){
                    A3.setText("X");
                    JogadorAtivo();
                }
            }else if(C3.getBackground().getRGB() != colorBlock && !C3.getText().equals("O")){
                if(C3.getText().equals("X")){
                    karl = verifiPosLiberada("b", 2);
                        if(karl == 3){
                            B2.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",4);
                            if(karl == 3){
                                D4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C3.getText().equals("")){
                    C3.setText("X");
                    JogadorAtivo();
                }
            }else if(C1.getBackground().getRGB() != colorBlock && !C1.getText().equals("O")){
                if(C1.getText().equals("X")){
                    karl = verifiPosLiberada("b",1);
                        if(karl == 3){
                            B1.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",1);
                            if(karl == 3){
                                D1.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C1.getText().equals("")){
                    C1.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                A1.setText("X");
                JogadorAtivo();
        }
    }else if(A2.getBackground().getRGB() != colorBlock && !A2.getText().equals("O")){
        if(A2.getText().equals("X")){
            if(A4.getBackground().getRGB() != colorBlock && !A4.getText().equals("O")){
                if(A4.getText().equals("X")){
                    karl = verifiPosLiberada("a",3);
                        if(karl == 3){
                            A3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 5);
                            if(karl == 3){
                                A5.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("a", 1);
                                if(karl == 3){
                                    A1.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(A4.getText().equals("")){
                    A4.setText("X");
                    JogadorAtivo();
                }
            }else if(C4.getBackground().getRGB() != colorBlock && !C4.getText().equals("O")){
                if(C4.getText().equals("X")){
                    karl = verifiPosLiberada("b", 3);
                        if(karl == 3){
                            B3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",5);
                            if(karl == 3){
                                D5.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C4.getText().equals("")){
                    C4.setText("X");
                    JogadorAtivo();
                }
            }else if(C2.getBackground().getRGB() != colorBlock && !C2.getText().equals("O")){
                if(C2.getText().equals("X")){
                    karl = verifiPosLiberada("b",2);
                        if(karl == 3){
                            B2.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",2);
                            if(karl == 3){
                                D2.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C2.getText().equals("")){
                    C2.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                A2.setText("X");
                JogadorAtivo();
        }
    }else if(A3.getBackground().getRGB() != colorBlock && !A3.getText().equals("O")){
        if(A3.getText().equals("X")){
            if(A5.getBackground().getRGB() != colorBlock && !A5.getText().equals("O")){
                if(A5.getText().equals("X")){
                    karl = verifiPosLiberada("a",4);
                        if(karl == 3){
                            A4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 6);
                            if(karl == 3){
                                A6.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("a", 2);
                                if(karl == 3){
                                    A2.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(A5.getText().equals("")){
                    A5.setText("X");
                    JogadorAtivo();
                }
            }else if(C5.getBackground().getRGB() != colorBlock && !C5.getText().equals("O")){
                if(C5.getText().equals("X")){
                    karl = verifiPosLiberada("b", 4);
                        if(karl == 3){
                            B4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",6);
                            if(karl == 3){
                                D6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C5.getText().equals("")){
                    C5.setText("X");
                    JogadorAtivo();
                }
            }else if(C3.getBackground().getRGB() != colorBlock && !C3.getText().equals("O")){
                if(C3.getText().equals("X")){
                    karl = verifiPosLiberada("b",3);
                        if(karl == 3){
                            B3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",3);
                            if(karl == 3){
                                D3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C3.getText().equals("")){
                    C3.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                A3.setText("X");
                JogadorAtivo();
        }
    }else if(A4.getBackground().getRGB() != colorBlock && !A4.getText().equals("O")){
        if(A4.getText().equals("X")){
            if(A6.getBackground().getRGB() != colorBlock && !A6.getText().equals("O")){
                if(A6.getText().equals("X")){
                    karl = verifiPosLiberada("a",5);
                        if(karl == 3){
                            A5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 3);
                            if(karl == 3){
                                A3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A6.getText().equals("")){
                    A6.setText("X");
                    JogadorAtivo();
                }
            }else if(C6.getBackground().getRGB() != colorBlock && !C6.getText().equals("O")){
                if(C6.getText().equals("X")){
                    karl = verifiPosLiberada("b", 5);
                        if(karl == 3){
                            B5.setText("X");
                            JogadorAtivo();
                        }
                }else if(C6.getText().equals("")){
                    C6.setText("X");
                    JogadorAtivo();
                }
            }else if(C4.getBackground().getRGB() != colorBlock && !C4.getText().equals("O")){
                if(C4.getText().equals("X")){
                    karl = verifiPosLiberada("b",4);
                        if(karl == 3){
                            B4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",4);
                            if(karl == 3){
                                D4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C4.getText().equals("")){
                    C4.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                A4.setText("X");
                JogadorAtivo();
        }
    }else if(A5.getBackground().getRGB() != colorBlock && !A5.getText().equals("O")){
        if(A5.getText().equals("X")){
            if(A3.getBackground().getRGB() != colorBlock && !A3.getText().equals("O")){
                if(A3.getText().equals("X")){
                    karl = verifiPosLiberada("a",4);
                        if(karl == 3){
                            A4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 6);
                            if(karl == 3){
                                A6.setText("X");
                                JogadorAtivo();
                            }else if(karl == 1){
                                karl = verifiPosLiberada("a", 2);
                                if(karl == 3){
                                    A2.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(A3.getText().equals("")){
                    A3.setText("X");
                    JogadorAtivo();
                }
            }else if(C5.getBackground().getRGB() != colorBlock && !C5.getText().equals("O")){
                if(C5.getText().equals("X")){
                    karl = verifiPosLiberada("b", 5);
                        if(karl == 3){
                            B5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",5);
                            if(karl == 3){
                                D5.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C5.getText().equals("")){
                    C5.setText("X");
                    JogadorAtivo();
                }
            }else if(C3.getBackground().getRGB() != colorBlock && !C3.getText().equals("O")){
                if(C3.getText().equals("X")){
                    karl = verifiPosLiberada("b",4);
                        if(karl == 3){
                            B4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",2);
                            if(karl == 3){
                                D2.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C3.getText().equals("")){
                    C3.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                A5.setText("X");
                JogadorAtivo();
        }
    }else if(A6.getBackground().getRGB() != colorBlock && !A6.getText().equals("O")){
        if(A6.getText().equals("X")){
            if(A4.getBackground().getRGB() != colorBlock && !A4.getText().equals("O")){
                if(A4.getText().equals("X")){
                    karl = verifiPosLiberada("a",5);
                        if(karl == 3){
                            A5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 3);
                            if(karl == 3){
                                A3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A4.getText().equals("")){
                    A4.setText("X");
                    JogadorAtivo();
                }
            }else if(C6.getBackground().getRGB() != colorBlock && !C6.getText().equals("O")){
                if(C6.getText().equals("X")){
                    karl = verifiPosLiberada("b", 6);
                        if(karl == 3){
                            B6.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",6);
                            if(karl == 3){
                                D6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C6.getText().equals("")){
                    C6.setText("X");
                    JogadorAtivo();
                }
            }else if(C4.getBackground().getRGB() != colorBlock && !C4.getText().equals("O")){
                if(C4.getText().equals("X")){
                    karl = verifiPosLiberada("b",4);
                        if(karl == 3){
                            B4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",4);
                            if(karl == 3){
                                D4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C4.getText().equals("")){
                    C4.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                A6.setText("X");
                JogadorAtivo();
        }
    }else if(D2.getBackground().getRGB() != colorBlock && !D2.getText().equals("O")){
        if(D2.getText().equals("X")){
            if(D4.getBackground().getRGB() != colorBlock && !D4.getText().equals("O")){
                if(D4.getText().equals("X")){
                    karl = verifiPosLiberada("d",3);
                        if(karl == 3){
                            D3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d", 5);
                            if(karl == 3){
                                D5.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("d", 1);
                                if(karl == 3){
                                    D1.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(D4.getText().equals("")){
                    D4.setText("X");
                    JogadorAtivo();
                }
            }else if(B4.getBackground().getRGB() != colorBlock && !B4.getText().equals("O")){
                if(B4.getText().equals("X")){
                    karl = verifiPosLiberada("c", 3);
                        if(karl == 3){
                            C3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",5);
                            if(karl == 3){
                                A5.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B4.getText().equals("")){
                    B4.setText("X");
                    JogadorAtivo();
                }
            }else if(B2.getBackground().getRGB() != colorBlock && !B2.getText().equals("O")){
                if(B2.getText().equals("X")){
                    karl = verifiPosLiberada("c",2);
                        if(karl == 3){
                            C2.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",2);
                            if(karl == 3){
                                A2.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B2.getText().equals("")){
                    B2.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                D2.setText("X");
                JogadorAtivo();
        }
    }else if(D3.getBackground().getRGB() != colorBlock && !D3.getText().equals("O")){
        if(D3.getText().equals("X")){
            if(D5.getBackground().getRGB() != colorBlock && !D5.getText().equals("O")){
                if(D5.getText().equals("X")){
                    karl = verifiPosLiberada("d",4);
                        if(karl == 3){
                            D4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d", 6);
                            if(karl == 3){
                                D6.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("d", 2);
                                if(karl == 3){
                                    D2.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(D5.getText().equals("")){
                    D5.setText("X");
                    JogadorAtivo();
                }
            }else if(B5.getBackground().getRGB() != colorBlock && !B5.getText().equals("O")){
                if(B5.getText().equals("X")){
                    karl = verifiPosLiberada("c", 4);
                        if(karl == 3){
                            C4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",6);
                            if(karl == 3){
                                A6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B5.getText().equals("")){
                    B5.setText("X");
                    JogadorAtivo();
                }
            }else if(B3.getBackground().getRGB() != colorBlock && !B3.getText().equals("O")){
                if(B3.getText().equals("X")){
                    karl = verifiPosLiberada("c",3);
                        if(karl == 3){
                            C3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",3);
                            if(karl == 3){
                                A3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B3.getText().equals("")){
                    B3.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                D3.setText("X");
                JogadorAtivo();
        }
    }else if(D4.getBackground().getRGB() != colorBlock && !D4.getText().equals("O")){
        if(D4.getText().equals("X")){
            if(D6.getBackground().getRGB() != colorBlock && !D6.getText().equals("O")){
                if(D6.getText().equals("X")){
                    karl = verifiPosLiberada("d",5);
                        if(karl == 3){
                            D5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d", 3);
                            if(karl == 3){
                                D3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D6.getText().equals("")){
                    D6.setText("X");
                    JogadorAtivo();
                }
            }else if(B6.getBackground().getRGB() != colorBlock && !B6.getText().equals("O")){
                if(B6.getText().equals("X")){
                    karl = verifiPosLiberada("c", 5);
                        if(karl == 3){
                            C5.setText("X");
                            JogadorAtivo();
                        }
                }else if(B6.getText().equals("")){
                    B6.setText("X");
                    JogadorAtivo();
                }
            }else if(B4.getBackground().getRGB() != colorBlock && !B4.getText().equals("O")){
                if(B4.getText().equals("X")){
                    karl = verifiPosLiberada("c",4);
                        if(karl == 3){
                            C4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",4);
                            if(karl == 3){
                                A4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B4.getText().equals("")){
                    B4.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                D4.setText("X");
                JogadorAtivo();
        }
    }else if(D6.getBackground().getRGB() != colorBlock && !D6.getText().equals("O")){
        if(D6.getText().equals("X")){
            if(D4.getBackground().getRGB() != colorBlock && !D4.getText().equals("O")){
                if(D4.getText().equals("X")){
                    karl = verifiPosLiberada("d",5);
                        if(karl == 3){
                            D5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d", 3);
                            if(karl == 3){
                                D3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D4.getText().equals("")){
                    D4.setText("X");
                    JogadorAtivo();
                }
            }else if(B6.getBackground().getRGB() != colorBlock && !B6.getText().equals("O")){
                if(B6.getText().equals("X")){
                    karl = verifiPosLiberada("c", 6);
                        if(karl == 3){
                            C6.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",6);
                            if(karl == 3){
                                A6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B6.getText().equals("")){
                    B6.setText("X");
                    JogadorAtivo();
                }
            }else if(B4.getBackground().getRGB() != colorBlock && !B4.getText().equals("O")){
                if(B4.getText().equals("X")){
                    karl = verifiPosLiberada("c",5);
                        if(karl == 3){
                            C5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",3);
                            if(karl == 3){
                                A3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B4.getText().equals("")){
                    B4.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                D6.setText("X");
                JogadorAtivo();
        }
    }else if(B1.getBackground().getRGB() != colorBlock && !B1.getText().equals("O")){
        if(B1.getText().equals("X")){
            if(B3.getBackground().getRGB() != colorBlock && !B3.getText().equals("O")){
                if(B3.getText().equals("X")){
                    karl = verifiPosLiberada("b",2);
                        if(karl == 3){
                            B2.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("b", 4);
                            if(karl == 3){
                                B4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B3.getText().equals("")){
                    B3.setText("X");
                    JogadorAtivo();
                }
            }else if(D3.getBackground().getRGB() != colorBlock && !D3.getText().equals("O")){
                if(D3.getText().equals("X")){
                    karl = verifiPosLiberada("c", 2);
                        if(karl == 3){
                            C2.setText("X");
                            JogadorAtivo();
                        }
                }else if(D3.getText().equals("")){
                    D3.setText("X");
                    JogadorAtivo();
                }
            }else if(D1.getBackground().getRGB() != colorBlock && !D1.getText().equals("O")){
                if(D1.getText().equals("X")){
                    karl = verifiPosLiberada("c",1);
                        if(karl == 3){
                            C1.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",1);
                            if(karl == 3){
                                A1.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D1.getText().equals("")){
                    D1.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                B1.setText("X");
                JogadorAtivo();
        }
    }else if(C1.getBackground().getRGB() != colorBlock && !C1.getText().equals("O")){
        if(C1.getText().equals("X")){
            if(C3.getBackground().getRGB() != colorBlock && !C3.getText().equals("O")){
                if(C3.getText().equals("X")){
                    karl = verifiPosLiberada("c",2);
                        if(karl == 3){
                            C2.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("c", 4);
                            if(karl == 3){
                                C4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C3.getText().equals("")){
                    C3.setText("X");
                    JogadorAtivo();
                }
            }else if(A3.getBackground().getRGB() != colorBlock && !A3.getText().equals("O")){
                if(A3.getText().equals("X")){
                    karl = verifiPosLiberada("b", 2);
                        if(karl == 3){
                            B2.setText("X");
                            JogadorAtivo();
                        }
                }else if(A3.getText().equals("")){
                    A3.setText("X");
                    JogadorAtivo();
                }
            }else if(A1.getBackground().getRGB() != colorBlock && !A1.getText().equals("O")){
                if(A1.getText().equals("X")){
                    karl = verifiPosLiberada("b",1);
                        if(karl == 3){
                            B1.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",1);
                            if(karl == 3){
                                D1.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A1.getText().equals("")){
                    A1.setText("X");
                    JogadorAtivo();
                }
            }
        }else{
                C1.setText("X");
                JogadorAtivo();
        }
    }else if(C4.getBackground().getRGB() != colorBlock && !C4.getText().equals("O")){
        if(C4.getText().equals("X")){
            if(A4.getBackground().getRGB() != colorBlock && !A4.getText().equals("O")){
                if(A4.getText().equals("X")){
                    karl = verifiPosLiberada("b",4);
                        if(karl == 3){
                            B4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d", 4);
                            if(karl == 3){
                                D4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A4.getText().equals("")){
                        A4.setText("X");
                        JogadorAtivo();
                }
            }else if(A6.getBackground().getRGB() != colorBlock && !A6.getText().equals("O")){
                if(A6.getText().equals("X")){
                    karl = verifiPosLiberada("b",5);
                        if(karl == 3){
                            B5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",3);
                            if(karl == 3){
                                D3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A6.getText().equals("")){
                    A6.setText("X");
                    JogadorAtivo();
                }
            }else if(C6.getBackground().getRGB() != colorBlock && !C6.getText().equals("O")){
                if(C6.getText().equals("X")){
                    karl = verifiPosLiberada("c",5);
                        if(karl == 3){
                            C5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("c",3);
                            if(karl == 3){
                                C3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C6.getText().equals("")){
                        C6.setText("X");
                        JogadorAtivo();
                }
            }else if(C2.getBackground().getRGB() != colorBlock && !C2.getText().equals("O")){
                if(C2.getText().equals("X")){
                    karl = verifiPosLiberada("c",3);
                        if(karl == 3){
                            C3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("c",1);
                            if(karl == 3){
                                C1.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("c",5);
                                if(karl == 3){
                                    C5.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(C2.getText().equals("")){
                        C2.setText("X");
                        JogadorAtivo();
                }
            }
        }else{
                C4.setText("X");
                JogadorAtivo();
        }
    }else if(B4.getBackground().getRGB() != colorBlock && !B4.getText().equals("O")){
        if(B4.getText().equals("X")){
            if(D4.getBackground().getRGB() != colorBlock && !D4.getText().equals("O")){
                if(D4.getText().equals("X")){
                    karl = verifiPosLiberada("c",4);
                        if(karl == 3){
                            C4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 4);
                            if(karl == 3){
                                A4.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D4.getText().equals("")){
                        D4.setText("X");
                        JogadorAtivo();
                }
            }else if(D6.getBackground().getRGB() != colorBlock && !D6.getText().equals("O")){
                if(D6.getText().equals("X")){
                    karl = verifiPosLiberada("c",5);
                        if(karl == 3){
                            C5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",3);
                            if(karl == 3){
                                A3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D6.getText().equals("")){
                    D6.setText("X");
                    JogadorAtivo();
                }
            }else if(B6.getBackground().getRGB() != colorBlock && !B6.getText().equals("O")){
                if(B6.getText().equals("X")){
                    karl = verifiPosLiberada("b",5);
                        if(karl == 3){
                            B5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("b",3);
                            if(karl == 3){
                                B3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B6.getText().equals("")){
                        B6.setText("X");
                        JogadorAtivo();
                }
            }else if(B2.getBackground().getRGB() != colorBlock && !B2.getText().equals("O")){
                if(B2.getText().equals("X")){
                    karl = verifiPosLiberada("b",3);
                        if(karl == 3){
                            B3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("b",1);
                            if(karl == 3){
                                B1.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("b",5);
                                if(karl == 3){
                                    B5.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(B2.getText().equals("")){
                        B2.setText("X");
                        JogadorAtivo();
                }
            }else if(D2.getBackground().getRGB() != colorBlock && !D2.getText().equals("O")){
                if(D2.getText().equals("X")){
                    karl = verifiPosLiberada("d",3);
                        if(karl == 3){
                            D3.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",1);
                            if(karl == 3){
                                D1.setText("X");
                                JogadorAtivo();
                            }else{
                                karl = verifiPosLiberada("d",5);
                                if(karl == 3){
                                    D5.setText("X");
                                    JogadorAtivo();
                                }
                            }
                        }
                }else if(D2.getText().equals("")){
                        D2.setText("X");
                        JogadorAtivo();
                }
            }
        }else{
                B4.setText("X");
                JogadorAtivo();
        }
    }else if(B5.getBackground().getRGB() != colorBlock && !B5.getText().equals("O")){
        if(B5.getText().equals("X")){
            if(D5.getBackground().getRGB() != colorBlock && !D5.getText().equals("O")){
                if(D5.getText().equals("X")){
                    karl = verifiPosLiberada("c",5);
                        if(karl == 3){
                            C5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 5);
                            if(karl == 3){
                                A5.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D5.getText().equals("")){
                        D5.setText("X");
                        JogadorAtivo();
                }
            }else if(D3.getBackground().getRGB() != colorBlock && !D3.getText().equals("O")){
                if(D3.getText().equals("X")){
                    karl = verifiPosLiberada("c",4);
                        if(karl == 3){
                            C4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a",6);
                            if(karl == 3){
                                A6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D3.getText().equals("")){
                    D3.setText("X");
                    JogadorAtivo();
                }
            }else if(B3.getBackground().getRGB() != colorBlock && !B3.getText().equals("O")){
                if(B3.getText().equals("X")){
                    karl = verifiPosLiberada("b",4);
                        if(karl == 3){
                            B4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("b",6);
                            if(karl == 3){
                                B6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B3.getText().equals("")){
                        B3.setText("X");
                        JogadorAtivo();
                }
            }
        }else{
                B5.setText("X");
                JogadorAtivo();
        }
    }else if(C5.getBackground().getRGB() != colorBlock && !C5.getText().equals("O")){
        if(C5.getText().equals("X")){
            if(A5.getBackground().getRGB() != colorBlock && !A5.getText().equals("O")){
                if(A5.getText().equals("X")){
                    karl = verifiPosLiberada("b",5);
                        if(karl == 3){
                            B5.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d", 5);
                            if(karl == 3){
                                D5.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A5.getText().equals("")){
                        A5.setText("X");
                        JogadorAtivo();
                }
            }else if(A3.getBackground().getRGB() != colorBlock && !A3.getText().equals("O")){
                if(A3.getText().equals("X")){
                    karl = verifiPosLiberada("b",4);
                        if(karl == 3){
                            B4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d",6);
                            if(karl == 3){
                                D6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A3.getText().equals("")){
                    A3.setText("X");
                    JogadorAtivo();
                }
            }else if(C3.getBackground().getRGB() != colorBlock && !C3.getText().equals("O")){
                if(C3.getText().equals("X")){
                    karl = verifiPosLiberada("c",4);
                        if(karl == 3){
                            C4.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("c",6);
                            if(karl == 3){
                                C6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C3.getText().equals("")){
                        C3.setText("X");
                        JogadorAtivo();
                }
            }
        }else{
                C5.setText("X");
                JogadorAtivo();
        }
    }else if(C6.getBackground().getRGB() != colorBlock && !C6.getText().equals("O")){
        if(C6.getText().equals("X")){
            if(A6.getBackground().getRGB() != colorBlock && !A6.getText().equals("O")){
                if(A6.getText().equals("X")){
                    karl = verifiPosLiberada("b",6);
                        if(karl == 3){
                            B6.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("d", 6);
                            if(karl == 3){
                                D6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(A6.getText().equals("")){
                        A6.setText("X");
                        JogadorAtivo();
                }
            }else if(A4.getBackground().getRGB() != colorBlock && !A4.getText().equals("O")){
                if(A4.getText().equals("X")){
                    karl = verifiPosLiberada("b",5);
                        if(karl == 3){
                            B5.setText("X");
                            JogadorAtivo();
                        }
                }else if(A4.getText().equals("")){
                    A4.setText("X");
                    JogadorAtivo();
                }
            }else if(C4.getBackground().getRGB() != colorBlock && !C4.getText().equals("O")){
                if(C4.getText().equals("X")){
                    karl = verifiPosLiberada("c",5);
                        if(karl == 3){
                            C5.setText("X");
                            JogadorAtivo();
                        }else if (karl == 1){
                            karl = verifiPosLiberada("c",3);
                            if(karl == 3){
                                C3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(C4.getText().equals("")){
                        C4.setText("X");
                        JogadorAtivo();
                }
            }
        }else{
                C6.setText("X");
                JogadorAtivo();
        }
    }else if(B6.getBackground().getRGB() != colorBlock && !B6.getText().equals("O")){
        if(B6.getText().equals("X")){
            if(D6.getBackground().getRGB() != colorBlock && !D6.getText().equals("O")){
                if(D6.getText().equals("X")){
                    karl = verifiPosLiberada("c",6);
                        if(karl == 3){
                            C6.setText("X");
                            JogadorAtivo();
                        }else if(karl == 1){
                            karl = verifiPosLiberada("a", 6);
                            if(karl == 3){
                                A6.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(D6.getText().equals("")){
                        D6.setText("X");
                        JogadorAtivo();
                }
            }else if(D4.getBackground().getRGB() != colorBlock && !D4.getText().equals("O")){
                if(D4.getText().equals("X")){
                    karl = verifiPosLiberada("b",5);
                        if(karl == 3){
                            C5.setText("X");
                            JogadorAtivo();
                        }
                }else if(D4.getText().equals("")){
                    D4.setText("X");
                    JogadorAtivo();
                }
            }else if(B4.getBackground().getRGB() != colorBlock && !B4.getText().equals("O")){
                if(B4.getText().equals("X")){
                    karl = verifiPosLiberada("b",5);
                        if(karl == 3){
                            B5.setText("X");
                            JogadorAtivo();
                        }else if (karl == 1){
                            karl = verifiPosLiberada("b",3);
                            if(karl == 3){
                                B3.setText("X");
                                JogadorAtivo();
                            }
                        }
                }else if(B4.getText().equals("")){
                        B4.setText("X");
                        JogadorAtivo();
                }
            }
        }else{
                B6.setText("X");
                JogadorAtivo();
        }
    }
    }
    private void jogarPrimeiro(){
        int flag=0;
        boolean da;
        da = B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock;
       flag = verifiRedor("b",2);
       if(da==true && flag == 1){
            B2.setText("X");
            JogadorAtivo();
        }else{
            da = B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock;
            flag = verifiRedor("b",3);
            if(da==true && flag == 1){
               B3.setText("X");
               JogadorAtivo();
            }else{
                da = B4.getText().equals("") && B4.getBackground().getRGB() != colorBlock;
                flag = verifiRedor("b",4);
                if(da==true && flag == 1){
                   B4.setText("X");
                   JogadorAtivo();
                }else{
                    da = B5.getText().equals("") && B5.getBackground().getRGB() != colorBlock;
                    flag = verifiRedor("b",5);
                    if(da==true && flag == 1){
                       B5.setText("X");
                       JogadorAtivo();
                    }else{
                        da = C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock;
                        flag = verifiRedor("c",2);
                        if(da==true && flag == 1){
                           C2.setText("X");
                           JogadorAtivo();
                        }else{
                            da = C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock;
                            flag = verifiRedor("c",3);
                            if(da==true && flag == 1){
                               C3.setText("X");
                               JogadorAtivo();
                            }else{
                                da = C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock;
                                flag = verifiRedor("c",4);
                                if(da==true && flag == 1){
                                    C4.setText("X");
                                    JogadorAtivo();
                                }else{
                                    da = C5.getText().equals("") && C5.getBackground().getRGB() != colorBlock;
                                    flag = verifiRedor("c",5);
                                    if(da==true && flag == 1){
                                        C5.setText("X");
                                        JogadorAtivo();
                                    }else estrategia();
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    private int verifiRedor(String j, int k){
        int cont=0;
        
        if(j.equalsIgnoreCase("a")){
            switch(k){
                case 1:
                    if(A1.getBackground().getRGB()!=colorBlock && A1.getText().equalsIgnoreCase("")){//verifica ao redor de A1
                    if(A2.getText().equals("") && A2.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(B1.getText().equals("") && B1.getBackground().getRGB() != colorBlock && 
                       B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 2:
                    if(A2.getBackground().getRGB()!=colorBlock && A2.getText().equalsIgnoreCase("")){//verifica ao redor de A2
                    if(A1.getText().equals("") && A1.getBackground().getRGB()!=colorBlock && 
                       A3.getText().equals("") && A3.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(B1.getText().equals("") && B1.getBackground().getRGB()!=colorBlock && 
                       B2.getText().equals("") && B2.getBackground().getRGB()!=colorBlock &&
                       B3.getText().equals("") && B3.getBackground().getRGB()!=colorBlock )
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 3:
                    if(A3.getBackground().getRGB()!=colorBlock && A3.getText().equalsIgnoreCase("")){//verifica ao redor de A3
                    if(A2.getText().equals("") && A2.getBackground().getRGB()!=colorBlock && 
                       A4.getText().equals("") && A4.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(B2.getText().equals("") && B2.getBackground().getRGB()!=colorBlock && 
                       B3.getText().equals("") && B3.getBackground().getRGB()!=colorBlock &&
                       B4.getText().equals("") && B4.getBackground().getRGB()!=colorBlock )
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 4:
                    if(A4.getBackground().getRGB()!=colorBlock && A4.getText().equalsIgnoreCase("")){
                    if(A3.getText().equals("") && A3.getBackground().getRGB()!=colorBlock && 
                       A5.getText().equals("") && A5.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(B3.getText().equals("") && B3.getBackground().getRGB()!=colorBlock && 
                       B4.getText().equals("") && B4.getBackground().getRGB()!=colorBlock &&
                       B5.getText().equals("") && B5.getBackground().getRGB()!=colorBlock )
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 5:
                    if(A5.getBackground().getRGB()!=colorBlock && A5.getText().equalsIgnoreCase("")){
                    if(A4.getText().equals("") && A4.getBackground().getRGB()!=colorBlock && 
                       A6.getText().equals("") && A6.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(B4.getText().equals("") && B4.getBackground().getRGB()!=colorBlock && 
                       B5.getText().equals("") && B5.getBackground().getRGB()!=colorBlock &&
                       B6.getText().equals("") && B6.getBackground().getRGB()!=colorBlock )
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 6:
                    if(A6.getBackground().getRGB()!=colorBlock && A6.getText().equalsIgnoreCase("")){
                    if(A5.getText().equals("") && A5.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(B5.getText().equals("") && B5.getBackground().getRGB()!=colorBlock && 
                    B6.getText().equals("") && B6.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
            }
        }else if(j.equalsIgnoreCase("b")){
            switch(k){
                case 1:
                    if(B1.getBackground().getRGB()!=colorBlock && B1.getText().equals("")){
                    if(A1.getText().equals("") && A1.getBackground().getRGB() != colorBlock &&
                       A2.getText().equals("") && A2.getBackground().getRGB() != colorBlock )
                        cont+=1;
                    if(B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(C1.getText().equals("") && C1.getBackground().getRGB() != colorBlock &&
                       C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock )
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 2:
                    if(B2.getBackground().getRGB()!=colorBlock && B2.getText().equals("")){
                    if(A1.getText().equals("") && A1.getBackground().getRGB() != colorBlock &&
                       A2.getText().equals("") && A2.getBackground().getRGB() != colorBlock &&
                       A3.getText().equals("") && A3.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if (B1.getText().equals("") && B1.getBackground().getRGB() != colorBlock &&
                        B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(C1.getText().equals("") && C1.getBackground().getRGB() != colorBlock &&
                       C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock &&
                       C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 3:
                    if(B3.getBackground().getRGB()!=colorBlock && B3.getText().equals("")){
                    if(A2.getText().equals("") && A2.getBackground().getRGB() != colorBlock &&
                       A3.getText().equals("") && A3.getBackground().getRGB() != colorBlock &&
                       A4.getText().equals("") && A4.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if (B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock &&
                        B4.getText().equals("") && B4.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock &&
                       C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock &&
                       C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 4:
                    if(B4.getBackground().getRGB()!=colorBlock && B4.getText().equals("")){
                    if(A3.getText().equals("") && A3.getBackground().getRGB() != colorBlock &&
                       A4.getText().equals("") && A4.getBackground().getRGB() != colorBlock &&
                       A5.getText().equals("") && A5.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if (B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock &&
                        B5.getText().equals("") && B5.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock &&
                       C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock &&
                       C5.getText().equals("") && C5.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 5:
                    if(B5.getBackground().getRGB()!=colorBlock && B5.getText().equals("")){
                    if(A4.getText().equals("") && A4.getBackground().getRGB() != colorBlock &&
                       A5.getText().equals("") && A5.getBackground().getRGB() != colorBlock &&
                       A6.getText().equals("") && A6.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if (B4.getText().equals("") && B4.getBackground().getRGB() != colorBlock &&
                        B6.getText().equals("") && B6.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock &&
                       C5.getText().equals("") && C5.getBackground().getRGB() != colorBlock &&
                       C6.getText().equals("") && C6.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 6:
                    if(B6.getBackground().getRGB()!=colorBlock && B6.getText().equals("")){
                    if(A5.getText().equals("") && A5.getBackground().getRGB() != colorBlock &&
                       A6.getText().equals("") && A6.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if (B5.getText().equals("") && B5.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(C5.getText().equals("") && C5.getBackground().getRGB() != colorBlock &&
                       C6.getText().equals("") && C6.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    }
            }
        }else if(j.equalsIgnoreCase("c")){
            switch(k){
                case 1:
                    if(C1.getBackground().getRGB()!=colorBlock && C1.getText().equals("")){
                    if(B1.getText().equals("") && B1.getBackground().getRGB() != colorBlock &&
                       B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock )
                        cont+=1;
                    if(C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(D1.getText().equals("") && D1.getBackground().getRGB() != colorBlock &&
                       D2.getText().equals("") && D2.getBackground().getRGB() != colorBlock )
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 2:
                    if(C2.getBackground().getRGB()!=colorBlock && C2.getText().equals("")){
                    if(B1.getText().equals("") && B1.getBackground().getRGB() != colorBlock &&
                       B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock &&
                       B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if (C1.getText().equals("") && C1.getBackground().getRGB() != colorBlock &&
                        C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(D1.getText().equals("") && D1.getBackground().getRGB() != colorBlock &&
                       D2.getText().equals("") && D2.getBackground().getRGB() != colorBlock &&
                       D3.getText().equals("") && D3.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 3:
                    if(C3.getBackground().getRGB()!=colorBlock && C3.getText().equals("")){
                    if(B2.getText().equals("") && B2.getBackground().getRGB() != colorBlock &&
                       B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock &&
                       B4.getText().equals("") && B4.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if (C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock &&
                        C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(D2.getText().equals("") && D2.getBackground().getRGB() != colorBlock &&
                       D3.getText().equals("") && D3.getBackground().getRGB() != colorBlock &&
                       D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 4:
                    if(C4.getBackground().getRGB()!=colorBlock && C4.getText().equals("")){
                    if(B3.getText().equals("") && B3.getBackground().getRGB() != colorBlock &&
                       B4.getText().equals("") && B4.getBackground().getRGB() != colorBlock &&
                       B5.getText().equals("") && B5.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if (C3.getText().equals("") && C3.getBackground().getRGB() != colorBlock &&
                        C5.getText().equals("") && C5.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(D3.getText().equals("") && D3.getBackground().getRGB() != colorBlock &&
                       D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock &&
                       D5.getText().equals("") && D5.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 5:
                    if(C5.getBackground().getRGB()!=colorBlock && C5.getText().equals("")){
                    if(B4.getText().equals("") && B4.getBackground().getRGB() != colorBlock &&
                       B5.getText().equals("") && B5.getBackground().getRGB() != colorBlock &&
                       B6.getText().equals("") && B6.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if (C4.getText().equals("") && C4.getBackground().getRGB() != colorBlock &&
                        C6.getText().equals("") && C6.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(D4.getText().equals("") && D4.getBackground().getRGB() != colorBlock &&
                       D5.getText().equals("") && D5.getBackground().getRGB() != colorBlock &&
                       D6.getText().equals("") && D6.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
                case 6:
                    if(C6.getBackground().getRGB()!=colorBlock && C6.getText().equals("")){
                    if(B5.getText().equals("") && B5.getBackground().getRGB() != colorBlock &&
                       B6.getText().equals("") && B6.getBackground().getRGB() != colorBlock)
                cont+=1;
                    if (C5.getText().equals("") && C5.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(D5.getText().equals("") && D5.getBackground().getRGB() != colorBlock &&
                       D6.getText().equals("") && D6.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 3)
                        return 1;
                    else return 0;
                    }
            }
        }else if(j.equalsIgnoreCase("d")){
            switch(k){
                case 1:
                    if(D1.getBackground().getRGB()!=colorBlock && !D1.getText().equalsIgnoreCase("")){
                    if(D2.getText().equals("") && D2.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(C1.getText().equals("") && C1.getBackground().getRGB() != colorBlock && 
                       C2.getText().equals("") && C2.getBackground().getRGB() != colorBlock)
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 2:
                    if(D2.getBackground().getRGB()!=colorBlock && D2.getText().equalsIgnoreCase("")){
                    if(D1.getText().equals("") && D1.getBackground().getRGB()!=colorBlock && 
                       D3.getText().equals("") && D3.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(C1.getText().equals("") && C1.getBackground().getRGB()!=colorBlock && 
                       C2.getText().equals("") && C2.getBackground().getRGB()!=colorBlock &&
                       C3.getText().equals("") && C3.getBackground().getRGB()!=colorBlock )
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 3:
                    if(D3.getBackground().getRGB()!=colorBlock && D3.getText().equalsIgnoreCase("")){
                    if(D2.getText().equals("") && D2.getBackground().getRGB()!=colorBlock && 
                       D4.getText().equals("") && D4.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(C2.getText().equals("") && C2.getBackground().getRGB()!=colorBlock && 
                       C3.getText().equals("") && C3.getBackground().getRGB()!=colorBlock &&
                       C4.getText().equals("") && C4.getBackground().getRGB()!=colorBlock )
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 4:
                    if(D4.getBackground().getRGB()!=colorBlock && D4.getText().equalsIgnoreCase("")){
                    if(D3.getText().equals("") && D3.getBackground().getRGB()!=colorBlock && 
                       D5.getText().equals("") && D5.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(C3.getText().equals("") && C3.getBackground().getRGB()!=colorBlock && 
                       C4.getText().equals("") && C4.getBackground().getRGB()!=colorBlock &&
                       C5.getText().equals("") && C5.getBackground().getRGB()!=colorBlock )
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 5:
                    if(D5.getBackground().getRGB()!=colorBlock && D5.getText().equalsIgnoreCase("")){
                    if(D4.getText().equals("") && D4.getBackground().getRGB()!=colorBlock && 
                       D6.getText().equals("") && D6.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(C4.getText().equals("") && C4.getBackground().getRGB()!=colorBlock && 
                       C5.getText().equals("") && C5.getBackground().getRGB()!=colorBlock &&
                       C6.getText().equals("") && C6.getBackground().getRGB()!=colorBlock )
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
                case 6:
                    if(D6.getBackground().getRGB()!=colorBlock && D6.getText().equalsIgnoreCase("")){
                    if(D5.getText().equals("") && D5.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(C5.getText().equals("") && C5.getBackground().getRGB()!=colorBlock && 
                       C6.getText().equals("") && C6.getBackground().getRGB()!=colorBlock)
                        cont+=1;
                    if(cont == 2)
                        return 1;
                    else return 0;
                    }
            }
        }
        return 0;
    }
    
    
    
    /*public void util(){
            JOptionPane.showMessageDialog(null, "Estou na Defesa do util");
        if (A1.getText().equals("O") && A2.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && B2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && B1.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && C1.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && B2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A1.getText().equals("O") && C3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && A1.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && A3.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && A3.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && A4.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && B3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && C4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && B2.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (A2.getText().equals("O") && C2.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && A2.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && A1.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && A4.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && A5.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && B4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && C5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && B2.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && C1.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && B3.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A3.getText().equals("O") && C3.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && A3.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && A2.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && B3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && C2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && B4.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && C4.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && B5.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && C6.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && A5.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && A6.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && A4.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && A6.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && A4.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && A3.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && B4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && C3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && B5.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (A5.getText().equals("O") && C5.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && A5.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && A4.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && B5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && C4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && B6.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (A6.getText().equals("O") && C6.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && B2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && B3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && A1.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && C1.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && D1.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && C1.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && C2.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (B1.getText().equals("O") && D3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C2.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && D2.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && A2.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C2.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && B1.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && B3.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && B4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && B3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && A1.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C3.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C1.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && A3.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && D4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B2.getText().equals("O") && C3.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C3.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && D3.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && A3.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C3.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B2.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B4.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B2.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B1.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && B5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && A2.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C4.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C2.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && A4.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C4.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && D5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && D1.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (B3.getText().equals("O") && C2.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C4.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && D4.getText().equals("X") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && A4.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C4.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B3.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B5.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B6.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && B5.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && A3.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C5.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C3.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && A5.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C5.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && D6.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && D2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (B4.getText().equals("O") && C3.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C5.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && D5.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && A5.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C5.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && B4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && B3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && B4.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && B6.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && A6.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C4.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C6.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && A4.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && D3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (B5.getText().equals("O") && C4.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && B5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && B4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && A6.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && C6.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && C5.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && D4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && D6.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (B6.getText().equals("O") && C6.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && C2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && C3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && D1.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && B1.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && A1.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && B1.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && B2.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C1.getText().equals("O") && A3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B2.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && D2.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && A2.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B2.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && C1.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && C3.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && C4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && C3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("X") && D1.getText().equals("X") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B3.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock ) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B1.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && D3.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock ) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && A4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C2.getText().equals("O") && B3.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B3.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && D3.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && A3.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B3.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C2.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C4.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C2.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock ) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C1.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && C5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && D2.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B4.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock ) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B2.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && D4.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B4.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && A5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && A1.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock ) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (C3.getText().equals("O") && B2.getText().equals("O") && A1.getText().equals("")
                && A1.getBackground().getRGB() != colorBlock ) {
            A1.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B4.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && A4.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && D4.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B4.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C3.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C5.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock ) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C6.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && C5.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && D3.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B5.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B3.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && D5.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B5.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && A6.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && A2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock ) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (C4.getText().equals("O") && B3.getText().equals("O") && A2.getText().equals("")
                && A2.getBackground().getRGB() != colorBlock ) {
            A2.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B5.getText().equals("O") && A5.getText().equals("")
                && A5.getBackground().getRGB() != colorBlock ) {
            A5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && A5.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && D5.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B5.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock ) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && C4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock ) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && C3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && C4.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock ) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && C6.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && D6.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B4.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B6.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock ) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && D4.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && A3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock ) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (C5.getText().equals("O") && B4.getText().equals("O") && A3.getText().equals("")
                && A3.getBackground().getRGB() != colorBlock ) {
            A3.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && C5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock ) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && C4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock ) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && D6.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && B6.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock ) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && B5.getText().equals("O") && A4.getText().equals("")
                && A4.getBackground().getRGB() != colorBlock ) {
            A4.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && A4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock ) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && A6.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock ) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (C6.getText().equals("O") && B6.getText().equals("O") && A6.getText().equals("")
                && A6.getBackground().getRGB() != colorBlock ) {
            A6.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && D2.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock ) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && D2.getText().equals("O") && D3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && B1.getText().equals("O") && C1.getText().equals("")
                && C1.getBackground().getRGB() != colorBlock) {
            C1.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && C1.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && C2.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (D1.getText().equals("O") && B3.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && D1.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && D3.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && D3.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && D4.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && C3.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && B4.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && B2.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (D2.getText().equals("O") && C2.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && D2.getText().equals("O") && D1.getText().equals("")
                && D1.getBackground().getRGB() != colorBlock) {
            D1.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && D1.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && D4.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && D5.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && C4.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("X") && B5.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && C2.getText().equals("O") && B1.getText().equals("")
                && B1.getBackground().getRGB() != colorBlock) {
            B1.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && B1.getText().equals("O") && C2.getText().equals("")
                && C2.getBackground().getRGB() != colorBlock) {
            C2.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && B3.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D3.getText().equals("O") && C3.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && D3.getText().equals("O") && D2.getText().equals("")
                && D2.getBackground().getRGB() != colorBlock) {
            D2.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && D2.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && C3.getText().equals("O") && B2.getText().equals("")
                && B2.getBackground().getRGB() != colorBlock) {
            B2.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && B2.getText().equals("O") && C3.getText().equals("")
                && C3.getBackground().getRGB() != colorBlock) {
            C3.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && B4.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (A4.getText().equals("O") && C4.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && C5.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && B6.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && D5.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (D4.getText().equals("O") && D6.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && D4.getText().equals("O") && D6.getText().equals("")
                && D6.getBackground().getRGB() != colorBlock) {
            D6.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && D6.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && D4.getText().equals("O") && D3.getText().equals("")
                && D3.getBackground().getRGB() != colorBlock) {
            D3.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && D3.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && C4.getText().equals("O") && B3.getText().equals("")
                && B3.getBackground().getRGB() != colorBlock) {
            B3.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && B3.getText().equals("O") && C4.getText().equals("")
                && C4.getBackground().getRGB() != colorBlock) {
            C4.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && B5.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (D5.getText().equals("O") && C5.getText().equals("O") && B5.getText().equals("")
                && B5.getBackground().getRGB() != colorBlock) {
            B5.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && D5.getText().equals("O") && D4.getText().equals("")
                && D4.getBackground().getRGB() != colorBlock) {
            D4.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && D4.getText().equals("O") && D5.getText().equals("")
                && D5.getBackground().getRGB() != colorBlock) {
            D5.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && C5.getText().equals("O") && B4.getText().equals("")
                && B4.getBackground().getRGB() != colorBlock) {
            B4.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && B4.getText().equals("O") && C5.getText().equals("")
                && C5.getBackground().getRGB() != colorBlock) {
            C5.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && B6.getText().equals("O") && C6.getText().equals("")
                && C6.getBackground().getRGB() != colorBlock) {
            C6.setText("X");
            JogadorAtivo();
            return;
        }else if (D6.getText().equals("O") && C6.getText().equals("O") && B6.getText().equals("")
                && B6.getBackground().getRGB() != colorBlock) {
            B6.setText("X");
            JogadorAtivo();
            return;
        }else ataque();
    }*/
               
    
    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        if(A1.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(A1.getText().equals("")){
            A1.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if(B1.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(B1.getText().equals("")){
              B1.setText("O");
              JogadorAtivo();
              setPlayer();
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
       if(C1.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(C1.getText().equals("")){
            C1.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        if(D1.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(D1.getText().equals("")){
            D1.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_D1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        if(A2.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(A2.getText().equals("")){
            A2.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_A2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if(B2.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(B2.getText().equals("")){
            B2.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        if(C2.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(C2.getText().equals("")){
            C2.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        if(D2.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(D2.getText().equals("")){
            D2.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_D2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        if(A3.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(A3.getText().equals("")){
            A3.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_A3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if(B3.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(B3.getText().equals("")){
            B3.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        if(C3.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(C3.getText().equals("")){
            C3.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        if(D3.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(D3.getText().equals("")){
            D3.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_D3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
       if(A4.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(A4.getText().equals("")){
            A4.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_A4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
       if(B4.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(B4.getText().equals("")){
            B4.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        if(C4.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(C4.getText().equals("")){
            C4.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_C4ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        if(D4.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(D4.getText().equals("")){
            D4.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_D4ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        if(A6.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(A6.getText().equals("")){
            A6.setText("O");
            JogadorAtivo();
            setPlayer();;
        }
    }//GEN-LAST:event_A6ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if(B6.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(B6.getText().equals("")){
          B6.setText("O");
          JogadorAtivo();
          setPlayer();
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        if(C6.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(C6.getText().equals("")){
            C6.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_C6ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
       if(D6.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(D6.getText().equals("")){
            D6.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_D6ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        if(A5.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(A5.getText().equals("")){
            A5.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_A5ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if(B5.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(B5.getText().equals("")){
            B5.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        if(C5.getBackground().getRGB() == colorBlock) {
            JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
            return;
        }
        if(C5.getText().equals("")){
            C5.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_C5ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        if(D5.getBackground().getRGB() == colorBlock) {
             JOptionPane.showMessageDialog(rootPane, "Posição Bloqueada");
             return;
        }
        if(D5.getText().equals("")){
            D5.setText("O");
            JogadorAtivo();
            setPlayer();
        }
    }//GEN-LAST:event_D5ActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha6x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha6x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha6x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha6x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha6x4().setVisible(true);
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
    private javax.swing.JButton A6;
    private javax.swing.JLabel B;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JLabel C;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JLabel D;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JLabel N1;
    private javax.swing.JLabel N2;
    private javax.swing.JLabel N3;
    private javax.swing.JLabel N4;
    private javax.swing.JLabel N5;
    private javax.swing.JLabel N6;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
