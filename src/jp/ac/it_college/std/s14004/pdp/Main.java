package jp.ac.it_college.std.s14004.pdp;

import jp.ac.it_college.std.s14004.pdp.bridge.CountDisplay;
import jp.ac.it_college.std.s14004.pdp.bridge.Display;
import jp.ac.it_college.std.s14004.pdp.bridge.StringDisplayImpl;
import jp.ac.it_college.std.s14004.pdp.singleton.Singleton;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        strategyMain(new String[] {"314", "15",});
    }

    private static void strategyMain(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }

    private static void bridgeMain() {
        Display d1 = new Display(new StringDisplayImpl("Hello, japan."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }

    private static void abstractMain(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
    }

    public static void arrayListTest1() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        list.add("Diana");
        list.add("Elmo");

        for (String name : list) {
            System.out.println(name);
        }
    }

    public static void arrayListTest2() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        System.out.println("削除のまえ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
        System.out.println();

        list.remove("Alice");
        list.remove("Bob");
        list.remove("Elmo");

        System.out.println("削除のあと");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
        System.out.println();

        if (list.contains("Alice")) {
            System.out.println("listにAliceは含まれています。");
        } else {
            System.out.println("listにAliceは含まれていません。");
        }

    }

    public static void listTest() {
        List<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Bob");
        list.add("Elmo");

        System.out.println("最初の要素 = " + list.get(0));
        System.out.println("最後の要素 = " + list.get(list.size() - 1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("最初に出てくるBobの添字 = " + list.indexOf("Bob"));
        System.out.println("最後に出てくるBobの添字 = " + list.lastIndexOf("Bob"));
    }

    public static void linkedListTest() {
        LinkedList<String> list = new LinkedList<>();

        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        list.add("Elmo");

        System.out.println(list);

        list.addFirst("Alice");

        System.out.println(list);
    }

    public static void queueTest1() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Bob");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Chris");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Diana");
        System.out.println("offer後のqueue = " + queue);

        while (queue.peek() != null) {
            String name = queue.poll();
            System.out.println("pollの戻り値  = " + name);
            System.out.println("poll後のqueue =" + queue);
        }
    }

    public static void queueTest2() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alice");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Bob");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Chris");
        System.out.println("offer後のqueue = " + queue);

        queue.offer("Diana");
        System.out.println("offer後のqueue = " + queue);

        while (true) {
            String name = queue.element();
            System.out.println("elementの戻り値   =" + name);

            name = queue.remove();
            System.out.println("removeの戻り値    =" + name);
            System.out.println("remove後のqueue   =" + queue);
        }
    }

    public static void stackTest() {
        Deque<String> stack = new LinkedList<>();

        stack.addFirst("Alice");
        System.out.println("addFrist 後の stack = " + stack);

        stack.addFirst("Bob");
        System.out.println("addFrist 後の stack = " + stack);

        stack.addFirst("Chris");
        System.out.println("addFrist 後の stack = " + stack);

        stack.addFirst("Diana");
        System.out.println("addFrist 後の stack = " + stack);

        stack.addFirst("Elmov");
        System.out.println("addFrist 後の stack = " + stack);

        while (true) {
            String name = stack.getFirst();
            System.out.println("getFirstの戻り値 = " + name);

            name = stack.removeFirst();
            System.out.println("removeFirstの戻り値 = " + name);
            System.out.println("removeFirst後の戻り値 = " + stack);
        }
    }

    public static void prototypeMain() {
    }

    public static void hashSetTest() {
        Set<String> set = new HashSet<>();

        set.add("Alice");
        set.add("Bob");
        set.add("Chris");
        set.add("Diana");
        set.add("Elmo");

        for (String name : set) {
            System.out.println(name);
        }

        if (set.contains("Alice")) {
            System.out.println("Aliceは含まれています。");
        } else {
            System.out.println("Aliceは含まれていません。");
        }
    }

    public static void hashMapTest() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 100);
        map.put("Bob", 57);
        map.put("Chris", 85);
        map.put("Diana", 85);
        map.put("Elmo", 92);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " =>" + entry.getValue());
        }
        System.out.println();

        for (String name : map.keySet()) {
            System.out.println(name);
        }
        System.out.println();

        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println();

        for (String name : map.keySet()) {
            System.out.println(name + " => " + map.get(name));
        }
        System.out.println();

        System.out.println("Bobの値" + map.get("Bob"));
    }

    public static void templateTest() {

    }

    public static void singletonMain() {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです。");
        } else {
            System.out.println("obj1とonj2は同じインスタンスではありません。");
        }
        System.out.println("End.");
    }

    public static void builderMain(String[] args) {
        if (args.length != 1) {
            System.exit(0);
        }
        if (args[0].equals("plain")) {

        }
    }

}