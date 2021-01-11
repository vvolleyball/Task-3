public class Theatre extends PublicBulding{
	
	public static void main(String[] args) {
		Bulding theatre1 = new Theatre(90, 3, "Ssenna 5A", 12000, "09:00-17:00", true, 120, 2);
		System.out.println("Театр 1:\n" + theatre1);
		Bulding theatre2 = new Theatre(100, 5, "Proskyr 9B", 96000, "09:00-21:00", false, 400, 1);
		System.out.println("Театр 2:\n" + theatre2);
	}
	private double square;
	private int floor;
	private String adress;
	private double cost;
	private String workingTime;
	private boolean lift;
	private int seats;
	private int scene;
	
	public Theatre(double square, int floor, String adress, double cost, String workingTime, boolean lift,int seats, int scene){
	
		this.square=square;
		this.floor=floor;
		this.adress=adress;
		this.cost=cost;
		this.workingTime=workingTime;
		this.lift=lift;
		this.seats=seats;
		this.scene=scene;
	}
	
	@Override
	public double getSquare(){
		return square;
	}
	@Override
	public int getFloor(){
		return floor;
	}
	@Override
	public String getAdress(){
		return adress;
	}
	@Override
	public double getCost(){
		return cost;
	}
	@Override
	public String getWorkingTime(){
		return workingTime;
	}
	@Override
	public boolean isLift(){
		return lift;
	}
	
	public int seats(){
		return seats;
	}
	public int scene(){
		return scene;
	}
	@Override
	public String toString(){
		
		return "Theatre{"
			+ "square='" + square + '\''
			+ ", floor='" + floor + '\''
			+ ", adress='" + adress + '\''
			+ ", cost='" + cost + '\''
			+ ", workingTime='" + workingTime + '\''
			+ ", lift='" + lift + '\''
			+ ", seats='" + seats + '\''
			+ ", scene='" + scene + '\'';
		
	}
}