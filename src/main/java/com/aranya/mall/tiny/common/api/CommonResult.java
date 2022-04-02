package com.aranya.mall.tiny.common.api;

/**
 * 返回信息公用
 */
public class CommonResult<T> {
    /**
     * 状态吗
     */
    private Long code;
    /**
     * 返回的信息
     */
    private String message;
    /**
     * 数据封装
     */
    private T data;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    protected CommonResult(){
    }
    protected CommonResult(long code, String message, T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }

    /**
     * 成功返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static<T> CommonResult<T> success(T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(),data);
    }

    /**
     * 失败返回结果
     * @param errorCode
     * @param <T>
     * @return
     */
    public static<T> CommonResult<T> failed(IErrorCode errorCode){
        return new CommonResult<T>(errorCode.getCode(),errorCode.getMessage(),null);
    }

    /**
     * 失败参数问题
     * @param <T>
     * @param validateFailed
     * @return
     */
    public static<T> CommonResult<T> validateFailed(ResultCode validateFailed){
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 未登录
     * @param data
     * @param <T>
     * @return
     */
    public static<T> CommonResult<T> unauthorized(T data){
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权
     * @param data
     * @param <T>
     * @return
     */
    public static<T> CommonResult<T> forbidden(T data){
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }

    /**
     * 自定义失败信息
     * @param
     * @param <T>
     * @return
     */
    public static<T> CommonResult<T> fail(long code, String message, T data){
        return new CommonResult<T>(code,message,data);
    }


}
