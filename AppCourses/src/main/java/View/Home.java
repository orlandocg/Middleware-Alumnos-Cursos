/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import BussinessObject.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Home extends javax.swing.JFrame {

    private Document document;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        Courses courses = Courses.getInstance();
        jLabel6.setText("6"); //Quitar esta linea cuando funcionen los sockets, el 6 es solo para pruebas.
        int semestreInt = Integer.parseInt(jLabel6.getText());       
        ArrayList<Course> cursos = courses.getSemesterCourses(semestreInt);
        llenarTabla(cursos);
        File file = new File("courses.xml");
        file.delete();
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpHeader = new javax.swing.JPanel();
        jpSectionsNames = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlMainName = new javax.swing.JLabel();
        jlISW = new javax.swing.JLabel();
        jpStatus = new javax.swing.JPanel();
        jlStatus = new javax.swing.JLabel();
        jpCourses = new javax.swing.JPanel();
        jspCoursesTable = new javax.swing.JScrollPane();
        jtCourses = new javax.swing.JTable();
        btnEnviarCursos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCourses1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpHeader.setBackground(new java.awt.Color(15, 109, 181));
        jpHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSectionsNames.setBackground(new java.awt.Color(13, 85, 136));
        jpSectionsNames.setForeground(new java.awt.Color(255, 255, 255));
        jpSectionsNames.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Alumno");
        jpSectionsNames.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selección de cursos disponibles para el alumno");
        jpSectionsNames.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 410, 30));

        jpHeader.add(jpSectionsNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 700, 30));

        jlMainName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlMainName.setForeground(new java.awt.Color(255, 255, 255));
        jlMainName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMainName.setText("Oferta educativa de cursos");
        jpHeader.add(jlMainName, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 10, 290, 30));

        jlISW.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlISW.setForeground(new java.awt.Color(255, 255, 255));
        jlISW.setText("ISW");
        jpHeader.add(jlISW, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 30));

        getContentPane().add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 80));

        jpStatus.setBackground(new java.awt.Color(255, 255, 255));
        jpStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlStatus.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jlStatus.setForeground(new java.awt.Color(102, 102, 102));
        jlStatus.setText("Enviando datos de los cursos seleccionados... -  Recibiendo datos del alumno...");
        jpStatus.add(jlStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 680, 20));

        getContentPane().add(jpStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 700, 20));

        jpCourses.setBackground(new java.awt.Color(255, 255, 255));
        jpCourses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jspCoursesTable.setBackground(new java.awt.Color(255, 255, 255));
        jspCoursesTable.setForeground(new java.awt.Color(51, 51, 51));
        jspCoursesTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtCourses.setForeground(new java.awt.Color(51, 51, 51));
        jtCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Materia", "Semestre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCourses.setColumnSelectionAllowed(true);
        jtCourses.setGridColor(new java.awt.Color(153, 153, 153));
        jtCourses.setRowHeight(25);
        jtCourses.setShowGrid(true);
        jspCoursesTable.setViewportView(jtCourses);
        jtCourses.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtCourses.getColumnModel().getColumnCount() > 0) {
            jtCourses.getColumnModel().getColumn(1).setResizable(false);
            jtCourses.getColumnModel().getColumn(1).setPreferredWidth(180);
            jtCourses.getColumnModel().getColumn(2).setResizable(false);
        }

        jpCourses.add(jspCoursesTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 410, 270));

        btnEnviarCursos.setBackground(new java.awt.Color(13, 85, 136));
        btnEnviarCursos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEnviarCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarCursos.setText("Enviar cursos");
        btnEnviarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCursosActionPerformed(evt);
            }
        });
        jpCourses.add(btnEnviarCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 303, 130, 30));

        getContentPane().add(jpCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 450, 350));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Semestre:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Nombre:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("ID:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 250, 120));

        jPanel1.setBackground(new java.awt.Color(13, 85, 136));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Todos los cursos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jtCourses1.setForeground(new java.awt.Color(51, 51, 51));
        jtCourses1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Semestre", "Materia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCourses1.setColumnSelectionAllowed(true);
        jtCourses1.setGridColor(new java.awt.Color(153, 153, 153));
        jtCourses1.setRowHeight(25);
        jtCourses1.setShowGrid(true);
        jScrollPane1.setViewportView(jtCourses1);
        jtCourses1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtCourses1.getColumnModel().getColumnCount() > 0) {
            jtCourses1.getColumnModel().getColumn(0).setResizable(false);
            jtCourses1.getColumnModel().getColumn(1).setResizable(false);
            jtCourses1.getColumnModel().getColumn(1).setPreferredWidth(180);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 160));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarTabla(ArrayList<Course> courses) {
        DefaultTableModel modelo = (DefaultTableModel) jtCourses.getModel();

        for (int i = 0; i < courses.size(); i++) {
            modelo.addRow(new Object[]{courses.get(i).getId(), courses.get(i).getName(), String.valueOf(courses.get(i).getSemester())});
        }

    }

    private void btnEnviarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCursosActionPerformed
       
        Courses courses = Courses.getInstance();
       ArrayList<Course> cursos = courses.getSemesterCourses(Integer.parseInt(jLabel6.getText()));
        documentXML xml = new documentXML();

        try {
            xml.GenerarDOM();
        } catch (ParserConfigurationException ex) {
            ex.getStackTrace();
        }

        xml.generarDocumento(cursos);
        try {
            xml.generarXml();
        } catch (IOException ex) {
            ex.getStackTrace();
        } catch (TransformerException ex) {
            ex.getStackTrace();
        }
    }//GEN-LAST:event_btnEnviarCursosActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarCursos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlISW;
    private javax.swing.JLabel jlMainName;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JPanel jpCourses;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpSectionsNames;
    private javax.swing.JPanel jpStatus;
    private javax.swing.JScrollPane jspCoursesTable;
    private javax.swing.JTable jtCourses;
    private javax.swing.JTable jtCourses1;
    // End of variables declaration//GEN-END:variables
}
