package org.drools.bpmn2;

import org.drools.bpmn2.GDXProcessModel;

public class GDXProcessProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<GDXProcessModel> {

    public GDXProcessProcessInstance(org.drools.bpmn2.GDXProcessProcess process, GDXProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public GDXProcessProcessInstance(org.drools.bpmn2.GDXProcessProcess process, GDXProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public GDXProcessProcessInstance(org.drools.bpmn2.GDXProcessProcess process, GDXProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public GDXProcessProcessInstance(org.drools.bpmn2.GDXProcessProcess process, GDXProcessModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public GDXProcessProcessInstance(org.drools.bpmn2.GDXProcessProcess process, GDXProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(GDXProcessModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(GDXProcessModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
