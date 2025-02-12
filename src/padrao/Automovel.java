package padrao;

public abstract class Automovel {

	private String corDoAltomovel =  "verde";
	private TipoAltomovel tipoDEAltomovel = TipoAltomovel.VAN;
	
	public Automovel(String corDoAltomovel, TipoAltomovel tipoDeAltomovel) {
		this.corDoAltomovel = corDoAltomovel;
		this.tipoDEAltomovel = tipoDeAltomovel;
	}
	
	public Automovel() {
	}
	
	public abstract void acelereracaoMaxima();
	
	protected abstract void descricaoDoAutomovel() throws Exception;
	
	abstract Automovel automovel();

	public String getCorDoAltomovel() {
		return corDoAltomovel;
	}

	public TipoAltomovel getTipoDEAltomovel() {
		return tipoDEAltomovel;
	}	
	
}
