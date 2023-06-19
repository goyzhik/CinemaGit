public class Viewer {
    private String nickname;
    private int age;
    private int watchedCount;


    public Viewer(String nickname, int age, int watchedCount) {
        this.nickname = nickname;
        this.age = age;
        this.watchedCount = watchedCount;
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

    public int getWatchedCount() {
        return watchedCount;
    }

    public void setWatchedCount(int watchedCount) {
        this.watchedCount = watchedCount;
    }
}
