package org.nodeclipse.enide.editors.pom.atom.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.nodeclipse.enide.editors.pom.atom.Activator;

/**
 * @author Benjamin gurok
 * @author Paul Verest
 */
public class EditorPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private ColorFieldEditor colorComment;
    private ColorFieldEditor colorDoc;
    private ColorFieldEditor colorKeyword;
    private ColorFieldEditor colorString;
    private ColorFieldEditor colorNumber;
    private ColorFieldEditor colorNormal;
    private BooleanFieldEditor boldAttributeKeyword;
    
    public EditorPreferencePage() {
        super(GRID);
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        setPreferenceStore(store);
        setDescription(Constants.DESCRIPTION);
        setImageDescriptor(Activator.getImageDescriptor(Constants.ICON_PATH));
    }
	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected void createFieldEditors() {
		
	    Composite parent = getFieldEditorParent();

        colorComment = new ColorFieldEditor(Constants.KEY_COLOR_COMMENT, "Comment color:", parent);
        addField(colorComment);

        colorDoc = new ColorFieldEditor(Constants.KEY_COLOR_DOC, "Doc color:", parent);
        addField(colorDoc);

        colorKeyword = new ColorFieldEditor(Constants.KEY_COLOR_KEYWORD, "Keyword color:", parent);
        addField(colorKeyword);

        boldAttributeKeyword = new BooleanFieldEditor(Constants.KEY_BOLD_KEYWORD, "Bold keywords", parent);
        addField(boldAttributeKeyword);

        colorString = new ColorFieldEditor(Constants.KEY_COLOR_STRING, "String color:", parent);
        addField(colorString);

        colorNumber = new ColorFieldEditor(Constants.KEY_COLOR_NUMBER, "Number color:", parent);
        addField(colorNumber);

        colorNormal = new ColorFieldEditor(Constants.KEY_COLOR_NORMAL, "Normal text color:", parent);
        addField(colorNormal);
	}


}
