package integracao.dropbox.controller;

import integracao.dropbox.entidade.Usuario;
import integracao.dropbox.jpa.UsuarioJPA;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class UsuarioController implements Serializable {

	@Inject
	private UsuarioJPA jpa;
	private Usuario u;
	private List<Usuario> listaUsuarios;

	@PostConstruct
	public void inicializar() {
		u = new Usuario();
		listaUsuarios = jpa.buscarTodosUsuarios();
	}

	public void salvar() {
		jpa.salvar(u);
		inicializar();
	}

	public void remover() {
		jpa.remover(u.getId(), Usuario.class);
		inicializar();
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

}
