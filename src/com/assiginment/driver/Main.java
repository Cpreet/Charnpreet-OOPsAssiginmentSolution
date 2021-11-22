package com.assiginment.driver;

import com.assiginment.classes.*;

public class Main{

    private static AdminDepartment mAdmin = new AdminDepartment();
    private static HrDepartment mHr = new HrDepartment();
    private static TechDepartment mTech = new TechDepartment();

    public static void main(String[] args) throws Exception { 
        System.out.println("Welcome to " + mAdmin.departmentName());
        System.out.println(mAdmin.getTodaysWork());
        System.out.println(mAdmin.getWorkDeadline());
        System.out.println(mAdmin.isTodayAHoliday());
        
        System.out.println();
        
        System.out.println("Welcome to " + mHr.departmentName());
        System.out.println(mHr.doActivity());
        System.out.println(mHr.getTodaysWork());
        System.out.println(mHr.getWorkDeadline());
        System.out.println(mHr.isTodayAHoliday());
        
        System.out.println();
        
        System.out.println("Welcome to " + mTech.departmentName());
        System.out.println(mTech.getTodaysWork());
        System.out.println(mTech.getWorkDeadline());
        System.out.println(mTech.getTechStackInformation());
        System.out.println(mTech.isTodayAHoliday());
    }
}
