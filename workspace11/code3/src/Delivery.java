public class Delivery {

	private long over,ball,runs;
	private String nonStriker,batsman,bowler;
	
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	
	
	public Delivery(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
		this.over=over;
		this.ball=ball;
		this.runs=runs;
		this.nonStriker=nonStriker;
		this.batsman=batsman;
		this.bowler=bowler;
	}
	
	public Delivery() {

     
	}
	
	@Override
	public String toString() {
		return over+ball+runs+batsman+bowler+nonStriker;
	}
	
	
	
	
}