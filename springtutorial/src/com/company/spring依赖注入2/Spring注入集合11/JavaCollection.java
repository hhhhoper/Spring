package com.company.spring依赖注入2.Spring注入集合11;
import java.util.*;
import java.util.Properties;

public class JavaCollection {
    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addressProp;
    //a setter method to set List
    public void setAddressList(List addressList){
        this.addressList=addressList;
    }
    //prints and returns all the elements of the elements of list.
    public List getAddressList(){
        System.out.println("List Elements:"+addressList);
        return addressList;
    }
    //a setter method to set Map
    public void setAddressMap(Map addressMap){
        this.addressMap=addressMap;
    }
    //prints and returns all the elements of the Map.
    public Map getAddressMap(){
        System.out.println("Map Elements:"+addressMap);
        return addressMap;
    }
    //a setter method to set Property
    public void setAddressProp(Properties addressProp){
        this.addressProp=addressProp;
    }
    //prints and returns all the elements of the Property.
    public Properties getAddressProp(){
        System.out.println("Property Elements:"+addressProp);
        return addressProp;
    }
    //a setter method to set set
    public void setAddressSet(Set addressSet){
        this.addressSet=addressSet;
    }
    //prints and returns all the elements of the set
    public Set getAddressSet(){
        System.out.println("Set Elements:"+addressSet);
        return addressSet;
    }
}
