package org.kranki.codewars;

public class Nombres {
    public static void main(String[] args) {
        System.out.println(new Dinglemouse("zzz", "").getFullName());
    }
}

class Dinglemouse {
    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (firstName.trim().equals("") & lastName.trim().equals("")) {
            return "";
        }
        if (!firstName.isEmpty()){
            return (firstName + " " + lastName).trim();
        }else if (!lastName.isEmpty()){
            return (firstName + " " + lastName).trim();
        }

        if (firstName.equals("")) {
            return firstName = "Eastwood" ;
        } else if (lastName.equals("")) {
            return lastName = "Clint";
        }

        return (firstName + " " + lastName).trim();
    }
}//fin clase


