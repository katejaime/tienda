
package DAOs;

import DB.ConectionDB;
import DTOs.DetallePedidoDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class DetallePedidoDao {
    
    private final String tableName = "detalle_Pedido";
    private ConectionDB conection;
    private DetallePedidoDto dtoDetallePedido;

    public DetallePedidoDao() {  
    }
    
    public ArrayList<DetallePedidoDto> getAll() {
        try {
            conection = new ConectionDB();
            String query = "SELECT * FROM " + tableName;
            ResultSet rs = conection.find(query);
            ArrayList<DetallePedidoDto> detallePedido = new ArrayList<>();
            while (rs.next()) {
                dtoDetallePedido = new DetallePedidoDto();
                dtoDetallePedido.setId_detalle(rs.getInt("id_detalle"));
                dtoDetallePedido.setId_pedido(rs.getInt("id_pedido"));
                dtoDetallePedido.setId_producto(rs.getInt("id_producto"));
                dtoDetallePedido.setCantidad(rs.getInt("cantidad"));
                dtoDetallePedido.setPrecio_unitario(rs.getDouble("precio_unitario"));
                detallePedido.add(dtoDetallePedido);
            }
            conection.closeConnection();
            return detallePedido;
        } catch (RuntimeException | SQLException ex) {

            System.out.println("Error en detallePedidoDao.getAll(): " + ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<DetallePedidoDto> getDetallesPedido(int idPedido) {
        try {
            conection = new ConectionDB();
            String query = "SELECT * FROM " + tableName + " WHERE id_pedido = " + String.valueOf(idPedido) ;
            ResultSet rs = conection.find(query);
            ArrayList<DetallePedidoDto> detallePedido = new ArrayList<>();
            while (rs.next()) {
                dtoDetallePedido = new DetallePedidoDto();
                dtoDetallePedido.setId_detalle(rs.getInt("id_detalle"));
                dtoDetallePedido.setId_pedido(rs.getInt("id_pedido"));
                dtoDetallePedido.setId_producto(rs.getInt("id_producto"));
                dtoDetallePedido.setCantidad(rs.getInt("cantidad"));
                dtoDetallePedido.setPrecio_unitario(rs.getDouble("precio_unitario"));
                detallePedido.add(dtoDetallePedido);
            }
            conection.closeConnection();
            return detallePedido;
        } catch (RuntimeException | SQLException ex) {

            System.out.println("Error en detallePedidoDao.getAll(): " + ex.getMessage());
            return null;
        }
    }
    
    public boolean add(DetallePedidoDto dtoDetallePedido) {
        try {
            conection = new ConectionDB();
            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO ");
            query.append(tableName);
            query.append("(id_pedido, id_producto, cantidad, precio_unitario) VALUES(");
            query.append(dtoDetallePedido.getId_pedido());
            query.append(", ");                      
            query.append(dtoDetallePedido.getId_producto());
            query.append(", ");
            query.append(dtoDetallePedido.getCantidad());
            query.append(", ");
            query.append(dtoDetallePedido.getPrecio_unitario());
            query.append(")"); 
            System.out.print(query.toString());
            boolean res = conection.execute(query.toString());
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en detallePedidoDao.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en detallePedidoDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean update(DetallePedidoDto dtoDetallePedido) {
        try {
            conection = new ConectionDB();
            StringBuilder query = new StringBuilder();
            query.append("UPDATE ");
            query.append(tableName);
            query.append(" SET cantidad = '");
            query.append(dtoDetallePedido.getCantidad());
            query.append("', precio_unitario =  '");
            query.append(dtoDetallePedido.getPrecio_unitario());
            query.append("', id_producto = '");
            query.append(dtoDetallePedido.getId_producto());
            query.append("', id_pedido =  '");
            query.append(dtoDetallePedido.getId_pedido());
            query.append("','");
            query.append(" WHERE id_detalle = ");
            query.append(dtoDetallePedido.getId_detalle());
            boolean res = conection.execute(query.toString());
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en detallePedidoDao.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en detallePedidoDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            conection = new ConectionDB();
            String query = "DELETE FROM " + tableName + " WHERE id_detalle = " + id;
            boolean res = conection.execute(query);
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en detallePedidoDao.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en detallePedidoDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    
    
}
