package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class ProductDao {
	
	@Autowired  //inject the object automatically from spring-servlet.jsp file
	private HibernateTemplate hibernateTemplate; // this is the Boss 
	
	//create
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.save(product);
	}
	
	//get single product
	public List<Product> getProduct(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
		
	}
	
	//delete all the single product
	@Transactional
	public void deleteProduct(int pid) {
		Product p = this.hibernateTemplate.load(Product.class , pid);
		this.hibernateTemplate.delete(p);
	}
	
	//get single product
	public Product getProduct(int pid) {
		return this.hibernateTemplate.get(Product.class,pid);
	}
	
	
	
}
