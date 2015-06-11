package integracao.dropbox.controller;

import integracao.dropbox.entidade.Usuario;
import integracao.dropbox.service.DropboxService;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class DropboxController implements Serializable {

	@Inject
	private DropboxService service;
	private File arquivo;
	private String nomeArquivo;
	private String caminhoArquivo;
	private Usuario u;
	
	public void inicializar(){
	}
	
	public void listar(){
		service.listFolders();
	}
	
	public void upload(){
		try {
			service.uploadFile(arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void download(){
		try {
			service.downloadFile(nomeArquivo, caminhoArquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
