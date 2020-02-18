
package dam107t3e10;

import dam107t3e9.*;

/**
 *
 * @author dam107
 */
public interface Saltador {
    int saltarAltura();
    default boolean saltoPertiga(int cm){
        return false;
    }
}
