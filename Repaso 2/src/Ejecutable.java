
import processing.core.*;

public class Ejecutable extends PApplet  {
	
	Logica app;
	
	public void setup(){
		
		app=new Logica(this);
		size(800,800);
	}

	
	public void draw(){
		
		background(255);
		app.aplicacion();
	}
}
