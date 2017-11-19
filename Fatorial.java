public class Fatorial {
	// VERSAO ITERATIVA DO CALCULO DO FATORIAL, incluindo o teste para n=0	
	public int calculaFatorial(int n) throws IllegalArgumentException{
		if(n<0)
			throw new IllegalArgumentException("não existe fatorial para numeros negativos");
	int resultado=1;
	if(n !=0){	
	for(int i = 2; i<=n;i++){
			resultado*=i;
		}
		return resultado;
	}else
	return 1;
	}
}