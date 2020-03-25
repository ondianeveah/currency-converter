package currency;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CurrencyConverter {
    public static void main(String[] args) {
        double uniCurrency, amount, usDollar, ausDollar, canDollar, singDollar,
                pound, code, euro, yen, ringgit, rupee, franc, renminbi;
        DecimalFormat f = new DecimalFormat("##.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, this is your currency converter!!");
        System.out.println("What currency would you like to convert?");
        System.out.println("1: Rupee \t2: usDollar \n3: Pound \t4: Euro \n: Yen \t6: Ringgit \n7: Franc \t8: Renminbi \n9: ausDollar \t10: canDollar \n11: singDollar \t12: uniCurrency");
        code = scanner.nextInt();
        System.out.println("How much money would you like to convert?");
        amount = scanner.nextFloat();

        // rupee Conversion
        if(code == 1){
            uniCurrency = amount / 1.00;
            System.out.println("Your " + amount + " Rupee is : " + f.format(uniCurrency) + " Universal Currency.");
            usDollar = amount / 2.00;
            System.out.println("Your " + amount + " Rupee is : " + f.format(usDollar) + " US Dollar.");
            pound = amount / 1.64;
            System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound.");
            euro = amount / 1.88;
            System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro.");
            yen = amount / 231.68;
            System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Japanese Yen.");
            ringgit = amount / 8.94;
            System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " Ringgit.");
            franc = amount / 2.02;
            System.out.println("Your " + amount + " Rupee is : " + f.format(franc) + " Swiss Franc.");
            renminbi = amount / 13.84;
            System.out.println("Your " + amount + " Rupee is : " + f.format(renminbi) + " Renminbi.");
            ausDollar = amount / 2.70;
            System.out.println("Your " + amount + " Rupee is : " + f.format(ausDollar) + " Australian Dollar.");
            canDollar = amount / 2.64;
            System.out.println("Your " + amount + " Rupee is : " + f.format(canDollar) + " Canadian Dollar.");
            singDollar = amount / 2.86;
            System.out.println("Your " + amount + " Rupee is : " + f.format(singDollar) + " Singapore Dollar.");
            //Dollar conversion
        } else if( code == 2){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " US Dollar is : " + f.format(uniCurrency) + " Universal Currency.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " US Dollar is : " + f.format(rupee) + " Rupee.");
            euro = amount * 1.88;
            System.out.println("Your " + amount + " US Dollar is : " + f.format(euro) + " Euro.");
            pound = amount * 1.64;
            System.out.println("Your " + amount + " US dollar is : " + f.format(pound) + " Pound.");
            ausDollar = amount * 2.70;
            System.out.println("Your " + amount + " US dollar is : " + f.format(ausDollar) + " Australian Dollar.");
            canDollar = amount * 2.64;
            System.out.println("Your " + amount + " US dollar is : " + f.format(canDollar) + " Canadian Dollar.");
            singDollar = amount * 2.86;
            System.out.println("Your " + amount + " US dollar is : " + f.format(singDollar) + " Singapore Dollar.");
            franc = amount * 2.02;
            System.out.println("Your " + amount + " US dollar is : " + f.format(franc) + " Swiss Franc.");
            ringgit = amount * 8.94;
            System.out.println("Your " + amount + " US dollar is : " + f.format(ringgit) + " Ringgit.");
            yen = amount * 231.68;
            System.out.println("Your " + amount + " US dollar is : " + f.format(yen) + " Yen.");
            renminbi = amount * 13.84;
            System.out.println("Your " + amount + " US dollar is : " + f.format(renminbi) + " Renminbi.");
            // pound conversion
        }else if(code == 3){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " Pound is : " + f.format(uniCurrency) + " Universal Currency.");
            usDollar = amount * 2.00;
            System.out.println("Your " + amount + " Pound is : " + f.format(usDollar) + " US Dollar.");
            euro = amount * 1.88;
            System.out.println("Your " + amount + " Pound is : " + f.format(euro) + " Euro.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " Pound is : " + f.format(rupee) + " Rupee.");
            ausDollar = amount * 2.70;
            System.out.println("Your " + amount + " Pound is : " + f.format(ausDollar) + " Australian Dollar.");
            canDollar = amount * 2.64;
            System.out.println("Your " + amount + " Pound is : " + f.format(canDollar) + " Canadian Dollar.");
            singDollar = amount * 2.86;
            System.out.println("Your " + amount + " Pound is : " + f.format(singDollar) + " Singapore Dollar.");
            franc = amount * 2.02;
            System.out.println("Your " + amount + " Pound is : " + f.format(franc) + " Swiss Franc.");
            ringgit = amount * 8.94;
            System.out.println("Your " + amount + " Pound is : " + f.format(ringgit) + " Ringgit.");
            yen = amount * 231.68;
            System.out.println("Your " + amount + " Pound is : " + f.format(yen) + " Yen.");
            renminbi = amount * 13.84;
            System.out.println("Your " + amount + " Pound is : " + f.format(renminbi) + " Renminbi.");
            // euro conversion
        }else if (code == 4){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " Euro is : " + f.format(uniCurrency) + " Universal Currency.");
            pound = amount * 1.64;
            System.out.println("Your " + amount + " Euro is : " + f.format(pound) + " Pound.");
            usDollar = amount * 2.00;
            System.out.println("Your " + amount + " Euro is : " + f.format(usDollar) + " US Dollar.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " Euro is : " + f.format(rupee) + " Rupee.");
            ausDollar = amount * 2.70;
            System.out.println("Your " + amount + " Euro is : " + f.format(ausDollar) + " Australian Dollar.");
            canDollar = amount * 2.64;
            System.out.println("Your " + amount + " Euro is : " + f.format(canDollar) + " Canadian Dollar.");
            singDollar = amount * 2.86;
            System.out.println("Your " + amount + " Euro is : " + f.format(singDollar) + " Singapore Dollar.");
            franc = amount * 2.02;
            System.out.println("Your " + amount + " Euro is : " + f.format(franc) + " Swiss Franc.");
            ringgit = amount * 8.94;
            System.out.println("Your " + amount + " Euro is : " + f.format(ringgit) + " Ringgit.");
            yen = amount * 231.68;
            System.out.println("Your " + amount + " Euro is : " + f.format(yen) + " Yen.");
            renminbi = amount * 13.84;
            System.out.println("Your " + amount + " Euro is : " + f.format(renminbi) + " Renminbi.");
            //yen conversion
        }else if(code == 5){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " Yen is : " + f.format(uniCurrency) + " Universal Currency.");
            pound = amount * 1.64;
            System.out.println("Your " + amount + " Yen is : " + f.format(pound) + " Pound.");
            usDollar = amount * 2.00;
            System.out.println("Your " + amount + " Yen is : " + f.format(usDollar) + " US Dollar.");
            euro = amount * 1.88;
            System.out.println("Your " + amount + " Yen is : " + f.format(euro) + " Euro.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " Yen is : " + f.format(rupee) + " Rupees.");
            ausDollar = amount * 2.70;
            System.out.println("Your " + amount + " Yen is : " + f.format(ausDollar) + " Australian Dollar.");
            canDollar = amount * 2.64;
            System.out.println("Your " + amount + " Yen is : " + f.format(canDollar) + " Canadian Dollar.");
            singDollar = amount * 2.86;
            System.out.println("Your " + amount + " Yen is : " + f.format(singDollar) + " Singapore Dollar.");
            franc = amount * 2.02;
            System.out.println("Your " + amount + " Yen is : " + f.format(franc) + " Swiss Franc.");
            ringgit = amount * 8.94;
            System.out.println("Your " + amount + " Yen is : " + f.format(ringgit) + " Ringgit.");
            renminbi = amount * 13.84;
            System.out.println("Your " + amount + " Yen is : " + f.format(renminbi) + " Renminbi.");
            // ringgit
        }else if(code == 6){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(uniCurrency) + " Universal Currency.");
            pound = amount * 1.64;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(pound) + " Pound.");
            usDollar = amount * 2.00;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(usDollar) + " US Dollar.");
            euro = amount * 1.88;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(euro) + " Euro.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(rupee) + " Rupee.");
            ausDollar = amount * 2.70;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(ausDollar) + " Australian Dollar.");
            canDollar = amount * 2.64;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(canDollar) + " Canadian Dollar.");
            singDollar = amount * 2.86;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(singDollar) + " Singapore Dollar.");
            franc = amount * 2.02;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(franc) + " Swiss Franc.");
            yen = amount * 231.68;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(yen) + " Yen.");
            renminbi = amount * 13.84;
            System.out.println("Your " + amount + " Ringgit is : " + f.format(renminbi) + " Renminbi.");
            //franc
        } else if(code == 7){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " Franc is : " + f.format(uniCurrency) + " Universal Currency.");
            pound = amount * 1.64;
            System.out.println("Your " + amount + " Franc is : " + f.format(pound) + " Pound.");
            usDollar = amount * 2.00;
            System.out.println("Your " + amount + " Franc is : " + f.format(usDollar) + " US Dollar.");
            euro = amount * 1.88;
            System.out.println("Your " + amount + " Franc is : " + f.format(euro) + " Euro.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " Franc is : " + f.format(rupee) + " Rupee.");
            ausDollar = amount * 2.70;
            System.out.println("Your " + amount + " Franc is : " + f.format(ausDollar) + " Australian Dollar.");
            canDollar = amount * 2.64;
            System.out.println("Your " + amount + " Franc is : " + f.format(canDollar) + " Canadian Dollar.");
            singDollar = amount * 2.86;
            System.out.println("Your " + amount + " Franc is : " + f.format(singDollar) + " Singapore Dollar.");
            ringgit = amount * 8.94;
            System.out.println("Your " + amount + " Franc is : " + f.format(ringgit) + " Ringgit.");
            yen = amount * 231.68;
            System.out.println("Your " + amount + " Franc is : " + f.format(yen) + " Yen.");
            renminbi = amount * 13.84;
            System.out.println("Your " + amount + " Franc is : " + f.format(renminbi) + " Renminbi.");
            //Renminbi
        }else if (code == 8){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(uniCurrency) + " Universal Currency.");
            pound = amount * 1.64;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(pound) + " Pound.");
            usDollar = amount * 2.00;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(usDollar) + " US Dollar.");
            euro = amount * 1.88;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(euro) + " Euro.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(rupee) + " Rupee.");
            ausDollar = amount * 2.70;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(ausDollar) + " Australian Dollar.");
            canDollar = amount * 2.64;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(canDollar) + " Canadian Dollar.");
            singDollar = amount * 2.86;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(singDollar) + " Singapore Dollar.");
            ringgit = amount * 8.94;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(ringgit) + " Ringgit.");
            yen = amount * 231.68;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(yen) + " Yen.");
            franc = amount * 2.02;
            System.out.println("Your " + amount + " Renminbi is : " + f.format(franc) + " Swiss Franc.");
            //ausDollar
        }else if (code == 9){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " Aus dollar is : " + f.format(uniCurrency) + " Universal Currency.");
            pound = amount * 1.64;
            System.out.println("Your " + amount + " Aus dollar is : " + f.format(pound) + " Pound.");
            usDollar = amount * 2.00;
            System.out.println("Your " + amount + " aus dollar is : " + f.format(usDollar) + " US Dollar.");
            euro = amount * 1.88;
            System.out.println("Your " + amount + " aus dollar is : " + f.format(euro) + " Euro.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " aus dollar is : " + f.format(rupee) + " Rupee.");
            renminbi = amount * 13.84;
            System.out.println("Your " + amount + " aus dollar is : " + f.format(renminbi) + " Renminbi.");
            canDollar = amount * 2.64;
            System.out.println("Your " + amount + " aus dollar is : " + f.format(canDollar) + " Canadian Dollar.");
            singDollar = amount * 2.86;
            System.out.println("Your " + amount + " aus dollar is : " + f.format(singDollar) + " Singapore Dollar.");
            ringgit = amount * 8.94;
            System.out.println("Your " + amount + " aus dollar is : " + f.format(ringgit) + " Ringgit.");
            yen = amount * 231.68;
            System.out.println("Your " + amount + " aus dollar is : " + f.format(yen) + " Yen.");
            franc = amount * 2.02;
            System.out.println("Your " + amount + " aus dollar is : " + f.format(franc) + " Swiss Franc.");
            //canDollar
        }else if(code == 10){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(uniCurrency) + " Universal Currency.");
            pound = amount * 1.64;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(pound) + " Pound.");
            usDollar = amount * 2.00;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(usDollar) + " US Dollar.");
            euro = amount * 1.88;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(euro) + " Euro.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(rupee) + " Rupee.");
            renminbi = amount * 13.84;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(renminbi) + " Renminbi.");
            ausDollar = amount * 2.70;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(ausDollar) + " Australian Dollar.");
            singDollar = amount * 2.86;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(singDollar) + " Singapore Dollar.");
            ringgit = amount * 8.94;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(ringgit) + " Ringgit.");
            yen = amount * 231.68;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(yen) + " Yen.");
            franc = amount * 2.02;
            System.out.println("Your " + amount + " Can dollar is : " + f.format(franc) + " Swiss Franc.");
            //singDollar
        }else if(code == 11){
            uniCurrency = amount * 1.00;
            System.out.println("Your " + amount + " Sing dollar is : " + f.format(uniCurrency) + " Universal Currency.");
            pound = amount * 1.64;
            System.out.println("Your " + amount + " Sing dollar is : " + f.format(pound) + " Pound.");
            usDollar = amount * 2.00;
            System.out.println("Your " + amount + " sing dollar is : " + f.format(usDollar) + " US Dollar.");
            euro = amount * 1.88;
            System.out.println("Your " + amount + " sing dollar is : " + f.format(euro) + " Euro.");
            rupee = amount * 136.64;
            System.out.println("Your " + amount + " sing dollar is : " + f.format(rupee) + " Rupee.");
            renminbi = amount * 13.84;
            System.out.println("Your " + amount + " sing dollar is : " + f.format(renminbi) + " Renminbi.");
            ausDollar = amount * 2.70;
            System.out.println("Your " + amount + " sing dollar is : " + f.format(ausDollar) + " Australian Dollar.");
            canDollar = amount * 2.64;
            System.out.println("Your " + amount + " sing dollar is : " + f.format(canDollar) + " Canadian Dollar.");
            ringgit = amount * 8.94;
            System.out.println("Your " + amount + " sing dollar is : " + f.format(ringgit) + " Ringgit.");
            yen = amount * 231.68;
            System.out.println("Your " + amount + " sing dollar is : " + f.format(yen) + " Yen.");
            franc = amount * 2.02;
            System.out.println("Your " + amount + " sing dollar is : " + f.format(franc) + " Swiss Franc.");
        }else{
            System.out.println("Incorrect input.");
        }
        System.out.println("Thank you for choosing this currency converter!");
    }
}
