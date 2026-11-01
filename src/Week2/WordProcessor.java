package Week2;

public class WordProcessor implements Counter {
    
    private String text = "";

    // Getter for text
    public String getText() {
        return text;
    }

    // Setter for text
    public String setText(String text) {
        this.text = text;
        return text;
    }

    @Override
    public int countWords(String sentence) {
        if (sentence == null) {
            sentence = text;
        }
        if (sentence.trim().isEmpty()) {
            return 0;
        }
        return sentence.trim().split("\\s+").length;
    }

    @Override
    public int countLetters(String sentence) {
        if (sentence == null) {
            sentence = text;
        }
        int letters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }

    @Override
    public int getLength(String sentence) {
        if (sentence == null) {
            sentence = text;
        }
        return sentence.length();
    }
}