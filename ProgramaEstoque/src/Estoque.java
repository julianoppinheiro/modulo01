import java.util.ArrayList;

public class Estoque {

    ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<Movimento> movimentos = new ArrayList<>();

    public void imprimirSaldo(Produto p) {
        System.out.println("Saldo do produto " + p.referencia + "=>" + p.saldo);
    }

    public void imprimirListaProdutos(ArrayList<Produto> ps){
        ps.forEach(System.out::println);
    }

    public void imprimirListaMovimentos(ArrayList<Movimento> ms){
        ms.forEach(System.out::println);
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

}
