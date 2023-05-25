package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.Fornecedor;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;
import br.com.ProjetoKraftHeinz.utils.ConverteData;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.*;
import static br.com.ProjetoKraftHeinz.utils.ConverteData.convertFromJAVADateToSQLDate;

public class FornecedorDAO {

    private Connection conexao;
    private Calendar dataAtual = Calendar.getInstance();


    public void cadastrar(Fornecedor fornecedor) {

        PreparedStatement stmt = null;

        try {
            conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABFORNECEDOR + "(ID_FORNECEDOR , DS_FORNECEDOR , TX_CNPJ , TX_TEL_CONTATO ,NM_CONTATO" +
                    " ,DS_LOGRADOURO, DT_INICIO , ";
            if (fornecedor.getDataFim() != null){
                sql +=        "DT_FIM ," ;
            }

            sql += "FK_ID_CIDADE ) VALUES " +
                    "( " + SQFORNECEDOR + ".NEXTVAL, ? , ? , ? , ?, ? , ? , " ;

            if (fornecedor.getDataFim() != null){
                sql +=           "? , " ;
            }

            sql +=   "? )";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, fornecedor.getNomeFornecedor());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getTelefone());
            stmt.setString(4, fornecedor.getNomeContato());
            stmt.setString(5, fornecedor.getLogradouro());
            stmt.setDate(6, fornecedor.getDataInicio());

            if (fornecedor.getDataFim() != null){
                stmt.setDate(7, fornecedor.getDataFim());
                stmt.setLong(8, fornecedor.getCidadeFornecedor());
            }else{
                stmt.setLong(7, fornecedor.getCidadeFornecedor());
            }

            stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public List<Fornecedor> getListaConsultaAtivos(){
        List<Fornecedor> lista = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try{

            conexao = DbManager.obterConexao();

            String sql = "SELECT * FROM " + TABFORNECEDOR + " WHERE DT_FIM='' OR DT_FIM IS NULL  " +
                    " OR DT_FIM >= '" + convertFromJAVADateToSQLDate(dataAtual.getTime()) +"' ORDER BY ID_FORNECEDOR ";
            stmt = conexao.prepareStatement(sql );
            rs = stmt.executeQuery();
            while (rs.next()){
                int codigo = rs.getInt("ID_FORNECEDOR");
                String descricaoFornecedor = rs.getString("DS_FORNECEDOR");
                String cnpj = rs.getString("TX_CNPJ");



                Fornecedor fornecedor = new Fornecedor(codigo, descricaoFornecedor ,cnpj);
                lista.add(fornecedor);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                stmt.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }
}
