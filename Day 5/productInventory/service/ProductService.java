package service;
import java.util.*;
import Entity.Product;
import Exception.ProductNotFoundException;
public interface ProductService {
	List<Product> getAllProducts();
	void searchProduct (int proId) throws ProductNotFoundException ;

	void addNewProduct (Product newPro) ;

	void updateStock(int proId) throws ProductNotFoundException;

	void deleteProduct (int proId) ;
}
