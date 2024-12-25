package org.programs.strings;

public class InsertCharacterAtCertainPosition {

    public static void main(String[] args) {

        String test = "LearningDSA";
        int[] pos = {1,4,5};
        String r1 = insertCharacter(test, pos);
        System.out.println(r1);

    }
    public static String insertCharacter(String data, int[] arr){
        String result = "";
        int j=0;
        for(int i=0; i<data.toCharArray().length;i++){
            if(j< arr.length && i == arr[j]){
                result += '*';
                j++;
            }
            result += data.charAt(i);
        }

        return result;
    }
}
