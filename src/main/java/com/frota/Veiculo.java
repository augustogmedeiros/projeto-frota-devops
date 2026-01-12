package com.frota;

public class Veiculo {

	private Long id;
	private String modelo;
	private String placa;
	private String status;

	public Veiculo(Long id, String modelo, String placa, String status){

	this.id = id;
	this.modelo = modelo;
	this.placa = placa;
	this.status = status;
	}

	public String getModelo() {return modelo;}
	public String getPlaca() {return placa;}
	public String getStatus() {return status;}

}
