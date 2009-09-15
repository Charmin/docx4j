/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */

package org.docx4j.openpackaging.parts.WordprocessingML;


import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.parts.PartName;
import org.docx4j.openpackaging.parts.XmlPart;
import org.docx4j.openpackaging.parts.relationships.Namespaces;



public final class AlternativeFormatInputPart extends XmlPart {
	
	public AlternativeFormatInputPart(PartName partName) throws InvalidFormatException {
		super(partName);
		
		 
		// ContentType will vary - see spec 11.3.1 

		// Used when this Part is added to a rels 
		setRelationshipType(Namespaces.AF);
		
	}

	@Override
	public org.w3c.dom.Document getDocument() throws Docx4JException {
		// Used when saving to JCR
		return doc;
	}
	
}
