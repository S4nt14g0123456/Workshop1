package co.edu.unbosque.model;

public class AspiranteDTO {
	private String name;
	private Long numdocu;
	
	public AspiranteDTO() {
		// TODO Auto-generated constructor stub
	}

	public AspiranteDTO(String name, Long numdocu) {
		super();
		this.name = name;
		this.numdocu = numdocu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumdocu() {
		return numdocu;
	}

	public void setNumdocu(Long numdocu) {
		this.numdocu = numdocu;
	}

	@Override
	public String toString() {
		return "AspiranteDTO [name:" + name + ", numdocu:" + numdocu + "]";
	}
	

}
