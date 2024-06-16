package com.soapdemo.demo.config;

import com.soapdemo.demo.jaxbmodel.ListOfCountryNamesByName;
import com.soapdemo.demo.jaxbmodel.ListOfCountryNamesByNameResponse;
import com.soapdemo.demo.jaxbmodel.ObjectFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CountryClient extends WebServiceGatewaySupport {
    public ListOfCountryNamesByNameResponse getCountry(String code) {

        ListOfCountryNamesByName jaxbContext = new ObjectFactory().createListOfCountryNamesByName();

        ListOfCountryNamesByName request = new ListOfCountryNamesByName();

        ListOfCountryNamesByNameResponse response = (ListOfCountryNamesByNameResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        return response;
    }
}
