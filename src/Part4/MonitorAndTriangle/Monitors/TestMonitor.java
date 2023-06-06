package Part4.MonitorAndTriangle.Monitors;

import java.util.TreeMap;

public class TestMonitor {

    public static void main(String[] args) {
        Monitor mon1 = new Monitor(15.6f, 1800, "Monitor1 ", " Samsung-2018");
        Monitor mon2 = new Monitor(23.8f, 1600, "Monitor2 ", " LG-2020");
        Monitor mon3 = new Monitor(22.6f, 2200, "Monitor3 ", " Sony-2015");
        Monitor mon4 = new Monitor(24.4f, 2400, "Monitor4 ", " Xiaomi-2023");
        Monitor mon5 = new Monitor(38.2f, 1700, "Monitor5 ", " Nvidia-2017");

        TreeMap<Monitor, String> treeMap = new TreeMap<>();

        treeMap.put(mon1, mon1.getInfo());
        treeMap.put(mon2, mon2.getInfo());
        treeMap.put(mon3, mon3.getInfo());
        treeMap.put(mon4, mon4.getInfo());
        treeMap.put(mon5, mon5.getInfo());

        System.out.println(treeMap);
    }
}
