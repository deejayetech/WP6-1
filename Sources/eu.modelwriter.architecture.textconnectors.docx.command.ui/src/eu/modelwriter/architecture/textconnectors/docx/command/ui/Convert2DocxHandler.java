package eu.modelwriter.architecture.textconnectors.docx.command.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import ReqModel.Product;
import eu.modelwriter.architecture.textconnectors.docx.Docx2ReqModelConverter;
import eu.modelwriter.architecture.textconnectors.docx.ReqModel2DocxConverter;

public class Convert2DocxHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) {
		// TODO Auto-generated method stub

		XWPFDocument document = new XWPFDocument();
		FileOutputStream out = null;
		
		// Shell shell = HandlerUtil.getActiveShell(event);
		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		IStructuredSelection selection = (IStructuredSelection) sel;

		
		Object firstElement = selection.getFirstElement();

		if(firstElement instanceof IResource){

			IResource iresource = (IResource) Platform.getAdapterManager().getAdapter(firstElement, IResource.class);

			if (iresource == null) {
				if (firstElement instanceof IAdaptable) {
					iresource = (IFile) ((IAdaptable) firstElement).getAdapter(IResource.class);
				}
			}

			if (iresource != null) {
	
				try {
					// cast exception
					//Resource r = (Resource)iresource.getLocation().toFile();
					//Resource r = (Resource)iresource;
					String locationString = iresource.getLocation().toString();
					String loc = "file:///" + locationString;
					
					String[] locationParts = locationString.split("/");
					
					String newLoc = "";
					
					for(int i = 0;i < locationParts.length; i++){
					
						if(!locationParts[i].equals(iresource.getName())){
							
							newLoc += locationParts[i] + "/";
						}else{
							String[] name = locationParts[i].split("\\.");
							newLoc += "RequirementModel.docx";
						}
					}
					
					try {
						out = new FileOutputStream(new File(newLoc));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					URI uri = URI.createURI(loc);
					
					ResourceSet resourceSet = new ResourceSetImpl();

					// register UML
					Map packageRegistry = resourceSet.getPackageRegistry();
					packageRegistry.put(ReqModel.ReqModelPackage.eNS_URI, 
							ReqModel.ReqModelPackage.eINSTANCE);

					// Register XML resource as UMLResource.Factory.Instance
					Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
					extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
					
					document = ReqModel2DocxConverter.Convert((Resource)resourceSet.createResource(uri));
					
					document.write(out);
					out.close();
					
					/*
					 * document = new XWPFDocument(new FileInputStream(f));					
					
					Product p = Docx2ReqModelConverter.Convert(document);
					createXMIFile(p,newLoc);
					
					 */
					
					//Product p = Docx2ReqModelConverter.Convert(f);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}


		}
		return null;

	}
	
	/**
	 * Saves the model instance and writes it to xmi file
	 * 
	 * @param product
	 */
	private static void createXMIFile(Product product, String location) {

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML Factory implementation using xmi extension
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"xmi", new  XMLResourceFactoryImpl());


		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createURI(location));


		// Add Product to contents list of the resource 

		resource.getContents().add(product);

		try{

			// Save the resource
			//resource.save(System.out, Collections.EMPTY_MAP); 
			resource.save(null);
			

		}catch (IOException e) {

			e.printStackTrace();
		}
		
		
				
	}

}
