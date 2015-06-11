package integracao.dropbox.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String usuario;
	@Column(name = "email_dropbox")
	private String emailDropbox;
	private String senha;
	@Column(name = "senha_dropbox")
	private String senhaDropbox;
	@Column(name = "app_key")
	private String appKey;
	@Column(name = "app_secret")
	private String appSecret;

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

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

}
