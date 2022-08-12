package bank;

class Employee {

    String name, email;
    int experience;

    void Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;

    }
    // write constructor


}

class Developer extends Employee {

    String mainLanguage, skills;

    // write constructor

    // write getters
}

class DataAnalyst extends Employee {

    String phd, methods;

    // write constructor

    // write getters
}