package Observer;

import java.util.ArrayList;
import java.util.List;

public class Page 
{
	private List<Follower> fs = new ArrayList<Follower>();
    private String title;
    
    public void follow(Follower f)
    {
    	fs.add(f);
    }
    
    public void unfollow(Follower f)
    {
    	fs.remove(f);
    }
    
    public void notifyFollowers()
    {
    	for(Follower f : fs)
    	{
    		f.update();
    	}
    }
    
    public void upload(String title)
    {
    	this.title = title;
    	notifyFollowers();
    }
}
