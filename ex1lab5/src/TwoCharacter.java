import java.util.Scanner;
public class TwoCharacter {
    public static void main(String[] args) {
        Personaj one=new Personaj();
        one = getData(one);
        System.out.println("Detaliile Personajului");
        System.out.println(one.getCuloare() + " " +one.getName() + " " + one.getOchi());
    }

    public static Personaj getData( Personaj mn)
    {
        int ochi;
        String Name,Culoare;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Introdu numele Personajului");
        Name=keyboard.nextLine();
        System.out.println("Introdu culoarea ochilor");
        Culoare=keyboard.nextLine();
        System.out.println("Introdu numarul de maini");
        ochi=keyboard.nextInt();
        mn.setName(Name);
        mn.getCuloare();
        mn.setMaini(ochi);
        return mn;
    }


}


