
package webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "takeModelResponse", propOrder = {
        "_return"
})
public class TakeModelResponse {

    @XmlElement(name = "return")
    protected List<Car> _return;


    public List<Car> getReturn() {
        if (_return == null) {
            _return = new ArrayList<Car>();
        }
        System.out.println(this._return);
        return this._return;
    }

    public void setReturn(List<Car> value) {
        this._return = value;
    }

}
