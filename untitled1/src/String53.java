public class String53{

    public static void main(String[] args) {
        final String[] punctuation = new String[]{".", "?", "!", "...", ",", ";", ":", "-", "(", ")", "\"", "\""};
        String text = "Быть или не быть? Вот в чем вопрос! Достойно ли смеяться...";

        int count = 0;
        for (var i : text.toCharArray()) {
            for (var j : punctuation) {
                if (String.valueOf(i).equals(j)) {
                    count++;
                }
            }
        }

        System.out.printf("В тексте %d знаков препинания", count);
    }
}
