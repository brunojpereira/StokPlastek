/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.LoginBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 12141000464
 */
public class LoginDao {
	
	public List<LoginBean> consultar() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM tb_usuario";
		
		PreparedStatement comandoSql = 
				ConexaoMySQL.getInstance().prepareStatement(sql);
		
		ResultSet rs = comandoSql.executeQuery();
		
		List<LoginBean> lista = new LinkedList<LoginBean>();
		
		while (rs.next()){
			LoginBean login = new LoginBean();
			login.setUsuario(rs.getString("nome_usuario"));
			login.setSenha(rs.getString("senha_usuario"));
			login.setFuncao(rs.getInt("funcao_usuario"));
			lista.add(login);
		}
		return lista;
	}

}
