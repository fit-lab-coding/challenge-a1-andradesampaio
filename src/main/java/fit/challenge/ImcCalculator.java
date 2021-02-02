package fit.challenge;

public class ImcCalculator {

    public static String calculate(double peso, double altura) {
        double massa = peso / Math.pow(altura, 2);

        if (massa < 18.5) {
            return "Magreza";
        } else if (massa < 24.9) {
            return "Normal";
        } else if (massa < 30) {
            return "Sobrepeso";
        }
        return "Obesidade";
    }
}
