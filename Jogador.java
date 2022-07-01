
public class Jogador{
    private String nome;
    protected int score;

    public Jogador(String n,int score){
       this.nome = nome;  
       this.score = score;
    }
    
    public void imprimir(){
      System.out.printf(nome,score);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
       this.score = score;
    }
    
} 