package com.usecases;

import com.dao.AdminDao;
import com.dao.AdminDaoImpl;
import com.exceptions.AdminException;

import java.util.Scanner;

import static com.authentication.AuthenticImpl.BLACK_BACKGROUND;
import static com.authentication.AuthenticImpl.WHITE_BOLD_BRIGHT;
import static com.usecases.CreateBatch.TEXT_RESET;

public class UpdateBatch {
    public void updateBatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println(BLACK_BACKGROUND+WHITE_BOLD_BRIGHT+"_________________________Update Batch________________________________"+TEXT_RESET);
        System.out.println();
        System.out.println("Enter Updated Batch Id : "); int batchId = sc.nextInt();
        System.out.println();
        System.out.println("Enter Updated Values Below");
        System.out.println();
        System.out.print("Enter Course Id : "); int courseId = sc.nextInt();
        System.out.print("Enter Faculty Id : "); int facultyId = sc.nextInt();
        System.out.print("Enter Number of Students : "); int numberofStudents = sc.nextInt();

        System.out.print("Enter Batch Start Date : "); String batchstartDate = sc.next();

        System.out.print("Enter Duration : "); int duration = sc.nextInt();

        AdminDao dao = new AdminDaoImpl();
        String result = null;
        try {
            result = dao.updateBatch(batchId,courseId,facultyId,numberofStudents,batchstartDate,duration);
        } catch (AdminException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result);
    }
}
