package hiber.util.ui;

import java.sql.Date;

import javax.persistence.EntityManager;

import com.hiber.model1.Student;
import com.hiber.model1.StudentIdentity;

import hiber.util.JPAUtil;

public class ExForComposite {

	public static void main(String[] args) {
		Student s=new Student(new StudentIdentity(1,'A',8),"Jagruthi","Bomma",new Date(2020,3,2));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("emp saved!");
		JPAUtil.shutdown();


	}

}
