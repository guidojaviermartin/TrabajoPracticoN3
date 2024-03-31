package ejemplodiseño;

import javax.swing.JOptionPane;

public class ControlPass {

    public ControlPass() {
    }
    
    public boolean verificaPass(String pass1){ 
        return((pass1.isEmpty()||!(pass1.contains("12345678"))));
    }  
}
