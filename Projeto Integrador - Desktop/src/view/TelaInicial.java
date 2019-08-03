package com.java.prototipo.view;

public class TelaInicial extends javax.swing.JFrame {
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaDeFundo = new javax.swing.JPanel();
        jButtonConfirmarConsulta = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jButtonListaDeEventos = new javax.swing.JButton();
        jButtonBuscarUsuario = new javax.swing.JButton();
        jButtonFazerLogout = new javax.swing.JButton();
        jButtonConfirmarConsulta2 = new javax.swing.JButton();
        jButtonEditarProntuario = new javax.swing.JButton();
        jButtonAgendarConsulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonEditarFarmacia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTelaDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTelaDeFundo.setPreferredSize(new java.awt.Dimension(550, 450));

        jButtonConfirmarConsulta.setBackground(new java.awt.Color(0, 102, 102));
        jButtonConfirmarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmarConsulta.setText("Consultas Agendadas");
        jButtonConfirmarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarConsultaActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N
        jLabelLogo.setText("jLabel3");

        jButtonListaDeEventos.setBackground(new java.awt.Color(0, 102, 102));
        jButtonListaDeEventos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListaDeEventos.setText("Eventos");
        jButtonListaDeEventos.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonListaDeEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaDeEventosActionPerformed(evt);
            }
        });

        jButtonBuscarUsuario.setBackground(new java.awt.Color(0, 102, 102));
        jButtonBuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarUsuario.setText("Buscar Usuário");
        jButtonBuscarUsuario.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUsuarioActionPerformed(evt);
            }
        });

        jButtonFazerLogout.setBackground(new java.awt.Color(153, 0, 51));
        jButtonFazerLogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFazerLogout.setText("Sair");
        jButtonFazerLogout.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonFazerLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFazerLogoutActionPerformed(evt);
            }
        });

        jButtonConfirmarConsulta2.setBackground(new java.awt.Color(0, 102, 102));
        jButtonConfirmarConsulta2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConfirmarConsulta2.setText("Cadastrar Paciente");
        jButtonConfirmarConsulta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarConsulta2ActionPerformed(evt);
            }
        });

        jButtonEditarProntuario.setBackground(new java.awt.Color(0, 102, 102));
        jButtonEditarProntuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarProntuario.setText("Editar Prontuário");
        jButtonEditarProntuario.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonEditarProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarProntuarioActionPerformed(evt);
            }
        });

        jButtonAgendarConsulta.setBackground(new java.awt.Color(0, 102, 102));
        jButtonAgendarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgendarConsulta.setText("Agendar Consulta");
        jButtonAgendarConsulta.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonAgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarConsultaActionPerformed(evt);
            }
        });

        jLabel1.setText("Tec. Enfermagem");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Caio César Penha Dantas");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N

        jButtonEditarFarmacia.setBackground(new java.awt.Color(0, 102, 102));
        jButtonEditarFarmacia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditarFarmacia.setText("Farmácia");
        jButtonEditarFarmacia.setPreferredSize(new java.awt.Dimension(137, 23));
        jButtonEditarFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFarmaciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTelaDeFundoLayout = new javax.swing.GroupLayout(jPanelTelaDeFundo);
        jPanelTelaDeFundo.setLayout(jPanelTelaDeFundoLayout);
        jPanelTelaDeFundoLayout.setHorizontalGroup(
            jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonConfirmarConsulta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonConfirmarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jButtonEditarProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAgendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                        .addComponent(jButtonListaDeEventos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                                        .addComponent(jButtonEditarFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonFazerLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        jPanelTelaDeFundoLayout.setVerticalGroup(
            jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListaDeEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmarConsulta2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFazerLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTelaDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // vamos fazer com que o funcionário tenha acesso as consultas
    // em que todos os usuários fizeram
    private void jButtonConfirmarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarConsultaActionPerformed
        this.setVisible(false);
        new TelaListaDeConsultas().setVisible(true);
    }//GEN-LAST:event_jButtonConfirmarConsultaActionPerformed


    // método para fazer o usuário tenham acesso a todos os eventos 
    // além de poder adicionar novos 
    private void jButtonListaDeEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaDeEventosActionPerformed
        this.setVisible(false);
        new TelaEventos().setVisible(true);
    }//GEN-LAST:event_jButtonListaDeEventosActionPerformed

    
    
    // método para fazer o funcionario ter acesso a um paciente no banco
    private void jButtonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarUsuarioActionPerformed
        this.setVisible(false);
        new TelaBuscaUsuario().setVisible(true);
    }//GEN-LAST:event_jButtonBuscarUsuarioActionPerformed





    private void jButtonFazerLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFazerLogoutActionPerformed
        this.setVisible(false);
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_jButtonFazerLogoutActionPerformed
    private void jButtonConfirmarConsulta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarConsulta2ActionPerformed
    }//GEN-LAST:event_jButtonConfirmarConsulta2ActionPerformed
    private void jButtonEditarProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarProntuarioActionPerformed
    }//GEN-LAST:event_jButtonEditarProntuarioActionPerformed


 
    // atraves desse método vamos poder agendar uma consulta para um paciente 
    private void jButtonAgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarConsultaActionPerformed
        this.setVisible(false);
        new TelaBuscaUsuario().setVisible(true);
    }//GEN-LAST:event_jButtonAgendarConsultaActionPerformed




    private void jButtonEditarFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFarmaciaActionPerformed
    }//GEN-LAST:event_jButtonEditarFarmaciaActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendarConsulta;
    private javax.swing.JButton jButtonBuscarUsuario;
    private javax.swing.JButton jButtonConfirmarConsulta;
    private javax.swing.JButton jButtonConfirmarConsulta2;
    private javax.swing.JButton jButtonEditarFarmacia;
    private javax.swing.JButton jButtonEditarProntuario;
    private javax.swing.JButton jButtonFazerLogout;
    private javax.swing.JButton jButtonListaDeEventos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanelTelaDeFundo;
    // End of variables declaration//GEN-END:variables
}
