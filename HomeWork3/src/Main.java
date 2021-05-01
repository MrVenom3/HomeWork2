public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setID(1);
		student.setName("Batu");
		student.setSurname("Turkoz");
		student.setGender("Erkek");
		student.setAreaInterest("Machine Learning");
		
		Student student2 = new Student();
		student2.setID(2);
		student2.setName("Çağatay");
		student2.setSurname("Nehirli");
		student2.setGender("Erkek");
		student2.setAreaInterest("React and Java");
		
		Instructor instructor = new Instructor();
		instructor.setID(1);
		instructor.setName("Ahmet");
		instructor.setSurname("Yaprak");
		instructor.setGender("Erkek");
		instructor.setProfession("Java Developer");
		
		Instructor instructor2 = new Instructor();
		instructor2.setID(2);
		instructor2.setName("Yiğit");
		instructor2.setSurname("Duman");
		instructor2.setGender("Erkek");
		instructor2.setProfession("C++ Developer");
		
		Student[] studentList = {student, student2};
		
		Instructor[] instructorList = { instructor, instructor2}; 
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor);
		instructorManager.Add(instructor2);
		instructorManager.Delete(instructor);
		instructorManager.Delete(instructor2);
		instructorManager.GetById(instructor);
		instructorManager.Update(instructor);
		instructorManager.SearchUserByProperty(instructor2);
		instructorManager.GetAll(instructorList);
		
		StudentManager studentManager = new StudentManager();
		studentManager.Add(student);
		studentManager.Add(student2);
		studentManager.Delete(student);
		studentManager.Delete(student2);
		studentManager.GetById(student);
		studentManager.Update(student);
		instructorManager.SearchUserByProperty(student2);
		studentManager.GetAll(studentList);
		
		
	}
}