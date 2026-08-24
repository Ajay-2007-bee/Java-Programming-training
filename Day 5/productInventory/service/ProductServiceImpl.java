package service;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import Entity.Product;
import Exception.ProductNotFoundException;

public class ProductServiceImpl implements ProductService{
	Scanner sc = new Scanner(System.in);
	List<Product> allProducts = new ArrayList<>(
		List.of(new Product ( 1002 , "shirt" , "cloth" , 560.00f,40) ,new Product ( 1003 , "pant" , "cotton" , 510.00f,100) )
	);
	
	
	@Override
	public List<Product> getAllProducts() {
		return allProducts;
	}

	@Override
	public void searchProduct(int proId) throws ProductNotFoundException {
		for(Product pro : allProducts) {
			if(pro.getProdId() == proId) {
				System.out.println("--- PRODUCT FOUND ---");
				System.out.println(pro);
				return;
			}
		}
		throw new ProductNotFoundException("Product not found..");
		
	}

	@Override
	public void addNewProduct(Product newPro) {
		allProducts.add(newPro);
		
	}

	@Override
	public void updateStock(int proId) throws ProductNotFoundException {
		for(Product pro : allProducts) {
			if(pro.getProdId() == proId) {
				System.out.println("Enter new Stock : ");
				int newStock = sc.nextInt();
				pro.setStockCount(newStock);
				return;
			}
		} throw new ProductNotFoundException("Product not found..");
		
	}

	@Override
	public void deleteProduct(int proId) {
		
		
	}

}
