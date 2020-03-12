package Observer;

public class Follower 
{
	private String name;
	private Page page = new Page();
	

	public Follower(String name) {
		super();
		this.name = name;
	}

	public void update()
	{
		System.out.println("Hey " + name +", Photo uploaded");
	}
	
	public void followPage(Page p)
	{
		page=p;
	}
}
