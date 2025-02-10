package padrao;

public abstract class Automovel {

	private String corDoAltomovel;
	private TipoAltomovel tipoDEAltomovel;
	
	public Automovel(String corDoAltomovel, TipoAltomovel tipoDeAltomovel) {
		this.corDoAltomovel = corDoAltomovel;
		this.tipoDEAltomovel = tipoDeAltomovel;
	}
	
	public abstract void acelereracao();
	
	protected abstract void descricao() throws Exception;

	public String getCorDoAltomovel() {
		return corDoAltomovel;
	}

	public TipoAltomovel getTipoDEAltomovel() {
		return tipoDEAltomovel;
	}	
	
}
