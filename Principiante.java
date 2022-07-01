public class Principiante extends Jogador {
   private double bonus;

     public Jogador(double bonus){
       this.bonus = bonus;  
       
    }

    public void imprimir(){
      System.out.printf(bonus);
    }

    public void ganhar(int p){
        score = p;
        bonus = bonus + p / 100*10;
    }

    public void perder(int p){
        score = p - score; 
         bonus = bonus - p / 100*10;

    } 
 
    public double getBonus() {
        return bonus;
  }

    public void setBonus(double bonus) {
       this.bonus =bonus;
    }
}
