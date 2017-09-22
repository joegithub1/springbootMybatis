package cn.hj.sbootmybatis.po;

public class Tearcher {

	private Long id;
	private String name;
	private Integer age;
	
	public Tearcher() {
		// TODO Auto-generated constructor stub
	}

	public Tearcher(Long id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Tearcher [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
