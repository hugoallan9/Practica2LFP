/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2lfp;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.Timer;

/**
 *
 * @author hugo
 */
public class MenuPrincipal extends javax.swing.JFrame {
    String rutaImagen[];
     Border border = LineBorder.createBlackLineBorder();
     ArrayList <Character> cadenaEntrada = new ArrayList <Character>();
     Analizador lexico;
     int resultadoPrevio = 0;
     DefaultListModel modelo = new DefaultListModel();
     boolean autoOn = false;
             Timer timer = new Timer (1000, new java.awt.event.ActionListener () 
        { 
            public void actionPerformed(java.awt.event.ActionEvent e) 
            { 
              if(!cadenaEntrada.isEmpty()){
               char leido = cadenaEntrada.remove(0);
                vaciarArray();
                int resultado = lexico.analizar(leido);
                operarMaquina(resultado, lexico.getEstado(), lexico.getMensajeError(), lexico.getToken(), lexico.getValorLexema(), leido);
              }else{
                JOptionPane.showMessageDialog(null, "Ya no quedan más simbolos por analizar");
             }  
            } 
        }); 
     /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        super("Máquina de Estados LFP Práctica 2");
         initComponents();
        this.setLocationRelativeTo(null);
        iniciarRutas();
        System.out.println("La ruta es: " + rutaImagen[0]);
        ponerImagen(rutaImagen[0]);
        cuadro1.setBorder(border);
        cuadro2.setBorder(border);
        cuadro3.setBorder(border);
        cuadro4.setBorder(border);
        cuadro5.setBorder(border);
        cuadro6.setBorder(border);
        cuadro7.setBorder(border);
        cuadro8.setBorder(border);
        ImageIcon ima = new ImageIcon(getClass().getResource("/Imagenes/cabeza.png"));
        Icon icono = new ImageIcon(ima.getImage().getScaledInstance(indicadorLb.getWidth(), indicadorLb.getHeight(), Image.SCALE_DEFAULT));
        indicadorLb.setIcon(icono);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JIngresoTexto = new javax.swing.JTextField();
        ingresoBt = new javax.swing.JButton();
        RelojLabel = new javax.swing.JLabel();
        cuadro2 = new javax.swing.JLabel();
        cuadro1 = new javax.swing.JLabel();
        cuadro3 = new javax.swing.JLabel();
        cuadro4 = new javax.swing.JLabel();
        cuadro5 = new javax.swing.JLabel();
        cuadro6 = new javax.swing.JLabel();
        cuadro7 = new javax.swing.JLabel();
        cuadro8 = new javax.swing.JLabel();
        avanzarBt = new javax.swing.JButton();
        indicadorLb = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salidaList = new javax.swing.JList();
        autoBt = new javax.swing.JButton();
        estadoLb = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JIngresoTexto.setText("Ingrese acá su texto");

        ingresoBt.setText("Ingresar");
        ingresoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoBtActionPerformed(evt);
            }
        });

        RelojLabel.setText("jLabel1");

        cuadro2.setForeground(new java.awt.Color(0, 0, 0));

        cuadro1.setForeground(new java.awt.Color(0, 0, 0));

        cuadro3.setForeground(new java.awt.Color(0, 0, 0));

        cuadro4.setForeground(new java.awt.Color(0, 0, 0));

        cuadro5.setForeground(new java.awt.Color(0, 0, 0));

        cuadro6.setForeground(new java.awt.Color(0, 0, 0));

        cuadro7.setForeground(new java.awt.Color(0, 0, 0));

        cuadro8.setForeground(new java.awt.Color(0, 0, 0));

        avanzarBt.setText("Avanzar");
        avanzarBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarBtActionPerformed(evt);
            }
        });

        indicadorLb.setForeground(new java.awt.Color(0, 0, 0));

        jScrollPane2.setViewportView(salidaList);

        autoBt.setText("Modo Automático");
        autoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoBtActionPerformed(evt);
            }
        });

        jMenu1.setText("Operaciones");

        jMenuItem4.setText("Ingresar Texto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Avanzar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem1.setText("¿Cómo se Utiliza?");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Acerca de...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RelojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avanzarBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(autoBt)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indicadorLb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JIngresoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cuadro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuadro2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuadro3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuadro4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuadro5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuadro6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuadro7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(estadoLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuadro8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresoBt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JIngresoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoBt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuadro1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadro2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadro3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadro4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadro5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadro6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadro7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadro8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indicadorLb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(estadoLb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avanzarBt)
                            .addComponent(autoBt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RelojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if(!cadenaEntrada.isEmpty()){
             char leido = cadenaEntrada.remove(0);
            vaciarArray();
            int resultado = lexico.analizar(leido);
            operarMaquina(resultado, lexico.getEstado(), lexico.getMensajeError(), lexico.getToken(), lexico.getValorLexema(), leido);
        }else{
            JOptionPane.showMessageDialog(this, "Ya no quedan más simbolos por analizar");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ingresoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoBtActionPerformed
        // TODO add your handling code here:
        if(JIngresoTexto.getText() != ""){
            lexico = new Analizador();
            System.out.println("esta funcio");
            ingresarElementos(JIngresoTexto.getText());
            vaciarArray();
        }else{
            JOptionPane.showMessageDialog(this,"Debes ingresar algún texto"); 
        }
    }//GEN-LAST:event_ingresoBtActionPerformed

    private void avanzarBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarBtActionPerformed
        // TODO add your handling code here:
        if(!cadenaEntrada.isEmpty()){
             char leido = cadenaEntrada.remove(0);
            vaciarArray();
            int resultado = lexico.analizar(leido);
            operarMaquina(resultado, lexico.getEstado(), lexico.getMensajeError(), lexico.getToken(), lexico.getValorLexema(), leido);
        }else{
            JOptionPane.showMessageDialog(this, "Ya no quedan más simbolos por analizar");
        }
    }//GEN-LAST:event_avanzarBtActionPerformed

    private void autoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoBtActionPerformed
        // TODO add your handling code here:
        if(autoOn){
            autoOn = false;
            autoBt.setText("Modo automático");
        }else{
            autoOn = true;
            autoBt.setText("Parar");
        }
        
        if(timer.isRunning()){
            timer.stop();
        }else{
            timer.start();
        }
    }//GEN-LAST:event_autoBtActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if(JIngresoTexto.getText() != ""){
            lexico = new Analizador();
            System.out.println("esta funcio");
            ingresarElementos(JIngresoTexto.getText());
            vaciarArray();
        }else{
            JOptionPane.showMessageDialog(this,"Debes ingresar algún texto"); 
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Hugo Allan García Monterrosa \n 200714466");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JIngresoTexto;
    private javax.swing.JLabel RelojLabel;
    private javax.swing.JButton autoBt;
    private javax.swing.JButton avanzarBt;
    private javax.swing.JLabel cuadro1;
    private javax.swing.JLabel cuadro2;
    private javax.swing.JLabel cuadro3;
    private javax.swing.JLabel cuadro4;
    private javax.swing.JLabel cuadro5;
    private javax.swing.JLabel cuadro6;
    private javax.swing.JLabel cuadro7;
    private javax.swing.JLabel cuadro8;
    private javax.swing.JLabel estadoLb;
    private javax.swing.JLabel indicadorLb;
    private javax.swing.JButton ingresoBt;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList salidaList;
    // End of variables declaration//GEN-END:variables

    private void iniciarRutas() {
        rutaImagen = new String[8];
        rutaImagen[0] = "/Imagenes/estado0.png";
        rutaImagen[1] = "/Imagenes/estado1.png";
        rutaImagen[2] = "/Imagenes/estado2.png";
        rutaImagen[3] = "/Imagenes/estado3.png";
        rutaImagen[4] = "/Imagenes/estado4.png";
        rutaImagen[5] = "/Imagenes/estado5.png";
        rutaImagen[6] = "/Imagenes/estado6.png";
        rutaImagen[7] = "/Imagenes/estado7.png";
    }

    private void ponerImagen(String path) {
        System.out.print(path);
        System.out.println("La ruta queda: " + getClass().getResource(path));
        ImageIcon ima = new ImageIcon(getClass().getResource(path));
        Icon icono = new ImageIcon(ima.getImage().getScaledInstance(RelojLabel.getWidth(), RelojLabel.getHeight(), Image.SCALE_DEFAULT));
        RelojLabel.setIcon(icono);
    }
    
    private void ingresarElementos(String entrada){
        for(int i = 0; i < entrada.length(); i++){
            System.out.println("Yo soy una entrada: "+ entrada.charAt(i));
            cadenaEntrada.add(entrada.charAt(i));
        }
        cadenaEntrada.add('@');
    }

    private void vaciarArray() {
        Iterator it = cadenaEntrada.iterator();
        int etiqueta = 0;
        if(it.hasNext()){
            cuadro1.setText("   "+ it.next());
            this.getContentPane().repaint();
        }else{
            cuadro1.setText("");
        }
        if(it.hasNext()){
            cuadro2.setText("   "+ it.next());
            this.getContentPane().repaint();
        }else{
            cuadro2.setText("");
        }
        if(it.hasNext()){
            cuadro3.setText("   "+ it.next());
            this.getContentPane().repaint();
        }else{
            cuadro3.setText("");
        }
        if(it.hasNext()){
            cuadro4.setText("   "+ it.next());
            this.getContentPane().repaint();
        }else{
            cuadro4.setText("");
        }
        if(it.hasNext()){
            cuadro5.setText("   "+ it.next());
            this.getContentPane().repaint();
        }else{
            cuadro5.setText("");
        }
        if(it.hasNext()){
            cuadro6.setText("   "+ it.next());
            this.getContentPane().repaint();
        }else{
            cuadro6.setText("");
        }
        if(it.hasNext()){
            cuadro7.setText("   "+ it.next());
            this.getContentPane().repaint();
        }else{
            cuadro7.setText("");
        }
        if(it.hasNext()){
            cuadro8.setText("   "+ it.next());
            this.getContentPane().repaint();
        }else{
            cuadro8.setText("");
        }

        
    }

    private void operarMaquina(int resultado, int estado, String mensajeError, int token, String valorLexema, char leido) {
        cambiarEtiqueta(estado);
        switch(resultado){
            case 0:
                System.out.println(estado);
                ponerImagen(rutaImagen[estado]);
                break;
            case 1:
                ponerImagen(rutaImagen[estado]);
                JOptionPane.showMessageDialog(this, "Valor Lexema: " + valorLexema +" "+ mensajeError);
                break;
            case 2:
                ponerImagen(rutaImagen[estado]);
                int pane;
                pane = JOptionPane.showConfirmDialog(this,"Has llegado a un estado de aceptación con los siguientes Datos: \n Último caracter leído: "+ leido +"\n"
                +"token: "+  obtenerToken(estado) + "\n"+ "Valor del Lexema: " + valorLexema + "\n Expresión Regular: " + obtenerER(obtenerToken(estado))+ "\n Deseas continuar?");
                    if(pane == 1){
                        System.out.println("Hola Mundo");
                        modelo.addElement(valorLexema);
                        salidaList.setModel(modelo);
                        lexico = new Analizador();
                        ponerImagen(rutaImagen[lexico.getEstado()]);
                        resultadoPrevio = lexico.getEstado();
                    }
                break;
            case 3:
                ponerImagen(rutaImagen[estado]);
                JOptionPane.showMessageDialog(this, "He aceptado la cadena con los siguientes datos: \n Toke:" + token +
                        " valor del lexema: " +  valorLexema  + " ER: " + obtenerER(token));
                modelo.addElement(valorLexema);
                salidaList.setModel(modelo);
                int resul = lexico.analizar(leido);
                cambiarEtiqueta(resul);
                resultadoPrevio = lexico.getEstado();
                if(resul == 0) ponerImagen(rutaImagen[lexico.getEstado()]);
                if(resul == 1){
                    ponerImagen(rutaImagen[lexico.getEstado()]);
                    JOptionPane.showMessageDialog(this, lexico.getMensajeError());
                }
                if(resul == 2){
                    ponerImagen(rutaImagen[lexico.getEstado()]);
                    pane = JOptionPane.showConfirmDialog(this,"Has llegado a un estado de aceptación con los siguientes Datos: \n Último caracter leído: "+ leido +"\n"
                    +"token: "+  obtenerToken(lexico.getEstado()) + "\n"+ "Valor del Lexema: " + lexico.getValorLexema() + "\n Expresión Regular: " + obtenerER(obtenerToken(lexico.getEstado()))+ "\n Deseas continuar?");
                    if(pane == 1){
                        System.out.println("Hola Mundo");
                        modelo.addElement(lexico.getValorLexema());
                        salidaList.setModel(modelo);
                        lexico = new Analizador();
                        ponerImagen(rutaImagen[lexico.getEstado()]);
                        resultadoPrevio = lexico.getEstado();
                    }
                }
                break;
                
        }
                
                resultadoPrevio = lexico.getEstado();
    }

    private String obtenerER(int token) {
        String er = "";
        switch(token){
            case 50:
                er = "Identificador";
                break;
            case 100:
                er = "Numero real en punto flotante";
                break;
        }
        return er;
    }

    private int obtenerToken(int estado) {
        int token = 0;
        switch(estado){
            case 1:
                token = 50;
                break;
            case 4:
                token = 100;
                break;
            case 7:
                token = 100;
                break;
                
        }
        return token;
    }

    private void cambiarEtiqueta(int resul) {
        if(resul==resultadoPrevio){
            estadoLb.setText("Me quedé en el mismo estado");
        }else{
            estadoLb.setText("");
        }
    
    }


   
}
