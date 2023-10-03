package estruturaCondicional;

import java.util.Scanner;

public class Composta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas Horas ?");
		hora = sc.nextInt();
		
		if (hora <12) {
			System.out.println("Bom Dia !!");
		}
		else {
			System.out.println("Boa Tarde !!");
		}
				
			sc.close();	
		

	}

}
