package debugging;

public class Main {
    public static void main(String[] args) { //Java começa e termina no método main
        System.out.println("Iniciou o programa no método main.");
        a();
        System.out.println("Finalizou o programa no método main.");
    }

    static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c() {
        System.out.println("Entrou no método c.");
        Thread.dumpStack(); /*usado qnd vamos debuggar o código,
         imprime a stack trace de onde ele está (nesse caso, do método c)*/
        System.out.println("Finalizou o método c.");
    }
}
