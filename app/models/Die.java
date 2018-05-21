package models;


import java.util.Random;

public class Die
{
    private int size;
    //private int howMany;
    private int value;

    public Die(int size)
    {
        this.size = size;
        //this.howMany = howMany;
        roll();
    }

    public void roll()
    {
        Random random = new Random();
         value = random.nextInt(size + 1);

    }

    public int getValue()
    {
        return value;
    }
}
