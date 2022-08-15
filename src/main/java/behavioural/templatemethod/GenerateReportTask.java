package behavioural.templatemethod;

/*
   The problem here is Code Duplication. Every time we create new task we should follow
   This structure: we should add private filed of AuditTrail and init with Constructor.

   The second problem is nobody is forcing us to follow this structure.
   What if we create a new task class without following the structure,
   the task is not going to record the current task and the auditTrail.
 */
public class GenerateReportTask {
    private final AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Generate Report");
    }
}
