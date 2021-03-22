<?php 

$simple_string = $_POST['text']; 
$encryption_key = $_POST['key']; 

$ciphering = "AES-128-CTR"; 
$iv_length = openssl_cipher_iv_length($ciphering); 
$options = 0; 
$encryption_iv = '1234567891011121'; 

$encryption = openssl_encrypt($simple_string, $ciphering, 
			$encryption_key, $options, $encryption_iv); 

echo  $encryption ; 

?> 
