
package webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "takeModel", propOrder = {
        "arg0"
})
public class TakeModel {
    protected String arg0;


    public String getArg0() {
        System.out.println(arg0);
        return arg0;
    }

    public void setArg0(String value) {
        this.arg0 = value;
    }
}
