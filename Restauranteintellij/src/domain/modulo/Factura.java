package domain.modulo;

import java.util.Date;
import java.util.List;

public class Factura {
    private int id;
    private String cliente;
    private List<Plato> platos;
    private double total;
    private Date fecha;
    private boolean anulada;

    public Factura(int id, String cliente, List<Plato> platos, double total, Date fecha) {
        this.id = id;
        this.cliente = cliente;
        this.platos = platos;
        this.total = total;
        this.fecha = fecha;
        this.anulada = false;
    }

    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public List<Plato> getPlatos() { return platos; }
    public double getTotal() { return total; }
    public Date getFecha() { return fecha; }
    public boolean isAnulada() { return anulada; }
    public void setAnulada(boolean anulada) { this.anulada = anulada; }

    @Override
    public String toString() {
        String platosStr = platos.stream()
                .map(Plato::getNombre)
                .reduce((a,b) -> a + ", " + b)
                .orElse("-");
        return "Factura " + id + " - Cliente: " + cliente + " - Total: $" + total +
                " - Fecha: " + fecha + (anulada ? " [ANULADA]" : "") +
                " - Platos: " + platosStr;
    }
}
