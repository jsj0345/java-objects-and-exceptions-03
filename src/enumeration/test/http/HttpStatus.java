package enumeration.test.http;

public enum HttpStatus {
  OK(200, "OK"),
  BAD_REQUEST(400, "Bad Request"),
  NOT_FOUND(404, "Not Found"),
  INTERNAL_SERVER_ERROR(500, "Internal Server Error");

  private final int code;
  private final String message;

  private HttpStatus(int code, String message){
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  public static HttpStatus findByCode(int httpCodeInput) {
    HttpStatus[] httpStatuses = HttpStatus.values();

    HttpStatus address = null;

    for(int i=0; i<httpStatuses.length; i++){
      if(httpStatuses[i].code == httpCodeInput) {
        address = httpStatuses[i];
        break;
      }
    }

    return address;

  }

  public boolean isSuccess() {
    if(this.code >= 200 && this.code <=299){
      return true;
    } else {
      return false;
    }
  }

}

/*
values(): 모든 ENUM 상수를 포함하는 배열을 반환한다.
valueOf(String name): 주어진 이름과 일치하는 ENUM 상수를 반환한다.
name(): ENUM 상수의 이름을 문자열로 반환한다.
ordinal(): ENUM 상수의 선언 순서(0부터 시작)를 반환한다.
toString(): ENUM 상수의 이름을 문자열로 반환한다. name() 메서드와 유사하지만, toString() 은 직접
오버라이드 할 수 있다.
 */
