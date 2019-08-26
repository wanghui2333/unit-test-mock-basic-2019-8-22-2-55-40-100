package cashregister;

/**
 * 功能描述 : TODO
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-26 16:47
 */
public class MockPrint extends Printer{

    private String tempString = null;

    @Override
    public void print(String printThis) {
        super.print(printThis);
        tempString = printThis;
    }

    public String getTempString() {
        return tempString;
    }

    public void clear(){
        tempString = null;
    }
}
