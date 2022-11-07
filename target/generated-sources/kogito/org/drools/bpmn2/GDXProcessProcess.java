package org.drools.bpmn2;

import org.drools.bpmn2.GDXProcessModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("GDXProcess")
@io.quarkus.runtime.Startup()
public class GDXProcessProcess extends org.kie.kogito.process.impl.AbstractProcess<org.drools.bpmn2.GDXProcessModel> {

    @javax.inject.Inject()
    public GDXProcessProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public GDXProcessProcess() {
    }

    @Override()
    public org.drools.bpmn2.GDXProcessProcessInstance createInstance(org.drools.bpmn2.GDXProcessModel value) {
        return new org.drools.bpmn2.GDXProcessProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.drools.bpmn2.GDXProcessProcessInstance createInstance(java.lang.String businessKey, org.drools.bpmn2.GDXProcessModel value) {
        return new org.drools.bpmn2.GDXProcessProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.drools.bpmn2.GDXProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.drools.bpmn2.GDXProcessModel value) {
        return new org.drools.bpmn2.GDXProcessProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.drools.bpmn2.GDXProcessModel createModel() {
        return new org.drools.bpmn2.GDXProcessModel();
    }

    public org.drools.bpmn2.GDXProcessProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.drools.bpmn2.GDXProcessModel) value);
    }

    public org.drools.bpmn2.GDXProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.drools.bpmn2.GDXProcessModel) value);
    }

    public org.drools.bpmn2.GDXProcessProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.drools.bpmn2.GDXProcessProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.drools.bpmn2.GDXProcessProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.drools.bpmn2.GDXProcessProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("GDXProcess", true);
        factory.name("GDX Process");
        factory.packageName("org.drools.bpmn2");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://bpmn.io/schema/bpmn");
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode1 = factory.startNode(1);
        startNode1.name("Start");
        startNode1.interrupting(false);
        startNode1.metaData("UniqueId", "StartEvent_1");
        startNode1.metaData("x", 179);
        startNode1.metaData("width", 36);
        startNode1.metaData("y", 99);
        startNode1.metaData("height", 36);
        startNode1.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode2 = factory.humanTaskNode(2);
        humanTaskNode2.name("DGX task 1");
        humanTaskNode2.workParameter("NodeName", "DGX task 1");
        humanTaskNode2.done();
        humanTaskNode2.metaData("UniqueId", "Activity");
        humanTaskNode2.metaData("x", 322);
        humanTaskNode2.metaData("width", 100);
        humanTaskNode2.metaData("y", 77);
        humanTaskNode2.metaData("height", 80);
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode3 = factory.humanTaskNode(3);
        humanTaskNode3.name("GDX task 2");
        humanTaskNode3.workParameter("NodeName", "GDX task 2");
        humanTaskNode3.done();
        humanTaskNode3.metaData("UniqueId", "Activity_1lbtyew");
        humanTaskNode3.metaData("x", 570);
        humanTaskNode3.metaData("width", 100);
        humanTaskNode3.metaData("y", 90);
        humanTaskNode3.metaData("height", 80);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode4 = factory.endNode(4);
        endNode4.name("End");
        endNode4.terminate(false);
        endNode4.metaData("UniqueId", "Event_01nz9mq");
        endNode4.metaData("x", 822);
        endNode4.metaData("width", 36);
        endNode4.metaData("y", 112);
        endNode4.metaData("height", 36);
        endNode4.done();
        factory.connection(1, 2, "Flow_0n67iar");
        factory.connection(2, 3, "Flow_0ml91y0");
        factory.connection(3, 4, "Flow_1gsl00f");
        factory.validate();
        return factory.getProcess();
    }
}
