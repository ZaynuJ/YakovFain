package service;

public class WhileLoopDemo {


    public static void useWhileLoop() {

        String[] friends = new String[20];
        friends[0] = "Tom";
        friends[1] = "Toma";
        friends[5] = "Tomx";
        friends[8] = "Trm";
        friends[14] = "Jom";
        friends[19] = "Loma";

        int x = 0;
        while ( x < friends.length)
        {
            if (friends[x] == null)
            {   x++;
                continue;
            }

            System.out.println("I love " + friends[x]);
            x++;
        }

        System.out.println("The iteration is over");
    }


}
