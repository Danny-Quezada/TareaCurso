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
	
	//El fin de esta variable es de repetir el menú cuantas veces sea necesario, hasta que el usuario desee salir
	private boolean salida = true;
	
	//Y por ultimo, estas variables son contadores de los celulares que vamos comprando(Depende del modelo)
	private int n,n2,n3,n4,n5,n6, n7, n8, n9, n10, n11,n12,n13,n14,n15,n16, n17, n18, n19, n20, n21, n22, n23;
	
	/*Se agrego un método constructor de la clase, para que se le muestre al usuario al iniciar el programa
	 * Se agrego un método donde se contiene el menú deopciones para que el usuario no este limitado a realizar algunas opciones
	 * Y un cambio menor en el inventario, ,en donde se muestra también el dinero que posee y las ganancias obtenidas
	 * Tenemos que solucionar el error de salida que te comente
	*/
	
	/*Se soluciono el error de salida, con ayuda de la variable "salida"
	 *Y se agregaron break por cada opción del switch, para asi poder retornar al menú, para poder repetirse cuantas veces sea necesario
	 */
	public Compra(){
		System.out.println("--------------------------------");
		System.out.println("    Bienvenido a nuestra app    ");
		System.out.println("--------------------------------");
		System.out.println("La funcionalidad de esta aplicación es para que puedas tener un control de tus ventas y compras de celulares \nTambién puedes hacer una visualización de tu inventario y la ganancia que has tenido con las ventas \nEspero que le sea de utilidad la app");
		System.out.println();
	}
	public void PedirDinero() {
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
		while (salida) {
			System.out.println();
			Menu();
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
//Estos metodos son los que tienen modelo y marcas de los celulares.
	public void samsung() {
		a=0; q=0; r=0;
		salir = true;
		System.out.println();
		do {
			try {
				System.out.println("-------------------");
				System.out.println("Ha escogido Samsung");
				System.out.println("-------------------");
				String samsung[][]= {{"1. Samsung Galaxy 21S", "$1400"},
						{"2. Samsung Galaxy s20", "$1222"},{"3. Samsung Galaxy Fold","$2000"},{"4. Samsung Galaxy Fold 2", "$3400"},{"5. Samsung s10","$380"},
						{"6. Samsung s9 plus", "$300"}};
						for(int i=0; i<samsung.length; i++) {
							for(int j=0; j<samsung[i].length; j++) {
								System.out.print(samsung[i][j]+" ");
							}
							System.out.println();
						}
						System.out.print("Qué modelo desea? ");
						e = lector.nextInt();
						if (e <= 0 || e > 6) {
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
				if(e==1) {
					precio=1400;
					pedirCuantoCelularesQuieres(precio);
				}
				else if(e==2) {
					precio=1222;
					pedirCuantoCelularesQuieres(precio);
				}
				else if(e==3) {
					precio=2000;
					pedirCuantoCelularesQuieres(precio);
			
				}
				else if(e==4) {
					precio=3400;
					pedirCuantoCelularesQuieres(precio);
				}
				else if(e==5) {
					precio=380;
					pedirCuantoCelularesQuieres(precio);
				}
				else if(e==6) {
					precio=300;
					pedirCuantoCelularesQuieres(precio);
				}
	}
	public void iphones () {
		e=0; q=0; r=0;
		salir = true;
		System.out.println();
		do {
			try {
				System.out.println("------------------");
				System.out.println("Ha escogido iPhone");
				System.out.println("------------------");
				String Iphone[][]= {{"1. iPhone 12 pro max", "$1200"},
				{"2. iphone 11 pro", "$1000"},{"3. iphone 8 plus","$780"},{"4. iphone 7 plus", "$400"},{"5. iphone 6 plus","$300"}
				};
				for(int i=0; i<Iphone.length; i++) {
					for(int j=0; j<Iphone[i].length; j++) {
						System.out.print(Iphone[i][j]+" ");
					}
					System.out.println();
				}
				System.out.print("Qué modelo desea? ");
				a=lector.nextInt();
				if (a <= 0 || a > 5) {
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
		if(a==1) {
			precio=1200;
			pedirCuantoCelularesQuieres(precio);
			
		}
		else if(a==2) {
			precio=1000;
			pedirCuantoCelularesQuieres(precio);
		}
		else if(a==3) {
			precio=780;
			pedirCuantoCelularesQuieres(precio);
	
		}
		else if(a==4) {
			precio=400;
			pedirCuantoCelularesQuieres(precio);
		}
		else if(a==5) {
			precio=300;
			pedirCuantoCelularesQuieres(precio);
		}
	}
	public void LG() {
		a=0; q=0; e=0;
		salir = true;
		System.out.println();
		do {
			try {
				System.out.println("--------------");
				System.out.println("Ha escogido LG");
				System.out.println("--------------");
				String LG[][]= {{"1. LG V60", "$900"},
				{"2. LG V50", "$800"},{"3. LG V40","$720"},{"4. LG G8", "$400"},{"5. LG G7","$300"},{"6. LG G6", "$240"}
				};
				for(int i=0; i<LG.length; i++) {
					for(int j=0; j<LG[i].length; j++) {
						System.out.print(LG[i][j]+" ");
					}
					System.out.println();
				}
				System.out.print("Qué modelo desea? ");
				r=lector.nextInt();
				if (r <= 0 || r > 6) {
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
		if(r==1) {
			precio=900;
			pedirCuantoCelularesQuieres(precio);
			
		}
		else if(r==2) {
			precio=800;
			pedirCuantoCelularesQuieres(precio);
		}
		else if(r==3) {
			precio=720;
			pedirCuantoCelularesQuieres(precio);
	
		}
		else if(r==4) {
			precio=400;
			pedirCuantoCelularesQuieres(precio);
		}
		else if(r==5) {
			precio=300;
			pedirCuantoCelularesQuieres(precio);
		}
		else if(r==6) {
			precio=240;
			pedirCuantoCelularesQuieres(precio);
		}
	}
	public void Huawei() {
		a=0; r=0; e=0;
		salir = true;
		System.out.println();
		do {
			try {
				System.out.println("------------------");
				System.out.println("Ha escogido Huawei");
				System.out.println("------------------");
				String Huawei[][]= {{"1. Huawei nova 5", "$1000"},
						{"2. Huawei Mate 30 pro", "$1200"},{"3. Huawei Mate 30","$1120"},{"4. Huawei Y9", "$500"},{"5. Huawei P20 ","$480"},{"6. Huawei enjoy 10", "$340"}
						};
						for(int i=0; i<Huawei.length; i++) {
							for(int j=0; j<Huawei[i].length; j++) {
								System.out.print(Huawei[i][j]+" ");
							}
							System.out.println();
						}
						System.out.print("Qué modelo desea? ");
						q=lector.nextInt();
						if (q <= 0 || q > 6) {
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
			if(q==1) {
				precio=1000;
				pedirCuantoCelularesQuieres(precio);
					
			}
			else if(q==2) {
				precio=1200;
				pedirCuantoCelularesQuieres(precio);
			}
			else if(q==3) {
				precio=1220;
				pedirCuantoCelularesQuieres(precio);
			}
			else if(q==4) {
				precio=500;
				pedirCuantoCelularesQuieres(precio);
			}
			else if(q==5) {
				precio=480;
				pedirCuantoCelularesQuieres(precio);
			}
			else if(q==6) {
				precio=340;
				pedirCuantoCelularesQuieres(precio);
			}
	}

	public void pedirCuantoCelularesQuieres(double precio) {
		int i = 0;
		salir = true;
		System.out.println();
		do {
			try {
				System.out.print("Cuanto celulares vas a comprar? ");
				i=lector.nextInt();
				if (i < 0) {
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
		salir = true;
		precio=precio*i;
		if(dinero>=precio) {
		dinero=dinero-precio;
		if(e==1) {
			n=n+i;
		}else if(e==2) {
			n2=n2+i;
		}else if(e==3) {
			n3=n3+i;
		}else if(e==4) {
			n4=n4+i;
		}else if(e==5) {
			n5=n5+i;
		}else if(e==6) {
			n6=n6+i;
		}
		if(a==1) {
			n7=n7+i;
		}else if(a==2) {
			n8=n8+i;
		}else if(a==3) {
			n9=n9+i;
		}else if(a==4) {
			n10=n10+i;
		}
		else if(a==5) {
			n11=n11+i;
		}
		if(r==1) {
			n12=n12+i;
		}
		else if(r==2) {
			n13=n13+i;
		}
		else if(r==3) {
			n14=n14+i;
		}
		else if(r==4) {
			n15=n15+i;
		}
		else if(r==5) {
			n16=n16+i;
		}
		else if(r==6) {
			n17=n17+i;
		}
		if(q==1) {
			n18=n18+i;
		}
		else if(q==2) {
			n19=n19+i;
		}
		else if(q==3) {
			n20=n20+i;
		}
		else if(q==4) {
			n21=n21+i;
		}
		else if(q==5) {
			n22=n22+i;
		}
		else if(q==6) {
			n23=n23+i;
		}
		System.out.println("Tienes de dinero $"+dinero);
		}
		else if(precio>dinero ) {
			NotienesusficienteDinero();
		}
	}
	public void depositar() {
		double i = 0;
		salir = true;
		System.out.println();
		do {
			try {
				System.out.print("Cuánto quieres depositar? $");
				i=lector.nextDouble();
				if (i < 0) {
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
		dinero=i+dinero;
		System.out.println("Tienes de dinero $"+dinero);
	}

	public void NotienesusficienteDinero() {
		salir = true;
		System.out.println();
		System.out.println("Lo siento, sobrepasaste tu dinero");
		System.out.println("Tienes de dinero: $"+dinero);
	}
	
	public void inventario() {
		salir = true;
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        Inventario        ");
		System.out.println("--------------------------");
		if(n>0) {
		System.out.println("1. Samsung Galaxy 21S: "+n);
		}
		if(n2>0) {
		System.out.println("2. Samsung Galaxy S20: "+n2);
		}
		if(n3>0) {
			System.out.println("3. Samsung Galaxy Fold: "+n3);
		}
		if(n4>0) {
			System.out.println("4. Samsung Galaxy Fold 2: "+n4);
		}
		if(n5>0) {
			System.out.println("5. Samsung s10: "+n5);
		}
		if(n6>0) {
			System.out.println("6. Samsung s9 plus: "+n6);
		}
		if(n7>0) {
			System.out.println("7. iPhone 12 pro max: "+n7);
		}
		if(n8>0) {
			System.out.println("8. iphone 11 pro: "+n8);
		}
		if(n9>0) {
			System.out.println("9. iphone 8 plus: "+n9);
		}
		if(n10>0) {
			System.out.println("10. Iphone 7 plus: "+n10);
		}
		if(n11>0) {
			System.out.println("11. Iphone 6 plus: "+n11);
		}
		if(n12>0) {
			System.out.println("12. LG V60: "+n12);
		}
		if(n13>0) {
			System.out.println("13. LG V50: "+n13);
		}
		if(n14>0) {
			System.out.println("14. LG V40: "+n14);
		}
		if(n15>0) {
			System.out.println("15. LG G8: "+n15);
		}
		if(n16>0) {
			System.out.println("16. LG G7: "+n16);
		}
		if(n17>0) {
			System.out.println("17. LG G6: "+n17);
		}
		if(n18>0) {
			System.out.println("18. Huawei nova 5: "+n18);
		}
		if(n19>0) {
			System.out.println("19. Huawei Mate 30 pro: "+n19);
		}
		if(n20>0) {
			System.out.println("20. Huawei Mate 30: "+n20);
		}
		if(n21>0) {
			System.out.println("21. Huawei Y9: "+n21);
		}
		if(n22>0) {
			System.out.println("22. Huawei P20: "+n22);
		}
		if(n23>0) {
			System.out.println("23. Huawei enjoy 10: "+n23);
		}
		System.out.println("El dinero que posee actualmente es: $" + dinero);
		System.out.println("Las ganancias obtenidas por el momento son: $" + ganado);
	}
	public void vender() {
		int i = 0, cantidad;
		salir = true;
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("        Inventario        ");
		System.out.println("--------------------------");
		if(n>0) {
		System.out.println("1. Samsung Galaxy 21S: "+n);
		}
		if(n2>0) {
		System.out.println("2. Samsung Galaxy S20: "+n2);
		}
		if(n3>0) {
			System.out.println("3. Samsung Galaxy Fold: "+n3);
		}
		if(n4>0) {
			System.out.println("4. Samsung Galaxy Fold 2: "+n4);
		}
		if(n5>0) {
			System.out.println("5. Samsung s10: "+n5);
		}
		if(n6>0) {
			System.out.println("6. Samsung s9 plus: "+n6);
		}
		if(n7>0) {
			System.out.println("7. iPhone 12 pro max: "+n7);
		}
		if(n8>0) {
			System.out.println("8. iphone 11 pro: "+n8);
		}
		if(n9>0) {
			System.out.println("9. iphone 8 plus: "+n9);
		}
		if(n10>0) {
			System.out.println("10. Iphone 7 plus: "+n10);
		}
		if(n11>0) {
			System.out.println("11. Iphone 6 plus: "+n11);
		}
		if(n12>0) {
			System.out.println("12. LG V60: "+n12);
		}
		if(n13>0) {
			System.out.println("13. LG V50: "+n13);
		}
		if(n14>0) {
			System.out.println("14. LG V40: "+n14);
		}
		if(n15>0) {
			System.out.println("15. LG G8: "+n15);
		}
		if(n16>0) {
			System.out.println("16. LG G7: "+n16);
		}
		if(n17>0) {
			System.out.println("17. LG G6: "+n17);
		}
		if(n18>0) {
			System.out.println("18. Huawei nova 5: "+n18);
		}
		if(n19>0) {
			System.out.println("19. Huawei Mate 30 pro: "+n19);
		}
		if(n20>0) {
			System.out.println("20. Huawei Mate 30: "+n20);
		}
		if(n21>0) {
			System.out.println("21. Huawei Y9: "+n21);
		}
		if(n22>0) {
			System.out.println("22. Huawei P20: "+n22);
		}
		if(n23>0) {
			System.out.println("23. Huawei enjoy 10: "+n23);
		}
		System.out.println();
		do {
			try {
				System.out.println("Que quieres vender? (Debe de introducir el número que le corresponde a cada articulo)");
				System.out.print("Respuesta: ");
				i=lector.nextInt();
				if (i <= 0 || i > 23) {
					System.out.println("Respuesta incorrecta, seleccione el número que corresponde al celular que desea");
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
			if(n<=0) {
				NoCel();
			}
			else { 
				do {
					cantidad = cantidad();
					if (cantidad > n) {
						System.out.println("Usted posee " + n + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n = n - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if (i == 2) {
			if (n2 <= 0) {
					NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n2) {
						System.out.println("Usted posee " + n2 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n2 = n2 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==3) {
			if(n3<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n3) {
						System.out.println("Usted posee " + n3 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n3 = n3 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==4) {
			if(n4<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n4) {
						System.out.println("Usted posee " + n4 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n4 = n4 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==5) {
			if(n5<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n5) {
						System.out.println("Usted posee " + n5 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n5 = n5 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==6) {
			if(n6<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n6) {
						System.out.println("Usted posee " + n6 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n6 = n6 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==7) {
			if(n7<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n7) {
						System.out.println("Usted posee " + n7 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n7 = n7 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==8) {
			if(n8<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n8) {
						System.out.println("Usted posee " + n8 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n8 = n8 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==9) {
			if(n9<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n9) {
						System.out.println("Usted posee " + n9 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n9 = n9 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==10) {
			if(n10<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n10) {
						System.out.println("Usted posee " + n10 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n10 = n10 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==11) {
			if(n11<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n11) {
						System.out.println("Usted posee " + n11 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n11 = n11 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==12) {
			if(n12<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n12) {
						System.out.println("Usted posee " + n12 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n12 = n12 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==13) {
			if(n13<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n13) {
						System.out.println("Usted posee " + n13 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n13 = n13 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==14) {
			if(n14<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n14) {
						System.out.println("Usted posee " + n14 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n14 = n14 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==15) {
			if(n15<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n15) {
						System.out.println("Usted posee " + n15 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n15 = n15 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==16) {
			if(n16<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n16) {
						System.out.println("Usted posee " + n16 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n16 = n16 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==17) {
			if(n17<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n17) {
						System.out.println("Usted posee " + n17 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n17 = n17 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==18) {
			if(n18<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n18) {
						System.out.println("Usted posee " + n18 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n18 = n18 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==19) {
			if(n19<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n19) {
						System.out.println("Usted posee " + n19 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n19 = n19 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==20) {
			if(n20<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n20) {
						System.out.println("Usted posee " + n20 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n20 = n20 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==21) {
			if(n21<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n21) {
						System.out.println("Usted posee " + n21 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n21 = n21 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==22) {
			if(n22<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n22) {
						System.out.println("Usted posee " + n22 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n22 = n22 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
		else if(i==23) {
			if(n23<=0) {
				NoCel();
			}
			else {
				do {
					cantidad = cantidad();
					if (cantidad > n23) {
						System.out.println("Usted posee " + n23 + " celulares, no puede retirar " + cantidad);
						salir = true;
					} else {
						salir = false;
					}
				} while (salir);
				n23 = n23 - cantidad;
				PrecioVenta();
				dinero = dinero + (PrecioVenta * cantidad);
				ganado = ganado + (PrecioVenta * cantidad);
				System.out.println("El dinero ganado por ventas es: $"+ganado);
				System.out.println("Tu dinero total es: $" + dinero);
			}
		}
	}
	public void NoCel() {
		salir = true;
		System.out.println();
		System.out.println("No tienes ese celular en el inventario, te recomendamos que veas de nuevo tu inventario");
	}
	public void MostrarGanancias() {
		System.out.println();
		System.out.println("Tienes una ganancia de: $"+ganado);
	}
	public void PrecioVenta() {
		System.out.print("A cuanto lo quieres vender? $");
		PrecioVenta=lector.nextDouble();
	}
	public int cantidad() {
		int cantidad = 0;
		salir = true;
		System.out.println();
		do {
			try {
				System.out.print("Cuántos celulares desea vender? ");
				cantidad = lector.nextInt();
				if (cantidad < 0) {
					System.out.println("Respuesta incorrecta, el número debe de ser mayor a 0");
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
		return cantidad;
	}
	public void Menu() {
		int q = 0;
		salir = true;
		do {
			try {
				System.out.println("------------------------");
				System.out.println("          Menú          ");
				System.out.println("------------------------");
				System.out.println("Qué acción desea realizar?");
				System.out.println("1. Depositar");
				System.out.println("2. Comprar celulares");
				System.out.println("3. Ver inventario");
				System.out.println("4. Vender");
				System.out.println("5. Mostrar ganancias");
				System.out.println("6. Salir");
				System.out.print("Respuesta: ");
				q = lector.nextInt();
				if (q <= 0 || q > 6) {
					System.out.println("Respuesta incorrecta, seleccione el número que corresponde al celular que desea");
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
		switch (q) {
		case 1:
			depositar();
			break;
		case 2:
			comprarAlgo();
			break;
		case 3:
			inventario();
			break;
		case 4:
			vender();
			break;
		case 5:
			MostrarGanancias();
			break;
		case 6:
			salida = false;
			System.out.println("Gracias por usar la aplicación");
			break;
		}
	}
}