
package webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "takeCarResponse", propOrder = {
        "_return"
})
public class TakeCarResponse {

    @XmlElement(name = "return")
    protected int _return;


    public int getReturn() {
        return _return;
    }


    public void setReturn(int value) {
        this._return = value;
    }

}
