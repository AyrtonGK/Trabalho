package ayrton.compGrafica.model.util;




public interface Manipulador3D {
	public void click(float x, float y, float z);

	public void press(float x, float y, float z);

	public void release(float x, float y, float z);

	public void drag(float x, float y, float z);

	public void move(float x, float y,float z);
	
	public boolean isFinalizado();
	
	public boolean isCancelado();
}
