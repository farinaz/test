package main;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by Bijan on 20/08/2015.
 */
@ManagedBean(name = "containerAdminPage")
@SessionScoped
public class ContainerAdminPage implements Serializable {
    private String currentPage;
    private String currentTitle;
    private String tab;


    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }


    public void updateCurrentPage() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params = fc.getExternalContext()
                .getRequestParameterMap();
        currentPage = params.get("current");
        currentTitle = params.get("title");
        tab=params.get("tab");
    }

    public String getCurrentTitle() {
        return currentTitle;
    }

    public void setCurrentTitle(String currentTitle) {
        this.currentTitle = currentTitle;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

}
