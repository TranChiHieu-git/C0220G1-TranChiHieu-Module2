package CaseStudy.FuramaResort.Models;

public class Room extends Services {
    private String freeServices = "\n\t1.Khăn lạnh miễn phí \n" +
            "\t2.Nước mát miễn phí";

    public Room(String id, String nameServices, double areaUsed, double rental, int maxNumberOfPeople,
                String typeOfRent) {
        super(id, nameServices, areaUsed, rental, maxNumberOfPeople, typeOfRent);
    }

    public String getFreeServices() {
        return freeServices;
    }


    @Override
    public String showInfor() {
        return "1.Mã dịch vụ: " + this.getId() + "\n"
                + "2.Tên dịch vụ: " + this.getNameServices() + "\n"
                + "3.Diện tích sử dụng: " + this.getAreaUsed() + " m2 " + "\n"
                + "4.Chi phí thuê: " + this.getRental() + "USD\n"
                + "5.Số người tối đa: " + this.getMaxNumberOfPeople() + " people " + "\n"
                + "6.Kiểu thuê: " + this.getTypeOfRent() + "\n"
                + "7.Dịch vụ miến phí đi kèm: " + this.getFreeServices();
    }
}
