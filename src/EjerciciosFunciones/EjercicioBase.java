package EjerciciosFunciones;

import java.util.Scanner;
public class EjercicioBase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("Selecciona un programa: ");
			System.out.println("0 -> Salir del programa");
			System.out.println("1 -> Repetidor de texto1");
			System.out.println("2 -> Cambio de moneda");
			System.out.println("3 -> Invertir número");
			System.out.println("4 -> Distancia entre números");
			n = sc.nextInt();
			if(n == 0)
				break;
			switch(n) {
			case 0:
				break;
			case 1:
				System.out.println("PROGRAMA PARA REPETIR TEXTO");
				int naux;
				String saux;
				RepetidoraDeTextos r = new RepetidoraDeTextos();
				System.out.print("Introduce un número: ");
				naux = sc.nextInt();
				System.out.print("Introduce el texto: ");
				sc.nextLine(); // Sin esto no se limpia el salto de linea que se queda al usar nextInt y se lee ese salto de linea porque esta en el buffer
				saux = sc.nextLine();
				System.out.println(r.RepetirTexto(naux, saux));
				break;
			case 2:
				System.out.println("PROGRAMA PARA CAMBIAR DE EURO A DOLAR");
				CambioEuroDolar c = new CambioEuroDolar();
				float euro;
				float tipoCambio;
				System.out.print("Introduce la cantidad de euros: ");
				euro = sc.nextFloat();
				System.out.print("Introduce el tipo de cambio: ");
				tipoCambio = sc.nextFloat();
				System.out.println(c.CambioMoneda(euro, tipoCambio));
				break;
			case 3:
				System.out.println("PROGRAMA PARA INVERTIR NÚMERO ENTERO");
				int nInvert;
				System.out.println("Introduce el número entero: ");
				nInvert = sc.nextInt();
				InvertirNumeroEntero i = new InvertirNumeroEntero();
				System.out.println(i.InvertirNum(nInvert));
				break;
			case 4:
				System.out.println("PROGRAMA PARA COMPROBAR DISTANCIA ENTRE NÚMEROS");
				float n1;
				float n2;
				float rango;
				System.out.println("Introduce el primer número: ");
				n1 = sc.nextFloat();
				System.out.println("Introduce el segundo número: ");
				n2 = sc.nextFloat();
				System.out.println("Introduce el rango: ");
				rango = sc.nextFloat();
				DistanciaEntreNumeros dN = new DistanciaEntreNumeros();
				System.out.println(dN.ComprobarDistancia(n1, n2,  rango));
				break;
			default:
				System.out.println("Ingresa un número válido:");	
			}
		}
	}
}
