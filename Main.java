import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array={15,12,788,1,-1,-778,2,0};
        Scanner scan= new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int number = scan.nextInt();
        int minTemp=Integer.MIN_VALUE,minMaxTemp=0;
        int maxTemp=Integer.MAX_VALUE,maxMinTemp=0;
        int distance;
        for (int i=0;i<array.length;i++){
            distance=array[i]-number;
            if (distance>0 && distance<maxTemp)
            {
            maxTemp=distance;
            maxMinTemp=array[i];
            }
            if (distance<0 && distance>minTemp)
            {
                minTemp=distance;
                minMaxTemp=array[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+minMaxTemp);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+maxMinTemp);

    }
}
