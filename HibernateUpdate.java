package pojo;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUpdate {
	
	public static void main(String[] args) {
		
		try {
			
			Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
			SessionFactory sf = con.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			
			TypedQuery<Student> query = session.createQuery("UPDATE Student set name = :newName where id = :studentId", Student.class);
			query.setParameter("newName", "Simon Cowell");
			query.setParameter("studentId", 1);
			
			int i = query.executeUpdate();
			
			tx.commit();
			session.close();
			
			if (i == 1) {
				System.out.println("Rows Affected: " + i);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
