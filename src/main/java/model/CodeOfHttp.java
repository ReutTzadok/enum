package model;

import logic.*;

import java.util.List;

public enum CodeOfHttp {
    INFORMATIONAL(1, new Informational()),
    SUCCESS(2, new Success()),
    REDIRECTION(3, new Redirection()),
    CLIENT_ERROR(4, new ClientError()),
    SERVER_ERROR(5, new ServerError());

    private final int index;
    private final DoSomething response;

    CodeOfHttp(int i, DoSomething doSomething) {
        index = i;
        this.response = doSomething;
    }

    public int getIndex() {
        return index;
    }

    public DoSomething getDoSomething() {
        return response;
    }
}
