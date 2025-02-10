package padrao;

public class Corola extends Automovel {
	
	
	public Corola(String corDoAltomovel, TipoAltomovel tipoDeAltomovel) {
		super(corDoAltomovel, tipoDeAltomovel);
		
	}

	@Override
	public void acelereracao() {
		System.out.println("Minha aceleração máxima é de 200km");
		
	}

	@Override
	public void descricao() {
		System.out.println("Sou um "+ super.getTipoDEAltomovel() + ", o mais elogiado do ano, confortavel e possuo a cor " + super.getCorDoAltomovel());
		
	}
	
	
	public void descricao(String motor) {
		System.out.println("Sou um " + super.getTipoDEAltomovel() + " mais elogiado do ano, confortavel e possuo a cor " + super.getCorDoAltomovel() + 
				"com o motor " + motor);
		
	}
	
	public void descricao(String motor, double cavalos) {
		System.out.println("Sou um " + super.getTipoDEAltomovel() + " carro mais elogiado do ano, confortável e possuo a cor " + super.getCorDoAltomovel() + 
				"com o motor " + motor + " e possui " + cavalos);
		
	}

}
