package com.skateshop.model;

public class CrearProducto {
	private int idProducto;
	private String nombreProducto;
	private double precioProducto;
	private int existencias;
	private String fecha;
	
	public CrearProducto() {}
	
	public CrearProducto(int idProducto, String nombreProducto, double precioProducto, int existencias, String fecha) {
		this.idProducto=idProducto;
		this.nombreProducto=nombreProducto;
		this.precioProducto=precioProducto;
		this.existencias=existencias;
		this.fecha=fecha;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getExistencias() {
		return existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
