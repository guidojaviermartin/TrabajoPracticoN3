package ejemplodiseño;

import java.util.ArrayList;
import java.util.Arrays;

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
            if(!mail1.contains(" ")&&mail1.contains("@")){      //controlo que tenga el @ y no tenga espacios.
                ArrayList<String> estructuraMail=new ArrayList<>(Arrays.asList(mail1.split("@")));  //divido el mail en partes en el @.
                if(estructuraMail.size()==2){       //Controlo la estructura que tengo despues de separarla en el @ (debe tener 2 partes).
                    estructuraMail.addAll(Arrays.asList(estructuraMail.get(1).split("\\.")));   //divido la segunda parte en el .
                    estructuraMail.remove(1);
                    if(estructuraMail.size()==3){   //controla la estructura (debe tener 3 partes)
                        if(estructuraMail.get(2).length()<=3&&estructuraMail.get(2).length()>=2){   //controlo el final del mail
                            return true;
                        }
                    }
                }
            }
        }
        return false;
        
       /*
        int arroba = 0;
       boolean punto= false;
       for(int i=0;i<mail1.length();i++){
           if(mail1.charAt(i) == '@'){
                arroba++;   
               
           }
           if(mail1.charAt(i) == '.'){
               punto=true;
           }
            
       }
       System.out.println("*** encontro el arroba: "+arroba +" veces");
       System.out.println("*** encontro el punto: "+punto);
       return punto&&(arroba>0&&arroba<2);
        */
    }
}
