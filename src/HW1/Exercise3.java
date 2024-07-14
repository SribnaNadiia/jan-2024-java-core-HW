package HW1;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Exercise3 {


    private BigDecimal postId;
    private BigDecimal id;
    private String name;
    private String email;
    private String body;

    public Exercise3(BigDecimal postId, BigDecimal id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

//    Getters

    public BigDecimal getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPostId() {
        return postId;
    }

    public String getEmail() {
        return email;
    }

    //    Setters


    public void setBody(String body) {
        this.body = body;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPostId(BigDecimal postId) {
        this.postId = postId;
    }
}
