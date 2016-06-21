 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author 12121001933
 */
public class CidadeBean {
    int idCidade;
    String nomeCidade,ufCidade;
    
    public CidadeBean(int id,String nome,String uf){
        this.idCidade=id;
        this.ufCidade=uf;
        this.nomeCidade=nome;
    }
    
    public CidadeBean(String nome,String uf){
        this.ufCidade=uf;
        this.nomeCidade=nome;
    }

    public CidadeBean() {
    }
    
    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getUFCidade() {
        return ufCidade;
    }

    public void setUFCidade(String ufCidade) {
        this.ufCidade = ufCidade;
    }
    

    
}
