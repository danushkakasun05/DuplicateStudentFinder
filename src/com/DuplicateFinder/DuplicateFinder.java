package com.DuplicateFinder;
import java.sql.SQLOutput;
import java.util.*;

public class DuplicateFinder {
    private List<Student> stList;
    private List<Student> duplicateList;
    private List<Student>  distint;

    public DuplicateFinder(List<Student> std) {
        this.stList = std;
    }

    public List<Student> getsDublicate() {
        List<Student> duplicateList = new ArrayList<>();
        List<Student> stList = this.stList;
        for (int i = 0; i < stList.size()-1; i++) {
            for (int j = i+1 ; j < stList.size(); j++) {
                if (stList.get(i).getName().equals(stList.get(j).getName())) {
                    if (stList.get(i).getAge() == stList.get(j).getAge()) {
                        if (stList.get(i).getSchool().equals(stList.get(j).getSchool())) {
                            duplicateList.add(stList.get(i));
                        }
                    }

                }

            }
        }

        System.out.println("Duplicate Inputs : ");

        for(int i = 0; i < duplicateList.size() ; i++){
            System.out.println(duplicateList.get(i).getName());
        }

        System.out.println();

        return this.duplicateList;

    }

    public ArrayList<Student> getDistintLists(){
        ArrayList<Student> chk = new ArrayList<>(this.stList);

        for(int j=0;j< chk.size()-1;j++) {
            for (int i = j+1; i < chk.size(); i++) {
                if (chk.get(j).getName().equals(chk.get(i).getName())) {
                    chk.remove(i);
                }
            }
        }

        System.out.println("Distinct Inputs : ");

        for(int i = 0; i < chk.size() ; i++){
            System.out.println(chk.get(i).getName()+" "+chk.get(i).getSchool()+" "+chk.get(i).getAge());
        }

        System.out.println();

        return chk;

    }


}







