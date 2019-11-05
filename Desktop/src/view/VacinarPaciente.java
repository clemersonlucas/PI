package view;

import controller.Estoque;
import controller.Funcionario;
import controller.Vacina;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import model.AcessoBanco;

public class VacinarPaciente extends javax.swing.JFrame {

    public Estoque estoque;    
    
    public VacinarPaciente() {
        initComponents();
        this.setTitle("Tela de vacinação");
        this.setLocationRelativeTo(this); 
        
        listaVacinas.removeAllItems();
        ArrayList<Estoque> listaEstoque = AcessoBanco.pegarMedicamentoEstoque();
        for (Estoque estoque : listaEstoque) {
            listaVacinas.addItem(estoque.getNome());
        }
        
        estoque = listaEstoque.get(0);
        campoTextoDescricao.setText(estoque.getDescricao());
        campoTextoValidade.setText(estoque.getValidade());        
        
        listaVacinas.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int index = listaVacinas.getSelectedIndex();
                estoque = listaEstoque.get(index);
                
                campoTextoDescricao.setText(estoque.getDescricao());
                campoTextoValidade.setText(estoque.getValidade());
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PlanoDeFundo = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnConfimar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        listaVacinas = new javax.swing.JComboBox<>();
        lblNome1 = new javax.swing.JLabel();
        campoTextoValidade = new javax.swing.JTextField();
        lblNome2 = new javax.swing.JLabel();
        campoTextoDescricao = new javax.swing.JTextField();
        lblNome3 = new javax.swing.JLabel();
        campoTextoCpfPaciente = new javax.swing.JTextField();
        btnConfimar1 = new javax.swing.JButton();
        campoTextoNomePaciente = new javax.swing.JTextField();
        lblNome4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlanoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundo.setPreferredSize(new java.awt.Dimension(600, 600));

        btnVoltar.setBackground(new java.awt.Color(40, 166, 166));
        btnVoltar.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(254, 254, 254));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConfimar.setBackground(new java.awt.Color(40, 166, 166));
        btnConfimar.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnConfimar.setForeground(new java.awt.Color(254, 254, 254));
        btnConfimar.setText("Confimar");
        btnConfimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfimarActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome.setText("Validade");

        listaVacinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNome1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome1.setText("Vacina");

        lblNome2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome2.setText("Descrição");

        campoTextoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoDescricaoActionPerformed(evt);
            }
        });

        lblNome3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome3.setText("CPF paciente");

        btnConfimar1.setBackground(new java.awt.Color(40, 166, 166));
        btnConfimar1.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnConfimar1.setForeground(new java.awt.Color(254, 254, 254));
        btnConfimar1.setText("Buscar");
        btnConfimar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfimar1ActionPerformed(evt);
            }
        });

        lblNome4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome4.setText("Nome Paciente");

        javax.swing.GroupLayout PlanoDeFundoLayout = new javax.swing.GroupLayout(PlanoDeFundo);
        PlanoDeFundo.setLayout(PlanoDeFundoLayout);
        PlanoDeFundoLayout.setHorizontalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnConfimar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoTextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNome2)
                        .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                            .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(listaVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNome1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNome)
                                .addComponent(campoTextoValidade)))
                        .addComponent(lblNome4)
                        .addComponent(campoTextoNomePaciente)
                        .addComponent(lblNome3)
                        .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                            .addComponent(campoTextoCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnConfimar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        PlanoDeFundoLayout.setVerticalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNome3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTextoCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfimar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfimar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        new InicialMedico().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public void resetarDadosComponentes (){
        campoTextoCpfPaciente.setText("");
        campoTextoDescricao.setText("");
        campoTextoValidade.setText("");
        campoTextoNomePaciente.setText("");
    }
    
    private void btnConfimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfimarActionPerformed
        // vamos atualizar os dados do estoque
        int quantidade = estoque.getQuantidade() - 1 ;              // pegamos a quantidade atual e tiramos 1            
        int idEstoque = estoque.getId();                                   // pegamos o id do estoque usuario deseja
        AcessoBanco.updateQuantidadeMedicamento(idEstoque, quantidade);    // atualizamos os dados do estoque no banco

       
        // vamos adicionar uma nova vacina
        org.jdesktop.swingx.JXDatePicker objeto = new org.jdesktop.swingx.JXDatePicker();
        String dataAtual = AdicionarEvento.pegarMinhaData(objeto.getDate().toString());
        String cpfPaciente = campoTextoCpfPaciente.getText();
        String matriculaProfissional = Funcionario.funcionario.getMatricula();
        String id = AcessoBanco.novoIdVacinacao();
        Vacina vacina = new Vacina(dataAtual, id, cpfPaciente, matriculaProfissional, idEstoque);
        
        
        // vamos salvar a vacina no banco de dados
        AcessoBanco.adicionaVacina(vacina);
        
        // atualizar os dados
        resetarDadosComponentes ();
    }//GEN-LAST:event_btnConfimarActionPerformed

    private void btnConfimar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfimar1ActionPerformed
        String cpfPaciente = campoTextoCpfPaciente.getText();
        if (!(AcessoBanco.cpfJaExiste(cpfPaciente))){
            javax.swing.JOptionPane.showMessageDialog(null, "Paciente não encontrado!");
        }else {
            String nomeCompleto = AcessoBanco.nomeCompletoPaciente(cpfPaciente);
            campoTextoNomePaciente.setText(nomeCompleto);
        }
    }//GEN-LAST:event_btnConfimar1ActionPerformed

    private void campoTextoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoDescricaoActionPerformed
    }//GEN-LAST:event_campoTextoDescricaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacinarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlanoDeFundo;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton btnAdicionar2;
    private javax.swing.JButton btnAdicionar3;
    private javax.swing.JButton btnAdicionar4;
    private javax.swing.JButton btnAdicionar5;
    private javax.swing.JButton btnConfimar;
    private javax.swing.JButton btnConfimar1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoTextoCpfPaciente;
    private javax.swing.JTextField campoTextoDescricao;
    private javax.swing.JTextField campoTextoNomePaciente;
    private javax.swing.JTextField campoTextoValidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JComboBox<String> listaVacinas;
    // End of variables declaration//GEN-END:variables
}
