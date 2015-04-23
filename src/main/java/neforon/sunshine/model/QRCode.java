package neforon.sunshine.model;

/**
 * Created by sunshine on 4/23/15.
 */
public class QRCode {
    private Integer id;
    private String projectId;
    private String qrPath;

    public QRCode() {

    }

    public QRCode(String projectId, String qrPath) {
        this.projectId = projectId;
        this.qrPath = qrPath;
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

    public String getQrPath() {
        return qrPath;
    }

    public void setQrPath(String qrPath) {
        this.qrPath = qrPath;
    }
}
