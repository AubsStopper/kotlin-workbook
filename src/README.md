## Easy 1 — “String Toolkit” (functions + loops + control flow)

### Write a small set of functions that operate on strings without using regex.

## Requirements

Implement these functions:

`fun ftCountVowels(s: String): Int`

Counts a,e,i,o,u (case-insensitive).

`fun ftIsPalindrome(s: String): Boolean`

Ignore case.

Ignore non-alphanumeric characters.

Use a two-pointer loop (while) rather than building a reversed string.

`fun ftToTitleCase(s: String): String`

Convert "hello world" → "Hello World".

Collapse multiple spaces into single spaces.

Don’t use split(Regex...).

Test ideas

countVowels("Kotlin") == 2

isPalindrome("A man, a plan, a canal: Panama") == true

toTitleCase(" hello kotlin ") == "Hello Kotlin"