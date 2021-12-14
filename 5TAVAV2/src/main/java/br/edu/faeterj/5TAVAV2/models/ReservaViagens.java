package br.edu.faeterj.5TAVAV2.models;

public class ReservaViagens 
{
	private Double valorTotal;
	
	public Integer paradaSaida(Onibus onibus, Rota rota, Passageiro passageiro) 
	{
		if(passageiro.getDestino() != rota.getDestino()) 
		{
			for(String p : rota.getNomeParadas()) 
			{
				if(passageiro.getDestino().equals(p)) 
				{
					onibus.getPassageiros().remove(passageiro);
				}
			}
		}
		return onibus.getPassageiros().size();
	}
	
	public Double venderPassagem (Passageiro passageiro, Onibus onibus, Rota rota) 
		{
		
		if (onibus.getLugares() > onibus.getPassageiros().size()) 
		{
			if (onibus.getTipo() == "Leito") 
			{
				valorTotal = rota.getKm() * 0.3;
			} 
			else if (onibus.getTipo() == "SemiLeito") 
			{
				valorTotal = rota.getKm() * 0.25;
			} 
			else 
			{
				valorTotal = rota.getKm() * 0.2;
			}
			if (rota.getTrajeto() == "Executivo") 
			{
				valorTotal *= 0.5;
			}
			return valorTotal;
			} 

			else 
			{
			return 0.0;
			}
		}
}
