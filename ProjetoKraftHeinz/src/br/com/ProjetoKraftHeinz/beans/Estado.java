package br.com.ProjetoKraftHeinz.beans;

public class Estado {

    private long codigo;

    private String descricaoEstado;

    private String sigla;

    private String codigoIbge ;

    private long idPais;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoEstado() {
        return descricaoEstado;
    }

    public void setDescricaoEstado(String descricaoEstado) {
        this.descricaoEstado = descricaoEstado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public long getIdPais() {
        return idPais;
    }

    public void setIdPais(long idPais) {
        this.idPais = idPais;
    }

    public Estado() {
    }

    public Estado(long codigo, String descricaoEstado, String sigla, String codigoIbge  , long idPais) {
        this.codigo = codigo;
        this.descricaoEstado = descricaoEstado;
        this.sigla = sigla;
        this.codigoIbge = codigoIbge;
        this.idPais = idPais;
    }

}
