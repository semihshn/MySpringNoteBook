package com.example.sftp_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SftpDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SftpDemoApplication.class, args);

        Sftp sftp = new Sftp();
        try {
            sftp.uploadWithSftp();
            sftp.downlaodWithSftp();
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }


}
