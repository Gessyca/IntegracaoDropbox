package integracao.dropbox.service;

import java.io.File;
import java.io.IOException;

public interface DropboxService {


    void uploadFile(File file) throws IOException;

    void listFolders();

    void downloadFile(String fileName, String path) throws IOException;

    void deleteFile(File file);
}
