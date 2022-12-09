public class Movimento {
    Produto produto;
    String descricaoMovimento; //ENTRADA - Saida
    Double quantidade;


    public Movimento entradaEstoque(Produto p, Double qtd){
        Movimento movimento = new Movimento();

        movimento.descricaoMovimento = "ENTRADA";
        movimento.produto = p;
        movimento.quantidade = qtd;

        //p = produto
        p.saldo += qtd;

        return movimento;

    }

    public Movimento saidaEstoque(Produto p, Double qtd){
        Movimento movimento = new Movimento();

        movimento.descricaoMovimento = "SAIDA";
        movimento.produto = p;
        movimento.quantidade = qtd;

        //p = produto
        p.saldo -= qtd;

        return movimento;

    }

    @Override
    public String toString() {
        return "Movimento{" +
                "produto=" + produto +
                ", descricaoMovimento='" + descricaoMovimento + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
