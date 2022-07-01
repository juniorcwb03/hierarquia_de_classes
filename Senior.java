public class Senior extends Profissional {
    private double premio;

       public Jogador(double premio){
       this.premio = premio; 
       
    }

    public void imprimir(){
      System.out.printf(premio);
    }

    public void ganhar(int p){
        super(p);
        premio = premio * 2;

    }

    public void peder(int p){
        super(p);
        premio = premio / 2;  

    }


    public double getPremio() {
        return premio;
  }

    public void setPremio(double premio) {
       this.premio =premio;
    }
}
