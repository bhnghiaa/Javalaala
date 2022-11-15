package Buoi5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ID> list_ID = new ArrayList<>();
        list_ID.add(new ID("001"));
        list_ID.add(new ID("002"));
        list_ID.add(new ID("003"));
        ArrayList<Brand> list_Brand = new ArrayList<>();
        list_Brand.add(new Brand("MSI"));
        list_Brand.add(new Brand("Intel"));
        list_Brand.add(new Brand("HP"));
        ArrayList<CPU> list_CPU = new ArrayList<>();
        list_CPU.add(new CPU(list_ID.get(0), "Intel core i9", list_Brand.get(0), 2000F));
        list_CPU.add(new CPU(list_ID.get(1), "Intel core i5", list_Brand.get(1), 3000F));
        list_CPU.add(new CPU(list_ID.get(2), "Intel core i7", list_Brand.get(2), 4000F));
        ArrayList<Mainbroad> list_Mainbroad = new ArrayList<>();
        list_Mainbroad.add(new Mainbroad(list_ID.get(0), "XY123", list_Brand.get(0), 2000F));
        list_Mainbroad.add(new Mainbroad(list_ID.get(1), "BHN200", list_Brand.get(1), 3000F));
        list_Mainbroad.add(new Mainbroad(list_ID.get(2), "WOW211", list_Brand.get(2), 4000F));
        ArrayList<RAM> list_RAM = new ArrayList<>();
        list_RAM.add(new RAM(list_ID.get(0), "SDRAM", list_Brand.get(0), 2500F));
        list_RAM.add(new RAM(list_ID.get(1), "DDR1", list_Brand.get(1), 4444F));
        list_RAM.add(new RAM(list_ID.get(2), "DDR2", list_Brand.get(2), 1152F));
        ArrayList<Computer> list_pc = new ArrayList<>();
        list_pc.add(new Computer(list_CPU.get(0), list_RAM.get(0), list_Mainbroad.get(0), list_ID.get(0), 5));
        list_pc.add(new Computer(list_CPU.get(1), list_RAM.get(1), list_Mainbroad.get(1), list_ID.get(1), 51));
        list_pc.add(new Computer(list_CPU.get(2), list_RAM.get(2), list_Mainbroad.get(2), list_ID.get(2), 22));

        list_pc.forEach(computer ->
        {
            System.out.printf("%s %s %s %d %f\n", computer.getCpu().getName(), computer.getRam().getName(), computer.getMainbroad().getName(), computer.getSl(), computer.getPrice());
        });
    }
}
