/**
 �����Ƽ�EMS����ӿڵ���ָ��
 @author achen
 @version V1.0
 */
public class Main {

    /**
     ������
     @param  args �����в���
     @see
     */
    public static void main(String[] args) {
        System.out.println("Hello this process will connect to Corba!");
        DongtuClient dongtuClient = new DongtuClient("1");
        System.out.println("Disconnected from the target corba");
    }
}