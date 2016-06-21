/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.CidadeBean;
import dao.CidadeDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author 12121001933
 */
public class CidadeController {
    CidadeDao objCidadeDao;
    
    public CidadeController(){
        objCidadeDao = new CidadeDao();
    }

    public void inserir (String nome,String descri) throws ClassNotFoundException, SQLException{
        CidadeBean cidadeBean = new CidadeBean(nome, descri);
        objCidadeDao.inserir(cidadeBean);
    }
    
     public void alterar (int id,String nome,String descri) throws ClassNotFoundException, SQLException{
        CidadeBean cidadeBean = new CidadeBean(id,nome, descri);
        objCidadeDao.alterar(cidadeBean);
    }
     
     public void excluir(int id,String nome,String descri) throws ClassNotFoundException, SQLException{
         CidadeBean cidadeBean = new CidadeBean(id,nome, descri);
         objCidadeDao.excluir(cidadeBean);
     }
     
     public List<CidadeBean> consultar(String termo) throws SQLException, ClassNotFoundException{
         return objCidadeDao.consulta(termo);  
     }
     public void validar(String nome, String descri){
         //falta fazer o pacote validação :)
         
     }
}
