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
        
        if(!mail1.isEmpty()){    //Si el mail tiene caracteres es verdadero
            if(mail1.contains("alumno@ulp.edu.ar")){ 
                JOptionPane.showMessageDialog(null, "               Usuario Valido\n*** Bienvenido al Campus ULP ***");
 //               controlo que tenga el @ y no tenga espacios.
//                ArrayList<String> estructuraMail=new ArrayList<>(Arrays.asList(mail1.split("@")));  //divido el mail en partes en el @.
//                if(estructuraMail.size()==2){       //Controlo la estructura que tengo despues de separarla en el @ (debe tener 2 partes).
//                    estructuraMail.addAll(Arrays.asList(estructuraMail.get(1).split("\\.")));   //divido la segunda parte en el .
//                    estructuraMail.remove(1);
//                    if(estructuraMail.size()==3){   //controla la estructura (debe tener 3 partes)
//                        if(estructuraMail.get(2).length()<=3&&estructuraMail.get(2).length()>=2){   //controlo el final del mail
//                            return true;
//                        }
            }else{
                JOptionPane.showMessageDialog(null, "                  ERROR!!!\n*** USUARIO INCORRECTO!!! ***");
            }
        } 
        return false;
    }      
}
