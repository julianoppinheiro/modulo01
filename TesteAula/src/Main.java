public class Main {
    // metodo main
    public static void main(String[] args) {
        int n = 49;
        int m = 10;

        int soma = n + m;
        int subtracao = n - m;
        int multiplicaocao = n * m;
        double divisao = n / m;
        int resto = n % m;
        // incremento de n
        n++;
        int incremento = n;
        // decremento de m
        m--;
        int decremento = m;

        System.out.println("Soma: "+ soma);
        System.out.println("subtracao: "+ subtracao);
        System.out.println("multiplicaocao: "+ multiplicaocao);
        System.out.println("divisao: "+ divisao);
        System.out.println("resto: "+ resto);
        System.out.println("incremento: "+ incremento);
        System.out.println("decremento: "+ decremento);
    }

}