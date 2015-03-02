/**
 *
 * $Id$
 */
package ReqModel.validation;

import ReqModel.Priority;
import ReqModel.Requirement;

/**
 * A sample validator interface for {@link ReqModel.Requirement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RequirementValidator {
	boolean validate();

	boolean validateId(String value);
	boolean validateDescription(String value);
	boolean validateRefine(Requirement value);
	boolean validateDependencyTo(Requirement value);
	boolean validatePriorityType(Priority value);
}