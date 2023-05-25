package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.Categoria;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.SQCATEGORIA;
import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.TABCATEGORIA;

public class CategoriaDAO {

    private Connection conexao;

    public void cadastrar(Categoria categoria){

        PreparedStatement stmt = null;

        try {
            conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABCATEGORIA + "(ID_CATEGORIA , DS_CATEGORIA)  VALUES " +
                    "( " + SQCATEGORIA + ".NEXTVAL , ? )";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, categoria.getDescricaoCategoria());
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
}

