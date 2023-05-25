package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.Cidade;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.*;

public class CidadeDAO  {

    private Connection conexao;

    public void cadastrar(Cidade cidade){

        PreparedStatement stmt = null;

        try {
            conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABCIDADE + "(ID_CIDADE , DS_CIDADE , CD_IBGE , FK_ID_ESTADO ) VALUES " +
                    "( " + SQCIDADE + ".NEXTVAL, ? , ? , ? )";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, cidade.getDescricaoCidade());
            stmt.setString(2, cidade.getCodigoIbge());
            stmt.setLong(3, cidade.getIdEstado());

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
