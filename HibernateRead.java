package pojo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateRead {
	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
		
		
		try {
//			Student student = session.get(Student.class, 1);
//			System.out.println(student);
			
			
//			TypedQuery<Student> query = session.createNativeQuery("SELECT * FROM students", Student.class);
			TypedQuery<Student> query = session.createQuery("FROM Student", Student.class);
			List<Student> students = query.getResultList();
			
			for (Student student : students) {
				System.out.println(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}
		
		
	}

}
