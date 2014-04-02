package kanban;

import java.util.Date;
import java.util.Random;

public class programa {
	public static IDListaDeTareas libreta = new LibretaDeTareasList();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarea tarea;
		System.out.println("iniciamos "+ new Date());
		Usuario usu;
		for (int i = 0; i < 150; i++) {
			//tarea = new Tarea("Tarea " + i, Estado.TO_DO);
			//if ( tarea.guardar()) {
				//System.out.println("Guadado " + tarea.getTitulo());
			//}
			usu=new Usuario();
			usu.setName("Titulo "+i);
			int r=1+(int) (Math.random()*((10-1)+1));
			usu.setPriority(r);
			usu.start();
			
		}
		System.out.println("acabamos "+ new Date());
		
	}

}
