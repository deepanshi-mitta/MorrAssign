package com.example.morrassignment;
import java.util.regex.Pattern;
public class Valiadation {
    boolean IsValid(String z)                                               //luhn validation
    {
        int[] Credit_number = new int[z.length()];
        for (int i = 0; i < z.length(); i++) {
            Credit_number[i] = Integer.parseInt(z.substring(i, i + 1));
            int temp = Credit_number[i];
            if (i % 2 == 0) {
                temp = temp * 2;
                if (temp > 9) {
                    temp = temp - 9;
                }
            }
            Credit_number[i] = temp;
        }

        int total = 0;
        for (int i = 0; i < z.length(); i++) {
            total += Credit_number[i];
        }

        if (total % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean type_validation(String k)
    {
        String American_Express = "^3[47][0-9]{13}$";
        String Discover = "^65[4-9][0-9]{13}|64[4-9][0-9]{13}|6011[0-9]{12}|(622(?:12[6-9]|1[3-9][0-9]|[2-8][0-9][0-9]|9[01][0-9]|92[0-5])[0-9]{10})$";
        String MasterCard = "^(5[1-5][0-9]{14}|2(22[1-9][0-9]{12}|2[3-9][0-9]{13}|[3-6][0-9]{14}|7[0-1][0-9]{13}|720[0-9]{12}))$";
        String VisaCard = "^4[0-9]{12}(?:[0-9]{3})?$";

        boolean r1 = Pattern.matches(American_Express, k);
        boolean r2 = Pattern.matches(Discover, k);
        boolean r3 = Pattern.matches(MasterCard, k);
        boolean r4 = Pattern.matches(VisaCard, k);
        if (r1 || r2 || r3 || r4) {
            return true;
        } else {
            return false;

        }
    }
    boolean cvv_validation(String t)
    {
        String cvv_regex = "^[0-9]{3,4}$";
        boolean r1=Pattern.matches(cvv_regex,t);
        if(r1)
        {
            return true;
        }
        else
            return false;

    }
    boolean date_validation(String q)
    {
//        String date_regex = "^(0[1-9]|1[0-2])(/)([0-9]{2})$";
//        String date_regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        String date_regex = "^(0[1-9]|1[0-2]|[1-9])\\/(1[4-9]|[2-9][0-9]|20[1-9][1-9])$";
        boolean r1= Pattern.matches(date_regex,q);
        if(r1)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    boolean Name_validation(String j)       //
    {
        String name_regex="^[A-Z][a-z]*$";
        boolean r1=Pattern.matches(name_regex,j);
        if(r1)
        {
            return true;


        }
        else
        {
            return false;
        }
    }
}
