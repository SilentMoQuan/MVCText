package cn.moquan.util;

/**
 * describe
 *
 * @author wangyuanhong
 * @date 2021/10/20
 */
public class ResponseTool {

    public static CommonResponseBody simpleCommonResponseBody(boolean flag){
        if(flag){
            return new CommonResponseBody(StatusNumber.SUCCESS);
        }else{
            return new CommonResponseBody(StatusNumber.FAILED);
        }
    }

}
