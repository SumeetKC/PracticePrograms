package org.programs.strings;

import java.sql.SQLOutput;

public class CommonPrefix {
    // Find the longest common prefix among a set of strings
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(horizontalScanningApproach(strs));
    }

    private static String horizontalScanningApproach(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
