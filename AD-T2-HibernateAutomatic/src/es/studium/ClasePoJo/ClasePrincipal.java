package es.studium.ClasePoJo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClasePrincipal {

	static SessionFactory sesFact;
	static Session sesion;
	static Transaction tx;

	public static void main(String[] args) {

		sesFact = new Configuration().configure().buildSessionFactory();
		sesion = sesFact.openSession();
		tx = sesion.beginTransaction();
		
		try {
			create(new Perros(10, "Labrador", "Mediano", 2, "Canela"));
		}
		catch (Exception e){
			
		}

	}

	private static SessionFactory getSesFact() {

		return sesFact;
	}

	public static void create(Perros p) {
		Session sessionObj = getSesFact().openSession();
		Transaction transObj = sessionObj.beginTransaction();
		sessionObj.save(p);
		transObj.commit();
		sessionObj.close();
		System.out.println("Perro " + p.getIdPerro() + " insertado correctamente");
	}
}
