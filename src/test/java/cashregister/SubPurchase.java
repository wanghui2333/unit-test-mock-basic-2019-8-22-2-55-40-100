package cashregister;

/**
 * 功能描述 : TODO
 *
 * @Author : 王辉
 * @Email : wanghui16@zybank.com.cn
 * @Date : 2019-08-26 17:29
 */
public class SubPurchase extends Purchase {
    public SubPurchase() {
        super(new Item[0]);
    }

    @Override
    public String asString() {

        return "test product\t1.0\n";
    }
}
