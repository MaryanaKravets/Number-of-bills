package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Account {

    void money(Integer number){
    ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,50,200,1000,20,5,2,10,100,500));
    Collections.sort(list,Collections.reverseOrder());
    for (int i=0; i<list.size(); i++){
        if(number/list.get(i)!=0){
            System.out.print(number/list.get(i)+"*"+list.get(i)+"; ");
            number%=list.get(i);
            if (number==0)break;
        }
    }

}
}