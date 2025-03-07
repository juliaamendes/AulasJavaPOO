package com.senai.aula03_encapsulamento.exemplos.cadastroDeProdutos;
import java.util.Objects;
public class Produtos {
     private String nomeProduto;
        private double precoProduto;

        public Produtos(double precoProduto, String nomeProduto) {
            if (precoProduto >= 0){
                this.precoProduto = precoProduto;
            }else {
                throw new IllegalArgumentException(" iválido. O valor atribuido ao produto será R$0,00");
            }
            this.nomeProduto = nomeProduto;
        }

        //setters
        public void setNomeProduto(String nomeProduto) {
            this.nomeProduto = nomeProduto;
        }

        public void setPrecoProduto(double precoProduto) {
            if (precoProduto >= 0){
                this.precoProduto = precoProduto;
            }else {
                throw new IllegalArgumentException("O valor não pode ser negativo.");
            }
        }

        //getters
        public String getNomeProduto() {
            return nomeProduto;
        }

        public double getPrecoProduto() {
            return precoProduto;
        }


        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Produtos produtos = (Produtos) o;
            return Double.compare(precoProduto, produtos.precoProduto) == 0 && Objects.equals(nomeProduto, produtos.nomeProduto);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nomeProduto, precoProduto);
        }

        @Override
        public String toString() {
            return "--------------\nProduto: " + nomeProduto + "\nPreço: " + precoProduto + "\n--------------";
        }
    }

