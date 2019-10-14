package view;

import controller.Paciente;
import java.util.ArrayList;
import model.AcessoBanco;

public class Protuario extends javax.swing.JFrame {
    public Protuario() {
        initComponents();
        this.setTitle("Tela prontuário");
        this.setLocationRelativeTo(this); 
        
        comboBoxEstadoCivil.removeAllItems();
        comboBoxListaContato.removeAllItems();
        comboBoxListaContato.addItem("Nenhum");
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PlanoDeFundo = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRemoverPaciente = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        campoTextoNome = new javax.swing.JTextField();
        lblNome1 = new javax.swing.JLabel();
        campoTextoNomeMae = new javax.swing.JTextField();
        lblNome2 = new javax.swing.JLabel();
        campoTextoNomePai = new javax.swing.JTextField();
        lblNome3 = new javax.swing.JLabel();
        campoTextoCpf = new javax.swing.JTextField();
        btnBuscarPaciente = new javax.swing.JButton();
        lblEstadoCivil = new javax.swing.JLabel();
        lblNome5 = new javax.swing.JLabel();
        campoTextoUf = new javax.swing.JTextField();
        lblNome6 = new javax.swing.JLabel();
        campoTextoSus = new javax.swing.JTextField();
        lblNome7 = new javax.swing.JLabel();
        campoTextoNascimento = new javax.swing.JTextField();
        lblNome8 = new javax.swing.JLabel();
        campoTextoRg = new javax.swing.JTextField();
        lblNome9 = new javax.swing.JLabel();
        campoTextoNaturalidade = new javax.swing.JTextField();
        lblNome10 = new javax.swing.JLabel();
        campoTextoNacionalidade = new javax.swing.JTextField();
        campoTextoEtinia = new javax.swing.JTextField();
        lblNome11 = new javax.swing.JLabel();
        lblNome12 = new javax.swing.JLabel();
        campoTextoObservacoes = new javax.swing.JTextField();
        lblNome13 = new javax.swing.JLabel();
        comboBoxEstadoCivil = new javax.swing.JComboBox<>();
        lblNome4 = new javax.swing.JLabel();
        campoTextoDataExpedicao = new javax.swing.JTextField();
        lblNome14 = new javax.swing.JLabel();
        comboBoxListaContato = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlanoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundo.setPreferredSize(new java.awt.Dimension(600, 600));

        lblNome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome.setText("Nome");

        btnCancelar.setBackground(new java.awt.Color(40, 166, 166));
        btnCancelar.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(254, 254, 254));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRemoverPaciente.setBackground(new java.awt.Color(40, 166, 166));
        btnRemoverPaciente.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnRemoverPaciente.setForeground(new java.awt.Color(254, 254, 254));
        btnRemoverPaciente.setText("Remover");
        btnRemoverPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPacienteActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(40, 166, 166));
        btnAlterar.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(254, 254, 254));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        lblNome1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome1.setText("Nome Mãe");

        lblNome2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome2.setText("Nome Pai");

        lblNome3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome3.setText("CPF");

        btnBuscarPaciente.setBackground(new java.awt.Color(40, 166, 166));
        btnBuscarPaciente.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnBuscarPaciente.setForeground(new java.awt.Color(254, 254, 254));
        btnBuscarPaciente.setText("Buscar");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        lblEstadoCivil.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblEstadoCivil.setText("Estado Civil");

        lblNome5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome5.setText("UF");

        lblNome6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome6.setText("SUS");

        campoTextoSus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoSusActionPerformed(evt);
            }
        });

        lblNome7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome7.setText("Nascimento");

        lblNome8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome8.setText("RG");

        lblNome9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome9.setText("País");

        campoTextoNaturalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNaturalidadeActionPerformed(evt);
            }
        });

        lblNome10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome10.setText("Natural");

        lblNome11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome11.setText("Etinia");

        lblNome12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome12.setText("Observações");

        lblNome13.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome13.setText("Contato");

        comboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNome4.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        lblNome4.setText("Estoque de Prontuário");

        campoTextoDataExpedicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoDataExpedicaoActionPerformed(evt);
            }
        });

        lblNome14.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblNome14.setText("Data Expedição");

        comboBoxListaContato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout PlanoDeFundoLayout = new javax.swing.GroupLayout(PlanoDeFundo);
        PlanoDeFundo.setLayout(PlanoDeFundoLayout);
        PlanoDeFundoLayout.setHorizontalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNome)
                                    .addComponent(lblNome2)
                                    .addComponent(campoTextoNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome1)
                                    .addComponent(campoTextoNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNome8)
                                            .addComponent(campoTextoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNome14)
                                            .addComponent(campoTextoDataExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNome3)
                                            .addComponent(campoTextoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                                            .addGap(79, 79, 79)
                                            .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                                    .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblNome9)
                                                            .addComponent(campoTextoNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblNome6))
                                                        .addComponent(campoTextoSus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblNome10)
                                                        .addComponent(campoTextoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(campoTextoUf)
                                                        .addComponent(campoTextoEtinia)
                                                        .addComponent(lblNome11)
                                                        .addComponent(lblNome5)
                                                        .addComponent(lblNome7)
                                                        .addComponent(campoTextoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTextoObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNome12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstadoCivil)
                                    .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                            .addComponent(lblNome13)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(comboBoxListaContato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(lblNome4)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoverPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        PlanoDeFundoLayout.setVerticalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addComponent(lblNome4)
                        .addGap(54, 54, 54)
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNome)
                                    .addComponent(lblNome3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTextoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNome1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoTextoNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(campoTextoNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                                .addComponent(lblNome9)
                                                .addGap(40, 40, 40))))))
                            .addComponent(campoTextoUf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addComponent(lblNome5)
                                .addGap(40, 40, 40)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addComponent(lblNome2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTextoNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addComponent(lblNome6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoTextoSus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTextoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addComponent(lblNome7)
                                .addGap(40, 40, 40)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoTextoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNome8)
                                    .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNome10)
                                        .addComponent(lblNome11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoTextoEtinia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTextoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(campoTextoDataExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addComponent(lblNome14)
                        .addGap(40, 40, 40)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome12)
                    .addComponent(lblEstadoCivil))
                .addGap(12, 12, 12)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblNome13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxListaContato, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoTextoObservacoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void montarEstadoCivil (String estadoCivil){
        comboBoxEstadoCivil.removeAllItems();
        comboBoxEstadoCivil.addItem(estadoCivil);
        
        String [] vetor = {"Casado(a)","Divorciado(a)", "Viuvo(a)","Solteiro(a)"};     
        for (int i = 0; i < vetor.length; i++) {
            if (!vetor[i].equalsIgnoreCase(estadoCivil)){
                comboBoxEstadoCivil.addItem(vetor[i]);
            }
        }
    }
    
    public void resetarComponentes (){
        campoTextoDataExpedicao.setText("");
        comboBoxEstadoCivil.removeAllItems();
        campoTextoNome.setText("");
        campoTextoNomePai.setText("");
        campoTextoNomeMae.setText("");
        comboBoxEstadoCivil.addItem("");
        comboBoxListaContato.removeAllItems();
        comboBoxListaContato.addItem("Nenhum");
        //montarEstadoCivil(paciente.getEstadoCivil());
        
        campoTextoUf.setText("");
        campoTextoSus.setText("");
        campoTextoRg.setText("");
        campoTextoNaturalidade.setText("");
        campoTextoNacionalidade.setText("");
        campoTextoEtinia.setText("");
        campoTextoNascimento.setText("");
        campoTextoObservacoes.setText("");
    }    

    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new InicialMedico().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRemoverPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPacienteActionPerformed
        // vamos remover o usuário do banco de dados
        if (AcessoBanco.cpfJaExiste(campoTextoCpf.getText())){
            String cpf = campoTextoCpf.getText();
            AcessoBanco.deletarPaciente(cpf);
            resetarComponentes();
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Paciente não existe !");
        }
    }//GEN-LAST:event_btnRemoverPacienteActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (AcessoBanco.cpfJaExiste(campoTextoCpf.getText())){
            int index = comboBoxEstadoCivil.getSelectedIndex();
            String estadoCivil = comboBoxEstadoCivil.getItemAt(index);
            String cpf = campoTextoCpf.getText();
            AcessoBanco.alterarEstadoCivilPaciente(estadoCivil, cpf);
            resetarComponentes();
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Paciente não existe !");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        
        // verifica cpf = null
        // encontra paciente = null
        // contatos paciente = null

        String cpf= campoTextoCpf.getText();
        
        if (AcessoBanco.cpfJaExiste(cpf)){
            Paciente paciente = AcessoBanco.encontrarPaciente(cpf);

            campoTextoDataExpedicao.setText(paciente.getDataExpedicao());
            comboBoxEstadoCivil.removeAllItems();
            campoTextoNome.setText(paciente.getNome());
            campoTextoNomePai.setText(paciente.getNomePai());
            campoTextoNomeMae.setText(paciente.getNomeMae());
            //comboBoxEstadoCivil.addItem(paciente.getEstadoCivil());

            montarEstadoCivil(paciente.getEstadoCivil());

            campoTextoUf.setText(paciente.getUf());
            campoTextoSus.setText(paciente.getSus());
            campoTextoRg.setText(paciente.getRg());
            campoTextoNaturalidade.setText(paciente.getNacionalidade());
            campoTextoNacionalidade.setText(paciente.getNaturalidade());
            campoTextoEtinia.setText(paciente.getEtinia());
            campoTextoNascimento.setText(paciente.getNascimento());
            campoTextoObservacoes.setText(paciente.getObservacoes());
        
            ArrayList<String> listaTelefonica = paciente.getTelefones();
            comboBoxListaContato.removeAllItems();
            for (String string : listaTelefonica) {
                comboBoxListaContato.addItem(string);
            }
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(null, "Paciente não existe !");
        }
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void campoTextoSusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoSusActionPerformed
    }//GEN-LAST:event_campoTextoSusActionPerformed
    private void campoTextoNaturalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNaturalidadeActionPerformed
    }//GEN-LAST:event_campoTextoNaturalidadeActionPerformed
    private void campoTextoDataExpedicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoDataExpedicaoActionPerformed
    }//GEN-LAST:event_campoTextoDataExpedicaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Protuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlanoDeFundo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRemoverPaciente;
    private javax.swing.JTextField campoTextoCpf;
    private javax.swing.JTextField campoTextoDataExpedicao;
    private javax.swing.JTextField campoTextoEtinia;
    private javax.swing.JTextField campoTextoNacionalidade;
    private javax.swing.JTextField campoTextoNascimento;
    private javax.swing.JTextField campoTextoNaturalidade;
    private javax.swing.JTextField campoTextoNome;
    private javax.swing.JTextField campoTextoNomeMae;
    private javax.swing.JTextField campoTextoNomePai;
    private javax.swing.JTextField campoTextoObservacoes;
    private javax.swing.JTextField campoTextoRg;
    private javax.swing.JTextField campoTextoSus;
    private javax.swing.JTextField campoTextoUf;
    private javax.swing.JComboBox<String> comboBoxEstadoCivil;
    private javax.swing.JComboBox<String> comboBoxListaContato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome10;
    private javax.swing.JLabel lblNome11;
    private javax.swing.JLabel lblNome12;
    private javax.swing.JLabel lblNome13;
    private javax.swing.JLabel lblNome14;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblNome6;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblNome8;
    private javax.swing.JLabel lblNome9;
    // End of variables declaration//GEN-END:variables
}
