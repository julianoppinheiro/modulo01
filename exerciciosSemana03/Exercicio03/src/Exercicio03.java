public class Exercicio03 {
    public static void main(String[] args) {
        //instancia do veterinario
        Veterinario veterinario = new Veterinario();

        Cachorro cachorro = new Cachorro("Bob", 3);
        System.out.println(cachorro.toString());
        veterinario.examinar(cachorro);
        cachorro.correr();

        Cavalo cavalo = new Cavalo("Mustang", 2);
        System.out.println(cavalo.toString());
        veterinario.examinar(cavalo);
        cavalo.correr();

        Preguica preguica = new Preguica("Elder", 30);
        System.out.println(preguica.toString());
        veterinario.examinar(preguica);
        preguica.subirArvore();



    }
}