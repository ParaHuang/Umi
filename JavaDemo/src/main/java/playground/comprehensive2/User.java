package playground.comprehensive2;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String account;
    private String password;
    private String nickname;
    private List<Article> articles;

    public User(String account, String password, String nickname) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        articles = new ArrayList<>();
    }
    //getters and setters

    //toString

}
