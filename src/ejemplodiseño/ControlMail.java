package ejemplodiseño;

import javax.swing.JOptionPane;

public class ControlMail {
    String mail;

    public ControlMail() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ControlMail(String mail) {
        this.mail = mail;
    }
    
    public boolean verificaMail(String mail1){
        
        if((mail1.isEmpty()||!(mail1.contains("alumno@ulp.edu.ar")))){ 
            JOptionPane.showMessageDialog(null, "                  ERROR!!!\n*** Usuario y/o contraseña incorrectos ***");   
        }else{
            
            JOptionPane.showMessageDialog(null, "               Usuario Valido\n*** Bienvenido al Campus ULP ***");
        }
         
        return false;
    }      
}
