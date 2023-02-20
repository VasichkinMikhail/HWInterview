package ru.budharain.HW1.codeReview;

public class Engine {
    private String typeEngine;
    private String powerEngine;

    public Engine(String typeEngine, String powerEngine) {
        this.typeEngine = typeEngine;
        this.powerEngine = powerEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public String getPowerEngine() {
        return powerEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public void setPowerEngine(String powerEngine) {
        this.powerEngine = powerEngine;
    }
}
