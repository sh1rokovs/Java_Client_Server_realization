
package webservice.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(name = "Server", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Server {


    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCars", targetNamespace = "http://server/", className = "webservice.service.GetAllCars")
    @ResponseWrapper(localName = "getAllCarsResponse", targetNamespace = "http://server/", className = "webservice.service.GetAllCarsResponse")
    @Action(input = "http://server/Server/getAllCarsRequest", output = "http://server/Server/getAllCarsResponse")
    public List<Car> getAllCars();


    @WebMethod
    @RequestWrapper(localName = "takeModel", targetNamespace = "http://server/", className = "webservice.service.TakeModel")
    @ResponseWrapper(localName = "takeModelResponse", targetNamespace = "http://server/", className = "webservice.service.TakeModelResponse")
    @Action(input = "http://server/Server/takeModelRequest", output = "http://server/Server/takeModelResponse")
    public List<Car> takeModel(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);


    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCar", targetNamespace = "http://server/", className = "webservice.service.AddCar")
    @ResponseWrapper(localName = "addCarResponse", targetNamespace = "http://server/", className = "webservice.service.AddCarResponse")
    @Action(input = "http://server/Server/addCarRequest", output = "http://server/Server/addCarResponse")
    public int addCar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);


    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "changeSpecification", targetNamespace = "http://server/", className = "webservice.service.ChangeSpecification")
    @ResponseWrapper(localName = "changeSpecificationResponse", targetNamespace = "http://server/", className = "webservice.service.ChangeSpecificationResponse")
    @Action(input = "http://server/Server/changeSpecificationRequest", output = "http://server/Server/changeSpecificationResponse")
    public void changeSpecification(
        @WebParam(name = "arg0", targetNamespace = "")
                int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
                String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
                String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
                int arg3);


    @WebMethod
    @RequestWrapper(localName = "changeUser", targetNamespace = "http://server/", className = "webservice.service.ChangeUser")
    @ResponseWrapper(localName = "changeUserResponse", targetNamespace = "http://server/", className = "webservice.service.ChangeUserResponse")
    @Action(input = "http://server/Server/changeUserRequest", output = "http://server/Server/changeUserResponse")
    public void changeUser(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);


    @WebMethod
    @RequestWrapper(localName = "deleteCar", targetNamespace = "http://server/", className = "webservice.service.DeleteCar")
    @ResponseWrapper(localName = "resendTicketResponse", targetNamespace = "http://server/", className = "webservice.service.DeleteCarResponse")
    @Action(input = "http://server/Server/deleteCarRequest", output = "http://server/Server/deleteCarResponse")
    public void deleteCar(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
