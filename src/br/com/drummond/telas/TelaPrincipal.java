/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.drummond.telas;

import br.com.drummond.dal.ModuloConexao;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Miticos
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Connection conexao = null;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenCad = new javax.swing.JMenu();
        MenInsc = new javax.swing.JMenuItem();
        ManRelatorio = new javax.swing.JMenu();
        MenInscricoes = new javax.swing.JMenuItem();
        MenSobre = new javax.swing.JMenu();
        MenCursos = new javax.swing.JMenuItem();
        MenLocal = new javax.swing.JMenuItem();
        MenOpcoes = new javax.swing.JMenu();
        MenLogin = new javax.swing.JMenuItem();
        MenSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/drummond/icones/logo (1).png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario.setText("Funcionário");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblData.setText("Data");

        MenCad.setText("Cadastro");

        MenInsc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        MenInsc.setText("Inscrição");
        MenInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenInscActionPerformed(evt);
            }
        });
        MenCad.add(MenInsc);

        Menu.add(MenCad);

        ManRelatorio.setText("Relatorio");
        ManRelatorio.setEnabled(false);

        MenInscricoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        MenInscricoes.setText("Inscrições");
        MenInscricoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenInscricoesActionPerformed(evt);
            }
        });
        ManRelatorio.add(MenInscricoes);

        Menu.add(ManRelatorio);

        MenSobre.setText("Sobre");

        MenCursos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        MenCursos.setText("Cursos");
        MenCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenCursosActionPerformed(evt);
            }
        });
        MenSobre.add(MenCursos);

        MenLocal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        MenLocal.setText("Info");
        MenLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenLocalActionPerformed(evt);
            }
        });
        MenSobre.add(MenLocal);

        Menu.add(MenSobre);

        MenOpcoes.setText("Opções");

        MenLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        MenLogin.setText("Login");
        MenLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenLoginActionPerformed(evt);
            }
        });
        MenOpcoes.add(MenLogin);

        MenSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        MenSair.setText("Sair");
        MenSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenSairActionPerformed(evt);
            }
        });
        MenOpcoes.add(MenSair);

        Menu.add(MenOpcoes);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblData)
                            .addComponent(lblUsuario))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblUsuario)
                .addGap(31, 31, 31)
                .addComponent(lblData)
                .addGap(141, 141, 141)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Desktop)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1095, 585));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // as linhas baixo substituem a label data pela data do sistema KAKAKAPPA
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void MenSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenSairActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Sair?","Atenção",JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_MenSairActionPerformed

    private void MenLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenLoginActionPerformed
        // TODO add your handling code here:
        TelaLogin logar = new TelaLogin();
        logar.setVisible(true);
    }//GEN-LAST:event_MenLoginActionPerformed

    private void MenLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenLocalActionPerformed
       // TODO add your handling code here:
        Sobre local = new Sobre();
        local.setVisible(true);
        Desktop.add(local);
    }//GEN-LAST:event_MenLocalActionPerformed

    private void MenInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenInscActionPerformed
        // TODO add your handling code here:
        TelaInscricao inscrever = new TelaInscricao();
        inscrever.setVisible(true);
        Desktop.add(inscrever);
        
    }//GEN-LAST:event_MenInscActionPerformed

    private void MenInscricoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenInscricoesActionPerformed
        // TODO add your handling code here:
        int confirma = JOptionPane.showConfirmDialog(null, "confirma a impressão deste relatório?","Atenção",JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION)
        {
        //imprimindo o relatorio jasperreports
            try {
                JasperPrint print = JasperFillManager.fillReport("C:/Users/Miticos/JaspersoftWorkspace/MyReports/relatorio.jasper",null,conexao);
                
                //exibe o relatorio atravez do jasper
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        
    }//GEN-LAST:event_MenInscricoesActionPerformed

    private void MenCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenCursosActionPerformed
        // TODO add your handling code here:
        Cursos curso = new Cursos();
        curso.setVisible(true);
        Desktop.add(curso);
    }//GEN-LAST:event_MenCursosActionPerformed
//
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);               
                //TelaInscricao inscrever2 = new TelaInscricao();
                //inscrever2.setVisible(true);
                //Desktop.add(inscrever2);
                TelaInscricao inscrever2 = new TelaInscricao();
                inscrever2.setVisible(true);
                Desktop.add(inscrever2);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Desktop;
    public static javax.swing.JMenu ManRelatorio;
    private javax.swing.JMenu MenCad;
    private javax.swing.JMenuItem MenCursos;
    private javax.swing.JMenuItem MenInsc;
    private javax.swing.JMenuItem MenInscricoes;
    private javax.swing.JMenuItem MenLocal;
    private javax.swing.JMenuItem MenLogin;
    private javax.swing.JMenu MenOpcoes;
    private javax.swing.JMenuItem MenSair;
    private javax.swing.JMenu MenSobre;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}