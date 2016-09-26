import processing.core.*;


public class Objeto {
	
	PApplet app;
	
	
	private int tam, x , y ,r,g,b , colBorde;
	private int[] valores= new int[6];
	
	
	public Objeto(PApplet app, int tam, int x, int y, int r,int g,int b, int colBorde) {
		super();
		this.app = app;
		valores[0]=tam;
		valores[1]=x;
		valores[2]=y;
		valores[3]=r;
		valores[4]=g;
		valores[5]=b;
		valores[6]=colBorde;
	}
	
	
	public void pintar(){
		
		app.rect(x, y, tam, tam, 7);
		app.fill(r,g,b);
		app.stroke(colBorde,152,0);

		
	}

}
