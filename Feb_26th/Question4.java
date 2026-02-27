package Feb_26th;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {22,3,7,10,25,26,56,77,0,69,71,5,11,12,75,8,99,30,95,13,1,65,6,17,9,19,3,2,21,27,96};
		
		int guess = (int)(Math.random()*100);
		boolean m=false;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==guess) {
				m=true;
				index=i;
			}
		}
		if(m==false) {
			System.out.println("You loose");
		}
		else {
			System.out.println("You won");
		}
		System.out.println("Number was "+guess+" winner"+index);
	}

}
