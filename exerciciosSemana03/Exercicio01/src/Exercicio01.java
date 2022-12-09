public class Exercicio01 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob", 3);
        System.out.println(cachorro.toString());

        Cavalo cavalo = new Cavalo("Mustang", 2);
        System.out.println(cavalo.toString());

        Preguica preguica = new Preguica("Elder", 30);
        System.out.println(preguica.toString());
    }
}