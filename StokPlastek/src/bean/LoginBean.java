/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author 12141000464
 */
public class LoginBean {
	public String usuario;
	public String senha;
        public int funcao;

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public int getFuncao() {
            return funcao;
        }

        public void setFuncao(int funcao) {
            this.funcao = funcao;
        }


}
