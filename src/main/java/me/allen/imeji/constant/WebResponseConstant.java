package me.allen.imeji.constant;

import com.google.gson.JsonObject;
import org.jglue.fluentjson.JsonBuilderFactory;

public class WebResponseConstant {

    public static final JsonObject INCORRECT_CONTENT_FORM = JsonBuilderFactory
            .buildObject()
            .add("code", 400)
            .add("message", "Bad Content")
            .add("description", "Please check your input form for server to correctly read it")
            .getJson();

    public static final JsonObject IMAGE_DOES_NOT_EXIST = JsonBuilderFactory
            .buildObject()
            .add("code", 404)
            .add("message", "Image Doesn't Exist")
            .add("description", "The specified image cannot be found on server, maybe it has expired or deleted?")
            .getJson();

    public static final JsonObject IMAGE_UPLOAD_SUCCESS = JsonBuilderFactory
            .buildObject()
            .add("code", 200)
            .add("message", "Image Upload Success")
            .add("description", "The specified image has been successfully uploaded :)")
            .getJson();

}
