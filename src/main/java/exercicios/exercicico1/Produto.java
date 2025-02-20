package exercicios.exercicico1;

public class Produto {
    String nome;
    float preco;
    int quantidade;
    boolean icrementar;
    int mudarQtd;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public void atualizarEstoque(boolean incrementar, int mudarQtd){
        System.out.println("Ao estoque de "+ nome + " foi " + (incrementar ? " icrementar " : " reduzido " + mudarQtd + " itens "));
      mudarQtd = icrementar ? mudarQtd : mudarQtd * -1;
      quantidade += mudarQtd;
        System.out.println();
    }

    public void calcularValorEstoque(){
        System.out.printf("O valor total do valor do estoque de " + nome + " é igual a R$%,.2f", (quantidade * preco));
        System.out.println();


    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", icrementar=" + icrementar +
                ", mudarQtd=" + mudarQtd +
                '}';
    }
}

