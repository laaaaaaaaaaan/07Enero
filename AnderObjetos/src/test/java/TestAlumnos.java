package AnderObjetos.src.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import AnderObjetos.src.main.java.Alumno;
import AnderObjetos.src.main.java.FuncionesMain;

public class TestAlumnos { 

	
	private String nombre = "Carlos gonzalez";
	private char sexo = 'H';
	private int edad = 34;
	private float altura = (float) 1.78;
	private float peso = (float) 67.6;
	private Alumno alumno = new Alumno(nombre,sexo,edad,altura,peso);
	
	
	private String nombre2 = "Clara diez";
	private char sexo2 = 'M';
	private int edad2 = 26;
	private float altura2 = (float) 1.68;
	private float peso2 = (float) 61.6;
	private Alumno alumno2 = new Alumno(nombre2,sexo2,edad2,altura2,peso2);
	
	private FuncionesMain funciones = new FuncionesMain();
	
	private Alumno[] alumnos = new Alumno[2];
	
	
	@Test
	public void testContructorAlumno() {
		Alumno alumnoprueba = new Alumno(nombre,sexo,edad,altura,peso);
		assertEquals(nombre,alumnoprueba.getNombre());
		assertEquals(sexo,alumnoprueba.getSexo());
		assertEquals(altura,alumnoprueba.getAltura(),0.2);
		assertEquals(peso,alumno.getPeso(),0.2);
	}
	
	@Test
	public void testEdad() {
		alumno.setEdad(edad);
		assertEquals(edad,alumno.getEdad());
	}
	
	@Test
	public void testNombre() {
		alumno.setNombre(nombre);
		assertEquals(nombre,alumno.getNombre());
	}
	@Test
	public void testSexo() {
		alumno.setSexo(sexo);
		assertEquals(sexo,alumno.getSexo());
	}
	@Test
	public void testAltura() {
		alumno.setAltura(altura);
		assertEquals(altura,alumno.getAltura(),0.2);
	}
	@Test
	public void testPeso() {
		alumno.setAltura(peso);
		assertEquals(peso,alumno.getPeso(),0.2);
	}
	
	@Test
	public void testToString() {
		String resultado = alumno.toString();
		assertEquals(resultado,"Lo que sea");
	}
	
	
	
	

}
