package Numbers;

public class primenumber {
	public static void main(String[] args) {
		int n=7;
		int temp=0;
		for(int i=2;i<=n/2;i++){
		    if(n%i==0){
		        temp=temp+1;
		        break;
		    }
		}
		if(temp==0){
		    System.out.println("is a prime");
		}else{
		    System.out.println("is not a prime");
		}

}
}
