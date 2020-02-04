package hiber.util.ui;

import javax.persistence.EntityManager;

import com.hiber.composition.Address;
import com.hiber.composition.Faculty;

import hiber.util.JPAUtil;

public class CompositionDemo {
	public static void main(String args[]) {
		
	
Faculty f=new Faculty("jagruthi",new Address("A202","gvs","Banglore,Karnataka"));
		EntityManager em =JPAUtil.getEntityManagerFactory().createEntityManager();
        em.getTransaction().begin();
         em.persist(f);
         em.getTransaction().commit();
         System.out.print(" saved");
         JPAUtil.shutdown();
         
}
}
