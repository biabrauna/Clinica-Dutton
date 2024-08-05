
package br.com.clinicah.view;

import br.com.clinicah.model.Cliente;
import br.com.clinicah.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class CadastroMed extends javax.swing.JFrame {

    public CadastroMed() throws SQLException, SQLException, SQLException {
        initComponents();
        
            //panelBotoesAcao.setEnabled(false);
            carregarDadosTabela();
            limparCampos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNome2 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEspec = new javax.swing.JTextPane();
        btnSalvar2 = new javax.swing.JButton();
        txtCdM = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelacadmed = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Cadastro do Médico");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setText("Especialidade:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel5.setText("Código do Médico:");

        jScrollPane1.setViewportView(txtNome2);

        jScrollPane2.setViewportView(txtEmail);

        jScrollPane3.setViewportView(txtEspec);

        btnSalvar2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnSalvar2.setText("Salvar");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        txtCdM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCdMActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.jpg"))); // NOI18N

        tabelacadmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Email", "Especialidade", "CRM"
            }
        ));
        tabelacadmed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelacadmedMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelacadmed);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane3)
                                    .addComponent(txtCdM, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCdM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
         boolean ok;
      ok = salvar();
      if(ok)
          JOptionPane.showMessageDialog(null,"Médico salvo com sucesso");
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void txtCdMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCdMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCdMActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
    AtualizarDados();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tabelacadmedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelacadmedMouseClicked
        // registra as informaçõe sna tabela
        ListSelectionModel tableSelecionModel = tabelacadmed.getSelectionModel();
        //refresh - limpeza da cache da tabela
        tabelacadmed.setSelectionModel(tableSelecionModel);
        //armazena a linha seleciona 
        this.txtNome2.setText(tabelacadmed.getValueAt(tabelacadmed.getSelectedRow(), 1).toString());
        this.txtEmail.setText(tabelacadmed.getValueAt(tabelacadmed.getSelectedRow(), 1).toString());
        this.txtEspec.setText(tabelacadmed.getValueAt(tabelacadmed.getSelectedRow(), 2).toString());
        this.txtCdM.setText(tabelacadmed.getValueAt(tabelacadmed.getSelectedRow(), 2).toString());
       
        
        
       btnSalvar.setEnabled(false);
       btnAtualizar.setEnabled(true);
       btnNovo.setEnabled(false);
       btnExcluir.setEnabled(true);

    }//GEN-LAST:event_tabelacadmedMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(tabelacadmed.getSelectedRow()==-1){
           if(tabelacadmed.getRowCount()==0){
               JOptionPane.showMessageDialog(null, "A tabela está vazia");
           }else{
               JOptionPane.showMessageDialog(null, "Deve ser selecionado uma linha");
           }
       }else{
           
    
       excluirDados();
       
       limparCampos();
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroMed().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroMed.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelacadmed;
    private javax.swing.JPasswordField txtCdM;
    private javax.swing.JTextPane txtEmail;
    private javax.swing.JTextPane txtEspec;
    private javax.swing.JTextPane txtNome2;
    // End of variables declaration//GEN-END:variables

    private boolean salvar(){
    PreparedStatement ps;
    String nome2 = txtNome2.getText();
    String email = txtEmail.getText();
    String especialidade = txtEspec.getText();
    String codigo = txtCdM.getText();
    String sql = "INSERT INTO CadastroMed (nome, email, especializacao, crm) VALUES (?, ?, ?, ?)";
    
    Connection conn = Conexao.getConexao();
    
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, nome2);
            ps.setString(2, email);
            ps.setString(3, especialidade);
            ps.setString(4, codigo);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroMed.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                conn.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    return false;
} 

    private void limparCampos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        private String email;
        private DefaultTableModel model;
        private int codigo;
        private String nomeMed;
        private String especialidade;

        
        //variaveis em tempo de execuçao
        
        
    

    /**
     *
     */
//    public CadastroMed(){
//      initComponents();
//        
//        try {
//            carregarDadosTabela();
//        } catch (SQLException ex) {
//            Logger.getLogger(CadastroMed.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        limparCampos();
//    }
    private void carregarDadosTabela() throws SQLException{
            String sql = "select cli_cod, nome, email, especializacao, crm from CadastroMed order by cli_cod";
            
            
            
                Connection conn = Conexao.getConexao();
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ResultSet rs = ps.executeQuery();
                
                model = (DefaultTableModel)tabelacadmed.getModel();
           
               while(rs.next()){
                   Integer rsCodigo = rs.getInt("cli_cod");
                   String rsNome = rs.getString("nome");
                   String rsEmail = rs.getString("email");
                   String rsEspecialidade = rs.getString("especializacao");
                   String rsCrm = rs.getString("crm");
                   
                
                   model.addRow(new Object[]{rsCodigo,rsNome,rsEmail,rsEspecialidade,rsCrm});
                   
               }   
        
        }
    
    private void fecharCampos(){
        txtNome2.setEnabled(false);
        txtEmail.setEnabled(false);
        txtEspec.setEnabled(false);
        txtCdM.setEnabled(false);
    }

    private void AtualizarDados() {
        
        String nome2 = txtNome2.getText();
        String email = txtEmail.getText();
        String especialidade = txtEspec.getText();
        //String codigo = txtCdM.getText();
    
        Cliente cliente = new Cliente();
        //cliente.setCodigo(codigo);
        cliente.setNome(nome2);
        cliente.setEspecialidade(especialidade);
        cliente.setEmail(email);
        ClienteDao cli = new ClienteDao();
        
        cli.atualizar(cliente);
    }

    private void excluirDados() {
       
        String msg = "Deletar o médico: "+getNome() +"?";
        
        int opcaoEscolhida = JOptionPane.showConfirmDialog(null, msg, "Exclusão", JOptionPane.YES_NO_OPTION);
        if(opcaoEscolhida == JOptionPane.YES_OPTION){
            PreparedStatement ps = null;
            
            String sql = "DELETE FROM CadastroMed WHERE cli_cod = ?";
            Connection conn = Conexao.getConexao();
            
            try{
                
                ps = conn.prepareStatement(sql);
                ps.setInt(1, getCodigo());
                ps.executeUpdate();
                
                model.removeRow(tabelacadmed.getSelectedRow());
                
                JOptionPane.showMessageDialog(null," O cliente " + getNome()+ "foi excluído com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }
            catch (SQLException e){
                e.printStackTrace();
                
            }finally{
                try{
                    Conexao.closeConnection(conn,ps);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    private int getCodigo() {
        return this.codigo;
    }

    private String getNome() {
      return this.nomeMed;
    }

        
    }
  

