package uniandes.dpoo.taller0.modificacion;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {

	public Modificacion() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hola, mundo!");
		//Probando hacer otro commit
		CalculadoraEstadisticas calc;
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
			System.out.println(calc.paisConMasMedallistas());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
