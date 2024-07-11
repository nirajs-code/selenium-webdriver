package stepdef;

import enums.Contexts;

import java.util.HashMap;
import java.util.Map;

public class TestScenarioContext {
    private Map<String, Object> scenarioContext;

    public TestScenarioContext() {
        scenarioContext = new HashMap<>();
    }

    public void setContext(Contexts key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public Object getContext(Contexts key) {
        return scenarioContext.get(key.toString());
    }

    public Boolean isContains(Contexts key) {
        return scenarioContext.containsKey(key.toString());
    }
}
