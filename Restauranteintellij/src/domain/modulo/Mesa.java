package domain.modulo;

public class Mesa {
    private int numero;
    private String estado; // libre, ocupada, atendida, esperando pedido
    private String mozoAsignado;

    public Mesa(int numero, String estado, String mozoAsignado) {
        this.numero = numero;
        this.estado = estado;
        this.mozoAsignado = mozoAsignado;
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getMozoAsignado() { return mozoAsignado; }
    public void setMozoAsignado(String mozoAsignado) { this.mozoAsignado = mozoAsignado; }

    @Override
    public String toString() {
        return "Mesa " + numero + " - Estado: " + estado + " - Mozo: " + mozoAsignado;
    }
}

