package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.Produto;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.*;

public class ProdutoDAO {

    private Connection conexao;

    public void cadastrar(Produto produto){

        PreparedStatement stmt = null;

        try {
            conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABPRODUTO + "(ID_PRODUTO , NM_PRODUTO , NR_CUSTO , NR_PRECO, QT_VALIDADE_DIAS" +
                    ",NR_PESO, QT_PORCAO_COMPOSICAO, VL_ENERGETICO_PORCAO, DS_PRODUTO, DS_MARCA, FK_ID_PESO," +
                    "FK_ID_CATEGORIA ,FK_ID_EMBALAGEM ) VALUES " +
                    "( " + SQPRODUTO + ".NEXTVAL, ? ,? ,? ,? ,? , ? , ?, ?, ?, ?, ?, ? )";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, produto.getNomeProduto());
            stmt.setDouble(2, produto.getValorCusto());
            stmt.setDouble(3, produto.getValorVenda());
            stmt.setInt(4, produto.getValidadeDias());
            stmt.setDouble(5, produto.getPeso());
            stmt.setInt(6, produto.getQuantidadePorcao());
            stmt.setInt(7, produto.getValorEnergetico());
            stmt.setString(8, produto.getDescricaoProduto());
            stmt.setString(9, produto.getDescricaoMarca());
            stmt.setLong(10, produto.getTipoPeso());
            stmt.setLong(11, produto.getTipoCategoria());
            stmt.setLong(12, produto.getIdEmbalagem());


            stmt.executeUpdate();

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public Produto getConsultaProduto(long idProduto){

        Produto produtoConsulta = new Produto();
        PreparedStatement stmt = null;

        ResultSet rs = null;

        try{

            conexao = DbManager.obterConexao();

            stmt = conexao.prepareStatement("SELECT * FROM " + TABPRODUTO +" WHERE ID_PRODUTO = "
                    + idProduto);
            rs = stmt.executeQuery();
            while (rs.next()){
                int codigo = rs.getInt("ID_PRODUTO");
                String nomeProduto = rs.getString("NM_PRODUTO");
                String descricaoProduto = rs.getString("DS_PRODUTO");
                double valorCusto = rs.getDouble("NR_CUSTO");
                double valorPreco = rs.getDouble("NR_PRECO");
                int validadeDias = rs.getInt("QT_VALIDADE_DIAS");
                double peso = rs.getDouble("NR_PESO");
                int quantidadePorcao = rs.getInt("QT_PORCAO_COMPOSICAO");
                int valorEnergetico = rs.getInt("VL_ENERGETICO_PORCAO");
                String marca = rs.getString("DS_MARCA");
                long idCategoria = rs.getLong("FK_ID_CATEGORIA");
                long idEmbalagem = rs.getLong("FK_ID_EMBALAGEM");
                long idPeso = rs.getLong("FK_ID_PESO");

                Produto produto = new Produto(codigo, nomeProduto , valorCusto, valorPreco, validadeDias,
                        peso,quantidadePorcao,valorEnergetico,descricaoProduto ,marca , idPeso,idCategoria,idEmbalagem);
                produtoConsulta = produto;
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

        return produtoConsulta;

    }

}

