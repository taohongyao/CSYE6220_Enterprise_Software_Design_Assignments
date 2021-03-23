import org.junit.jupiter.api.Test;

import java.util.*;

public class test {
    @Test


        public static void main(String[] args) {
            List<List<Integer>> list=new ArrayList<>();
            List<Integer> sub=new ArrayList<>();
            sub.add(1);
            sub.add(2);
            List<Integer> sub2=new ArrayList<>();
            sub2.add(-1);
            sub2.add(3);
            list.add(sub);
            list.add(sub2);
            Collections.sort(list, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    return o1.get(0).compareTo(o2.get(0));
                }
            });
            System.out.println(list);

        }

}
