/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.LoginBean;
import dao.LoginDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author 12141000464
 */
public class LoginController {
	private LoginDao loginDao;
	
	public LoginController() {
		loginDao = new LoginDao();
	}
	
	public List<LoginBean> consultar() throws ClassNotFoundException, SQLException {
		return loginDao.consultar();
	}
}
