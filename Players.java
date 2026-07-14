
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
    // [    100    ,     50      ,   0%    ,      25      ]
    // premade classes

    // might be most op
    // great def; good health; mid atk; bad heal
    Object[] tank = [];

    // cant heal others lol
    // good heal; mid atk & hp; bad def
    Object[] healer = [];

    // basically rogue
    // good atk; mid atk & def; bad heal
    Object[] attacker = [];

    // maybe glasscannon?
    // best atk; worse everything else;
    Object[] d = [];

    // all around class?
    // mid everything
    Object[] jack = [];

    // secret one js for me
    Object[] z = [];
}

