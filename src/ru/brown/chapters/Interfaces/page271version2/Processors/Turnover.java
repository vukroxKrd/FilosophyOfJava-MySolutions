package ru.brown.chapters.Interfaces.page271version2.Processors;

public class Turnover extends StringProcessor {

    @Override
    public String name() {
        return ("Turnover ");
    }

    @Override
    public String process(Object input) {
        String turnStr = (String) input;
        char[] toProcess = turnStr.toCharArray();
        for (int i = 0; i < toProcess.length - 1; i = i + 2) {
            char hold = toProcess[i];
            toProcess[i] = toProcess[i + 1];
            toProcess[i + 1] = hold;
        }
        String result = String.valueOf(toProcess);
        return result;
    }
}
