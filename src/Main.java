import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void deleteEven(List<Integer> arrList) {
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        }
        System.out.println("Остаток после удаления чётных: " + arrList);

    }
    static Integer MaxNum(List<Integer> arrList) {
        int max = arrList.get(0);
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        return max;
    }
    static Integer MinNum(List<Integer> arrList) {
        int min = arrList.get(0);
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        }
        return min;
    }
    static Double getAvg(List<Integer> arrList) {
        int sum = 0;
        double avg;
        for (int i=0; i < arrList.size()-1; i++) {
            sum += arrList.get(i);
        }
        avg = sum / arrList.size();
        return avg;
    }

    public static void main(String[] args) {
        List<Integer> list_num = new ArrayList(Arrays.asList(4, 23, 6, 9, 18, 39, 4, 37, 17, 3));
        System.out.println("Изначальный список: " + list_num);
        System.out.println("Минимальное значение: " + MinNum(list_num));
        System.out.println("Максимальное значение: " + MaxNum(list_num));
        System.out.println("Среднее значение: " + getAvg(list_num));
        deleteEven(list_num);
    }
}