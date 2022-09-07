package com.example.sftp_demo;

import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.sftp.SFTPClient;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sftp {

    private String remoteHost = "127.0.0.1";
    private String username = "foo";
    private String password = "pass";

    public void uploadWithSftp() throws IOException {
        String localFile = "src/main/resources/example.txt";
        String remoteDir = "upload/";

        SSHClient sshClient = setupSshj();
        SFTPClient sftpClient = sshClient.newSFTPClient();

        sftpClient.put(localFile, remoteDir + "example.txt");

        sftpClient.close();
        sshClient.disconnect();
    }

    public void downlaodWithSftp() throws IOException, NoSuchAlgorithmException {
        String remoteFile = "upload/example.txt";
        String localDir = "src/main/resources/downloaded/";

        SSHClient sshClient = setupSshj();
        SFTPClient sftpClient = sshClient.newSFTPClient();

        String cipherTextOfFileName = "downloaded";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[]hashInBytes = md.digest(cipherTextOfFileName.getBytes(StandardCharsets.UTF_8));

        //bytes to hex
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }

        sftpClient.get(remoteFile, localDir + sb.toString() + ".txt");

        sftpClient.close();
        sshClient.disconnect();
    }

    private SSHClient setupSshj() throws IOException {
        SSHClient client = new SSHClient();
        client.addHostKeyVerifier(new PromiscuousVerifier());
        client.connect(remoteHost);
        client.authPassword(username, password);
        return client;
    }
}
