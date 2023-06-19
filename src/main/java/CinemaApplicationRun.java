import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewerList = new ArrayList<>();
        Viewer v1 = new Viewer("John", 32, 56);
        Viewer v2 = new Viewer("Bran", 25, 76);
        Viewer v3 = new Viewer("Rob", 33, 45);
        Viewer v4 = new Viewer("Rickon", 14, 30);
        Viewer v5 = new Viewer("Teon", 34, 1);

        viewerList.add(v1);
        viewerList.add(v2);
        viewerList.add(v3);
        viewerList.add(v4);
        viewerList.add(v5);

        System.out.println("Средний возраст зрителей "  + ViewerStatistics.averageAge(viewerList));

    }
}
