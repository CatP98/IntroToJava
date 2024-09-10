/* RegexReplacer.java */

class RegexReplacer{
    public static void main(String[] args){
        String[] sentences = {
            "Peter PipEr picked a peck of pickled peppers.",
            "Is this the real life? Is this just fantasy?",
            "Caught in a landslide, no escape from reality",
            "Open your eyes, look up to the skies and see"
        };

        String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        
        for (String sentence : sentences){
            String newSentence = sentence;

            for( String vowel : vowels){
                newSentence = newSentence.replaceAll(vowel, "#");
            }
            System.out.println(newSentence);
        }
    }
}