package com.duartesantos.calculadora;

/**
 * <b><i>Calculadora</i></b></br></br>
 * 
 * A API <strong>calculadoraAPI</strong> oferece um conjunto de fun��es
 * que permitem obter o resultado das fun��es aritm�ticas base.</br></br>
 * 
 * Exemplo de utiliza��o:
 * <pre>
 * {@code
 * 	int resultadoSubtracao = calculadoraAPI.soma(5,2) // resultado: 7
 * }
 * </pre>
 * 
 * @author Duarte Santos
 * @version 1.0
 * @since 30/04/2020
 * 
 * @see #soma(int, int)
 * @see #subtracao(int, int)
 * @see #multiplicacao(int, int)
 * @see #divisao(double, double)
 */
public class calculadoraAPI 
{
	public static int soma(int x, int y)
	{
		return tools.soma(x, y);
	}
	public static int subtracao(int x, int y)
	{
		return tools.subtracao(x, y);
	}
	public static int multiplicacao(int x, int y)
	{
		return tools.multiplicacao(x, y);
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
		/**
		 * Devolve o valor da divis�o de x por y
		 */
		return tools.divisao(x, y);
	}
}
