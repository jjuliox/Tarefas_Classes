public class Produto {

    public static void main(String[] args) {
        // Instancia a classe InformacaoProduto
        InformacaoProduto produto = new InformacaoProduto();

        // Preenche os dados do produto
        produto.preencherDados();

        // Exibe a descrição completa do produto no terminal
        System.out.println(produto.getDescricao());
    }
}
