package com.sample;

public class Actividad {
    public static final int ALTA = 3;
    public static final int MEDIA = 2;
    public static final int BAJA = 1;
 
	
	private String nombre;
	private String tipo;
	private int duracion;
	
	public Actividad(String nombre, String tipo, int duracion) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.duracion = duracion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	
	
}
