import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        //Daxil edilen reqemlerin ceminin tapilmasi. Iki usulla
        System.out.println("Cemi tapilacaq reqemleri daxil edin:");
//        var inp1 = sc.next();//Yalniz bir input-u oxuyur. Yeni, eger arasinda bosluq olan input daxil etsek, bosluga qeder olan hisseni goturecek
        var inp1 = sc.nextLine();
        var res = 0;
        for (int i = 0; i < inp1.length(); i++) {
            res += Integer.parseInt(String.valueOf(inp1.charAt(i)));
        }
        System.out.println("Cem1:" + res);
        res = 0;
        char[] arr = inp1.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            res += Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println("Cem2:" + res);

        var inp4 = Integer.parseInt(inp1);
        var addition = 0;
        var mod = 0;
        while (inp4 > 0) {
            mod = inp4 % 10;
            addition += mod;
            inp4 /= 10;
        }
        System.out.println("Cem3:" + addition);

        //Ucuncu deyisen istifade etmeden iki deyisenin qiymetlerinin bir-birile deyisdirilmesi
        System.out.println("a-ni daxil edin");
        var a = sc.nextInt();
        System.out.println("b-ni daxil edin");
        var b = sc.nextInt();
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("a:" + a + " b:" + b);

        //Ededin reqemleri sayinin tapilmasi
        System.out.println("Reqemlerin sayi:" + arr.length);

        //Daxil dilen sozun tersi ile duzunun eyni olmasinin yoxlanilmasi
        System.out.println("Sozu daxil edin");
        var inp2 = sc.nextLine();
        var reverse = "";
        for (int i = inp2.length() - 1; i >= 0; i--) {
            reverse += inp2.charAt(i);
        }
        var res1 = "";
        if (inp2.equals(reverse))
            res1 = "Eynidir";
        else
            res1 = "Ferqlidir";

        System.out.println(res1);

        System.out.println("Tekrar cap olunacaq herfi daxil edin:");
        var inp3 = sc.nextLine();
        System.out.println("Tekrarlanma sayini daxil edin:");
        var inpRepeat = sc.nextInt();
        var resRepeat = GetMethod1(inpRepeat, inp3.charAt(0), true);
        System.out.println(resRepeat);
    }

    public static String GetMethod1(int a, char c, boolean d) {
        var res = new StringBuilder();
        for (int i = 0; i < a; i++) {
            if (d) {
                if (res.isEmpty())
                    res.append(c);
                else
                    res.append((char) 13).append((char) 10).append(c);
            } else
                res.append(c);
        }

        return res.toString();
    }
}