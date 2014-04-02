package kanban;

import java.util.Date;

public class Tarea {
	private String descripcion,categoria,propietario,titulo;
	private Date fechaDeEntrega,fechaDeCreacion;
	private Estado ESTADO;
	private short prioridad;
	public Tarea() {
		this("");
		System.out.println("iniciando Tarea()...");
	}

	public Tarea(String ti) {
		this(ti, Estado.TO_DO);
		System.out.println("iniciando tarea(String)...");
	}
	public Tarea(String ti,int p){
		this(ti,Estado.TO_DO,p);
		System.out.println("iniciando tarea(String, Prioridad)...");
	}

	public Tarea(String ti, Estado estado) {
		this(ti,estado,1);
		System.out.println("iniciando Tarea(String, Estado)...");
	}
	public Tarea(String ti, Estado estado,int p) {
		super();
		System.out.println("iniciando Tarea(String, Estado, Prioridad)...");
		
		this.setTitulo(ti);
		fechaDeCreacion = new Date();
		prioridad = (short)p;
		this.ESTADO = estado;
	}
		

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public Date getFechaDeEntrega() {
		return fechaDeEntrega;
	}
	public void setFechaDeEntrega(Date fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public Estado getEstado() {
		return ESTADO;
	}
	public void setEstado(Estado estado) {
		this.ESTADO = estado;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = (short)prioridad;
	}
	public String toString() {
		return titulo;
	}
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Tarea) {
				return titulo.equals(((Tarea) obj).getTitulo());
			}
		}
		return false;
	}
	public boolean guardar(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
