package com.tiagogoncalves.calculadoraAPI;

/**
 * <b><i>Calculadora</i></b>
 * 
 * A API <strong>CalcoladoraAPI</strong> ofere�e um conjunto de fun��es
 * que permitem obter o resultado das fun��es aritm�ticas base.
 * 
 * Exemplo de utiliza��o:
 * <pre>
 * {@code
 * int resultadoSubtracao = CalculadoraAPI.soma(5,2) // resultado = 7
 * int resultadoSubtracao = CalculadoraAPI.subtracao(5,2) // resultado = 3
 * int resultadoSubtracao = CalculadoraAPI.multiplicacao(5,2) // resultado = 10
 * double resultadoSubtracao = CalculadoraAPI.divisao(5,2) // resultado = 2.5
 * }
 * </pre>
 * @author Tiago Gon�alves
 * @version 1.0
 * @since 30/04/2020
 * 
 * @see #soma(int, int)
 * @see #subtracao(int, int)
 * @see #multiplicacao(int, int)
 * @see #divisao(double, double)
 *
 */

public class geral {
	/**
	 * Fun��o que devolve o valor da soma de dois parametros
	 * @param x (int) parametro da soma
	 * @param y (int) parametro da soma
	 * @return (int) parametro da soma
	 * 
	 * {@link tools#soma(int x, int y)}
	 */
	public static int soma(int x, int y)
	{
		/**
		 * Devolve o valor da soma 
		 */
		return calculadoraAPI.soma(x, y);
	}
	/**
	 * Fun��o que devolve o valor da subtracao de dois parametros
	 * @param x (int) parametro da subtracao
	 * @param y (int) parametro da subtracao
	 * @return (int) parametro da subtracao
	 * 
	 * {@link tools#subtracao(int x, int y)}
	 */
	public static int subtracao(int x, int y)
	{
		/**
		 * Devolve o valor da subtra��o
		 */
		return calculadoraAPI.subtracao(x, y);
	}
	/**
	 * Fun��o que devolve o valor da multiplica��o de dois parametros
	 * @param x (int) parametro da multiplica��o
	 * @param y (int) parametro da multiplica��o
	 * @return (int) parametro da multiplica��o
	 * 
	 * {@link tools#multiplicacao(int x, int y)}
	 */
	public static int multiplicacao(int x, int y)
	{
		/**
		 * Devolve o valor da multiplica��o
		 */
		return calculadoraAPI.multiplicacao(x, y);
	}
	/**
	 * Fun��o que devolve o valor da divis�a de dois parametros
	 * @param x (double) parametro da divis�o
	 * @param y (double) parametro da divis�o
	 * @return (double) parametro da divis�o
	 * 
	 * {@link tools#divisao(double, double)}
	 */
	public static double divisao(double x, double y)
	{
		/**
		 * Devolve o valor da divis�o
		 */
		return calculadoraAPI.divisao(x, y);
	}
}
