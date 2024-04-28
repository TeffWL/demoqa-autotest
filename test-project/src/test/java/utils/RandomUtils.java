package utils;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {


public static void main(String[] args){
    System.out.println(getRandomString(10));

    System.out.println(getRandomInt(10,100));



    String[] names = {"a","b","c","d"};
    System.out.println(getRandomItemFromArray(names));

}

public static int getRandomInt(int min,int max){
    return ThreadLocalRandom.current().nextInt(min, max +1);
}


    public static  String getRandomString(int lenght){

        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(lenght);

        for(int i = 0; i < lenght; i++)
                sb.append(AB.charAt(rnd.nextInt(AB.length())));
            return sb.toString();
        }

    public static String getRandomItemFromArray(String[] values){

        int index = getRandomInt(0 ,values.length -1);
        return values[index];
    }
    }


