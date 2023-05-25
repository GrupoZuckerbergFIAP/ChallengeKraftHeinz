package br.com.ProjetoKraftHeinz.beans;

import java.util.Objects;

public class Produto {

    private long idProduto;

    private String nomeProduto;

    private double valorCusto;

    private double valorVenda;

    private int validadeDias;

    private double peso;

    private int quantidadePorcao;

    private int valorEnergetico;

    private String descricaoProduto;

    private String descricaoMarca;

    private long tipoPeso;

    private long tipoCategoria;

    private long idEmbalagem;




    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getValidadeDias() {
        return validadeDias;
    }

    public void setValidadeDias(int validadeDias) {
        this.validadeDias = validadeDias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidadePorcao() {
        return quantidadePorcao;
    }

    public void setQuantidadePorcao(int quantidadePorcao) {
        this.quantidadePorcao = quantidadePorcao;
    }

    public int getValorEnergetico() {
        return valorEnergetico;
    }

    public void setValorEnergetico(int valorEnergetico) {
        this.valorEnergetico = valorEnergetico;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getDescricaoMarca() {
        return descricaoMarca;
    }

    public void setDescricaoMarca(String descricaoMarca) {
        this.descricaoMarca = descricaoMarca;
    }

    public long getTipoPeso() {
        return tipoPeso;
    }

    public void setTipoPeso(long tipoPeso) {
        this.tipoPeso = tipoPeso;
    }

    public long getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(long tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public long getIdEmbalagem() {
        return idEmbalagem;
    }

    public void setIdEmbalagem(long idEmbalagem) {
        this.idEmbalagem = idEmbalagem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return idProduto == produto.idProduto && Double.compare(produto.valorCusto, valorCusto) == 0 &&
                Double.compare(produto.valorVenda, valorVenda) == 0 && validadeDias == produto.validadeDias &&
                Double.compare(produto.peso, peso) == 0 && quantidadePorcao == produto.quantidadePorcao &&
                valorEnergetico == produto.valorEnergetico && tipoPeso == produto.tipoPeso &&
                tipoCategoria == produto.tipoCategoria && Objects.equals(nomeProduto, produto.nomeProduto) &&
                Objects.equals(descricaoProduto, produto.descricaoProduto) && Objects.equals(descricaoMarca,
                produto.descricaoMarca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto, nomeProduto, valorCusto, valorVenda, validadeDias, peso, quantidadePorcao,
                valorEnergetico, descricaoProduto, descricaoMarca, tipoPeso, tipoCategoria);
    }

    public Produto() {
    }

    public Produto(long idProduto, String nomeProduto, double valorCusto, double valorVenda, int validadeDias,
                   double peso, int quantidadePorcao, int valorEnergetico, String descricaoProduto, String descricaoMarca,
                   long tipoPeso, long tipoCategoria, long idEmbalagem) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.validadeDias = validadeDias;
        this.peso = peso;
        this.quantidadePorcao = quantidadePorcao;
        this.valorEnergetico = valorEnergetico;
        this.descricaoProduto = descricaoProduto;
        this.descricaoMarca = descricaoMarca;
        this.tipoPeso = tipoPeso;
        this.tipoCategoria = tipoCategoria;
        this.idEmbalagem = idEmbalagem;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", valorCusto=" + valorCusto +
                ", valorVenda=" + valorVenda +
                ", validadeDias=" + validadeDias +
                ", peso=" + peso +
                ", quantidadePorcao=" + quantidadePorcao +
                ", valorEnergetico=" + valorEnergetico +
                ", descricaoProduto='" + descricaoProduto + '\'' +
                ", descricaoMarca='" + descricaoMarca + '\'' +
                ", tipoPeso=" + tipoPeso +
                ", tipoCategoria=" + tipoCategoria +
                ", idEmbalagem=" + idEmbalagem +
                '}';
    }
}
