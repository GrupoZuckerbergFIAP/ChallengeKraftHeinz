package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.Embalagem;
import br.com.ProjetoKraftHeinz.beans.Estoque;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.SQEMBALAGEM;
import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.TABEMBALAGEM;


public class EmbalagemDAO {

    private Connection conexao;

    public void cadastrar(Embalagem embalagem) {

        PreparedStatement stmt = null;

        try {
            Connection conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABEMBALAGEM + "(ID_EMBALAGEM , DS_EMBALAGEM , NR_ALTURA , NR_LARGURA ,NR_COMPRIMENTO" +
                    " ,DS_FORMATO, TX_MATERIAL , FK_ID_FORNECEDOR ) VALUES " +
                    "( " + SQEMBALAGEM + ".NEXTVAL, ? , ? , ? , ?, ? , ? , ? )";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, embalagem.getDsEmbalagem());
            stmt.setDouble(2,embalagem.getAltura() );
            stmt.setDouble(3, embalagem.getLargura());
            stmt.setDouble(4,embalagem.getComprimento());
            stmt.setString(5, embalagem.getFormato());
            stmt.setString(6,embalagem.getMaterial());
            stmt.setLong(7,embalagem.getIdFornecedor());

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