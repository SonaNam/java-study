package board;

import java.util.Scanner;

public class BoardManagement {
    Board[] BoardArry;
    int BoardMount = 0;
    int[] size = new int[100];

    Scanner sc = new Scanner(System.in);
    public BoardManagement(int size){
        BoardArry = new Board[size];

    }

    public void addBoard(String BoardName,String BoardText,String BoardWriter){
        Board board = new Board(BoardName,BoardText,BoardWriter);
        BoardArry[BoardMount] = board;
        BoardMount++;
    }





    public void run (){

        while (true) {
            System.out.println("===== 게시판 메뉴 =====");
            System.out.println("1. 게시물 추가");
            System.out.println("2. 게시물 목록 보기");
            System.out.println("3. 게시물 상세 조회");
            System.out.println("4. 게시물 수정");
            System.out.println("5. 게시물 삭제");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("추가할 게시물의 제목을 입력해주세요");
                    String BoardName = sc.nextLine();
                    System.out.println("추가할 게시물의 내용을 입력해주세요");
                    String BoardText = sc.nextLine();
                    System.out.println("작성자의 이름을 읿력해주세요");
                    String BoardWriter = sc.nextLine();
                    addBoard(BoardName,BoardText,BoardWriter);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }



        }
    }
}
