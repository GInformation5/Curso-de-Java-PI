package seresVivientes;

public class Planta extends SerVivo
{
	
	// - Atributos -
	
	private boolean elaborandoAlimento;
	private Double oxigenoALiberar;
	
	// - Constructores -
	
	public Planta(String serVivo, double altura)
	{
		super(serVivo, altura);
	}
	
	// - Metodos remplazadores -
	
	@Override
	public void conseguirAlimento()
	{
		elaborarAlimento();
		System.out.println(getSerVivo()+" ha conseguido alimento.");
		dejarElaborarAlimento();
		if(oxigenoALiberar == null) oxigenoALiberar = 1.0;
		System.out.println(getSerVivo()+" ha liberado "+oxigenoALiberar+" litros de oxigeno");
	}
	
	// - Metodos -
	
	public void elaborarAlimento()
	{
		if(elaborandoAlimento) System.out.println(getSerVivo()+" se encuentra elaborando el alimento.");
		else 
		{
			elaborandoAlimento = true;
			System.out.println(getSerVivo()+" se ha puesto a elaborar su alimento.");
		}
	}
	
	public void dejarElaborarAlimento()
	{
		if(!elaborandoAlimento) System.out.println(getSerVivo()+" no se encuentra elaborando el alimento.");
		else 
		{
			elaborandoAlimento = false;
			System.out.println(getSerVivo()+" ha dejado de elaborar alimento.");
		}
	}
	
	// - Setters -
	
	public void setOxigenoLiberado(double oxigenoALiberar)
	{
		this.oxigenoALiberar = oxigenoALiberar;
	}
	
	// - Getter -
	
	public String getInfo()
	{
		return 
		super.getInfo()+"\n"+
		"Elaborando alimento: "+elaborandoAlimento+"\n"+
		"Oxigeno a liberar: "+oxigenoALiberar+" litros";
		
	}

}
