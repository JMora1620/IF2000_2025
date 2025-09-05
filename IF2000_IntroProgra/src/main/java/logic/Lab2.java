/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author josim
 */

import java.util.Scanner;

public class Lab2 {

    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {
        System.out.println("Ejercicio 1 - Suma de pares entre 2 y 1000");
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);
    }

    public void ejercicio2() {
        System.out.println("\nEjercicio 2 - Conversión de Celsius a Fahrenheit");
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
    }

    public void ejercicio3() {
        System.out.println("\nEjercicio 3 - Potencia de un número");
        System.out.print("Ingrese la base (x): ");
        int x = sc.nextInt();
        System.out.print("Ingrese el exponente (n): ");
        int n = sc.nextInt();

        int resultado = 1;
        for (int i = 0; i < n; i++) {
            resultado *= x;
        }
        System.out.println(x + " elevado a la " + n + " es: " + resultado);
    }

    public void ejercicio4() {
        System.out.println("\nEjercicio 4 - Mes del año");
        System.out.print("Ingrese un número del 1 al 12: ");
        int mes = sc.nextInt();

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        if (mes >= 1 && mes <= 12) {
            System.out.println("El mes es: " + meses[mes - 1]);
        } else {
            System.out.println("Número inválido.");
        }
    }

    public void ejercicio5() {
        System.out.println("\nEjercicio 5 - Función F(x)");
        System.out.print("Ingrese un número: ");
        int x = sc.nextInt();
        int resultado = (x > 0) ? x + 5 : (x < 0) ? x * x : 1;
        System.out.println("F(x) = " + resultado);
    }

    public void ejercicio6() {
        System.out.println("\nEjercicio 6 - Área de triángulo con fórmula de Herón");
        System.out.print("Ingrese el lado a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el lado b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el lado c: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("El área es: " + area);
    }

    public void ejercicio7() {
        System.out.println("\nEjercicio 7 - Intercambio de valores");
        System.out.print("Ingrese el valor de A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Después del intercambio:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    public void ejercicio8() {
        System.out.println("\nEjercicio 8 - Ecuación de la recta");
        System.out.print("Ingrese x0: ");
        double x0 = sc.nextDouble();
        System.out.print("Ingrese y0: ");
        double y0 = sc.nextDouble();
        System.out.print("Ingrese x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = sc.nextDouble();

        if (x0 == x1) {
            System.out.println("No se puede calcular la pendiente (división por cero).");
            return;
        }

        double m = (y1 - y0) / (x1 - x0);
        double b = y0 - m * x0;
        System.out.println("La ecuación es: y = " + m + "x + " + b);
    }

    public void ejercicio9() {
        System.out.println("\nEjercicio 9 - Suma de naturales menores que K");
        System.out.print("Ingrese un número natural K: ");
        int k = sc.nextInt();
        int suma = 0;

        for (int i = 1; i < k; i++) {
            suma += i;
        }

        System.out.println("La suma es: " + suma);
    }

    public void ejercicio10() {
        System.out.println("\nEjercicio 10 - Promedio de números");
        System.out.print("¿Cuántos números desea promediar? ");
        int cantidad = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Número " + i + ": ");
            suma += sc.nextInt();
        }

        double promedio = (double) suma / cantidad;
        System.out.println("El promedio es: " + promedio);
    }

    public void ejercicio11() {
        System.out.println("\nEjercicio 11 - Suma y conteo de pares e impares");
        int sumaPares = 0, sumaImpares = 0;
        int cantidadPares = 0, cantidadImpares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                sumaPares += num;
                cantidadPares++;
            } else {
                sumaImpares += num;
                cantidadImpares++;
            }
        }

        System.out.println("Pares: " + cantidadPares + ", Suma: " + sumaPares);
        System.out.println("Impares: " + cantidadImpares + ", Suma: " + sumaImpares);
        System.out.println("Suma total: " + (sumaPares + sumaImpares));
    }

    public void ejercicio12() {
        System.out.println("\nEjercicio 12 - Suma de pares e impares entre 1 y 200");
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }

        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }

    public void ejercicio13() {
        System.out.println("\nEjercicio 13 - Suma de cuadrados de los primeros 100 naturales");
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println("La suma es: " + suma);
    }

    public void ejercicio14() {
        System.out.println("\nEjercicio 14 - Factorial de un número");
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        long factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    public void ejercicio15() {
        System.out.println("\nEjercicio 15 - Número mayor entre 10 ingresados");
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }

        System.out.println("El número mayor es: " + max);
    }
}