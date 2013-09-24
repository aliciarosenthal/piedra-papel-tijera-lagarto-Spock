package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queTijeraCortaPapel() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Tijera Corta Papel",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void quePapelCubrePiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Papel Cubre Piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void quePiedraAplastaLagarto() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Piedra Aplasta Lagarto",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Lagarto Envenena Spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queSpockdestrozaTijera() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Spock destroza Tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queTijeradecapitaLagarto() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Tijera decapita Lagarto",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queLagartocomePapel() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Lagarto come Papel",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void quePapelrefutaSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Papel refuta Spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void quePiedraaplastaTijera() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Piedra aplasta Tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	@Test
	public void queSpockpierdeconLagarto() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Spock pierde con Lagarto",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queTijeraEmpataTijera() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Tijera Empata Tijera",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));

	}

}
