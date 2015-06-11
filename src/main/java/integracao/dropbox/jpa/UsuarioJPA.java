package integracao.dropbox.jpa;

import integracao.dropbox.entidade.Usuario;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class UsuarioJPA implements Serializable {

	@PersistenceContext(unitName = "dropbox")
	private EntityManager em;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public <T> T salvar(T t) {
		em.persist(t);
		em.flush();
		return t;
	}

	public <T> void atualizar(T t) {
		em.merge(t);
	}

	public <T> void remover(int id, Class<T> klass) {
		em.remove(em.find(klass, id));
	}

	public List<Usuario> buscarTodosUsuarios() {
		String jpql = "select u from Usuario u order by u.usuario";
		return em.createQuery(jpql, Usuario.class).getResultList();
	}
}
