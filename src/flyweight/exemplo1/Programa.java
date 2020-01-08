package flyweight.exemplo1;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {		
        NotasMusicais notas = new NotasMusicais();
        List<Nota> doReMiFa = Arrays.asList(
                notas.getNota("do"),    
                notas.getNota("re"),    
                notas.getNota("mi"),    
                notas.getNota("fa"),    
                notas.getNota("fa"),    
                notas.getNota("fa"),    

                notas.getNota("do"),    
                notas.getNota("re"),    
                notas.getNota("do"),    
                notas.getNota("re"),    
                notas.getNota("re"),    
                notas.getNota("re"),

                notas.getNota("do"),    
                notas.getNota("sol"),    
                notas.getNota("fa"),    
                notas.getNota("mi"),    
                notas.getNota("mi"),    
                notas.getNota("mi"),

                notas.getNota("do"),    
                notas.getNota("re"),    
                notas.getNota("mi"),    
                notas.getNota("fa"),    
                notas.getNota("fa"),    
                notas.getNota("fa"),
                
                notas.getNota("doSustenido"),  
                notas.getNota("reSustenido"),    
                notas.getNota("mi"),    
                notas.getNota("fa"),    
                notas.getNota("do")    
            );
        
        new Piano().toca(doReMiFa);
	}
}
