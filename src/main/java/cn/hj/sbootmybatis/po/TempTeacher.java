package cn.hj.sbootmybatis.po;

public class TempTeacher {

	private Long t_id;
	private String t_name;
	private Integer t_age;
	public TempTeacher() {
		// TODO Auto-generated constructor stub
	}
	public TempTeacher(Long t_id, String t_name, Integer t_age) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_age = t_age;
	}
	public Long getT_id() {
		return t_id;
	}
	public void setT_id(Long t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public Integer getT_age() {
		return t_age;
	}
	public void setT_age(Integer t_age) {
		this.t_age = t_age;
	}
	@Override
	public String toString() {
		return "TempTeacher [t_id=" + t_id + ", t_name=" + t_name + ", t_age=" + t_age + "]";
	}
	
}
