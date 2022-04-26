package hello.core.singleton;


public class SingletonService {

    private static final SingletonService instance = new SingletonService();
    //클래스의 인스턴스가 딱 1개만 생성되는 것을 보장!
    //private 생성자를 사용해 외부에서 임의로 new 로 인한 생성을 막는다.


    // public 으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance(){
        return instance;
    }

    // 생성자를 private로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService(){

    }




    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
