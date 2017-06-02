/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Variable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author YOJHAN
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
    private int nYears = 30;
    private ArrayList<Variable> List_variables;

    public ArrayList<Variable> getList_variables() {
        return List_variables;
    }
    private ventana_variables ventvar;
    
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
        for(Variable temp: List_variables){
            dlmDisp.addElement(temp.getDescripcion());
        }
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
        "Tasa calidad relaciones","Tasa empleados disc", "Tasa Nacimientos sin discapacidad"};
        
        //Comienza a crear las variables y las añade al ArrayList
        int i=0;
        for (String sv : String_variables) {
            String descripcion = sv;
            Variable v = new Variable(descripcion,i);
            List_variables.add(v);
            i++;
        }
    }
    
    private void valoresPorDefecto(){
        
        for (Variable v: List_variables){
            v.setValorInicial(0);
            switch(v.getId()){
                case 0: v.setValorInicial(150); break; //Cantidad Defunciones
                case 1: v.setValorInicial(118); break; //Cantidad Personal Médico
                case 2: v.setValorInicial(20); break;//Discapacitados Atentidos
                case 3: v.setValorInicial(150); break;//Disp. Empleo Accesible
                case 4: v.setValorInicial(150); break;//Empleo Accesible
                case 5: v.setValorInicial(15); break;//Instituciones Accesibles
                case 6: v.setValorInicial(30); break; //Población Participando Com.
                case 7: v.setValorInicial(100000); break;//Total Población
                case 8: v.setValorInicial(1000); break;//Total Pobl. Discapacitada
                case 24: v.setValorInicial(0.5); break;//Demanda Personal médico
                case 26: v.setValorInicial(0.5); break;//Demanda Personal médico
                case 27: v.setValorInicial(0.5); break;//Necesidad Atención
                case 33: v.setValorInicial(0.7); break;//orcentaje Eficiencia Metodos
                case 36: v.setValorInicial(3); break;//Promedio amistad
                case 37: v.setValorInicial(0.5); break;//Tasa calidad educación
                case 38: v.setValorInicial(0.0593); break;//Tasa defunciones
                case 39: v.setValorInicial(0.0026); break;//Tasa defunciones disc
                case 40: v.setValorInicial(0.0015); break;//Tasa defuncion med
                case 41: v.setValorInicial(0.5); break;//Tasa desarrollo
                case 42: v.setValorInicial(0.6); break;//Tasa ambiente laboral
                case 43: v.setValorInicial(0.0002); break;//Tasa nacimiento con discapacidad
                case 44: v.setValorInicial(0.0005); break;//Tasa personas adquieren discapacidad
                case 45: v.setValorInicial(0.65); break;//Tasa calidad relaciones
                case 46: v.setValorInicial(0.1); break;//Tasa empleados disc
                case 47: v.setValorInicial(0.1548); break;//Tasa nacimiento sin discapacidad
            }
        }
        
        /*Imprimir variables con valores*/
        for(Variable temp: List_variables){
            System.out.println(temp.getId()+"\t"+temp.getValor()+"\t"+temp.getDescripcion());
        }
    }
    
    private void initialValues(){
        for (Variable v: List_variables){
            v.setValor(v.getValorInicial());
        }
    }
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jButton2.setEnabled(false);
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

        jLabel6.setText("Añadir Todos");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setText("Vaciar lista");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Simulación");

        jLabel4.setText("Yojhan Leonardo Rodríguez Ascencio              20171678009");

        jLabel5.setText("Braian Estiven Alvarado Rodríguez                  20171678025");

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
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))))
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
            ventvar = new ventana_variables(this);
            ventvar.setVisible(true);
            this.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        boolean flag = true;
        
        while (flag){
            nYears = Integer.parseInt(JOptionPane.showInputDialog(this, "Defina el N (número de años) en el cual se ejecutará la simulación","Información",JOptionPane.QUESTION_MESSAGE));
            if(nYears >= 1 && nYears <=50){flag=false;}
            else{
            JOptionPane.showMessageDialog(this, "Asigne un valor entero positivo. No mayor de 50","Información",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        crearTabla();
        procedureBegin();
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Asigne un valor entero positivo.","Información",JOptionPane.ERROR_MESSAGE);
        }
        
       
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void crearTabla(){
        TableColumnModel columnModel = tableMain.getColumnModel();
        dtm = new DefaultTableModel(dlmSelec.toArray(),0);
        dtmYear = new DefaultTableModel(new String[]{"Años"},0);
        tableMain.setModel(dtm);
        tableYear.setModel(dtmYear);
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

    private void procedureBegin(){
       //Asigna valores iniciales a variables
       initialValues();
       //Defunción
       Variable totalPoblacion = List_variables.get(7);
       Variable defuncion =  List_variables.get(9);
       Variable tasaDefuncion = List_variables.get(38);
       Variable tasaDefuncionDisc = List_variables.get(39);
       Variable defuncionDisc = List_variables.get(10);
       Variable tasaDefuncionMed = List_variables.get(40);
       Variable defuncionMed = List_variables.get(11);
       Variable tasaDesarrollo = List_variables.get(41);
       Variable interesSociedad = List_variables.get(26);
       Variable dispEmpleoAcc = List_variables.get(3);
       Variable empleoAcc = List_variables.get(4);
       Variable desarrolloEmpleo = List_variables.get(12);
       Variable institucionesAcc = List_variables.get(5);
       Variable desarrolloInsti = List_variables.get(13);
       Variable empleoGenerado = List_variables.get(14);
       Variable tasaNacimientosConDisc = List_variables.get(43);
       Variable tasaNacimientosSinDisc = List_variables.get(47);
       Variable nacimientos = List_variables.get(15);
       Variable totalPoblacionDisc = List_variables.get(8);
       Variable personasParticipando = List_variables.get(6);
       Variable tasaCalidadRelaciones = List_variables.get(45);
       Variable nuevosIntegrantes = List_variables.get(16);
       Variable tasaAdquiereDisc =   List_variables.get(44);
       Variable personasconDisc =    List_variables.get(17);
       Variable necesidadAtencion = List_variables.get(27);
       Variable demandaPersonal = List_variables.get(24);
       Variable porcentajeEficiencia = List_variables.get(33);
       Variable salud = List_variables.get(22);
       Variable personasRecuperadas= List_variables.get(18);
       Variable tasaEmpleadosDisc = List_variables.get(46);
       
            //---->Nivel Bienestar Educativo
            Variable tasaCalidadEdu = List_variables.get(37);
            Variable nivelBEdu = List_variables.get(28);
            //---->Nivel Bienestar Fisico
            Variable discapacitadosAtent = List_variables.get(2);
            Variable nivelBFisico= List_variables.get(30);
       Variable poblacionEmpleadaDisc=List_variables.get(19);
       Variable porcentajeProfesionales = List_variables.get(35);
       Variable profesionales = List_variables.get(20);
       Variable retiroMiembros = List_variables.get(21);
       Variable sobredemanda = List_variables.get(23);
            Variable tasaAmbienteLaboral = List_variables.get(42);
            Variable promedioAmistad = List_variables.get(36);
            Variable nivelBEmocional = List_variables.get(29);
        Variable porcentajeEstatusSocio = List_variables.get(34);
            Variable nivelBSocial = List_variables.get(31);
            //----> Nivel Bienestar Material
            Variable nivelBMaterial = List_variables.get(32);
        // <<<<<Indice Calidad de Vida>>>>>
        Variable indiceCalidad = List_variables.get(25);
        Variable cantidadDefunciones = List_variables.get(0);
        Variable cantidadPerMedico = List_variables.get(1);

        //------------------------------------------------------------------------
        //Empieza el ciclo por ende la simulación en los años nYears definidos
        
        
        for(int i=0; i<nYears; i++){
            totalPoblacion.setValor(totalPoblacion.getValor()+nacimientos.getValor()-defuncion.getValor());
            totalPoblacionDisc.setValor(totalPoblacionDisc.getValor()+personasconDisc.getValor()-defuncionDisc.getValor()-personasRecuperadas.getValor());
            cantidadDefunciones.setValor(cantidadDefunciones.getValor()+defuncion.getValor());
            cantidadPerMedico.setValor(cantidadPerMedico.getValor()+profesionales.getValor()-defuncionMed.getValor());
            discapacitadosAtent.setValor(discapacitadosAtent.getValor()+salud.getValor()-sobredemanda.getValor());
            institucionesAcc.setValor(institucionesAcc.getValor()+desarrolloInsti.getValor());
            dispEmpleoAcc.setValor(dispEmpleoAcc.getValor()+desarrolloEmpleo.getValor()-poblacionEmpleadaDisc.getValor());
            empleoAcc.setValor(empleoAcc.getValor()+empleoGenerado.getValor());
            personasParticipando.setValor(personasParticipando.getValor()+nuevosIntegrantes.getValor()-retiroMiembros.getValor());
            
            
            defuncion.setValor(totalPoblacion.getValor()*tasaDefuncion.getValor());
            defuncionDisc.setValor(defuncion.getValor()*tasaDefuncionDisc.getValor());
            defuncionMed.setValor(defuncion.getValor()*tasaDefuncionMed.getValor());
            desarrolloEmpleo.setValor((tasaDesarrollo.getValor()+(interesSociedad.getValor()*0.3))/2*(empleoAcc.getValor()-dispEmpleoAcc.getValor()));
            desarrolloInsti.setValor((tasaDesarrollo.getValor()*0.7)*(interesSociedad.getValor()*0.6)*institucionesAcc.getValor());
            empleoGenerado.setValor(desarrolloEmpleo.getValor());
            nacimientos.setValor(totalPoblacion.getValor()*(tasaNacimientosConDisc.getValor()+tasaNacimientosSinDisc.getValor()));
            nuevosIntegrantes.setValor((totalPoblacionDisc.getValor()-personasParticipando.getValor())*((interesSociedad.getValor()+tasaCalidadRelaciones.getValor())/4));
            personasconDisc.setValor((tasaAdquiereDisc.getValor()*totalPoblacion.getValor())+(tasaNacimientosConDisc.getValor()*totalPoblacion.getValor()));
            salud.setValor((totalPoblacionDisc.getValor()*necesidadAtencion.getValor())*(((1-demandaPersonal.getValor())+porcentajeEficiencia.getValor())/2));
            personasRecuperadas.setValor(salud.getValor());
            if((institucionesAcc.getValor()/(totalPoblacionDisc.getValor()/20))>1){
                nivelBEdu.setValor((1+tasaCalidadEdu.getValor())/2);
            }
            else{
                nivelBEdu.setValor(((institucionesAcc.getValor()/(totalPoblacionDisc.getValor()/20))+tasaCalidadEdu.getValor())/2);
            }
            nivelBFisico.setValor(((discapacitadosAtent.getValor()/(totalPoblacionDisc.getValor()*0.5))+0.5)/2);
            poblacionEmpleadaDisc.setValor((tasaEmpleadosDisc.getValor()+(nivelBEdu.getValor()/100)+(nivelBFisico.getValor()/100))*totalPoblacionDisc.getValor());
            porcentajeProfesionales.setValor(0.00118/tasaDesarrollo.getValor());
            profesionales.setValor(totalPoblacion.getValor()*porcentajeProfesionales.getValor());
            retiroMiembros.setValor((0.5*defuncionDisc.getValor())+(personasRecuperadas.getValor()*0.5));
            sobredemanda.setValor((demandaPersonal.getValor()+necesidadAtencion.getValor()/3)*discapacitadosAtent.getValor());
            nivelBEmocional.setValor((tasaAmbienteLaboral.getValor()+(discapacitadosAtent.getValor()/totalPoblacionDisc.getValor())+(promedioAmistad.getValor()/5)+(personasParticipando.getValor()/totalPoblacionDisc.getValor()))/4);
            porcentajeEstatusSocio.setValor((((tasaEmpleadosDisc.getValor()*dispEmpleoAcc.getValor())/(totalPoblacionDisc.getValor()-poblacionEmpleadaDisc.getValor()))+tasaDesarrollo.getValor())/2);
            if((dispEmpleoAcc.getValor()/totalPoblacionDisc.getValor())>1){
                nivelBSocial.setValor((interesSociedad.getValor()+(personasParticipando.getValor()/totalPoblacionDisc.getValor())+1)/3);
            }
            else{
                nivelBSocial.setValor((interesSociedad.getValor()+(personasParticipando.getValor()/totalPoblacionDisc.getValor())+(dispEmpleoAcc.getValor()/totalPoblacionDisc.getValor()))/3);
            }
            nivelBMaterial.setValor((porcentajeEstatusSocio.getValor()+tasaDesarrollo.getValor())/2);
            indiceCalidad.setValor((nivelBEdu.getValor()+nivelBEmocional.getValor()+nivelBFisico.getValor()+nivelBMaterial.getValor()+nivelBSocial.getValor())/5);
            
            
            ArrayList<String> valoresTemp = new ArrayList();
            
            for(Integer number: idsSelected){
                for(Variable temp: List_variables){
                    if(number==temp.getId()){
                        valoresTemp.add(new DecimalFormat("#.####").format(temp.getValor()));
                        break;
                    }
                }
            }
            
            dtm.addRow(valoresTemp.toArray());
            dtmYear.addRow(new String[]{""+(i+1)});
            
        }
        
        //------------------------------------------------------------------------
        //------------------------------------------------------------------------
        
        System.out.println("------------------");
        /*Imprimir variables con valores*/
        for(Variable temp: List_variables){
            System.out.println(temp.getId()+"\t"+ new DecimalFormat("#.####").format(temp.getValor())+"\t"+temp.getDescripcion());
        }
        /*Imprimir variables con valores*/
        
        
    }
    
    
    private void Button_listRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_listRightActionPerformed
      //Envia elementos de Disponibles a seleccionados
      for(String selectedValue: jList_disponible.getSelectedValuesList()){
          dlmSelec.addElement(selectedValue);
          dlmDisp.removeElement(selectedValue);
      }
      if(dlmSelec.isEmpty()){jButton2.setEnabled(false);}
      else{jButton2.setEnabled(true);}
    }//GEN-LAST:event_Button_listRightActionPerformed

    private void Button_listLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_listLeftActionPerformed
        //Envia elementos de seleccionados a Disponibles
      for(String selectedValue: jList_seleccionado.getSelectedValuesList()){
          dlmDisp.addElement(selectedValue);
          dlmSelec.removeElement(selectedValue);
      }
      if(dlmSelec.isEmpty()){jButton2.setEnabled(false);}
      else{jButton2.setEnabled(true);}
    }//GEN-LAST:event_Button_listLeftActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(this, "Se han asignado los valores definidos por defecto.","Información",JOptionPane.INFORMATION_MESSAGE);
        valoresPorDefecto();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // Añadir todos
        for(int i=0; i<dlmDisp.getSize(); i++){
            dlmSelec.addElement(dlmDisp.elementAt(i));            
        }
        dlmDisp.removeAllElements();
        if(dlmSelec.isEmpty()){jButton2.setEnabled(false);}
        else{jButton2.setEnabled(true);}
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // Vaciar lista
        for(int i=0; i<dlmSelec.getSize(); i++){
            dlmDisp.addElement(dlmSelec.elementAt(i));            
        }
        dlmSelec.removeAllElements();
        if(dlmSelec.isEmpty()){jButton2.setEnabled(false);}
        else{jButton2.setEnabled(true);}
    }//GEN-LAST:event_jLabel7MouseClicked

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
