package ayrton.compGrafica.model;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ayrton.compGrafica.model.util.Manipulador3D;
import ayrton.compGrafica.transformacao.Transformacao;
import ayrton.compGrafica.util.DrawUtil;

import javax.xml.bind.annotation.*;


public interface Modelo3D {
	
	public abstract Ponto2D getCentro();
	public abstract float getMaxX();
	public abstract float getMinX();
	public abstract float getMaxY();
	public abstract float getMinY();
	public abstract float getMaxZ();
	public abstract float getMinZ();
	
	public abstract float getLargura();
	public abstract float getAltura();
	public abstract float getProfundidade();

	public abstract List<Ponto3D> getListPontos();
	public abstract float[][] getPontos3D();
	public abstract float[][] getPontosCoordHom();
	public abstract void setListPontos(List<Ponto3D> pontos) throws IllegalArgumentException;
	public abstract void setPontos3D(float[][] v) throws IllegalArgumentException;
	public abstract void setPontosCoordHom(float[][] v) throws IllegalArgumentException;
	
	public abstract void setTransformacao(Transformacao t);
	public abstract void comporTransformacao(Transformacao t);
	
	public abstract void desenhar(DrawUtil du);
	public abstract Manipulador3D criarManipulador3D();

}
