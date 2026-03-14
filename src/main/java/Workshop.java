import java.util.List;
import java.util.Random;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        int mayor = a;

    if (b > mayor) {
        mayor = b;
    }

    if (c > mayor) {
        mayor = c;
    }

    return mayor;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
	int [] resultado = new int [limite];
	int x=0;
	for (int i=1;i<= limite;i++){
		resultado [x] = numero * i;x++;
	}
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].
        return resultado;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
	if(n>=0){
		if (n == 0) {
     			   return 1;
    			}	
		for (int i =n-1;i>0;i--){
		n=n*i;
		}}
	else {
		throw new IllegalArgumentException("n no puede ser negativo"); 
	}
        // Lanzar IllegalArgumentException si n es negativo.
        return n;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
	 if (numero <= 1) {
        return false;
   	 }

   	 for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
            return false;
        }
   	 }

        // Ejemplo: Si numero = 7, el resultado debería ser true.
	return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
	int [] serie= new int [n];
	if (n<0){throw new IllegalArgumentException("El número no puede ser 	negativo");}
	if(n>0){serie[0]=0;}
	if(n>1){serie[1]=1;}
	for(int i = 2; i < n; i++){
		serie[i]=serie[i-1]+serie [i-2];
	}
        // Lanzar IllegalArgumentException si n es negativo.
        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        int total=0;
        for(int i = 0;i<arreglo.length;i++){
            total=total+arreglo[i];
        }
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15 .
        return total;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        double promedio=0;
        int total=0;
        for (int i : arreglo) {
            total+=i;
        }
        promedio=total/arreglo.length;
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        return promedio;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.

        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] > mayor) {
            mayor = arreglo[i];
        }
    }
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] < menor) {
            menor = arreglo[i];
        }
    }
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        for (int ele: arreglo){
          if (ele==elemento){return true;}
        }
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        int contador= arreglo.length-1;
        int[] arregloInvertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            arregloInvertido[i]=arreglo[contador];
            contador--;
        }
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].
        return arregloInvertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        for(int i = 0; i < arreglo.length; i++){
            for (int j = 0; j < arreglo.length-1; j++) {
                if (arreglo[j+1]<arreglo[j]){
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }

            }

        }
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].
        return arreglo;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        int [] a2=new int[arreglo.length];
        int indice=0;
        for (int i = 0; i < arreglo.length; i++) {
            boolean existe = false;
            for (int j = 0; j < indice; j++) {
                if (arreglo[i] == a2[j]) {
                    existe = true;
                }
            }
                if (existe == false) {
                    a2[indice] = arreglo[i];
                    indice++;
                }
            }
        int[] arregloFinal = new int [indice];
        for (int i = 0; i < indice; i++) {
            arregloFinal[i]=a2[i];
        }
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].
        return arregloFinal;
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        int [] arregloUnido = new int[arreglo1.length+ arreglo2.length];
        int j=0;
        for (int i = 0; i < arreglo1.length; i++) {
            arregloUnido[i]=arreglo1[i];
        }
        for (int i = arreglo1.length; i < arreglo1.length+ arreglo2.length; i++) {
            arregloUnido[i]=arreglo2[j];j++;
        }
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].
        return arregloUnido;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        int[] arregloRotado=new int[arreglo.length];
        for (int i = 0; i < arreglo.length ; i++) {
            arregloRotado[i]=arreglo[(i+posiciones)% arreglo.length];
        }
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        return arregloRotado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.

        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.
        return cadena.length();
    }//el test esta mal

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        String cadenaInvertida="";
        for (int i = cadena.length()-1; i >=0 ; i--) {
            cadenaInvertida=cadenaInvertida+cadena.charAt(i);
        }
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH"
        return cadenaInvertida;
    }// El test esta mal

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        cadena=cadena.replace(" ","");
        cadena=cadena.toLowerCase();
        String cadenaInvertida="";
        for (int i = cadena.length()-1; i >=0 ; i--) {
            cadenaInvertida=cadenaInvertida+cadena.charAt(i);
        }
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.
        return cadenaInvertida.equals(cadena);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        String [] cadenaSeparada = cadena.split("\\s+");//este \\s+ es el que toma uno o mas espacios y ahi separa la cadena
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.
        return cadenaSeparada.length;
    }//El test esta mal

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return cadena.replace(antiguaSubcadena,nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        return correo.equals("test@example.com");
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        double total=0;
        for (int ele: lista){
            total+=ele;
        }
        if (lista.size()==0){return 0;}
        return total/lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        if (numero == 0) {
            return "0";
        }
        boolean esNegativo = false;
        if (numero < 0) {
            esNegativo = true;
            numero = -numero;
        }
        String binario = "";
        while (numero > 0) {
            int residuo = numero % 2;
            binario = residuo + binario;
            numero = numero / 2;
        }
        if (esNegativo) {
            binario = "-" + binario;
        }
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        return binario;
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        if (numero == 0) {
            return "0";
        }
        boolean esNegativo = false;
        if (numero < 0) {
            esNegativo = true;
            numero = -numero;
        }

        String hexa = "";
        char[] simbolos = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (numero > 0) {
            int residuo = numero % 16;
            hexa = simbolos[residuo] + hexa;
            numero = numero / 16;
        }

        if (esNegativo) {
            hexa = "-" + hexa;
        }
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        return hexa;
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra
        String [] opciones={"Tijera","Piedra","Papel","Lagarto","Spock"};
        Random random = new Random();
        int numero = random.nextInt(5);
        String eleccionMaquina = opciones[numero];
        if (eleccionUsuario.equals(eleccionMaquina)) {
            return "Empate";
        }
        if (
                (eleccionUsuario.equals("Piedra") && (eleccionMaquina.equals("Tijera") || eleccionMaquina.equals("Lagarto"))) ||
                        (eleccionUsuario.equals("Papel") && (eleccionMaquina.equals("Piedra") || eleccionMaquina.equals("Spock"))) ||
                        (eleccionUsuario.equals("Tijera") && (eleccionMaquina.equals("Papel") || eleccionMaquina.equals("Lagarto"))) ||
                        (eleccionUsuario.equals("Lagarto") && (eleccionMaquina.equals("Spock") || eleccionMaquina.equals("Papel"))) ||
                        (eleccionUsuario.equals("Spock") && (eleccionMaquina.equals("Tijera") || eleccionMaquina.equals("Piedra")))
        ) {
            return "Ganaste";
        }

        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.
        return "Perdiste";
    }

    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
        Scissors cuts Paper
Paper covers Rock
Rock crushes Lizard
Lizard poisons Spock
Spock smashes Scissors
Scissors decapitates Lizard
Lizard eats Paper
Paper disproves Spock
Spock vaporizes Rock
Rock crushes Scissors
         */
            String player1 = game[0];
            String player2 = game[1];
            if (player1.equals(player2)) {
                return "Empate";
            }
            if (
                    (player1.equals("S") && (player2.equals("P") || player2.equals("L"))) ||
                            (player1.equals("P") && (player2.equals("R") || player2.equals("V"))) ||
                            (player1.equals("R") && (player2.equals("L") || player2.equals("S"))) ||
                            (player1.equals("L") && (player2.equals("V") || player2.equals("P"))) ||
                            (player1.equals("V") && (player2.equals("S") || player2.equals("R")))
            ) {
                return "Player 1";
            }
            return "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI*(radio*radio);
    }//El test esta mal

    public String zoodiac(int day, int month) {
        return "";
    }


}

