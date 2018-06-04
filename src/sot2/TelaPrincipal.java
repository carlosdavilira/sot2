
package sot2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Carlos David
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ArrayList<Processo> listProcessos;
    ArrayList<Recurso> listRecursos;
    private int posicaoInicialX = 330;
    private int posicaoInicialY = 100;
    private int posicaoInicialXQuadrado = 330;
    private int posicaoInicialYQuadrado = 350;
    private int[] cores =  {224,7,46}; //RED GREEN BLUE
    private final  ArrayList<Cores> listaCores = new Cores().getPalletacores();
    private int indiceCor = 0;
    
    
    public TelaPrincipal() {
        initComponents();
        listProcessos = new ArrayList<Processo>();
        listRecursos = new ArrayList<Recurso>();
     }
    public void ChamarTelaPrincipal(){
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    this.setPreferredSize(d);  
        
        this.setVisible(true);
       
    }
    
    public void DesenharQuadrado(int x, int y){
        this.getGraphics().drawRect(x, y, 30, 30);    
    };
    public void DesenharQuadrado(int x, int y, int[] cor){
        this.getGraphics().setColor(new Color(cor[0], cor[1], cor[2]));
        this.getGraphics().fillRect(x, y, 30, 30);    
    };    
     public void DesenharCirculo(int x, int y, int cor[]){
        Graphics g = this.getGraphics();
        g.getColor();
        g.setColor(new Color(cor[0],cor[1],cor[2]));        
        
        //g.setColor(Color.yellow); 
        g.fillOval(x, y, 30, 30);    
    };
    public void DesenharReta(int xInicial, int yInicial,int xFinal,int yFinal){
     this.getGraphics().drawLine(xInicial, yInicial, xFinal, yFinal);
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeRecurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idRecurso = new javax.swing.JTextField();
        btnCriarRecurso = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeProcesso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        deltaTS = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        deltaTu = new javax.swing.JTextField();
        btnCriarProcesso = new javax.swing.JButton();
        btnDeletarProcesso = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        deltaTSO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoLog = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextoProcessos = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 768));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Recurso");

        jLabel3.setText("Nome");

        jLabel4.setText("ID");

        btnCriarRecurso.setText("Criar");
        btnCriarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarRecursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeRecurso)
                            .addComponent(idRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(btnCriarRecurso)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(idRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCriarRecurso)
                        .addGap(29, 29, 29))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Processo");

        jLabel5.setText("ID");

        jLabel6.setText("ΔTs");

        jLabel7.setText("ΔTu");

        btnCriarProcesso.setText("Criar");
        btnCriarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarProcessoActionPerformed(evt);
            }
        });

        btnDeletarProcesso.setText("Deletar");
        btnDeletarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProcessoActionPerformed(evt);
            }
        });

        jButton1.setText("Criar e Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deltaTS)
                            .addComponent(nomeProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deltaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCriarProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(btnDeletarProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nomeProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCriarProcesso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(deltaTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarProcesso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(deltaTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        btnIniciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("ΔT");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("SO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deltaTSO)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel9)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(deltaTSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel10.setText("Log:");

        areaTextoLog.setEditable(false);
        areaTextoLog.setColumns(20);
        areaTextoLog.setRows(5);
        jScrollPane1.setViewportView(areaTextoLog);

        jLabel11.setText("Recursos e Processos:");

        areaTextoProcessos.setEditable(false);
        areaTextoProcessos.setBackground(new java.awt.Color(204, 204, 204));
        areaTextoProcessos.setColumns(20);
        areaTextoProcessos.setRows(5);
        jScrollPane2.setViewportView(areaTextoProcessos);

        jButton2.setText("Desenhar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addContainerGap(445, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(474, 474, 474))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarProcessoActionPerformed
         if(listProcessos.size() < 10){
            Processo novo = new Processo();
            novo.setId(Integer.parseInt(nomeProcesso.getText()));
            novo.setDeltaTs(Integer.parseInt(deltaTS.getText()));
            novo.setDeltaTu(Integer.parseInt(deltaTu.getText()));
            this.posicaoInicialX = this.posicaoInicialX +70;
            novo.setX(this.posicaoInicialX);
            novo.setY(this.posicaoInicialY);
            //cores[0] = cores[0]+1;
            //cores[1] = cores[1]+20;
            //cores[2] = cores[2]+15;
            //novo.setCor(cores);
            if(indiceCor == 10)
                indiceCor = 0;            
            novo.setCor((listaCores.get(indiceCor).red),(listaCores.get(indiceCor).green),(listaCores.get(indiceCor).blue));
            listProcessos.add(novo);
            areaTextoLog.setText(areaTextoLog.getText()+"\n"+"Processo: "+novo.getId()+" - Δtu: "+novo.getDeltaTu()+" - Δts: "+novo.getDeltaTs()+" criado.");
            CarregarAreaTextoProcessosRecursos();
            
            indiceCor = indiceCor+1;
            //Desenhar            
            DesenharCirculo(novo.getX(), novo.getY(),novo.getCor());
            LimparCampos();

        }
        else
            JOptionPane.showMessageDialog(null, "Não é possível criar mais processos, pois a quantidade máxima é 10.");

    }//GEN-LAST:event_btnCriarProcessoActionPerformed

    private void btnCriarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarRecursoActionPerformed
        if(listRecursos.size() < 10){
            Recurso novo = new Recurso();
            novo.setId(Integer.parseInt(idRecurso.getText()));
            novo.setNomeRecurso(nomeRecurso.getText());
            this.posicaoInicialXQuadrado = this.posicaoInicialXQuadrado +70;
            novo.setX(this.posicaoInicialXQuadrado);
            novo.setY(this.posicaoInicialYQuadrado);
            listRecursos.add(novo);
            areaTextoLog.setText(areaTextoLog.getText()+"\n"+"Recurso: "+novo.getNomeRecurso() + " ID:"+novo.getId()+ " criado.");
            //JOptionPane.showMessageDialog(null, "Recurso Criado com sucesso!");
            CarregarAreaTextoProcessosRecursos();
            //Desenhar
            DesenharQuadrado(novo.getX(), novo.getY());
            LimparCampos();

        }
        else
            JOptionPane.showMessageDialog(null, "Não é possível criar mais recursos, pois a quantidade máxima é 10.");
    }//GEN-LAST:event_btnCriarRecursoActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        //DesenharQuadrado(100,200);
       // DesenharCirculo(100,200);
       
        
    }//GEN-LAST:event_btnIniciarActionPerformed
    public void CarregarAreaTextoProcessosRecursos(){
        areaTextoProcessos.setText("");
        for(Recurso recurso : listRecursos){
            areaTextoProcessos.setText(areaTextoProcessos.getText() + "\n" + "Recurso: "+recurso.getNomeRecurso()+" ID:" + recurso.getId());
        }
        for(Processo processo : listProcessos){
            areaTextoProcessos.setText(areaTextoProcessos.getText() + "\n" + "Processo: "+processo.getId()+" - Δtu:"+ processo.getDeltaTu()+" - Δtu:"+processo.getDeltaTs());
        }
    }
    private void btnDeletarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarProcessoActionPerformed
       Integer indice = null;
        for(int i = 0; i < listProcessos.size();i++){
            if(listProcessos.get(i).getId().equals(Integer.parseInt(nomeProcesso.getText())))
                indice = i;
        }
        int dialogResult = JOptionPane.showConfirmDialog (null, "Confirma a exclusão do Processo;"+nomeProcesso.getText()+" ?","Warning",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
          listProcessos.remove(indice.intValue());
          JOptionPane.showMessageDialog(null, "Processo excluído!");
          CarregarAreaTextoProcessosRecursos();

        }else
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        
    }//GEN-LAST:event_btnDeletarProcessoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       /*this.DesenharCirculo(400, 100);
       this.DesenharCirculo(470, 100);
       this.DesenharCirculo(540, 100);
       this.DesenharCirculo(610, 100);
       this.DesenharCirculo(680, 100);
       this.DesenharCirculo(750, 100);
       this.DesenharCirculo(820, 100);
       this.DesenharCirculo(890, 100);
       this.DesenharCirculo(960, 100);
       this.DesenharCirculo(1030, 100); */
       
       
       
      this.DesenharQuadrado(400, 300);
       this.DesenharQuadrado(470, 300);
       this.DesenharQuadrado(540, 300);
       this.DesenharQuadrado(610, 300);
       this.DesenharQuadrado(680, 300);
       this.DesenharQuadrado(750, 300);
       this.DesenharQuadrado(820, 300);
       this.DesenharQuadrado(890, 300);
       this.DesenharQuadrado(960, 300);
       this.DesenharQuadrado(1030, 300);
       
       this.DesenharReta(415, 115,415,300);
       this.DesenharReta(415, 115,485,300);
       this.DesenharReta(415, 115,1045,300);
       this.DesenharReta(1045, 115,415,300);
    }//GEN-LAST:event_jButton2ActionPerformed
    public void LimparCampos(){
        //Recursos
        nomeRecurso.setText("");
        idRecurso.setText("");
        //Processos
        nomeProcesso.setText("");
        deltaTS.setText("");
        deltaTu.setText("");
        //SO
        deltaTu.setText("");
        
    }
   
    public static void main(String args[]) {
       
   /*     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        }); */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoLog;
    private javax.swing.JTextArea areaTextoProcessos;
    private javax.swing.JButton btnCriarProcesso;
    private javax.swing.JButton btnCriarRecurso;
    private javax.swing.JButton btnDeletarProcesso;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JTextField deltaTS;
    private javax.swing.JTextField deltaTSO;
    private javax.swing.JTextField deltaTu;
    private javax.swing.JTextField idRecurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeProcesso;
    private javax.swing.JTextField nomeRecurso;
    // End of variables declaration//GEN-END:variables
}
