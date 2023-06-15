public class FullName {
    private String name;
    private String lastName;
    private String surName;

    public FullName(String name, String lastName, String surName) {
        this.name = name;
        this.lastName = lastName;
        this.surName = surName;
    }

    public String getName() {

        return this.name;
    }

    public String getLastName() {

        return this.lastName;
    }
    public String getSurName() {
        return this.surName;
    }
}

