package br.senai.sp.model;

public class Triangulo {

	public double base;
	public double ladoB;
	public double ladoC;
	public double altura;
	public String nome;
	
	public void exibirDados() {
		System.out.println(
			     "        " + "-----------------------------\r\n"
				+ "        " + nome + "\r\n"  
				+ "	-----------------------------\r\n"
				+ "	Base:" + base + "\r\n"
				+ "	Lado B:" + ladoB + "\r\n"
				+ "	Lado C:" + ladoC + "\r\n"
				+ "	Altura:" + altura + "\r\n"
				); 
	}
}
