package com.eltaieb.microservice.resourceserver.contoller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("images")
public class ImageController {

	@Value("${BASE_IMAGES_PATH}")
	private String baseImages;

	@GetMapping(value = "/sub-directory", produces = MediaType.IMAGE_JPEG_VALUE)
	public @ResponseBody byte[] loadImage(@RequestParam("path") String path) throws IOException {
		try (InputStream in = new FileInputStream(
				baseImages + File.separator + "sub-directory" + File.separator + path)) {
			return IOUtils.toByteArray(in);
		}

	}
	
	
	 
}
