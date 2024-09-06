package aula;

public class Anatomia {
public static void main(String[] args) {
	String primeiroNome = "Luciana";
	String segundoNome ="Gomes de Sousa";
	
	String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
	System.out.println(nomeCompleto);
	
	}
public static String nomeCompleto(String primeiroNome, String segundoNome) {
	return primeiroNome.concat(" ").concat(segundoNome);
}

}