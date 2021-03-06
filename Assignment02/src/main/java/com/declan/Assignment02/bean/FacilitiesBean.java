package com.declan.Assignment02.bean;

public class FacilitiesBean {
    public String Facility_Type;
    public String License_Number;
    public String Entity_Name;
    public String Camis_Trade_Name;
    public String Address_Bldg;
    public String Address_Street_Name;
    public String Address_Location;
    public String Address_City;
    public String Address_State;
    public String Address_Zip_Code;
    public String Telephone_Number;
    public String Number_of_Spaces;

    @Override
    public String toString() {
        return "FacilitiesBean{" +
                "Facility_Type='" + Facility_Type + '\'' +
                ", License_Number='" + License_Number + '\'' +
                ", Entity_Name='" + Entity_Name + '\'' +
                ", Camis_Trade_Name='" + Camis_Trade_Name + '\'' +
                ", Address_Bldg='" + Address_Bldg + '\'' +
                ", Address_Street_Name='" + Address_Street_Name + '\'' +
                ", Address_Location='" + Address_Location + '\'' +
                ", Address_City='" + Address_City + '\'' +
                ", Address_State='" + Address_State + '\'' +
                ", Address_Zip_Code='" + Address_Zip_Code + '\'' +
                ", Telephone_Number='" + Telephone_Number + '\'' +
                ", Number_of_Spaces='" + Number_of_Spaces + '\'' +
                '}';
    }

    public String getFacility_Type() {
        return Facility_Type;
    }

    public void setFacility_Type(String facility_Type) {
        Facility_Type = facility_Type;
    }

    public String getLicense_Number() {
        return License_Number;
    }

    public void setLicense_Number(String license_Number) {
        License_Number = license_Number;
    }

    public String getEntity_Name() {
        return Entity_Name;
    }

    public void setEntity_Name(String entity_Name) {
        Entity_Name = entity_Name;
    }

    public String getCamis_Trade_Name() {
        return Camis_Trade_Name;
    }

    public void setCamis_Trade_Name(String camis_Trade_Name) {
        Camis_Trade_Name = camis_Trade_Name;
    }

    public String getAddress_Bldg() {
        return Address_Bldg;
    }

    public void setAddress_Bldg(String address_Bldg) {
        Address_Bldg = address_Bldg;
    }

    public String getAddress_Street_Name() {
        return Address_Street_Name;
    }

    public void setAddress_Street_Name(String address_Street_Name) {
        Address_Street_Name = address_Street_Name;
    }

    public String getAddress_Location() {
        return Address_Location;
    }

    public void setAddress_Location(String address_Location) {
        Address_Location = address_Location;
    }

    public String getAddress_City() {
        return Address_City;
    }

    public void setAddress_City(String address_City) {
        Address_City = address_City;
    }

    public String getAddress_State() {
        return Address_State;
    }

    public void setAddress_State(String address_State) {
        Address_State = address_State;
    }

    public String getAddress_Zip_Code() {
        return Address_Zip_Code;
    }

    public void setAddress_Zip_Code(String address_Zip_Code) {
        Address_Zip_Code = address_Zip_Code;
    }

    public String getTelephone_Number() {
        return Telephone_Number;
    }

    public void setTelephone_Number(String telephone_Number) {
        Telephone_Number = telephone_Number;
    }

    public String getNumber_of_Spaces() {
        return Number_of_Spaces;
    }

    public void setNumber_of_Spaces(String number_of_Spaces) {
        Number_of_Spaces = number_of_Spaces;
    }
}
