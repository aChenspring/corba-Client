public class ToStringHex {

    /***
     * 16进制转化为字符串
     * @param s
     * @return
     */
    public static String toStringHex(String s)
    {


        byte[] bakeyword=new byte[s.length()/2];
        for(int i=0;i<bakeyword.length;i++)
        {
            try{
                bakeyword[i]=(byte)(0xff & Integer.parseInt(s.substring(
                        i*2,i * 2 +2), 16));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        try{
            s=new String(bakeyword,"utf-8");
        }catch(Exception e1)
        {
            e1.printStackTrace();
        }
        return s;
    }

    /***
     * 整理16进制的端口描述数据未可转化的数据
     * @param s
     * @return
     */
    public static String mapHexPortDesc(String s)
    {
        if(s.startsWith("0x"))
        {
            try
            {
                return s.replace(":","").substring(2);
            }
            catch (Exception e)
            {
                return null;
            }
        }
        return null;
    }

    /****
     * 转化后如果有不识别或者不需要的字符 则trim掉
     */
    public static String trimHexPortDesc(String s)
    {
        if(s.contains("-"))
        {
            try
            {
                return s.split("-")[0].trim();
            }
            catch (Exception e)
            {
                return null;
            }
        }
        return null;
    }
}
