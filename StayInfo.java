import java.sql.Time;
import java.util.Date;

/**
 * Created by Jeremy on 9/13/2015.
 */
public class StayInfo {
    private Date arrivalDate;
    private Time arrivalTime;
    private Date departureDate;
    private Time departureTime;
    private String rateType;
    private Integer numberOfDays;
    private Integer adult, child;

    public Integer getNumberofdays() {
        return numberOfDays;
    }

    public void setNumberofdays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Integer getAdult() {
        return adult;
    }

    public void setAdult(Integer adult) {
        this.adult = adult;
    }

    public Integer getChild() {
        return child;
    }

    public void setChild(Integer child) {
        this.child = child;
    }




    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public String getRateType() {
        return rateType;
    }

    public void setRateType(String rateType) {
        this.rateType = rateType;
    }



}
