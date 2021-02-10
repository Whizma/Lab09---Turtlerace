
public class MoleTurtle extends RaceTurtle {
    private int nbr;

    public MoleTurtle(RaceWindow w, int nbr) {
	super(w,nbr);
	this.nbr = nbr;
	penDown();
	left(270);
	// penUp();
    }
    
}