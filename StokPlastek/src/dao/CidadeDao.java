/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.CidadeBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 12121001933
 */
public class CidadeDao {
    
     public void inserir(CidadeBean cidade) throws ClassNotFoundException, SQLException{
        String sql="INSERT INTO tb_cidade(nome_cidade,uf_cidade) values(?,?);";
        PreparedStatement cmdsql= ConexaoMySQL.getInstance().prepareStatement(sql);
        
        cmdsql.setString(1,cidade.getNomeCidade());
        cmdsql.setString(2,cidade.getUFCidade());
        
        
        cmdsql.execute();
        ConexaoMySQL.getInstance().commit();
  
    }
    
    public void alterar(CidadeBean cidade) throws ClassNotFoundException, SQLException{
        String sql = "UPDATE tb_cidade SET nome_cidade = ?, uf_cidade=? WHERE id_cidade = ?;";
        PreparedStatement cmdsql = ConexaoMySQL.getInstance().prepareStatement(sql);
        
        cmdsql.setString(1,cidade.getNomeCidade());
        cmdsql.setString(2,cidade.getUFCidade());
        cmdsql.setInt(3,cidade.getIdCidade());
        
        cmdsql.execute();
        ConexaoMySQL.getInstance().commit();
 
    }
    
   
    public void excluir(CidadeBean cidade) throws ClassNotFoundException, SQLException{
        String sql = "DELETE FROM `tb_cidade` WHERE `id_cidade`=?;";
        PreparedStatement cmdsql=null;
        cmdsql=ConexaoMySQL.getInstance().prepareStatement(sql);
        cmdsql.setInt(1,cidade.getIdCidade());
        cmdsql.execute();
        
    }
    
    public List<CidadeBean> consulta(String pesquisa) throws SQLException,ClassNotFoundException{
        String sql;
        if(!pesquisa.equals("")){
            sql = "SELECT * FROM tb_cidade WHERE nome_cidade like "+pesquisa+" ;";
        }else{
            sql = "SELECT * FROM tb_cidade";
        }
                
        PreparedStatement cmdsql = ConexaoMySQL.getInstance().prepareStatement(sql);
        ResultSet rs = cmdsql.executeQuery(sql);

        List<CidadeBean> listacidade = new LinkedList<>();

        while (rs.next()){
            CidadeBean cidade = new CidadeBean(
                rs.getInt("id_cidade"),
                rs.getString("nome_cidade"),
                rs.getString("uf_cidade")

            );

            listacidade.add(cidade);
        }   
        return listacidade;
    }
    
}
