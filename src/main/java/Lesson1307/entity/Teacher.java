package Lesson1307.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@ToString(callSuper=true,exclude= {"teacherDetails", "courses"})
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "teacher")
public class Teacher extends BaseEntity {

	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 50, nullable = false)
	private String lastName;

	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;

	@Column(name = "age", length = 3)
	private int age;

	@OneToOne
	@JoinColumn(name = "teacher_details_id")
	private TeacherDetails teacherDetails;

	@OneToMany(mappedBy = "teacher")
	private List<Courses> courses;

}
