package HibernateManyToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {
	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Item.class).addAnnotatedClass(Category.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Item item1 = new Item("Shirt", 1559.99f);
		Item item2 = new Item("Jeans", 3399.99f);
		Item item3 = new Item("Blouse", 559.99f);
		
		List<Item> items = new ArrayList<>(Arrays.asList(item1, item2, item3));
		
		
		Category clothing= new Category("Clothing");
		Category fashion = new Category("Fashion");
		
		List<Category> categories = new ArrayList<>(Arrays.asList(clothing, fashion));
		
		item1.setCategories(categories);
		item2.setCategories(categories);
		item3.setCategories(categories);
		
		clothing.setItems(items);
		fashion.setItems(items);
		
		session.save(item1);
		session.save(item2);
		session.save(item3);
		session.save(clothing);
		session.save(fashion);
		
		tx.commit();
		session.close();
	}

}
