package view;

import config.ConfigIP;
import model.AcessoBanco;

public class TelaConfigIp extends javax.swing.JFrame {

    public TelaConfigIp() {
        initComponents();
        this.setTitle("Configure o servidor");
        this.setLocationRelativeTo(this);
        
        rbAutoSelect.setSelected(true);
        listaIp.enable(true);
        ipCustom.enable(false);      
        String ipSalvo = ConfigIP.read();
        ipCustom.setText(ipSalvo);
        
        // ler valores do historico
        listaIp.removeAllItems();
        for (String s : ConfigIP.readHistoryIp()){
            listaIp.addItem(s);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbAutoSelect = new javax.swing.JRadioButton();
        rbCustom = new javax.swing.JRadioButton();
        ipCustom = new javax.swing.JTextField();
        listaIp = new javax.swing.JComboBox<>();
        btnTestarConexao = new javax.swing.JButton();
        btnConfirmarIp = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rbAutoSelect.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbAutoSelect);
        rbAutoSelect.setText("Auto Select");
        rbAutoSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAutoSelectActionPerformed(evt);
            }
        });

        rbCustom.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbCustom);
        rbCustom.setText("Custom");
        rbCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCustomActionPerformed(evt);
            }
        });

        ipCustom.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        listaIp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnTestarConexao.setBackground(new java.awt.Color(40, 166, 166));
        btnTestarConexao.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnTestarConexao.setForeground(new java.awt.Color(255, 255, 255));
        btnTestarConexao.setText("Teste conexão");
        btnTestarConexao.setBorder(null);
        btnTestarConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestarConexaoActionPerformed(evt);
            }
        });

        btnConfirmarIp.setBackground(new java.awt.Color(40, 166, 166));
        btnConfirmarIp.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnConfirmarIp.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmarIp.setText("Confirmar");
        btnConfirmarIp.setBorder(null);
        btnConfirmarIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarIpActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(40, 166, 166));
        btnVoltar.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTestarConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirmarIp, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(listaIp, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(ipCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rbAutoSelect)
                    .addComponent(rbCustom))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(rbAutoSelect)
                .addGap(18, 18, 18)
                .addComponent(listaIp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(rbCustom)
                .addGap(18, 18, 18)
                .addComponent(ipCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTestarConexao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmarIp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbAutoSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAutoSelectActionPerformed
        listaIp.enable(true);
        ipCustom.enable(false);
    }//GEN-LAST:event_rbAutoSelectActionPerformed

    private void rbCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCustomActionPerformed
        listaIp.enable(false);
        ipCustom.enable(true);
    }//GEN-LAST:event_rbCustomActionPerformed

    private void btnTestarConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestarConexaoActionPerformed
        String ip = "";
        if (rbAutoSelect.isSelected()){
            int index = listaIp.getSelectedIndex();
            ip = listaIp.getItemAt(index);
        }else {
            ip = ipCustom.getText();
        }     

        boolean acesso = AcessoBanco.testConnection(ip);
        if (acesso){
            javax.swing.JOptionPane.showMessageDialog(null, "sucesso!");
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(null, "falha ao conectar-se!");
        }
    }//GEN-LAST:event_btnTestarConexaoActionPerformed

    private void btnConfirmarIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarIpActionPerformed
        if (rbAutoSelect.isSelected()){
        //    System.err.println("Pegamos o valor de auto select");
            int index = listaIp.getSelectedIndex();
            String ip = listaIp.getItemAt(index);
            ConfigIP.writer(ip);                      // escreve no arquivo IP
        }else {
        //    System.err.println("Pegamos o valor customizado"); 
            String novoIp = ipCustom.getText();
            ConfigIP.writer(novoIp);                  // escreve no arquivo IP
            ConfigIP.writerIpHistory(novoIp);         // escreve no arquivo de historico
        }
        
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnConfirmarIpActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfigIp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarIp;
    private javax.swing.JButton btnTestarConexao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ipCustom;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaIp;
    private javax.swing.JRadioButton rbAutoSelect;
    private javax.swing.JRadioButton rbCustom;
    // End of variables declaration//GEN-END:variables
}
