package KYLAND_pmMgr;


/**
 * KYLAND_pmMgr/_PMResourceIterator_IStub.java .
 * ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
 * ��KYLAND_pmMgr.idl
 * 2017��9��7�� ������ ����03ʱ39��29�� CST
 */

public class _PMResourceIterator_IStub extends org.omg.CORBA.portable.ObjectImpl implements KYLAND_pmMgr.PMResourceIterator_I {

    public boolean next_n(int how_many, KYLAND_pmMgr.PMResourceList_THolder pmResourceList) throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("next_n", true);
            $out.write_ulong(how_many);
            $in = _invoke($out);
            boolean $result = $in.read_boolean();
            pmResourceList.value = KYLAND_pmMgr.PMResourceList_THelper.read($in);
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return next_n(how_many, pmResourceList);
        } finally {
            _releaseReply($in);
        }
    } // next_n

    public int getLength() throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("getLength", true);
            $in = _invoke($out);
            int $result = $in.read_ulong();
            return $result;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            return getLength();
        } finally {
            _releaseReply($in);
        }
    } // getLength

    public void destroy() throws globaldefs.ProcessingFailureException {
        org.omg.CORBA.portable.InputStream $in = null;
        try {
            org.omg.CORBA.portable.OutputStream $out = _request("destroy", true);
            $in = _invoke($out);
            return;
        } catch (org.omg.CORBA.portable.ApplicationException $ex) {
            $in = $ex.getInputStream();
            String _id = $ex.getId();
            if (_id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                throw globaldefs.ProcessingFailureExceptionHelper.read($in);
            else
                throw new org.omg.CORBA.MARSHAL(_id);
        } catch (org.omg.CORBA.portable.RemarshalException $rm) {
            destroy();
        } finally {
            _releaseReply($in);
        }
    } // destroy

    // Type-specific CORBA::Object operations
    private static String[] __ids = {
            "IDL:mtnm.tmforum.org/KYLAND_pmMgr/PMResourceIterator_I:1.0"};

    public String[] _ids() {
        return (String[]) __ids.clone();
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException {
        String str = s.readUTF();
        String[] args = null;
        java.util.Properties props = null;
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
        try {
            org.omg.CORBA.Object obj = orb.string_to_object(str);
            org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
            _set_delegate(delegate);
        } finally {
            orb.destroy();
        }
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        String[] args = null;
        java.util.Properties props = null;
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
        try {
            String str = orb.object_to_string(this);
            s.writeUTF(str);
        } finally {
            orb.destroy();
        }
    }
} // class _PMResourceIterator_IStub
