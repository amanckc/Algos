
public class Robinkarp {
//string matching
	int hash_val=213;//pick any prime number
	public void search(String text,String pattern)
	{
		int m=pattern.length();
		int n=text.length();
		int hash_pattern=0,hash_text=0;
		int i,j,h=1;
		
		for( i=0;i<m-1;i++)
		{
			h=(h*256)%hash_val;
		}
		
		for( i=0;i<m;i++)
		{
			hash_pattern=(256*hash_pattern+pattern.charAt(i))%hash_val;
			hash_text=(256*hash_text+text.charAt(i))%hash_val;
			
		}
		
		for(i=0;i<n-m;i++)
		{
			if(hash_pattern==hash_text)
			{
				for(j=0;j<m;j++)
				{
					if(pattern.charAt(j)!=text.charAt(i+j))
						break;
				}
				
				if(j==m)
					 System.out.println("Pattern found at-> " + i);
			}
			
			if(i<n-m)
			{
				hash_text=(256* (hash_text-text.charAt(i)*h)+text.charAt(i+m))%hash_val;
				
				if(hash_text<0)
					hash_text+=hash_val;
			}
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="srk is king of bollywood";
		String pattern="king";
		Robinkarp obj=new Robinkarp();
		
		obj.search(text,pattern);
		

	}

}
