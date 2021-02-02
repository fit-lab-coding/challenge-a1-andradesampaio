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
}
