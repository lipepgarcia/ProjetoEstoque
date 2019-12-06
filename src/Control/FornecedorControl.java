
package Control;

import DAO.FornecedorDAO;
import View.TelaFornecedor;
import Model.Fornecedor;
import Model.Produto;
import java.util.List;

public class FornecedorControl {
    private final TelaFornecedor view;
    private final FornecedorDAO dao;
    
    public FornecedorControl(TelaFornecedor v){
        this.view = v;
        dao = new FornecedorDAO();
    }
    
    public boolean inserir(){
        Fornecedor fo = view.lerForm();
        
        return dao.inserir(fo);      
    }
    
    public List<Fornecedor> selecionarTodos(){
        return dao.selecionarTodos();
    }

    public boolean deletar() {
        Fornecedor fo = view.lerForm();
        
        return dao.deletar(fo);      
    }

    public boolean atualizar() {
        Fornecedor fo = view.lerForm();
        
        return dao.atualizar(fo);      
    }
}
