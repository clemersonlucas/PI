package view;

import controller.Evento;
import controller.Funcionario;
import model.AcessoBanco;

public class ListaEventos extends javax.swing.JFrame {

    private Evento todosEventos [] ;
    
    public ListaEventos() {
        initComponents();
        this.setTitle("Tela eventos");
        this.setLocationRelativeTo(this); 
        
        PlanoDeFundoAlterar.setVisible(false);
        
        
        listaEventos.removeAll();
        todosEventos = AcessoBanco.pegarTodosEventos();
        String [] lista = new String[todosEventos.length];
        for (int i = 0; i < todosEventos.length;i++) {
            lista[i]  = todosEventos[i].getTitulo();
        }
        listaEventos.setListData(lista);
        campoTextoDescricaoEvento.setText("Escolha um evento");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlanoDeFundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEventos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        btnEscolheEvento = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoTextoDescricaoEvento = new javax.swing.JTextPane();
        PlanoDeFundoAlterar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        campoTextoTitulo = new javax.swing.JTextField();
        btnAlterarAgora = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoTextoDescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dataPublicacao = new org.jdesktop.swingx.JXDatePicker();
        jLabel9 = new javax.swing.JLabel();
        dataExpedicao = new org.jdesktop.swingx.JXDatePicker();
        PlanoDeFundoAdicionar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        campoTextoTitulo1 = new javax.swing.JTextField();
        btnAdicionarAgr = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campoTextoDescricao1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dataPublicacao1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel12 = new javax.swing.JLabel();
        dataExpedicao1 = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 400));

        PlanoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundo.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Detalhes");

        listaEventos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        listaEventos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaEventos);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Todos eventos");

        btnEscolheEvento.setText("Escolher evento");
        btnEscolheEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolheEventoActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(40, 166, 166));
        btnAtualizar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(254, 254, 254));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(40, 166, 166));
        btnRemover.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(254, 254, 254));
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAdicionar.setBackground(new java.awt.Color(40, 166, 166));
        btnAdicionar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(254, 254, 254));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(40, 166, 166));
        btnCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(254, 254, 254));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        campoTextoDescricaoEvento.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(campoTextoDescricaoEvento);

        javax.swing.GroupLayout PlanoDeFundoLayout = new javax.swing.GroupLayout(PlanoDeFundo);
        PlanoDeFundo.setLayout(PlanoDeFundoLayout);
        PlanoDeFundoLayout.setHorizontalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEscolheEvento)
                        .addGap(65, 65, 65))
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        PlanoDeFundoLayout.setVerticalGroup(
            PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanoDeFundoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEscolheEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(PlanoDeFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(303, Short.MAX_VALUE))
        );

        PlanoDeFundoAlterar.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundoAlterar.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Titulo");

        btnAlterarAgora.setBackground(new java.awt.Color(40, 166, 166));
        btnAlterarAgora.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAlterarAgora.setForeground(new java.awt.Color(254, 254, 254));
        btnAlterarAgora.setText("Atualizar");
        btnAlterarAgora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAgoraActionPerformed(evt);
            }
        });

        btnCancelar1.setBackground(new java.awt.Color(40, 166, 166));
        btnCancelar1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(254, 254, 254));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Informações");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("Data publicação");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setText("Data expedição");

        javax.swing.GroupLayout PlanoDeFundoAlterarLayout = new javax.swing.GroupLayout(PlanoDeFundoAlterar);
        PlanoDeFundoAlterar.setLayout(PlanoDeFundoAlterarLayout);
        PlanoDeFundoAlterarLayout.setHorizontalGroup(
            PlanoDeFundoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoAlterarLayout.createSequentialGroup()
                .addGroup(PlanoDeFundoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanoDeFundoAlterarLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(PlanoDeFundoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(campoTextoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(campoTextoDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PlanoDeFundoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(dataPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(PlanoDeFundoAlterarLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnAlterarAgora, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PlanoDeFundoAlterarLayout.setVerticalGroup(
            PlanoDeFundoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoAlterarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(PlanoDeFundoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PlanoDeFundoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoTextoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dataPublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(PlanoDeFundoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PlanoDeFundoAlterarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTextoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoAlterarLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataExpedicao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(PlanoDeFundoAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarAgora, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        PlanoDeFundoAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        PlanoDeFundoAdicionar.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setText("Titulo");

        btnAdicionarAgr.setBackground(new java.awt.Color(40, 166, 166));
        btnAdicionarAgr.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnAdicionarAgr.setForeground(new java.awt.Color(254, 254, 254));
        btnAdicionarAgr.setText("Adicionar");
        btnAdicionarAgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAgrActionPerformed(evt);
            }
        });

        btnCancelar2.setBackground(new java.awt.Color(40, 166, 166));
        btnCancelar2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnCancelar2.setForeground(new java.awt.Color(254, 254, 254));
        btnCancelar2.setText("Cancelar");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("Informações");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setText("Data publicação");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel12.setText("Data expedição");

        javax.swing.GroupLayout PlanoDeFundoAdicionarLayout = new javax.swing.GroupLayout(PlanoDeFundoAdicionar);
        PlanoDeFundoAdicionar.setLayout(PlanoDeFundoAdicionarLayout);
        PlanoDeFundoAdicionarLayout.setHorizontalGroup(
            PlanoDeFundoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoAdicionarLayout.createSequentialGroup()
                .addGroup(PlanoDeFundoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlanoDeFundoAdicionarLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(PlanoDeFundoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(campoTextoTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jLabel10)
                            .addComponent(campoTextoDescricao1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PlanoDeFundoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataExpedicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(dataPublicacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(PlanoDeFundoAdicionarLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnAdicionarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PlanoDeFundoAdicionarLayout.setVerticalGroup(
            PlanoDeFundoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlanoDeFundoAdicionarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(PlanoDeFundoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PlanoDeFundoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoTextoTitulo1)
                    .addComponent(dataPublicacao1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(PlanoDeFundoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PlanoDeFundoAdicionarLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTextoDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlanoDeFundoAdicionarLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataExpedicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(PlanoDeFundoAdicionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarAgr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlanoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addComponent(PlanoDeFundoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addComponent(PlanoDeFundoAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PlanoDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlanoDeFundoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlanoDeFundoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void atualizarEventos (){
        listaEventos.removeAll();
        todosEventos = AcessoBanco.pegarTodosEventos();
        String [] lista = new String[todosEventos.length];
        for (int i = 0; i < todosEventos.length;i++) {
            lista[i]  = todosEventos[i].getTitulo();
        }
        listaEventos.setListData(lista);
        campoTextoDescricaoEvento.setText("Escolha um evento");
    }
    
    
    private void btnEscolheEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscolheEventoActionPerformed
        try {
            int index = listaEventos.getSelectedIndex();
            Evento atual = todosEventos[index];
            campoTextoDescricaoEvento.setText("Identificação: " + atual.getId()+
                "\nInformações: " + atual.getInformacao() + "\nData publicação: " + atual.getDataPublicao());
        }
        catch (ArrayIndexOutOfBoundsException ex){
        }
        
    }//GEN-LAST:event_btnEscolheEventoActionPerformed

    public void preencherTelaAlterar (Evento e){
        campoTextoTitulo.setText(e.getTitulo());
        campoTextoDescricao.setText(e.getInformacao());
    }
    
    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (!campoTextoDescricaoEvento.getText().equalsIgnoreCase("Escolha um evento")){
            PlanoDeFundo.setVisible(false);
            PlanoDeFundoAlterar.setVisible(true);
            Evento e = todosEventos[listaEventos.getSelectedIndex()];  
            preencherTelaAlterar(e);
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(null, "Escolha um evento!");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (!campoTextoDescricaoEvento.getText().equalsIgnoreCase("Escolha um evento")){
            int index = listaEventos.getSelectedIndex();
            int id = todosEventos[index].getId();
            AcessoBanco.deletarEvento(id);
            atualizarEventos();
        }
        else {
            javax.swing.JOptionPane.showMessageDialog(null, "Escolha um evento!");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        PlanoDeFundo.setVisible(false);
        PlanoDeFundoAdicionar.setVisible(true);       
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new InicialMedico().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        this.PlanoDeFundoAlterar.setVisible(false);
        this.PlanoDeFundo.setVisible(true);
        atualizarEventos();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnAlterarAgoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAgoraActionPerformed
        String informacao = campoTextoDescricao.getText();
        String titulo = campoTextoTitulo.getText();
        String dataExpedico = AdicionarEvento.pegarMinhaData(dataExpedicao.getDate().toString());
        String dataPublicao = AdicionarEvento.pegarMinhaData(dataPublicacao.getDate().toString());
        int id = todosEventos[listaEventos.getSelectedIndex()].getId();
        
        Evento e = new Evento(titulo, dataPublicao, dataExpedico, informacao, Funcionario.funcionario.getMatricula(), id);
        AcessoBanco.alterarEvento (e);
        this.PlanoDeFundoAlterar.setVisible(false);
        this.PlanoDeFundo.setVisible(true);
        atualizarEventos();
    }//GEN-LAST:event_btnAlterarAgoraActionPerformed

    private void btnAdicionarAgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAgrActionPerformed
        String titulo = campoTextoTitulo1.getText();
        String informacao = campoTextoDescricao1.getText();
        String dataExpedico = AdicionarEvento.pegarMinhaData(dataExpedicao1.getDate().toString());
        String dataPublicao = AdicionarEvento.pegarMinhaData(dataPublicacao1.getDate().toString());
        int id = AcessoBanco.novoIdEvento();
        
        Evento e = new Evento(titulo, dataPublicao, dataExpedico, informacao, Funcionario.funcionario.getMatricula(), id);
        AcessoBanco.adicionaEvento(e);
        this.PlanoDeFundoAdicionar.setVisible(false);
        this.PlanoDeFundo.setVisible(true);
        atualizarEventos();
        
    }//GEN-LAST:event_btnAdicionarAgrActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        this.PlanoDeFundoAdicionar.setVisible(false);
        this.PlanoDeFundo.setVisible(true);
        atualizarEventos();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PlanoDeFundo;
    private javax.swing.JPanel PlanoDeFundoAdicionar;
    private javax.swing.JPanel PlanoDeFundoAlterar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionarAgr;
    private javax.swing.JButton btnAlterarAgora;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JButton btnEscolheEvento;
    private javax.swing.JButton btnRemover;
    private javax.swing.JTextField campoTextoDescricao;
    private javax.swing.JTextField campoTextoDescricao1;
    private javax.swing.JTextPane campoTextoDescricaoEvento;
    private javax.swing.JTextField campoTextoTitulo;
    private javax.swing.JTextField campoTextoTitulo1;
    private org.jdesktop.swingx.JXDatePicker dataExpedicao;
    private org.jdesktop.swingx.JXDatePicker dataExpedicao1;
    private org.jdesktop.swingx.JXDatePicker dataPublicacao;
    private org.jdesktop.swingx.JXDatePicker dataPublicacao1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaEventos;
    // End of variables declaration//GEN-END:variables
}
