public class Exercicio02 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob", 3);
        System.out.println(cachorro.toString());
        cachorro.emitirSom();
        cachorro.correr();

        Cavalo cavalo = new Cavalo("Mustang", 2);
        System.out.println(cavalo.toString());
        cavalo.emitirSom();
        cavalo.correr();

        Preguica preguica = new Preguica("Elder", 30);
        System.out.println(preguica.toString());
        preguica.emitirSom();
        preguica.subirArvore();
    }
}