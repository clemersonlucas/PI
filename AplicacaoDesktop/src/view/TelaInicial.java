package view;

import model.AcessoBanco;

public class TelaInicial extends javax.swing.JFrame {

    public static int irPraUmaTela = 0;
    
    /*
        tela para consultar um determinado paciente : 1
        tela para agendar uma consulta 2
        tela para o prontuário do paciente 3
     */
    
    

    public TelaInicial() {
        initComponents();
        lblEspecialidada.setText(AcessoBanco.funcionario.getFuncao());
        lblNomeMedico.setText(AcessoBanco.funcionario.getNome());
        
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaDeFundo = new javax.swing.JPanel();
        jButtonConfirmarConsulta = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jButtonConsultar = new javax.swing.JButton();
        jButtonBuscarUsuario = new javax.swing.JButton();
        jButtonFazerLogout = new javax.swing.JButton();
        jButtonCadastrarUsuario = new javax.swing.JButton();
        jButtonEditarProntuario = new javax.swing.JButton();
        lblEspecialidada = new javax.swing.JLabel();
        lblNomeMedico = new javax.swing.JLabel();
        jButtonEditarFarmacia = new javax.swing.JButton();
        lblNotificação = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTelaDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTelaDeFundo.setPreferredSize(new java.awt.Dimension(550, 450));

        jButtonConfirmarConsulta.setBackground(new java.awt.Color(0, 102, 102));
        jButtonConfirmarConsulta.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButtonConfirmarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmarConsulta.setText("Consultas");
        jButtonConfirmarConsulta.setPreferredSize(new java.awt.Dimension(127, 23));
        jButtonConfirmarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarConsultaActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabelLogo.setText("jLabel3");

        jButtonConsultar.setBackground(new java.awt.Color(0, 102, 102));
        jButtonConsultar.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonBuscarUsuario.setBackground(new java.awt.Color(0, 102, 102));
        jButtonBuscarUsuario.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButtonBuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarUsuario.setText("Diagnosticos");
        jButtonBuscarUsuario.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUsuarioActionPerformed(evt);
            }
        });

        jButtonFazerLogout.setBackground(new java.awt.Color(153, 0, 51));
        jButtonFazerLogout.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButtonFazerLogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFazerLogout.setText("Sair");
        jButtonFazerLogout.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonFazerLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFazerLogoutActionPerformed(evt);
            }
        });

        jButtonCadastrarUsuario.setBackground(new java.awt.Color(0, 102, 102));
        jButtonCadastrarUsuario.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButtonCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarUsuario.setText("Cadastrar");
        jButtonCadastrarUsuario.setPreferredSize(new java.awt.Dimension(127, 23));
        jButtonCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarUsuarioActionPerformed(evt);
            }
        });

        jButtonEditarProntuario.setBackground(new java.awt.Color(0, 102, 102));
        jButtonEditarProntuario.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButtonEditarProntuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarProntuario.setText("Prontuários");
        jButtonEditarProntuario.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonEditarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarProntuarioActionPerformed(evt);
            }
        });

        lblEspecialidada.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblEspecialidada.setText("Medico Geral");

        lblNomeMedico.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblNomeMedico.setText("Caio César");

        jButtonEditarFarmacia.setBackground(new java.awt.Color(0, 102, 102));
        jButtonEditarFarmacia.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButtonEditarFarmacia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarFarmacia.setText("Estoque");
        jButtonEditarFarmacia.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonEditarFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFarmaciaActionPerformed(evt);
            }
        });

        lblNotificação.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNotificação.setForeground(new java.awt.Color(255, 0, 51));
        lblNotificação.setText("Seja bem vindo!");

        javax.swing.GroupLayout jPanelTelaDeFundoLayout = new javax.swing.GroupLayout(jPanelTelaDeFundo);
        jPanelTelaDeFundo.setLayout(jPanelTelaDeFundoLayout);
        jPanelTelaDeFundoLayout.setHorizontalGroup(
            jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(lblNotificação, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConfirmarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEditarProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditarFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFazerLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(270, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEspecialidada)
                            .addComponent(lblNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(292, 292, 292))))
        );
        jPanelTelaDeFundoLayout.setVerticalGroup(
            jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblEspecialidada)
                        .addGap(18, 18, 18)
                        .addComponent(lblNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(lblNotificação, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConfirmarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditarProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditarFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jButtonFazerLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTelaDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // vamos fazer com que o funcionário tenha acesso as consultas
    // em que todos os usuários fizeram
    private void jButtonConfirmarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarConsultaActionPerformed
        irPraUmaTela = 2;
        new TelaListaConsultas().setVisible(true);
    }//GEN-LAST:event_jButtonConfirmarConsultaActionPerformed


    // método para fazer o usuário tenham acesso a todos os eventos 
    // além de poder adicionar novos 
    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        irPraUmaTela = 1;
        new TelaBuscarPaciente().setVisible(true);       
    }//GEN-LAST:event_jButtonConsultarActionPerformed
    
    
    // método para fazer o funcionario ter acesso a um paciente no banco
    private void jButtonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarUsuarioActionPerformed
    }//GEN-LAST:event_jButtonBuscarUsuarioActionPerformed

    private void jButtonFazerLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFazerLogoutActionPerformed
        this.setVisible(false);
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_jButtonFazerLogoutActionPerformed
    private void jButtonCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarUsuarioActionPerformed
        this.setVisible(false);
        new TelaCadatroUsuario().setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarUsuarioActionPerformed

    // vamos pegar o prontuário do Paciente aqui
    private void jButtonEditarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarProntuarioActionPerformed
        irPraUmaTela = 3;
        new TelaBuscarPaciente().setVisible(true);
    }//GEN-LAST:event_jButtonEditarProntuarioActionPerformed

    
    // vamos para a tela de estoque
    private void jButtonEditarFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFarmaciaActionPerformed
        new TelaEstoque().setVisible(true);
    }//GEN-LAST:event_jButtonEditarFarmaciaActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarUsuario;
    private javax.swing.JButton jButtonCadastrarUsuario;
    private javax.swing.JButton jButtonConfirmarConsulta;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditarFarmacia;
    private javax.swing.JButton jButtonEditarProntuario;
    private javax.swing.JButton jButtonFazerLogout;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanelTelaDeFundo;
    private javax.swing.JLabel lblEspecialidada;
    private javax.swing.JLabel lblNomeMedico;
    private javax.swing.JLabel lblNotificação;
    // End of variables declaration//GEN-END:variables
}
