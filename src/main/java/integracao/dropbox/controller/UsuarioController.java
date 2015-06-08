package integracao.dropbox.controller;

import integracao.dropbox.entidade.Usuario;
import integracao.dropbox.jpa.UsuarioJPA;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class UsuarioController {

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
		if (u.getId() > 0) {
			jpa.atualizar(u);
		} else {
			jpa.salvar(u);
		}
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