package bean;

import java.util.ArrayList;
import java.util.List;

public class Jihe {
    public static void main(String[] args) {

    }
    List list=new ArrayList();
    list.add(1);
    list.add("广东");
    list.add("河池");
    System.out.println("当前集合的元素个数："+list.size());
    for( i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
}

}
