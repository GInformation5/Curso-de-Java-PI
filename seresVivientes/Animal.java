package seresVivientes;

public class Animal extends SerVivo
{
	
	// - Atributos -
	
	private boolean explorando;
	
	// - Constructores -
	
	public Animal(String serVivo, double altura)
	{
		super(serVivo, altura);
	}
	
	// - Metodos remplazadores -
	
	@Override
	public void conseguirAlimento()
	{
		explorar();
		System.out.println(getSerVivo()+" ha conseguido alimento.");
		dejarExplorar();
	}
	
	// - Metodos -
	
	public void explorar()
	{
		if(explorando) System.out.println(getSerVivo()+" ya esta explorando.");
		else 
		{
			explorando = true;
			System.out.println(getSerVivo()+" se ha puesto a explorar.");
		}
	}
	
	public void dejarExplorar()
	{
		if(!explorando) System.out.println(getSerVivo()+" ya se encuentra no explorando.");
		else 
		{
			explorando = false;
			System.out.println(getSerVivo()+" ha dejado de explorar.");
		}
	}
	
	// - Getter -
	
	public String getInfo()
	{
		return 
		super.getInfo()+"\n"+
		"Explorando: "+explorando;
		
	}
	
}
