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
		final int ganaA = -2;
		final int ganaB = 2;
		final int ganaC = 1;
		if (this.forma.getValor() - otra.forma.getValor() < ganaA
				|| this.forma.getValor() - otra.forma.getValor() == ganaB
				|| this.forma.getValor() - otra.forma.getValor() == ganaC) {
			return Resultado.GANA;
		} else if (this.forma.getValor() - otra.forma.getValor() == 0) {
			return Resultado.EMPATA;
		} else {
			return Resultado.PIERDE;
		}
	}

}
