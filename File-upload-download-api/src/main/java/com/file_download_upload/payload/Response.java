package com.file_download_upload.payload;

public class Response {
	private String fileName;
	private String downloadUri;
	private String filetype;
	private long fileSize;

	public Response(String fileName, String downloadUri, String filetype, long fileSize) {
		this.fileName = fileName;
		this.downloadUri = downloadUri;
		this.filetype = filetype;
		this.fileSize = fileSize;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getDownloadUri() {
		return downloadUri;
	}

	public void setDownloadUri(String downloadUri) {
		this.downloadUri = downloadUri;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

}
