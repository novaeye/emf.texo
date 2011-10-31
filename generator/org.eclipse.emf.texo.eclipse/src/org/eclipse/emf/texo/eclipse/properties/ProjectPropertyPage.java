/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ProjectPropertyPage.java,v 1.6 2011/09/24 06:48:00 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.properties;

import java.util.Properties;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.texo.eclipse.Messages;
import org.eclipse.emf.texo.eclipse.ProjectPropertyUtil;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.PropertyPage;

/**
 * PropertyPage for Texo project properties. Controls the output location.
 * 
 * @author mtaal
 */
public class ProjectPropertyPage extends PropertyPage {

  private static final int TEXT_FIELD_WIDTH = 50;

  private Text outputFolderText;
  private Button outputFolderButton;

  private Text templateFolderText;
  private Button templateFolderButton;

  private IProject project;

  /**
   * Constructor for Property page.
   */
  public ProjectPropertyPage() {
    super();
  }

  private void setOutputFolder(IFolder outputFolder) {
    if (outputFolder == null) {
      outputFolderText.setText(project.getProjectRelativePath()
          .append(ProjectPropertyUtil.GEN_OUTPUT_FOLDER_PROPERTY_DEFAULT).toPortableString());
    } else {
      outputFolderText.setText(outputFolder.getProjectRelativePath().toPortableString());
    }
  }

  private void setTemplateFolder(IFolder templateFolder) {
    if (templateFolder == null) {
      templateFolderText.setText(null);
    } else {
      templateFolderText.setText(templateFolder.getProjectRelativePath().toPortableString());
    }
  }

  /**
   * @see PreferencePage#createContents(Composite)
   */
  @Override
  protected Control createContents(Composite parent) {
    project = ProjectPropertyUtil.getProject(getElement());

    Composite composite = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    composite.setLayout(layout);
    GridData data = new GridData(GridData.FILL);
    data.grabExcessHorizontalSpace = true;
    composite.setLayoutData(data);

    createFields(composite);
    return composite;
  }

  private void createFields(Composite parent) {
    final Composite composite = createDefaultComposite(parent);

    final Properties projectProps = ProjectPropertyUtil.getProjectProperties(project);

    final Label outputFolderLabel = new Label(composite, SWT.LEFT);
    outputFolderLabel.setText(Messages.getString("project.output.folder.label")); //$NON-NLS-1$

    outputFolderText = new Text(composite, SWT.BORDER | SWT.LEFT | SWT.SINGLE | SWT.READ_ONLY);
    final GridData gd = new GridData();
    gd.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
    outputFolderText.setLayoutData(gd);
    outputFolderText.setText(projectProps.getProperty(ProjectPropertyUtil.OUTPUT_LOCATION_PROPERTY));

    outputFolderButton = new Button(composite, SWT.PUSH);
    outputFolderButton.setText(Messages.getString("browse")); //$NON-NLS-1$
    outputFolderButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        browseOutputFolder();
      }
    });

    final Label templateFolderLabel = new Label(composite, SWT.LEFT);
    templateFolderLabel.setText(Messages.getString("project.template.folder.label")); //$NON-NLS-1$

    templateFolderText = new Text(composite, SWT.BORDER | SWT.LEFT | SWT.SINGLE | SWT.READ_ONLY);
    final GridData templateFolderGd = new GridData();
    templateFolderGd.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
    templateFolderText.setLayoutData(templateFolderGd);
    templateFolderText.setText(getSafeValue(projectProps.getProperty(ProjectPropertyUtil.TEMPLATES_LOCATION_PROPERTY)));

    templateFolderButton = new Button(composite, SWT.PUSH);
    templateFolderButton.setText(Messages.getString("browse")); //$NON-NLS-1$
    templateFolderButton.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        browseTemplateFolder();
      }
    });
  }

  private void browseOutputFolder() {
    final ElementTreeSelectionDialog selectionDialog = new FolderSelectionDialog(Display.getCurrent().getActiveShell());
    selectionDialog.setTitle(Messages.getString("project.output.folder.select.title")); //$NON-NLS-1$
    selectionDialog.setMessage(Messages.getString("project.output.folder.select.message")); //$NON-NLS-1$
    selectionDialog.setBlockOnOpen(true);
    selectionDialog.setInput(project);
    selectionDialog.setInitialSelection(outputFolderText.getText());
    if (selectionDialog.open() == Window.OK) {
      setOutputFolder((IFolder) selectionDialog.getFirstResult());
    }
  }

  private void browseTemplateFolder() {
    final ElementTreeSelectionDialog selectionDialog = new FolderSelectionDialog(Display.getCurrent().getActiveShell());
    selectionDialog.setTitle(Messages.getString("project.template.folder.select.title")); //$NON-NLS-1$
    selectionDialog.setMessage(Messages.getString("project.template.folder.select.message")); //$NON-NLS-1$
    selectionDialog.setBlockOnOpen(true);
    selectionDialog.setInput(project);
    selectionDialog.setInitialSelection(templateFolderText.getText());
    if (selectionDialog.open() == Window.OK) {
      setTemplateFolder((IFolder) selectionDialog.getFirstResult());
    }
  }

  private Composite createDefaultComposite(Composite parent) {
    Composite composite = new Composite(parent, SWT.NULL);
    GridLayout layout = new GridLayout();
    layout.numColumns = 3;
    composite.setLayout(layout);

    GridData data = new GridData();
    data.verticalAlignment = GridData.FILL;
    data.horizontalAlignment = GridData.FILL;
    composite.setLayoutData(data);

    return composite;
  }

  @Override
  protected void performDefaults() {
    super.performDefaults();
    outputFolderText.setText(project.getProjectRelativePath()
        .append(ProjectPropertyUtil.GEN_OUTPUT_FOLDER_PROPERTY_DEFAULT).toPortableString());
    templateFolderText.setText(""); //$NON-NLS-1$
  }

  @Override
  public boolean performOk() {
    try {
      final String templateLocation;
      if (templateFolderText.getText().trim().length() == 0) {
        templateLocation = null;
      } else {
        templateLocation = templateFolderText.getText();
      }
      ProjectPropertyUtil.setProjectProperties(project, outputFolderText.getText(), templateLocation);
    } catch (Exception e) {
      return false;
    }
    return true;
  }

  private String getSafeValue(String value) {
    if (value == null) {
      return ""; //$NON-NLS-1$
    }
    return value;
  }
}
