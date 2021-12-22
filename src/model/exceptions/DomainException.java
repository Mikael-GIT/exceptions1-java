package model.exceptions;

public class DomainException extends RuntimeException { //Diferenca entre extender uma 
	//runtimeexception e uma exception e que a runtimeexception so e capturada
	//quando o programa e executado, logo nao e obrigatorio trata-la, enquanto
	//a exception comum e verificada pelo compilador, ou seja, tem que ser tratada
	//para ser executada ou acusara erro

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg){
		super(msg);
	}
}
