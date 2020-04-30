package com.goncalosantos.calculadora;

public class geral 
{
	/**
	 * Função que devolve o valor da soma de dois parâmetros
	 * 
	 * @param x (int) parâmetro da divisão
	 * @param y (int) parâmetro da divisão
	 * @return (int) resultado da divisão
	 * 
	 * </br></br>
	 * 
	 * {@link tools#soma(double x, double y)}
	 */
	public static int soma(int x, int y)
	{
		return calculadoraAPI.soma(x, y);
	}
	/**
	 * Função que devolve o valor da subtração de dois parâmetros
	 * 
	 * @param x (int) parâmetro da divisão
	 * @param y (int) parâmetro da divisão
	 * @return (int) resultado da divisão
	 * 
	 * </br></br>
	 * 
	 * {@link tools#subtração(double x, double y)}
	 */
	public static int subtracao(int x, int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	//Não está a ser utilizada
	public static int inversaoDaSoma(int x,int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	/**
	 * Função que devolve o valor da multiplicação de dois parâmetros
	 * 
	 * @param x (int) parâmetro da divisão
	 * @param y (int) parâmetro da divisão
	 * @return (int) resultado da divisão
	 * 
	 * </br></br>
	 * 
	 * {@link tools#multiplicação(double x, double y)}
	 */
	public static int multiplicacao(int x, int y)
	{
		return calculadoraAPI.multiplicacao(x, y);
	}
	/**
	 * Função que devolve o valor da divisão de dois parâmetros
	 * 
	 * @param x (double) parâmetro da divisão
	 * @param y (double) parâmetro da divisão
	 * @return (double) resultado da divisão
	 * 
	 * </br></br>
	 * 
	 * {@link tools#divisao(double x, double y)}
	 */
	public static double divisao(double x, double y)
	{
		return calculadoraAPI.divisao(x, y);
	}
}
