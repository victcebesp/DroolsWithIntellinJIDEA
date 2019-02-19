package com.sample;

public class Perfil {
    public static final int NINYO = 0;
    public static final int JOVEN = 1;
    public static final int ADULTO = 2;
    public static final int MAYOR = 3;
  
    public static final int FAMILIAR = 2;
    public static final int SOLITARIO = 1;
 
	
	private int npersonas;
	private int edad;
	private boolean ninyos;
	private int ndias;
	
	private int rango;
	private int tipoViaje;
	
	public Perfil(int npersonas, int edad, boolean ninyos, int ndias) {
		super();
		this.npersonas = npersonas;
		this.edad = edad;
		this.ninyos = ninyos;
		this.ndias = ndias;
		this.rango = -1;
		this.tipoViaje = 1;
	}
	public int getNpersonas() {
		return npersonas;
	}
	public void setNpersonas(int npersonas) {
		this.npersonas = npersonas;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isNinyos() {
		return ninyos;
	}
	public void setNinyos(boolean ninyos) {
		this.ninyos = ninyos;
	}
	public int getNdias() {
		return ndias;
	}
	public void setNdias(int ndias) {
		this.ndias = ndias;
	}
	
	public int getRango() {
		return rango;
	}
	public void setRango(int rango) {
		this.rango = rango;
	}
	
	public int getTipoViaje() {
		return tipoViaje;
	}
	public void setTipoViaje(int tipoViaje) {
		this.tipoViaje = tipoViaje;
	}
	@Override
	public String toString() {
		return "Perfil [npersonas=" + npersonas + ", edad=" + edad + ", ninyos=" + ninyos + ", ndias=" + ndias
				+ ", rango=" + rango + ", tipoViaje=" + tipoViaje + "]";
	}

}
