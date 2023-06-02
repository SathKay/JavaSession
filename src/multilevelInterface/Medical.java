package multilevelInterface;

public interface Medical extends WHO{
	
	public void policies();
	public void policies(String dept);
	@Override
	public void vaccination();

}
