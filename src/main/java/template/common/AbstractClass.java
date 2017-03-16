package template.common;

/**
 * Created by xugebing on 2017/3/15.
 */
public abstract class AbstractClass {

    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    //模板方法
    public void templateMethod(){
        //调用基本方法，完成相关逻辑
        this.doAnything();
        this.doSomething();
    }
}
