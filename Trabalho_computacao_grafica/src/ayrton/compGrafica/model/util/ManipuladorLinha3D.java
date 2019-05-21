package ayrton.compGrafica.model.util;

import ayrton.compGrafica.model.Linha3D;
import ayrton.compGrafica.model.Ponto3D;

public class ManipuladorLinha3D implements Manipulador3D {

	private Linha3D linha;
	private int click;
	private boolean finalizado = false;
	private boolean cancelado = false;
//	private boolean drag = true;

	public ManipuladorLinha3D(Linha3D linha) {
		this.linha = linha;
		this.click = 0;
	}

	public void click(float x, float y, float z) {
		if (finalizado || cancelado)
			return;
		if (click == 0) {
			linha.setInicio(new Ponto3D(x, y, z));
			linha.setFim(new Ponto3D(x, y, z));
			click++;
//			drag = false;
		} else if (click == 1) {
			linha.setFim(new Ponto3D(x, y, z));
			finalizado = true;
		}  
	}

	public void press(float x, float y, float z) {
//		linha.setInicio(new Ponto2D(x, y));
//		linha.setFim(new Ponto2D(x, y));
//		System.out.println("ManipuladorLinha1: " + linha);
	}

	public void release(float x, float y, float z) {
//		if (!drag)
//			return;
//		linha.setFim(new Ponto2D(x, y));
//		finalizado = true;
//		System.out.println("ManipuladorLinha2: " + linha);
	}

	public void drag(float x, float y, float z) {
//		if (finalizado || cancelado)
//			return;
//		if (!drag)
//			return;
//
//		linha.setFim(new Ponto2D(x, y));
//		System.out.println("ManipuladorLinha move: " + linha);
	}

	public void move(float x, float y, float z) {
		if (finalizado || cancelado)
			return;
		if (click == 1)
			linha.setFim(new Ponto3D(x, y, z));
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public boolean isCancelado() {
		return cancelado;
	}

}
