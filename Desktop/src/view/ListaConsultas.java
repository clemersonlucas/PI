package view;

import controller.Consulta;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.AcessoBanco;

public class ListaConsultas extends javax.swing.JFrame {

    public static ArrayList<Consulta> consultasAgendadas = new ArrayList<>();
    
    public ListaConsultas() {
        initComponents();
        this.setTitle("Consultas Agendadas");
        this.setLocationRelativeTo(this); 
        
        atualizarComponetens();
        CampoTexoEditavel.enable();
        CampoTexoEditavel.setText("Selecione uma Consulta");
        
            ListaConsultasAgendadas.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    int index = ListaConsultasAgendadas.getSelectedIndex();
                    String nomePaciente = AcessoBanco.descobriNomePaciente(consultasAgendadas.get(index).getParaPaciente());
                  
                    Consulta c = consultasAgendadas.get(index); 
                    //String s[] = AcessoBanco.descobriNomeProfissional(c.getQuemAgendou());

                    CampoTexoEditavel.setText("Paciente " + nomePaciente + "\n" + "Agendou uma consulta com " +
                        c.getEspecialidade() + "\nData solicitada " + c.getData() + "\n"+ c.getStatus());
                }
            });
    }
    
    
    
    public void atualizarComponetens(){
        CampoTexoEditavel.setText("Escolha uma consulta");
        consultasAgendadas = AcessoBanco.pegarTodasConsultas();
        ListaConsultasAgendadas.removeAll();
       
        String [] listData = new String[consultasAgendadas.size()];
        
        for (int i = 0; i < listData.length; i++) {
            listData[i] = 
                AcessoBanco.descobriNomePaciente(consultasAgendadas.get(i).getParaPaciente()) + // nome do paciente
                " agendou um " + consultasAgendadas.get(i).getEspecialidade();
        }
        // quando o usuário clicar no evento, será mostrada as informações sobre o mesmo
        ListaConsultasAgendadas.setListData(listData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanoDeFundo = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaConsultasAgendadas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CampoTexoEditavel = new javax.swing.JTextPane();
        btnIndeferir = new javax.swing.JButton();
        btnDeferir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(771, 450));

        PlanoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundo.setPreferredSize(new java.awt.Dimension(600, 600));

        btnVoltar.setBackground(new java.awt.Color(40, 166, 166));
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        ListaConsultasAgendadas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ListaConsultasAgendadas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        ListaConsultasAgendadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListaConsultasAgendadas);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Aguardando avaliação");

        CampoTexoEditavel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(CampoTexoEditavel);

        btnIndeferir.setBackground(new java.awt.Color(183, 25, 9));
        btnIndeferir.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnIndeferir.setForeground(new java.awt.Color(254, 254, 254));
        btnIndeferir.setText("Indeferido");
        btnIndeferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndeferirActionPerformed(evt);
            }
        });

        btnDeferir.setBackground(new java.awt.Color(40, 166, 166));
        btnDeferir.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnDeferir.setForeground(new java.awt.Color(254, 254, 254));
        btnDeferir.setText("Deferido");
        btnDeferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeferirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Descrição");

        javax.swing.GroupLayout PlanoDeFundoLayout = new javax.swing.GroupLayout(PlanoDeFundo);
        PlanoDeFundo.setLayout(PlanoDeFundoLayout);
        PlanoDeFundoLayout.setHorizontalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnIndeferir)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeferir)))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );
        PlanoDeFundoLayout.setVerticalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIndeferir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeferir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        new InicialMedico().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnIndeferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndeferirActionPerformed
        int index = ListaConsultasAgendadas.getSelectedIndex();
        Consulta consulta = consultasAgendadas.get(index); 
        int id = consulta.getId();
        AcessoBanco.indeferirConsulta(id);
        atualizarComponetens();
    }//GEN-LAST:event_btnIndeferirActionPerformed

    private void btnDeferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeferirActionPerformed
        int index = ListaConsultasAgendadas.getSelectedIndex();
        Consulta consulta = consultasAgendadas.get(index); 
        int id = consulta.getId();
        AcessoBanco.deferirConsulta(id);
        atualizarComponetens();
    }//GEN-LAST:event_btnDeferirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane CampoTexoEditavel;
    private javax.swing.JList<String> ListaConsultasAgendadas;
    private javax.swing.JPanel PlanoDeFundo;
    private javax.swing.JButton btnDeferir;
    private javax.swing.JButton btnIndeferir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
