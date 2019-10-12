package view;

import controller.Funcionario;

public class InicialMedico extends javax.swing.JFrame {
    public InicialMedico() {
        initComponents();
        this.setTitle("Tela incial");
        this.setLocationRelativeTo(this); 
        lblNome.setText(Funcionario.funcionario.getFuncao() + ":   " + Funcionario.funcionario.getNome());    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanoDeFundo = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        btnEventos = new javax.swing.JButton();
        btnSairDaConta = new javax.swing.JButton();
        btnAdicionarPaciente = new javax.swing.JButton();
        btnListarConsultas = new javax.swing.JButton();
        btnAdicionarPaciente1 = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnMedicamento = new javax.swing.JButton();
        btnExame = new javax.swing.JButton();
        btnVacinar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlanoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundo.setPreferredSize(new java.awt.Dimension(600, 600));

        lblNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome.setText("Médico: Caio cesar");

        btnEventos.setBackground(new java.awt.Color(40, 166, 166));
        btnEventos.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnEventos.setForeground(new java.awt.Color(254, 254, 254));
        btnEventos.setText("Eventos");
        btnEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventosActionPerformed(evt);
            }
        });

        btnSairDaConta.setBackground(new java.awt.Color(183, 25, 9));
        btnSairDaConta.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnSairDaConta.setForeground(new java.awt.Color(254, 254, 254));
        btnSairDaConta.setText("Sair da conta");
        btnSairDaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairDaContaActionPerformed(evt);
            }
        });

        btnAdicionarPaciente.setBackground(new java.awt.Color(40, 166, 166));
        btnAdicionarPaciente.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnAdicionarPaciente.setForeground(new java.awt.Color(254, 254, 254));
        btnAdicionarPaciente.setText("Novo Paciente");
        btnAdicionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarPacienteActionPerformed(evt);
            }
        });

        btnListarConsultas.setBackground(new java.awt.Color(40, 166, 166));
        btnListarConsultas.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnListarConsultas.setForeground(new java.awt.Color(254, 254, 254));
        btnListarConsultas.setText("Consultas");
        btnListarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarConsultasActionPerformed(evt);
            }
        });

        btnAdicionarPaciente1.setBackground(new java.awt.Color(40, 166, 166));
        btnAdicionarPaciente1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnAdicionarPaciente1.setForeground(new java.awt.Color(254, 254, 254));
        btnAdicionarPaciente1.setText("Agendar Consulta");
        btnAdicionarPaciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarPaciente1ActionPerformed(evt);
            }
        });

        btnConsultar.setBackground(new java.awt.Color(40, 166, 166));
        btnConsultar.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(254, 254, 254));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnEstoque.setBackground(new java.awt.Color(40, 166, 166));
        btnEstoque.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnEstoque.setForeground(new java.awt.Color(254, 254, 254));
        btnEstoque.setText("Estoque");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnMedicamento.setBackground(new java.awt.Color(40, 166, 166));
        btnMedicamento.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnMedicamento.setForeground(new java.awt.Color(254, 254, 254));
        btnMedicamento.setText("Medicamento");
        btnMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentoActionPerformed(evt);
            }
        });

        btnExame.setBackground(new java.awt.Color(40, 112, 166));
        btnExame.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnExame.setForeground(new java.awt.Color(254, 254, 254));
        btnExame.setText("Exames");
        btnExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExameActionPerformed(evt);
            }
        });

        btnVacinar.setBackground(new java.awt.Color(40, 112, 166));
        btnVacinar.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnVacinar.setForeground(new java.awt.Color(254, 254, 254));
        btnVacinar.setText("Vacinação");
        btnVacinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacinarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlanoDeFundoLayout = new javax.swing.GroupLayout(PlanoDeFundo);
        PlanoDeFundo.setLayout(PlanoDeFundoLayout);
        PlanoDeFundoLayout.setHorizontalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(lblNome))
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnListarConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExame, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSairDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionarPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVacinar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        PlanoDeFundoLayout.setVerticalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblNome)
                .addGap(58, 58, 58)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEventos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVacinar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSairDaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventosActionPerformed
        this.dispose();
        new ListaEventos().setVisible(true);
    }//GEN-LAST:event_btnEventosActionPerformed

    private void btnSairDaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairDaContaActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnSairDaContaActionPerformed

    private void btnAdicionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarPacienteActionPerformed
        this.dispose();
        new TelaCadatroUsuario().setVisible(true);
    }//GEN-LAST:event_btnAdicionarPacienteActionPerformed

    private void btnAdicionarPaciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarPaciente1ActionPerformed
        this.dispose();
        new AgendarConsulta().setVisible(true);
    }//GEN-LAST:event_btnAdicionarPaciente1ActionPerformed

    private void btnListarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarConsultasActionPerformed
        this.dispose();
        new ListaConsultas().setVisible(true);
    }//GEN-LAST:event_btnListarConsultasActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        this.dispose();
        new Consultar().setVisible(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        this.dispose();
        new ControleEstoque().setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentoActionPerformed
        new ReceitarMedicamento().setVisible(true);
    }//GEN-LAST:event_btnMedicamentoActionPerformed

    private void btnExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExameActionPerformed
    }//GEN-LAST:event_btnExameActionPerformed

    private void btnVacinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacinarActionPerformed
        
    }//GEN-LAST:event_btnVacinarActionPerformed

        
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlanoDeFundo;
    private javax.swing.JButton btnAdicionarPaciente;
    private javax.swing.JButton btnAdicionarPaciente1;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnExame;
    private javax.swing.JButton btnListarConsultas;
    private javax.swing.JButton btnMedicamento;
    private javax.swing.JButton btnSairDaConta;
    private javax.swing.JButton btnVacinar;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
