abstract class Formato {

    String cor;

    abstract double area();
    public abstract String toString();

    public Formato(String cor)
    {
        System.out.println("Formato construtor é chamado");
        this.cor = cor;
    }

    public String getCor() { return cor; }
}
class Circulo extends Formato {
    double raio;

    public Circulo(String cor, double raio)
    {

        super(cor);
        System.out.println("Construtor circulo é chamado");
        this.raio = raio;
    }

    @Override double area()
    {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override public String toString()
    {
        return "Cor do circulo é " + super.getCor()
                + "e a área é : " + area();
    }
}
class Retangulo extends Formato {

    double comprimento;
    double largura;

    public Retangulo(String cor, double comprimento,
                     double largura)
    {
        super(cor);
        System.out.println("Construtor do retangulo é chamado");
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override double area() { return comprimento * largura; }

    @Override public String toString()
    {
        return "Cor do ratangulo é " + super.getCor()
                + "e a área é : " + area();
    }
}
public class Test {
    public static void main(String[] args)
    {
        Formato f1 = new Circulo("Vermelho", 2.2);
        Formato f2 = new Retangulo("Amarelo", 2, 4);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
