package javaStart;

class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName != "") {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName != "") {
            this.lastName = lastName;
        }
    }

    public String getFullName() {

        if (this.firstName != null && this.firstName != "" && this.lastName != null && this.lastName != "") {
            return firstName + " " + lastName;

        }
        else if (this.firstName != null && this.firstName != "" ) {
            return  this.firstName;
        }

        else if (this.lastName != null && this.lastName != "" ) {
            return  this.lastName;
        }

        return "Unknown";
    }

        public static void main (String[]args){

            User tim = new User();
            tim.setFirstName("");
            tim.setLastName("Kita");
            System.out.println(tim.getFullName());
            //  System.out.println(tim.firstName + " " + tim.lastName);
        }

    }

