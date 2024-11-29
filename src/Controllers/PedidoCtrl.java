
package Controllers;

import DTOs.PedidoDto;
import DAOs.PedidoDao;
import java.util.*;

public class PedidoCtrl {
    
    private PedidoDao pedidosDao;
    private PedidoCtrl pedidosCtrl;

    public PedidoCtrl() {
        pedidosDao = new PedidoDao();
        getAll();  
    }
    
    public ArrayList<PedidoDto> getAll() {       
        try {
            pedidosDao = new PedidoDao();
            return pedidosDao.getAll();
        } catch (Exception ex) {
            System.out.println("Error en pedidosDao.getAll(): " + ex.getMessage());
            return new ArrayList<>();
        }
    }

    public boolean add(PedidoDto dtoPedidos) {
        try {
            pedidosDao = new PedidoDao();
            return pedidosDao.add(dtoPedidos);
        } catch (Exception ex) {
            System.out.println("Error en pedidosDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            pedidosDao = new PedidoDao();
            return pedidosDao.delete(id);
        } catch (Exception ex) {
            System.out.println("Error en pedidosDao.delete(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean update(PedidoDto dtoPedidos) {
        try {
            pedidosDao = new PedidoDao();
            return pedidosDao.update(dtoPedidos);
        } catch (Exception ex) {
            System.out.println("Error en pedidosDao.update(): " + ex.getMessage());
            return false;
        }
    }
    
    
}
