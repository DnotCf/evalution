package com.myeval.utils;

import com.myeval.collectiondata.TscoreAndname;
import com.myeval.collectiondata.TscoreAndname1;
import com.myeval.entity.GroupByScore;

import java.util.ArrayList;
import java.util.List;

public class GrorpScoreUtil {

    public static List<TscoreAndname1> groupscore(GroupByScore group) {
        List<TscoreAndname1> list = new ArrayList<>();
        TscoreAndname1 t1=new TscoreAndname1();
        t1.setName(ScoreApi.A);
        t1.setValue(group.getA());
        list.add(t1);
        TscoreAndname1 t2=new TscoreAndname1();
        t2.setName(ScoreApi.B);
        t2.setValue(group.getB());
        list.add(t2);
        TscoreAndname1 t3=new TscoreAndname1();
        t3.setName(ScoreApi.C);
        t3.setValue(group.getC());
        list.add(t3);
        TscoreAndname1 t4=new TscoreAndname1();
        t4.setName(ScoreApi.D);
        t4.setValue(group.getD());
        list.add(t4);
        return list;
    }
}
