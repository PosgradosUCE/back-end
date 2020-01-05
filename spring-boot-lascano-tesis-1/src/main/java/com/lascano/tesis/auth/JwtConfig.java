package com.lascano.tesis.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEA4rja+OueSnV4FWMcRrji1WKmJ8H4zJD6L31HZBZLMa9wsxQl\r\n" + 
			"Av5NigEFWuuulTKrJgEvhSqh07Xl25FJ3xtEOiCWR1pcfK9LXc2Nd3UmXqUDMSM+\r\n" + 
			"IZuUKfLIeADyJ/l0y5/MBXstVV4QdC8zRLpC/FDOCDJB2ZJw1Me5YvCrVMJK8f52\r\n" + 
			"7IABq7F71d4R2kdw05lbCP91gfo+xcmysx8GX4GD3PuUpFBaz5Ap1dqsXnSKx723\r\n" + 
			"YAXInYPUi8QLhvDyLQoecfpEPQ9oYKHH24kNmIFSXlRXddzfiAfs121MU06XCHTF\r\n" + 
			"yS+0xKvsOUoGCB8AWQ+/YXcfqRzvL1SZuYnKuwIDAQABAoIBAQDP5VAtlujkQAko\r\n" + 
			"G2SvWRPvNXFE3bJF6t7vMwKGvYaf/c7q9xrlPsldNYhykdDZ0MdtpwKrKqePmak3\r\n" + 
			"iGdjpP4QCxeiQDK0xozma/k/w/W2LbvakAWGDcJ0IMNAfyWOEEnP+iy8DfJI6GNQ\r\n" + 
			"FoP9joqkEXiLvYHyfzzlcGsHVcbVhUVgtKgM/0/QPjJHZ40HVjrbR03jY2OprBGN\r\n" + 
			"t7r/FENXYmFTzngFZLsMknQiHJRzG/Vls0UwBkGkaeUiLvDJ5Kjn3vV0K7HcYdKs\r\n" + 
			"I1zBsdKk5NqCneKOxi8jW+rNJgnuWWCcOXKEU6xWmzr/R+hqz0BAgNCwmHEsMeyL\r\n" + 
			"lztf+77xAoGBAP885IE7Zi1bOg0fmzkuMuXJhXLvPa9skDX6PxpmLDtYOB3S7F9+\r\n" + 
			"SxOqvYX+m1zR/U6gSnjQAe/X4AngLIhBIi4Ocstg1yIWfKNnc8qdvs22OpdzbBTS\r\n" + 
			"egy9AksLfV3SSNDq9n5y/yYZ4XsJlWcPbfVmjieQ4+cRiRco9ChTSD2jAoGBAONm\r\n" + 
			"Kjd1PBNfH/hEO3U0GByzcoKhbhQwZc67tu3cpskn1W1+TP6HRGUxKWLT5nWLVLTG\r\n" + 
			"djFWqFUQrz+gSAxe1ko7e4Oq93XmgWSZ76iTPvCtFbSK8lNk2fph6H9rNTb1mBBk\r\n" + 
			"lSWjLJamKGeos1Td91tVQ4ITGgpBFFL+btQwu+AJAoGAW1PUh5FTfEM6QFvg1NL9\r\n" + 
			"D0/OWlPUhKKZ71Z9odqRVSK54aIJRhoQjxb2/a0etlXFB48/Vn9HUiSyW5ZFGPQF\r\n" + 
			"YOl2leMu11moe2eW/Rb4oO7lhC+eqsytM0WmPmf8EcgemfKZBKHtPhrgnX/OX7Qb\r\n" + 
			"qkVp9CpaAeI6ZXkX9B3oqXUCgYB3Hv7AfHZTA4LA0CWBeR+kcVBsI9qBUvUR/f2O\r\n" + 
			"zwbD200PhZkZwIxQohc3AR/5tVpTNJ+XqviVTx8uqmzzpf6FdnF2gOoO5ggkRgto\r\n" + 
			"eHIBK/px0FOu4ebaJc3gaa2/s5nMBJSo2biy1inWW2ZN79TzEFBD5HPAqWTXMRen\r\n" + 
			"qjvQ2QKBgQDeXVLBnzpPgu5tcfJ8G4+0wXHGJ8jCD6AN5q6MiPraVmW5zeyeSOn5\r\n" + 
			"UaLZMZtId/HG54njXBm+IShkinovwCufrJXfpKDZXR1oAbBXlWrWZcnr8GmcTNhY\r\n" + 
			"YGRKHLTpNHhDpVOaOx3fbyM/tJZ2/JPdmQEIZoEhHdB3JWaw+tKyJQ==\r\n" + 
			"-----END RSA PRIVATE KEY-----";


	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4rja+OueSnV4FWMcRrji\r\n" + 
			"1WKmJ8H4zJD6L31HZBZLMa9wsxQlAv5NigEFWuuulTKrJgEvhSqh07Xl25FJ3xtE\r\n" + 
			"OiCWR1pcfK9LXc2Nd3UmXqUDMSM+IZuUKfLIeADyJ/l0y5/MBXstVV4QdC8zRLpC\r\n" + 
			"/FDOCDJB2ZJw1Me5YvCrVMJK8f527IABq7F71d4R2kdw05lbCP91gfo+xcmysx8G\r\n" + 
			"X4GD3PuUpFBaz5Ap1dqsXnSKx723YAXInYPUi8QLhvDyLQoecfpEPQ9oYKHH24kN\r\n" + 
			"mIFSXlRXddzfiAfs121MU06XCHTFyS+0xKvsOUoGCB8AWQ+/YXcfqRzvL1SZuYnK\r\n" + 
			"uwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
