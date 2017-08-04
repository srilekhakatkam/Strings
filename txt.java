import java.util.*;
class txt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		System.out.println(check(a,b));
	}
	public static boolean check(String a, String b){
		for(int i = 0;i<=a.length()-b.length();i++){
			if(a.substring(i,i+b.length()).equals(b)){
				return true;
			}
		}
		return false;
	}
}