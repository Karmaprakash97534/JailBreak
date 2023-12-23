package com.java.jailbreak;


	public class UserData {
		private String username;
		private String fullname;
		private String age;
		private String gender;
		private String education;
		private String fulladdress;
		private String noofcase;
		private String ipcsection;
		private String crimeinfo;
		private String activecase;
		private String pendingcase;
		private String jailname;
		private String entrydate;
		private String exitdate;
		private String mettingdate;
		public UserData(String username, String fullname, String age, String gender, String education, String fulladdress,
				String noofcase, String ipcsection, String crimeinfo, String activecase, String pendingcase, String jailname,
				String entrydate, String exitdate, String mettingdate) {
			super();
			this.username = username;
			this.fullname = fullname;
			this.age = age;
			this.gender = gender;
			this.education = education;
			this.fulladdress = fulladdress;
			this.noofcase = noofcase;
			this.ipcsection = ipcsection;
			this.crimeinfo = crimeinfo;
			this.activecase = activecase;
			this.pendingcase = pendingcase;
			this.jailname = jailname;
			this.entrydate = entrydate;
			this.exitdate = exitdate;
			this.mettingdate = mettingdate;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		public String getFulladdress() {
			return fulladdress;
		}
		public void setFulladdress(String fulladdress) {
			this.fulladdress = fulladdress;
		}
		public String getNoofcase() {
			return noofcase;
		}
		public void setNoofcase(String noofcase) {
			this.noofcase = noofcase;
		}
		public String getIpcsection() {
			return ipcsection;
		}
		public void setIpcsection(String ipcsection) {
			this.ipcsection = ipcsection;
		}
		public String getCrimeinfo() {
			return crimeinfo;
		}
		public void setCrimeinfo(String crimeinfo) {
			this.crimeinfo = crimeinfo;
		}
		public String getActivecase() {
			return activecase;
		}
		public void setActivecase(String activecase) {
			this.activecase = activecase;
		}
		public String getPendingcase() {
			return pendingcase;
		}
		public void setPendingcase(String pendingcase) {
			this.pendingcase = pendingcase;
		}
		public String getJailname() {
			return jailname;
		}
		public void setJailname(String jailname) {
			this.jailname = jailname;
		}
		public String getEntrydate() {
			return entrydate;
		}
		public void setEntrydate(String entrydate) {
			this.entrydate = entrydate;
		}
		public String getExitdate() {
			return exitdate;
		}
		public void setExitdate(String exitdate) {
			this.exitdate = exitdate;
		}
		public String getMettingdate() {
			return mettingdate;
		}
		public void setMettingdate(String mettingdate) {
			this.mettingdate = mettingdate;
		}
		@Override
		public String toString() {
			return "UserData [username=" + username + ", fullname=" + fullname + ", age=" + age + ", gender=" + gender
					+ ", education=" + education + ", fulladdress=" + fulladdress + ", noofcase=" + noofcase + ", ipcsection="
					+ ipcsection + ", crimeinfo=" + crimeinfo + ", activecase=" + activecase + ", pendingcase=" + pendingcase
					+ ", jailname=" + jailname + ", entrydate=" + entrydate + ", exitdate=" + exitdate + ", mettingdate="
					+ mettingdate + "]";
		}


}
