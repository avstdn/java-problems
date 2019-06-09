package codewars;

public class Merged_String_Checker {
    public boolean isMerge(String s, String part1, String part2){
        if(s.isEmpty() && part1.isEmpty() && part2.isEmpty()){
            return true;
        }
        if(!s.isEmpty()){
            if (!part1.isEmpty() && !part2.isEmpty()) {
                if(s.charAt(0) == part1.charAt(0) && part1.charAt(0) == part2.charAt(0)) {
                    return (isMerge(s.substring(1), part1.substring(1), part2) || isMerge(s.substring(1), part1, part2.substring(1)));
                } else if(s.charAt(0) == part1.charAt(0)) {
                    return isMerge(s.substring(1), part1.substring(1), part2);
                } if (s.charAt(0) == part2.charAt(0)){
                    return isMerge(s.substring(1), part1, part2.substring(1));
                }
            } else if (!part1.isEmpty() && s.charAt(0) == part1.charAt(0)) {
                return isMerge(s.substring(1), part1.substring(1), part2);
            } else if (!part2.isEmpty() && s.charAt(0) == part2.charAt(0)) {
                return isMerge(s.substring(1), part1, part2.substring(1));
            }
        }
        return false;
    }
}
// https://www.codewars.com/kata/54c9fcad28ec4c6e680011aa
