enum Cry { hungryCry, angryCry, wetCry }; 
public interface Observer  {
	public void update(Cry cry);
}
