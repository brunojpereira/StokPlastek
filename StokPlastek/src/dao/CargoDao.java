/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.CargoBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 12121001933
 */
public class CargoDao {
    
     public void inserir(CargoBean cargo) throws ClassNotFoundException, SQLException{
        String sql="INSERT INTO tb_cargo(nome_cargo,descricao_cargo) values(?,?);";
        PreparedStatement cmdsql= ConexaoMySQL.getInstance().prepareStatement(sql);
        
        cmdsql.setString(1,cargo.getNomeCargo());
        cmdsql.setString(2,cargo.getDescCargo());
        
        
        cmdsql.execute();
        ConexaoMySQL.getInstance().commit();
  
    }
    
    public void alterar(CargoBean cargo) throws ClassNotFoundException, SQLException{
        String sql = "UPDATE tb_cargo SET nome_cargo = ?, descricao_cargo=? WHERE id_cargo = ?;";
        PreparedStatement cmdsql = ConexaoMySQL.getInstance().prepareStatement(sql);
        
        cmdsql.setString(1,cargo.getNomeCargo());
        cmdsql.setString(2,cargo.getDescCargo());
        cmdsql.setInt(3,cargo.getIdCargo());
        
        cmdsql.execute();
        ConexaoMySQL.getInstance().commit();
 
    }
    
   
    public void excluir(CargoBean cargo) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM `tb_cargo` WHERE `id_cargo`=?;";
        PreparedStatement cmdsql=null;
        cmdsql=ConexaoMySQL.getInstance().prepareStatement(sql);
        cmdsql.setInt(1,cargo.getIdCargo());
        cmdsql.execute();
        
    }
    
    public List<CargoBean> consulta(String pesquisa) throws SQLException,ClassNotFoundException{
        String sql;
        if(!pesquisa.equals("")){
            sql = "SELECT * FROM tb_cargo WHERE nome_cargo like "+pesquisa+" ;";
        }else{
            sql = "SELECT * FROM tb_cargo";
        }
                
        PreparedStatement cmdsql = ConexaoMySQL.getInstance().prepareStatement(sql);
        ResultSet rs = cmdsql.executeQuery(sql);

        List<CargoBean> listacargo = new LinkedList<>();

        while (rs.next()){
            CargoBean cargo = new CargoBean(
                rs.getInt("id_cargo"),
                rs.getString("nome_cargo"),
                rs.getString("descricao_cargo")

            );

            listacargo.add(cargo);
        }   
        return listacargo;
    }
    
}
