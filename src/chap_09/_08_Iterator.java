package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        //이터레이터
        List<String> list = new ArrayList<>();
        //List<String> list2 = new LinkedList<>(); -> 가능
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("-------------------------");

        it = list.iterator(); //커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-------------------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove(); //삭제
            }
        }

        it = list.iterator(); //커서를 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-------------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }

        System.out.println("-------------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        //map.iterator() -> key, value 두가지의 데이터가 있기 때문에 바로 기능을 사용할 수 X
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }

        System.out.println("-------------------------");

        Iterator<Integer> itMapValue = map.values().iterator();

        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("-------------------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }

        System.out.println("-------------------------");
    }
}
