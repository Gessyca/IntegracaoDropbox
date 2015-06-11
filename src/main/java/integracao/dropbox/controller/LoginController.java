package integracao.dropbox.controller;

import integracao.dropbox.entidade.Usuario;
import integracao.dropbox.jpa.UsuarioJPA;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class LoginController implements Serializable {

	private String usuario;
	private String senha;
	@Inject
	private UsuarioJPA jpa;

	public void logar() {
		Usuario u = jpa.buscarUsuarioPorNomeSenha(usuario, senha);
		if (u != null) {
			// ir para a pagina do dropbox
		}
	}

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

}
