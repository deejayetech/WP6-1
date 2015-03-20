package com.modelwriter.architecture.textconnectors.docx.genparser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import DocModel.DocModelFactory;
import DocModel.Document;
import DocModel.Node;
import DocModel.Paragraph;

public class Doc2ParseModel {

<<<<<<< HEAD
	private final static String filename = "testdata/SampleRequirementDocument2.docx"; 

	private final static String output = "model/ParseModel.xmi";

=======
	private final static String filename = "C:/Users/2/Desktop/SampleRequirementDocument.docx"; 
	
	private final static String output = "model/ParseModel.xmi";
	
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6
	public static DocModelFactory factory;

	public static Iterator<XWPFParagraph> paraIter; 

	private static XWPFParagraph paragraph; 

	// Maps styles and their levels
	private static Map<String,Integer> headingMap;

	private static Document documentObject;

	// Stores levels 
	private static Stack<Paragraph> paragraphStack;

	// Maps requirement level object and their levels
	private static Map<Paragraph,Integer> paragraphLevelMap;

	public static boolean keyValue;

	public static void main(String[] args) throws IOException {

		paragraphStack = new Stack<Paragraph>();

		paragraphLevelMap = new HashMap<Paragraph,Integer>();

		headingMap = new HashMap<String,Integer>();

		initializeHeadingMap();

		factory = DocModelFactory.eINSTANCE;
		File file = null; 
		FileInputStream fis = null; 
		XWPFDocument document = null;
		List<XWPFParagraph> paraList = null; 
		file = new File(filename); 
		fis = new FileInputStream(file); 
		document = new XWPFDocument(fis); 
		paraList = document.getParagraphs(); 
		paraIter = paraList.iterator(); 
		documentObject = factory.createDocument();

		BigInteger numID = null; 
		int numberingID = -1;
		String paragraphText = "";
		String paragraphStyle = "";
		int id = 0;
		boolean firstParagraphFlag = true;

		while(paraIter.hasNext()) {

			paragraph = paraIter.next();

			paragraphText = paragraph.getText();
			paragraphStyle = paragraph.getStyle();
			numID = paragraph.getNumID();

			if(paragraphStyle == null){
				paragraphStyle = "null";
			}

			// heading level
			if(headingMap.get(paragraphStyle) > 0 && headingMap.get(paragraphStyle) < 11){

				Paragraph p = factory.createParagraph();
				p.setId(++id);
				p.setParagraph(paragraph);
				p.setRawText(paragraphText);

				if(firstParagraphFlag && headingMap.get(paragraphStyle) == 1){					

					paragraphStack.push(p);
					paragraphLevelMap.put(p, headingMap.get(paragraphStyle));
					firstParagraphFlag = false;
				}

				// If the current paragraph's level is lower than the peek's level 
				else if(headingMap.get(paragraphStyle) > paragraphLevelMap.get(paragraphStack.peek())){

					paragraphStack.push(p);
					paragraphLevelMap.put(p, headingMap.get(paragraphStyle));
				}

				// If the current paragraph's level is equal to the peek's level 
				else if(headingMap.get(paragraphStyle) == paragraphLevelMap.get(paragraphStack.peek())){

					Paragraph poppedParagraph = paragraphStack.pop();

					if(!paragraphStack.isEmpty()){

						paragraphStack.peek().getOwnedNode().add(poppedParagraph);

					}else{

						documentObject.getOwnedParagraph().add(poppedParagraph);
					}

					if(headingMap.get(paragraphStyle) == 1){
						documentObject.getOwnedParagraph().add(p);
					}

					paragraphStack.push(p);
					paragraphLevelMap.put(p, headingMap.get(paragraphStyle));

				}

				// If the current paragraph's level is higher than the peek's level 
				// then pop the requirement level and add it to peek's level is higher than
				// current paragraph's level
				else{											

					while(headingMap.get(paragraphStyle) <= paragraphLevelMap.get(paragraphStack.peek())){

						Paragraph poppedParagraph = paragraphStack.pop();

						// Higher level paragraph must be added to product
						if(paragraphLevelMap.get(poppedParagraph) == 1){

							documentObject.getOwnedParagraph().add(poppedParagraph);
							break;

						}else{

							paragraphStack.peek().getOwnedNode().add(poppedParagraph);		
						}


					}

					if(headingMap.get(paragraphStyle) == 1){
						documentObject.getOwnedParagraph().add(p);
					}

					paragraphStack.push(p);
					paragraphLevelMap.put(p, headingMap.get(paragraphStyle));

				}

			}// end if <heading level>
			// normal paragraph
			else if(headingMap.get(paragraphStyle) == 99){
<<<<<<< HEAD

				String[] values = paragraph.getText().split(":");

=======
				
				String[] values = paragraph.getText().split(":");
				
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6

				for(XWPFRun run : paragraph.getRuns()){

					String runText = run.getText(0).trim();
					String key = values[0] + ":";

					// key-value 
					if(key.contains(runText) && run.isBold()){
<<<<<<< HEAD


						//key-value
						if(paragraph.getText().contains(":")){

=======
						

						//key-value
						if(paragraph.getText().contains(":")){
							
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6
							Paragraph keyValueParagraph = factory.createParagraph();
							keyValueParagraph.setId(++id);
							keyValueParagraph.setName(values[0]);
							keyValueParagraph.setRawText(values[1]);
							paragraphStack.peek().getOwnedNode().add(keyValueParagraph);		
<<<<<<< HEAD

						}
						//header without heading style
						else{

=======
							
						}
						//header without heading style
						else{
							
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6
							Paragraph headerParagraph = factory.createParagraph();
							headerParagraph.setId(++id);
							headerParagraph.setName(paragraphText);
							headerParagraph.setRawText(paragraphText);
							paragraphStyle = "SubHeader";
							headerParagraph.setParentNode(paragraphStack.peek());
						}
<<<<<<< HEAD

						keyValue = true;
						break;

					}
					// key-value not bold
					else if(paragraph.getText().contains(":")){

						Paragraph keyValueParagraph = factory.createParagraph();
						keyValueParagraph.setId(++id);
						keyValueParagraph.setName(values[0]);
						// TODO ya :' n�n yan�na ya da alt�na yaz�labilir. 
						keyValueParagraph.setRawText(values[1]);
						keyValueParagraph.setParagraph(paragraph);

=======
						
						keyValue = true;
						break;
						
					}
					// key-value not bold
					else if(paragraph.getText().contains(":")){
						
						Paragraph keyValueParagraph = factory.createParagraph();
						keyValueParagraph.setId(++id);
						keyValueParagraph.setName(values[0]);
						keyValueParagraph.setRawText(values[1]);
						keyValueParagraph.setParagraph(paragraph);
						
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6
						//determine heading level or subheader
						int lastParagraphIndex = paragraphStack.peek().getOwnedNode().size() - 1;
						Paragraph lastParagraph = paragraphStack.peek().getOwnedNode().get(lastParagraphIndex);
						XWPFParagraph p = lastParagraph.getParagraph();
						String name = lastParagraph.getName();
						// if this pair belongs to named paragraph
						if(!name.equals("")){
<<<<<<< HEAD

							lastParagraph.getOwnedNode().add(keyValueParagraph);
						}else{

							paragraphStack.peek().getOwnedNode().add(keyValueParagraph);		

=======
							
							lastParagraph.getOwnedNode().add(keyValueParagraph);
						}else{
							
							paragraphStack.peek().getOwnedNode().add(keyValueParagraph);		
							
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6
						}
					}
					//
					else if(numID != null){
<<<<<<< HEAD

						paragraph = paraIter.next();
						numID = paragraph.getNumID();

						while(numID != null){

=======
						
						paragraph = paraIter.next();
						numID = paragraph.getNumID();
						
						while(numID != null){
							
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6
							Paragraph numberedrParagraph = factory.createParagraph();
							numberedrParagraph.setId(++id);
							numberedrParagraph.setRawText(paragraphText);
							paragraphStack.peek().getOwnedNode().add(numberedrParagraph);	
<<<<<<< HEAD

=======
							
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6
							if(paraIter.hasNext()){
								paragraph = paraIter.next();
								numID = paragraph.getNumID();
							}else{
								break;
							}
						}
<<<<<<< HEAD


					}

=======
						
						
					}
					
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6
					else{
						keyValue = false;
					}


				}
<<<<<<< HEAD
=======
				
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6

				// plain text
				if(!isKeyValue()){

					Paragraph p = factory.createParagraph();
					p.setId(++id);
					p.setRawText(paragraphText);
					paragraphStack.peek().getOwnedNode().add(p);
<<<<<<< HEAD

=======
>>>>>>> f898ef98eabafdbe7fbf3372949bf316356bace6
				}
			}

		}

		// At last, stack must be emptied
		emptyStack();

		// Create and save the model instance to xmi file
		createXMIFile(documentObject);

	}

	private static boolean isKeyValue() {
		return keyValue;
	}

	/**
	 * Requirement Levels left at stack must be removed and 
	 * added corresponding levels
	 */
	private static void emptyStack() {

		while(!paragraphStack.isEmpty()){

			Paragraph poppedParagraph = paragraphStack.pop();	

			if(paragraphLevelMap.get(poppedParagraph) == 1){

				documentObject.getOwnedParagraph().add(poppedParagraph);
			}else{

				paragraphStack.peek().getOwnedNode().add(poppedParagraph);			
			}


		}
	}

	/**
	 * Saves the model instance and writes it to xmi file
	 * 
	 * @param product
	 */
	private static void createXMIFile(Document document) {

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML Factory implementation using xmi extension
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"xmi", new  XMLResourceFactoryImpl());


		// Create empty resource with the given URI
		Resource resource = resourceSet.createResource(URI.createURI(output));


		// Add Product to contents list of the resource 

		resource.getContents().add(document);

		try{

			// Save the resource
			//resource.save(System.out, Collections.EMPTY_MAP); 
			resource.save(null);

			final JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Model created successfully!");

		}catch (IOException e) {

			e.printStackTrace();
		}
	}

	private static void initializeHeadingMap() {

		headingMap.put("null",99);
		headingMap.put("NoSpacing", 0);
		headingMap.put("Heading1", 1);
		headingMap.put("Heading2", 2);
		headingMap.put("Heading3", 3);
		headingMap.put("Heading4", 4);
		headingMap.put("Heading5", 5);
		headingMap.put("Heading6", 6);
		headingMap.put("Heading7", 7);
		headingMap.put("Heading8", 8);
		headingMap.put("Heading9", 9);
		headingMap.put("SubHeader", 11);
		headingMap.put("ListParagraph", 12);
		

	}

}