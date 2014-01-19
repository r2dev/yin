package org.yinwang.yin.ast;


public class Fun extends Node {
    public Parameter params;
    public Node body;


    public Fun(Parameter params, Node body, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.params = params;
        this.body = body;
    }


    public String toString() {
        return "(fun (" + params + ") " + body + ")";
    }

}