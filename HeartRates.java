 class HeartRates {
   private String firstName;
   private String lastName;
   private int birthYear;
   private int currentYear;
   public HeartRates(String firstName, String lastName, int birthYear, int currentYear)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.birthYear = birthYear;  
      this.currentYear = currentYear;  
   } 
   public void setfirstName(String firstName) {
      this.firstName = firstName;
   }
   public String getfirstName() {
      return firstName;
   }
   public void setlastName(String lastName) {
      this.lastName = lastName;
   }
   public String getlastName() {
      return lastName;
   }
   public void setbirthYear(int birthYear) {
      this.birthYear = birthYear;
   }
   public int getbirthYear() {
      return birthYear;
   }
   public void setcurrentYear(int currentYear) {
      this.currentYear = currentYear;
   }
   public int getcurrentYear() {
      return currentYear;
   }
   //
   public int caculateAge(){
      return this.currentYear-birthYear;
   }
   public int caculateMaximumHeartRate(){
      return 220 - caculateAge();
   }
   public String caculateTargetHeartRate(){
      double lowerTarget = caculateMaximumHeartRate()*0.5;
      double upperTarget = caculateMaximumHeartRate()*0.85;
      return lowerTarget + "-" + upperTarget;
   }
}