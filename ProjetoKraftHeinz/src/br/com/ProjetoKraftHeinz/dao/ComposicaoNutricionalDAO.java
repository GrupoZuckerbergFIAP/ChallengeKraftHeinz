package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.ComposicaoNutricional;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.SQCOMPNUTRI;
import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.TABCOMPNUTRI;


public class ComposicaoNutricionalDAO {


    private Connection conexao;

    public void cadastrar(ComposicaoNutricional composicaoNutricional) {

        PreparedStatement stmt = null;

        try {
            Connection conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABCOMPNUTRI + "(ID_COMPOSICAO , NR_PESO_COMP,NR_PERCENTUAL_DIARIO, FK_ID_PRODUTO, FK_ID_NUTRIENTE, FK_ID_PESO  ) VALUES " +
                    "( " + SQCOMPNUTRI + ".NEXTVAL, ? , ? , ? , ? , ? )";
            stmt = conexao.prepareStatement(sql);

            stmt.setDouble(1, composicaoNutricional.getPeso());
            stmt.setDouble(2, composicaoNutricional.getPercentualDiario());
            stmt.setLong(3, composicaoNutricional.getIdProduto());
            stmt.setLong(4, composicaoNutricional.getIdNutriente());
            stmt.setLong(5, composicaoNutricional.getIdPeso());

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
