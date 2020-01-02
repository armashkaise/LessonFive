package main;

import java.util.Objects;

public class User {
    private String id;
    private String name;

    private String surname;
    private String miInitials;
    private String dob;
    private String driverLicense;

    public static class Builder{
        private String id = "";
        private String name = "";

        private String surname = "";
        private String miInitials = "";
        private String dob = "";
        private String driverLicense = "";

        public Builder(String id, String name){
            this.id = id;
            this.name = name;
        }

        public Builder setSurname(String val){
            this.surname = val;
            return this;
        }

        public Builder setMiInitial(String val){
            this.miInitials = val;
            return this;
        }

        public Builder setDob(String val){
            this.dob = val;
            return this;
        }

        public Builder setDriverLicense(String val){
            this.driverLicense = val;
            return this;
        }

        public  User build(){
            return new User(this);
        }
    }


    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;

        this.surname = builder.surname;
        this.miInitials = builder.miInitials;
        this.dob = builder.dob;
        this.driverLicense = builder.driverLicense;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", miInitials='" + miInitials + '\'' +
                ", dob='" + dob + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(miInitials, user.miInitials) &&
                Objects.equals(dob, user.dob) &&
                Objects.equals(driverLicense, user.driverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, miInitials, dob, driverLicense);
    }
}
