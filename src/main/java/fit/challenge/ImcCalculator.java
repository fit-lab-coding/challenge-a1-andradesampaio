package fit.challenge;

public class ImcCalculator {
    public static String calculate(double peso, double altura)
    {
        double altura2 = Math.pow(altura, 2);
        double indice = peso / altura2;

        if (indice < 18.5) return "Magreza";
        if (indice < 24.9) return "Normal";
        if (indice < 30) return "Sobrepeso";
        return "Obesidade";
    }
}
