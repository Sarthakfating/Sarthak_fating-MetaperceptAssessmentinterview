package Com.sarthak;


	public class LongestWordFinder {
	    public static void main(String[] args) {
	        String input1 = "dummy text of the printing and typwsetting industry.";
	        String input2 = "it is a long-established fact that a reader will be distracted by the readable content of a page when looking at its layout. the point of using lorean ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using content here, making it look like readable english";

	        String longestWord1 = findLongestWord(input1);
	        String longestWord2 = findLongestWord(input2);

	        System.out.println("Longest word in input1: " + longestWord1);
	        System.out.println("Longest word in input2: " + longestWord2);
	    }

	    public static String findLongestWord(String input) {
	        String[] words = input.split("\\s+"); 

	        String longestWord = "";

	        for (String word : words) {
	           
	            String cleanedWord = word.replaceAll("[^a-zA-Z]", "");

	           
	            if (cleanedWord.length() > longestWord.length()) {
	                longestWord = cleanedWord;
	            }
	        }

	        return longestWord;
	    }
	}



