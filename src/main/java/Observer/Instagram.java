package Observer;

public class Instagram {

	public static void main(String[] args)
	{
		Page facts =  new Page();
		Follower f1 = new Follower("Karthik");
		Follower f2 = new Follower("Priya");
		Follower f3 = new Follower("Ram");
		Follower f4 = new Follower("Rani");
		Follower f5 = new Follower("Naveen");
		Follower f6 = new Follower("Santosh");
		
		facts.follow(f1);
		facts.follow(f2);
		facts.follow(f3);
		facts.follow(f4);
		facts.follow(f5);
		facts.follow(f6);
		
		facts.unfollow(f4);
		
		f1.followPage(facts);
		f2.followPage(facts);
		f3.followPage(facts);
		f4.followPage(facts);
		f5.followPage(facts);
		f6.followPage(facts);
		
		facts.upload("About Earth");
	}

}
