import java.util.*;

import Entity.Product;
import Exception.ProductNotFoundException;
import service.ProductServiceImpl;

public class ProductInventorySystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductServiceImpl service = new ProductServiceImpl();
		
		int choice;
		do {
			System.out.println("\n-------------------------------------------------------------------------------\n"
					+ "1.show All producst  2.Search Product  3.Add Product 4.Update stock  5.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				for(Product pro: service.getAllProducts()) {
					System.out.println(pro);
				} break;
			
			case 2:
				System.out.println("Enter the ProductId : ");
				int tmppid = sc.nextInt();
				try {
					service.searchProduct(tmppid);
				} catch (ProductNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case 3 :
				System.out.println("---ENTER ALL THE PRODUCT DETAILS ---");
				int id = sc.nextInt();
			    String name = sc.next();
			    String cat = sc.next();
			    float price = sc.nextFloat();
			    int stock = sc.nextInt();
			    service.addNewProduct(new Product(id,name,cat,price,stock));
			    break;
	
			case 4:
				System.out.println("ENTER THE PRODUCT ID : ");
				int proId = sc.nextInt();
				try {
					service.updateStock(proId);
				} catch (ProductNotFoundException e) {
					e.printStackTrace();
				}
				
			}
		}	
		while(choice!=5);

	}

}
