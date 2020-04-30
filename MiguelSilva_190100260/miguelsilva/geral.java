package com.miguelsilva.calculadora;

/**
 * A API <strong>calculadoraAPI</strong> oferece um conjunto de fun��es
 * que permite obter o resultado das fun��es aritm�ticas base
 * 
 * Exemplo de utiliza��o:
 * {@code
 * int resultadoSubtracao = calculadoraAPI.soma(5,2) // resultado: 7
 * 
 * }
 * 
 * @author Miguel Silva
 * @version 1.1
 * @since 30/04/2020
 *
 *@see #soma(int, int)
 *@see #subtracao(int, int)
 *@see #multiplicacao(int, int)
 *@see #divisao(double, double)
 */

public class geral {
	
	/**
	 * Fun��o que devolve o valor da soma de dois par�metros
	 * 
	 * @param x (int) par�metro da soma
	 * @param y (int) par�metro da soma
	 * @return (int) resultado da soma
	 * 
	 * </br></br>
	 * 
	 * {@link tools#soma(int x, int y)}
	 */
		public static int soma(int x, int y)
		{
			return calculadoraAPI.soma(x, y);
		}
		/**
		 * Fun��o que devolve o valor da subtracao de dois par�metros
		 * 
		 * @param x (int) par�metro da subtracao
		 * @param y (int) par�metro da subtracao
		 * @return (int) resultado da subtracao
		 * 
		 * </br></br>
		 * 
		 * {@link tools#subtracao(int x, int y)}
		 */
		
		public static int subtracao(int x, int y)
		{
			return calculadoraAPI.subtracao(x, y);
		}
	
		/**
		 * Fun��o que devolve o resultado da inversao da soma de dois inteiros.
		 * @param x (int) par�metro inteiro que vai ser um dos elementos da inversao
		 * @param y (int) par�metro inteiro que vai ser um dos elementos da inversao
		 * @return (int) <code>resultado</code> da inversao dos par�metros x e y
		 * 
		 * @deprecated
		 * 
		 * @since 1.0
		 * 
		 */
		public static int inversaoDaSoma(int x,int y)
		{
			return calculadoraAPI.subtracao(x, y);
		}
		
		
		/**
		 * Fun��o que devolve o valor da multiplicacao de dois par�metros
		 * 
		 * @param x (int) par�metro da multiplicacao
		 * @param y (int) par�metro da multiplicacao
		 * @return (int) resultado da multiplicacao
		 * 
		 * </br></br>
		 * 
		 * {@link tools#multiplicacao(int x, int y)}
		 */
		
		public static int multiplicacao(int x, int y)
		{
			return calculadoraAPI.multiplicacao(x, y);
		}
		/**
		 * Fun��o que devolve o valor da divisao de dois par�metros
		 * 
		 * @param x (double) par�metro da divisao
		 * @param y (double) par�metro da divisao
		 * @return (double) resultado da divisao
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

