package model;

public class Usuario {
	private String nombre;
	private String apellido;
	private Integer edad;
	private String hobbie;
	private String editorDeCodigo;
	private String sistemaOperativo;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Usuario(String nombre, String apellido, Integer edad, String hobbie, String editorDeCodigo,
			String sistemaOperativo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.hobbie = hobbie;
		this.editorDeCodigo = editorDeCodigo;
		this.sistemaOperativo = sistemaOperativo;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getHobbie() {
		return hobbie;
	}
	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}
	public String getEditorDeCodigo() {
		return editorDeCodigo;
	}
	public void setEditorDeCodigo(String editorDeCodigo) {
		this.editorDeCodigo = editorDeCodigo;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}


	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad:" + edad + "\nHobbie: " + hobbie
				+ "\nEditorDeCodigo: " + editorDeCodigo + "\nSistemaOperativo: " + sistemaOperativo;
	}
	
}
