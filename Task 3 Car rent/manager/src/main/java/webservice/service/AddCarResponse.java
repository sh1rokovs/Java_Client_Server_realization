
package webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addCarResponse", propOrder = {
    "_return"
})
public class AddCarResponse {

    @XmlElement(name = "return")
    protected int _return;


    public int getReturn() {
        return _return;
    }


    public void setReturn(int value) {
        this._return = value;
    }

}
