package kanban;

public interface IDListaDeTareas {
	boolean agragar(Tarea tarea);
	boolean remover(Tarea tarea);
	void clear();
}
