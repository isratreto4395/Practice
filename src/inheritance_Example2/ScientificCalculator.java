package inheritance_Example2;

public class ScientificCalculator extends BasicCalculator {

    public double sin(int deg) {
        double rad = deg * 3.14159/180;
        return Math.sin(rad);
    }
}
