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
	 * Fun��o que devolve o valor da soma de dois par�metros
	 * 
	 * @param x (double) par�metro da soma
	 * @param y (double) par�metro da soma
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
	 * Fun��o que devolve o valor da subtracao de dois par�metros
	 * 
	 * @param x (double) par�metro da subtracao
	 * @param y (double) par�metro da subtracao
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
	 * Fun��o que devolve o valor da multiplicacao de dois par�metros
	 * 
	 * @param x (double) par�metro da multiplicacao
	 * @param y (double) par�metro da multiplicacao
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
	 * Fun��o que devolve o valor da divis�o de dois par�metros
	 * 
	 * @param x (double) par�metro da divis�o
	 * @param y (double) par�metro da divis�o
	 * @return (double) resultado da divis�o
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
