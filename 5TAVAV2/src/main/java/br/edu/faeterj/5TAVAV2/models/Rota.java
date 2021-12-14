package br.edu.faeterj.5TAVAV2.models;

import java.util.Set;

public class Rota 
{
	private String destino;
	private String trajeto;
	private Integer paradas;
	private Double km;
	private Set<String> nomeParadas;
	
	public String getDestino() 
	{
		return destino;
	}

	public void setDestino(String destino) 
	{
		this.destino = destino;
	}

	public String getTrajeto() 
	{
		return trajeto;
	}

	public void setTrajeto(String trajeto) 
	{
		this.trajeto = trajeto;
	}

	public Double getKm() 
	{
		return km;
	}

	public void setKm(Double km) 
	{
		this.km = km;
	}

	public Integer getParadas() 
	{
		return paradas;
	}

	public void setParadas(Integer paradas) 
	{
		this.paradas = paradas;
	}

	public Set<String> getNomeParadas() 
	{
		return nomeParadas;
	}

	public void setNomeParadas(Set<String> nomeParadas) 
	{
		this.nomeParadas = nomeParadas;
	}

} 
