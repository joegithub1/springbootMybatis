package cn.hj.sbootmybatis.po;

public class Department {

	private Long depaId;
	private String depaName;
	private Integer depaNo;
	private Integer isDel;
	private Integer status;
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(Long depaId, String depaName, Integer depaNo, Integer isDel, Integer status) {
		super();
		this.depaId = depaId;
		this.depaName = depaName;
		this.depaNo = depaNo;
		this.isDel = isDel;
		this.status = status;
	}
	public Long getDepaId() {
		return depaId;
	}
	public void setDepaId(Long depaId) {
		this.depaId = depaId;
	}
	public String getDepaName() {
		return depaName;
	}
	public void setDepaName(String depaName) {
		this.depaName = depaName;
	}
	public Integer getDepaNo() {
		return depaNo;
	}
	public void setDepaNo(Integer depaNo) {
		this.depaNo = depaNo;
	}
	public Integer getIsDel() {
		return isDel;
	}
	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Department [depaId=" + depaId + ", depaName=" + depaName + ", depaNo=" + depaNo + ", isDel=" + isDel
				+ ", status=" + status + "]";
	}
	
		
}
