import javax.swing.JOptionPane;

import seresVivientes.Animal;
import seresVivientes.Planta;
import seresVivientes.SerVivo;



public class ImplementacionPOO 
{
		
	public static void main(String[] args) 
	{
		
		SerVivo [] seresVivos = new SerVivo [] 
		{
			new Animal("Leon", 2),
			new Planta("Captus", 8.5),
			new Animal("Humano", 1.80),
			new Planta("Zea mays", 1.2)
		};
		
		for(SerVivo serVivo : seresVivos)
		{
			try
			{
				Planta planta = (Planta)serVivo;
				planta.setOxigenoLiberado(Double.parseDouble(JOptionPane.showInputDialog
				(
					null,
					"Oxigeno liberado de "+serVivo.getSerVivo()+": ",
					"Establece el oxigeno liberado de "+serVivo.getSerVivo(),
					JOptionPane.INFORMATION_MESSAGE
				)));
			}
			catch(Exception excepcion)
			{
				
			}
			serVivo.conseguirAlimento();
			System.out.println();
			System.out.println(serVivo.getInfo());
			System.out.println();
		}
		
	}
	
}
