package behavioural.templatemethod;

public abstract class Task {
    private final AuditTrail auditTrail;

    protected Task() {
        auditTrail = new AuditTrail();
    }

    protected Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
