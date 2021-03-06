/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter2;

import static currencyconverter2.Fetchapiandparse.GroupResult;
import static currencyconverter2.Fetchapiandparse.sendRequest;
import static currencyconverter2.Fetchapiandparse.pingURL;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;


/**
 *
 * @author wyki
 */
public class Addcurrenciesfromfetchedapi extends javax.swing.JFrame {

    /**
     * Creates new form Addcurrenciesfromfetchedapi
     */
    public Addcurrenciesfromfetchedapi() {
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

        jPanel1 = new javax.swing.JPanel();
        Currencies = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Currency Calculator");
        setMaximumSize(new java.awt.Dimension(643, 455));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        Currencies.setViewportView(jList1);

        jScrollPane1.setViewportView(jList2);

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText(">>>");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("<<<");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jButton1.setText("<< Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Currencies, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(Currencies)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Set Currencies");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("CurrencyCalculator");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Addcurrenciesfromfetchedapi objbeb = new Addcurrenciesfromfetchedapi ();
        jList1.setToolTipText("List of Available Currencies");
        
        jList1.setListData(objbeb.getCurrencies());
        
    }//GEN-LAST:event_formWindowOpened

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        Addcurrenciesfromfetchedapi objbeb = new Addcurrenciesfromfetchedapi ();
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jList1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);        
        List<String> values = new ArrayList<String>(); 
        values = jList1.getSelectedValuesList();
        List<String> values2 = new ArrayList<String>();
        ListModel all = jList2.getModel();
        for(int i = 0; i < all.getSize(); i++){
            values2.add((String) all.getElementAt(i));
        }        
        values.addAll(values2);
        Set<String> stvalues = new HashSet<String>(values);
        String[] valuesarray = stvalues.toArray(new String[stvalues.size()]);        
        jList2.setListData(valuesarray);        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jList2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);        
        List<String> selectedvalues = new ArrayList<String>(); 
        selectedvalues = jList2.getSelectedValuesList();
        List<String> allvalues = new ArrayList<String>();
        ListModel all = jList2.getModel();
        for(int i = 0; i < all.getSize(); i++){
            allvalues.add((String) all.getElementAt(i));
        }
        allvalues.removeAll(selectedvalues);
        String[] valuesarray = allvalues.toArray(new String[allvalues.size()]);
        jList2.setListData(valuesarray);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try{
            Scanner inFile =  new Scanner(new File("currencies.txt")).useDelimiter("\n"); 
            String timestamp = inFile.nextLine();
            ListModel all = jList2.getModel();
           
             PrintWriter writer = new PrintWriter("addedcurrencies.txt","UTF-8");
             writer.println(timestamp);
            for(int i = 0; i < all.getSize(); i++){
                String currencyname = (String) all.getElementAt(i);
                
                    writer.print(currencyname);
                    writer.print(",");
               
            }
           
            
            
            writer.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE); 
        }
         this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Addcurrenciesfromfetchedapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addcurrenciesfromfetchedapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addcurrenciesfromfetchedapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addcurrenciesfromfetchedapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            
//        });
        
    }
    public void run() {
                
                
                if (pingURL("http://openexchangerates.org/api/latest.json?app_id=0f62edab50084331a7068ecf57021b2c")){
                String jsonresponse,jsoncurrencyname = new String();
                jsonresponse = sendRequest("http://openexchangerates.org/api/latest.json?app_id=0f62edab50084331a7068ecf57021b2c");
                jsoncurrencyname = sendRequest("http://openexchangerates.org/api/currencies.json?app_id=0f62edab50084331a7068ecf57021b2c");
                try {
                    GroupResult(jsonresponse);
                    //Loads the currency names
//                    parseCurrencies(jsoncurrencyname);
               
                } catch (IOException ex) {
                     Logger.getLogger(Addcurrenciesfromfetchedapi.class.getName()).log(Level.SEVERE, null, ex);                
                }   
                
                
                new Addcurrenciesfromfetchedapi().setVisible(true);
            }else{
                   JOptionPane.showMessageDialog(null, "No Internet Access", "Warning", JOptionPane.WARNING_MESSAGE);
                   new Addcurrenciesfromfetchedapi().setVisible(true);
            }
            
        }
    
    public String[] getCurrencies(){
        String token = "";
        List<String> temps = new ArrayList<String>();
        try {
            
            Scanner inFile1 = new Scanner(new File("currencyname.txt")).useDelimiter("\n");           
           // inFile1.nextLine();
            while (inFile1.hasNext()){
                token = inFile1.next();
                temps.add(token);
            }
            inFile1.close();
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Addcurrenciesfromfetchedapi.class.getName()).log(Level.SEVERE, null, ex);
        }
         String[] tempsArray = temps.toArray(new String[0]);
         return tempsArray;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Currencies;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

