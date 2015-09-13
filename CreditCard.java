/**
 * Created by Jeremy on 9/13/2015.
 */




public class CreditCard  {

    protected Long creditCardId;
    protected String state;
    protected String creditCardName;
    protected String userName;
    protected String email;
    protected Long createTime;
    protected String inputSource;
    protected String referenceId;
    protected Integer expirationMonth;
    protected Integer expirationYear;
    protected String lastFour;







    public void setCreditCardId(Long creditCardId) {
        this.creditCardId = creditCardId;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCreditCardName(String creditCardName) {
        this.creditCardName = creditCardName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public void setInputSource(String inputSource) {
        this.inputSource = inputSource;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
    }


    public CreditCard(Long creditCardId) {
        this.creditCardId = creditCardId;
    }

    public Long getCreditCardId() {
        return creditCardId;
    }

    public String getCreditCardName() {
        return creditCardName;
    }

    public String getState() {
        return state;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public long getCreateTime() {
        return createTime;
    }

    public String getInputSource() {
        return inputSource;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public String getLastFour() {
        return lastFour;
    }

}