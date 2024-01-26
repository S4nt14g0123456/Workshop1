package co.edu.unbosque.model;

public class EmpleadoDTO {
	private long id;
	private String name;
	public EmpleadoDTO() {
		// TODO Auto-generated constructor stub
	}
	public EmpleadoDTO(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employe \n"+ "id=" + id + "\n"+"name=" + name + "\n";
	}
}
