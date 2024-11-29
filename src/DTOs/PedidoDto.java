
package DTOs;


public class PedidoDto {
    private int id_pedido;
    private int id_cliente;
    private String fecha_pedido;
    private double total;

    public PedidoDto() {
    }

    public PedidoDto(int id_pedido, int id_cliente, String fecha_pedido, double total) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.fecha_pedido = fecha_pedido;
        this.total = total;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
   
}
