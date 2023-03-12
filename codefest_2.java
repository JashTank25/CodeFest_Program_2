import java.util.*;
import java.lang.*;
import java.io.*;
public class codefest_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> total_hour = new ArrayList<Double>();
        ArrayList<Double> accent_qty  = new ArrayList<Double>();
        ArrayList<Double> regular_qty = new ArrayList<Double>();
        FileInputStream fc = new FileInputStream("ET_large.txt");
        Scanner sc1 = new Scanner(fc);
        String line = sc1.nextLine();
        Scanner sc2 = new Scanner(line);
        byte t = sc2.nextByte();
        for(int i=0; i<t; i++){

//            System.out.println(" town " + i);
            double wall = 0;
            double accent_wall =0;
            double regular_wall=0;
            String line2 = sc1.nextLine();
            Scanner sc3 = new Scanner((line2));
            int n = sc3.nextInt();
            while (n--> 0){
                String  line3 = sc1.nextLine();

                Scanner sc4 = new Scanner(line3);
                sc4.useDelimiter(",");
                byte total_bed = sc4.nextByte();
                byte r = sc4.nextByte();
                wall += r * 3;
                byte s = sc4.nextByte();
                wall += s * 4;
                byte h = sc4.nextByte();
                wall += h * 6;
            }
            accent_wall = wall* 1/3;
            regular_wall = wall * 2/3;
            total_hour.add(i,accent_wall*2.5 + regular_wall*3.25);
//            System.out.println(total_hour.get(i));
            accent_qty.add(i,accent_wall*1.5);
//           System.out.println(accent_qty.get(i));
            regular_qty.add(i,regular_wall*2.25);
//            System.out.println(regular_qty.get(i));

        }

        for (int j=0; j<t; j++){
            System.out.println(total_hour.get(j) + "," + accent_qty.get(j) + "," + regular_qty.get(j) );
        }

    }
}
