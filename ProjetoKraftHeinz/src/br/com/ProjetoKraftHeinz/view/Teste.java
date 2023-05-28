package br.com.ProjetoKraftHeinz.view;

import br.com.ProjetoKraftHeinz.beans.*;
import br.com.ProjetoKraftHeinz.dao.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import static br.com.ProjetoKraftHeinz.utils.ConverteData.convertFromJAVADateToSQLDate;
import static br.com.ProjetoKraftHeinz.utils.ConverteData.convertFromSQLDateToJAVADate;

public class Teste {

    public static void main(String[] args) {

        /*
        //INCLUSAO PAIS
        Pais pais = new Pais(1L, "Argentina","America do Sul" );

        PaisDAO paisDAO = new PaisDAO();
        paisDAO.cadastrar(pais);
        */

        /*
        //INCLUSAO ESTADO
        Estado estado = new Estado(1L, "Buenos Aires","BN" , "",4 );

        EstadoDAO estadoDAO = new EstadoDAO();
        estadoDAO.cadastrar(estado);
        */

        /*
        //INCLUSAO CIDADE
        Cidade cidade = new Cidade(1L, "Blumenau","",4);

        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.cadastrar(cidade);
        */

        /*
        //INCLUSAO FABRICA
        Fabrica fabrica = new Fabrica(1L , "Heinz Brasil Barueri ", "50955707000120" , "Heinz Brasil S.A.","06460000",
                "Avenida Tambore,267 - Andar: 24 : Torre Sul - Bairro Tambore",6);

        FabricaDAO fabricaDAO = new FabricaDAO();
        fabricaDAO.cadastrarFabrica(fabrica);

        */
        /*
        //INCLUSÃO ESTOQUE
            Estoque estoque = new Estoque(1L, "Estoque Fábrica de Barueri Embalagens", 'E' ,22);
            EstoqueDAO estoqueDAO = new EstoqueDAO();
            estoqueDAO.cadastrar(estoque);

         */
/*
        //INCLUSÃO Fornecedor
        java.sql.Date dataHora = new Date(2020,1,10);
        Fornecedor fornecedor = new Fornecedor(1L, "Fornecedor Aromas", "32306426000164", "1144775690","Responsável Açucar",
                "R Teste,428 - Bairro Teste 3",dataHora,new CidadeDAO().getConsulta(5));
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.cadastrar(fornecedor);
*/

        // Listar fornecedores possíveis e já cadastrados em sistema para realizar amarração
        Fornecedor fornecedorLista = new Fornecedor();
        FornecedorDAO fornecedorDAOLista = new FornecedorDAO();
        List<Fornecedor> lista = fornecedorDAOLista.getListaConsultaAtivos();
        System.out.println("==================================================================");

        System.out.println("Listagem de fornecedores ativos no sistema ....");
        for(Fornecedor item : lista) {
            System.out.println(item.listarConsulta());
        }

        // listar tipos de produto cadastrados

        System.out.println("==================================================================");

        //TipoIngrediente tipoIngredienteLista = new TipoIngrediente();
        TipoIngredienteDAO tipoIngredienteDAOLista = new TipoIngredienteDAO();
        List<TipoIngrediente> listaTipoIngrediente = tipoIngredienteDAOLista.getListaConsulta();
        System.out.println("==================================================================");

        System.out.println("Listagem de Tipos Ingredientes ....");
        for(TipoIngrediente item : listaTipoIngrediente) {
            System.out.println(item.toString());
        }

        System.out.println("==================================================================");

        // listar tipos peso cadastrados

        System.out.println("==================================================================");

        //TipoPeso tipoPesoLista = new TipoPeso();
        TipoPesoDAO tipoPesoDAOLista = new TipoPesoDAO();
        List<TipoPeso> tipoPesoLista = tipoPesoDAOLista.getListaConsulta();
        System.out.println("==================================================================");

        System.out.println("Listagem de Tipos de peso ....");
        for(TipoPeso item : tipoPesoLista) {
            System.out.println(item.toString());
        }

        System.out.println("==================================================================");
        System.out.println("==================================================================");

        /*
        TipoIngrediente tipoIngrediente = new TipoIngrediente(1L , "Industrializado");
        TipoIngredienteDAO tipoIngredienteDAO = new TipoIngredienteDAO();
        tipoIngredienteDAO.cadastrar(tipoIngrediente);

         */

        /*
        //INCLUSÃO Embalagem
            Embalagem embalagem = new Embalagem(1L, "Embalagem Ketchup Heinz 397 G ", 3 , 1.0 ,0.7 ,
                    "Pote Plástico", "Plástico",new FornecedorDAO().getConsulta(4) );
            EmbalagemDAO embalagemDAO = new EmbalagemDAO();
            embalagemDAO.cadastrar(embalagem);
*/
/*
        // INGREDIENTE
        Ingrediente ingrediente = new Ingrediente(1L , "Cebola Caramelizada",
                new FornecedorDAO().getConsulta(3), new TipoIngredienteDAO().getConsulta(4));
        IngredienteDAO ingredienteDAO = new IngredienteDAO();
        ingredienteDAO.cadastrar(ingrediente);
*/


/*
        //NUTRIENTE
        Nutriente nutriente = new Nutriente(1L , "Sódio");
        NutrienteDAO nutrienteDAO = new NutrienteDAO();
        nutrienteDAO.cadastrar(nutriente);
*/

/*
        //Tipo peso
        TipoPeso tipoPeso = new TipoPeso(1L , "Miligramas");
        TipoPesoDAO tipoPesoDAO = new TipoPesoDAO();
        tipoPesoDAO.cadastrar(tipoPeso);
*/

/*
        //Tipo Categoria
        Categoria categoria = new Categoria(1L , "Maionese");
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        categoriaDAO.cadastrar(categoria);


 */

//lançar produto
/*
        Produto produto = new Produto(1L, "Ketchup Tradicional Quero Squeeze 200g",3, 9.40, 200, 200,
                12,14,"Quero é a marca de ketchup mais presente nos lares brasileiros*" +
                " e tem a combinação perfeita entre qualidade e preço acessível. Ele é a certeza de agradar os adultos, os " +
                "jovens e a criançada igualmente. Essa versão do Ketchup Tradicional Quero de 200g é ideal para incremetar " +
                "pequenos pratos como lanches, hambúrgueres, pizzas e etc.","Quero", new TipoPesoDAO().getConsulta(1),
                new CategoriaDAO().getConsulta(1),  new EmbalagemDAO().getConsulta(21));
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.cadastrar(produto);

 */

        /*
        //ENTRADA DE PRODUTO NO ESTOQUE
        EstoqueProduto estoqueProduto = new EstoqueProduto(new ProdutoDAO().getConsultaProduto(3),
                new EstoqueDAO().getConsulta(1) ,1L, 100,
                new java.sql.Date(2023,5,25),
                new java.sql.Date(2023,5,25));

        System.out.println("=======================================");
        System.out.println(estoqueProduto);


        EstoqueProdutoDAO estoqueProdutoDAO = new EstoqueProdutoDAO();
        estoqueProdutoDAO.entradaEstoque(estoqueProduto);
*/
/*
        //ENTRADA DE INGREDIENTE NO ESTOQUE
        EstoqueIngrediente estoqueIngrediente = new EstoqueIngrediente(new IngredienteDAO().getConsulta(1),
                new EstoqueDAO().getConsulta(1),1L,150 , new java.sql.Date(2023,8,10) );

        EstoqueIngredienteDAO estoqueIngredienteDAO = new EstoqueIngredienteDAO();
        estoqueIngredienteDAO.entradaEstoque(estoqueIngrediente);
*/
/*
        ComposicaoNutricional composicaoNutricional = new ComposicaoNutricional(1L,131, 1,
                new ProdutoDAO().getConsultaProduto(21),new NutrienteDAO().getConsulta(27),new TipoPesoDAO().getConsulta(21) );
        ComposicaoNutricionalDAO composicaoNutricionalDAO = new ComposicaoNutricionalDAO();
        composicaoNutricionalDAO.cadastrar(composicaoNutricional);
*/

//27 - SODIO
        //21 CARBO
       // System.out.println(new ComposicaoNutricionalDAO().getRelatorioComposicao(new NutrienteDAO().getConsulta(21)));


/*
        FornecedorAuditoria fornecedorAuditoria = new FornecedorAuditoria(new FornecedorDAO().getConsulta(21),1L,
                "Auditoria Semestral 1/2 2023",new Date(2023,4-1,20),false,"Foi constatado que estão adicionando um produto químico fora do " +
                "acordado e que infringe as normas da Kraft Heinz, fornecedor se comprometeu a ajustar seu processo até 28/08/2023 onde será realizado uma nova auditoria",
                "Auditor Kraft Heinz");
        new FornecedorAuditoriaDAO().lancarAuditoria(fornecedorAuditoria);

 */
    }


}
