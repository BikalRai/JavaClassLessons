package pojo;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDelete {
	public static void main(String[] args) {
		
		try {
			
			Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			
			Query query = session.createQuery("DELETE FROM Student WHERE id = :id");
			query.setParameter("id", 1);
			
			int i = query.executeUpdate();
			
			tx.commit();
			session.close();
			
			if (i == 1) {
				System.out.println(i + "row(s) affected");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
