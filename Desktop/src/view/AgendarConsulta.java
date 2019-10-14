package view;

import controller.Consulta;
import controller.Funcionario;
import model.AcessoBanco;

public class AgendarConsulta extends javax.swing.JFrame {

    public AgendarConsulta() {
        initComponents();
        this.setTitle("Agende uma consulta");
        this.setLocationRelativeTo(this); 

        ListaTipoFuncao.removeAll();
        ListaTipoFuncao.removeAllItems();
        ListaTipoFuncao.addItem("Pediatra");
        ListaTipoFuncao.addItem("Enfermeiro");
        ListaTipoFuncao.addItem("Ginicologista");
        ListaTipoFuncao.addItem("Médico Geral");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanoDeFundo2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cldData = new org.jdesktop.swingx.JXDatePicker();
        btnAdicionarEvento2 = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        campoTextoCpfPaciente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ListaTipoFuncao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        PlanoDeFundo2.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundo2.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Data");

        btnAdicionarEvento2.setBackground(new java.awt.Color(40, 166, 166));
        btnAdicionarEvento2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAdicionarEvento2.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarEvento2.setText("Adicionar");
        btnAdicionarEvento2.setBorder(null);
        btnAdicionarEvento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEvento2ActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(40, 166, 166));
        btnVoltar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setText("Especilização");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("Cpf Paciente");

        ListaTipoFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PlanoDeFundo2Layout = new javax.swing.GroupLayout(PlanoDeFundo2);
        PlanoDeFundo2.setLayout(PlanoDeFundo2Layout);
        PlanoDeFundo2Layout.setHorizontalGroup(
            PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundo2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundo2Layout.createSequentialGroup()
                        .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18))
                    .addGroup(PlanoDeFundo2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(84, 84, 84)))
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cldData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoTextoCpfPaciente)
                    .addComponent(ListaTipoFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        PlanoDeFundo2Layout.setVerticalGroup(
            PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundo2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cldData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PlanoDeFundo2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListaTipoFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarEvento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEvento2ActionPerformed
        String cpfPaciente = campoTextoCpfPaciente.getText();
        
        if (!(AcessoBanco.cpfJaExiste(cpfPaciente))){
            javax.swing.JOptionPane.showMessageDialog(null, "Usuário inexistente!");
        }
        else {
            String data = AdicionarEvento.pegarMinhaData(cldData.getDate().toString());
            String descricao = "";
            String diagnostico = "";
            String hora = "00:00:00";
            String status = "Aguardando avaliação";

            // data de DATETIME
            String incioConsulta = "00:00:00";
            String fimConsulta = "00:00:00";
            String entrada = "00:00:00";

            String especialidade = ListaTipoFuncao.getItemAt(ListaTipoFuncao.getSelectedIndex());
            int id = AcessoBanco.novoIdConsulta();
            String matriculaProfissional = Funcionario.funcionario.getMatricula();

            Consulta consulta = new Consulta(data, diagnostico, hora, descricao, status, 
                    incioConsulta, fimConsulta, entrada, especialidade, id, matriculaProfissional, cpfPaciente);

            // vamos adicionar a consulta no banco de dados
            AcessoBanco.adicionaConsulta(consulta);
            javax.swing.JOptionPane.showMessageDialog(null, "Consulta agendada com sucesso!");
            this.dispose();
            new InicialMedico().setVisible(true);
        }
    }//GEN-LAST:event_btnAdicionarEvento2ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        new InicialMedico().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaTipoFuncao;
    private javax.swing.JPanel PlanoDeFundo2;
    private javax.swing.JButton btnAdicionarEvento2;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoTextoCpfPaciente;
    private org.jdesktop.swingx.JXDatePicker cldData;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
