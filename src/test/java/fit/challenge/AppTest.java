package fit.challenge;

import fit.challenge.ImcCalculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Testes unitários para o "desafio"
 */
public class AppTest 
{
    /**
     * Vamos garantir a estrutura do projeto que queremos
     */
    @Test
    public void shouldHaveCalculateAsStaticMethodOfImcCalculatorClass()
    {
        String resultado = ImcCalculator.calculate(88, 1.77); //28.08
        Assert.assertEquals(resultado, "Sobrepeso");
    }

    // Vamos garantir os valores limitrofes (superior)

    @Test
    public void shouldCalculateMaxAtMagrezaLayer()
    {
        String resultado = ImcCalculator.calculate(57.92, 1.77);
        Assert.assertEquals(resultado, "Magreza");
    }

    @Test
    public void shouldCalculateMaxAtNormalLayer()
    {
        String resultado = ImcCalculator.calculate(77.97, 1.77);
        Assert.assertEquals(resultado, "Normal");
    }

    @Test
    public void shouldCalculateMaxAtSobrepesoLayer()
    {
        String resultado = ImcCalculator.calculate(93.98, 1.77);
        Assert.assertEquals(resultado, "Sobrepeso");
    }

    @Test
    public void shouldCalculateMaxAtObesidadeLayer()
    {
        String resultado = ImcCalculator.calculate(94.00, 1.77);
        Assert.assertEquals(resultado, "Obesidade");
    }
}
