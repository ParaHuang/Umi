package day11_map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //key:country   value:cities
        Map<String, List<String>> map = new HashMap<>();
        map.put("China",List.of("Beijing","Shanghai","Guangzhou","Shenzhen"));
        map.put("America",List.of("Chicago","Alaska","Los Angeles","New York"));
        map.put("Austrilia",List.of("cityA","cityB","cityC","cityD"));
        map.put("UK",List.of("UKCity1","UKCity2","UKCity3","UKCity4"));

        Scanner sc = new Scanner(System.in);
        System.out.println("input the country:");
        System.out.println(map.keySet());
        String country = sc.nextLine();
        List<String> cities = map.get(country);
        if(cities == null){
            System.out.println(country+ " is not an option");
        }else{
            System.out.println(cities);
        }
    }
}

//insert into city_table values (null,'London');
//insert into city_table values (null,'Liverpool');
//insert into city_table values (null,'Manchsssss');

/*
insert into city_table values (null,'London'),(null,'Liverpool'),(null,'Manchsssss');
 */