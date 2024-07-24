package pentagon.assign;

class Bank1{
	   float getrateofinterest() {
		   return 0;
		 }
	
}
class SBI extends Bank1{
	 float getrateofinterest() {
		 return 7.4f;
	 }
}
class ICICI extends Bank1{
	 float getrateofinterest() {
		 return 7.3f;
	 }
}
class AXIS extends Bank1{
	 float getrateofinterest() {
		 return 7.5f;
	 }
}
public class RunTime {
	public static void main(String[] args) {
		Bank1 b;
		b=new SBI();
		System.out.println("SBI Rate of interest:"+b.getrateofinterest());
		b=new ICICI();
		System.out.println("ICICI Rate of interest:"+b.getrateofinterest());
		b=new AXIS();
		System.out.println("AXIS Rate of interest:"+b.getrateofinterest());
	
	}

}
