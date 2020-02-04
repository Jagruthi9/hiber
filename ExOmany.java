package hiber.util.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.hiber.model.Course;
import com.hiber.model.Trainee;

import hiber.util.JPAUtil;

public class ExOmany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Course mca=new Course(101,"MCA",new TreeSet<Trainee>());
			Course mba=new Course(102,"MBA",new TreeSet<Trainee>());
			mca.getTrainees().add(new Trainee(201,"jagruthi",mca));
			mca.getTrainees().add(new Trainee(202,"nikki",mca));
			mca.getTrainees().add(new Trainee(203,"chandini",mca));
			
			mba.getTrainees().add(new Trainee(205,"satya",mba));
			mba.getTrainees().add(new Trainee(206,"Ravi",mba));
			mba.getTrainees().add(new Trainee(207,"Raghu",mba));
			
			EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
			EntityTransaction ts=em.getTransaction();
			ts.begin();
			em.persist(mca);
			em.persist(mba);
			ts.commit();
			System.out.println("saved!");
			JPAUtil.shutdown();
	}

}
