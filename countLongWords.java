public static int LONG_WORD_LENGTH = 5;
public static String longestWord;

public static void countLongWords(List<String> words) {
   int n = 0;
   longestWord = "";
   for (String word: words) {
       if (word.length() > LONG_WORD_LENGTH) ++n;
       if (word.length() > longestWord.length()) longestWord = word;
   }
   System.out.println(n);
}

// Hints for code review:
// 1. Avoid global variables. In Java, a global variable is declared public static. 
//    The public modifier makes it accessible anywhere, and static means there is a 
//    single instance of the variable. In general, change global variables into 
//    parameters and return values, or put them inside objects that you’re calling methods on.
//    Making a variable into a constant by adding the final keyword can eliminate the risk 
//    of global variables. What happens to each of the following variables when the final 
//    keyword is added: n, LONG_WORD_LENGTH, longestWord, word, words ??

// 2. Methods Should Return Results, not Print Them. countLongWords isn’t ready for change. 
//    It sends some of its result to the console, System.out. That means that if you want to 
//    use it in another context — where the number is needed for some other purpose, like 
//    computation rather than human eyes — it would have to be rewritten. In general, only the 
//    highest-level parts of a program should interact with the human user or the console. 
//    Lower-level parts should take their input as parameters and return their output as results.
