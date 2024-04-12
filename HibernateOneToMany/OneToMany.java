package HibernateOneToMany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {
	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Item.class).addAnnotatedClass(Category.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Item item1 = new Item("Cardigan", 2344.67f);
		Item item2 = new Item("Jeans", 3394.97f);
		Item item3 = new Item("Shirt", 1344.69f);
		
		List<Item> items = new ArrayList<>(Arrays.asList(item1, item2, item3));
		
		Category clothing = new Category("Clothing");
		
		item1.setCategory(clothing);
		item2.setCategory(clothing);
		item3.setCategory(clothing);
		
		clothing.setItems(items);
		
		session.save(item1);
		session.save(item2);
		session.save(item3);
		
		session.save(clothing);
		
		tx.commit();
		session.close();
		
	}

}
