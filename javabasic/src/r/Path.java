package r;

//import s.Sample; default modifier
// import s.Service; public modifier

public class Path extends Repositary{
	
	protected String city="Jaipur";   
	public static void main(String[] args) {
		
//		Sample d4=new Sample();
//		System.out.println("s="+d4.s); default modifier
		
	//	Service s4=new Service();
	//	System.out.println("ser="+s4.ser);  public modifier
	
	//	Repositary r2=new Repositary();
	//	System.out.println("name="+r2.name ); private modifier (Error)The field sample in not visible
		
		Path p1=new Path();
		System.out.println("city="+p1.city);  
	}

}
