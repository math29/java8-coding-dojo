class Person {
    private String name;
    private Integer age;
    private String nationality;

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, Integer age, String nationality) {
        this(name, age);
        this.nationality = nationality;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    Integer getAge() {
        return this.age;
    }

    void setAge(Integer age) {
        this.age = age;
    }

    String getNationality() {
        return this.nationality;
    }

    void setNationality(String nationality) {
        this.nationality = nationality;
    }
}