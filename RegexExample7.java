import java.util.regex.* ;
class RegexExample7{
	public static void main(String[] args){
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","8962211286"));
		System.out.println(Pattern.matches("[789][0-9]{9}","896221128676"));
		System.out.println(Pattern.matches("[789][0-9]{9}","62211286769"));
		System.out.println(Pattern.matches("[789]\\d{9}","8962211286"));
	}
}