package cn.liuxianglin.study.springboot.common.constant.e;

/**
 * <p>
 * 性别枚举
 * </p>
 *
 * @author LiuXiangLin
 * @date 2021/12/15 16:30
 * @since 1.0
 */
public enum GenderEnum {
    OTHER(0, "其他"),
    MALE(1, "男"),
    FEMALE(2, "女");

    private final Integer code;
    private final String name;

    GenderEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
