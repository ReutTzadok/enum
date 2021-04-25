package logic;

import model.CodeOfHttp;

public class HttpCodeStrategy {
    public static void main(String[] args) {
        HttpCodeStrategy handleCode = new HttpCodeStrategy();
        handleCode.handleHttpCode(183);
        handleCode.handleHttpCode(294);
        handleCode.handleHttpCode(351);
        handleCode.handleHttpCode(472);
        handleCode.handleHttpCode(590);
        handleCode.handleHttpCode(99);
    }

    public void handleHttpCode(int httpCode) {
        //todo refactor and finish this method without using even one if statement

        CodeOfHttp status = CodeOfHTTPFactory.findStatusByCode(httpCode);
        status.getDoSomething().doSomething();

    }
}
