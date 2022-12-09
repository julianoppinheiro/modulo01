public class Produto {
String referencia;
String descricao;
Double preco;
Double saldo;

    @Override
    public String toString() {
        return "Produto{" +
                "referencia='" + referencia + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", saldo=" + saldo +
                '}';
    }
}
