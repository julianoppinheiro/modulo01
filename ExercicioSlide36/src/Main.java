import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //array da pessoa
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();

        //adicionar ao array
        listaPessoa.add(new Pessoa("João Fulano", 21));
        listaPessoa.add(new Pessoa("Laura Ciclano", 17));
        listaPessoa.add(new Pessoa("Victor Beltrano", 23));

        //imprimindo a lista utilizando o for
        for (Pessoa p : listaPessoa) {
            System.out.println("Nome da pessoa: " + p.nome);
            System.out.println("Idade: " + p.idade);
            if (p.idade < 18) {
                System.out.println(p.nome + " é menor de idade");
            } else {
                System.out.println(p.nome + " é maior de idade ");
            }
        }
        System.out.println("-------------------------");
        //imprimir utilizando o tenario
        for (Pessoa p : listaPessoa) {
            System.out.println("Nome da pessoa: " + p.nome);
            System.out.println("Idade: " + p.idade);
            System.out.println(p.idade < 18 ? p.nome + " é menor de idade" : p.nome + " é maior de idade ");
        }
    }
}