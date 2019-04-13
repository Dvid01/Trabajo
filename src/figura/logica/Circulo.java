package figura.logica;

public class Circulo extends Figura{
    
    public void calcularArea(){
        int radio = origen.calcularDistancia(fin);
        area = (int) (Math.PI*Math.pow(radio,2));
    }
    
    public void calcularPerimetro(){
        int radio = origen.calcularDistancia(fin);
        perimetro = (int) (Math.PI*2*radio);
    }
}
