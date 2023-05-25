package br.com.ProjetoKraftHeinz.beans;

import java.util.Objects;

public class Cidade {

    private long codigo;

    private String descricaoCidade;

    private String codigoIbge;

    private long idEstado;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoCidade() {
        return descricaoCidade;
    }

    public void setDescricaoCidade(String descricaoCidade) {
        this.descricaoCidade = descricaoCidade;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(long idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return codigo == cidade.codigo && idEstado == cidade.idEstado && Objects.equals(descricaoCidade, cidade.descricaoCidade) && Objects.equals(codigoIbge, cidade.codigoIbge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descricaoCidade, codigoIbge, idEstado);
    }

    public Cidade() {
    }

    public Cidade(long codigo, String descricaoCidade, String codigoIbge, long idEstado) {
        this.codigo = codigo;
        this.descricaoCidade = descricaoCidade;
        this.codigoIbge = codigoIbge;
        this.idEstado = idEstado;
    }

}
