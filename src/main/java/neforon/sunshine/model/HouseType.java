package neforon.sunshine.model;

/**
 * Created by sunshine on 4/24/15.
 */
public class HouseType {
    private Integer id;
    private String projectId;
    private String housePicPath;
    private String address;

    public HouseType() {

    }

    public HouseType(String projectId, String housePicPath, String address) {
        this.projectId = projectId;
        this.housePicPath = housePicPath;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getHousePicPath() {
        return housePicPath;
    }

    public void setHousePicPath(String housePicPath) {
        this.housePicPath = housePicPath;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
