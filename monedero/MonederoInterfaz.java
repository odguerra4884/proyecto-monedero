
package monedero;
import javax.swing.JOptionPane;

public class MonederoInterfaz extends javax.swing.JFrame {
    Mimonedero monedero;
    public MonederoInterfaz() {
        this.monedero = new Mimonedero(100);
        initComponents();
        double cantidadInicial = 100;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        resultado = new javax.swing.JTextField();
        body = new javax.swing.JPanel();
        datos = new javax.swing.JTextField();
        saldo = new javax.swing.JButton();
        retiro = new javax.swing.JButton();
        meter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head.setBackground(new java.awt.Color(102, 255, 102));
        head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado.setEditable(false);
        resultado.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        head.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 100));

        bg.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 120));

        body.setBackground(new java.awt.Color(204, 0, 51));
        body.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        body.setForeground(new java.awt.Color(51, 255, 0));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        datos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosActionPerformed(evt);
            }
        });
        body.add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 160, 60));

        saldo.setText("Consulta de Saldo");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        body.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        retiro.setText("Retirar");
        retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiroActionPerformed(evt);
            }
        });
        body.add(retiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        meter.setText("Ingresar");
        meter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meterActionPerformed(evt);
            }
        });
        body.add(meter, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        bg.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 470, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datosActionPerformed

    private void retiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retiroActionPerformed
         double retiros = Double.parseDouble(datos.getText());

        if (retiros <= monedero.consultarDisponible()) {
            monedero.sacarDinero(retiros);
            resultado.setText(String.valueOf(retiros));
        } else {
            JOptionPane.showMessageDialog(this, "No hay suficiente dinero en el monedero.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_retiroActionPerformed

    private void meterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meterActionPerformed
        double ingreso = Double.parseDouble(datos.getText());
        monedero.meterDinero(ingreso);
        resultado.setText(String.valueOf(ingreso));
    }//GEN-LAST:event_meterActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        
        resultado.setText(String.valueOf(monedero.consultarDisponible()));
    }//GEN-LAST:event_saldoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel body;
    private javax.swing.JTextField datos;
    private javax.swing.JPanel head;
    private javax.swing.JButton meter;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton retiro;
    private javax.swing.JButton saldo;
    // End of variables declaration//GEN-END:variables
}
