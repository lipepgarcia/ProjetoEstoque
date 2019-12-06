package View;

import Connection.Conexao;
import Control.FornecedorControl;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaFornecedor extends javax.swing.JFrame {
    FornecedorControl control;

    public TelaFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // instancia o controle
        control  = new FornecedorControl(this);
        // exibir a lista na tabela
        exibirNaTab(control.selecionarTodos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fcod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fcnp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fnom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fend = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fnum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fbai = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fcom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fcep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ftel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btIncluir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ftab = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));

        fcod.setEditable(false);
        fcod.setBackground(new java.awt.Color(204, 204, 204));
        fcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcodActionPerformed(evt);
            }
        });

        jLabel1.setText("CODIGO");

        fcnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcnpActionPerformed(evt);
            }
        });

        jLabel2.setText("CNPJ");

        fnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnomActionPerformed(evt);
            }
        });

        jLabel3.setText("NOME");

        fend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fendActionPerformed(evt);
            }
        });

        jLabel4.setText("ENDEREÇO");

        fnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnumActionPerformed(evt);
            }
        });

        jLabel5.setText("NÚMERO");

        fbai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbaiActionPerformed(evt);
            }
        });

        jLabel6.setText("BAIRRO");

        fcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcomActionPerformed(evt);
            }
        });

        jLabel7.setText("COMPLEMENTO");

        fcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcepActionPerformed(evt);
            }
        });

        jLabel8.setText("CEP");

        ftel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftelActionPerformed(evt);
            }
        });

        jLabel9.setText("TELEFONE");

        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDeletarActionPerformed(evt);
            }
        });

        jButton4.setText("Alterar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eAtualizarActionPerformed(evt);
            }
        });

        ftab.setBorder(new javax.swing.border.MatteBorder(null));
        ftab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "CNPJ", "NOME", "ENDEREÇO", "NÚMERO", "COMPLEMENTO", "BAIRRO", "CEP", "TELEFONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ftab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ftabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ftab);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fcod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnom, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)
                                        .addGap(216, 216, 216))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ftel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(fcnp, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(fend, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fcom, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fbai, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(39, 39, 39)
                                .addComponent(fcep, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 391, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(fnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(fcnp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(fbai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ftel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btIncluir)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel10)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fcnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcnpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcnpActionPerformed

    private void fnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnomActionPerformed

    private void fendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fendActionPerformed

    private void fnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnumActionPerformed

    private void fbaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fbaiActionPerformed

    private void fcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcomActionPerformed

    private void fcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcepActionPerformed

    private void ftelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftelActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
                
        if(control.inserir()){
            // axibir mensagem
            JOptionPane.showMessageDialog(this, "Inserção Realizada com Sucesso!");
            
            // exibir a lista na tabela
            exibirNaTab(control.selecionarTodos());
        }
        else{
            JOptionPane.showMessageDialog(this, "Falha Inserção");
        }
        
    }//GEN-LAST:event_btIncluirActionPerformed

    private void eDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDeletarActionPerformed
        if(!"".equals(fcod.getText())){
            if(JOptionPane.showConfirmDialog(this, "Deseja Excluir esse Fornecedor?") == 0){
                if(control.deletar()){
                    exibirNaTab(control.selecionarTodos());
                    limparForm();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Falha ao Excluir Fornecedor");
                }
            }
        }
        else JOptionPane.showMessageDialog(this, "Selecione um Fornecedor na Tabela");
    }//GEN-LAST:event_eDeletarActionPerformed

    private void ftabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ftabMouseClicked
      selecionarDaTab();
    }//GEN-LAST:event_ftabMouseClicked

    private void eAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eAtualizarActionPerformed
        if(!"".equals(fcod.getText()) ){
            if(control.atualizar()){
                exibirNaTab(control.selecionarTodos());
                limparForm();
                JOptionPane.showMessageDialog(this, "Dado Atualizado");
            }
            else{
                JOptionPane.showMessageDialog(this, "Falha na Ateração");
            }
            
        }
        else JOptionPane.showMessageDialog(this, "Selecione um Fornecedor na Tabela");


    }//GEN-LAST:event_eAtualizarActionPerformed

    private void fcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fcodActionPerformed

    // METODOS
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
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedor().setVisible(true);
            }
        });
    }
    
    // le os dados do formulario e retorna um objeto Fornecedor
    public Fornecedor lerForm(){
        Fornecedor f = new Fornecedor();
        f.setCod( Integer.valueOf("0" +fcod.getText()) );
        f.setCnpj(fcnp.getText() );
        f.setNome(fnom.getText() );
        f.setEndereco( fend.getText() );
        f.setNum( fnum.getText() );
        f.setComplemento( fcom.getText() );
        f.setBairro( fbai.getText() );
        f.setCep( fcep.getText() );
        f.setFone( ftel.getText() );
        
        return f;
    }
    
    // exibe um dado objeto Fornecedor no formulario
    public void exibirNoForm(Fornecedor f){
        fcod.setText( Integer.toString(f.getCod()) );
        fcnp.setText( f.getCnpj() );
        fnom.setText( f.getNome() );
        fend.setText( f.getEndereco() );
        fnum.setText( f.getNum() );
        fcom.setText( f.getComplemento() );
        fbai.setText( f.getBairro() );
        fcep.setText( f.getCep() );
        ftel.setText( f.getFone() );
    }

    // exibe uma dada lista de objetos Fornecedor na tabela
    public void exibirNaTab(List<Fornecedor> l){
        DefaultTableModel tabMod = (DefaultTableModel) ftab.getModel();
        tabMod.setRowCount(0);
        
        for(Fornecedor f : l){
            String[] row = new String[9];  
            row[0] = (String.valueOf(f.getCod()));
            row[1] = f.getCnpj();
            row[2] = f.getNome();
            row[3] = f.getEndereco();
            row[4] = f.getNum();
            row[5] = f.getComplemento();
            row[6] = f.getBairro();
            row[7] = f.getCep();
            row[8] = f.getFone();
            
            tabMod.addRow(row);
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluir;
    private javax.swing.JTextField fbai;
    private javax.swing.JTextField fcep;
    private javax.swing.JTextField fcnp;
    private javax.swing.JTextField fcod;
    private javax.swing.JTextField fcom;
    private javax.swing.JTextField fend;
    private javax.swing.JTextField fnom;
    private javax.swing.JTextField fnum;
    private javax.swing.JTable ftab;
    private javax.swing.JTextField ftel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void limparForm() {
        fcod.setText( "" );
        fcnp.setText( "" );
        fnom.setText( "" );
        fend.setText( "" );
        fnum.setText( "" );
        fbai.setText("");
        fcom.setText("");
        fcep.setText("");
        ftel.setText("");
    }

    private void selecionarDaTab() {
        int linha = ftab.getSelectedRow();
        fcod.setText(ftab.getModel().getValueAt(linha, 0).toString());
        fcnp.setText(ftab.getModel().getValueAt(linha, 1).toString());
        fnom.setText(ftab.getModel().getValueAt(linha, 2).toString());
        fend.setText(ftab.getModel().getValueAt(linha, 3).toString());
        fnum.setText(ftab.getModel().getValueAt(linha, 4).toString());
        fbai.setText(ftab.getModel().getValueAt(linha, 5).toString());
        fcom.setText(ftab.getModel().getValueAt(linha, 6).toString());
        fcep.setText(ftab.getModel().getValueAt(linha, 7).toString());
        ftel.setText(ftab.getModel().getValueAt(linha, 8).toString());
    }
}
