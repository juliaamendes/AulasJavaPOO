package exercicios.exercicico1;

public class Produto {
    String nome;
    int preco;
    int quantidade;

    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto " +
                "nome=" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


    public void atualizarEstoque(int adQuantidade){
        quantidade += adQuantidade ;

    }

    public void calcularValorEstoque(){


    }

}

