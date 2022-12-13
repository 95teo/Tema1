import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercitiul1();
        exercitiul2();
        exercitiul2rev();
        System.out.println (exercitiul3(24));
        exercitiul4();
        myVariables();
        exercitiul6();
        exercitiul7();
        exercitiul8();
    }

    static void exercitiul1 () {
        System.out.println("Imi place Java");
    }

    static void exercitiul2 (){
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
    }

    public static void afiseazaCursul() {
        System.out.println("Cursul acesta este foarte fain!");

    }

    public static void exercitiul2rev() {
        afiseazaCursul();
        afiseazaCursul();
        afiseazaCursul();
        afiseazaCursul();
        afiseazaCursul();
        afiseazaCursul();
    }

    static int exercitiul3 (int ana){
        int varstaFrate=ana-6;
        return varstaFrate;
    }

    static void exercitiul4(){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Scrieti o propozitie de la tastatura: ");
        String tastatura=keyboard.nextLine();
        System.out.println("Propozitia scrisa de la tastatura este: "+tastatura);

    }

    static void myVariables(){
        int numarIntreg= 9;
        System.out.println("Numarul intreg este:" +numarIntreg);
        String text="exercitiul 5";
        System.out.println("Textul afisat este:" +text);
        boolean variabila= true;
        System.out.println("Variabila afisata este:" +variabila);
    }

    static void exercitiul6(){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter primul nr. intreg: ");
        int primulNumar= keyboard.nextInt();
        System.out.println("Enter al doilea nr. intreg: ");
        int aldoileaNumar= keyboard.nextInt();
    }


    static void exercitiul7(){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Introduceti un numar intreg: ");
        int numardelatastatura= keyboard.nextInt();

        int suma=numardelatastatura+5;
        System.out.println("Suma cu 5 este:"+suma);

        double  scadere=numardelatastatura-12.3;
        System.out.println("Scaderea cu 12.3 este:"+scadere);

        double inmultire=numardelatastatura*-3.2;
        System.out.println("Inmultirea cu -3.2 este:"+inmultire);

        double impartire=numardelatastatura/4;
        System.out.println("Impartirea cu 4 este:"+impartire);

        int modul=numardelatastatura%6;
        System.out.println(("Modulul cu 6 este:"+modul));

    }
    public static void exercitiul8(){
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }

}

