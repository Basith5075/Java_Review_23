class TemperatureFarheneit{
    double ft, ct;

    void set(double c){
        ct = c;
        System.out.println("Set ct : "+ct);
        convert();
    }
    void convert(){
        ft = (1.8)*ct + 32;
        System.out.println("convert ct : "+ct);
        System.out.println("convert ft : "+ft);
        dispResults();
    }

    void dispResults(){
        System.out.println("**** Temperature Conversion Application ****");
        System.out.println("Given temperature in Celsius is :"+ct);
        System.out.println("Converted temperature in Fahrenheit is :"+ft);
    }
}
class TemperaDemo{

    public static void main(String[] args) {
        TemperatureFarheneit tf = new TemperatureFarheneit();
        double c = Double.parseDouble(args[0]);
        tf.set(c);
    }
}