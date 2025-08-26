package app;

public class Hello {
    public static void main(String[] args) {
        //System.out.println("Olá Mundo!!");
        Genero g = new Genero(1, "Aventura");

        Genero g2 = new Genero(0, ""); //Referência do objeto

        System.out.println(g.getNome());
        System.out.println(g2.getId());
    }
}

