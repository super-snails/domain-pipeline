package com.tsing.product.api.teambuilding.bo.request;import java.io.Serializable;/** * @author Tsing * @version 0.0.1 * @date 2021/8/1 5:32 下午 * @description: 修改团建游产品 */public class TeambuildingUpdateRequest implements Serializable {    private static final long serialVersionUID = 3177823751930877612L;    /**     * 主键     */    private Long id;    /**     * 名称     */    private String name;    /**     * 描述     */    private String description;    /**     * 白天 天数     */    private Integer day;    /**     * 夜晚 天数     */    private Integer night;    /**     * 最少人数     */    private Integer minPeople;    /**     * 最多人数     */    private Integer maxPeople;    /**     * 价格，用分来处理     */    private Integer price;    /**     * 封面图     */    private String coverPicture;    /**     * 费用包含     */    private String expenseDescritionContain;    /**     * 费用不包含     */    private String expenseDescritionNotContain;    /**     * 预定须知     */    private String bookingNotice;    /**     * 温馨提示     */    private String tips;    public TeambuildingUpdateRequest() {    }    public TeambuildingUpdateRequest(Long id, String name, String description, Integer day, Integer night, Integer minPeople, Integer maxPeople, Integer price, String coverPicture, String expenseDescritionContain, String expenseDescritionNotContain, String bookingNotice, String tips) {        this.id = id;        this.name = name;        this.description = description;        this.day = day;        this.night = night;        this.minPeople = minPeople;        this.maxPeople = maxPeople;        this.price = price;        this.coverPicture = coverPicture;        this.expenseDescritionContain = expenseDescritionContain;        this.expenseDescritionNotContain = expenseDescritionNotContain;        this.bookingNotice = bookingNotice;        this.tips = tips;    }    public Long getId() {        return id;    }    public void setId(Long id) {        this.id = id;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public String getDescription() {        return description;    }    public void setDescription(String description) {        this.description = description;    }    public Integer getDay() {        return day;    }    public void setDay(Integer day) {        this.day = day;    }    public Integer getNight() {        return night;    }    public void setNight(Integer night) {        this.night = night;    }    public Integer getMinPeople() {        return minPeople;    }    public void setMinPeople(Integer minPeople) {        this.minPeople = minPeople;    }    public Integer getMaxPeople() {        return maxPeople;    }    public void setMaxPeople(Integer maxPeople) {        this.maxPeople = maxPeople;    }    public Integer getPrice() {        return price;    }    public void setPrice(Integer price) {        this.price = price;    }    public String getCoverPicture() {        return coverPicture;    }    public void setCoverPicture(String coverPicture) {        this.coverPicture = coverPicture;    }    public String getExpenseDescritionContain() {        return expenseDescritionContain;    }    public void setExpenseDescritionContain(String expenseDescritionContain) {        this.expenseDescritionContain = expenseDescritionContain;    }    public String getExpenseDescritionNotContain() {        return expenseDescritionNotContain;    }    public void setExpenseDescritionNotContain(String expenseDescritionNotContain) {        this.expenseDescritionNotContain = expenseDescritionNotContain;    }    public String getBookingNotice() {        return bookingNotice;    }    public void setBookingNotice(String bookingNotice) {        this.bookingNotice = bookingNotice;    }    public String getTips() {        return tips;    }    public void setTips(String tips) {        this.tips = tips;    }    @Override    public String toString() {        return "TeambuildingUpdateRequest{" +                "id=" + id +                ", name='" + name + '\'' +                ", description='" + description + '\'' +                ", day=" + day +                ", night=" + night +                ", minPeople=" + minPeople +                ", maxPeople=" + maxPeople +                ", price=" + price +                ", coverPicture='" + coverPicture + '\'' +                ", expenseDescritionContain='" + expenseDescritionContain + '\'' +                ", expenseDescritionNotContain='" + expenseDescritionNotContain + '\'' +                ", bookingNotice='" + bookingNotice + '\'' +                ", tips='" + tips + '\'' +                '}';    }}