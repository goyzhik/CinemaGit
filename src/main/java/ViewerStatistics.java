import java.util.List;

public class ViewerStatistics {
    public static int averageAge(List<Viewer> list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i).getAge();
        }
        return (int)sum/list.size();
    }
}
