package ayrton.compGrafica.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PONTO3D", factoryMethod = "getNewInstance")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ponto3D extends Ponto2D {
	@XmlElement(name="Z")
	private float z;

	public Ponto3D() {
		super(0, 0);
		this.setZ(0);
	}
	
	public Ponto3D(float x, float y, float z) {
		super(x, y);
		this.setZ(z);
	}
	public Ponto3D(Ponto3D p) {
		super(p.getX(), p.getY());
		this.setZ(p.getZ());
	}

	@Override
	public String toString() {
		return "Ponto3D [" + getX() + "; " + getY() + "; " + z + "]";
	}

	public void setZ(float z) {
		this.z = z;
	}

	public float getZ() {
		return z;
	}
	
	public static Ponto3D getNewInstance() {
        return new Ponto3D();
    }
	
	public float[] getCoord3D() {
		float[] v = new float[3];
		v[0] = getX();
		v[1] = getY();
		v[2] = getZ();
		return v;
	}
	public void setCoord3D(float[] v) {
		setX(v[0]);
		setY(v[1]);
		setZ(v[2]);
	}


}