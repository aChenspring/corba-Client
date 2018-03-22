public class ToStringHex {

    /***
     * 16����ת��Ϊ�ַ���
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
     * ����16���ƵĶ˿���������δ��ת��������
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
     * ת��������в�ʶ����߲���Ҫ���ַ� ��trim��
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
