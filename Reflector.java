import java.util.*;

public class Reflector {
    //need an int for # of records which we can set at 95
    //also need an array type or linked list
    //finally we need an instance since we will make this from singleton
    private final int nRec = 95;

    private final LinkedList<Integer> storage;

    private static Reflector instance;

    //lets create singleton implementation first
    public static Reflector getInstance() {
        if(instance == null)
            instance = new Reflector();
        return instance;
    }

    //from what I remember we will need to load in values, I'm just going to go with Prof implementation since it was simple

    private void load() {
        storage.add(45);
        storage.add(58);
        storage.add(66);
        storage.add(47);
        storage.add(16);
        storage.add(25);
        storage.add(15);
        storage.add(88);
        storage.add(74);
        storage.add(62);
        storage.add(51);
        storage.add(77);
        storage.add(90);
        storage.add(61);
        storage.add(71);
        storage.add(6);
        storage.add(4);
        storage.add(80);
        storage.add(19);
        storage.add(18);
        storage.add(94);
        storage.add(75);
        storage.add(53);
        storage.add(86);
        storage.add(28);

        storage.add(5);
        storage.add(76);
        storage.add(89);
        storage.add(24);
        storage.add(55);
        storage.add(92);
        storage.add(34);
        storage.add(81);
        storage.add(82);
        storage.add(31);
        storage.add(63);
        storage.add(84);
        storage.add(93);
        storage.add(67);
        storage.add(50);
        storage.add(91);
        storage.add(72);
        storage.add(57);
        storage.add(68);
        storage.add(54);
        storage.add(0);
        storage.add(60);
        storage.add(3);
        storage.add(78);
        storage.add(52);

        storage.add(39);
        storage.add(10);
        storage.add(49);
        storage.add(22);
        storage.add(44);
        storage.add(29);
        storage.add(69);
        storage.add(42);
        storage.add(1);
        storage.add(64);
        storage.add(46);
        storage.add(13);
        storage.add(9);
        storage.add(35);
        storage.add(59);
        storage.add(73);
        storage.add(2);
        storage.add(38);
        storage.add(43);
        storage.add(56);
        storage.add(79);
        storage.add(14);
        storage.add(41);
        storage.add(65);
        storage.add(8);

        storage.add(21);
        storage.add(26);
        storage.add(11);
        storage.add(48);
        storage.add(70);
        storage.add(17);
        storage.add(32);
        storage.add(33);
        storage.add(83);
        storage.add(36);
        storage.add(87);
        storage.add(23);
        storage.add(85);
        storage.add(7);
        storage.add(27);
        storage.add(12);
        storage.add(40);
        storage.add(30);
        storage.add(37);
        storage.add(20);
    }
    //Reflector will be private and we just need to create the storage and load
    private Reflector(){
        storage = new LinkedList<>();
        load();
    }
    //to reflect values we will just need to check if its from 0-94
    //if it is we wll return the location in linkedlist
    //if not return -1
    public int reflect(final int i) {
        if(i >= 0 && i < 95)
            return storage.get(i);
        else
            return -1;
    }
    //Had some trouble with returns so i looked into lesson to get unconvert which he said would help
    //the only thing i will change is return string to make it easier to look at
    public String unconvert(final int i) {
        for (int j = 0; j<nRec; j++)
            if(storage.get(j) == i)
                return ("passed");
        return ("error");
    }

}
