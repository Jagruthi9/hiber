package hiber.util.ui;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.hiber.model1.Employee;

import hiber.util.JPAUtil;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Employee e=new Employee();
		System.out.print("EmpId");
		e.setEmpId(scan.nextInt());
		System.out.print("EmpName");
		e.setEmpName(scan.next());
		System.out.print("basic");
		e.setBasic(scan.nextDouble());
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("emp saved!");
		JPAUtil.shutdown();
		scan.close();
		
				

	}

}
