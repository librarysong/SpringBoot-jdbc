package cn.tsu.edu.demo.domain;

public class User {
	private Long id;
	private String name;
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
	public User(String name) {
		super();
		this.name = name;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
