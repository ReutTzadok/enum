package model;

import logic.*;

public enum CodeOfHttp {
    INFORMATIONAL(new Informational()),
    SUCCESS(new Success()),
    REDIRECTION(new Redirection()),
    CLIENT_ERROR( new ClientError()),
    SERVER_ERROR(new ServerError());

    private final DoSomething response;

    CodeOfHttp(DoSomething doSomething) {
        this.response = doSomething;
    }

    public DoSomething getDoSomething() {
        return response;
    }
}
