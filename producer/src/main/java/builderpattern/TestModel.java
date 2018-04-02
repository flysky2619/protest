package builderpattern;

import java.io.Serializable;

/**
 * @author long
 * @Description
 * @date 2018-03-28 17:08
 */
public class TestModel implements Serializable {

    private String mobile;

    private String content;

    private TestModel(Builder builder) {
        this.content = builder.content;
        this.mobile = builder.mobile;
    }

    public static class Builder {
        private String mobile;

        private String content;

        public Builder() {
        }

        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public TestModel build() {
            return new TestModel(this);
        }
    }
}
