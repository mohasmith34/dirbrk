package com.example.dzdconverter;

public class Methods {

    static String currencyfunc(String a, String b, String e){
        double c = Double.parseDouble(e);
        double d = 0;
       if(a.equals("DZD")) {
           
           switch (b){
               case "USD" :
                     d = c*0.0074;
                   break;

               case "EUR" :
                    d = c*0.0069;
                   break;

               case "GPB" :
                    d = c*0.0059;
                   break;

               case "AED" :
                    d = c*0.027;
                   break;

               case "CNY" :
                    d = c*0.054;
                   break;
           }
       }else if(a.equals("MAD")) {
           switch (b){
               case "USD" :
                   d = c*0.100;
                   break;

               case "EUR" :
                   d = c*0.092;
                   break;

               case "GPB" :
                   d = c*0.079;
                   break;

               case "AED" :
                   d = c*0.37;
                   break;

               case "CNY" :
                   d = c*0.72;
                   break;
           }
       }else if(a.equals("TND")) {
           switch (b){
               case "USD" :
                   d = c*0.32;
                   break;

               case "EUR" :
                   d = c*0.30;
                   break;

               case "GPB" :
                   d = c*0.25;
                   break;

               case "AED" :
                   d = c*1.18;
                   break;

               case "CNY" :
                   d = c*2.30;
                   break;
           }
       }
       String f = String.valueOf(d);
       return f;
    }


    static String cryptofunc(String a, String b, String e){
        double c = Double.parseDouble(e);
        double d = 0;
        if(a.equals("DZD")) {

            switch (b){
                case "BTC" :
                    d = c*0.00000015;
                    break;

                case "ETH" :
                    d = c*0.0000025;
                    break;

                case "USDT" :
                    d = c*0.0074;
                    break;

                case "LTC" :
                    d = c*0.00011;
                    break;

                case "SOL" :
                    d = c*0.000073;
                    break;
            }
        }else if(a.equals("MAD")) {
            switch (b){
                case "BTC" :
                    d = c*0.0000019;
                    break;

                case "ETH" :
                    d = c*0.000034;
                    break;

                case "USDT" :
                    d = c*0.100;
                    break;

                case "LTC" :
                    d = c*0.0014;
                    break;

                case "SOL" :
                    d = c*0.000895 ;
                    break;
            }
        }else if(a.equals("TND")) {
            switch (b){
                case "BTC" :
                    d = c*0.0000063;
                    break;

                case "ETH" :
                    d = c*0.00011;
                    break;

                case "USDT" :
                    d = c*0.32;
                    break;

                case "LTC" :
                    d = c*0.0047;
                    break;

                case "SOL" :
                    d = c*0.00315;
                    break;
            }
        }
        String f = String.valueOf(d);
        return f;
    }





}
