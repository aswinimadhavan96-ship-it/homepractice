package DuplicateCharacters;
import java.util.HashSet;
public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!set.add(ch)) {
                duplicates.add(ch);
            }
        }

        for (char ch : duplicates) {
            System.out.println(ch);
        }
    }
}

    
