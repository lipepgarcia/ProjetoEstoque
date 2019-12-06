package DAO;

import Connection.Conexao;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoDAO {
    
    // metodo inserir
    public boolean inserir(Produto f){
        Connection con = new Conexao().getConnection();
        PreparedStatement stmt;
        
        try {
            String sql = "insert into produto(nome_produto, quant_minima, estoque_atual, preco_unitario)\n" +
                "values(?, ?, ?, ?); ";
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setInt(2, f.getQtda());
            stmt.setInt(3, f.getEstoque());
            stmt.setFloat(4, f.getPreco());
           
            
            stmt.execute();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    // metodo selecionar
    public List<Produto> selecionarTodos(){
        Connection con = new Conexao().getConnection();
        List<Produto> lista = new ArrayList<Produto>();
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM produto ORDER BY cod_produto" );
            while ( rs.next() ) {
                Produto fo = new Produto();
                
               fo.setCod( rs.getInt("cod_produto") );
               fo.setNome(rs.getString("nome_produto") );
               fo.setQtda(rs.getInt("quant_minima") );
               fo.setEstoque(rs.getInt("estoque_atual") );
               fo.setPreco(rs.getFloat("preco_unitario") );

               lista.add(fo);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
    
    //atualizar
    public boolean atualizar(Produto f){
        Connection con = new Conexao().getConnection();
        PreparedStatement stmt;
        
        try {
            String sql = "update produto set nome_produto = ?, quant_minima = ?, estoque_atual = ?, preco_unitario = ? where cod_produto = ?";
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getNome());
            stmt.setInt(2, f.getQtda());
            stmt.setInt(3, f.getEstoque());
            stmt.setFloat(4, f.getPreco());
            stmt.setInt(5, f.getCod());
           
            
            stmt.execute();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
        
    //Deletar
    public boolean deletar(Produto f){
        Connection con = new Conexao().getConnection();
        PreparedStatement stmt;
        
        try {
            String sql = "delete from produto where cod_produto = ?";
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, f.getCod());
           
            
            stmt.execute();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
        
    // buscar
    public List<Produto> selecionarBusca(String busca){
        Connection con = new Conexao().getConnection();
        List<Produto> lista = new ArrayList<Produto>();
        Integer buscaInt;
        try{
            buscaInt = Integer.valueOf(busca);
        }catch(NumberFormatException ex){
            buscaInt = 0;
        }
        
        
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM produto WHERE"
                +" cod_produto = ?"
                +"OR nome_produto ILIKE ?"
                +"OR quant_minima = ?"
                +"OR estoque_atual = ?"
                +"OR preco_unitario = ? ORDER BY cod_produto"
            );
            stmt.setInt(1, buscaInt );
            stmt.setString(2, "%" + busca + "%");
            stmt.setInt(3, buscaInt );
            stmt.setInt(4, buscaInt);
            stmt.setFloat(5, buscaInt );
            
            ResultSet rs = stmt.executeQuery();
            while ( rs.next() ) {
                Produto fo = new Produto();
                
               fo.setCod( rs.getInt("cod_produto") );
               fo.setNome(rs.getString("nome_produto") );
               fo.setQtda(rs.getInt("quant_minima") );
               fo.setEstoque(rs.getInt("estoque_atual") );
               fo.setPreco(rs.getFloat("preco_unitario") );

               lista.add(fo);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
}

