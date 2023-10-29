import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Saya mengunjungi Museum di mana Saya melihat beberapa lukisan. Salah satu lukisan adalah 'Petunjuk'. Pada saat ini, saya bermain sepeda dijalan.";

        System.out.println(autocomplete(text, "Saya mengunjungi"));
        System.out.println(generateText("Saya bermain sepeda dijalan", 10));
    }

    public static String autocomplete(String text, String prefix) {
        String[] sentences = text.split("\\.");
        Map<String, Integer> frequencies = new HashMap<>();

        for (String sentence : sentences) {
            String[] words = sentence.split(" ");

            for (int i = 0; i < words.length; i++) {
                if (i > 0) {
                    String bigram = words[i - 1] + " " + words[i];
                    frequencies.put(bigram, frequencies.getOrDefault(bigram, 0) + 1);
                }
            }
        }

        String[] words = prefix.split(" ");
        String lastWord = words[words.length - 1];

        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
            String bigram = entry.getKey();
            String firstWord = bigram.split(" ")[0];

            if (firstWord.equals(lastWord) && entry.getValue() > maxFrequency) {
                mostFrequentWord = bigram;
                maxFrequency = entry.getValue();
            }
        }

        return mostFrequentWord;
    }

    public static String generateText(String seed, int length) {
        // Implement your text generation logic here.
        // You can use the provided 'seed' and 'length' parameters.
        return "Generated text goes here.";
    }
}
