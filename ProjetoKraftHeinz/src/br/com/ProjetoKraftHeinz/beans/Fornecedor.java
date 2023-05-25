package br.com.ProjetoKraftHeinz.beans;


import java.sql.Date;
import java.util.Objects;

public class Fornecedor {

    private long idFornecedor;

    private String nomeFornecedor;

    private String cnpj;

    private String telefone;

    private String nomeContato;

    private String logradouro;

    private Date dataInicio;

    private Date dataFim;

    private long cidadeFornecedor;

    public long getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(long idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public long getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(long cidadeFornecedor) {
        this.cidadeFornecedor = cidadeFornecedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fornecedor that = (Fornecedor) o;
        return idFornecedor == that.idFornecedor && cidadeFornecedor == that.cidadeFornecedor && Objects.equals(nomeFornecedor, that.nomeFornecedor) && Objects.equals(cnpj, that.cnpj) && Objects.equals(telefone, that.telefone) && Objects.equals(nomeContato, that.nomeContato) && Objects.equals(logradouro, that.logradouro) && Objects.equals(dataInicio, that.dataInicio) && Objects.equals(dataFim, that.dataFim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFornecedor, nomeFornecedor, cnpj, telefone, nomeContato, logradouro, dataInicio, dataFim, cidadeFornecedor);
    }

    public Fornecedor() {
    }

    public Fornecedor(long idFornecedor, String nomeFornecedor, String cnpj, String telefone, String nomeContato, String logradouro, Date dataInicio, Date dataFim, long cidadeFornecedor) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nomeContato = nomeContato;
        this.logradouro = logradouro;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cidadeFornecedor = cidadeFornecedor;
    }

    public Fornecedor(long idFornecedor, String nomeFornecedor, String cnpj, String telefone, String nomeContato, String logradouro, Date dataInicio, long cidadeFornecedor) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nomeContato = nomeContato;
        this.logradouro = logradouro;
        this.dataInicio = dataInicio;
        this.cidadeFornecedor = cidadeFornecedor;
    }

    public Fornecedor(long idFornecedor, String nomeFornecedor, String cnpj) {
        this.idFornecedor = idFornecedor;
        this.nomeFornecedor = nomeFornecedor;
        this.cnpj = cnpj;
    }

    public String listarConsulta() {
        return "Fornecedor{" +
                "idFornecedor=" + idFornecedor +
                ", nomeFornecedor='" + nomeFornecedor + '\'' +
                ", cnpj='" + cnpj +
                '}';
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "idFornecedor=" + idFornecedor +
                ", nomeFornecedor='" + nomeFornecedor + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nomeContato='" + nomeContato + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", cidadeFornecedor=" + cidadeFornecedor +
                '}';
    }
}
