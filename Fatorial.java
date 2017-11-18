public class Fatorial {
	// VERSAO ITERATIVA DO CALCULO DO FATORIAL	
	public int calculaFatorial(int n) throws IllegalArgumentException{
		int resultado=1;
		if(n<0)
			throw new IllegalArgumentException("não existe fatorial para numeros negativos");
		for(int i = 2; i<=n;i++){
			resultado*=i;
		}
		return resultado;
	}
}