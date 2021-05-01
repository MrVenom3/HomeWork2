
public class StudentManager extends UserManager{
	
	public void Add(User user)
	{
		System.out.println("Sn. " + user.getName() + " hoþgeldiniz." );
	}
	
	public void Delete(User user)
	{
		System.out.println("Sn. " + user.getName() + " kaydýnýz kaldýrýlmýþtýr" );
	}
	
	public void GetAll(User[] users)
	{
		for(User user: users)
		{
			System.out.println(user.getName() +  " Listelenmiþtir.");
		}
	}
	
	
	public void Update(User user)
	{
		System.out.println("Sn. " + user.getName() + " Kaydýnýz güncellenmiþtir." );
	}
	
	public void GetById(User user)
	{
		System.out.println(user.getID() + " .ID 'li kayýtýnýz." );
	}
	
	public void SearchUserByProperty(User user)
	{
		System.out.println(user.getName() + " adlý kayýt bulunmuþtur." );
	}

}

