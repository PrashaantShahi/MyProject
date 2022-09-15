/* Write a program to find the first and the last occurence of the 
 * letter 'o'  in "Hello World".*/
package newAssignment;

public class LetterOccurence {

	public static void main(String args[]) {
		String st="Hello World";
				for(int i=0;i<st.length();i++) {
					if(st.charAt(i)=='o') {
						System.out.println("'o' first occurence at position "+(i+1));
						break;
					}
				}
				for(int i=st.length()-1;i>0;i--) {
					if(st.charAt(i)=='o') {
						System.out.println("'o' last occurence at position "+(i+1));
						break;
					}
				}
	}
}
