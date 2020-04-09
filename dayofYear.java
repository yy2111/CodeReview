public static int dayOfYear(int month, int dayOfMonth, int year) {
    if (month == 2) {
        dayOfMonth += 31;
    } else if (month == 3) {
        dayOfMonth += 59;
    } else if (month == 4) {
        dayOfMonth += 90;
    } else if (month == 5) {
        dayOfMonth += 31 + 28 + 31 + 30;
    } else if (month == 6) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31;
    } else if (month == 7) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
    } else if (month == 8) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
    } else if (month == 9) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
    } else if (month == 10) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
    } else if (month == 11) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
    } else if (month == 12) {
        dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
    }
    return dayOfMonth;
}

//Hints for code review:
// 1.   Don’t Repeat Yoursel. Duplicated code is a risk to safety. If you have identical or very similar code in two places, 
//      then the fundamental risk is that there’s a bug in both copies, and some maintainer fixes the bug in one place but not the other.
//      Avoid duplication like you’d avoid crossing the street without looking. Copy-and-paste is an enormously tempting programming tool, 
//      and you should feel a frisson of danger run down your spine every time you use it. The longer the block you’re copying, the riskier
//      it is.

//  2.  Comments where needed. Good software developers write comments in their code, and do it judiciously.

//  3.  Fail fast. Failing fast means that code should reveal its bugs as early as possible. The earlier a problem is observed 
//      (the closer to its cause), the easier it is to find and fix. Static type checking fails faster than dynamic checking, and 
//      dynamic checking fails faster than producing a wrong answer that may corrupt subsequent computation.
//      The dayOfYear function doesn’t fail fast — if you pass it the arguments in the wrong order, it will quietly return the wrong 
//      answer. In fact, the way dayOfYear is designed, it’s highly likely that a non-American will pass the arguments in the wrong order!
//      It needs more checking — either static checking or dynamic checking.

//  4.  Avoid Magic Numbers. Replace magic constant number with symbolic constant. 
//      dayOfYear() is full of magic numbers:
//      1)  The months 2, …, 12 would be far more readable as FEBRUARY, …, DECEMBER.
//      2)  The days-of-months 30, 31, 28 would be more readable (and eliminate duplicate code) if they were in a data structure like 
//          an array, list, or map, e.g. MONTH_LENGTH[month].
//      3)  The mysterious numbers 59 and 90 are particularly pernicious examples of magic numbers. They are uncommented and undocumented, 
//          the results of computation done by hand by the programmer. (Don’t hardcode constants that you’ve computed by hand.)
