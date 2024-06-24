package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ExampleTest {

    private Example example;

    @BeforeEach
    public void init() {
        this.example = new Example();
    }

    @Test
    public void testSumar() {

        //Given - Teniendo
        int numberA = 5;
        int numberB = 6;

        //When - Cuando
        int result = example.sumar(numberA, numberB); //Valor esperado 11

        //Then - Entonces
        assertEquals(11, result); //Evaluar un valor esperado con el actual
        assertNotNull(result); //Devuelve true o false
        assertInstanceOf(Integer.class, result);


    }

    @Test
    public void testCheckPositivo() {

        //Given - Teniendo
        int numberA = 3;

        //When - Cuando
        boolean result = example.checkPositivo(numberA);

        //When - entonces
        assertTrue(result);
    }

    @Test
    public void testCheckPoisitivoError() {
        //Given
        int number = -4;

        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });
    }

    @Test
    public void testContarLetrasA() {
        //Given
        String cadena = "probandotestunitarios";

        //When
        int result = example.contarLetrasA(cadena);

        //Then
        assertEquals(2, result);
        assertNotNull(result);
    }

    @Test
    public void testContieneElemento() {
        //Given
        List<String> countries = List.of("Colombia", "Perú", "México", "Brasil");
        String country = "Colombia";

        //When
        boolean result = this.example.contieneElemento(countries, country);

        //Then
        assertTrue(result);


    }

    @Test
    public void testRevertirCadena() {
        //Given
        String name = "fruta";

        //When
        String nameReverse = this.example.revertirCadena(name);

        //Then
        assertEquals("aturf", nameReverse);
    }


    @Test
    public void testFactorial() {
        //Given
        int number = 6;

        //When
        long result = this.example.factorial(number);

        //Then
        assertEquals(720, result);
    }

    @Test
    public void testFactorialError() {

        //Given
        int number = -2;

        //When -Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.factorial(number);
        });

    }

    @Test
    public void testEsPrimoMayorACuatro() {
        //Given
        int number = 7;

        //When
        boolean result = this.example.esPrimo(number);

        //Then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMenorAUno() {
        //Given
        int number = -5;

        //When
        boolean result = this.example.esPrimo(number);

        //Then
        assertFalse(result);

    }

    @Test
    public void testNoEsPrimo() {
        //Given
        int number = 9;

        //When
        boolean result = this.example.esPrimo(number);

        //Then
        assertFalse(result);

    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        ///When
        String result = this.example.mensajeConRetraso();

        //Then

        assertEquals("Listo después de retraso", result);
    }

    @Test
    public void testConvertirAString() {
        //Given
        List<Integer> numbers = List.of(5, 7, 8, 10, 11);

        //When
        List<String> result = this.example.convertirAString(numbers);

        //Then
        assertEquals(List.of("5", "7", "8", "10", "11"), result);

    }

    @Test
    public void testCalcularMedia() {
        //Given
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        //When
        Double result = this.example.calcularMedia(numbers);

        //Then
        assertEquals(6.0, result);
    }

    @Test
    public void testCalcularMediaNull() {
        //When
        List<Integer> numbers = null;

        //When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });
    }

    @Test
    public void testCalcularMediaEmptyl() {
        //When
        List<Integer> numbers = Collections.emptyList();
        //List<Integer> numbers = List.of();

        //When - Then
        assertThrows(IllegalArgumentException.class, () -> {
            this.example.calcularMedia(numbers);
        });

    }

    @Test
    public void testConvertirYUnirEnMayusculas(){
        //Given
        List<String> cadena = List.of("hola", "mundo", "java");

        //When
        String result = this.example.convertirYUnirEnMayusculas(cadena);

        //
        assertEquals("HOLA,MUNDO,JAVA", result);

    }


}