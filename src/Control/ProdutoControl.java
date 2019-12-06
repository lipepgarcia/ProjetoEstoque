package Control;

import DAO.ProdutoDAO;
import Model.Produto;
import View.TelaProduto;
import java.util.List;

public class ProdutoControl {
    private final TelaProduto view;
    private final ProdutoDAO dao;
    
    public ProdutoControl(TelaProduto v){
        this.view = v;
        dao = new ProdutoDAO();
    }
    
    public boolean inserir(){
        Produto fo = view.lerForm();
        
        return dao.inserir(fo);      
    }
    
    public List<Produto> selecionarTodos(){
        return dao.selecionarTodos();
    }
    
    public boolean atualizar(){
        Produto fo = view.lerForm();
        
        return dao.atualizar(fo);      
    }

    public boolean deletar(){
        Produto fo = view.lerForm();
        
        return dao.deletar(fo);      
    }
    
    public List<Produto> buscar(String busca){
        
        return dao.selecionarBusca(busca);
    }
}
