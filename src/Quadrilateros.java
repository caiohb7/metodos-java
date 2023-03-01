public class Quadrilateros {

    //Quadrado
    public static double calculaArea(double lado) {
        double area = Math.pow(lado, 2);
        return area;
    }

    //Retângulo
    public static double calculaArea(double lado1, double lado2) {
        double area = lado1 * lado2;
        return area;
    }

    //Trapézio
    public static double calculaArea(double baseMaior, double baseMenor, double altura){
        double area = (baseMaior + baseMenor) * altura / 2;
        return area;
    }
    
}