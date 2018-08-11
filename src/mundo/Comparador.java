package mundo;

import java.util.Arrays;

public class Comparador {


    public int getNumeroDeCifras() {
        return numeroDeCifras;
    }


    public void setNumeroDeCifras(int numeroDeCifras) {
        this.numeroDeCifras = numeroDeCifras;
    }
	
	public static String GANADOR = "...."; 
	
	private Integer numeroObjetivo;
	private Integer numeroActual;
        private int numeroDeCifras;
      private  Generador elGenerador;
	
        public Comparador () {
		
        	elGenerador=new Generador();
                numeroDeCifras =  4;
                numeroObjetivo = elGenerador.generarNumero(numeroDeCifras);
	}

	public int getNumeroObjetivo() {
		return numeroObjetivo;
	}

	public void setNumeroObjetivo(int numeroObjetivo) {
		this.numeroObjetivo = numeroObjetivo;
	}

	public int getNumeroActual() {
		return numeroActual;
	}

	public void setNumeroActual(int numeroActual) {
		this.numeroActual = numeroActual;
	}
	
	public String ordenamiento(String a) {
		
		String result = "";
		
		int[] b = new int[a.length()];
		
		for(int i=0; i<a.length(); i++) {
			b[i]=(int)a.charAt(i);
		}
		
		Arrays.sort(b);
		
		for(int j=0; j<a.length();j++) {
			result+=(char)b[j];
		}
		
		return result;
	}
	
	public Generador getElGenerador() {
		return elGenerador;
	}
	
	public String puntosYComas() {
		
		String result="";
		String numO = numeroObjetivo.toString();
		String numA = numeroActual.toString();
                
                if(elGenerador.revisarNumero(Integer.parseInt(numA))==false){
                    javax.swing.JOptionPane.showMessageDialog(null, "inserte un numero válido");
                }
		
                else{
                    if(numO.length()==numA.length()) {
                    for(int i=0;i<numO.length(); i++) {
                        boolean checker = false;
			int j = 0;
                            while(checker==false&&j<numO.length()){
				char a;
                                    if(numO.charAt(i)==numA.charAt(j)&&i==j) {
					a='.';
					result+=a;
					checker=true;
                                    }
                                    else if(numO.charAt(i)==numA.charAt(j)) {
                                        a=',';
					result+=a;
					checker=true;
					}
				j++;
				}
			}
		}
                }
		

		result=ordenamiento(result);
		return result;
	}
        
   public boolean comparacionCifras(){
    
        boolean checker = true;
    
        return checker;
    }
   
   public String determinarGanardor(){
   
       String result = "";
       
       for(int i = 0; i<numeroDeCifras; i++){
       
           result+=".";
           
       }
       
       return result;
       
   }
}