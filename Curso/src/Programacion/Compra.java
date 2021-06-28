package Programacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compra {

	static Scanner lector= new Scanner(System.in);
	private double precio;
	private double PrecioVenta;
	private double dinero;
	//Estas son las variables que sirven para determinar cual celular quiere comprar(depende de la marca)
	private int q;
	private int r;
	private int e;
	private int a;
	//Termina hasta aqui.
	
	//Esta variable sirve para ver cuanto se ha ganado en la venta de celulares.
	private double ganado;
	//Termina hasta aqui
	
	//Esta varibale sirve para darle un fin a los ciclos de excepciones
	private boolean salir = true;
	
	//Y por ultimo, estas variables son contadores de los celulares que vamos comprando(Depende del modelo)
	private int n,n2,n3,n4,n5,n6, n7, n8, n9, n10, n11,n12,n13,n14,n15,n16, n17, n18, n19, n20, n21, n22, n23;
	
	public void PedirDinero() {
		int i = 0;
		do {
			try {
				System.out.print("Cuanto dinero tienes? $"); 
				dinero=lector.nextDouble();
				if (dinero < 0) {
					System.out.println("Cantidad de dinero incorrecta, el dinero debe de ser mayor a 0");
					System.out.println();
				} else {
					salir = false;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Esta no es una respuesta válida, por favor intente de nuevo");
				System.out.println();
				lector.next();
			}
		} while (salir);
		salir = true;
		System.out.println();
		do {
			try {
				System.out.println("Qué desea hacer?");
				System.out.println("1. Comprar celulares");
				System.out.println("2. Depositar más dinero");
				System.out.print("Respuesta: ");
				i = lector.nextInt();
				if (i <= 0 || i > 2) {
					System.out.println("Respuesta incorrecta, seleccione el número que corresponde a la opción que desea");
					System.out.println();
				} else {
					salir = false;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Esta no es una respuesta válida, por favor intente de nuevo");
				System.out.println();
				lector.next();
			}
		} while (salir);
		if(i==1) {
			comprarAlgo();
		}
		else if(i==2) {
			depositar();
		}
	}
public void comprarAlgo() {
		
		int i = 0;
		salir = true;
		System.out.println();
		do {
			try {
				System.out.println("Que celular quieres comprar?");
				System.out.println("1. Iphones");
				System.out.println("2. Samsung");
				System.out.println("3. LG");
				System.out.println("4. Huawei");
				System.out.print("Respuesta: ");
				i = lector.nextInt();
				if (i <= 0 || i > 4) {
					System.out.println("Respuesta incorrecta, seleccione el número que corresponde a la opción que desea");
					System.out.println();
				} else {
					salir = false;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Esta no es una respuesta válida, por favor intente de nuevo");
				System.out.println();
				lector.next();
			}
		} while (salir);
		if(i==1) {
			iphones();
		}
		else if(i==2) {
			samsung();
		}
		else if(i==3) {
			LG();
		}
		else if(i==4) {
			Huawei();
		}
	}
}
