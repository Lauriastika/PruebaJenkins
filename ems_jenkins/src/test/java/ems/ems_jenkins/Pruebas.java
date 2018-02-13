package ems.ems_jenkins;

public class Pruebas {
    private static String[] s={"ACATCGAATTC", "AGAATC", "ATTCAGGACC", "ACCAATTCACCG","AATTCCGG","ATCCGGATT","CCATCGAAGG"};
    private static String[][] resul={
            {"ACATCGAATTC", "GAAT", "ATTC", "AATTC", "AATTC", "ATC", "CATCGAA" },
            {"GAAT", "AGAATC", "AG", "AAT", "AAT", "ATC", "GAA"},
            {"ATTC", "AT", "ATTCAGGACC", "ATTCA", "ATTC", "ATT", "AGG"},
            {"AATTC", "AAT", "ATTCA", "ACCAATTCACCG", "AATTC", "ATT", "CCA"},
            {"AATTC", "AAT", "ATTC", "AATTC", "AATTCCGG", "TCCGG", "AA"},
            {"ATC", "ATC", "GGA", "CCG", "TCCGG", "ATCCGGATT", "ATC"},
            {"CATCGAA", "ATC", "AGG", "CCA", "CC", "ATC", "CCATCGAAGG"}};

    public static void test(){
        for (int i=0;i<s.length;i++) {
            for (int j = 0; j < s.length; j++) {
                if (Principal.maxLong(s[i], s[j]).compareTo(resul[i][j])==0)
                    System.out.println("s1:"+s[i] + "  s2:" + s[j] + "  subStringMax:" + resul[i][j] + "   " + "ok");
                else
                    System.out.println("s1:"+s[i] + "  s2:" + s[j] + "  subStringMax:" + resul[i][j] + " output:" + Principal.maxLong(s[i], s[j]) + "   " + "¿FALLO?");
            }
        }
    }

    public static void main(String[] args){
        test();
        /*String str1 = "BBBBBXAAAAAAF";
        String str2 = "BBBBBXAAAAAAX";
        String res = Principal.maxLong(str1, str2);
        //String trim = str.substring(0,6);
        System.out.println(str2 + " " + str1 + " " + res);*/
    }

}
