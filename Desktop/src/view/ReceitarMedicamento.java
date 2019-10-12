package view;

import controller.Funcionario;
import controller.Medicamento;
import model.Conexao;

public class ReceitarMedicamento extends javax.swing.JFrame {

    public ReceitarMedicamento() {
        initComponents();
        this.setLocationRelativeTo(this); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        actionFactory1 = new org.jdesktop.swingx.action.ActionFactory();
        planoFundo = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinnerQuantidade = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        dataInicio = new org.jdesktop.swingx.JXDatePicker();
        jLabel8 = new javax.swing.JLabel();
        dataFim = new org.jdesktop.swingx.JXDatePicker();
        btnVoltar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        campoTextoNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoTextoCpf = new javax.swing.JTextField();
        lblNomePaciente = new javax.swing.JLabel();
        btnBuscarPaciente = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        planoFundo.setBackground(new java.awt.Color(255, 255, 255));

        lblNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome.setText("Receitar Medicamento");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel5.setText("Intevalor (Horas) ");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel6.setText("Inicio");

        dataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInicioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel8.setText("Final");

        btnVoltar.setBackground(new java.awt.Color(40, 166, 166));
        btnVoltar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Cancelar");
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(40, 166, 166));
        btnAdicionar.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Preescrever");
        btnAdicionar.setBorder(null);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel7.setText("Nome");

        campoTextoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoCpfActionPerformed(evt);
            }
        });

        lblNomePaciente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        lblNomePaciente.setText("CPf Paciente");

        btnBuscarPaciente.setBackground(new java.awt.Color(40, 166, 166));
        btnBuscarPaciente.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnBuscarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPaciente.setText("Buscar");
        btnBuscarPaciente.setBorder(null);
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout planoFundoLayout = new javax.swing.GroupLayout(planoFundo);
        planoFundo.setLayout(planoFundoLayout);
        planoFundoLayout.setHorizontalGroup(
            planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoFundoLayout.createSequentialGroup()
                .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planoFundoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dataFim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(planoFundoLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(9, 9, 9)
                                    .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(dataInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(planoFundoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNomePaciente)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, planoFundoLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39))
                                .addComponent(campoTextoCpf))))
                    .addGroup(planoFundoLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblNome))
                    .addGroup(planoFundoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(planoFundoLayout.createSequentialGroup()
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, planoFundoLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        planoFundoLayout.setVerticalGroup(
            planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoFundoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblNome)
                .addGap(35, 35, 35)
                .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planoFundoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(7, 7, 7)
                        .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(4, 4, 4)
                        .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(planoFundoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblNomePaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTextoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        //vamos verificar se o cpf existe
        String nomePaciente = Conexao.descobriNomePaciente(campoTextoCpf.getText());
        String matriculaProfissional = Funcionario.funcionario.getMatricula();
        
        String fimTratamento = view.AdicionarEvento.pegarMinhaData(dataFim.getDate().toString());
        String inicialTratamento = view.AdicionarEvento.pegarMinhaData(dataInicio.getDate().toString());
        
        int intervaloHoras = (int) spinnerQuantidade.getValue();
        String nomeMedicamento = campoTextoNome.getText();
        String idMedicamento = Conexao.novoIdMedicamento();
        
        
        if (nomePaciente == null){
            javax.swing.JOptionPane.showMessageDialog(null, "Paciente não encontrado");
        }
        else if (nomeMedicamento.length() < 5){
            javax.swing.JOptionPane.showMessageDialog(null, "Nome medicamento muito curto");
        }
        else if (campoTextoCpf.getText().length() != 11){
            javax.swing.JOptionPane.showMessageDialog(null, "CPF inválido");
        }
        else{
            Medicamento medicamento = new Medicamento(nomeMedicamento, inicialTratamento, fimTratamento, intervaloHoras, 
                    idMedicamento, campoTextoCpf.getText(), matriculaProfissional);
            Conexao.preescreverMedicamento(medicamento);
            javax.swing.JOptionPane.showMessageDialog(null, "Medicação solicitada!");
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        String nomePaciente = Conexao.descobriNomePaciente(campoTextoCpf.getText());
        if (nomePaciente == null){
            javax.swing.JOptionPane.showMessageDialog(null, "Paciente não encontrado");
        }
        else {
            lblNomePaciente.setText("Paciente: " + nomePaciente);
        }
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    
    
    private void campoTextoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoCpfActionPerformed
    }//GEN-LAST:event_campoTextoCpfActionPerformed

    private void dataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInicioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceitarMedicamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.action.ActionFactory actionFactory1;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoTextoCpf;
    private javax.swing.JTextField campoTextoNome;
    private org.jdesktop.swingx.JXDatePicker dataFim;
    private org.jdesktop.swingx.JXDatePicker dataInicio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomePaciente;
    private javax.swing.JPanel planoFundo;
    private javax.swing.JSpinner spinnerQuantidade;
    // End of variables declaration//GEN-END:variables
}
