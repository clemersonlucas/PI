package view;

import controller.Paciente;
import model.AcessoBanco;


public class TelaCadatroUsuario extends javax.swing.JFrame {
    public TelaCadatroUsuario() {
        initComponents();
        this.setTitle("Tela novo paciente");
        this.setLocationRelativeTo(this); 
        
        
        ListaEstados.removeAll();
        ListaEstados.addItem("RN");
        ListaEstados.addItem("CE");
        ListaEstados.addItem("PB");

        ListaSexo.removeAll();
        ListaSexo.addItem("Masculino");
        ListaSexo.addItem("Feminino");
        
        ListaOrgaoEmissor.removeAllItems();
        ListaOrgaoEmissor.addItem("ITEP");
        ListaOrgaoEmissor.addItem("AOCP");
        ListaOrgaoEmissor.addItem("CREA");
        
        ListaCidades.removeAll();
        ListaCidades.addItem("Campo Redondo");
        ListaCidades.addItem("Natal");
        ListaCidades.addItem("Santa Cruz");
        ListaCidades.addItem("Lajes Pintadas");
        ListaCidades.addItem("Tangará");
        ListaCidades.addItem("Currais Novos");
        
        
        ListaEtnias.addItem("Pardo");
        ListaEtnias.addItem("Negro");
        ListaEtnias.addItem("Branco");
        
        
        ListaPaises.addItem("Brasil");
        ListaPaises.addItem("Argentina");
        ListaPaises.addItem("Paraguai");
        
        
        ListaEstadoCivil.addItem("Casado(a)");
        ListaEstadoCivil.addItem("Divorciado(a)");
        ListaEstadoCivil.addItem("Viuvo(a)");
        ListaEstadoCivil.addItem("Solteiro(a)");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanelTelaDeFundo = new javax.swing.JPanel();
        campoTextoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        campoTextoCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoTextoSus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ListaEstados = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ListaSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        ListaOrgaoEmissor = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ListaCidades = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ListaEtnias = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ListaPaises = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        ListaEstadoCivil = new javax.swing.JComboBox<>();
        campoTextoRg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        campoTextoNomePai = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoTextoNomeMae = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jXDatePickerNascimento = new org.jdesktop.swingx.JXDatePicker();
        jXDatePickerEmissaoRg = new org.jdesktop.swingx.JXDatePicker();
        jLabel15 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTelaDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTelaDeFundo.setPreferredSize(new java.awt.Dimension(550, 450));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel1.setText("Nome:");

        btnCadastrar.setBackground(new java.awt.Color(40, 166, 166));
        btnCadastrar.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(40, 166, 166));
        btnCancelar.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setText("Cpf:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel3.setText("SUS:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel4.setText("UF:");

        ListaEstados.setBackground(java.awt.Color.white);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel5.setText("Sexo:");

        ListaSexo.setBackground(java.awt.Color.white);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel6.setText("Orgão Emissor:");

        ListaOrgaoEmissor.setBackground(java.awt.Color.white);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel7.setText("Natural:");

        ListaCidades.setBackground(java.awt.Color.white);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel8.setText("Etnia:");

        ListaEtnias.setBackground(java.awt.Color.white);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel9.setText("Naturalizado:");

        ListaPaises.setBackground(java.awt.Color.white);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel10.setText("Estado Civil:");

        ListaEstadoCivil.setBackground(java.awt.Color.white);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel11.setText("RG:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel12.setText("Nome Pai: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel13.setText("Nome Mãe: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel14.setText("Nascimento:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel15.setText("Emissão RG:");

        javax.swing.GroupLayout jPanelTelaDeFundoLayout = new javax.swing.GroupLayout(jPanelTelaDeFundo);
        jPanelTelaDeFundo.setLayout(jPanelTelaDeFundoLayout);
        jPanelTelaDeFundoLayout.setHorizontalGroup(
            jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(ListaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(ListaEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jLabel1)
                            .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(campoTextoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(ListaOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoTextoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(campoTextoSus, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(campoTextoNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTextoNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListaEtnias, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jXDatePickerNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListaPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListaEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(ListaCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jXDatePickerEmissaoRg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTelaDeFundoLayout.setVerticalGroup(
            jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTextoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTextoSus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListaEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTextoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListaOrgaoEmissor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(40, 40, 40)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTextoNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXDatePickerNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(campoTextoNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ListaEtnias, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ListaPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ListaEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelTelaDeFundoLayout.createSequentialGroup()
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTelaDeFundoLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXDatePickerEmissaoRg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ListaCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68)
                .addGroup(jPanelTelaDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTelaDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // vamos verificar o modelo da data de nascimento
        if (jXDatePickerNascimento.getDate().getYear() > 2019){
            javax.swing.JOptionPane.showMessageDialog(null, "Data nascimento inválido");
        }
        // vamos verificar o modelo da data de emissão 
        else if (jXDatePickerEmissaoRg.getDate().getYear() > 2019){
            javax.swing.JOptionPane.showMessageDialog(null, "Data emissão RG inválido");
        }

        // vamos verificar se o nome do usuário esta menor que 5
        else if (campoTextoNome.getText().length() < 5){
            javax.swing.JOptionPane.showMessageDialog(null, "Nome muito curto");
        }
        // vamos verificar o nome do pai
        else if (campoTextoNomePai.getText().length() < 5){
            javax.swing.JOptionPane.showMessageDialog(null, "Nome do pai muito curto");
        }
        // vamos verificar o nome do mãe
        else if (campoTextoNomeMae.getText().length() < 5){
            javax.swing.JOptionPane.showMessageDialog(null, "Nome da mãe muito curto");
        }
        // vamos verificar o sus do paciente
        else if (campoTextoSus.getText().length() != 15){
            javax.swing.JOptionPane.showMessageDialog(null, "SUS inválido");
        }
        // vamos verificar o cpf do paciente
        else if (campoTextoCpf.getText().length() != 11){
            javax.swing.JOptionPane.showMessageDialog(null, "CPF inválido");
        }
        // vamos verificar o rg do paciente
        else if (campoTextoRg.getText().length() != 9){
            javax.swing.JOptionPane.showMessageDialog(null, "RG inválido");
        }
        
        else {
            // vamos verificar a data de nascimento
            String nascimento = "";
            String dataExpedicao = "";
           
            nascimento += AdicionarEvento.pegarMinhaData(jXDatePickerNascimento.getDate().toString());
            dataExpedicao += AdicionarEvento.pegarMinhaData(jXDatePickerEmissaoRg.getDate().toString());
        
            String sexo;
            if (ListaSexo.getItemAt(ListaSexo.getSelectedIndex()).equalsIgnoreCase("masculino")){
                sexo = "m";
            }else {
                sexo = "f";
            }
            
            
            // vamos verificar se o cpf ja está no banco
            if (AcessoBanco.cpfJaExiste(campoTextoCpf.getText()) == false){
                Paciente paciente = new Paciente (
                    sexo,
                    ListaEtnias.getItemAt(ListaEtnias.getSelectedIndex()),
                    "usb." + campoTextoCpf.getText(),
                    ListaEstadoCivil.getItemAt(ListaEstadoCivil.getSelectedIndex()),
                    campoTextoRg.getText(),  
                    ListaOrgaoEmissor.getItemAt(ListaOrgaoEmissor.getSelectedIndex()), 
                    dataExpedicao, 
                    ListaEstados.getItemAt(ListaEstados.getSelectedIndex()),
                    "",  campoTextoNomePai.getText(), campoTextoNomeMae.getText(), campoTextoNome.getText(),
                    campoTextoSus.getText(), "", ListaPaises.getItemAt(ListaPaises.getSelectedIndex()),
                    ListaCidades.getItemAt(ListaCidades.getSelectedIndex()), 
                    nascimento,  campoTextoCpf.getText());

                // vamos adicionar um novo paciente no banco
                AcessoBanco.adicionaPaciente(paciente);

                javax.swing.JOptionPane.showMessageDialog(null, "Paciente Cadastrado com sucesso!");
                this.dispose();
                new InicialMedico().setVisible(true);
            }
            else {
                System.err.println("CPF já existe no banco de dados"); 
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new InicialMedico().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed
         
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadatroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaCidades;
    private javax.swing.JComboBox<String> ListaEstadoCivil;
    private javax.swing.JComboBox<String> ListaEstados;
    private javax.swing.JComboBox<String> ListaEtnias;
    private javax.swing.JComboBox<String> ListaOrgaoEmissor;
    private javax.swing.JComboBox<String> ListaPaises;
    private javax.swing.JComboBox<String> ListaSexo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField campoTextoCpf;
    private javax.swing.JTextField campoTextoNome;
    private javax.swing.JTextField campoTextoNomeMae;
    private javax.swing.JTextField campoTextoNomePai;
    private javax.swing.JTextField campoTextoRg;
    private javax.swing.JTextField campoTextoSus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelTelaDeFundo;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerEmissaoRg;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerNascimento;
    // End of variables declaration//GEN-END:variables
}
