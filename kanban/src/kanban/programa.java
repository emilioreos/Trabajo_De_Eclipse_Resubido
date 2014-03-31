package kanban;

import java.util.Date;

public class programa {
	public static IDListaDeTareas libreta = new LibretaDeTareasList();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarea tarea;
		System.out.println("iniciamos "+ new Date());
		for (int i = 0; i < 15; i++) {
			tarea = new Tarea("Tarea " + i, Estado.TO_DO);
			if ( tarea.guardar()) {
				System.out.println("Guadado " + tarea.getTitulo());
			}
			
		}
		System.out.println("acabamos "+ new Date());
	}

}
