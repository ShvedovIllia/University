package Lesson1307.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "course_student")

public class CourseStudent extends BaseEntity{

	@ManyToOne
	@JoinColumn(name="course_id")
	private Courses course;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	@Column(name="date_from")
	private String dateFrom;
	@Column(name="date_to")
	private String dateTo;
	
}
