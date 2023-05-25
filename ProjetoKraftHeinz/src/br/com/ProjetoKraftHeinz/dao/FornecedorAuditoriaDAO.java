package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.EstoqueProduto;
import br.com.ProjetoKraftHeinz.beans.FornecedorAuditoria;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.SQFORNAUDIT;
import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.TABFORNAUDIT;

public class FornecedorAuditoriaDAO {

    private Connection conexao;


    public void lancarAuditoria(FornecedorAuditoria fornecedorAuditoria) {

        PreparedStatement stmt = null;

        try {
            conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABFORNAUDIT + "(ID_AUDITORIA , DS_AUDITORIA , DT_AUDITORIA , LG_RESULTADO, TX_LAUDO" +
                    ", NM_RESPONSAVEL , FK_ID_FORNECEDOR) VALUES " +
                    "( " + SQFORNAUDIT + ".NEXTVAL, ? ,? ,? ,? ,? , ? )";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, fornecedorAuditoria.getDescricaoAuditoria());
            stmt.setDate(2, fornecedorAuditoria.getDataAuditoria());
            stmt.setBoolean(3, fornecedorAuditoria.isResultado());
            stmt.setString(4, fornecedorAuditoria.getLaudo());
            stmt.setString(5, fornecedorAuditoria.getNomeResponsavel());
            stmt.setLong(6, fornecedorAuditoria.getFornecedor().getIdFornecedor());

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
