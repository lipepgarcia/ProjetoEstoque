
package Model;


public class Fornecedor extends Pessoa {
    private int cod;
    private String cnpj;

    
    public Fornecedor() {
        
    }
    
    public Fornecedor(String nome, int cnpj) {
        
    }
    
    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   
}
