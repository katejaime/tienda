
package Controllers;

import DTOs.ClienteDto;
import DAOs.ClienteDao;
import java.util.*;

public class ClienteCtrl {
    
    private ClienteDao clienteDao;

    public ClienteCtrl() {
        clienteDao = new ClienteDao();
    }   
    
    public ArrayList<ClienteDto> getAll() {       
        try {
            clienteDao = new ClienteDao();
            return clienteDao.getAll();
        } catch (Exception ex) {
            System.out.println("Error en clienteDao.getAll(): " + ex.getMessage());
            return new ArrayList<>();
        }
    }

    public boolean add(ClienteDto dtoCliente) {
        try {
            clienteDao = new ClienteDao();
            return clienteDao.add(dtoCliente);
        } catch (Exception ex) {
            System.out.println("Error en clienteDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            clienteDao = new ClienteDao();
            return clienteDao.delete(id);
        } catch (Exception ex) {
            System.out.println("Error en clienteDao.delete(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean update(ClienteDto dtoCliente) {
        try {
            clienteDao = new ClienteDao();
            return clienteDao.update(dtoCliente);
        } catch (Exception ex) {
            System.out.println("Error en clienteDao.update(): " + ex.getMessage());
            return false;
        }
    }
    
    
}
