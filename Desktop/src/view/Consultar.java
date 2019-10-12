package view;

import controller.Consulta;
import controller.Funcionario;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Conexao;

public class Consultar extends javax.swing.JFrame {
    
    
    public static String dataInicio, dataFim;
    
    public static ArrayList<Consulta> listaConsultas = new ArrayList<>();
    
    public Consultar() {
        initComponents();
        this.setTitle("Consulte um paciente");
        this.setLocationRelativeTo(this);
        
        PlanoDeFundo1.setVisible(false);
        areaDescricao1.setText("Selecione uma consulta");
        
        
        // para o profissional consultar um paciente 
        // a consulta deve ter a especilidade dele e status deferido
        listaConsultas = Conexao.ConsultasOk(Funcionario.funcionario.getFuncao());
        
        ListaConsultaAgendada.removeAll();
        String listData [] = new String[listaConsultas.size()];
        
        for (int i = 0; i < listData.length; i++) {
            listData[i] = Conexao.descobriNomePaciente(listaConsultas.get(i).getParaPaciente()) 
                    + " agendou um " + listaConsultas.get(i).getEspecialidade(); 
        }
        
        ListaConsultaAgendada.setListData(listData);
        ListaConsultaAgendada.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = ListaConsultaAgendada.getSelectedIndex();
                
                String nomeProfissional []= Conexao.descobriNomeProfissional(listaConsultas.get(index)
                        .getQuemAgendou());
                
                String descricao = nomeProfissional[0] + ": " + nomeProfissional[1] + 
                        "\nAgendou para: " + listaConsultas.get(index).getData() + 
                        "\nStatus:" + listaConsultas.get(index).getStatus();
                
                areaDescricao1.setText(descricao);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        PlanoDeFundo1 = new javax.swing.JPanel();
        btnConcluir = new javax.swing.JButton();
        btnVoltar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        descricaoPaciente = new javax.swing.JEditorPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        descricaoMedicamento = new javax.swing.JEditorPane();
        PlanoDeFundo2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaConsultaAgendada = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaDescricao1 = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo.setBackground(new java.awt.Color(254, 254, 254));

        PlanoDeFundo1.setBackground(new java.awt.Color(254, 254, 254));
        PlanoDeFundo1.setPreferredSize(new java.awt.Dimension(600, 600));

        btnConcluir.setBackground(new java.awt.Color(40, 166, 166));
        btnConcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnConcluir.setText("Concluir");
        btnConcluir.setBorder(null);
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        btnVoltar2.setBackground(new java.awt.Color(40, 166, 166));
        btnVoltar2.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar2.setText("Cancelar");
        btnVoltar2.setBorder(null);
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Medicamento");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Descrição");

        descricaoPaciente.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jScrollPane6.setViewportView(descricaoPaciente);

        descricaoMedicamento.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jScrollPane7.setViewportView(descricaoMedicamento);

        javax.swing.GroupLayout PlanoDeFundo1Layout = new javax.swing.GroupLayout(PlanoDeFundo1);
        PlanoDeFundo1.setLayout(PlanoDeFundo1Layout);
        PlanoDeFundo1Layout.setHorizontalGroup(
            PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(PlanoDeFundo1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        PlanoDeFundo1Layout.setVerticalGroup(
            PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundo1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PlanoDeFundo1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlanoDeFundo1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(PlanoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        PlanoDeFundo2.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundo2.setPreferredSize(new java.awt.Dimension(600, 600));

        ListaConsultaAgendada.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
        ListaConsultaAgendada.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListaConsultaAgendada);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Consultas Agendadas");

        areaDescricao1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jScrollPane4.setViewportView(areaDescricao1);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("Descrição");

        btnConsulta.setBackground(new java.awt.Color(40, 166, 166));
        btnConsulta.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnConsulta.setForeground(new java.awt.Color(254, 254, 254));
        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(40, 166, 166));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlanoDeFundo2Layout = new javax.swing.GroupLayout(PlanoDeFundo2);
        PlanoDeFundo2.setLayout(PlanoDeFundo2Layout);
        PlanoDeFundo2Layout.setHorizontalGroup(
            PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanoDeFundo2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PlanoDeFundo2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundo2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        PlanoDeFundo2Layout.setVerticalGroup(
            PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundo2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PlanoDeFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundo2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsulta))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlanoDeFundo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlanoDeFundo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlanoDeFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PlanoDeFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        if (areaDescricao1.getText().equalsIgnoreCase("Selecione uma consulta")){
            javax.swing.JOptionPane.showMessageDialog(null, "Selecione uma consulta!");
        }
        
        else {
            Date a = new Date();
            dataInicio = a.getHours() + ":" + a.getMinutes() + ":" + a.getSeconds();
            PlanoDeFundo2.setVisible(false);
            PlanoDeFundo1.setVisible(true);
        }


    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        new InicialMedico().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        
        // vamos pegar a informação do tempo em que aconteceu
        Date a = new Date();
        dataFim = a.getHours() + ":" + a.getMinutes() + ":" + a.getSeconds();
        String diagnostico = descricaoPaciente.getText();
        String descricao = descricaoMedicamento.getText();
        int id = listaConsultas.get(ListaConsultaAgendada.getSelectedIndex()).getId();
        
        Conexao.consultarUmPacinte(descricao, diagnostico, dataInicio, dataFim, id);
        
        PlanoDeFundo1.setVisible(false);
        PlanoDeFundo2.setVisible(true);        
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
        PlanoDeFundo1.setVisible(false);
        PlanoDeFundo2.setVisible(true);
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaConsultaAgendada;
    private javax.swing.JPanel PlanoDeFundo1;
    private javax.swing.JPanel PlanoDeFundo2;
    private javax.swing.JEditorPane areaDescricao1;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar2;
    private javax.swing.JEditorPane descricaoMedicamento;
    private javax.swing.JEditorPane descricaoPaciente;
    private javax.swing.JPanel fundo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
