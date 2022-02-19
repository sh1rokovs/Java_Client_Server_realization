
package webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCar_QNAME = new QName("http://server/", "addCar");
    private final static QName _AddCarResponse_QNAME = new QName("http://server/", "addCarResponse");
    private final static QName _TakeModel_QNAME = new QName("http://server/", "takeModel");
    private final static QName _TakeModelResponse_QNAME = new QName("http://server/", "takeModelResponse");
    private final static QName _GetAllCars_QNAME = new QName("http://server/", "getAllCars");
    private final static QName _GetAllCarsResponse_QNAME = new QName("http://server/", "getAllCarsResponse");
    private final static QName _DeleteCar_QNAME = new QName("http://server/", "deleteCar");
    private final static QName _DeleteCarResponse_QNAME = new QName("http://server/", "deleteCarResponse");
    private final static QName _ChangeSpecification_QNAME = new QName("http://server/", "changeSpecification");
    private final static QName _ChangeSpecificationResponse_QNAME = new QName("http://server/", "changeSpecificationResponse");
    private final static QName _ChangeUser_QNAME = new QName("http://server/", "changeUserUser");
    private final static QName _ChangeUserResponse_QNAME = new QName("http://server/", "changeUserResponse");


    public ObjectFactory() {
    }

    public AddCar createAddCar() {
        return new AddCar();
    }

    public AddCarResponse createAddCarResponse() {
        return new AddCarResponse();
    }


    public ChangeUser createChangeUser() {
        return new ChangeUser();
    }

    public ChangeUserResponse createChangeUserResponse() {
        return new ChangeUserResponse();
    }


    public GetAllCars createGetAllCars() {
        return new GetAllCars();
    }

    public GetAllCarsResponse createGetAllCarsResponse() {
        return new GetAllCarsResponse();
    }


    public ChangeSpecification createChangeSpecification() {
        return new ChangeSpecification();
    }

    public ChangeSpecificationResponse createChangeSpecificationResponse() {
        return new ChangeSpecificationResponse();
    }


    public DeleteCar createDeleteCar() {
        return new DeleteCar();
    }

    public DeleteCarResponse createDeleteCarResponse() {
        return new DeleteCarResponse();
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


    @XmlElementDecl(namespace = "http://server/", name = "addCar")
    public JAXBElement<AddCar> createAddCar(AddCar value) {
        return new JAXBElement<AddCar>(_AddCar_QNAME, AddCar.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "addCarResponse")
    public JAXBElement<AddCarResponse> createAddCarResponse(AddCarResponse value) {
        return new JAXBElement<AddCarResponse>(_AddCarResponse_QNAME, AddCarResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "changeUser")
    public JAXBElement<ChangeUser> createChangeUser(ChangeUser value) {
        return new JAXBElement<ChangeUser>(_ChangeUser_QNAME, ChangeUser.class, null, value);
    }

    @XmlElementDecl(namespace = "http://server/", name = "changeUserResponse")
    public JAXBElement<ChangeUserResponse> createChangeUserResponse(ChangeUserResponse value) {
        return new JAXBElement<ChangeUserResponse>(_ChangeUserResponse_QNAME, ChangeUserResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "getAllCars")
    public JAXBElement<GetAllCars> createGetAllCars(GetAllCars value) {
        return new JAXBElement<GetAllCars>(_GetAllCars_QNAME, GetAllCars.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "getAllCarsResponse")
    public JAXBElement<GetAllCarsResponse> createGetAllCarsResponse(GetAllCarsResponse value) {
        return new JAXBElement<GetAllCarsResponse>(_GetAllCarsResponse_QNAME, GetAllCarsResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "changeSpecification")
    public JAXBElement<ChangeSpecification> createChangeSpecification(ChangeSpecification value) {
        return new JAXBElement<ChangeSpecification>(_ChangeSpecification_QNAME, ChangeSpecification.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "changeSpecificationResponse")
    public JAXBElement<ChangeSpecificationResponse> createChangeSpecificationResponse(ChangeSpecificationResponse value) {
        return new JAXBElement<ChangeSpecificationResponse>(_ChangeSpecificationResponse_QNAME, ChangeSpecificationResponse.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "deleteCar")
    public JAXBElement<DeleteCar> createDeleteCar(DeleteCar value) {
        return new JAXBElement<DeleteCar>(_DeleteCar_QNAME, DeleteCar.class, null, value);
    }


    @XmlElementDecl(namespace = "http://server/", name = "deleteCarResponse")
    public JAXBElement<DeleteCarResponse> createDeleteCarResponse(DeleteCarResponse value) {
        return new JAXBElement<DeleteCarResponse>(_DeleteCarResponse_QNAME, DeleteCarResponse.class, null, value);
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
