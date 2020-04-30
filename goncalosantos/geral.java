package com.goncalosantos.calculadora;

public class geral 
{
	/**
	 * Fun��o que devolve o valor da soma de dois par�metros
	 * 
	 * @param x (int) par�metro da divis�o
	 * @param y (int) par�metro da divis�o
	 * @return (int) resultado da divis�o
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
	 * Fun��o que devolve o valor da subtra��o de dois par�metros
	 * 
	 * @param x (int) par�metro da divis�o
	 * @param y (int) par�metro da divis�o
	 * @return (int) resultado da divis�o
	 * 
	 * </br></br>
	 * 
	 * {@link tools#subtra��o(double x, double y)}
	 */
	public static int subtracao(int x, int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	//N�o est� a ser utilizada
	public static int inversaoDaSoma(int x,int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	/**
	 * Fun��o que devolve o valor da multiplica��o de dois par�metros
	 * 
	 * @param x (int) par�metro da divis�o
	 * @param y (int) par�metro da divis�o
	 * @return (int) resultado da divis�o
	 * 
	 * </br></br>
	 * 
	 * {@link tools#multiplica��o(double x, double y)}
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
