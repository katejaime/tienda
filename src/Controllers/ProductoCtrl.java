
package Controllers;

import DTOs.ProductoDto;
import DAOs.ProductoDao;
import java.util.*;

public class ProductoCtrl {
    
    private ProductoDao productoDao;
    private ProductoCtrl productosCtrl;

    public ProductoCtrl() {
        productoDao = new ProductoDao();
        getAll();
        
    }
    
    public ArrayList<ProductoDto> getAll() {       
        try {
            productoDao = new ProductoDao();
            return productoDao.getAll();
        } catch (Exception ex) {
            System.out.println("Error en productoDao.getAll(): " + ex.getMessage());
            return new ArrayList<>();
        }
    }

    public boolean add(ProductoDto dtoProductos) {
        try {
            productoDao = new ProductoDao();
            return productoDao.add(dtoProductos);
        } catch (Exception ex) {
            System.out.println("Error en productoDao.add(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(int id) {
        try {
            productoDao = new ProductoDao();
            return productoDao.delete(id);
        } catch (Exception ex) {
            System.out.println("Error en productoDao.delete(): " + ex.getMessage());
            return false;
        }
    }
    
    public boolean update(ProductoDto dtoProductos) {
        try {
            productoDao = new ProductoDao();
            return productoDao.update(dtoProductos);
        } catch (Exception ex) {
            System.out.println("Error en productoDao.update(): " + ex.getMessage());
            return false;
        }
    }
    
    
}
