import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String name : participant) {

            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {

            map.put(name, map.get(name) - 1);
        }

        for (String key : map.keySet()) {

            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
