
package webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCar", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class AddCar {

    protected String arg0;
    protected String arg1;
    protected String arg2;
    protected int arg3;


    public String getArg0() {
        return arg0;
    }

    public void setArg0(String value) {
        this.arg0 = value;
    }


    public String getArg1() {
        return arg1;
    }

    public void setArg1(String value) {
        this.arg1 = value;
    }


    public String getArg2() {
        return arg2;
    }

    public void setArg2(String value) {
        this.arg2 = value;
    }


    public int getArg3() {
        return arg3;
    }

    public void setArg3(int value) {
        this.arg3 = value;
    }

}
