package br.com.ProjetoKraftHeinz.beans;

import java.util.Objects;

public class Ingrediente {

    private long ingrediente;

    private String descricaoIngrediente;

    private long idFornecedor;

    private long idTipoIngrediente;

    public long getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(long ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getDescricaoIngrediente() {
        return descricaoIngrediente;
    }

    public void setDescricaoIngrediente(String descricaoIngrediente) {
        this.descricaoIngrediente = descricaoIngrediente;
    }

    public long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public long getIdTipoIngrediente() {
        return idTipoIngrediente;
    }

    public void setIdTipoIngrediente(long idTipoIngrediente) {
        this.idTipoIngrediente = idTipoIngrediente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingrediente that = (Ingrediente) o;
        return ingrediente == that.ingrediente && idFornecedor == that.idFornecedor && idTipoIngrediente == that.idTipoIngrediente && Objects.equals(descricaoIngrediente, that.descricaoIngrediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingrediente, descricaoIngrediente, idFornecedor, idTipoIngrediente);
    }

    public Ingrediente() {
    }

    public Ingrediente(long ingrediente, String descricaoIngrediente, long idFornecedor, long idTipoIngrediente) {
        this.ingrediente = ingrediente;
        this.descricaoIngrediente = descricaoIngrediente;
        this.idFornecedor = idFornecedor;
        this.idTipoIngrediente = idTipoIngrediente;
    }

}
