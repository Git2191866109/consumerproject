package com.mw.consumer.mvc;

import java.io.Serializable;

/**
 * Created by wei.ma on 2016/9/14.
 * consumer自定义响应结构
 */
public class ConsuResult implements Serializable {

    /*响应业务状态*/
    private Integer status;

    /*响应消息*/
    private String msg;

    /*响应中的数据*/
    private Object data;

    public static ConsuResult build(Integer status, String msg, Object data) {
        return new ConsuResult(status, msg, data);
    }

    public static ConsuResult ok(Object data) {
        return new ConsuResult(data);
    }

    public static ConsuResult ok() {
        return new ConsuResult(null);
    }

    public ConsuResult() {

    }

    public static ConsuResult build(Integer status, String msg) {
        return new ConsuResult(status, msg, null);
    }

    public ConsuResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ConsuResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为ConsuResult对象
     *
     * @param jsonData json数据
     * @param clazz    ConsuResult中的object类型
     * @return
     */
    public static ConsuResult formatToPojo(String jsonData, Class<?> clazz) {
//        try {
//            if (clazz == null) {
//                return MAPPER.readValue(jsonData, ConsuResult.class);
//            }
//            JsonNode jsonNode = MAPPER.readTree(jsonData);
//            JsonNode data = jsonNode.get("data");
//            Object obj = null;
//            if (clazz != null) {
//                if (data.isObject()) {
//                    obj = MAPPER.readValue(data.traverse(), clazz);
//                } else if (data.isTextual()) {
//                    obj = MAPPER.readValue(data.asText(), clazz);
//                }
//            }
//            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
//        } catch (Exception e) {
        return null;
//        }
    }

    /**
     * 没有object对象的转化
     *
     * @param json
     * @return
     */
    public static ConsuResult format(String json) {
//        try {
//            return MAPPER.readValue(json, ConsuResult.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return null;
    }

    /**
     * Object是集合转化
     *
     * @param jsonData json数据
     * @param clazz    集合中的类型
     * @return
     */
    public static ConsuResult formatToList(String jsonData, Class<?> clazz) {
//        try {
//            JsonNode jsonNode = MAPPER.readTree(jsonData);
//            JsonNode data = jsonNode.get("data");
//            Object obj = null;
//            if (data.isArray() && data.size() > 0) {
//                obj = MAPPER.readValue(data.traverse(),
//                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
//            }
//            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
//        } catch (Exception e) {
        return null;
//        }
    }

}

