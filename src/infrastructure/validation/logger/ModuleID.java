<<<<<<< HEAD
/**
 * 
 */
package infrastructure.validation.logger;

/**
 * @author Navaneeth M Nambiar
 *
 */

public enum ModuleID {
	NETWORKING,
	PROCESSING,
	UI,
=======
package infrastructure.validation.logger;

/**
 * The ILogger interface depends on the ModuleID enum
 * The ModuleID enum helps specify which module is calling the log
 *   
 * @author Navaneeth M Nambiar
 */

public enum ModuleID {
	
	/** NETWORKING refers to the Networking module */
	NETWORKING,
	
	/** PROCESSING refers to the Processing module */
	PROCESSING,
	
	/** UI refers to the UI module */
	UI,
	
	/** Infrastructure refers to the Infrastructure module */
>>>>>>> upstream/74_test_harness
	INFRASTRUCTURE
}