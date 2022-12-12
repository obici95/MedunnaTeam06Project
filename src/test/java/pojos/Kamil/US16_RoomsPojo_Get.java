package pojos.Kamil;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US16_RoomsPojo_Get {
    /*
{
"createdBy": "string",
"createdDate": "2022-08-19T08:50:53.127Z",
"description": "string",
"id": 0,
"price": 0,
"roomNumber": 0,
"roomType": "TWIN",
"status": true
}
*/
    private String  createdBy;
    private String  createdDate;
    private String  description;
    private Integer  id;
    private Integer  price;
    private Integer  roomNumber;
    private String  roomType;
    private Boolean  status;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
