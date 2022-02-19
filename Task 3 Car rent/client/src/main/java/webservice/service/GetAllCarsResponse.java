
package webservice.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllCarsResponse", propOrder = {
    "_return"
})
public class GetAllCarsResponse {

    @XmlElement(name = "return", nillable = true)
    protected List<Car> _return;

    public List<Car> getReturn() {
        if (_return == null) {
            _return = new ArrayList<Car>();
        }
        return this._return;
    }

}
