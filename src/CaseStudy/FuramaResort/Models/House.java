package CaseStudy.FuramaResort.Models;

public class House extends Services {
    private String roomStandard;
    private int numberOfFloors;

    public House(String id, String nameServices, double areaUsed, double rental, int maxNumberOfPeople,
                 String typeOfRent, String roomStandard, int numberOfFloors) {
        super(id, nameServices, areaUsed, rental, maxNumberOfPeople, typeOfRent);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getDescriptionOfOtherAmenities() {
        return this.getOtherAmenities();
    }

    @Override
    public String showInfor() {
        return "1.Mã dịch vụ: " + this.getId() + "\n"
                + "2.Tên dịch vụ: " + this.getNameServices() + "\n"
                + "3.Diện tích sử dụng: " + this.getAreaUsed() + " m2 " + "\n"
                + "4.Chi phí thuê: " + this.getRental() + "USD\n"
                + "5.Số người tối đa: " + this.getMaxNumberOfPeople() + " people " + "\n"
                + "6.Kiểu thuê: " + this.getTypeOfRent() + "\n"
                + "7.Tiêu Chuẩn Phòng: " + this.getRoomStandard() + "\n"
                + "8.Tiện nghi khác: " + this.getDescriptionOfOtherAmenities() + "\n"
                + "9.Số tầng: " + this.getNumberOfFloors() + " tầng ";
    }
}
