package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.abcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jlogger.jLoggerManagerAdapter;

public class Main {
	

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new abcProductDao(),new jLoggerManagerAdapter() );
		Product product = new Product(1,2,"elma",12,50);
		productService.add(product);

	}

}
