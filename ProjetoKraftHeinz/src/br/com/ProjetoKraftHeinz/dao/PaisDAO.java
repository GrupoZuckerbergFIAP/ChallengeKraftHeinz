package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.Pais;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.*;

public class PaisDAO {

    private Connection conexao;

    public void cadastrar(Pais pais) {

        PreparedStatement stmt = null;

        try {
            conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABPAIS + "(ID_PAIS , DS_PAIS , DS_CONTINENTE ) VALUES " +
                    "( " + SQPAIS + ".NEXTVAL, ? , ? )";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, pais.getDescricaoPais());
            stmt.setString(2, pais.getDescricaoContinente());


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
