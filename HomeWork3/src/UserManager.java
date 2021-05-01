public class UserManager {
	public void Add(User user)
	{
		System.out.println("Sn." + user.getName() + "hoþgeldiniz." );
	}
	
	public void Delete(User user)
	{
		System.out.println("Sn." + user.getName() + "kaydýnýz silinmiþtir." );
	}
	
	public void GetAll(User[] users)
	{
		for(User user: users)
		{
			System.out.println(user.getName() +  "Listelenmiþtir.");
		}
	}
	
	public void Update(User user)
	{
		System.out.println("Sn." + user.getName() + "kaydýnýz güncellenmiþtir." );
	}
	
	public void GetById(User user)
	{
		System.out.println(user.getID() + ".ID 'li kayýt." );
	}
	
	public void SearchUserByProperty(User user)
	{
		System.out.println(user.getName() + "adlý kayýt bulunmuþtur." );
	}
	

}

