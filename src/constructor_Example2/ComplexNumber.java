package constructor_Example2;

//a+bi: a and b are real numbers ex. 5+4i

public class ComplexNumber {
    private double real;
    private double img;


    public ComplexNumber(){
        real = img = 0;
    }

    public ComplexNumber(double r){
        real = r;
        img = 0;
    }

    public ComplexNumber(double r, double i){
        real = r;
        img = i;
    }

    public void print() {
        System.out.println(real + " +i " + img);
    }

}
