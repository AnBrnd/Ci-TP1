package fr.epsi.cap2425;

public class Character {
    private String name;
    private String classType;
    private int level;

    public Character(String name, String classType, int level) {
        this.name = name;
        this.classType = classType;
        this.level = 1;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType (String classType) {
        this.classType = classType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        this.level++;
    }

    public String toString() {
        return "Name: " + this.name + ", Class: " + this.classType + ", Level: " + this.level;
    }
}
