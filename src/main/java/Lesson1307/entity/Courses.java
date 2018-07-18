package Lesson1307.entity;

import java.math.BigDecimal;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "courses")
public class Courses extends BaseEntity {

	@Column(name = "title", unique = true, nullable = false, length = 127)
	private String title;

	@Column(name = "description", columnDefinition = "text")
	private String description;

	@Column(name = "price", columnDefinition = "decimal(5,2)")
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name="teacher_id")
	private Teacher teacher;

}
