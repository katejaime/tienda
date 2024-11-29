
package DAOs;

import DB.ConectionDB;
import DTOs.PedidoDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class PedidoDao {
    
    private final String tableName = "Pedidos";
    private ConectionDB conection;
    private PedidoDto dtoPedidos;

    public PedidoDao() {  
    }
    
    public ArrayList<PedidoDto> getAll() {
        try {
            conection = new ConectionDB();
            String query = "SELECT * FROM " + tableName;
            ResultSet rs = conection.find(query);
            ArrayList<PedidoDto> Pedidos = new ArrayList<>();
            while (rs.next()) {
                dtoPedidos = new PedidoDto();
                dtoPedidos.setId_pedido(rs.getInt("id_pedido"));
                dtoPedidos.setId_cliente(rs.getInt("id_cliente"));;
                dtoPedidos.setFecha_pedido(rs.getString("fecha_pedido"));
                dtoPedidos.setTotal(rs.getDouble("total"));
                Pedidos.add(dtoPedidos);
            }
            conection.closeConnection();
            return Pedidos;
        } catch (RuntimeException | SQLException ex) {

            System.out.println("Error en pedidosDao.getAll(): " + ex.getMessage());
            return null;
        }
    }
    
    public boolean add(PedidoDto dtoPedidos) {
        try {
            conection = new ConectionDB();
            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO ");
            query.append(tableName);
            query.append("(id_cliente, fecha_pedido, total) VALUES(");
            query.append(dtoPedidos.getId_cliente());
            query.append(",'");
            query.append(dtoPedidos.getFecha_pedido());
            query.append("',");
            query.append(dtoPedidos.getTotal());
            query.append(")"); 
            System.out.print(query.toString());
            boolean res = conection.execute(query.toString());
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en pedidosDao.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en pedidosDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean update(PedidoDto dtoPedidos) {
        try {
            conection = new ConectionDB();
            StringBuilder query = new StringBuilder();
            query.append("UPDATE ");
            query.append(tableName);
            query.append(" SET fecha_pedido = '");
            query.append(dtoPedidos.getFecha_pedido());
            query.append("', total =  ");
            query.append(dtoPedidos.getTotal());
            query.append(", id_cliente = ");
            query.append(dtoPedidos.getId_cliente());
            query.append(" WHERE id_pedido = ");
            query.append(dtoPedidos.getId_pedido());
            boolean res = conection.execute(query.toString());
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en pedidosDao.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en pedidosDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            conection = new ConectionDB();
            String query = "DELETE FROM " + tableName + " WHERE id_pedido = " + id;
            boolean res = conection.execute(query);
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en pedidosDao.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en pedidosDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    
    
}
