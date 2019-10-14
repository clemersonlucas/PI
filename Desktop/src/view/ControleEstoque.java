package view;

import controller.Estoque;
import java.util.ArrayList;
import model.AcessoBanco;

public class ControleEstoque extends javax.swing.JFrame {
    public ControleEstoque() {
        initComponents();
        tabelaEstoque.removeAll();
        
        this.setTitle("Controle de Estoque");
        this.setLocationRelativeTo(this); 
        atualizarTabelaEstoque();
    }

    public static void atualizarTabelaEstoque (){
        ArrayList<Estoque> produtos = AcessoBanco.pegarMedicamentoEstoque();
        String layout [] = {"Nome", "Fabricação", "Validade", "Quantidade", "Identificação"};
        String matriz [][] = new String [produtos.size()][layout.length];
        
        for (int i = 0; i < matriz.length; i++){
            Estoque estoque = produtos.get(i);
            for (int j = 0; j < matriz[0].length; j++) {
                
                // vamos pegar cada elemento apartir de sua
                // respectiva coluna
                switch (j){
                    case 0:
                        matriz [i][j] = estoque.getNome();
                        break;
                        
                    case 1:
                        matriz [i][j] = estoque.getFabricacao();
                        break;
                    
                    case 2:
                        matriz [i][j] = estoque.getValidade();
                        break;
                        
                    case 3:
                        // vamos passar o valor de inteiro pra String
                        matriz [i][j] = Integer.toString(estoque.getQuantidade());
                        break;
                        
                    default:
                        matriz[i][j] = Integer.toString(estoque.getId());
                }
            }
        }
        
        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            matriz, layout 
        ));
        jScrollPane1.setViewportView(tabelaEstoque);
        tabelaEstoque.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanoDeFundo1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnNovoMedicamento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnNovoEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlanoDeFundo1.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundo1.setPreferredSize(new java.awt.Dimension(600, 600));

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

        btnNovoMedicamento.setBackground(new java.awt.Color(40, 166, 166));
        btnNovoMedicamento.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnNovoMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoMedicamento.setText("Alterar");
        btnNovoMedicamento.setBorder(null);
        btnNovoMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoMedicamentoActionPerformed(evt);
            }
        });

        tabelaEstoque.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaEstoque);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Medicamentos no Estoque");

        btnNovoEstoque.setBackground(new java.awt.Color(40, 166, 166));
        btnNovoEstoque.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnNovoEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoEstoque.setText("Adicionar");
        btnNovoEstoque.setBorder(null);
        btnNovoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlanoDeFundo1Layout = new javax.swing.GroupLayout(PlanoDeFundo1);
        PlanoDeFundo1.setLayout(PlanoDeFundo1Layout);
        PlanoDeFundo1Layout.setHorizontalGroup(
            PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundo1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PlanoDeFundo1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(PlanoDeFundo1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PlanoDeFundo1Layout.setVerticalGroup(
            PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundo1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnNovoMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        new InicialMedico().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoMedicamentoActionPerformed
        new AddMedicamentoEstoque().setVisible(true);
    }//GEN-LAST:event_btnNovoMedicamentoActionPerformed

    private void btnNovoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEstoqueActionPerformed
        new AddTipoMedicamento().setVisible(true);
    }//GEN-LAST:event_btnNovoEstoqueActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlanoDeFundo1;
    private javax.swing.JButton btnNovoEstoque;
    private javax.swing.JButton btnNovoMedicamento;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tabelaEstoque;
    // End of variables declaration//GEN-END:variables
}
