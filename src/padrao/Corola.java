package padrao;

public class Corola extends Automovel {
	
	public Corola(String corDoAltomovel, TipoAltomovel tipoDeAltomovel) {
		super(corDoAltomovel, tipoDeAltomovel);
		
	}
	
	public Corola() {
	}

	@Override
	public void acelereracaoMaxima() {
		System.out.println("Minha aceleração máxima é de 200km");
		
	}

	@Override
	public void descricaoDoAutomovel() {
		System.out.println("Sou um "+ super.getTipoDEAltomovel() + ", o mais elogiado do ano, confortavel e possuo a cor " + super.getCorDoAltomovel());
		
	}
	
	@Override
	protected Corola automovel() {
		return new Corola();
	}
	
	
	public void descricaoDoAutomovel(String motor) {
		System.out.println("Sou um " + super.getTipoDEAltomovel() + " mais elogiado do ano, confortavel e possuo a cor " + super.getCorDoAltomovel() + 
				"com o motor " + motor);
		
	}
	
	public void descricaoDoAutomovel(String motor, int cambio) {
		System.out.println("Sou um " + super.getTipoDEAltomovel() + " carro mais elogiado do ano, confortável e possuo a cor " + super.getCorDoAltomovel() + 
				"com o motor " + motor + " e possui um cambio de " + cambio + " marchas");
		
	}

	

}
