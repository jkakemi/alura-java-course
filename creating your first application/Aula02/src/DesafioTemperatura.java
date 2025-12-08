public class DesafioTemperatura {
    public static void main(String[] args){
        double celsius = 30.4;
        double formula = (celsius * 1.8)+32;
        String msg = String.format("%f celsius = %f fahrenheit", celsius, formula);
        System.out.println(msg);

        int tempInteira = (int) formula;
        System.out.println(tempInteira);
    }
}
