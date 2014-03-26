package kanban;
import java.util.Arrays;

public class LibretaDeTareas implements IDListaDeTareas{
	private Tarea[] Tareas;
	private int tamano;
	private transient int contador = 0;
	
	public LibretaDeTareas(int iniCap) {
		super();
		if (iniCap < 0)
			throw new IllegalArgumentException("capacidad ilegal: "
					+ iniCap);
		this.Tareas = new Tarea[iniCap];
	}

	public LibretaDeTareas() {
		this(10);
	}


	public boolean add(Tarea ta) {
		ensureCapacity(tamano + 1);
		Tareas[tamano++] = ta;
		return true;
	}

	public void ensureCapacity(int minCap) {
		contador++;
		int antCap = Tareas.length;
		if (minCap > antCap) {
			int nuevCap = (antCap * 3) / 2 + 1;
			if (nuevCap < minCap)
				nuevCap = minCap;
			Tareas = Arrays.copyOf(Tareas, nuevCap);
		}
	}

	public boolean remove(Tarea ta) {
		if (ta == null) {
			for (int i = 0; i < tamano; i++)
				if (Tareas[i] == null) {
					fastRemove(i);
					return true;
				}
		} else {
			for (int i = 0; i < tamano; i++)
				if (ta.equals(Tareas[i])) {
					fastRemove(i);
					return true;
				}
		}
		return false;
	}
	private void fastRemove(int i) {
		contador++;
		int numMov = tamano - i - 1;
		if (numMov > 0)
			System.arraycopy(Tareas, i + 1, Tareas, i, numMov);
		Tareas[--tamano] = null; 
	}

	public void clear() {
		contador++;
		for (int i = 0; i < tamano; i++)
			Tareas[i] = null;

		tamano = 0;
	}

	


	
	@Override
	public boolean agragar(Tarea tarea){
		return true;
	}
	@Override
	public boolean remover(Tarea tarea) {
		return true;
	}
}
