package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import heranca.entities.ImportedProduct;
import heranca.entities.Product;
import heranca.entities.UsedProduct;

public class TestProductImportedUsed {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		Product [] product = new Product[n];
		String name;
		double price, customsFee;
		Date data;
		for (int i = 0; i < n; i++) {
			System.out.printf("Product #%d data:\n",i+1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char op = sc.next().charAt(0);
			sc.nextLine();
			switch (op) {
			case 'c':
			   System.out.print("Name: ");
			   name = sc.nextLine();
			   System.out.print("Price: ");
			   price = sc.nextDouble();
			   product[i] = new Product(name,price);
			   break;
			case 'u': 
			   System.out.print("Name: ");
			   name = sc.nextLine();
			   System.out.print("Price: ");
			   price = sc.nextDouble();	
			   System.out.print("Manufacture date (DD/MM/YYYY): ");
			   data = sdf.parse(sc.next());
			   product[i] = new UsedProduct(name,price,data);		   
			   break;			   
			case 'i': 
			   System.out.print("Name: ");
			   name = sc.nextLine();
			   System.out.print("Price: ");
			   price = sc.nextDouble();
			   System.out.print("Customs fee: ");
			   customsFee = sc.nextDouble();
			   product[i] = new ImportedProduct(name,price,customsFee);
			   break;			
			default:
			   System.out.println("Opção Invalida !!!");
			   System.out.println("Entre Novamente");
			   i--;
			   break;
			}
			
		}
		System.out.println("PRICE TAGS:");
		for (Product p: product) {
			System.out.println(p.priceTag());
		}
		
		sc.close();

	}

}
