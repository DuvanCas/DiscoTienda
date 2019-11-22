/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.disco;


import Entity.Usuario;
import Peristencia.UsuarioFacadeLocal;
//import com.sun.xml.internal.ws.client.RequestContext;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.ejb.EJB;
import org.primefaces.context.RequestContext;

/**
 *
 * @author duvan
 */
@Named(value = "logica")
@SessionScoped
public class Logica implements Serializable {

    @EJB
    UsuarioFacadeLocal usuarioFacade;
    
    Usuario usuario;
    
    private String usarname;
    private String password;
    public Logica() {
    }

    
     public String loginControl(){
        if(validarLogin()){
            return"welcomePrimefaces.xhtml?faces-redirect=true";
        }
        RequestContext.getCurrentInstance().update("growl");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error","Usuario o clave invalida"));
        return "";
    }
     
    public Boolean validarLogin(){
        try {
            usuario = usuarioFacade.findUsuario(usarname, password);
        
        if(usuario.getId() != null){
            return true;
        }
            
        } catch (Exception e) {
            
        }
        return false;
    }
    
    public String getUsarname() {
        return usarname;
    }

    public void setUsarname(String usarname) {
        this.usarname = usarname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
