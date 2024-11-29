
package Controllers;

import DTOs.DetallePedidoDto;
import DAOs.DetallePedidoDao;
import java.util.*;

public class DetallePedidoCtrl {
    
    private DetallePedidoDao detallePedidoDao;
    private DetallePedidoCtrl detallePedidoCtrl;

    public DetallePedidoCtrl() {
        detallePedidoDao = new DetallePedidoDao();
    }
    
    public ArrayList<DetallePedidoDto> getAll() {       
        try {
            detallePedidoDao = new DetallePedidoDao();
            return detallePedidoDao.getAll();
        } catch (Exception ex) {
            System.out.println("Error en detallePedidoDao.getAll(): " + ex.getMessage());
            return new ArrayList<>();
        }
    }
    
    public ArrayList<DetallePedidoDto> getDetallesPedido(int idPedido) { 
        try {
            detallePedidoDao = new DetallePedidoDao();
            return detallePedidoDao.getDetallesPedido(idPedido);
        } catch (Exception ex) {
            System.out.println("Error en detallePedidoDao.getAll(): " + ex.getMessage());
            return new ArrayList<>();
        }
    }

    public boolean add(DetallePedidoDto dtoDetallePedido) {
        try {
            detallePedidoDao = new DetallePedidoDao();
            return detallePedidoDao.add(dtoDetallePedido);
        } catch (Exception ex) {
            System.out.println("Error en detallePedidoDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            detallePedidoDao = new DetallePedidoDao();
            return detallePedidoDao.delete(id);
        } catch (Exception ex) {
            System.out.println("Error en detallePedidoDao.delete(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean update(DetallePedidoDto dtoDetallePedido) {
        try {
            detallePedidoDao = new DetallePedidoDao();
            return detallePedidoDao.update(dtoDetallePedido);
        } catch (Exception ex) {
            System.out.println("Error en detallePedidoDao.update(): " + ex.getMessage());
            return false;
        }
    }
    
    
}
