package frank.scan;

import frank.ioc.Duck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

// @Controller("Bean 的名字")
// @Controller 默认以类名字首字母小写的方式注册 Bean 对象
@Controller
public class LoginController {

    /*
    装配 Bean
    1. @Autowired：Spring 的注解，只能 Spring 框架使用
    2. @Resource：jdk的注解，是一种装配资源类的规范，Spring 实现了这个规范，所以也可以使用该注解
    @Autowired 默认按照 Bean 类型装配，而 @Resource 默认按照 Bean 实例名称进行装配。
     */
    @Autowired
    private LoginService loginService;

//    @Autowired
    @Resource
    private Duck duck3;

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public Duck getDuck3() {
        return duck3;
    }

    public void setDuck3(Duck duck3) {
        this.duck3 = duck3;
    }
}
