package padrao;

public class Programa {

	public static void main(String[] arg) throws Exception {
		
		System.out.println("Exemplo de automovel: ");
		System.out.println();
		
		System.out.println("Escolha o tipo de automovel que você quer comprar ");
		System.out.println("CARRO, MOTO, CAMINHAO, VAN, ONIBUS.");
		System.out.println();
		
		TipoAltomovel tipoAltomovel = TipoAltomovel.valueOf("CARRO");
		
		System.out.println("Defenindo a cor do automovel");
		System.out.println();
		
		String corDoAltomovel = "Azul";
		
		Corola corola =  new Corola(corDoAltomovel, tipoAltomovel);
		
		corola.descricaoDoAutomovel("RTX 8", 6);
	}
}
