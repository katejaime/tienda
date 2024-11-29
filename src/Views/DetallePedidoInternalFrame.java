/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.DetallePedidoCtrl;
import Controllers.PedidoCtrl;
import Controllers.ProductoCtrl;
import DTOs.ClienteDto;
import DTOs.DetallePedidoDto;
import DTOs.PedidoDto;
import DTOs.ProductoDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Katerine
 */
public class DetallePedidoInternalFrame extends javax.swing.JInternalFrame {
    
    private DetallePedidoDto detallePedidoDto;
    private DetallePedidoCtrl detallePedidoCtrl;
    private PedidoDto pedidoDto;
    private PedidoCtrl pedidoCtrl;
    private ProductoCtrl productoCtrl;   
    private ArrayList<ProductoDto> listaProductos;
    private ArrayList<DetallePedidoDto> lista_detalles_pedido;

    /**
     * Creates new form ClientesInternalFrame
     * @param detallePedidoDto
     */    
    public DetallePedidoInternalFrame(PedidoDto pedidoDto) {
        this.pedidoDto = pedidoDto;
        initComponents();
        cargarDetallesPedido();
        cargarProductos();
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
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetallesPedido = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBoxProductos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jLabelPedido = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("DetallePedido");
        setMinimumSize(new java.awt.Dimension(600, 650));
        setPreferredSize(new java.awt.Dimension(600, 650));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Detalle Pedido");

        jLabel2.setText("ID Producto");

        jLabel5.setText("Cantidad");

        jTableDetallesPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Detalle", "ID Pedido", "ID Producto", "Cantidad", "Precio Unitario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDetallesPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDetallesPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDetallesPedido);
        if (jTableDetallesPedido.getColumnModel().getColumnCount() > 0) {
            jTableDetallesPedido.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTableDetallesPedido.getColumnModel().getColumn(1).setPreferredWidth(1);
            jTableDetallesPedido.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        jComboBoxProductos.setModel(jComboBoxProductos.getModel());

        jLabel7.setText("Precio Unitario");

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarMouseClicked(evt);
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

        jLabelPedido.setText("ID Pedido: 1");

        jLabelTotal.setText("Total Pedido: 10000");

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
                                .addGap(237, 237, 237)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabelPedido)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 600, 679);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableDetallesPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDetallesPedidoMouseClicked
        // TODO add your handling code here: 
        int row = jTableDetallesPedido.rowAtPoint(evt.getPoint());
        int col = jTableDetallesPedido.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
           // TODO: handle cell click
           detallePedidoDto = new DetallePedidoDto();
           
           detallePedidoDto.setId_detalle((int)jTableDetallesPedido.getValueAt(row, 0));
           detallePedidoDto.setId_pedido((int)jTableDetallesPedido.getValueAt(row, 1));
           detallePedidoDto.setId_producto((int)jTableDetallesPedido.getValueAt(row, 2));
           detallePedidoDto.setCantidad((int)jTableDetallesPedido.getValueAt(row,3));
           detallePedidoDto.setPrecio_unitario(Double.parseDouble(jTableDetallesPedido.getValueAt(row, 4).toString()));;
                   
           
           txtCantidad.setText(String.valueOf(detallePedidoDto.getCantidad()));
           txtPrecioUnitario.setText(String.valueOf(detallePedidoDto.getPrecio_unitario()));
           
           for(int i = 0;i<=listaProductos.size();i++){
               if(listaProductos.get(i).getId_producto()== detallePedidoDto.getId_producto()){
                   jComboBoxProductos.setSelectedIndex(i);
                   break;
               }
           }
           
        }
        
    }//GEN-LAST:event_jTableDetallesPedidoMouseClicked

    private void jButtonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarMouseClicked
        // TODO add your handling code here:
        detallePedidoCtrl = new DetallePedidoCtrl();        
        if(detallePedidoDto!=null){
            extraerFormulario();
            
            if(detallePedidoCtrl.update(detallePedidoDto)){                
                JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al actualizar el registro");
            }
        }
        else {            
            detallePedidoDto = new DetallePedidoDto();
            extraerFormulario();
            if(detallePedidoCtrl.add(detallePedidoDto)){
                JOptionPane.showMessageDialog(null, "Registro creado exitosamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al crear el registro");
            }
        }
        
        cargarDetallesPedido();
        calcularTotalPedido();
        clean();
        
    }//GEN-LAST:event_jButtonAgregarMouseClicked

    private void jButtonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBorrarMouseClicked
        // TODO add your handling code here:
        if(detallePedidoDto!=null){
            detallePedidoCtrl = new DetallePedidoCtrl();
            int id_delete_detalle = detallePedidoDto.getId_detalle();
            if(detallePedidoCtrl.delete(id_delete_detalle)){
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");                
                cargarDetallesPedido();
                calcularTotalPedido();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
            }
            clean();           
            
        } else{
            JOptionPane.showMessageDialog(null, "No existe ningún pedido seleccionado.");
        }
        
    }//GEN-LAST:event_jButtonBorrarMouseClicked

    private void jButtonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimpiarMouseClicked
        // TODO add your handling code here:
        clean();
    }//GEN-LAST:event_jButtonLimpiarMouseClicked
    
    private void cargarDetallesPedido(){
        detallePedidoCtrl = new DetallePedidoCtrl();
        JTable table = jTableDetallesPedido;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().removeAllElements();
        lista_detalles_pedido = detallePedidoCtrl.getDetallesPedido(pedidoDto.getId_pedido());
        for(DetallePedidoDto detalle:lista_detalles_pedido){
            Object [] fila_producto = {detalle.getId_detalle(),detalle.getId_pedido(),detalle.getId_producto(),detalle.getCantidad(),detalle.getPrecio_unitario()}; 
            model.addRow(fila_producto);
        }
        jLabelPedido.setText("ID Pedido: "+String.valueOf(pedidoDto.getId_pedido()));
        jLabelTotal.setText("Total Pedido: "+String.valueOf(pedidoDto.getTotal()));
    }
    
    private void cargarProductos(){
        productoCtrl = new ProductoCtrl();
        listaProductos = productoCtrl.getAll();
        for(ProductoDto producto:listaProductos){
            jComboBoxProductos.addItem(String.valueOf(producto.getId_producto()));
        }
        
    }
    
    private void extraerFormulario(){
        detallePedidoDto.setId_pedido(pedidoDto.getId_pedido());
        detallePedidoDto.setCantidad(Integer.parseInt(txtCantidad.getText()));
        detallePedidoDto.setPrecio_unitario(Double.parseDouble(txtPrecioUnitario.getText()));
        detallePedidoDto.setId_producto(Integer.parseInt(jComboBoxProductos.getSelectedItem().toString()));
    }
    
    private void calcularTotalPedido(){
        pedidoCtrl = new PedidoCtrl();
        double total = 0.0;
        for(DetallePedidoDto detalle:lista_detalles_pedido){
            total += detalle.getPrecio_unitario();
        }
        pedidoDto.setTotal(total);
        if(pedidoCtrl.update(pedidoDto)){
            JOptionPane.showMessageDialog(null, "Pedido Actualizado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el pedido");
        }
        
        jLabelTotal.setText("Total Pedido: "+String.valueOf(pedidoDto.getTotal()));        
    }
    
    private void clean(){
        detallePedidoDto = null;
        txtCantidad.setText("");
        txtPrecioUnitario.setText("");
        jComboBoxProductos.setSelectedIndex(0);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelPedido;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDetallesPedido;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecioUnitario;
    // End of variables declaration//GEN-END:variables
}
