package com.company;

public class Zdravic {

    //Vlastnosť
    public String text;

    /*metóda triedy zdravič, void znamená že metóda nevracia hodnotu,
    * v zátvorkách sa nachádzajú argumenty metódy*/
    public void pozdrav(String meno) {
        System.out.println(text + " " + meno);
    }
}
