package javaStart.inne;

class Developer extends Employee {
    String mainLanguage;
    String[]  skills;

    public Developer(String name, String email, int experience) {
        super(name, email, experience);
    }

    public String getMainLanguage() {
        return mainLanguage;
    }


    public String[] getSkills() {
        return skills;
    }

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }
}
