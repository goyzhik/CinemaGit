import java.util.List;

public class Viewer {
    private String nickname;
    private int age;
    private int watchedCount;
    private List<Cinema> watchedList;

    public Viewer(String nickname, int age,  List<Cinema> watchedList) {
        this.nickname = nickname;
        this.age = age;
        this.watchedList = watchedList;
    }

    public Viewer(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public int getWatchedCount() {
        return watchedList.size();
    }

    public List<Cinema> getWatchedList() {
        return watchedList;
    }

    public void setWatchedList(List<Cinema> watchedList) {
        this.watchedList = watchedList;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
