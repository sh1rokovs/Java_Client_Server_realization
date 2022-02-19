
package webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllCars_QNAME = new QName("http://server/", "getAllCars");
    private final static QName _GetAllCarsResponse_QNAME = new QName("http://server/", "getAllCarsResponse");
    private final static QName _ChangeUser_QNAME = new QName("http://server/", "changeUser");
    private final static QName _ChangeUserResponse_QNAME = new QName("http://server/", "changeUserResponse");
    private final static QName _TakeCar_QNAME = new QName("http://server/", "takeCar");
    private final static QName _TakeCarResponse_QNAME = new QName("http://server/", "takeCarResponse");
    private final static QName _TakeModel_QNAME = new QName("http://server/", "takeModel");
    private final static QName _TakeModelResponse_QNAME = new QName("http://server/", "takeModelResponse");


    public ObjectFactory() {
    }

    public GetAllCars createGetAllCars() {
        return new GetAllCars();
    }

    public GetAllCarsResponse createGetAllCarsResponse() {
        return new GetAllCarsResponse();
    }


    public ChangeUser createChangeUser() {
        return new ChangeUser();
    }

    public ChangeUserResponse createChangeUserResponse() {
        return new ChangeUserResponse();
    }


    public TakeCar createTakeCar() {
        return new TakeCar();
    }

    public TakeCarResponse createTakeCarResponse() {
        return new TakeCarResponse();
    }


    public TakeModel createTakeModel() {
        return new TakeModel();
    }

    public TakeModelResponse createTakeModelResponse() {
        return new TakeModelResponse();
    }


    public Car createCar() {
        return new Car();
    }



    @XmlElementDecl(namespace = "http://server/", name = "getAllCars")
    public JAXBElement<GetAllCars> createGetAllCars(GetAllCars value) {
        return new JAXBElement<GetAllCars>(_GetAllCars_QNAME, GetAllCars.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "getAllCarsResponse")
    public JAXBElement<GetAllCarsResponse> createGetAllCarsResponse(GetAllCarsResponse value) {
        return new JAXBElement<GetAllCarsResponse>(_GetAllCarsResponse_QNAME, GetAllCarsResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "changeUser")
    public JAXBElement<ChangeUser> createChangeUser(ChangeUser value) {
        return new JAXBElement<ChangeUser>(_ChangeUser_QNAME, ChangeUser.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "changeUserResponse")
    public JAXBElement<ChangeUserResponse> createChangeUserResponse(ChangeUserResponse value) {
        return new JAXBElement<ChangeUserResponse>(_ChangeUserResponse_QNAME, ChangeUserResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "takeCar")
    public JAXBElement<TakeCar> createTakeCar(TakeCar value) {
        return new JAXBElement<TakeCar>(_TakeCar_QNAME, TakeCar.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "takeCarResponse")
    public JAXBElement<TakeCarResponse> createTakeCarResponse(TakeCarResponse value) {
        return new JAXBElement<TakeCarResponse>(_TakeCarResponse_QNAME, TakeCarResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "takeModel")
    public JAXBElement<TakeModel> createTakeModel(TakeModel value) {
        return new JAXBElement<TakeModel>(_TakeModel_QNAME, TakeModel.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "takeModelResponse")
    public JAXBElement<TakeModelResponse> createTakeModelResponse(TakeModelResponse value) {
        return new JAXBElement<TakeModelResponse>(_TakeModelResponse_QNAME, TakeModelResponse.class, null, value);
    }

}
