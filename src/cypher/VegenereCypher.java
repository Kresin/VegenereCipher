package cypher;

public class VegenereCypher {

    public String generateKey(String text, String key) {
        StringBuilder keyBuilder = new StringBuilder(key);
        for (int i = 0; ; i++) {
            if (text.length() == i) {
                i = 0;
            }
            if (keyBuilder.length() == text.length()) {
                break;
            }
            if ((keyBuilder.charAt(i) != ' ')) {
                keyBuilder.append(keyBuilder.charAt(i));
            } else {
                keyBuilder.append(" ");
            }
        }
        key = keyBuilder.toString();
        return key;
    }

    public String cypher(String text, String key) {
        StringBuilder cypherText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                cypherText.append(" ");
            } else {
                int x = (text.charAt(i) + key.charAt(i)) % 26;
                x += 'A';
                cypherText.append((char) (x));
            }
        }
        return cypherText.toString();
    }

    public String decrypt(String cypherText, String key) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < cypherText.length() && i < key.length(); i++) {
            if (cypherText.charAt(i) == ' ') {
                decryptedText.append(" ");
            } else {
                int x = (cypherText.charAt(i) - key.charAt(i) + 26) % 26;
                x += 'A';
                decryptedText.append((char) (x));
            }
        }
        return decryptedText.toString();
    }

}
