package logic;

import model.CodeOfHttp;

import java.util.Arrays;
import java.util.List;

public class CodeOfHTTPFactory {
    private static final List<CodeOfHttp> statusList = Arrays.asList(CodeOfHttp.values());

    public static CodeOfHttp findStatusByCode(int i) {
        int index = (i / 100) - 1;

        if (index < statusList.size())
            return statusList.get(index);
        else
            throw new IllegalStateException(i + " not supported");
    }

}
