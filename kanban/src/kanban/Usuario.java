package kanban;

public class Usuario extends Thread {
	@Override
	public void run(){
		String nombre=Thread.currentThread().getName();
		System.out.println("corriendo: "+nombre+ " (Prioridad= "+Thread.currentThread().getPriority()+")");
		Tarea tarea=new Tarea(nombre,Thread.currentThread().getPriority());
		if(tarea.guardar()){
			programa.libreta.agragar(tarea);
		}
	}
}
