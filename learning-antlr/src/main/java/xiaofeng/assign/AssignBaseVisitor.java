// Generated from D:/IdeaSpace/learning-java/learning-antlr/src/main/resources\Assign.g4 by ANTLR 4.7
package xiaofeng.assign;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link AssignVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class AssignBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements AssignVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(AssignParser.ExprContext ctx) { return visitChildren(ctx); }
}