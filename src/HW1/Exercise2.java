package HW1;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Exercise2 {

    private BigDecimal userId;
    private BigDecimal id;
    private String title;
    private String body;

    public Exercise2(BigDecimal userId, BigDecimal id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public BigDecimal getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserId( BigDecimal userId) {
        this.userId = userId;
    }
}
