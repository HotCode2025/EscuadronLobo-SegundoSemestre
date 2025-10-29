// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package Operaciones;

public class Aritmetica {
   int a;
   int b;

   public Aritmetica() {
   }

   public void sumarNumeros() {
      int resultado = this.a + this.b;
      System.out.println("El resultado es: " + resultado);
   }

   public int sumarConRetorno() {
      return this.a + this.b;
   }

   public int sumarConArgumentos(int a, int b) {
      this.a = a;
      this.b = b;
      return this.sumarConRetorno();
   }
}