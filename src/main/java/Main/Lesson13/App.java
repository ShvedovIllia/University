package Main.Lesson13;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.annotations.SourceType;

import Lesson1307.entity.Teacher;
import Lesson1307.entity.TeacherDetails;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("logos");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
//
//		List<Teacher> teachers = em.createQuery("select t from Teacher t", Teacher.class).getResultList();
//		teachers.forEach(System.out::println);
		
//		for(int i=0; i<30; i++) {
//			addTeacher(em, i);
//		}
//		
//		Teacher teacher = em.createQuery("select t from teacher t where t.id = :teacherId", Teacher.class)
//				.setParameter("teacherId", 5L).getSingleResult();
		
		Teacher teacher = Teacher.builder()
				.email("blablabla")
				.firstName("Ivan")
				.lastName("Kurka")
				.age(25)
				.build();
		
		TeacherDetails td = new TeacherDetails();
		td.setExperience("1year");
		td.setHobby("java");
		
		teacher.setTeacherDetails(td);
		
		em.persist(teacher);
		
		em.getTransaction().commit();
		em.close();
		factory.close();

	}
	
	private static void addTeacher(EntityManager em, int i) {

		Teacher teacher = new Teacher();
		teacher.setEmail("bestteacher" + i + "@gmail.com");
		teacher.setAge(39);
		teacher.setFirstName("John" + i);
		teacher.setLastName("Doe" + i);

		em.persist(teacher);
	}
}
