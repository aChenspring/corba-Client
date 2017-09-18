package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/PMResourceIterator_IOperations.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

public interface PMResourceIterator_IOperations {
    boolean next_n(int how_many, KYLAND_pmMgr.PMResourceList_THolder pmResourceList) throws globaldefs.ProcessingFailureException;

    int getLength() throws globaldefs.ProcessingFailureException;

    void destroy() throws globaldefs.ProcessingFailureException;
} // interface PMResourceIterator_IOperations
