package javaStart.inne;

 class DataAnalyst extends Employee{
   boolean  phd;
   String [] methods;

   public boolean  isPhd() {
      return phd;
   }

   public String[] getMethods() {
      return methods;
   }

   public DataAnalyst(String name, String email, int experience, boolean  phd, String[] methods) {
      super(name, email, experience);
      this.phd = phd;
      this.methods = methods;

   }
}
