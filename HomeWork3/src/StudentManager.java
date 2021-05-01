
public class StudentManager extends UserManager{
	
	public void Add(User user)
	{
		System.out.println("Sn. " + user.getName() + " ho�geldiniz." );
	}
	
	public void Delete(User user)
	{
		System.out.println("Sn. " + user.getName() + " kayd�n�z kald�r�lm��t�r" );
	}
	
	public void GetAll(User[] users)
	{
		for(User user: users)
		{
			System.out.println(user.getName() +  " Listelenmi�tir.");
		}
	}
	
	
	public void Update(User user)
	{
		System.out.println("Sn. " + user.getName() + " Kayd�n�z g�ncellenmi�tir." );
	}
	
	public void GetById(User user)
	{
		System.out.println(user.getID() + " .ID 'li kay�t�n�z." );
	}
	
	public void SearchUserByProperty(User user)
	{
		System.out.println(user.getName() + " adl� kay�t bulunmu�tur." );
	}

}

