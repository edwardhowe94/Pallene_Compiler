package syntaxTree.statement.Conditional;

import syntaxTree.Statement;
import visitor.CVisitor;
import visitor.SemanticVisitor;

public class IF_THEN_ELSE extends Statement {

    public IF_THEN_ELSE(String name) {
        super(name);
    }
    @Override
    public Object accept(CVisitor visitor) {
        return visitor.visit(this);
    }
    @Override
    public Object accept(SemanticVisitor visitor) {
        return visitor.visit(this);
    }

}
