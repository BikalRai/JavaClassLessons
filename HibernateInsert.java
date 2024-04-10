package pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateInsert {
	
	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(new Student(123, "Martha Stewart", "Female", 32));
		
		tx.commit();
		session.close();
		
	}

}
