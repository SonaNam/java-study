package ch09.CollectionUtilEX;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtil<S> {
    List<String> strList = new ArrayList<>();


    public int CollectionUtil(List<String> strList, String target) {
        int count = 0;
        for (int i = 0; i < strList.size(); i++) {
        if (strList.get(i).equals(target)){
            ++count;

        }
        }




        return count;
    }

    }



