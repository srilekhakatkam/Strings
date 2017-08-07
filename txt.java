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
			String str1 = subs(a,i,i+b.length());
			if(permute(str1,0,str1.length()-1,b)){
				return true;
			}
		}
		return false;
	}
	public static boolean permute(String str, int l, int r,String a)
    {
        if (l == r){
            if(str.equals(a)){
            	return true;
            }
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                if(permute(str, l+1, r,a)){
                	return true;
                }
                str = swap(str,l,i);
            }
        }
        return false;
    }
	public static String subs(String s, int i,int j){
		String st = "";
		for(int a=i;a<j;a++){
			st+=s.charAt(a);
		}
		return st;
	}
	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
