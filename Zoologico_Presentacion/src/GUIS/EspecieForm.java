/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIS;

import Interfaz.INegocio;
import entidades.Cuidador;
import entidades.Especie;
import entidades.Habitat;
import implementaciones.NegocioFactory;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class EspecieForm extends javax.swing.JFrame {

    INegocio negocio;

    /**
     * Creates new form EspecieForm
     */
    public EspecieForm() {
        initComponents();
        negocio = NegocioFactory.crearNegocio();
        this.setTitle("Registro Especie");
        this.setResizable(true);//Modifica tamaño ventana
        this.setLocationRelativeTo(null);//Centrar
        cargarComboBoxCuidador();
        cargarComboBoxHabitat();
    }

    public void cargarComboBoxCuidador() {
        List<Cuidador> listaV = (LinkedList<Cuidador>) this.negocio.consultarTodosCuidador();
        for (int i = 0; i < listaV.size(); i++) {
            cbCuidador.addItem(listaV.get(i).getNombre());

        }

    }

    public void cargarComboBoxHabitat() {
        List<Habitat> listaV = (LinkedList<Habitat>) this.negocio.consultarTodosHabitat();
        for (int i = 0; i < listaV.size(); i++) {
            cbHabitat.addItem(listaV.get(i).getNombre());

        }
    }

    public boolean verificarNombre() {
        List<Especie> listaEspecie = negocio.consultarTodosEspecie();
        for (Especie especie : listaEspecie) {
            if (especie.getNombreEspecie().equalsIgnoreCase(this.txtNombreEspecie.getText())) {
                JOptionPane.showMessageDialog(this, "El nombre se encuentra ocupado! ", "Sistema", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        if(this.txtNombreEspecie.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "El campo nombre especie esta vacio", "Sistema", JOptionPane.ERROR_MESSAGE);
        return false;
        }
        JOptionPane.showMessageDialog(this, "El nombre esta disponible", "Sistema", JOptionPane.INFORMATION_MESSAGE);
        this.txtNombreAnimal.setEnabled(true);
        this.txtAreaDescripcion.setEnabled(true);
        this.txtNombreCientifico.setEnabled(true);
        this.cbCuidador.setEnabled(true);
        this.cbHabitat.setEnabled(true);
        this.btnGuardar.setEnabled(true);
        this.btnEditar.setEnabled(true);
        this.btnLimpiar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        return true;
    }
    
    public void guardar(){
        String nombreEspecie = this.txtNombreEspecie.getText();
        String nombreCientifico = this.txtNombreCientifico.getText();
        String nombreAnimal = this.txtNombreAnimal.getText();
        String descripcion = this.txtAreaDescripcion.getText();
        Habitat habitat = new Habitat();
        Cuidador c = null;
        List<Cuidador> listaV = (LinkedList<Cuidador>) this.negocio.consultarTodosCuidador();
        for (Cuidador cuidador : listaV) {
            for (int i = 0; i < listaV.size(); i++) {
                if(cbCuidador.getSelectedItem().toString().equalsIgnoreCase(cuidador.getNombre())){
                    c = new Cuidador(cuidador.getBasicoEsp(),cuidador.getExpertoEsp(),cuidador.getFechaEspecie());
                }
            }
        }
        try{
        Especie especie = new Especie(nombreEspecie,nombreAnimal,nombreCientifico,descripcion,
                                       habitat,c );
         this.negocio.agregar(especie);
            JOptionPane.showMessageDialog(this, "La Especie se ha guardado correctamente.",
                    "Confimación", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        limpiarCampos();
        
    }
    
    public void limpiarCampos(){
        this.txtAreaDescripcion.setText("");
        this.txtNombreAnimal.setText("");
        this.txtNombreCientifico.setText("");
        this.txtNombreEspecie.setText("");
    }

    public boolean verificarCampos() {
         List<Especie> listaEspecie = negocio.consultarTodosEspecie();
         for (Especie especie : listaEspecie) {
            if(especie.getNombreCientifico().equalsIgnoreCase(this.txtNombreCientifico.getText())){
                JOptionPane.showMessageDialog(this, "El nombre cientifico ya existe", "sistema", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        if (this.txtAreaDescripcion.getText().equalsIgnoreCase("") || this.txtNombreAnimal.getText().equalsIgnoreCase("")
                || this.txtNombreCientifico.getText().equalsIgnoreCase("") || this.txtNombreEspecie.getText().equalsIgnoreCase("")
                || this.cbCuidador.getSelectedItem() == null || this.cbHabitat.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "algunos de los campos esta vacio", "error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
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
        btnRegresar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNombreAnimal = new javax.swing.JLabel();
        txtNombreEspecie = new javax.swing.JTextField();
        txtNombreAnimal = new javax.swing.JTextField();
        lblNombreCientifico = new javax.swing.JLabel();
        txtNombreCientifico = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        lblHabitat = new javax.swing.JLabel();
        lblCuidador = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbHabitat = new javax.swing.JComboBox<>();
        cbCuidador = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 153));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitulo.setText("Registrar Especie");

        lblNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNombre.setText("Nombre especie");

        lblNombreAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNombreAnimal.setText("Nombre animal");

        txtNombreAnimal.setEnabled(false);

        lblNombreCientifico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblNombreCientifico.setText("Nombre cientifico");

        txtNombreCientifico.setEnabled(false);

        lblDescripcion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDescripcion.setText("Descripcion general");

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        txtAreaDescripcion.setEnabled(false);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        lblHabitat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblHabitat.setText("Habitat");

        lblCuidador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCuidador.setText("Cuidador");

        btnVerificar.setBackground(new java.awt.Color(255, 255, 153));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 153));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 153));
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);

        btnEliminar.setBackground(new java.awt.Color(255, 255, 153));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cbHabitat.setEnabled(false);
        cbHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHabitatActionPerformed(evt);
            }
        });

        cbCuidador.setEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 153));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombreCientifico)
                                    .addComponent(lblNombreAnimal)
                                    .addComponent(lblNombre))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreCientifico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHabitat)
                                    .addComponent(lblDescripcion)
                                    .addComponent(lblCuidador))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbCuidador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbHabitat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(241, 241, 241)
                    .addComponent(lblTitulo)
                    .addContainerGap(557, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombreEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreAnimal)
                            .addComponent(txtNombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreCientifico)
                            .addComponent(txtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHabitat)
                    .addComponent(cbHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuidador)
                    .addComponent(cbCuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnVerificar)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTitulo)
                    .addContainerGap(426, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(this.verificarCampos()){
        this.guardar();
        }else{
            JOptionPane.showMessageDialog(this, "vuelva a intentarlo", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        MenuForm m = new MenuForm();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        this.verificarNombre();
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cbHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHabitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHabitatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cbCuidador;
    private javax.swing.JComboBox<String> cbHabitat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCuidador;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblHabitat;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreAnimal;
    private javax.swing.JLabel lblNombreCientifico;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtNombreAnimal;
    private javax.swing.JTextField txtNombreCientifico;
    private javax.swing.JTextField txtNombreEspecie;
    // End of variables declaration//GEN-END:variables
}
