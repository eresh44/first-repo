package obe;

import java.io.IOException;

public class charrrr {

	public static void main(String[] args) throws IOException {

		char choose;
		do {
			System.out.println("1-main menu");
			System.out.println("2-deposit");
			System.out.println("3-cashout");
			System.out.println("4-back to cart");
			System.out.println("please chose any options: ");
			choose = (char) System.in.read();
		} while (choose < '1' || choose > '5');
		System.out.println("\n");
		switch (choose) {
		case '1':
			System.out.println("1-main menu");
			break;
		case '2':
			System.out.println("2-deposit");
			break;
		case '3':
			System.out.println("3-cashout");
			break;
		case '4':
			System.out.println("4-back to cart");
			break;

		}

	}

}
