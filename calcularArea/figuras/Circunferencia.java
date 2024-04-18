package figuras;

/**
 * Clase Circunferencia que calcula los
 * parámetros de una figura circulo
 */

public class Circunferencia {
	private double radio;
	private String color;

/**
 * @param radio que guarda el radio del circulo
 * @param color que guarda el color de la figura
 */

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	/**
	 * @return devuelve el radio del circulo
	 */

	public double getRad() {
		return radio;
	}

	/**
	 * Setter para el radio del circulo
	 */

	public void setRad(double rad) {
		this.radio = rad;
	}

	/**
	 * Muestra por pantalla los datos del circulo
	 */

	public void imprimir() {
		color = "rojo";
		System.out.println("Diametro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * radio * radio;
		System.out.println(area);
	}

	/**
	 * @return devuelve un boolean al comparar dos
	 * círculos
	 */

	public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
