package conacyt;

import java.util.StringTokenizer;

public class Answers {
    String[] Respuesta = {
      "Celular","Tienda de apps","Apple","Android","Youtube","Twitter","Internet","Whatsapp","Google Chrome","Google"
    };
    
    String[] radioR = {
        "Rectangulo de plastico,Celular",
        "Tienda de apps,Con Don Pepe",
        "Google,Apple",
        "Android,Dell",
        "Vimeo,Youtube",
        "MySpace,Twitter",
        "Internet,ArpaNet",
        "Mensaje de Texto,Whatsapp",
        "Google Chrome,Safari",
        "Yahoo!,Google"
    };
    
    public String getRespuesta(int posicion){
        return Respuesta[posicion];
    }
    
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[2];
        int i=0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken();
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas (int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
}
