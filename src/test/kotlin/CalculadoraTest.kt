import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    @Test
    fun adicaoTest() {
    assertEquals(4.0, Calculadora.adicao(2.0, 2.0))
    }
    @Test
    fun subtracaoTest() {
        assertEquals(1.0, Calculadora.subtracao(3.0, 2.0))
    }
    @Test
    fun divisaoTest() {
        assertEquals(2.0, Calculadora.divisao(4.0, 2.0))
    }
    @Test
    fun multiplicacaoTest() {
        assertEquals(10.0, Calculadora.multiplicacao(5.0, 2.0))
    }
}