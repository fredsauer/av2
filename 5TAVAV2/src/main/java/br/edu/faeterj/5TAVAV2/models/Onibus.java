package br.edu.faeterj.5TAVAV2.models;

import java.util.Set;

public class Onibus 
{
	private String id;
	private Integer lugares;
	private String tipo;
	private Set<Passageiro> passageiros;
	
	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public Integer getLugares() 
	{
		return lugares;
	}

	public void setLugares(Integer lugares) 
	{
		this.lugares = lugares;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}


	public Set<Passageiro> getPassageiros() 
	{
		return passageiros;
	}

	public void setPassageiros(Set<Passageiro> passageiros) 
	{
		this.passageiros = passageiros;
	}
}
