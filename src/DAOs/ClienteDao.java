
package DAOs;

import DB.ConectionDB;
import DTOs.ClienteDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ClienteDao {
    
    private final String tableName = "Clientes";
    private ConectionDB conection;
    private ClienteDto dtoCliente;

    public ClienteDao() {  
    }
    
    public ArrayList<ClienteDto> getAll() {
        try {
            conection = new ConectionDB();
            String query = "SELECT * FROM " + tableName;
            ResultSet rs = conection.find(query);
            ArrayList<ClienteDto> clientes = new ArrayList<>();
            while (rs.next()) {
                dtoCliente = new ClienteDto();
                dtoCliente.setIdCliente(rs.getInt("id_cliente"));
                dtoCliente.setNombre(rs.getString("nombre"));
                dtoCliente.setApellido(rs.getString("apellido"));
                dtoCliente.setEmail(rs.getString("email"));
                dtoCliente.setDireccion(rs.getString("direccion"));
                dtoCliente.setTelefono(rs.getString("telefono"));
                clientes.add(dtoCliente);
            }
            conection.closeConnection();
            return clientes;
        } catch (RuntimeException | SQLException ex) {

            System.out.println("Error en clienteDao.getAll(): " + ex.getMessage());
            return null;
        }
    }
    
    public boolean add(ClienteDto dtoCliente) {
        try {
            conection = new ConectionDB();
            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO ");
            query.append(tableName);
            query.append("(nombre, apellido, email, direccion, telefono) VALUES('");
            query.append(dtoCliente.getNombre());
            query.append("', '");
            query.append(dtoCliente.getApellido());
            query.append("', '");
            query.append(dtoCliente.getEmail());
            query.append("', '");
            query.append(dtoCliente.getDireccion());
            query.append("', '");
            query.append(dtoCliente.getTelefono());
            query.append("')"); 
            System.out.print(query.toString());
            boolean res = conection.execute(query.toString());
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en clienteDao.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en clienteDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean update(ClienteDto dtoCliente) {
        try {
            conection = new ConectionDB();
            StringBuilder query = new StringBuilder();
            query.append("UPDATE ");
            query.append(tableName);
            query.append(" SET nombre = '");
            query.append(dtoCliente.getNombre());
            query.append("', apellido =  '");
            query.append(dtoCliente.getApellido());
            query.append("', email = '");
            query.append(dtoCliente.getEmail());
            query.append("', direccion =  '");
            query.append(dtoCliente.getDireccion());
            query.append("', telefono =  '");
            query.append(dtoCliente.getTelefono());
            query.append("' ");
            query.append(" WHERE id_cliente = ");
            query.append(dtoCliente.getIdCliente());
            boolean res = conection.execute(query.toString());
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en clienteDao.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en clienteDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            conection = new ConectionDB();
            String query = "DELETE FROM " + tableName + " WHERE id_cliente = " + id;
            boolean res = conection.execute(query);
            conection.closeConnection();
            return res;
        } catch (RuntimeException ex) {
            System.out.println("Error en clienteDao.add(): " + ex.getMessage());
            return false;
        } catch (Exception ex) {
            System.out.println("Error en clienteDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    
    
}
