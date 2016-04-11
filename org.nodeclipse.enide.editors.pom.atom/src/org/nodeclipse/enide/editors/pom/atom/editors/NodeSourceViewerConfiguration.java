package org.nodeclipse.enide.editors.pom.atom.editors;

import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.widgets.Shell;
import org.nodeclipse.enide.editors.pom.atom.highlight.CodeScanner;
import org.nodeclipse.enide.editors.pom.atom.highlight.PartitionScanner;
import org.nodeclipse.enide.editors.pom.atom.highlight.MultilineCommentScanner;

public class NodeSourceViewerConfiguration extends SourceViewerConfiguration {

    @Override
    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
        PresentationReconciler pr = new PresentationReconciler();
        pr.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
        
        CodeScanner scanner = new CodeScanner();
        setDamagerRepairer(pr, scanner, IDocument.DEFAULT_CONTENT_TYPE);
        setDamagerRepairer(pr, new MultilineCommentScanner(scanner.getCommentAttribute()), PartitionScanner.MULTILINE_COMMENT);
        setDamagerRepairer(pr, new MultilineCommentScanner(scanner.getDocAttribute()), PartitionScanner.GRADLEDOC);
        return pr;
    }

    private void setDamagerRepairer(PresentationReconciler pr, ITokenScanner scanner, String tokenType) {
        DefaultDamagerRepairer damagerRepairer = new DefaultDamagerRepairer(scanner);
        pr.setDamager(damagerRepairer, tokenType);
        pr.setRepairer(damagerRepairer, tokenType);
    }

    @Override
    public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
        return PartitionScanner.CONTENT_TYPES;
    }

//    @Override
//    public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
//        // TODO Preferences
//        ContentAssistant contentAssistant = new ContentAssistant();
//        contentAssistant.setInformationControlCreator(new IInformationControlCreator() {
//            public IInformationControl createInformationControl(Shell parent) {
//                DefaultInformationControl control = new DefaultInformationControl(parent, true);
//                return control;
//            }
//        });
//        contentAssistant.setContentAssistProcessor(new NodeContentAssistant(), IDocument.DEFAULT_CONTENT_TYPE);
//        contentAssistant.enableAutoActivation(true);
//        contentAssistant.setAutoActivationDelay(500);
//        return contentAssistant;
//    }

}
