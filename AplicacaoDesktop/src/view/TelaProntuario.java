package view;

import controller.Paciente;

public class TelaProntuario extends javax.swing.JFrame {

    public TelaProntuario() {
        initComponents();
        
        Paciente paciente = TelaBuscarPaciente.paciente;
        
        lblNotificação.setText("Prontuário do paciente " + paciente.getNome());
        lblNome.setText("Cpf: " + paciente.getCpf());
        lblSus.setText("Sus: " + paciente.getSus());
        lblNome.setText("Nome: " + paciente.getNome());
        lblEtnia.setText("Uf: " + paciente.getUf());
        lblSexo.setText("Sexo: " + paciente.getSexo());
        lblDataRg.setText("Rg: " + paciente.getRg());
        lblOrgaoEmissor.setText("Orgão Emissor (RG): " + paciente.getOrgaoEmissor());
        lblDataRg.setText("Data Rg: " + paciente.getDataEmissao());
        lblUf.setText("UF: " + paciente.getUf());
        lblEtnia.setText("Etnia: " + paciente.getEtnia());
        lblNomePai.setText("Nome Pai: " + paciente.getNomePai());
        lblEstadoCivil.setText("Estado Civil: " + paciente.getEstadoCivil());
        lblNascimento.setText("Nascimento: " + paciente.getDataNasciento());
        
        // de onde o paciente é
        lblCidade.setText("Cidade: " + paciente.getNaturalidade());
        lblPaís.setText("País: " + paciente.getNacionalidade());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaDeFundo2 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        lblNotificação = new javax.swing.JLabel();
        btnConfirmar2 = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblSus = new javax.swing.JLabel();
        lblCpf2 = new javax.swing.JLabel();
        lblOrgaoEmissor = new javax.swing.JLabel();
        lblDataRg = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblNomePai = new javax.swing.JLabel();
        lblRg3 = new javax.swing.JLabel();
        lblEtnia = new javax.swing.JLabel();
        lblNomeMae1 = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblPaís = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTelaDeFundo2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTelaDeFundo2.setPreferredSize(new java.awt.Dimension(550, 450));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabelLogo.setText("jLabel3");

        lblNotificação.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNotificação.setForeground(new java.awt.Color(255, 0, 51));
        lblNotificação.setText("Prontuário de Clemerson");

        btnConfirmar2.setBackground(new java.awt.Color(0, 102, 102));
        btnConfirmar2.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar2.setText("Voltar");
        btnConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar2ActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNome.setText("Nome: Clemerson Lucas");
        lblNome.setFocusCycleRoot(true);

        lblSus.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSus.setText("SUS: 000000000000000");
        lblSus.setFocusCycleRoot(true);

        lblCpf2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCpf2.setText("Cpf: 50670962460");
        lblCpf2.setFocusCycleRoot(true);

        lblOrgaoEmissor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblOrgaoEmissor.setText("Orgão Emissor: ITEP");
        lblOrgaoEmissor.setFocusCycleRoot(true);

        lblDataRg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDataRg.setText("Data RG: 10/05/2010");
        lblDataRg.setFocusCycleRoot(true);

        lblSexo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSexo.setText("Sexo: Masculino");
        lblSexo.setFocusCycleRoot(true);

        lblNomePai.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNomePai.setText("Pai: Marcelo Santos");
        lblNomePai.setFocusCycleRoot(true);

        lblRg3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRg3.setText("RG: 12345678910112");
        lblRg3.setFocusCycleRoot(true);

        lblEtnia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEtnia.setText("Etnia: Pardo");
        lblEtnia.setFocusCycleRoot(true);

        lblNomeMae1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNomeMae1.setText("Mãe: Andreza Gomes");
        lblNomeMae1.setFocusCycleRoot(true);

        lblUf.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUf.setText("UF: RN");
        lblUf.setFocusCycleRoot(true);

        lblNascimento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblNascimento.setText("Nascimento: 09/02/2001");
        lblNascimento.setFocusCycleRoot(true);

        lblEstadoCivil.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEstadoCivil.setText("Estado Civil: Casado");
        lblEstadoCivil.setFocusCycleRoot(true);

        lblCidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCidade.setText("Cidade: Campo Redondo");
        lblCidade.setFocusCycleRoot(true);

        lblPaís.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPaís.setText("País: Brasil");
        lblPaís.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanelTelaDeFundo2Layout = new javax.swing.GroupLayout(jPanelTelaDeFundo2);
        jPanelTelaDeFundo2.setLayout(jPanelTelaDeFundo2Layout);
        jPanelTelaDeFundo2Layout.setHorizontalGroup(
            jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundo2Layout.createSequentialGroup()
                .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTelaDeFundo2Layout.createSequentialGroup()
                                        .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                                                .addComponent(lblRg3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblOrgaoEmissor))
                                            .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                                                .addComponent(lblNomeMae1)
                                                .addGap(35, 35, 35)
                                                .addComponent(lblNomePai)
                                                .addGap(19, 19, 19)))
                                        .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(lblUf)
                                                .addGap(60, 60, 60)
                                                .addComponent(lblCidade))
                                            .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(lblDataRg)
                                                .addGap(54, 54, 54)
                                                .addComponent(lblSexo))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTelaDeFundo2Layout.createSequentialGroup()
                                        .addComponent(lblEstadoCivil)
                                        .addGap(47, 47, 47)
                                        .addComponent(lblNascimento))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundo2Layout.createSequentialGroup()
                                .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblEtnia)
                                        .addGap(48, 48, 48)
                                        .addComponent(lblPaís))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTelaDeFundo2Layout.createSequentialGroup()
                                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTelaDeFundo2Layout.createSequentialGroup()
                                        .addComponent(lblNotificação, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(126, 126, 126))))
                    .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCpf2)
                        .addGap(65, 65, 65)
                        .addComponent(lblNome)
                        .addGap(94, 94, 94)
                        .addComponent(lblSus)
                        .addGap(20, 20, 20)))
                .addGap(139, 139, 139))
        );
        jPanelTelaDeFundo2Layout.setVerticalGroup(
            jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundo2Layout.createSequentialGroup()
                .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaDeFundo2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(lblSus)
                            .addComponent(lblCpf2))))
                .addGap(26, 26, 26)
                .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRg3)
                    .addComponent(lblOrgaoEmissor)
                    .addComponent(lblDataRg)
                    .addComponent(lblSexo))
                .addGap(33, 33, 33)
                .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeMae1)
                    .addComponent(lblNomePai)
                    .addComponent(lblUf)
                    .addComponent(lblCidade))
                .addGap(40, 40, 40)
                .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(lblNascimento)
                    .addComponent(lblEtnia)
                    .addComponent(lblPaís))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addGroup(jPanelTelaDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNotificação, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaDeFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTelaDeFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnConfirmar2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProntuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConfirmar1;
    private javax.swing.JButton btnConfirmar2;
    javax.swing.JTextField campoTextoBuscaCpf;
    javax.swing.JTextField campoTextoBuscaCpf1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLogo1;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JPanel jPanelTelaDeFundo;
    private javax.swing.JPanel jPanelTelaDeFundo1;
    private javax.swing.JPanel jPanelTelaDeFundo2;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf2;
    private javax.swing.JLabel lblDataRg;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblEtnia;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeMae1;
    private javax.swing.JLabel lblNomePai;
    private javax.swing.JLabel lblNotificação;
    private javax.swing.JLabel lblNotificação1;
    private javax.swing.JLabel lblNotificação2;
    private javax.swing.JLabel lblOrgaoEmissor;
    private javax.swing.JLabel lblPaís;
    private javax.swing.JLabel lblRg3;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSus;
    private javax.swing.JLabel lblUf;
    // End of variables declaration//GEN-END:variables
}
