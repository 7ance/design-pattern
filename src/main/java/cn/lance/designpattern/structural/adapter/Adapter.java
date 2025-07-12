package cn.lance.designpattern.structural.adapter;

/**
 * 客户端接口实现类，通过引用需要被适配的类，然后进行一定适配后，系统可以方便地进行调用<br/>
 * 在这个例子中，原有的方法是Integer+Integer=Integer，现在系统需要的是String+String=String
 */
public class Adapter implements ClientInterface {

    /**
     * 对被适配的类进行引用，然后提供适配方法给Client去调用
     */
    private final Service service = new Service();


    @Override
    public String calculate(String a, String b) {
        Integer result = service.calculate(Integer.valueOf(a), Integer.valueOf(b));
        return String.valueOf(result);
    }

}
