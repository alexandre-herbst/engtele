package poo;

public class Principal {
    public static void main(String[] args) {
        System.out.println("TESTE");

        Contador c = new Contador();
        System.out.println("Valor atual:" + c.getValorAtual());

        c.incrementa();

        int i, j;

        i = 10;

        j = 2;

        int h = i + j;

        System.out.println(++h);
        System.out.println(i++);


        System.out.println("Valor atual: " + c.getValorAtual());

    }
}
