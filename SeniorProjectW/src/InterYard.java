
public class InterYard extends Station{
	Station station1;
	Station station2;
	public InterYard (Line stline, String type, String name, String acro,String direct, Station head, Station tail, int numLines, int numCars, Station st1, Station st2) {
		
		super(stline,  type,  name,  acro, direct,  head,  tail,  numLines,  numCars);
		station1 = st1;
		station2 = st2;
		
	}
}
