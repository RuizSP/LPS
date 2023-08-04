
package view;

import java.util.ArrayList;
import java.util.List;
import model.Disciplina;
import view.dialogs.DlgDisciplina;

/**
 *
 * @author jose
 */
public class FrHome extends javax.swing.JFrame {
    List<Disciplina> listaDisciplinas;
    /**
     * Creates new form FrHome
     */
    public FrHome() {
        initComponents();
        listaDisciplinas = new ArrayList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnCadProfessor = new javax.swing.JButton();
        btnCadAluno1 = new javax.swing.JButton();
        btnCadDisciplina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Fira Sans", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Projeto Escola");

        btnCadProfessor.setText("Cadastro de Professor");
        btnCadProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadProfessorActionPerformed(evt);
            }
        });

        btnCadAluno1.setText("Cadastro de Alunos");
        btnCadAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAluno1ActionPerformed(evt);
            }
        });

        btnCadDisciplina.setText("Cadastro de Disciplina");
        btnCadDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(btnCadProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadAluno1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnCadAluno1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadProfessorActionPerformed
        FrProfessor dlgCadProfessor = new FrProfessor(this, true);
        
        // Configura o posicionamento relativo, faz o dialgo aparecer na mesma tela que o pai(qdo estamos mais de uma tela)
        dlgCadProfessor.setLocationRelativeTo(this);
        dlgCadProfessor.setVisible(true);
    }//GEN-LAST:event_btnCadProfessorActionPerformed

    private void btnCadDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadDisciplinaActionPerformed
        Disciplina novaDisciplina = new Disciplina();
        DlgDisciplina telaDisciplinas = new DlgDisciplina(this, true, novaDisciplina, listaDisciplinas);
        telaDisciplinas.setVisible(true);       
        
        /*if(novaDisciplina != null){
            listaDisciplinas.add(novaDisciplina);        
        }*/
        
        for(int i =0;i<listaDisciplinas.size();i++){
            System.out.println(listaDisciplinas.get(i).toString());
        }
        
        
    }//GEN-LAST:event_btnCadDisciplinaActionPerformed

    private void btnCadAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAluno1ActionPerformed
        FrAluno dlgCadAluno = new FrAluno(this, true);
        
        // Configura o posicionamento relativo, faz o dialgo aparecer na mesma tela que o pai(qdo estamos mais de uma tela)
        dlgCadAluno.setLocationRelativeTo(this);
        dlgCadAluno.setVisible(true);
    }//GEN-LAST:event_btnCadAluno1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadAluno1;
    private javax.swing.JButton btnCadDisciplina;
    private javax.swing.JButton btnCadProfessor;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
