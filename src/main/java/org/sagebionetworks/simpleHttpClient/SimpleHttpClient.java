package org.sagebionetworks.simpleHttpClient;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.client.ClientProtocolException;

public interface SimpleHttpClient {

	/**
	 * Performs a GET request
	 * 
	 * @param request
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	SimpleHttpResponse get(SimpleHttpRequest request) throws ClientProtocolException, IOException;

	/**
	 * Performs a POST request
	 * 
	 * @param request
	 * @param requestBody
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	SimpleHttpResponse post(SimpleHttpRequest request, String requestBody) throws ClientProtocolException, IOException;

	/**
	 * Performs a PUT request
	 * 
	 * @param request
	 * @param requestBody
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	SimpleHttpResponse put(SimpleHttpRequest request, String requestBody) throws ClientProtocolException, IOException;

	/**
	 * Performs a DELETE request
	 * 
	 * @param request
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	SimpleHttpResponse delete(SimpleHttpRequest request) throws ClientProtocolException, IOException;

	/**
	 * Performs an file upload
	 * 
	 * @param request
	 * @param toUpload
	 * @return
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	SimpleHttpResponse putFile(SimpleHttpRequest request, File toUpload) throws ClientProtocolException, IOException;

	/**
	 * Performs a file download
	 * 
	 * @param request
	 * @param result
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	SimpleHttpResponse getFile(SimpleHttpRequest request, File result) throws ClientProtocolException, IOException;

	/**
	 * Performs an file upload from an inputStream
	 * 
	 * @param request
	 * @param toUpload
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	SimpleHttpResponse putToURL(SimpleHttpRequest request, InputStream toUpload, long inputLength) throws ClientProtocolException, IOException;
}
