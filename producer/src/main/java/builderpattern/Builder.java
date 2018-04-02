package builderpattern;

import com.alibaba.fastjson.JSON;
import factorypattern.EmailSender;
import factorypattern.SendModel;
import factorypattern.Sender;
import factorypattern.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @author long
 * @Description
 * @date 2018-04-02 10:52
 * <p>
 * <p>
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性
 * <p>
 * 工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分
 */
public class Builder {

    private List<Sender> senderList = new ArrayList<>();

    public void producerSmsSender(int num) {
        for (int i = 0; i < num; i++) {
            SmsSender smsSender = new SmsSender();
            senderList.add(smsSender);
        }
    }

    public void producerEmailSender(int num) {
        for (int i = 0; i < num; i++) {
            EmailSender emailSender = new EmailSender();
            senderList.add(emailSender);
        }
    }

    public List<Sender> getSenderList() {
        return senderList;
    }

    public static void main(String[] args) {
        TestModel ceshiyxiia = new TestModel.Builder().content("ceshiyxiia").build();
        TestModel build = new TestModel.Builder().mobile("17338155173").build();
        TestModel dajiahao = new TestModel.Builder().mobile("123456789").content("dajiahao").build();

        SendModel sendModel = new SendModel("123", "456");
        System.out.println(JSON.toJSONString(sendModel));

        System.out.println(JSON.toJSONString(ceshiyxiia));
        System.out.println(JSON.toJSONString(build));
        System.out.println(JSON.toJSONString(dajiahao));
    }
}
