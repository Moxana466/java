package StringBuffer_Builder;

public class String_methods {
	public static void main(String[] args) {
    	StringBuffer sb=new StringBuffer("Hello");
    	//1.append(String s)
    	System.out.println("to append 'program : "+sb.append(" Program"));
    	//2.insert(int start index,string s)
    	System.out.println("to insert java at index 6 : "+sb.insert(6, "Java "));
    	//3.replace(int start,int end,String s)
    	System.out.println("to replace Program with World : "+sb.replace(11, 16,"World"));
    	//4.delete(int start,int end)
    	System.out.println("to delete 'a' at the end of Worldam : "+sb.delete(16, 17));
    	//5.deleteCharAt(int index)
    	System.out.println("to delete 'm' at the end of Worldm : "+sb.deleteCharAt(16));
    	//6.reverse()
    	sb.reverse();
        System.out.println("to reverse of sb string : "+sb);
        sb.reverse();
        //7.length()
        System.out.println("the length of the sb string : "+sb.length());
        //8.capacity
        System.out.println("the capacity of the sb string : "+sb.capacity());
        //9.charAt()
        System.out.println("the char at index 7 : "+sb.charAt(7));
        //to reverse the string back
        sb.reverse();
        System.out.println("the old string : "+sb);
        sb.reverse();
        System.out.println("the new string : "+sb);
        //10.setCharAt(int index)
        sb.setCharAt(7,'o');
        System.out.println("to setCharAt index 7 : "+sb);
        //11.substring(int start)
        System.out.println("to print the substring of sb from index 6 : "+sb.substring(6));
        //12.substring(int start,int end)
        System.out.println("to print sb from index 11 to 15 : "+sb.substring(11, 15));
        //toString()
        String str = sb.toString();
        System.out.println("toString(): " + str);
        sb.insert(6, "Java ");
        System.out.println("the modified string : "+sb);
        System.out.println("the original string : "+str);
        //ensureCapacity(int min)
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(50) & capacity: " + sb.capacity());
        //setLength(int newLength)
        sb.setLength(4);
        System.out.println("setLength(4): " + sb);
    }
}
