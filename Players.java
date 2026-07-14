
public class Players {
    String name;
    int mxHp;
    int mxAtk;
    int def;
    int mxHeal;
    int dodge; // might be a stretch


    // set up so i dont forget
    // min atk = 25 for everyone
    // min heal = 1
    // def will just reduce damage by a %

    // [base max Hp, base max atk, base def, base max heal]
    // [    100    ,     80      ,   40%    ,      25      ]
    // premade classes

    // might be most op
    // great def; good health; mid atk; bad heal
    Object[] tank = [#,#,#,#];

    // cant heal others lol
    // good heal; mid atk & hp; bad def
    Object[] healer = [#,#,#,#];

    // basically rogue
    // good atk; mid hp & def; bad heal
    Object[] attacker = [110,#,#,#];

    // maybe glasscannon?
    // best atk; worse everything else;
    Object[] d = [#,#,#,#];

    // all around class?
    // mid everything
    Object[] jack = [#,#,#,#];

    // secret one js for me
    Object[] z = [250,75,20,50];
}

/*
import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    static Scanner scan = new Scanner(System.in);
    static int secretCode = 0;

    System.out.println("Input code.");
    RecursionTest(scan.nextInt())


  }

  public static void RecursionTest(a){
    if(a == secretCode){
      System.out.println("Access Granted");
    } else{
      System.out.println("DENIED. Try again");
      RecursionTest(scan.nextInt());
    }
  }
}
*/
