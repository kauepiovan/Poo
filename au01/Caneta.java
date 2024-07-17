// Source code is decompiled from a .class file using FernFlower decompiler.
public class Caneta {
   String modelo;
   String cor;
   float ponta;
   int carga;
   boolean tampada;

   public Caneta() {
   }

   void status() {
      System.out.println("Uma caneta " + this.cor);
      System.out.println("Esta tampada? " + this.tampada);
      System.out.println("Cor: " + this.cor);
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Carga: " + this.carga);
   }

   void rabiscar() {
      if (this.tampada) {
         System.out.println("Nao eh possivel rabiscar com a caneta tampada!");
      } else {
         System.out.println("Rabiscando...");
      }

   }

   void tampar() {
      this.tampada = true;
   }

   void destampar() {
      this.tampada = false;
   }
}

