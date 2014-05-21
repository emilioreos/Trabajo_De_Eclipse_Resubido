package kanban;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComponent;
import javax.swing.*;

public class InterfaceUsuario extends JFrame {
	TextField titulo=new TextField(),descripcion=new TextField(),categoria=new TextField(),propietario=new TextField();
			
	Integer[] prioridad={1,2,3,4,5,6,7,8,9,10};
	JComboBox listaEstado=new JComboBox<Estado>(Estado.values()),listaPrioridad=new JComboBox<Integer>(prioridad),dia=new JComboBox<Integer>(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}),mes=new JComboBox<Integer>(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12}),ano=new JComboBox<Integer>(new Integer[]{2012,2013,2014});
	JButton boton=new JButton("agregar"),botonCancelar=new JButton("cancelar");
	LibretaDeTareas listaTareas=new LibretaDeTareas();
	private class escuchadorBoton implements ActionListener{
		String ss,sss,ssss,sp;
		private String estaBasio(String  mensaje,TextField texto)throws ComponenteBacioExepcion{
			String ss=texto.getText();
			if("".equalsIgnoreCase(ss.trim())){
				throw new ComponenteBacioExepcion(mensaje,texto);
			}
			return ss;
		}
		private void validarDatos() throws ComponenteBacioExepcion {
			String ss=estaBasio("titulo basio",titulo);//titulo.getText();
			
			String sss=estaBasio("categoria basia",categoria);//categoria.getText();
			String ssss=estaBasio("descripcion basia", descripcion);//descripcion.getText();
			String sp=estaBasio("propietario basio", propietario);//propietario.getText();
			this.ss=ss;
			this.sss=sss;
			this.ssss=ssss;
			this.sp=sp;
			return;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try{
				validarDatos();
				Tarea t=new Tarea(ss,(Estado)listaEstado.getSelectedItem(),(Integer)listaPrioridad.getSelectedItem());
				t.setCategoria(sss);
				t.setDescripcion(ssss);
				t.setPropietario(sp);
				t.setFechaDeCreacion(new Date());
				Calendar c=new GregorianCalendar();
				c.set((Integer)dia.getSelectedItem(),(Integer)mes.getSelectedItem(),(Integer)ano.getSelectedItem());
				t.setFechaDeEntrega(c.getTime());
				
				programa.libreta.agragar(t);
			}catch(ComponenteBacioExepcion ex){
				ex.getComponente().requestFocus();
				JOptionPane.showMessageDialog(InterfaceUsuario.this, ex.getMessage(),"error en los campos",JOptionPane.ERROR_MESSAGE);
			}catch(Exception ex){
				JOptionPane.showMessageDialog(InterfaceUsuario.this, ex.getMessage(),"error en los campos",JOptionPane.ERROR_MESSAGE);
				//ex.printStackTrace();
			}
		}
		
	}
	private class cerrarVentana3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(JOptionPane.showConfirmDialog(InterfaceUsuario.this, "Decea Cerrar la Ventana", "Cerrar", JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
				dispose();
				System.exit(1);
			}
		}
		
	}
	public InterfaceUsuario(String s){
		super(s);
		//segundo intento setLayout(new BorderLayout());
		setLayout(new GridBagLayout());
		init();
	}
	public void init(){
		//tercer intento
				GridBagConstraints gc=new GridBagConstraints();
				gc.gridx=0;
				gc.gridy=0;
				gc.anchor=gc.WEST;
				add(new JLabel("Titulo"),gc);
				gc.gridx=1;
				gc.gridy=0;
				
				add(titulo,gc);
				gc.gridx=0;
				gc.gridy=1;
				add(new JLabel("Estado"),gc);
				gc.gridx=1;
				gc.gridy=1;
				add(listaEstado,gc);
				gc.gridx=0;
				gc.gridy=2;
				add(new JLabel("Prioridad"),gc);
				gc.gridx=1;
				gc.gridy=2;
				add(listaPrioridad,gc);
				gc.gridx=0;
				gc.gridy=3;
				add(new JLabel("descripcion"),gc);
				gc.gridx=1;
				gc.gridy=3;
				add(descripcion,gc);
				gc.gridx=0;
				gc.gridy=4;
				add(new JLabel("propietario"),gc);
				gc.gridx=1;
				gc.gridy=4;
				add(propietario,gc);
				gc.gridx=0;
				gc.gridy=5;
				add(new JLabel("categoria"),gc);
				gc.gridx=1;
				gc.gridy=5;
				add(categoria,gc);
				gc.gridx=0;
				gc.gridy=6;
				add(new JLabel("fecha de entrega"),gc);
				gc.gridx=1;
				gc.gridy=6;
				JPanel j=new JPanel(new FlowLayout());
				j.add(dia);
				j.add(mes);
				j.add(ano);
				j.add(new JLabel("dd-mm-aaaa"));
				add(j,gc);
				gc.gridx=0;
				gc.gridy=7;
				add(boton,gc);
				gc.gridx=1;
				gc.gridy=7;
				add(botonCancelar,gc);
				Dimension d=new Dimension(150,25);
				descripcion.setPreferredSize(new Dimension(150,80));
				titulo.setPreferredSize(d);
				propietario.setPreferredSize(d);
				categoria.setPreferredSize(d);
				boton.addActionListener(new escuchadorBoton());
				botonCancelar.addActionListener(new cerrarVentana3());
				
				
//				botonCancelar.addActionListener(new ActionListener(){
//
//					@Override
//					public void actionPerformed(ActionEvent arg0) {
//						// TODO Auto-generated method stub
//						dispose();
//					}
//					
//				});
		//segundo intento
//				titulo.setPreferredSize(new Dimension(150,25));
//				JPanel panelOeste =new JPanel(new GridLayout(7, 1)),panelCental=new JPanel(new GridLayout(7,1));
//				panelOeste.add(new JLabel("Titulo"));
//				panelOeste.add(new JLabel("Estado"));
//				panelOeste.add(new JLabel("Prioridad"));
//				panelCental.add(titulo);
//				panelCental.add(listaEstado);
//				panelCental.add(listaPrioridad);
//				add(panelOeste,BorderLayout.WEST);
//				add(panelCental,BorderLayout.CENTER);
//				add(boton,BorderLayout.SOUTH);
		
		//primer intento
//				titulo.setPreferredSize(new Dimension(300, 25));
//				JPanel panel1=new JPanel(new FlowLayout()),panel2=new JPanel(new FlowLayout()),panel3=new JPanel(new FlowLayout());
//				panel1.add(new JLabel("titulo"),FlowLayout.LEFT);
//				panel1.add(titulo,FlowLayout.CENTER);
//				add(panel1,BorderLayout.EAST);
//				panel2.add(new JLabel("Estado"));
//				panel2.add(listaEstado);
//				add(panel2,BorderLayout.WEST);
//				panel3.add(new JLabel("prioridad"),FlowLayout.LEFT);
//				panel3.add(listaPrioridad,FlowLayout.CENTER);
//				add(panel3,BorderLayout.CENTER);
//				add(boton,BorderLayout.SOUTH);
				
				
	}
	public static void main(String[] args){
		JFrame a=new InterfaceUsuario("Tarea");
		a.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		a.setSize(400, 400);
		a.setVisible(true);
	}
}
