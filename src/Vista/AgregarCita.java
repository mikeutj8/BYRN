
package Vista;

/**
 *
 * @author CST-UTJ
 */
public class AgregarCita extends javax.swing.JPanel {

    /**
     * Creates new form AgregarCita
     */
    public AgregarCita() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        PanAñadirCita = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroDePropiedadAgregarCita = new javax.swing.JTextField();
        txtCodigoDelSolicitanteAgregarCita = new javax.swing.JTextField();
        txtFechaAgregarCita = new javax.swing.JTextField();
        btnGuardarCita = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHoraDeInicioAgregarCita = new javax.swing.JTextField();
        txtUbicacionAgregarCita = new javax.swing.JTextField();
        txtTipoDeCitaAgregarCita = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(143, 198, 94));
        setName(""); // NOI18N

        PanAñadirCita.setBackground(new java.awt.Color(233, 248, 223));
        PanAñadirCita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese datos de la cita");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel2.setText("Número de Propiedad");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel3.setText("Codigo del solicitante");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel4.setText("Fecha");

        txtNumeroDePropiedadAgregarCita.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N

        txtCodigoDelSolicitanteAgregarCita.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N

        txtFechaAgregarCita.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N

        btnGuardarCita.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnGuardarCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/img/guardar.png"))); // NOI18N
        btnGuardarCita.setText("Guardar Cita");
        btnGuardarCita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        clockDigital1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel5.setText("Hora de inicio");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel6.setText("Ubicacion");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel7.setText("Tipo de Cita");

        txtHoraDeInicioAgregarCita.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N

        txtUbicacionAgregarCita.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        txtUbicacionAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionAgregarCitaActionPerformed(evt);
            }
        });

        txtTipoDeCitaAgregarCita.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        txtTipoDeCitaAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoDeCitaAgregarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanAñadirCitaLayout = new javax.swing.GroupLayout(PanAñadirCita);
        PanAñadirCita.setLayout(PanAñadirCitaLayout);
        PanAñadirCitaLayout.setHorizontalGroup(
            PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(PanAñadirCitaLayout.createSequentialGroup()
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanAñadirCitaLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(86, 86, 86))
                    .addGroup(PanAñadirCitaLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumeroDePropiedadAgregarCita, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(txtCodigoDelSolicitanteAgregarCita)
                    .addComponent(txtTipoDeCitaAgregarCita, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(txtUbicacionAgregarCita)
                    .addComponent(txtHoraDeInicioAgregarCita)
                    .addComponent(txtFechaAgregarCita))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanAñadirCitaLayout.createSequentialGroup()
                .addGap(0, 252, Short.MAX_VALUE)
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanAñadirCitaLayout.createSequentialGroup()
                        .addComponent(btnGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanAñadirCitaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))))
        );
        PanAñadirCitaLayout.setVerticalGroup(
            PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanAñadirCitaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroDePropiedadAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoDelSolicitanteAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(PanAñadirCitaLayout.createSequentialGroup()
                        .addComponent(txtHoraDeInicioAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(PanAñadirCitaLayout.createSequentialGroup()
                        .addComponent(txtUbicacionAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(28, 28, 28)
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipoDeCitaAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanAñadirCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanAñadirCitaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(clockDigital1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanAñadirCitaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanAñadirCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PanAñadirCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUbicacionAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionAgregarCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionAgregarCitaActionPerformed

    private void txtTipoDeCitaAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoDeCitaAgregarCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoDeCitaAgregarCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanAñadirCita;
    public javax.swing.JButton btnGuardarCita;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private javax.swing.JInternalFrame jInternalFrame1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField txtCodigoDelSolicitanteAgregarCita;
    public javax.swing.JTextField txtFechaAgregarCita;
    private javax.swing.JTextField txtHoraDeInicioAgregarCita;
    public javax.swing.JTextField txtNumeroDePropiedadAgregarCita;
    private javax.swing.JTextField txtTipoDeCitaAgregarCita;
    private javax.swing.JTextField txtUbicacionAgregarCita;
    // End of variables declaration//GEN-END:variables
}
