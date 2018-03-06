package ejbs;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class NewSessionBean {
    String mensaje="";
    
    @PostConstruct
    void crear() {
        mensaje +="PostConstruct"; 
    }
    
    @PreDestroy
    void remove() {
        mensaje += "PreDestroy::";
        System.out.println(mensaje);
    }
    
    public String getString() {
        mensaje += "getString (NewSessionBean)";
        return mensaje;
    }
}