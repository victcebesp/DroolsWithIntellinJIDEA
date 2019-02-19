package com.sample;

public class Norma {
    public static final int ALTA = 3;
    public static final int MEDIA = 2;
    public static final int BAJA = 1;
    public static final int nd = -1;
        
    private String nombre;
    private int valor =-1;
    private boolean activo = false;
    
	
    public Norma(String n){
    	this.nombre = n;
    }
    public Norma(String n, boolean activo) {
		super();
		this.nombre = n;
		this.activo = activo;
	}
    
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
