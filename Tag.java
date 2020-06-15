package it.uniroma3.siw.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(unique = true, nullable = false, length = 100)
	private String name;
	@Column
	private String description;
	
	@Column(nullable = false)
	private String color;
	
	@ManyToMany
	private List<Task> tasks;
	
	public Tag() {
		this.tasks= new ArrayList<>();
	}
	
	public Tag(String nome, String color, String desc) {
		this();
		this.name = nome;
		this.color = color;
		this.description = desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColore() {
		return color;
	}

	public void setColore(String color) {
		this.color = color;
	}
	

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", name=" + name + ", description=" + description + ", colore=" + color + ", tasks="
				+ tasks + "]";
	}

	@Override
	public int hashCode() {
        return Objects.hash(name, color, description);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tag tag = (Tag) o;
        return Objects.equals(name, tag.name) &&
                Objects.equals(color, tag.color) &&
                Objects.equals(description, tag.description);
	}
	
}
