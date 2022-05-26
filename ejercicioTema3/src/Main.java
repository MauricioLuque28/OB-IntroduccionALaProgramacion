/*
Primera parte:

-Crear una función con tres parámetros que sean números que se suman entre sí.
-Llamar a la función en el main y darle valores.

Segunda parte:

-Crear una clase coche.
-Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
-Una función que incremente el número de puertas que tiene el coche.
-Crear un objeto miCoche en el main y añadirle una puerta.
-Mostrar el número de puertas que tiene el objeto.
 */

public class Main {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 4;
        int num3 = 6;
        int resultado;

        resultado = Suma(num1, num2, num3);

        System.out.println("El resultado es " + resultado);

        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();

        System.out.println("La cantidad de puertas es " + miCoche.puertas);
    }
    public static int Suma(int a, int b, int c){

        return a + b + c;
    }

}

class Coche {

    public int puertas = 0;

    public void AgregarPuerta(){
        this.puertas++;
    }

}