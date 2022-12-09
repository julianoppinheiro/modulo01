public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println(" AU AU AU AU ");
    }

    public void correr(){
        System.out.println("Cachorro correndo");
    }

}