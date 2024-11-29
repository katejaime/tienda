/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ClienteCtrl;
import Controllers.PedidoCtrl;
import DTOs.ClienteDto;
import DTOs.PedidoDto;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Katerine
 */
public class PedidosInternalFrame extends javax.swing.JInternalFrame {
    
    private PedidoCtrl pedidoCtrl;
    private PedidoDto pedidoDto;
    private ClienteCtrl clienteCtrl;
    private JDesktopPane desktopPanel;
    private ArrayList<ClienteDto> listaClientes;

    /**
     * Creates new form ClientesInternalFrame
     * @param desktopPanel
     */
    public PedidosInternalFrame(JDesktopPane desktopPanel) {
        initComponents();
        cargarClientes();
        cargarPedidos();
        this.desktopPanel = desktopPanel;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBoxClientes = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonDetalle = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("GestionClientes");
        setMinimumSize(new java.awt.Dimension(600, 650));
        setPreferredSize(new java.awt.Dimension(600, 650));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gestión Pedidos");

        jLabel2.setText("ID Cliente");

        jLabel5.setText("Total");

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pedido", "ID Cliente", "Total", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedidos);
        if (jTablePedidos.getColumnModel().getColumnCount() > 0) {
            jTablePedidos.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jComboBoxClientes.setModel(jComboBoxClientes.getModel());

        jLabel7.setText("Fecha");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseClicked(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLimpiarMouseClicked(evt);
            }
        });

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBorrarMouseClicked(evt);
            }
        });

        jButtonDetalle.setText("Detalle");
        jButtonDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDetalleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(jButtonDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel1)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 600, 679);
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidosMouseClicked
        // TODO add your handling code here:        
        int row = jTablePedidos.rowAtPoint(evt.getPoint());
        int col = jTablePedidos.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
           // TODO: handle cell click
           pedidoDto = new PedidoDto();
           
           pedidoDto.setId_pedido((int)jTablePedidos.getValueAt(row, 0));
           pedidoDto.setId_cliente((int)jTablePedidos.getValueAt(row, 1));
           pedidoDto.setTotal(Double.parseDouble(jTablePedidos.getValueAt(row, 2).toString()));
           pedidoDto.setFecha_pedido(jTablePedidos.getValueAt(row, 3).toString());         
           
           txtTotal.setText(String.valueOf(pedidoDto.getTotal()));
           txtFecha.setText(pedidoDto.getFecha_pedido());
           
           for(int i = 0;i<=listaClientes.size();i++){
               if(listaClientes.get(i).getIdCliente() == pedidoDto.getId_cliente()){
                   jComboBoxClientes.setSelectedIndex(i);
                   break;
               }
           }
           
        }
    }//GEN-LAST:event_jTablePedidosMouseClicked

    private void jButtonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimpiarMouseClicked
        // TODO add your handling code here:
        clean();
        cargarPedidos();
    }//GEN-LAST:event_jButtonLimpiarMouseClicked

    private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
        // TODO add your handling code here:
        pedidoCtrl = new PedidoCtrl();
        
        if(pedidoDto!=null){
            extraerFormulario();
            
            if(pedidoCtrl.update(pedidoDto)){
                JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar el registro");
            }
        }
        else {            
            pedidoDto = new PedidoDto();
            extraerFormulario();
            if(pedidoCtrl.add(pedidoDto)){
                JOptionPane.showMessageDialog(null, "Registro creado exitosamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al crear el registro");
            }
        }
        
        cargarPedidos();
        clean();
    }//GEN-LAST:event_jButtonGuardarMouseClicked

    private void jButtonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBorrarMouseClicked
        // TODO add your handling code here:
        if(pedidoDto!=null){
            pedidoCtrl = new PedidoCtrl();
            int id_delete_pedido = pedidoDto.getId_pedido();
            if(pedidoCtrl.delete(id_delete_pedido)){
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");                
                cargarPedidos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
            }
            clean();           
            
        } else{
            JOptionPane.showMessageDialog(null, "No existe ningún pedido seleccionado.");
        }
    }//GEN-LAST:event_jButtonBorrarMouseClicked

    private void jButtonDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDetalleMouseClicked
        // TODO add your handling code here:
        if(pedidoDto!=null){
          DetallePedidoInternalFrame detallePedidoPanel = new DetallePedidoInternalFrame(pedidoDto);
          desktopPanel.add(detallePedidoPanel);
          detallePedidoPanel.setVisible(true);           
        } else{
            JOptionPane.showMessageDialog(null, "No existe ningún pedido seleccionado.");
        }      
    }//GEN-LAST:event_jButtonDetalleMouseClicked
    
    private void cargarPedidos(){
        pedidoCtrl = new PedidoCtrl();        
        JTable table = jTablePedidos;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        ArrayList<PedidoDto> lista_pedidos = pedidoCtrl.getAll();
        for(PedidoDto pedido:lista_pedidos){
            Object [] fila_pedido = {pedido.getId_pedido(),pedido.getId_cliente(),pedido.getTotal(),pedido.getFecha_pedido()}; 
            model.addRow(fila_pedido);
        }          
    }
    
    private void cargarClientes(){
        clienteCtrl = new ClienteCtrl();
        listaClientes = clienteCtrl.getAll();
        for(ClienteDto cliente:listaClientes){
            jComboBoxClientes.addItem(String.valueOf(cliente.getIdCliente()));
        }
    }
    
    private void extraerFormulario(){
        pedidoDto.setTotal(Double.parseDouble(txtTotal.getText()));
        pedidoDto.setFecha_pedido(txtFecha.getText());
        pedidoDto.setId_cliente(Integer.parseInt(jComboBoxClientes.getSelectedItem().toString()));
    }
    
    private void clean(){
        pedidoDto = null;
        txtTotal.setText("");
        txtFecha.setText("");
        jComboBoxClientes.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonDetalle;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
