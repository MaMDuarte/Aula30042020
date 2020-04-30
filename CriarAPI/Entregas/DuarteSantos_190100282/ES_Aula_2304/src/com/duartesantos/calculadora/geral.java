package com.duartesantos.calculadora;

/**
 * <b><i>Geral</i></b></br></br>
 * 
 * 
 * @author Duarte Santos
 * @version 1.0
 * @since 30/04/2020
 * 
 */


public class geral 
{
	
	/**
	 * Função que devolve o valor da soma de dois parâmetros
	 * 
	 * @param x (double) parâmetro da soma
	 * @param y (double) parâmetro da soma
	 * @return (double) resultado da soma
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
	 * Função que devolve o valor da subtracao de dois parâmetros
	 * 
	 * @param x (double) parâmetro da subtracao
	 * @param y (double) parâmetro da subtracao
	 * @return (double) resultado da subtracao
	 * 
	 * </br></br>
	 * 
	 * {@link tools#subtracao(double x, double y)}
	 */
	
	public static int subtracao(int x, int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	//Deixou de ser utilizada
	public static int inversaoDaSoma(int x,int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	
	/**
	 * Função que devolve o valor da multiplicacao de dois parâmetros
	 * 
	 * @param x (double) parâmetro da multiplicacao
	 * @param y (double) parâmetro da multiplicacao
	 * @return (double) resultado da multiplicacao
	 * 
	 * </br></br>
	 * 
	 * {@link tools#multiplicacao(double x, double y)}
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
