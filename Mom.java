
public class Mom implements Observer {
	private Subject Baby;
	public Mom(Subject Baby) {
		this.Baby = Baby;
		Baby.registerObserver(this);
		
	}
	@Override
	public void update(Cry cry) {
		if(cry == Cry.angryCry) {
			System.out.println("mom hugs and rocks baby, maybe spoiling");
		}
		if(cry == Cry.hungryCry) {
			System.out.println("mom cuddles and feeds baby");
		}
		if(cry == Cry.wetCry) {
			System.out.println("mom changes baby");
		}
	}
	
	
}
