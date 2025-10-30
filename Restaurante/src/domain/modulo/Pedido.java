package domain.modulo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private String mesa; // número o nombre de la mesa
    private String cliente;
    private List<Plato> platos;
    private String estado; // pendiente, en preparación, listo, entregado

    public Pedido(int id, String mesa, String cliente, List<Plato> platos, String estado) {
        this.id = id;
        this.mesa = mesa;
        this.cliente = cliente;
        this.platos = new ArrayList<>(platos);
        this.estado = estado;

    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMesa() { return mesa; }
    public void setMesa(String mesa) { this.mesa = mesa; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public List<Plato> getPlatos() { return platos; }
    public void setPlatos(List<Plato> platos) { this.platos = platos; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }


    @Override
    public String toString() {
        return "Pedido " + id + " - Mesa: " + mesa + " - Cliente: " + cliente + " - Estado: " + estado + " - Platos: " + platos;
    }
}
