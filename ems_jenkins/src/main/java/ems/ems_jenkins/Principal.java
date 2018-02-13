package ems.ems_jenkins;

public  class Principal {

    public static String maxLong(String s1, String s2){
        String longest;
        String shortest;
        int max_length = 0;
        int index = 0;
        String max_sub = "";
        
        if (s1.length() >= s2.length()) {
            longest = s1;
            shortest = s2;
        } else {
            longest = s2;
            shortest = s1;
        }
        
        int[][] mx = new int[2][shortest.length()];
        
        for (int j = 0; j < shortest.length(); j++) {
            if (longest.charAt(0) == shortest.charAt(j)) {
                mx[0][j] = 1; 
                max_length = 1; 
                index = j;
            } else 
                mx[0][j] = 0;
        } 
                    
        for (int i = 1; i < longest.length(); i++) {
            if (longest.charAt(i) == shortest.charAt(0)) 
                mx[i%2][0] = 1;
            else 
                mx[i%2][0] = 0;
            for (int j = 1; j < shortest.length(); j++) {
                if (longest.charAt(i) == shortest.charAt(j)) {
                    mx[i%2][j] = 1 + mx[(i-1)%2][j-1]; 
                } else {
                    mx[i%2][j] = 0;
                }
                if (max_length < mx[i%2][j]) {
                    max_length = mx[i%2][j]; 
                    index = j;
                }
            }
        }
        
        if (max_length == 0)
            max_sub = "";
        else { 
            max_sub = shortest.substring((index + 1) - max_length, index + 1);
        } 
        return max_sub;
    }

}
