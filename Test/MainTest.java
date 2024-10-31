import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

class MainTest {

    @Test
    void sumar() {
        Assertions.assertEquals(12, Main.sumar(7,5));
    }

    @Test
    void restar() {
        Assertions.assertEquals(2, Main.restar(7,5));
    }

    @Test
    void multiplicar() {
        Assertions.assertEquals(35, Main.multiplicar(7,5));
    }

    @Test
    void testConValoresInvalidos() {
        Assertions.assertEquals("Error: División por cero", Main.dividir(10,0));
    }

    @Test
    void testConValoresValidos() {
        Assertions.assertEquals("2.0", Main.dividir(10,5));
    }

    @Test
    void testDividirConValoresValidos() {
        Assertions.assertEquals("2.0", Main.dividir(10,5));
    }

    @Test
    void escogerValorEntradaValida() {
        ByteArrayInputStream in = new //Sirve para leer matrices de entrada
                ByteArrayInputStream("6\n".getBytes());
        System.setIn(in); //Reasigna el flujo de entrada
        Assertions.assertEquals(6, Main.escogerValor()); //Establece condiciones en tu código
    }
    @Test
    void entradaInvalida() {
        ByteArrayInputStream in = new
                ByteArrayInputStream("s\n".getBytes());
        System.setIn(in);
        Assertions.assertEquals(1, Main.escogerValor());
    }
}