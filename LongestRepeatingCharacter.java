public class LongestRepeatingCharacter {

    public int characterReplacement(String s, int k) {

        String stringToBeReplaced = s;
        int numberOfAllowedReplacements = k;

        int start = 0, end=0,  maxSizeOfStringWithAllowedReplacements = 0;
        char[] frequencyOfLetter = new char[26];
        int mostFrequentLetter = 0;

        for(end=0;end<stringToBeReplaced.length();end++){
            mostFrequentLetter = Math.max(mostFrequentLetter, ++frequencyOfLetter[ stringToBeReplaced.charAt(end) - 'A' ]) ;
            int lettersToChange = (end-start+1) - mostFrequentLetter;

            if(lettersToChange > numberOfAllowedReplacements ){
                frequencyOfLetter[ stringToBeReplaced.charAt(start) - 'A' ]--;
                start++;
            }
            maxSizeOfStringWithAllowedReplacements = Math.max(maxSizeOfStringWithAllowedReplacements,(end-start+1));
        }
        return maxSizeOfStringWithAllowedReplacements;
    }
}
