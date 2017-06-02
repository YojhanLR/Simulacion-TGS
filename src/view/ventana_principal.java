/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Variable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Yojhan
 */
public class ventana_principal extends javax.swing.JFrame {

    /**
     * Creates new form ventana_principal
     */
    
    private DefaultTableModel dtm; //Definicion modelo de tabla para manipulación
    private DefaultTableModel dtmYear;
    private DefaultListModel<String> dlmDisp;
    private DefaultListModel<String> dlmSelec;
    private String[] String_variables;
    private ArrayList<Integer> idsSelected;
//    private String[] items_disponibles;
//    private String[] items_seleccionados;
    
    private ArrayList<Variable> List_variables;
    
    public ventana_principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        idsSelected = new ArrayList();
        List_variables = new ArrayList(); 
        dlmDisp = new DefaultListModel();
        dlmSelec =  new DefaultListModel();
        dtm = new DefaultTableModel(new String[] {},0);
        dtmYear = new DefaultTableModel(new String[]{"Años"},0);
        
        tableMain.setModel(dtm);
        tableYear.setModel(dtmYear);
        tableMain.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        createVariables();
        
        jList_disponible.setModel(dlmDisp);
        jList_seleccionado.setModel(dlmSelec);
        
        valoresPorDefecto();
    }
    
    private void createVariables(){
        String_variables = new String[] {"Cantidad Defunciones","Cantidad Personal Médico","Discapacitados Atentidos",
            "Disp. Empleo Accesible","Empleo Accesible","Instituciones Accesibles","Población Participando Com.","Total Población",
        "Total Pobl. Discapacitada","Defunciones","Defunciones disc.","Defunciones médicos","Desarrollo Empleo Accesible",
        "Desarrollo Instituciones Accesibles","Empleo Generado","Nacimientos","Nuevos Integrantes Com.","Personas con Discapacidad",
        "Personas recuperadas","Población empleada disc","Profesionales","Retiro Miembros","Salud","Sobredemanda","Demanda Personal médico","Indice Calidad de Vida"
        ,"Interés Sociedad","Necesidad Atención","Nivel Bienestar Educativo","Nivel Bienestar Emocional","Nivel Bienestar Fisico","Nivel Bienestar Social"
        ,"Nivel Necesidad Material","Porcentaje Eficiencia Metodos","Porcentaje Estatus Socioeconómico","Porcentaje Profesionales Salud","Promedio Amistad","Tasa Calidad Educacion",
        "Tasa Defunciones","Tasa defuncion disc","Tasa defuncion med","Tasa desarrollo","Tasa Ambiente Laboral","Tasa Nacimiento Discapacidad","Tasa personas adquieren disc",
        "Tasa calidad relaciones","Tasa empleados disc", "Tasa Naciemientos sin discapacidad"};
        
        //Comienza a crear las variables y las añade al ArrayList
        int i=0;
        for (String sv : String_variables) {
            String descripcion = sv;
            Variable v = new Variable(descripcion,i);
            List_variables.add(v);
            i++;
        }
        //Imprime las variables
        for(Variable temp: List_variables){
            System.out.println(temp.getId()+"\t"+temp.getDescripcion());
            dlmDisp.addElement(temp.getDescripcion());
        }
    }
    
    private void valoresPorDefecto(){
        
        for (Variable v: List_variables){
            
            switch(v.getId()){
                case 0: v.setValor(0); break; //Cantidad Defunciones
                case 1: v.setValor(118); break; //Cantidad Personal Médico
                case 2: v.setValor(20); break;//Discapacitados Atentidos
                case 3: v.setValor(100); break;//Disp. Empleo Accesible
                case 4: v.setValor(150); break;//Empleo Accesible
                case 5: v.setValor(15); break;//Instituciones Accesibles
                case 6: v.setValor(30); break; //Población Participando Com.
                case 7: v.setValor(100000); break;//Total Población
                case 8: v.setValor(1000); break;//Total Pobl. Discapacitada
                case 24: v.setValor(0.5); break;//Demanda Personal médico
                case 26: v.setValor(0.5); break;//Demanda Personal médico
                case 27: v.setValor(0.5); break;//Necesidad Atención
                case 33: v.setValor(0.7); break;//orcentaje Eficiencia Metodos
                case 36: v.setValor(3); break;//Promedio amistad
                case 37: v.setValor(0.5); break;//Tasa calidad educación
                case 38: v.setValor(0.0593); break;//Tasa defunciones
                case 39: v.setValor(0.0026); break;//Tasa defunciones disc
                case 40: v.setValor(0.0015); break;//Tasa defuncion med
                case 41: v.setValor(0.5); break;//Tasa desarrollo
                case 43: v.setValor(0.0002); break;//Tasa nacimiento con discapacidad
                case 44: v.setValor(0.0005); break;//Tasa personas adquieren discapacidad
                case 45: v.setValor(0.65); break;//Tasa calidad relaciones
                case 46: v.setValor(0.1); break;//Tasa empleados disc
                case 47: v.setValor(0.1548); break;//Tasa nacimiento sin discapacidad
            }
        }
        
//        Imprimir variables con valores
//        for(Variable temp: List_variables){
//            System.out.println(temp.getId()+"\t"+temp.getValor()+"\t"+temp.getDescripcion());
//            dlmDisp.addElement(temp.getDescripcion());
//        }
    }
    
//    private void beginListElement(int n, lista_variables.count() ){
//        for(int i=0; i<n; i++){
//        
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableYear = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMain = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Button_listRight = new javax.swing.JButton();
        Button_listLeft = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_seleccionado = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_disponible = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulación");
        setResizable(false);

        tableYear.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null} },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane2.setViewportView(tableYear);

        tableMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableMain);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Modificar Valores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Iniciar Simulación");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Button_listRight.setText(">>");
        Button_listRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_listRightActionPerformed(evt);
            }
        });

        Button_listLeft.setText("<<");
        Button_listLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_listLeftActionPerformed(evt);
            }
        });

        jLabel2.setText("Disponibles");

        jLabel3.setText("Seleccionados");

        jList_seleccionado.setToolTipText("");
        jScrollPane4.setViewportView(jList_seleccionado);

        jList_disponible.setToolTipText("");
        jScrollPane3.setViewportView(jList_disponible);

        jButton3.setText("Valores por defecto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_listRight)
                    .addComponent(Button_listLeft))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(181, 181, 181))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(Button_listRight)
                        .addGap(35, 35, 35)
                        .addComponent(Button_listLeft))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Simulación");

        jLabel4.setText("Yojhan Leonardo Rodríguez Ascencio - 20171678009");

        jLabel5.setText("Braian Estiven Alvarado Rodríguez     - 20171678025");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       crearTabla();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void crearTabla(){
        TableColumnModel columnModel = tableMain.getColumnModel();
        dtm = new DefaultTableModel(dlmSelec.toArray(),0);
        tableMain.setModel(dtm);
        System.out.println(Arrays.toString(dlmSelec.toArray())); 
        
        ArrayList <Variable> templist = List_variables;
        for(int i=0; i< dtm.getColumnCount(); i++){
            columnModel.getColumn(i).setPreferredWidth(200);
            for(Variable temp: templist){
                if(temp.getDescripcion().equals(tableMain.getColumnName(i))){
                    idsSelected.add(temp.getId());
                    break;
                }
            }
        }
        
//        System.out.println("-----------------------------");
//        for(Variable temp: List_variables){
//            System.out.println(temp.getId()+"\t"+temp.getDescripcion());
//            dlmDisp.addElement(temp.getDescripcion());
//        }
//        
//        for(Integer i : idsSelected){
//            System.out.println(i);
//        }
        
    }
    private void Button_listRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_listRightActionPerformed
      //Envia elementos de Disponibles a seleccionados
      for(String selectedValue: jList_disponible.getSelectedValuesList()){
          dlmSelec.addElement(selectedValue);
          dlmDisp.removeElement(selectedValue);
      }
    }//GEN-LAST:event_Button_listRightActionPerformed

    private void Button_listLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_listLeftActionPerformed
        //Envia elementos de seleccionados a Disponibles
      for(String selectedValue: jList_seleccionado.getSelectedValuesList()){
          dlmDisp.addElement(selectedValue);
          dlmSelec.removeElement(selectedValue);
      }
    }//GEN-LAST:event_Button_listLeftActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       valoresPorDefecto();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_listLeft;
    private javax.swing.JButton Button_listRight;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList_disponible;
    private javax.swing.JList<String> jList_seleccionado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tableMain;
    private javax.swing.JTable tableYear;
    // End of variables declaration//GEN-END:variables
}
