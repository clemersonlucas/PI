package view;

import controller.Funcionario;
import model.AcessoBanco;

public class TelaCadastro extends javax.swing.JFrame {
    
    private String matricula = "";
    
    public TelaCadastro() {
        initComponents();
      
        listaEspecializacoes.removeAll();
        listaEspecializacoes.addItem("Pediatra");
        listaEspecializacoes.addItem("Ginicologista");
        listaEspecializacoes.addItem("Fisioterapelta");
        listaEspecializacoes.addItem("Clinico Geral");
        listaEspecializacoes.addItem("Médico Geral");
        listaEspecializacoes.addItem("Dentista");
        
        listaTipoAcesso.removeAll();
        listaTipoAcesso.addItem("Acesso Médico");
        listaTipoAcesso.addItem("Acesso Simples");
        
        matricula = AcessoBanco.novaMatricula();        
        lblMatricula.setText("Matricula: " + matricula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanelTelaDeFundo = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoTextoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoTextoSenha = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabelLogo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        listaTipoAcesso = new javax.swing.JComboBox<>();
        listaEspecializacoes = new javax.swing.JComboBox<>();
        lblMatricula = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTelaDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTelaDeFundo.setPreferredSize(new java.awt.Dimension(550, 450));

        btnCancelar.setBackground(new java.awt.Color(0, 102, 102));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Especialização:");

        campoTextoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Senha:");

        btnConfirmar.setBackground(new java.awt.Color(0, 102, 102));
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabelLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabelLogo1.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Tela de Cadastro");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Acesso:");

        listaTipoAcesso.setBackground(java.awt.Color.white);

        listaEspecializacoes.setBackground(java.awt.Color.white);

        lblMatricula.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        lblMatricula.setText("matricula");

        javax.swing.GroupLayout jPanelTelaDeFundoLayout = new javax.swing.GroupLayout(jPanelTelaDeFundo);
        jPanelTelaDeFundo.setLayout(jPanelTelaDeFundoLayout);
        jPanelTelaDeFundoLayout.setHorizontalGroup(
            jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(303, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(campoTextoSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(listaTipoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(listaEspecializacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(144, 144, 144)
                                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMatricula)
                                    .addComponent(jLabel2))))
                        .addGap(74, 74, 74))))
        );
        jPanelTelaDeFundoLayout.setVerticalGroup(
            jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatricula))
                .addGap(33, 33, 33)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaEspecializacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaTipoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelTelaDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTelaDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void campoTextoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNomeActionPerformed
    }//GEN-LAST:event_campoTextoNomeActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        //VAMOS CRIAR UM PACIENTE PARA O BANCO DE DADOS
        Funcionario funcionario = new Funcionario (matricula, campoTextoNome.getText(), 
                campoTextoSenha.getText(), 
                listaEspecializacoes.getItemAt(listaEspecializacoes.getSelectedIndex()),
                listaTipoAcesso.getItemAt(listaTipoAcesso.getSelectedIndex()));

        if (funcionario.getNome().length() > 5){
            if (funcionario.getSenha().length() < 5){
                jLabel3.setText("Senha muito curta");
            }
            // tudo deu certo
            else {
                jLabel3.setText("Cadastro com sucesso");
                AcessoBanco.writeDatabaseFuncionario(funcionario);
                this.setVisible(false);
                new TelaLogin().setVisible(true);
            }
        } 
        else {
            jLabel3.setText("Nome muito curto");
        }   
    }//GEN-LAST:event_btnConfirmarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    javax.swing.JTextField campoTextoNome;
    private javax.swing.JTextField campoTextoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLogo1;
    private javax.swing.JPanel jPanelTelaDeFundo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JComboBox<String> listaEspecializacoes;
    private javax.swing.JComboBox<String> listaTipoAcesso;
    // End of variables declaration//GEN-END:variables
}
