import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int opcja;
    int r1, r2, a, b, h, a1, a2;
    double p1, p2, p3, p4;
    double pi = Math.PI;

    System.out.println();
    System.out.println("Kalkulator");
    System.out.println();
    System.out.println("1 - Suma pól kół");
    System.out.println("2 - Pole prostokąta");
    System.out.println("3 - Pole trójkąta prostokątnego");
    System.out.println("4 - Suma pól kwadratów");
    System.out.print("Wybierz działanie: ");

    Scanner skaner = new Scanner(System.in);

    opcja = skaner.nextInt();

    switch (opcja){
      case 1:{
        //p1 = pi*r1^2 + pi*r2^2
        System.out.println();
        System.out.print("Podaj promień r1: ");
        r1 = skaner.nextInt();
        System.out.print("Podaj promień r2: ");
        r2 = skaner.nextInt();

        p1 = (pi*Math.pow(r1,2)) + (pi*Math.pow(r2,2));
        System.out.println("Wynik: " + p1);
        break;
      }
      case 2:{
        //p2 = a*b
        System.out.println();
        System.out.print("Podaj bok a: ");
        a = skaner.nextInt();
        System.out.print("Podaj bok b: ");
        b = skaner.nextInt();

        p2 = a*b;
        System.out.println("Wynik: " + p2);
        break;
      }
      case 3: {
        //p3 = (a*h)/2
        System.out.println();
        System.out.print("Podaj długość podstawy a: ");
        a = skaner.nextInt();
        System.out.print("Podaj wysokość h: ");
        h = skaner.nextInt();

        p3 = (a*h)/2.0;
        System.out.println("Wynik: "+p3);
        break;
      }
      case 4:{
        //p4 = a1^2 + a2^2
        System.out.println();
        System.out.print("Podaj bok a1: ");
        a1 = skaner.nextInt();
        System.out.print("Podaj bok a2: ");
        a2 = skaner.nextInt();

        p4 = Math.pow(a1,2) + Math.pow(a2,2);
        System.out.println("Wynik: " + p4);
        break;
      }
    } 
        
    skaner.close();
  }
}