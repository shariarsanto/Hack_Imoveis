/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Model.Aluguel;
import Model.Cliente;
import Model.Venda;
import Model.Imovel;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wagner
 * @author Denner
 */
public class FormAluguel extends javax.swing.JFrame {

    private Venda venda = null;
    private Cliente cliente = null;
    private Imovel imovel = null;
    
    public FormAluguel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_CPF = new javax.swing.JLabel();
        jftf_CPF = new javax.swing.JFormattedTextField();
        jbt_Cpf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jl_Estado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jb_Nome = new javax.swing.JLabel();
        jl_Telefone = new javax.swing.JLabel();
        jl_EstadoCivil = new javax.swing.JLabel();
        jl_Endereco = new javax.swing.JLabel();
        jl_Bairro = new javax.swing.JLabel();
        jl_Complemento = new javax.swing.JLabel();
        Print_Endereco = new javax.swing.JLabel();
        Print_Complemento = new javax.swing.JLabel();
        Print_Bairro = new javax.swing.JLabel();
        Print_Cidade = new javax.swing.JLabel();
        Print_Estado = new javax.swing.JLabel();
        Print_CEP = new javax.swing.JLabel();
        Print_EstadoCivil = new javax.swing.JLabel();
        Print_Telefone = new javax.swing.JLabel();
        Print_Nome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jftf_Imovel = new javax.swing.JFormattedTextField();
        Buscar_Imovel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jb_PagamentoDinheiro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela_Imovel = new javax.swing.JTable();
        jExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_CadastraCliente = new javax.swing.JMenuItem();
        jmi_novoAluguel = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aluguel");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jl_CPF.setText("CPF");

        try {
            jftf_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jbt_Cpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Search-Find-48.png"))); // NOI18N
        jbt_Cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_CpfActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar cliente");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Cliente"));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cidade");

        jl_Estado.setText("Estado");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("CEP");

        jb_Nome.setText("Nome");

        jl_Telefone.setText("Telefone");

        jl_EstadoCivil.setText("Estado Civil");

        jl_Endereco.setText("Endereco");

        jl_Bairro.setText("Bairro");

        jl_Complemento.setText("Complemento");

        Print_Endereco.setText(":");

        Print_Complemento.setText(":");

        Print_Bairro.setText(":");

        Print_Cidade.setText(":");

        Print_Estado.setText(":");

        Print_CEP.setText(":");

        Print_EstadoCivil.setText(":");

        Print_Telefone.setText(":");

        Print_Nome.setText(":");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jl_EstadoCivil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Print_EstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(263, 263, 263)
                                .addComponent(jl_Estado)
                                .addGap(0, 171, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jl_Telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Print_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Print_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jl_Bairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Print_Bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jl_Complemento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Print_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Print_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Print_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(6, 6, 6)))
                        .addGap(128, 128, 128))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jb_Nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Print_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jl_Endereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Print_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Print_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Print_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_Endereco))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Print_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_Complemento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_Bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Print_Bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(Print_Cidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jl_EstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Print_EstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Print_Estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_Estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Print_CEP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jl_Telefone)
                        .addComponent(jLabel9)
                        .addComponent(Print_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Aluguel"));

        jLabel4.setText("Numero do Imovel");

        jLabel3.setText("Buscar Imovel ");

        try {
            jftf_Imovel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftf_Imovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftf_ImovelActionPerformed(evt);
            }
        });

        Buscar_Imovel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Search-Find-48.png"))); // NOI18N
        Buscar_Imovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar_ImovelActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Delete-48.png"))); // NOI18N
        jButton2.setText("Cancelar");

        jb_PagamentoDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Donate -48.png"))); // NOI18N
        jb_PagamentoDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_PagamentoDinheiroActionPerformed(evt);
            }
        });

        jTabela_Imovel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Imovel", "Tipo de Imovel", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela_Imovel.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabela_Imovel);
        if (jTabela_Imovel.getColumnModel().getColumnCount() > 0) {
            jTabela_Imovel.getColumnModel().getColumn(0).setResizable(false);
            jTabela_Imovel.getColumnModel().getColumn(1).setResizable(false);
            jTabela_Imovel.getColumnModel().getColumn(2).setResizable(false);
        }

        jExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Logout-48.png"))); // NOI18N
        jExit.setFocusable(false);
        jExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(222, 222, 222)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jftf_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)
                                        .addGap(69, 69, 69)))
                                .addComponent(Buscar_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jb_PagamentoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jftf_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(21, 21, 21))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Buscar_Imovel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jb_PagamentoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(324, 324, 324)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(79, 79, 79))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jl_CPF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jftf_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addComponent(jbt_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbt_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_CPF)
                            .addComponent(jftf_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastro");

        jmi_CadastraCliente.setText("Cadastrar cliente");
        jMenu1.add(jmi_CadastraCliente);

        jmi_novoAluguel.setText("Novo Aluguel");
        jmi_novoAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_novoAluguelActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_novoAluguel);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jExitActionPerformed

    private void jmi_novoAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_novoAluguelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_novoAluguelActionPerformed

    private void jbt_CpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_CpfActionPerformed
        String cpf = jftf_CPF.getText();
        Cliente cliente = FormPrincipal.daoCliente.buscarCliente(cpf);
        System.out.println(cliente);
        if (cliente != null) {
            jftf_CPF.setText(cliente.getCpf());
            Print_Nome.setText(cliente.getNome());
            Print_Telefone.setText(cliente.getTelefone());
            Print_EstadoCivil.setText(cliente.getEstadoCivil());
            
            Print_Endereco.setText(cliente.getEnderecoCli().getLogradouro());
            Print_Bairro.setText(cliente.getEnderecoCli().getBairro());
            Print_Complemento.setText(cliente.getEnderecoCli().getComplemento());
            Print_Cidade.setText(cliente.getEnderecoCli().getCidade());
            Print_CEP.setText(cliente.getEnderecoCli().getCep());
            Print_Estado.setText(cliente.getEnderecoCli().getEstado());
            System.out.println(cliente.getEnderecoCli().getCep());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }
    }//GEN-LAST:event_jbt_CpfActionPerformed

    private void Buscar_ImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar_ImovelActionPerformed
        
        int numero_imovel = Integer.parseInt(jftf_Imovel.getText());
        DefaultTableModel modelo = (DefaultTableModel) jTabela_Imovel.getModel();
        Imovel imovel = FormPrincipal.daoImovel.buscarImovel(numero_imovel);
        System.out.println(imovel);
        Object[] dados = {imovel.getNome(),imovel.getTipoDoImovel(),imovel.getAndar()};
        System.out.println(dados[0]);
        modelo.addRow(dados);
        
        
        
    }//GEN-LAST:event_Buscar_ImovelActionPerformed

    private void jb_PagamentoDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_PagamentoDinheiroActionPerformed
            
            System.out.println(jftf_CPF.getText());
        
            Aluguel aluguel = new Aluguel();
            int indiceLinha =  jTabela_Imovel.getSelectedRow();
            //aluguel.getClineteAlu().setCpf(jftf_CPF.getText());    
            //aluguel.getClineteAlu().setNome(Print_Nome.getText());
            //aluguel.getClineteAlu().setTelefone(Print_Telefone.getText());
            //aluguel.getClineteAlu().setEstadoCivil(Print_EstadoCivil.getText());
            
            aluguel.getEnderecoCli().setLogradouro(Print_Endereco.getText());
            aluguel.getEnderecoCli().setBairro(Print_Bairro.getText());
            aluguel.getEnderecoCli().setComplemento(Print_Complemento.getText());
            aluguel.getEnderecoCli().setCidade(Print_Cidade.getText());
            aluguel.getEnderecoCli().setCep(Print_CEP.getText());
            aluguel.getEnderecoCli().setEstado(Print_Estado.getText());
            
            aluguel.getImovel().setNome((String) jTabela_Imovel.getValueAt(indiceLinha, 1));
            aluguel.getImovel().setTipoDoImovel((String) jTabela_Imovel.getValueAt(indiceLinha, 2));
            aluguel.setValorAlugel((float) jTabela_Imovel.getValueAt(indiceLinha, 3));
            FormPrincipal.daoAluguel.inserirAluguel(aluguel);
            JOptionPane.showMessageDialog(null, "Aluguel registrado com sucesso!");
            //this.limpar();
            List<Aluguel> alu = FormPrincipal.daoAluguel.todosAluguels();
            System.out.println(alu);
    }//GEN-LAST:event_jb_PagamentoDinheiroActionPerformed

    private void jftf_ImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftf_ImovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftf_ImovelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar_Imovel;
    private javax.swing.JLabel Print_Bairro;
    private javax.swing.JLabel Print_CEP;
    private javax.swing.JLabel Print_Cidade;
    private javax.swing.JLabel Print_Complemento;
    private javax.swing.JLabel Print_Endereco;
    private javax.swing.JLabel Print_Estado;
    private javax.swing.JLabel Print_EstadoCivil;
    private javax.swing.JLabel Print_Nome;
    private javax.swing.JLabel Print_Telefone;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela_Imovel;
    private javax.swing.JLabel jb_Nome;
    private javax.swing.JButton jb_PagamentoDinheiro;
    private javax.swing.JButton jbt_Cpf;
    private javax.swing.JFormattedTextField jftf_CPF;
    private javax.swing.JFormattedTextField jftf_Imovel;
    private javax.swing.JLabel jl_Bairro;
    private javax.swing.JLabel jl_CPF;
    private javax.swing.JLabel jl_Complemento;
    private javax.swing.JLabel jl_Endereco;
    private javax.swing.JLabel jl_Estado;
    private javax.swing.JLabel jl_EstadoCivil;
    private javax.swing.JLabel jl_Telefone;
    private javax.swing.JMenuItem jmi_CadastraCliente;
    private javax.swing.JMenuItem jmi_novoAluguel;
    // End of variables declaration//GEN-END:variables
}
