package mundo;

import java.lang.Math;

public class Generador {
	
	private int numeroObjetivo;
        private int numeroDeCifras;
	
	public Generador() {
	}

	public int getNumeroObjetivo() {
		return numeroObjetivo;
	}
	
	public int generarNumero(int a) {
            
            numeroDeCifras = a;
		
		boolean checker = false;
		int result=0;
		
		while(checker==false) {
			
		result =(int) (Math.random()*generarNumeroParaGenerador(numeroDeCifras));
			
		if(revisarNumero(result)==true) {
				checker=true;
		}
						
		}
		
	return result;
	}
	
	public boolean revisarNumero(int a) {
		
		String b = a+"";
		boolean resultado = false;
		
		if(b.length()==numeroDeCifras) {
			for (int i =0; i<b.length(); i++) {
                            for(int j=0;j<b.length(); j++) {
                                  if(i!=j) {
                                     if(b.charAt(i)==b.charAt(j)) {
					resultado = false;
                                        return resultado;
							}
                                     else resultado = true;
					}
				}
			}
		}
		
		return resultado;
		
	}
        
        public int generarNumeroParaGenerador(int a){
        
            int result = 1;
            
            for(int i=0; i<a; i++){
            
                result*=10;
                
            }
           
            return result;
            
        }
}
