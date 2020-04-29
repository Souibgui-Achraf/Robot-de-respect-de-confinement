package monProjet;

public class obj {
	public int x,y;
    public boolean motif=false;
	public obj (int x,int y,boolean motif) {
		this.x=x;
		this.y=y;
		this.motif=motif;
	}
	public boolean check() {
		return motif ;
	}
}
