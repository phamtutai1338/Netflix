package com.movie.t2108a;

import com.movie.t2108a.controller.NetflixController;
import com.movie.t2108a.model.Netflix;
import com.movie.t2108a.repository.NetflixRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        NetflixRepository netflixRepository = new NetflixRepository();
        NetflixController netflixController = new NetflixController();

        netflixRepository.getData();
        List<Netflix> netflixList = netflixRepository.netflixList;




        while (true){
            menu();
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1://sap xep phim
                    Collections.sort(netflixList, new Comparator<Netflix>() {
                        @Override
                        public int compare(Netflix o1, Netflix o2) {
                            return o1.getTitle().compareTo(o2.getTitle());
                        }
                    });
                printList(netflixList);
                break;
                case 2:// tim theo ten phim

                    System.out.println("Nhập tên phim cần tìm: ");
                    String name = sc.nextLine();
                    System.out.println("Danh sách phim " + name+": ");
                    netflixController.searchByName(netflixList,name);
                case 3:
                    System.out.println("Nhập tên loại phim cần tìm: ");
                    String genres = sc.nextLine();
                    System.out.println("Danh mục " +genres +": ");
                    netflixController.searchByCategory(netflixList,genres);
                    break;
                case 4:
                    System.out.println("Nhập tên ngôn ngữ phim cần tìm: ");
                    String language = sc.nextLine();
                    System.out.println("Danh sách phim " +language +": ");
                    netflixController.searchByLanguage(netflixList,language);
                    break;
                case 5:
                    netflixController.getAllMovieCategory(netflixList);
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:break;

            }
        }
    }
    public static void printList (List<Netflix> list){
        for (Netflix netflix : list){
            System.out.println(netflix);
        }

    }
    public static void menu(){
        System.out.printf("Các tùy chọn của bạn với flim trên Netfix");
        System.out.println("1. Sắp xếp phim");
        System.out.println("2. Tìm phim theo tên");
        System.out.println("3. Tìm phim theo thể loại");
        System.out.println("4. Tìm theo ngôn ngữ");
        System.out.println("5. Liệt kê các bộ phim theo thể loại");
        System.out.println("6. Kết thúc chương trình");
    }
}
