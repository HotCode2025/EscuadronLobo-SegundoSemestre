package domain;

import test.TestProyecto;

public class Util {
    public static int leerEntero() {
        while (true) {
            try {
                String line = TestProyecto.sc.nextLine();
                return Integer.parseInt(line.trim());
            } catch (Exception e) {
                System.out.print("Entrada invalida. Reingrese: ");
            }
        }
    }

    public static int leerEnteroRango(int min, int max) {
        while (true) {
            int v = leerEntero();
            if (v < min || v > max) {
                System.out.printf("Valor fuera de rango (%d - %d). Reingrese: ", min, max);
                continue;
            }
            return v;
        }
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 30; i++) System.out.println();
    }

    public static void esperar(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { /* ignore */ }
    }
}

