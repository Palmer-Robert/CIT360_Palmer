package hibernateStudy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class FamilyTest {

	public static void main(String[] args) {
		// Create a session factory
		SessionFactory factory = new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(Family.class)
		.buildSessionFactory();
	
		
		// Create a session
		Session session = factory.getCurrentSession();
		
		try {
			// Create object
			System.out.println("Creating a new family object...");
			Family myFamily = new Family("Robert", "Palmer");
			
			// Start transaction
			session.beginTransaction();
			
			// Save object
			System.out.println("Saving family member...");
			session.save(myFamily);
			
			// Commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
		} finally {
			factory.close();
		}
	}
	
}
		
