package integracao.dropbox.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String usuario;
	@Column(name = "email_dropbox")
	private String emailDropbox;
	private String senha;
	@Column(name = "senha_dropbox")
	private String senhaDropbox;
	
	public Usuario() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmailDropbox() {
		return emailDropbox;
	}

	public void setEmailDropbox(String emailDropBox) {
		this.emailDropbox = emailDropBox;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenhaDropbox() {
		return senhaDropbox;
	}

	public void setSenhaDropbox(String senhaDropbox) {
		this.senhaDropbox = senhaDropbox;
	}

}
