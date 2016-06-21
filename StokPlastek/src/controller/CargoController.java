/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.CargoBean;
import dao.CargoDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author 12121001933
 */
public class CargoController {
    CargoDao objCargoDao;
    
    public CargoController(){
        objCargoDao = new CargoDao();
    }

    public void inserir (String nome,String descri) throws ClassNotFoundException, SQLException{
        CargoBean cargoBean = new CargoBean(nome, descri);
        objCargoDao.inserir(cargoBean);
    }
    
     public void alterar (int id,String nome,String descri) throws ClassNotFoundException, SQLException{
        CargoBean cargoBean = new CargoBean(id,nome, descri);
        objCargoDao.alterar(cargoBean);
    }
     
     public void excluir(int id,String nome,String descri) throws ClassNotFoundException, SQLException{
         CargoBean cargoBean = new CargoBean(id,nome, descri);
         objCargoDao.excluir(cargoBean);
     }
     
     public List<CargoBean> consultar(String termo) throws SQLException, ClassNotFoundException{
         return objCargoDao.consulta(termo);  
     }
     public void validar(String nome, String descri){
         //falta fazer o pacote validação :)
         
     }
}
