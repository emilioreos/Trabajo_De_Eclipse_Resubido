package kanban;


import java.util.ArrayList;
import java.util.List;

public abstract class LibretaDeTareasAbstracta implements IDListaDeTareas {

	protected List<Tarea> contenedor;

	public LibretaDeTareasAbstracta() {
		super();
		System.out.println("starting DashboardAbstract() ctor...");
		contenedor = new ArrayList<Tarea>();
	}

	public boolean add(Tarea ta) {
		return contenedor.add(ta);
	}

}
