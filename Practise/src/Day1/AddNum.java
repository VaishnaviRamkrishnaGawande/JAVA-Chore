package Day1;

public class AddNum {

	public static void main(String[] args) {
		System.out.println("Length:"+args.length);
		int sum=0;
		if(args.length==0) {
			System.out.println("Enter number");
			
		}else {
			for(int i=0;i<args.length;i++) {
				sum+=Integer.parseInt(args[i]);
			}
			System.out.println("SUM :"+sum);
		}

	}

}
