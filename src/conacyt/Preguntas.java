package conacyt;

public class Preguntas {
    String[] Preguntas={
        "¿Que es usado para hacer llamadas?","¿De donde descargas juegos?",
        "¿Celular de la manzana?","¿Celular del monito verde?",
        "¿Pagina para ver videos?","¿Red social del pajaro celeste?",
        "¿Como se llama la red de computadoras?",
        "¿Mensajeria usado en los celulares?",
        "¿Navegador de Internet mas utilizado?",
        "¿Buscador de Internet mas utilizado?"
    };
    
    public String getPregunta(int posicion){
        return Preguntas[posicion];
    };
};
