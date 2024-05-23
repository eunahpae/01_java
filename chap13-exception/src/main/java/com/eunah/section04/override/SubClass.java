package main.java.com.eunah.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    /* 예외 없이 가능 - 부모  메소드가 예외를 던지더라도 재정의 하면서 예외를 발생시키지 않을 수 있기 때문에
    @Override
    public void method(){} */

    /* 동일 예외 던저주는 구문 작성 가능
    @Override
    public void method() throws IOException {}*/

    /* 상위 타입의 exception 은 불가능
    @Override
    public void method() throws Exception {} */

    @Override
    public void method() throws FileNotFoundException {
    }

}
