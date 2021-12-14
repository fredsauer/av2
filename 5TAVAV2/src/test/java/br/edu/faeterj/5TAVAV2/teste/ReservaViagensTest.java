package br.edu.faeterj.5TAVAV2.teste;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import br.edu.faeterj.AV2TAV.models.ReservaViagens;
import br.edu.faeterj.AV2TAV.models.Onibus;
import br.edu.faeterj.AV2TAV.models.Passageiro;
import br.edu.faeterj.AV2TAV.models.Rota;

class ReservaViagensTest 
{
	@Test
	public void validaCompra() 
	{
		// ARRANGE !!!
		
		Onibus mockOnibus = mock(Onibus.class)
		Passageiro mockPassageiro = mock(Passageiro.class)
		Rota mockRota = mock(Rota.class)
		
		Set<Passageiro> passageiros = new HashSet<Passageiro>(28);
		Onibus onibus = new Onibus();
		
		onibus.setLugares(28);
		onibus.setTipo("Leito");
		
		Passageiro passageiro = new Passageiro();
		
		passageiro.setCpf("631.109.061-72");
		passageiro.setNome("Bruno");
		passageiro.setDestino("Rodoviaria");
		
		passageiros.add(passageiro);
		
		onibus.setPassageiros(passageiros);
		
		Rota rota = new Rota();
		
		Set<String> paradas = new HashSet <String>();
		paradas.add("Vila Joaniza");
		paradas.add("BRT Fundao");
		paradas.add("Duque de Caxias");
		
		rota.setKm(35.5);
		rota.setTrajeto("Executivo");
		rota.setParadas(3);
		rota.setDestino("Duque de Caxias");
		rota.setNomeParadas(paradas);
		
		ReservaViagens compraPassagem = new ReservaViagens();
		
		Double esperado = (35.5 * 0.3) * 0.5;
		
		// ACT !!!
		var resultado = compraPassagem.venderPassagem(passageiro, onibus, rota);
		
		
		// ASSERT !!!
		assertEquals(resultado, esperado);
	}
	
	// CASO TENHA ALGUMA PARADA, VALIDAR SAÍDA

	@Test
	public void saidaParada () 
	{
		Set<Passageiro> passageiros = new HashSet<Passageiro>(28);
		Onibus onibus = new Onibus();
		
		onibus.setLugares(28);
		onibus.setTipo("Leito");
		
		Passageiro p = new Passageiro();
		
		p.setCpf("631.109.061-72");
		p.setNome("Bruno");
		p.setDestino("Rodoviaria");
		
		passageiros.add(p);
		
		Passageiro p1 = new Passageiro();
		p1.setCpf("130.600.977-77");
		p1.setNome("Frederico");
		p1.setDestino("Meier");
		
		passageiros.add(p1);
		
		Passageiro p2 = new Passageiro();
		p2.setCpf("901.712.423-72");
		p2.setNome("Adriana");
		p2.setDestino("Centro");
		
		passageiros.add(p2);
		
		onibus.setPassageiros(passageiros);
				
		Rota rota = new Rota();
		
		Set<String> paradas = new HashSet <String>();
		paradas.add("Vila Joaniza");
		paradas.add("BRT Fundao");
		paradas.add("Duque de Caxias");
		
		
		rota.setKm(35.5);
		rota.setTrajeto("Executivo");
		rota.setParadas(3);
		rota.setDestino("Rodoviaria");
		rota.setNomeParadas(paradas);
		
		ReservaViagens validaSaida = new ReservaViagens();

		Integer esperado = 2;
		
		// ACT !!!
		var resultado = validaSaida.paradaSaida(onibus, rota, p2);
		

		// ASSERT !!!

		assertEquals(resultado, esperado);

	}
	
	// CASO ONIBUS LOTE

	@Test
	public void validaEntrada() 
	{
		// ARRANGE !!!

		Onibus mockOnibus = mock(Onibus.class)
		Passageiro mockPassageiro = mock(Passageiro.class)
		Rota mockRota = mock(Rota.class)

		Set<Passageiro> passageiros = new HashSet<Passageiro>(2);
		Onibus onibus = new Onibus();

		onibus.setLugares(2);
		onibus.setTipo("Leito");

		Passageiro passageiro = new Passageiro();
		Passageiro passageiro1 = new Passageiro();
		Passageiro passageiro2 = new Passageiro();

		passageiro.setCpf("631.109.061-72");
		passageiro.setNome("Bruno");
		passageiro.setDestino("Rodoviaria");

		passageiro1.setCpf("130.600.977-77");
		passageiro1.setNome("Frederico");
		passageiro1.setDestino("Meier");
		
		passageiro2.setCpf("543.176.456-53");
		passageiro2.setNome("Anderson");
		passageiro2.setDestino("Avenida Brasil");
		
		passageiros.add(passageiro);
		passageiros.add(passageiro1);
		passageiros.add(passageiro2);

		onibus.setPassageiros(passageiros);

		Rota rota = new Rota();

		Set<String> paradas = new HashSet <String>();
		paradas.add("Vila Joaniza");
		paradas.add("BRT Fundao");
		paradas.add("Duque de Caxias");

		rota.setKm(35.5);
		rota.setTrajeto("Executivo");
		rota.setParadas(3);
		rota.setDestino("Rodoviaria");
		rota.setNomeParadas(paradas);

		ReservaViagens compraPassagem = new ReservaViagens();

		Double esperado = 0.0;

		// ACT !!!
		var resultado = compraPassagem.venderPassagem(passageiro, onibus, rota);


		// ASSERT !!!
		assertEquals(resultado, esperado);
	}
}
