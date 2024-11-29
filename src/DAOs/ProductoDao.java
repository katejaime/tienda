
package DAOs;

import DB.ConectionDB;
import DTOs.ProductoDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ProductoDao {
    
    private final String tableName = "Productos";
    private ConectionDB conection;
    private ProductoDto dtoProductos;

    public ProductoDao() {  
    }
    
    public ArrayList<ProductoDto> getAll() {
        try {
            conection = new ConectionDB();
            String query = "SELECT * FROM " + tableName;
            ResultSet rs = conection.find(query);
            ArrayList<ProductoDto> Productos = new ArrayList<>();
            while (rs.next()) {
                dtoProductos = new ProductoDto();
                dtoProductos.setId_producto(rs.getInt("id_producto"));
                dtoProductos.setNombre(rs.getString("nombre"));;
                dtoProductos.setDescripcion(rs.getString("descripcion"));
                dtoProductos.setPrecio(rs.getDouble("precio"));
                dtoProductos.setStock(rs.getInt("stock"));
                Productos.add(dtoProductos);
            }
            conection.closeConnection();
            return Productos;
        } catch (RuntimeException | SQLException ex) {

            System.out.println("Error en productosDao.getAll(): " + ex.getMessage());
            return null;
        }
    }
    
    public boolean add(ProductoDto dtoProductos) {
        try {
            conection = new ConectionDB();
            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO ");
            query.append(tableName);
            query.append("(nombre, descripcion, precio, stock) VALUES('");
            query.append(dtoProductos.getNombre());
            query.append("', '");
            query.append(dtoProductos.getDescripcion());
            query.append("', '");
            query.append(dtoProductos.getPrecio());
            query.append("', '");
            query.append(dtoProductos.getStock());
            query.append("')"); 
            System.out.print(query.toString());
            boolean res = conection.execute(query.toString());
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en dtoProductos.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en dtoProductos.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean update(ProductoDto dtoProductos) {
        try {
            conection = new ConectionDB();
            StringBuilder query = new StringBuilder();
            query.append("UPDATE ");
            query.append(tableName);
            query.append(" SET nombre = '");
            query.append(dtoProductos.getNombre());
            query.append("', descripcion =  '");
            query.append(dtoProductos.getDescripcion());
            query.append("', precio = '");
            query.append(dtoProductos.getPrecio());
            query.append("', stock = '");
            query.append(dtoProductos.getStock());
            query.append(" WHERE id_producto = ");
            query.append(dtoProductos.getId_producto());
            boolean res = conection.execute(query.toString());
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en dtoProductos.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en dtoProductos.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            conection = new ConectionDB();
            String query = "DELETE FROM " + tableName + " WHERE id_producto = " + id;
            boolean res = conection.execute(query);
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en dtoProductos.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en dtoProductos.add(): " + ex.getMessage());
            return false;
        }
    }
    
    
    
}
