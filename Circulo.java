public class Circulo {
    
    private double radio;
    private String color;
    private boolean relleno;

  
    public Circulo() {
        this.radio = 1.0;
        this.color = "rojo";
        this.relleno = false;
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.color = "rojo";
        this.relleno = false;
    }

    public Circulo(double radio, String color, boolean relleno) {
        this.radio = radio;
        this.color = color;
        this.relleno = relleno;
    }

   
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

   
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getDiametro() {
        return 2 * radio;
    }

    @Override
    public String toString() {
        return "Circulo[radio=" + radio + ", color=" + color + ", relleno=" + relleno + "]";
    }
}
