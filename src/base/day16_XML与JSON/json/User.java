package base.day16_XML与JSON.json;

/**
 * @author xiao儿
 * @date 2019/9/14 19:19
 * @Description User
 */
public class User {
    private String name;
    private int followers_count;

    public User() {
    }

    public User(String name, int followers_count) {
        this.name = name;
        this.followers_count = followers_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", followers_count=" + followers_count +
                '}';
    }
}
