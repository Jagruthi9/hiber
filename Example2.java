package hiber.util.ui;
import javax.persistence.EntityManager;

import com.hiber.model.*;

import hiber.util.JPAUtil;
public class Example2 {

	public static void main(String[] args) {
		Emp e=new Emp(1,"jagruthi",25000);
		Manager m= new Manager(2,"Rahul",35000,9500);
		ContractEmp ce=new ContractEmp(3,"Chandu",45299,11);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		System.out.print("all records saved");JPAUtil.shutdown();

	}

}
