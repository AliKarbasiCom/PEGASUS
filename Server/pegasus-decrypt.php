<?php 

$encryption = $_POST['text'];
$decryption_key = $_POST['key']; 

$ciphering = "AES-128-CTR"; 
$iv_length = openssl_cipher_iv_length($ciphering); 
$options = 0; 
$decryption_iv = '1234567891011121'; 

$decryption=openssl_decrypt ($encryption, $ciphering, 
		$decryption_key, $options, $decryption_iv); 

echo $decryption; 

?> 