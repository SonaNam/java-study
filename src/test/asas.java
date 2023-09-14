package test;


public class asas {
    public static void main(String[] args) {

        String a = "Hello World";

        String result = "";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            }else{
                result += Character.toLowerCase(c);
            }

        }
        System.out.println(result);
        }
    }

