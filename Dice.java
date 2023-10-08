import java.util.Random;
public class Dice
{
    public static void main(String[] args)
    {
        Random random=new Random();
        int dice1=random.nextInt(6)+1;
        int dice2=random.nextInt(6)+1;

        System.out.println(dice1);
        System.out.println(dice2);

        int totalSum=dice1+dice2;

        System.out.println("Total Sum is:"+totalSum);
    }
}