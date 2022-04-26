package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(
//        basePackages = "hello.core.member", //어디서부터 찾는지 지정할 수 있습니다.
        excludeFilters = @ComponentScan.Filter(type =  FilterType.ANNOTATION,classes = Configuration.class)
)
public class AutoAppConfig {
    //@ComponentScan은 말그대로 @Conponent 어노테이션이 붙은 클래스를 스캔해서 스프링 빈으로 등록합니다.
    //@Configuration이 컴포넌트 스캔의 대상이 된 이유도 @Configuration 소스코드를 열어보면 @Component 어노테이션이 붙어있습니다.

}
