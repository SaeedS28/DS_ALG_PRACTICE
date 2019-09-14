package com.fdmgroup.pizza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PizzaOrderController {
	Scanner scan = new Scanner(System.in);
	int choice;
	Pizza pizza = new PlainPizza();
	int chk = 0;

	void orderNewPizza() throws IOException {
		do {
			System.out.println("Order a pizza m8\n");
			System.out.print("1. " + PizzaTopping.CHEESE + "\n2. " + PizzaTopping.CHICKEN + "\n3. "
					+ PizzaTopping.GREEN_PEPPER + "\n4. " + PizzaTopping.PEPPERONI + "\n5. " + PizzaTopping.MUSHROOM
					+ "\n6. " + PizzaTopping.PINEAPPLE + "\n7. Load a savepoint" + "\n8. Order last choice"
					+ "\n9. Bail out" + "\nMake a choice: ");
			choice = scan.nextInt();
			System.out.println();
			String topping = "";

			if (choice == 1) {
				topping = "cheese";
			} else if (choice == 2) {
				topping = "chicken";
			} else if (choice == 3) {
				topping = "greenpeppers";
			} else if (choice == 4) {
				topping = "pepperoni";
			} else if (choice == 5) {
				topping = "mushroom";
			} else if (choice == 6) {
				topping = "pineapple";
			} else if (choice == 7) {
				createPizzaSavePoint();
				continue;
			} else if (choice == 8) {

			} else {
				break;
			}
			pizza = PizzaFactory.createPizza(topping, pizza);
			System.out.println("Pizza description: " + pizza.getDescription() + "\nPrice: " + pizza.getPrice());
		} while (true);
	}

	void createPizzaSavePoint() throws IOException {

	}

	void savePizzaOrder() {

	}

	void orderFromSavePoint() {

	}

	void reorderLast() {

	}
}