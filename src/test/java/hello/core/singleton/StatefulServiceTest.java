package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //A사용자가 만원을 주문 ,쓰레드A
        int userAPrice = statefulService1.order("userA", 10000);

        //B사용자가 2만원을 주문, 쓰레드B
        int userBPrice = statefulService1.order("userB", 20000);

        //ThreadA: 사용자A가 주문 금액을 조회
//        int price = statefulService1.getPrice();
//        System.out.println("price = " + price);
        System.out.println("userAPrice = " + userAPrice);

//        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);
    }

    static class TestConfig{

        @Bean
        public StatefulService service(){
            return new StatefulService();
        }
    }

}