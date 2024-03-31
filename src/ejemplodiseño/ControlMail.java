package ejemplodiseño;

public class ControlMail {
    
    public ControlMail() {
    }
   
    public boolean verificaMail(String mail1){ 
        return ((mail1.isEmpty()||!(mail1.contains("alumno@ulp.edu.ar"))));
    }      
}
