package nLayeredDemo.business.concretes;

import java.util.List;
import java.util.logging.Logger;


import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager  implements ProductService{
	
	private LoggerService loggerService;
	
	private ProductDao productDao;

	public ProductManager(ProductDao productDao ,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
		
		
	 
		
		
		
	}

	@Override
	public void add(Product product) {
	if (product.getCategoryid()==1){
		System.out.println("bu katagoride ürün kabul edilmiyor");
	}
	
	this.productDao.add(product);
	this.loggerService.logTuSystem("ürün eklendi "+product.getName());
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

}
