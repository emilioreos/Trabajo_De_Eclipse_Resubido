package kanban;



import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LibretaDeTareasList extends LibretaDeTareasAbstracta implements List<Tarea> {

	public LibretaDeTareasList() {
		super();
		System.out.println("iniciando libretaDeTareasList()...");
	}

	public boolean add(Tarea e) {
		return contenedor.add(e);
	}

	public void add(int index, Tarea element) {
		contenedor.add(index, element);
	}

	public boolean addAll(Collection c) {
		return contenedor.addAll(c);
	}

	public boolean addAll(int index, Collection c) {
		return contenedor.addAll(index, c);
	}

	public void clear() {
		contenedor.clear();
	}

	public boolean contains(Object o) {
		return contenedor.contains(o);
	}

	public boolean containsAll(Collection c) {
		return contenedor.contains(c);
	}

	public Tarea get(int index) {
		return (Tarea)contenedor.get(index);
	}

	public int indexOf(Object o) {
		return contenedor.indexOf(o);
	}

	public boolean isEmpty() {
		return contenedor.isEmpty();
	}

	public Iterator iterator() {
		return contenedor.iterator();
	}

	public int lastIndexOf(Object o) {
		return contenedor.lastIndexOf(o);
	}

	public ListIterator listIterator() {
		return contenedor.listIterator();
	}

	public ListIterator listIterator(int index) {
		return contenedor.listIterator(index);
	}

	public boolean remove(Object o) {
		return contenedor.remove(o);
	}

	public Tarea remove(int index) {
		return (Tarea)contenedor.remove(index);
	}

	public boolean removeAll(Collection c) {
		return contenedor.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection c) {
		return contenedor.retainAll(c);
	}

	public Tarea set(int index, Tarea element) {
		return (Tarea)contenedor.set(index, element);
	}

	public int size() {
		return contenedor.size();
	}

	public List subList(int fromIndex, int toIndex) {
		return contenedor.subList(fromIndex, toIndex);
	}

	public Object[] toArray() {
		return contenedor.toArray();
	}

	public Object[] toArray(Object[] a) {
		return contenedor.toArray(a);
	}

	public boolean remove(Tarea ta) {
		return contenedor.remove(ta);
	}

	public boolean agragar(Tarea tarea) {
		return add(tarea);
	}

	public boolean remover(Tarea tarea) {
		return remove(tarea);
	}
}