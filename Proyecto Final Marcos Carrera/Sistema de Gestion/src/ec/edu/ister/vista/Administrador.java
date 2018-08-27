/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package ec.edu.ister.vista;

import ec.edu.ister.controlador.Coordinador;
import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author 
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private Dimension dim;
    Coordinador coordinador;

    public Administrador(Coordinador coord) {
        
        initComponents();
        coordinador = coord;
        this.pack();
        dim = super.getToolkit().getScreenSize();
        this.setSize(dim);
        //this.setUndecorated(true);
        //this.setVisible(true);
        this.getContentPane().setBackground(Color.white);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        btnInicio = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        ingresarDocente = new javax.swing.JMenuItem();
        editarDocente = new javax.swing.JMenuItem();
        eliminarDocente = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        ingresarEstudiante = new javax.swing.JMenuItem();
        editarEstudiante = new javax.swing.JMenuItem();
        eliminarEstudiante = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        ingresarMateria = new javax.swing.JMenuItem();
        eliminarMateria = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestión Académico Docente ISTER");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 690));

        jMenuBar1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(5, 5, 5, 5));

        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inicio.png"))); // NOI18N
        Inicio.setText("Inicio      ");
        Inicio.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        Inicio.setMargin(new java.awt.Insets(10, 10, 10, 10));

        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        Inicio.add(btnInicio);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Inicio.add(jMenuItem1);

        jMenuBar1.add(Inicio);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trabajadores.png"))); // NOI18N
        jMenu7.setText("Docentes      ");
        jMenu7.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jMenu7.setMargin(new java.awt.Insets(10, 10, 10, 10));

        ingresarDocente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ingresarDocente.setText("Ingresar");
        ingresarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarDocenteActionPerformed(evt);
            }
        });
        jMenu7.add(ingresarDocente);

        editarDocente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        editarDocente.setText("Editar");
        editarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDocenteActionPerformed(evt);
            }
        });
        jMenu7.add(editarDocente);

        eliminarDocente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        eliminarDocente.setText("Eliminar");
        eliminarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDocenteActionPerformed(evt);
            }
        });
        jMenu7.add(eliminarDocente);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientesOK.png"))); // NOI18N
        jMenu8.setText("Estudiantes      ");
        jMenu8.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jMenu8.setMargin(new java.awt.Insets(10, 10, 10, 10));

        ingresarEstudiante.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ingresarEstudiante.setText("Ingresar");
        ingresarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarEstudianteActionPerformed(evt);
            }
        });
        jMenu8.add(ingresarEstudiante);

        editarEstudiante.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        editarEstudiante.setText("Editar");
        editarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEstudianteActionPerformed(evt);
            }
        });
        jMenu8.add(editarEstudiante);

        eliminarEstudiante.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        eliminarEstudiante.setText("Eliminar");
        eliminarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEstudianteActionPerformed(evt);
            }
        });
        jMenu8.add(eliminarEstudiante);

        jMenuBar1.add(jMenu8);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manual.png"))); // NOI18N
        jMenu6.setText("Materias      ");
        jMenu6.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jMenu6.setMargin(new java.awt.Insets(10, 10, 10, 10));

        ingresarMateria.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ingresarMateria.setText("Ingresar");
        ingresarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarMateriaActionPerformed(evt);
            }
        });
        jMenu6.add(ingresarMateria);

        eliminarMateria.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        eliminarMateria.setText("Eliminar");
        eliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMateriaActionPerformed(evt);
            }
        });
        jMenu6.add(eliminarMateria);

        jMenuItem28.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jMenuItem28.setText("Editar");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem28);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMateriaActionPerformed
        coordinador.showEliminarMateria();       // coordinador.showEliminarMateria();
    }//GEN-LAST:event_eliminarMateriaActionPerformed

    private void eliminarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDocenteActionPerformed
        coordinador.showEliminarDocentes();
    }//GEN-LAST:event_eliminarDocenteActionPerformed

    private void eliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEstudianteActionPerformed
        coordinador.showEliminarEstudiantes();      //  coordinador.showEliminarEstudiante();
    }//GEN-LAST:event_eliminarEstudianteActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        coordinador.showInicio();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void ingresarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarMateriaActionPerformed
        coordinador.showIngresarMateria();
    }//GEN-LAST:event_ingresarMateriaActionPerformed

    private void ingresarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarEstudianteActionPerformed
        coordinador.showIngresoEstudiantes();       // coordinador.showIngresarEstudiante();
    }//GEN-LAST:event_ingresarEstudianteActionPerformed

    private void ingresarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarDocenteActionPerformed
        coordinador.showIngresarDocente();     //  coordinador.showIngresarDocente();
    }//GEN-LAST:event_ingresarDocenteActionPerformed

    private void editarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDocenteActionPerformed
        coordinador.showEditarDocente();       // coordinador.showEditarDocente();
    }//GEN-LAST:event_editarDocenteActionPerformed

    private void editarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEstudianteActionPerformed
        coordinador.showEditarEstudiantes();      //  coordinador.showEditarEstudiante();
    }//GEN-LAST:event_editarEstudianteActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        coordinador.showEditarMateria();        //coordinador.showEditarMateria();
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /** 
     * @param args the command line arguments
     */
    /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenuItem btnInicio;
    private javax.swing.JMenuItem editarDocente;
    private javax.swing.JMenuItem editarEstudiante;
    private javax.swing.JMenuItem eliminarDocente;
    private javax.swing.JMenuItem eliminarEstudiante;
    private javax.swing.JMenuItem eliminarMateria;
    public javax.swing.JPanel escritorio;
    private javax.swing.JMenuItem ingresarDocente;
    private javax.swing.JMenuItem ingresarEstudiante;
    private javax.swing.JMenuItem ingresarMateria;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem28;
    // End of variables declaration//GEN-END:variables
}