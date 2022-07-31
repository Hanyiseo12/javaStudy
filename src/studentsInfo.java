public class studentsInfo {
		String firstName;
		String lastName;
		int graduateYear;
		double gpa;
		String major;
		
		public studentsInfo(String firstName,String lastName,int graduateYear, double gpa,String major) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.graduateYear = graduateYear;
			this.gpa = gpa;
			this.major = major;
		}
		public void checkingYear(){
			if(graduateYear < 2027) {
				this.graduateYear = this.graduateYear + 1;
			}
		}
}
