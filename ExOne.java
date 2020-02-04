package hiber.util.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hiber.model.BankAccount;
import com.hiber.model.Customer;

import hiber.util.JPAUtil;

public class ExOne {
	public static void main(String args[]) {
		BankAccount ba=new BankAccount();
		Customer cs=new Customer("12345698","sony",ba);
		ba.setAccno("KV0089");
		ba.setCustomer(cs);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction ts=em.getTransaction();
		ts.begin();
		em.persist(cs);
		ts.commit();
		System.out.println("saved!");
		JPAUtil.shutdown();
	}

}
