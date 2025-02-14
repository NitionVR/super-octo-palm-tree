public class AlternateCase {
    public String alternateCase(String s) {
        char[] chars = s.toCharArray();

        boolean makeUpperCase = true;

        for (int i = 0; i < chars.length; i++) {

            if (Character.isLetter(chars[i])) {
                chars[i] = makeUpperCase ?
                        Character.toUpperCase(chars[i]) :
                        Character.toLowerCase(chars[i]);

                makeUpperCase = !makeUpperCase;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        AlternateCase alternateCase = new AlternateCase();

        String test1 = "hello world!";
        String test2 = "abc123! xyz";
        String test3 = "1 Za^B8g@E2jH*kWl!MoPqXr7YvT1c$Fs3Ud9IwZ&yX0pLkV6sHqN^tB4rA+oZ%gFj";

        System.out.println(alternateCase.alternateCase(test1));
        System.out.println(alternateCase.alternateCase(test2));
        System.out.println(alternateCase.alternateCase(test3));
    }
}