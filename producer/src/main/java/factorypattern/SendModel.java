package factorypattern;

import java.io.Serializable;

/**
 * @author long
 * @Description
 * @date 2018-03-28 17:08
 */
public class SendModel implements Serializable {

    private String mobile;

    private String content;

    public SendModel() {
    }

    public SendModel(String mobile, String content) {
        this.mobile = mobile;
        this.content = content;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
