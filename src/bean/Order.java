package bean;

public class Order {
    private  String id;
    private  String customerType;
    private  String airPortTax;
    private  String ryf;//燃油费
    private  String hkzhx;//航空综合险
    private  String jptgx;//机票退改险
    private  String yhq;//优惠券
    private  String hszj;//含税总价
    private  Customer customer[];

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAirPortTax() {
        return airPortTax;
    }

    public void setAirPortTax(String airPortTax) {
        this.airPortTax = airPortTax;
    }

    public String getRyf() {
        return ryf;
    }

    public void setRyf(String ryf) {
        this.ryf = ryf;
    }

    public String getHkzhx() {
        return hkzhx;
    }

    public void setHkzhx(String hkzhx) {
        this.hkzhx = hkzhx;
    }

    public String getJptgx() {
        return jptgx;
    }

    public void setJptgx(String jptgx) {
        this.jptgx = jptgx;
    }

    public String getYhq() {
        return yhq;
    }

    public void setYhq(String yhq) {
        this.yhq = yhq;
    }

    public String getHszj() {
        return hszj;
    }

    public void setHszj(String hszj) {
        this.hszj = hszj;
    }

    public Customer[] getCustomer() {
        return customer;
    }

    public void setCustomer(Customer[] customer) {
        this.customer = customer;
    }
}
