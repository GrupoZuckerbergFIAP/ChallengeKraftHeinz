package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.Estado;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.*;

public class EstadoDAO {

    private Connection conexao;

    public void cadastrar(Estado estado) {

        PreparedStatement stmt = null;

        try {
            conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABESTADO + "(ID_ESTADO , DS_ESTADO , CD_SIGLA , CD_IBGE , FK_ID_PAIS ) VALUES " +
                    "( " + SQESTADO + ".NEXTVAL, ? , ? , ? , ?)";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, estado.getDescricaoEstado());
            stmt.setString(2, estado.getSigla());
            stmt.setString(3, estado.getCodigoIbge());
            stmt.setLong(4, estado.getIdPais());

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
