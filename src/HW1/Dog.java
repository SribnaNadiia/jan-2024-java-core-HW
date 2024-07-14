package HW1;

import java.math.BigDecimal;

public class Dog {
    private String name;
    //    age
    private BigDecimal age;
    // poroda
    private String poroda;

    public Dog(String name, BigDecimal age, String poroda){
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    //    Getters
    public String getName() {
        return name;
    }

    public BigDecimal getAge(){
        return age;
    }

    public String getPoroda(){
        return poroda;
    }

//    Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
}
