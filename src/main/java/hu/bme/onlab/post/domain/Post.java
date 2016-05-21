package hu.bme.onlab.post.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import hu.bme.onlab.user.domain.User;

@Entity(name = "post")
public class Post {

	private Long id;
	private String entry;
	private Calendar creationDateTime;
	
	private User author;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(length=4000)
	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public Calendar getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(Calendar creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@ManyToOne
	@NotNull
	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
}
