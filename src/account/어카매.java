//package account;
//
//import java.util.Scanner;
//public class AccountManagement {
//    // ↓ Account[] 타입의 배열
//    private Account[] accountList;  // 계좌 목록 배열
//    private int numAccounts;        // 계좌의 개수
//    private Scanner scanner;        // 사용자 키보드 입력 객체
//
//    // 최대 입력 가능한 계좌개수를 매개변수르 입력받는 생성자
//    public AccountManagement(int maxSize) {
//        this.accountList = new Account[maxSize];
//        this.numAccounts = 0;
//        this.scanner = new Scanner(System.in);
//    }
//
//    public void addAccount(String accountNumber, double balance) {
//        // **코드 작성
//
//        Account ac = new Account(accountNumber,balance); //// 계좌번호와 초기 입금액을 입력 받고 계좌객체를 생성한 후
//        accountList[numAccounts] = ac;
//        ac[] =                                   //// 배열의 앞에서부터 가장 처음 빈 공간에 추가한다.
//
//        // 배열의 앞에서부터 가장 처음 빈 공간에 추가한다.
//        // 단, 배열에 추가한 후 numAccounts를 증가시킨다.
//
//
//        public void showAccountList() {
//            // **코드 작성
//            // 계좌 목록을 출력
//            // 예시 출력 형태
//            // 계좌번호: [계좌번호2], 잔액: [잔액2]
//
//        }
//
//
//        public void deposit(String accountNumber, double amount) {
//            // **코드 작성
//            // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 추가한다.
//            // 단, Account 클래스의 deposit 메서드를 사용하여야 한다.
//
//        }
//    }
//
//    public void withdraw(String accountNumber, double amount) {
//        // **코드 작성
//        // 계좌번호로 계좌객체를 찾고 출금 금액 만큼 잔액을 차감한다.
//        // 단, Account 클래스의 withdraw 메서드를 사용하여야 한다.
//
//    }
//
//    private Account findAccount(String accountNumber) {
//
//    }
//
//
//    public void run() {
//        while (true) {
//            System.out.println("\n=== 계좌 관리 프로그램 ===");
//            System.out.println("1. 계좌 추가");
//            System.out.println("2. 계좌 목록 조회");
//            System.out.println("3. 입금");
//            System.out.println("4. 출금");
//            System.out.println("0. 종료");
//            System.out.print("원하는 기능을 선택하세요: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // 개행 문자 제거
//
//            if (choice == 0) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//
//            switch (choice) {
//                case 1:
//                    System.out.print("계좌번호: ");
//                    String accountNumber = scanner.nextLine();
//                    System.out.print("잔액: ");
//                    double balance = scanner.nextDouble();
//                    addAccount(accountNumber, balance);
//                    break;
//                case 2:
//                    showAccountList();
//                    break;
//                case 3:
//                    System.out.print("계좌번호: ");
//                    accountNumber = scanner.nextLine();
//                    System.out.print("입금액: ");
//                    double depositAmount = scanner.nextDouble();
//                    deposit(accountNumber, depositAmount);
//                    break;
//                case 4:
//                    System.out.print("계좌번호: ");
//                    accountNumber = scanner.nextLine();
//                    System.out.print("출금액: ");
//                    double withdrawAmount = scanner.nextDouble();
//                    withdraw(accountNumber, withdrawAmount);
//                    break;
//                default:
//                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
//                    break;
//            }
//        }
//    }
//}