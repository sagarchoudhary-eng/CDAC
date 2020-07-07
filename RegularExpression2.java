import java.util.regex.* ;
class RegularExpression2{
	public static void main(String[] args){
		System.out.println(Pattern.matches("[amn]?","am"));
		System.out.println(Pattern.matches("[amn]+","ammmnnnn"));
		System.out.println(Pattern.matches("[amn]*","amn"));
		System.out.println(Pattern.matches("[amn]{1}","amn"));
		System.out.println(Pattern.matches("[amn]{2,}","aammnnnnn"));
		System.out.println(Pattern.matches("[amn]{1,3}","ammmnnn"));
	}
}





/*Regex Quantifiers
The quantifiers specify the number of occurrences of a character.

Regex	Description
X?	X occurs once or not at all
X+	X occurs once or more times
X*	X occurs zero or more times
X{n}	X occurs n times only
X{n,}	X occurs n or more times
X{y,z}	X occurs at least y times but less than z times
*/