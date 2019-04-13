
package figura.logica;

public class Elipse extends Figura{
    public void calcularArea(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int radiomayor = temp.calcularDistancia(fin);
        int radiomenor = origen.calcularDistancia(temp);
        area = (int) Math.PI*radiomayor*radiomenor; 
    }
    
    public void calcularPerimetro(){
        Punto temp = new Punto();
        temp.setX(origen.getX());
        temp.setY(fin.getY());
        int radiomayor = temp.calcularDistancia(fin);
        int radiomenor = origen.calcularDistancia(temp);
        perimetro = (int) ((2*Math.PI)*Math.sqrt((Math.pow(radiomayor,2)+Math.pow(radiomenor,2))/2)); 
    }
}
