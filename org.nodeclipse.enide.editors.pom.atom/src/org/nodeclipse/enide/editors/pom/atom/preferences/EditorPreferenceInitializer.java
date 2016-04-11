package org.nodeclipse.enide.editors.pom.atom.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.nodeclipse.enide.editors.pom.atom.Activator;

/*
 * @author Benjamin gurok
 * @author Paul Verest
 */
public class EditorPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        PreferenceConverter.setDefault(store, Constants.KEY_COLOR_COMMENT, Constants.DEFAULT_COLOR_COMMENT);
        PreferenceConverter.setDefault(store, Constants.KEY_COLOR_DOC, Constants.DEFAULT_COLOR_DOC);
        PreferenceConverter.setDefault(store, Constants.KEY_COLOR_KEYWORD, Constants.DEFAULT_COLOR_KEYWORD);
        PreferenceConverter.setDefault(store, Constants.KEY_COLOR_STRING, Constants.DEFAULT_COLOR_STRING);
        PreferenceConverter.setDefault(store, Constants.KEY_COLOR_NUMBER, Constants.DEFAULT_COLOR_NUMBER);
        PreferenceConverter.setDefault(store, Constants.KEY_COLOR_NORMAL, Constants.DEFAULT_COLOR_NORMAL);
        store.setDefault(Constants.KEY_BOLD_KEYWORD, true);	}

}

