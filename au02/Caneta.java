package au02;

public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   protected boolean tampada;

   public Caneta() {
   }

   public void status() {
      System.out.println("Uma caneta " + this.cor);
      System.out.println("Esta tampada? " + this.tampada);
      System.out.println("Cor: " + this.cor);
      System.out.println("Modelo: " + this.modelo);
      System.out.println("Carga: " + this.carga);
   }

   public void rabiscar() {
      if (this.tampada) {
         System.out.println("Nao eh possivel rabiscar com a caneta tampada!");
      } else {
         System.out.println("Rabiscando...");
      }

   }

   private void tampar() {
      this.tampada = true;
   }

   private void destampar() {
      this.tampada = false;
   }
}


