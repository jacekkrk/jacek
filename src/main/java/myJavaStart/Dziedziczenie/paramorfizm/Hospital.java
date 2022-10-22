package myJavaStart.Dziedziczenie.paramorfizm;

public class Hospital {

    Person[] ourPerson = new Person[3];

    private int i = 0;

    void add(Person obj) {

        ourPerson[i] = obj;
        i++;
    }

  void getInfo() {

      for (Person person : ourPerson) {
          System.out.println(   person.showMe());

      }

    }
}
