package JavaClass17;

public class Task1 {

	/*
	 * Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) 
	 * and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 -
	 *  from different class inside different package  and observe result.
	 */
	
		String name;
		String lastName;
		int Id;
		String course;
		
		
		public Task1() {
		}

		public Task1(String name) {
			this.name = name;
		}

		private Task1(String name, String lastName) {
			//this.name = name;
			this(name);
			this.lastName = lastName;
		}

		 Task1(String name, String lastName, int id) {
			//this.name = name;
		//	this.lastName = lastName;
			 this(name,lastName);
			Id = id;
		}

		protected Task1(String name, String lastName, int id, String course) {
			//this.name = name;
			//this.lastName = lastName;
			//Id = id;
			this(name,lastName,id);
			this.course = course;
		}
		void printName() {
			System.out.println(name);
			
		}
		void printAllinfo(){
			System.out.println("My name is "+name+" with last Name "+lastName+" ID No"+Id+ " and course "+course);
		}
			
		
}
