//alunos: Anderson Mendes Munhoz, Henrique Kasprzak Bernardo, Nilson de Araujo Souza Junior. 

public class Teste {
    public static void main(String[] args){
     Principiante principiante = new Principiante();
     Profissional profissional = new Profissional();
     Senior senior = new Senior();

     principiante.imprimir();
     principiante.ganhar();
     principiante.peder();    

     profissional.imprimir();
     profissional.ganhar();
     profissional.peder();  

     senior.imprimir();
     senior.ganhar();
     senior.peder();  
    }
}