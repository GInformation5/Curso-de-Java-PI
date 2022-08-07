package seresVivientes;

public abstract class SerVivo 
{
	
	// - Constructores -
	
	public SerVivo(String serVivo, double altura)
	{
		setSerVivo(serVivo);
		setSerAltura(altura);
	}
	
	// - Atributos -
	
	private String serVivo;
	private double altura;
	
	// - Metodos abstractos -
	
	public abstract void conseguirAlimento();
	
	// - Metodos -
	
	public void respirar()
	{
		System.out.println(serVivo+" esta inhalando oxigeno y exhalando co2");
	}
	
	// - Getters -
	
	public String getSerVivo()
	{
		return serVivo;
	}
	
	public double getAltura()
	{
		return altura;
	}
	
	public String getInfo()
	{
		return 
		"Ser vivo: "+serVivo+"\n"+
		"Altura: "+altura+" m";
	}
	
	// - Setters -
	
	public void setSerVivo(String serVivo)
	{
		this.serVivo = serVivo;
	}
	
	public void setSerAltura(double altura)
	{
		this.altura = altura;
	}
	
}
