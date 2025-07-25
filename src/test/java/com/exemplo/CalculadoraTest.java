package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    //CNT-01 COMPRAS ACIMA DE 100
    //__________________________________________________________________________________________
    //CT-01 - Frete com valor mínimo acima de 100 e distância mínima decimal
    @Test
    void Fretecomvalormínimoacimade100edistânciamínimadecimal() {
        Calculadora calculadora = new Calculadora(100.1, 0.1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //CT-02 - Frete com valor mínimo acima de 100 e distância mínima inteira
    @Test
    void Fretecomvalormínimoacimade100edistânciamínimainteira() {
        Calculadora calculadora = new Calculadora(100.1, 1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //CT-03 - Frete com valor mínimo acima de 100 e distância alta decimal
    @Test
    void Fretecomvalormínimoacimade100edistânciaaltadecimal() {
        Calculadora calculadora = new Calculadora(100.1, 200.5);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //CT-04 - Frete com valor mínimo acima de 100 e distância alta
    @Test
    void Fretecomvalormínimoacimade100edistânciaalta() {
        Calculadora calculadora = new Calculadora(100.1, 200.5);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //CT-05 - Frete com valor acima de 100 e distância mínima
    @Test
    void Fretecomvaloracimade100edistânciamínima() {
        Calculadora calculadora = new Calculadora(200.00, 0.1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //CT-06- Frete com valor acima de 100 e distância alta decimal
    @Test
    void Fretecomvaloracimade100edistânciaaltadecimal() {
        Calculadora calculadora = new Calculadora(200.00, 500.2);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //CT-07- Frete com valor acima de 100 e distância alta
    @Test
    void Fretecomvaloracimade100edistânciaalta() {
        Calculadora calculadora = new Calculadora(200.00, 10);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //CT-08 - Frete com valor alto e distância mínima decimal
    @Test
    void Fretecomvaloraltoedistânciamínimadecimal() {
        Calculadora calculadora = new Calculadora(10000.00, 0.1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //CT-09 - Frete com valor alto e distância alta decimal
    @Test
    void Fretecomvaloraltoedistânciaaltadecimal() {
        Calculadora calculadora = new Calculadora(100000.00, 200.6);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //CT-10 - Frete com valor alto e distância alta
    @Test
    void Fretecomvaloraltoedistânciaalta() {
        Calculadora calculadora = new Calculadora(100000.00, 50);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0, resultado);
    }
    //_________________________________________________________________________________________

    //CNT-02 COMPRAS ENTRE 70 E 100
    //delta = 0.01
    //__________________________________________________________________________________________
    //CT-01 - Frete com valor mínimo maior que 70 e distância mínima decimal
    @Test
    void Fretecomvalormínimomaiorque70edistânciamínimadecimal() {
        Calculadora calculadora = new Calculadora(70.1, 0.1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(5.02, resultado,0.01);
    }
    //CT-02 - Frete com valor mínimo maior que a 70 e distancia com valor inteiro
    @Test
    void retecomvalormínimomaiorquea70edistanciacomvalorinteiro() {
        Calculadora calculadora = new Calculadora(70.1, 50);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(17.5, resultado);
    }
    @Test
    //CT-03-Frete com valor igual a 70
    void Fretecomvaloriguala70() {
        Calculadora calculadora = new Calculadora(70, 2);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(5.50, resultado);
    }
    @Test
    //CT-04 - Frete com valor máximo menor que 100 e distância mínima decimal
    void Fretecomvalormáximomenorque100edistânciamínimadecimal() {
        Calculadora calculadora = new Calculadora(99.9, 0.1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(5.02, resultado,0.01);
    }
    @Test
    //CT-05 - Frete com valor igual a 100
    void Fretecomvaloriguala100() {
        Calculadora calculadora = new Calculadora(100.0, 20);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(10.0, resultado);
    }
    //CT-06 - Frete com valor máximo menor que  100 e distância alta decimal
    @Test
    void Fretecomvalormáximomenorque100edistânciaaltadecimal() {
        Calculadora calculadora = new Calculadora(99.9, 500.58);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(130.14, resultado,0.01);
    }
    //CT-07- Frete com valor acima de 70 e distância decimal
    @Test
    void Fretecomvaloracimade70edistânciadecimal() {
        Calculadora calculadora = new Calculadora(80.0, 0.5);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(5.12, resultado,0.01);
    }
    //CT-08- Frete com valor acima de 70 e distância com valor inteiro
    @Test
    void Fretecomvaloracimade70edistânciacomvalorinteiro() {
        Calculadora calculadora = new Calculadora(80, 5);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(6.25, resultado);
    }
    //CT-09 - Frete com valor acima de 70 e distância alta
    @Test
    void Fretecomvaloracimade70edistânciaalta() {
        Calculadora calculadora = new Calculadora(80, 500);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(130, resultado);
    }
    //CT-10 - Frete com valor máximo menor que 100 e distância alta
    @Test
    void Fretecomvalormáximomenorque100edistânciaalta() {
        Calculadora calculadora = new Calculadora(99.9, 500);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(130.00, resultado,0.01);
    }
    //_________________________________________________________________________________________

    //CNT-03 COMPRAS ABAIXO DE 70
    //delta =0.01
    //__________________________________________________________________________________________
    //CT-01 - Frete com valor máximo abaixo de 70 e distância mínima decimal
    @Test
    void Fretecomvalormáximoabaixode70edistânciamínimadecimal() {
        Calculadora calculadora = new Calculadora(69.99, 0.1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(10.05, resultado,0.01);
    }
    //CT-02 - Frete com valor abaixo de 70 e distância 1
    @Test
    void Fretecomvalorabaixode70edistância1() {
        Calculadora calculadora = new Calculadora(10, 1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(10.50, resultado,0.01);
    }
    //CT-03 - Frete com valor abaixo de 70 e distância mínima decimal
    @Test
    void Fretecomvalorabaixode70edistânciamínimadecimal() {
        Calculadora calculadora = new Calculadora(50, 0.1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(10.05, resultado,0.01);
    }
    //CT-04 - Frete com valor abaixo de 70 e distância alta decimal
    @Test
    void Fretecomvalorabaixode70edistânciaaltadecimal() {
        Calculadora calculadora = new Calculadora(50, 200.5);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(110.25, resultado,0.01);
    }
    //CT-05 - Frete com valor abaixo de 70 e distância alta com valor inteiro
    @Test
    void Fretecomvalorabaixode70edistânciaaltacomvalorinteiro() {
        Calculadora calculadora = new Calculadora(50, 769);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(394.50, resultado, 0.01);
    }
    //CT-06- Frete com valor baixo e distância alta
    @Test
    void Fretecomvalorbaixoedistânciaalta() {
        Calculadora calculadora = new Calculadora(1, 200);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(110.0, resultado,0.01);
    }
    //CT-07- Frete com valor mínimo e distancia mínima decimal
    @Test
    void Fretecomvalormínimoedistanciamínimadecimal() {
        Calculadora calculadora = new Calculadora(0.1, 0.1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(10.05, resultado,0.01);
    }
    //CT-08- Frete com valor mínimo e distancia alta
    @Test
    void Fretecomvalormínimoedistanciaalta() {
        Calculadora calculadora = new Calculadora(0.1, 300);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(160.00, resultado,0.01);
    }
    //CT-09- Frete com valor mínimo e distancia 1
    @Test
    void Fretecomvalormínimoedistancia1() {
        Calculadora calculadora = new Calculadora(0.1, 1);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(10.50, resultado,0.01);
    }
    //CT-10- Frete com valor mínimo e distancia alta decimal
    @Test
    void Fretecomvalormínimoedistanciaaltadecimal() {
        Calculadora calculadora = new Calculadora(0.1, 635.3);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(327.65, resultado,0.01);
    }
    //________________________________________________________________________________________
    //CNT-04 COMPRAS COM DISTÂNCIA IGUAL A 0
    //delta=0.01
    //________________________________________________________________________________________
    //CT-01 - Frete com valor igual a 100 e distancia 0
    @Test
    void Fretecomvaloriguala100edistancia0() {
        Calculadora calculadora = new Calculadora(100, 0.0);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(5.0, resultado,0.01);
    }
    //CT-02 - Frete com valor mínimo menor que 100 e distância 0
    @Test
    void Fretecomvalormínimomenorque100edistância0() {
        Calculadora calculadora = new Calculadora(99.9, 0.0);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(5.00, resultado,0.01);
    }
    //CT-03 - Frete com valor mínimo maior que 100 e distância 0
    @Test
    void Fretecomvalormínimomaiorque100edistância0() {
        Calculadora calculadora = new Calculadora(100.1, 0);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0.0, resultado,0.01);
    }
    //CT-04- Frete com valor acima de 100 e distância 0
    @Test
    void Fretecomvaloracimade100edistância0() {
        Calculadora calculadora = new Calculadora(200, 0.0);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0.0, resultado,0.01);
    }
    //CT-05-Frete com valor igual a 70 e distancia 0
    @Test
    void Fretecomvaloriguala70edistancia0() {
        Calculadora calculadora = new Calculadora(70, 0);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(5.00, resultado,0.01);
    }
    //CT-06 - Frete com valor mínimo menor que 70 e distancia 0
    @Test
    void Fretecomvalormínimomenorque70edistancia0() {
        Calculadora calculadora = new Calculadora(69.99, 0.0);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(10.00, resultado,0.01);
    }
    //CT-07 - Frete com valor mínimo maior que a 70 e distancia 0
    @Test
    void Fretecomvalormínimomaiorquea70edistancia0() {
        Calculadora calculadora = new Calculadora(70.1, 0.00);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(5.00, resultado,0.01);
    }
    //CT-08 - Frete com valor acima de 70, menor que 100 e distância 0
    @Test
    void Fretecomvaloracimade70menorque100edistância0() {
        Calculadora calculadora = new Calculadora(80, 0.00);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(5.00, resultado,0.01);
    }
    //CT-09 - Frete com valor alto e distância 0
    @Test
    void Fretecomvaloraltoedistância0() {
        Calculadora calculadora = new Calculadora(1000000, 0.00);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(0.00, resultado,0.01);
    }
    //CT-10 - Frete com valor baixo e distância 0
    @Test
    void Fretecomvalorbaixoedistância0() {
        Calculadora calculadora = new Calculadora(10, 0.00);
        double resultado = calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        assertEquals(10.00, resultado,0.01);
    }
    //____________________________________________________________________________________________
    //CNT-05 COMPRAS COM VALORES IGUAIS A 0 E DISTANCIA NEGATIVA
    //delta=0.01
    //___________________________________________________________________________________________
    //CT-01 - Frete com valor maior que 100 e distância negativa
    @Test
    void Fretecomvalormaiorque100edistâncianegativa() {
        Calculadora calculadora = new Calculadora(120, -2);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("A distância não pode ser negativa.", exception.getMessage());
    }
    //CT-02 - Frete com valor acima de 70, menor que 100 e distância negativa
    @Test
    void Fretecomvaloracimade70menorque100edistâncianegativa() {
        Calculadora calculadora = new Calculadora(80, -3);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("A distância não pode ser negativa.", exception.getMessage());
    }
    //CT-03 - Frete com valor abaixo de 70 e distância negativa
    @Test
    void Fretecomvalorabaixode70edistâncianegativa() {
        Calculadora calculadora = new Calculadora(80, -893);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("A distância não pode ser negativa.", exception.getMessage());
    }
    //CT-04- Frete com valor igual a 0 e distância alta
    @Test
    void Fretecomvaloriguala0edistânciaalta() {
        Calculadora calculadora = new Calculadora(0.00, 4789);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("O valor da compra deve ser maior que zero.", exception.getMessage());
    }
    //CT-05- Frete com valor igual a 0 e distância 0
    @Test
    void Fretecomvaloriguala0edistância0() {
        Calculadora calculadora = new Calculadora(0.00, 0.00);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("O valor da compra deve ser maior que zero.", exception.getMessage());
    }
    //CT-06 - Frete com valor negativo e distância negativa
    @Test
    void Fretecomvalornegativoedistâncianegativa() {
        Calculadora calculadora = new Calculadora(-56.00, -62.1);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("O valor da compra deve ser maior que zero.", exception.getMessage());
    }
    //CT-07- Frete com valor igual a 0 e distância negativa
    @Test
    void Fretecomvaloriguala0edistâncianegativa() {
        Calculadora calculadora = new Calculadora(0.00, -2321);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("O valor da compra deve ser maior que zero.", exception.getMessage());
    }
    //CT-08 - Frete com valor alto e distância negativa
    @Test
    void Fretecomvaloraltoedistâncianegativa() {
        Calculadora calculadora = new Calculadora(10000.00, -4);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("A distância não pode ser negativa.", exception.getMessage());
    }
    //CT-09 - Frete com valor negativo e distância 0
    @Test
    void Fretecomvalornegativoedistância0() {
        Calculadora calculadora = new Calculadora(-122624.00, 0.00);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("O valor da compra deve ser maior que zero.", exception.getMessage());
    }
    //CT-10 - Frete com valor negativo e distância alta
    @Test
    void Fretecomvalornegativoedistânciaalta() {
        Calculadora calculadora = new Calculadora(-122624.00, 0.00);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularFrete(calculadora.getValor_compra(), calculadora.getDistancia());
        });
        assertEquals("O valor da compra deve ser maior que zero.", exception.getMessage());
    }
}
