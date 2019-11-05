package view;

import java.util.ArrayList;
import model.AcessoBanco;

public class ContatoPaciente extends javax.swing.JFrame {

    public ContatoPaciente() {
        initComponents();
        this.setTitle("Tela contato paciente");
        this.setLocationRelativeTo(this); 
        listaContatoPaciente.removeAllItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanoDeFundo = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnBuscarTelefone = new javax.swing.JButton();
        campoTextoCpfPaciente = new javax.swing.JTextField();
        campoTextoNomePaciente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listaContatoPaciente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

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

        btnBuscarTelefone.setBackground(new java.awt.Color(40, 166, 166));
        btnBuscarTelefone.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnBuscarTelefone.setForeground(new java.awt.Color(254, 254, 254));
        btnBuscarTelefone.setText("Buscar");
        btnBuscarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTelefoneActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Paciente");

        jLabel2.setText("Contato");

        listaContatoPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("CPF Paciente");

        javax.swing.GroupLayout PlanoDeFundoLayout = new javax.swing.GroupLayout(PlanoDeFundo);
        PlanoDeFundo.setLayout(PlanoDeFundoLayout);
        PlanoDeFundoLayout.setHorizontalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(campoTextoNomePaciente)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                                    .addComponent(campoTextoCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)
                                .addComponent(listaContatoPaciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(97, 97, 97))))
        );
        PlanoDeFundoLayout.setVerticalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnBuscarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTextoCpfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoTextoNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaContatoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        new InicialMedico().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTelefoneActionPerformed
        String cpfPaciente = campoTextoCpfPaciente.getText();
        if(!(AcessoBanco.cpfJaExiste(cpfPaciente))){
            javax.swing.JOptionPane.showMessageDialog(null, "Paciente não encontrado!");
        }else {
            campoTextoNomePaciente.setText(AcessoBanco.nomeCompletoPaciente(cpfPaciente));
            ArrayList<String> telefones = AcessoBanco.pegaContatoPaciente(cpfPaciente);
            
            listaContatoPaciente.removeAllItems();
            for (String s : telefones){
                listaContatoPaciente.addItem(s);
            }
        }
        
    }//GEN-LAST:event_btnBuscarTelefoneActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContatoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlanoDeFundo;
    private javax.swing.JButton btnBuscarTelefone;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextField campoTextoCpfPaciente;
    private javax.swing.JTextField campoTextoNomePaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> listaContatoPaciente;
    // End of variables declaration//GEN-END:variables
}
