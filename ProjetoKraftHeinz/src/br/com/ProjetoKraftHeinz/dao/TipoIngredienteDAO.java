package br.com.ProjetoKraftHeinz.dao;

import br.com.ProjetoKraftHeinz.beans.TipoIngrediente;
import br.com.ProjetoKraftHeinz.jdbc.DbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static br.com.ProjetoKraftHeinz.constantes.TabelaSistema.*;

public class TipoIngredienteDAO {

    private Connection conexao;

    public void cadastrar(TipoIngrediente tipoIngrediente) {

        PreparedStatement stmt = null;

        try {
            Connection conexao = DbManager.obterConexao();

            String sql = " INSERT INTO " + TABTIPOINGREDIENTE + "(ID_TIPO_INGREDIENTE , DS_TIPO_INGREDIENTE  ) VALUES " +
                    "( " + SQTIPOINGREDIENTE + ".NEXTVAL, ?  )";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, tipoIngrediente.getDescricaoTipoIngrediente());

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

    public List<TipoIngrediente> getListaConsulta(){

        List<TipoIngrediente> lista = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try{

            conexao = DbManager.obterConexao();

            String sql = "SELECT * FROM " + TABTIPOINGREDIENTE + " ORDER BY ID_TIPO_INGREDIENTE ";
            stmt = conexao.prepareStatement(sql );
            rs = stmt.executeQuery();
            while (rs.next()){
                int codigo = rs.getInt("ID_TIPO_INGREDIENTE");
                String descricaoTipoIngrediente = rs.getString("DS_TIPO_INGREDIENTE");



                TipoIngrediente tipoIngrediente = new TipoIngrediente(codigo, descricaoTipoIngrediente );
                lista.add(tipoIngrediente);

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