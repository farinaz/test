package main;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import java.io.*;

/**
 * Created by nanaz on 8/30/2015.
 */
@ManagedBean(name = "fileDownloadController")
@ViewScoped
public class FileDownloadController implements Serializable {
    private StreamedContent file;

    public void FileDownloadView() {
        InputStream stream = ((ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext()).getResourceAsStream("F:/1.jpg");
        file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_optimus.jpg");
    }

    public StreamedContent getFile() {
        return file;
    }

}
