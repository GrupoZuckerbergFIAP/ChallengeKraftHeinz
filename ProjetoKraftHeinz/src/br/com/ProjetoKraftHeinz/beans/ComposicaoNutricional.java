package br.com.ProjetoKraftHeinz.beans;

import java.util.Objects;

public class ComposicaoNutricional {

    private long idComposicao;

    private double peso;

    private double percentualDiario;

    private long idProduto;

    private long idNutriente;

    private long idPeso;

    public long getIdComposicao() {
        return idComposicao;
    }

    public void setIdComposicao(long idComposicao) {
        this.idComposicao = idComposicao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPercentualDiario() {
        return percentualDiario;
    }

    public void setPercentualDiario(double percentualDiario) {
        this.percentualDiario = percentualDiario;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public long getIdNutriente() {
        return idNutriente;
    }

    public void setIdNutriente(long idNutriente) {
        this.idNutriente = idNutriente;
    }

    public long getIdPeso() {
        return idPeso;
    }

    public void setIdPeso(long idPeso) {
        this.idPeso = idPeso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComposicaoNutricional that = (ComposicaoNutricional) o;
        return idComposicao == that.idComposicao && Double.compare(that.peso, peso) == 0 && Double.compare(that.percentualDiario, percentualDiario) == 0 && idProduto == that.idProduto && idNutriente == that.idNutriente && idPeso == that.idPeso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComposicao, peso, percentualDiario, idProduto, idNutriente, idPeso);
    }

    public ComposicaoNutricional() {
    }

    public ComposicaoNutricional(long idComposicao, double peso, double percentualDiario, long idProduto, long idNutriente, long idPeso) {
        this.idComposicao = idComposicao;
        this.peso = peso;
        this.percentualDiario = percentualDiario;
        this.idProduto = idProduto;
        this.idNutriente = idNutriente;
        this.idPeso = idPeso;
    }

    @Override
    public String toString() {
        return "ComposicaoNutricional{" +
                "idComposicao=" + idComposicao +
                ", peso=" + peso +
                ", percentualDiario=" + percentualDiario +
                ", idProduto=" + idProduto +
                ", idNutriente=" + idNutriente +
                ", idPeso=" + idPeso +
                '}';
    }
}
