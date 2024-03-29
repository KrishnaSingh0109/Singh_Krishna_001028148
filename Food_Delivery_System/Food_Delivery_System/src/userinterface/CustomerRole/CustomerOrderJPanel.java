/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Item;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class CustomerOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    Order or;
    double totalPrice = 0.0;
    Customer customer;
    private Restaurant restaurant;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerOrderJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        initComponents();        
        this.userProcessContainer = userProcessContainer;        
        this.userAccount = account; 
        this.ecoSystem = ecoSystem;
        getCustomerObject();
        populateRestaurantNames();
        
        or = new Order(); 
    }
    
    public void getCustomerObject(){
    for(Customer c : ecoSystem.getCustomerDirectory().getCustomerList()){
        if((c.getUserAccount().getEmployee().getName()).equalsIgnoreCase(userAccount.getEmployee().getName())){
            this.customer = c;
            lblCustomerName.setText(c.getCustName());
            
        }
    }
     
    }
    
    public void populateRestaurantNames(){
        cbxRestaurantNames.removeAllItems();
        for(Restaurant r : ecoSystem.getRestaurantDirectory().getRestaurentList()){
            cbxRestaurantNames.addItem(r.toString());
            
        }
        
    }
    
    
    public void populateRequestTable(){
        for(Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurentList()){
           if((restaurant.getRestaurentName()).equalsIgnoreCase(cbxRestaurantNames.getSelectedItem().toString())){
                DefaultTableModel model = (DefaultTableModel) tblRestauranMenu.getModel();
                model.setRowCount(0);
                for (Item i : restaurant.getItemList()) {
                    Object[] row = new Object[3];
                    row[0] = i;
                    row[1] = i.getItemPrice();
                    row[2] = i.getTotalQuantity();
                    model.addRow(row);
                }
           } 
        }
    }
    
    public void populateCart(Order order){
        
                DefaultTableModel model = (DefaultTableModel) tblOrderCart.getModel();
                model.setRowCount(0);
                for(Item i : (order.getItemList()).keySet()){
                     Object[] row = new Object[3];
                    row[0] = i.getItemName();
                    row[1] = i.getItemPrice();
                    row[2] = (order.getItemList()).get(i);
                    model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestauranMenu = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        cbxRestaurantNames = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnAddtoCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderCart = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCustomerName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        tblRestauranMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Item Price", "Quantity Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(tblRestauranMenu);

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose Restaurent:");

        btnAddtoCart.setText("AddtoCart");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });

        tblOrderCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
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
        jScrollPane2.setViewportView(tblOrderCart);

        jButton1.setText("Proceed to Checkout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Your Cart");

        jLabel3.setText("Quantity:");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(cbxRestaurantNames, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(166, 166, 166)
                                    .addComponent(refreshTestJButton))
                                .addComponent(lblCustomerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddtoCart)
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 182, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxRestaurantNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshTestJButton))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddtoCart)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = tblRestauranMenu.getSelectedRow();
         int itemQuantity = Integer.parseInt(txtQuantity.getText());
         
        if (selectedRow >= 0) {
            Item item = (Item) tblRestauranMenu.getValueAt(selectedRow, 0);
            if(itemQuantity > 0 && itemQuantity <= item.getTotalQuantity()){
                int temp = item.getTotalQuantity();
                item.setTotalQuantity(temp - itemQuantity);
                totalPrice += item.getItemPrice()*itemQuantity;
                if((or.getItemList()).containsKey(item)){
                    (or.getItemList()).put(item, (or.getItemList()).get(item) + itemQuantity);
                }
                else{
                (or.getItemList()).put(item, itemQuantity);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Quantity selected mush not exceed total quantity available");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a item to add");
        }
        
        populateCart(or);
    }//GEN-LAST:event_btnAddtoCartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        or.setOrderTotal(totalPrice);
        String res = cbxRestaurantNames.getSelectedItem().toString();
        for(Restaurant r : ecoSystem.getRestaurantDirectory().getRestaurentList()){
            if(r.getRestaurentName().equalsIgnoreCase(res)){
                this.restaurant = r;
            }
        }
        // TODO add your handling code here:
        PlaceOrderJPanel placeOrderJPanel = new PlaceOrderJPanel(userProcessContainer, userAccount,or, ecoSystem,customer,restaurant);
        userProcessContainer.add("placeOrderJPanel", placeOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerWorkAreaJPanel customerWorkAreaJPanel = (CustomerWorkAreaJPanel) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cbxRestaurantNames;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTable tblOrderCart;
    private javax.swing.JTable tblRestauranMenu;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
