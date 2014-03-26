package kanban;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarea tarea;
		IDListaDeTareas libreta = new LibretaDeTareasList();
		for (int i = 0; i < 15; i++) {
			tarea = new Tarea("Tarea " + i, Estado.TO_DO);
			if ( libreta.agragar(tarea)) {
				System.out.println("Agragado " + tarea.getTitulo());
			}
		}
	}

}
