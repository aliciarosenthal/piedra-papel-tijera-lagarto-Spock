package edu.tallerweb.pptls;

/**
* Representa una de las Manos involucradas en el juego
*/
public class Mano {
	private Forma forma;

	/**
	* Toda Mano debe crearse con una forma dada, que será la que determine su
	* condición en el juego.
	* @param forma, la Forma que adopta la Mano.
	*/
	public Mano(final Forma forma) {
		this.forma = forma;
	}

	/**
	* Evaluará el resultado de la partida según las reglas del juego.
	* @param otra, la otra Mano.
	* @return un Resultado, de acuerdo al estado del juego.
	*/
	public Resultado jugarCon(final Mano otra) {
		final int modulo = 5;
		final int ant=1;
		int antecesor;
		int anteAntecesor;
		antecesor = this.forma.getValor() - ant;
		if (antecesor < 0) {
			antecesor = antecesor + modulo;
		}
		anteAntecesor = antecesor - ant;
		if (anteAntecesor < 0) {
			anteAntecesor = anteAntecesor + modulo;
		}

		if (otra.forma.getValor() == antecesor
				|| otra.forma.getValor() == anteAntecesor) {
			return Resultado.GANA;
		} else if (this.forma.getValor() == otra.forma.getValor()) {
			return Resultado.EMPATA;
		} else {
			return Resultado.PIERDE;
		}
	}

}
