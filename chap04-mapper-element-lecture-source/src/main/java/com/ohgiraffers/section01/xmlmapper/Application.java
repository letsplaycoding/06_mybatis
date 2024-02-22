package com.ohgiraffers.section01.xmlmapper;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ElementService elementService = new ElementService();

        do {
            System.out.println("========= Mapper elements test Menu =========");
            System.out.println("1. <resultMap> 테스트");
//            System.out.println("2. <sql> 테스트");
//            System.out.println("3. <insert> 태스트");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호를 입력하세요:");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    resultMapSubMenu();
                    break;
                case 9 :
                    return;
            }
        } while (true);
    }

    private static void resultMapSubMenu() {
        Scanner sc = new Scanner(System.in);
        ElementService elementService = new ElementService();
        do {
            System.out.println("========= <resultMap> SubMenu =========");
            System.out.println("1. <resultMap> Test");
            System.out.println("2. <association> Test");
            System.out.println("3. <collection> Test");
            System.out.println("9. 이전 메뉴로");
            System.out.print(" 메뉴 번호를 입력하세요 :");
            int no = sc.nextInt();
            /* 필기.
             *  Mybatis 에서 관계 정의
             *  ( 사원 , 부서 )
             *  1. association = 1 : 1  (EmployeeDTO 안에 DepartmentDTO가 1개 있다 -> 1:1 관계 )
             *  2. collection = 1 : N   (DepartMentDTO 안에 EmployeeDTO가 list 형태로 있다 -> 1: N 관계 )
            * */

            switch (no) {
                case 1:
                    elementService.selectResultMapTest();
                    break;
                case 2:
                    elementService.selectResultMapAssociationTest();
                    break;
                case 3:
                    elementService.selectResultMapeCollectionTest();
                    break;
                case 9:
                    return;
            }


        }while (true);
    }
}
