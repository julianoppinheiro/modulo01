public class Main {
    public static void main(String[] args) {

        Estoque e = new Estoque();

        Produto p1 = new Produto();
        p1.referencia = "AA";
        p1.descricao= "Produto AA";
        p1.saldo= 100.0;
        p1.preco= 60.0;

        Produto p2 = new Produto();
        p2.referencia = "BB";
        p2.descricao= "Produto BB";
        p2.saldo= 0.0;
        p2.preco= 1.0;

        e.imprimirSaldo(p1);

        e.getProdutos().add(p1);
        e.getProdutos().add(p2);


        e.imprimirListaProdutos(e.getProdutos());

        Movimento n = new Movimento();
        e.getMovimentos().add(n.entradaEstoque(p1, 5.0));
        e.getMovimentos().add(n.entradaEstoque(p2, 5.0));
        e.getMovimentos().add(n.entradaEstoque(p2, 5.0));

        e.getMovimentos().add(n.saidaEstoque(p2, 5.0));

        e.imprimirListaMovimentos(e.getMovimentos());

        e.imprimirListaProdutos(e.getProdutos());
    }
}
