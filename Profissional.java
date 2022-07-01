public class Profissional extends Jogador {
    private double capital;

    public Jogador(double capital){
       this.capital = capital;
    }

    public void imprimir(){
      System.out.printf(capital);
    }

    public void ganhar(int p){
        score = p;
        capital = capital + p*4;

    } 

    public void perder (int p){
        score = p - score;
        capital = capital - p*4:
    }

    public double getCapital() {
        return capital;
  }

    public void setCapital(double capital) {
       this.capital =capital;
    }
}
