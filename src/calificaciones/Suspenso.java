package calificaciones;

import javax.swing.JOptionPane;

public class Suspenso {

	public static void main(String[] args) {

		float calificaciones = 0;
		boolean hay_suspenso = false;

		for (int i = 1; i <= 5; i++) {

			do {

				calificaciones = Float.parseFloat(JOptionPane.showInputDialog("Introduce la calificación " + i));

			} while (calificaciones < 0 || calificaciones > 10);

			if (calificaciones < 4) {
				hay_suspenso = true;
			}
		}

		if (hay_suspenso == true) {
			System.out.println("Si hay suspenso(s)");
		} else {
			System.out.println("No hay suspenso");
		}
	}

}
