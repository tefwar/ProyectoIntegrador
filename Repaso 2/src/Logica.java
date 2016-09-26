import java.util.ArrayList;

import processing.core.*;


public class Logica {

	private PApplet app;

	private String [] valoresString= new String[6];
	private int[] valoresInt = new int [6];
	
	private ArrayList <Objeto> objetos = new ArrayList <Objeto>(); 
	
	public Logica(PApplet app) {
		super();
		this.app = app;
		cargarTxt();
	}
	
	public void cargarTxt(){
		
		String[] lineas = app.loadStrings("../data/text.txt");
		
		for( int i = 0; i<lineas.length;i++){
              valoresString= lineas[i].split(":");	
              
              for (int j=0; i<valoresString.length;j++){
                  valoresInt[j]= Integer.parseInt(valoresString[j]);
              }
			
		}
		
	}
	
	public void aplicacion (){
		
		for (Objeto objeto : objetos) {
			objeto.pintar();
		}
	}
	
	
}
