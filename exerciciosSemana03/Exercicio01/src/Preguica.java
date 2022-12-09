public class Preguica extends Animal{


    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println(" PREGUIÇA FAZENDO BARULHO");
    }

    public void subirArvore(){
        System.out.println("Preguiça subiu a árvore");
    }

}