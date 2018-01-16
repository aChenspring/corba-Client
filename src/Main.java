/**
 东土科技EMS北向接口调用指南
 @author achen
 @version V1.0
 */
public class Main {

    /**
     主函数
     @param  args 命令行参数
     @see
     */
    public static void main(String[] args) {
        System.out.println("Hello this process will connect to Corba!");
        DongtuClient dongtuClient = new DongtuClient("1");
        System.out.println("Disconnected from the target corba");
    }
}