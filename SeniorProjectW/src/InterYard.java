
public class InterYard extends Station{
	String station1;
	String station2;
	public InterYard (String stline, String type, String name, String acro,String direct, String head, String tail, int numLines, int numCars, String st1, String st2) {
		
		super(stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars);
		station1 = st1;
		station2 = st2;
		
	}
}
