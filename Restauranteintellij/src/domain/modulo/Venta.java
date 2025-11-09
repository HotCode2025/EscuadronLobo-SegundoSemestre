package domain.modulo;

import java.util.Date;
import java.util.List;

public class Venta {
    private int idVenta;
    private String cliente;
    private double total;
    private Date fecha;
    private List<Plato> platos;
    private static int contadorVentas;

    public Venta(){
        this.idVenta = ++Venta.contadorVentas;
    }
    public Venta(int i, String cliente, double total, Date fecha, List<Plato> platos) {
        this();
        this.cliente = cliente;
        this.total = total;
        this.fecha = fecha;
        this.platos = platos;
    }

    public int getId() { return idVenta; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public List<Plato> getPlatos() { return platos; }
    public void setPlatos(List<Plato> platos) { this.platos = platos; }

    @Override
    public String toString() {
        return "Venta " + idVenta + " - Cliente: " + cliente + " - Total: $" + total + " - Fecha: " + fecha;
    }
}
