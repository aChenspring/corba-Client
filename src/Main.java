import org.omg.Messaging.SyncScopePolicyOperations;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

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
       // System.out.println("Hello this process will connect to Corba!");
        DongtuClient dongtuClient = new DongtuClient("1");
        //System.out.println("Disconnected from the target corba");
        //String s= "0x52:65:61:6C:74:65:6B:20:50:43:49:65:20:47:42:45:20:46:61:6D:69:6C:79:20:43:6F:6E:74:72:6F:6C:6C:65:72:20:23:32:20:2D:20:CA:FD:BE:DD:B0:FC:BC:C6:BB:AE:B3:CC:D0:F2:CE:A2:D0:CD:B6:CB:BF:DA:00";
//        s = ToStringHex.mapHexPortDesc(s);
//        s = ToStringHex.toStringHex(s);
//        s = ToStringHex.trimHexPortDesc(s);
//        Integer s = 12345;
//        byte[] b = s.toString().getBytes();
//        for(int i=0;i<b.length;i++)
//        {
//            System.out.print(b[i]);
//        }
//
//        System.out.println("..............");
//        ByteArrayOutputStream  byteArrayOutputStream = new ByteArrayOutputStream();
//        try {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//            objectOutputStream.writeObject(s);
//            byte[] b1 = byteArrayOutputStream.toByteArray();
//            for(int i=0;i<b1.length;i++)
//            {
//                System.out.print(b1[i]);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


      //  DongtuClient.ToGBKEncode("?è±?_13");

    }


}