/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconverter2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author wyki
 */
public class Mainpage extends javax.swing.JFrame {

    /**
     * Creates new form Mainpage
     */
    public Mainpage() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Start Value in:");

        jComboBox2.setMaximumSize(new java.awt.Dimension(170, 20));
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel4.setText("Start Value: ");

        jButton1.setText("Get Table");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Show Difference");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jComboBox1.setMaximumSize(new java.awt.Dimension(170, 20));

        jComboBox3.setMaximumSize(new java.awt.Dimension(170, 20));

        jLabel1.setText("Start:");

        jLabel6.setText("Stop:");

        jLabel7.setText("View Change In Interval:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(158, 158, 158))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel3.setText("Working with these Currencies:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Add From Api");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Add Manually");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            Scanner inFile = new Scanner(new File("addedcurrencies.txt")).useDelimiter("\n");
            String timestamp = inFile.nextLine();           
            jLabel5.setText(timestamp);
            jLabel3.setVisible(false);  
            
        }catch(NoSuchElementException ex){            
            JOptionPane.showMessageDialog(rootPane,"No Currencies Found: \n Add New Currencies using 'Add From Api' or 'Add Manually'", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() +" for the timestamp label", "Warning", JOptionPane.WARNING_MESSAGE); 
        }
        
        /**
         * Hide the timestamp panel
         */
        jPanel4.setVisible(false);
        
        /**
         * load the available timestamps into a container
         */
        try{
            
            Scanner inFile2 = new Scanner(new File("timestamped.txt")).useDelimiter("\n");                       
            String dataitem;          
            while(inFile2.hasNext()){
                dataitem = inFile2.next();
                String[] g = dataitem.split(":");
                if(!g[0].startsWith("Time")){                     
                     continue;
                }else{                        
                    jComboBox1.addItem(dataitem);
                    jComboBox3.addItem(dataitem);                   
                }               
            }           
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage()+" for the added timestamps file", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try{
            String startvalue = (String)jComboBox2.getSelectedItem();
            String[] a = startvalue.split(" ");             
           
            
            
            Scanner inFile = new Scanner(new File("currencies.txt")).useDelimiter(":|\n");
            inFile.nextLine();
            
            List<String> currencydetails = new ArrayList<String>();
            Fetching p = new Fetching();
            while(inFile.hasNext()){
                p.first = inFile.next();                
                p.second = inFile.next();
                currencydetails.add(p.first);  
                currencydetails.add(p.second);
            }
            
            /**
             * this gets the currencies that the user is working with
             * and stores them in a list
             */
            ComboBoxModel cbm = jComboBox2.getModel();            
            List<String> dataincbm = new ArrayList<String>();
             String selectedvalue = (String)jComboBox2.getSelectedItem();
             dataincbm.add(selectedvalue);
            for(int i = 0; i < cbm.getSize(); i++){
                String tempvalue = (String)cbm.getElementAt(i);                 
                if (selectedvalue.equals(tempvalue)){
                    continue;
                }else{
                    dataincbm.add(tempvalue);  
                }
            }
            String[] valuesarray, valuesarraykey, columnheader;
            int dta = cbm.getSize();
            //store the values of the currency
            valuesarray = new String[dta];
            //store the currency code
            valuesarraykey = new String[dta];
            columnheader = new String[dta+1];
            for (int i = 0; i < dataincbm.size(); i++){
                String gtvalue = dataincbm.get(i);
                String[] gt = gtvalue.split(" ");
                valuesarray[i] = findString(gt[0],currencydetails);
                valuesarraykey[i] = gt[0];
            }
            
           
            
            
            /**this captures the money at hand you currently have 
             */
            String z = jTextField1.getText();
            double y = Double.parseDouble(z);
            
             DecimalFormat df = new DecimalFormat("####0.00");
            //generate table 
            jLabel3.setVisible(true);            
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            columnheader[0] = "Currencies";
           for(int i = 1; i < columnheader.length; i++){
               columnheader[i] = valuesarraykey[i-1];//populate columnheader with currency codes for the table headers
           }
            for (int i = 0; i < valuesarray.length; i++){
                
                model.setColumnCount(valuesarray.length+1);
                model.setColumnIdentifiers(columnheader);
                model.setRowCount(valuesarray.length);
                jTable2.setValueAt(valuesarraykey[i], i,0);
            }
            for (int i = 0; i < valuesarray.length; i++ ){
                               
                for (int j = 0; j < valuesarray.length; j++){                    
                    double convertedvalue = (Double.parseDouble(valuesarray[i])/Double.parseDouble(valuesarray[j])) ;

                     jTable2.setValueAt(df.format(convertedvalue), i, j+1);
                   
                }             
            }
           
            jPanel4.setVisible(true);
        }catch(Exception ex){
           
            JOptionPane.showMessageDialog(rootPane, "Currency Collide \n The Selected Value Found a Duplicate in the List", "Warning", JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        Addcurrenciesfromfetchedapi gog = new Addcurrenciesfromfetchedapi();
        gog.run();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
       
            
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeVisible
        // TODO add your handling code here:
        if (jComboBox2.getItemCount() != 0){
            DefaultComboBoxModel cmbd = new DefaultComboBoxModel();
           jComboBox2.setModel(cmbd);
           jComboBox2.removeAllItems();
           
           /**
            * add the new items
            */
           try{
                Scanner InFile = new Scanner(new File("addedcurrencies.txt")).useDelimiter(",");
                String timestamp = InFile.nextLine();
                String itemsfromfile;
                while(InFile.hasNext()){
                     itemsfromfile = InFile.next();
                        /**
                        * This displays the currencies that you have added allowing
                        * you to choose the starting currency
                        */
                      jComboBox2.addItem(itemsfromfile); 



                    }
                jLabel5.setText(timestamp);
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE); 
                }
        }else{
            try{
                Scanner InFile = new Scanner(new File("addedcurrencies.txt")).useDelimiter(",");
                String timestamp = InFile.nextLine();
                String itemsfromfile;
                while(InFile.hasNext()){
                     itemsfromfile = InFile.next();
                        /**
                        * This displays the currencies that you have added allowing
                        * you to choose the starting currency
                        */
                      jComboBox2.addItem(itemsfromfile); 



                    }
                jLabel5.setText(timestamp);
            }catch(Exception ex){
                 JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE); 
                }
        }
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeVisible

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        Addcurrenciesmanually ggf = new Addcurrenciesmanually();
        ggf.run();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        /**
         * solves the timestamp issue
         */
        
        /**
         * get selected values from comboboxes
         */
        String timestamp1 = (String)jComboBox1.getSelectedItem();
        String timestamp2 = (String)jComboBox3.getSelectedItem();
        
        
        /**
         * get data from file
         */
        try{
            
            Scanner inFile2 = new Scanner(new File("timestamped.txt")).useDelimiter("\n");
            List<String> timestampsfromfile = new LinkedList<>();
            List<String> currenciesfromfile = new ArrayList<>();
            String dataitem;
            int i = 0;
            while(inFile2.hasNext()){
                dataitem = inFile2.next();
                String[] g = dataitem.split(":");
                if(!g[0].startsWith("Time")){     
                    currenciesfromfile.add(Integer.toString(i));
                    currenciesfromfile.add(dataitem);
                }else{                   
                    timestampsfromfile.add(i,dataitem);                    
                    i++;
                }
            }
            
            /**
             * retrieve index of chosen timestamps
             */
            
            int index1 = 0;
            int index2 = 0;
            for(int j = 0; j < timestampsfromfile.size(); j++){
                String tempvalue = timestampsfromfile.get(j);
                if(tempvalue.equals(timestamp1)){
                    index1 = j;
                }else if(tempvalue.equals(timestamp2)){
                    index2 = j;
                }
            }
            
            /**
             * use index to retrieve currencies associated with it in currenciesfromfile
             */
            ComboBoxModel selectedcurr = jComboBox2.getModel();
            List<String> selectedcurrencies = new ArrayList<>();
            for(int a = 0; a < selectedcurr.getSize(); a++){
                selectedcurrencies.add((String)selectedcurr.getElementAt(a));
            }
            List<String> startcurrencies = new ArrayList<>();
            List<String> endcurrencies = new ArrayList<>();
            for (int k = 0; k < currenciesfromfile.size(); k++){
                String tempvalue = currenciesfromfile.get(k);
                if (tempvalue.equals(Integer.toString(index1))){
                    startcurrencies.add(currenciesfromfile.get(k + 1));                   
                }else if(tempvalue.equals(Integer.toString(index2))){
                    endcurrencies.add(currenciesfromfile.get(k + 1));                    
                }else{
                    continue;
                }
            }
             timestampDiff(selectedcurrencies,startcurrencies,endcurrencies);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }
    
    public String findString(String value, List dataset){
        for (int i = 0; i < dataset.size(); i++){
           if (value.equals(dataset.get(i))){
               return (String)dataset.get(i + 1);
           }            
        }
        return value+" not found";
    }
    
  /*
   * blueprint for storing data in an associative format
   */      
  class Fetching{  
   String first;
   String second;
  }
   
  public void timestampDiff(List data, List collection1, List collection2){
      DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
      String[] columnheader = new String[2];
      columnheader[0] = "Start";
      columnheader[1] = "End";
      model.setColumnIdentifiers(columnheader);
      model.setRowCount(data.size());
      
      for (int i = 0; i < data.size(); i++){
          String tempvalue = (String)data.get(i);
          //System.out.println(tempvalue);
          String[]a = tempvalue.split(" ");
          for (int k = 0;k < collection1.size(); k++){
                String tempvalue2 = (String)collection1.get(k);
                if(tempvalue2.startsWith(a[0])){
                    //System.out.println("Collection 1: "+tempvalue2);
                    jTable2.setValueAt(tempvalue2, k, 0);
                }
          }
          for (int k = 0;k < collection2.size(); k++){
                String tempvalue2 = (String)collection2.get(k);
                if(tempvalue2.startsWith(a[0])){
                    //System.out.println("Collection 2: "+tempvalue2);
                    jTable2.setValueAt(tempvalue2, k, 1);
                }
          }
      }
      
      
      
      
      
      
      
      
      
//       for (int i = 0; i < data.size(); i++){
//           String currentvalue = (String)data.get(i);
//           String[] a = currentvalue.split(" ");
//           //System.out.println("vhgjsgvhjsvghjgsv"+ i);
//           for (int k = 0; k < collection1.size(); k++){
//               String tempvalue = (String)collection1.get(i);
//               //String[] b = tempvalue.split(" ");
//               if (tempvalue.startsWith(a[0])){
//                   jTable2.setValueAt(tempvalue, k, 0);
//                   System.out.println(tempvalue);
//               }else{
//                   System.out.println(tempvalue+" : "+a[0]);
//               }
//           }
//           for (int k = 0; k < collection2.size(); k++){
//               String tempvalue = (String)collection2.get(i);
//               //System.out.println(k);
//              if (tempvalue.startsWith(a[0])){
//                  jTable2.setValueAt(tempvalue, k, 1);
//                  System.out.println(tempvalue);
//               }
//           }
//       }
    
  }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

