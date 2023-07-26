public abstract class e.g.a.a.b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/g/a/a/b$b;, */
	 /* Le/g/a/a/b$a;, */
	 /* Le/g/a/a/b$c; */
	 /* } */
} // .end annotation
/* # direct methods */
public static e.g.a.a.b$b a ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
	 /* .locals 8 */
	 int v0 = 0; // const/4 v0, 0x0
	 final String v1 = "device_names"; // const-string v1, "device_names"
	 /* .line 509 */
	 (( android.content.Context ) p0 ).getSharedPreferences ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 int v2 = 2; // const/4 v2, 0x2
	 /* new-array v2, v2, [Ljava/lang/Object; */
	 /* aput-object p1, v2, v0 */
	 int v3 = 1; // const/4 v3, 0x1
	 /* aput-object p2, v2, v3 */
	 final String v4 = "%s:%s"; // const-string v4, "%s:%s"
	 /* .line 510 */
	 java.lang.String .format ( v4,v2 );
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 511 */
	 if ( v5 != null) { // if-eqz v5, :cond_0
		 /* .line 512 */
		 try { // :try_start_0
			 /* new-instance v6, Le/g/a/a/b$b; */
			 /* new-instance v7, Lorg/json/JSONObject; */
			 /* invoke-direct {v7, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
			 /* invoke-direct {v6, v7, v4}, Le/g/a/a/b$b;-><init>(Lorg/json/JSONObject;Le/g/a/a/a;)V */
			 /* :try_end_0 */
			 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v5 */
			 /* .line 513 */
			 (( org.json.JSONException ) v5 ).printStackTrace ( ); // invoke-virtual {v5}, Lorg/json/JSONException;->printStackTrace()V
		 } // :cond_0
		 final String v5 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v5, "android.permission.ACCESS_NETWORK_STATE"
		 /* .line 514 */
		 v5 = 		 (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v5 ); // invoke-virtual {p0, v5}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
		 /* if-nez v5, :cond_2 */
		 final String v5 = "connectivity"; // const-string v5, "connectivity"
		 /* .line 515 */
		 (( android.content.Context ) p0 ).getSystemService ( v5 ); // invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p0, Landroid/net/ConnectivityManager; */
		 /* .line 516 */
		 (( android.net.ConnectivityManager ) p0 ).getActiveNetworkInfo ( ); // invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 /* .line 517 */
			 p0 = 			 (( android.net.NetworkInfo ) p0 ).isConnected ( ); // invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z
			 if ( p0 != null) { // if-eqz p0, :cond_1
			 } // :cond_1
			 int p0 = 0; // const/4 p0, 0x0
		 } // :cond_2
	 } // :goto_0
	 int p0 = 1; // const/4 p0, 0x1
} // :goto_1
if ( p0 != null) { // if-eqz p0, :cond_6
	 try { // :try_start_1
		 final String p0 = "https://raw.githubusercontent.com/jaredrummler/AndroidDeviceNames/master/json/devices/%s.json"; // const-string p0, "https://raw.githubusercontent.com/jaredrummler/AndroidDeviceNames/master/json/devices/%s.json"
		 /* new-array v3, v3, [Ljava/lang/Object; */
		 /* .line 518 */
		 v5 = java.util.Locale.ENGLISH;
		 (( java.lang.String ) p1 ).toLowerCase ( v5 ); // invoke-virtual {p1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
		 /* aput-object v5, v3, v0 */
		 java.lang.String .format ( p0,v3 );
		 /* .line 519 */
		 e.g.a.a.b .b ( p0 );
		 /* .line 520 */
		 /* new-instance v3, Lorg/json/JSONArray; */
		 /* invoke-direct {v3, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V */
		 /* .line 521 */
		 p0 = 		 (( org.json.JSONArray ) v3 ).length ( ); // invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
	 } // :goto_2
	 /* if-ge v0, p0, :cond_6 */
	 /* .line 522 */
	 (( org.json.JSONArray ) v3 ).getJSONObject ( v0 ); // invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
	 /* .line 523 */
	 /* new-instance v6, Le/g/a/a/b$b; */
	 /* invoke-direct {v6, v5, v4}, Le/g/a/a/b$b;-><init>(Lorg/json/JSONObject;Le/g/a/a/a;)V */
	 /* .line 524 */
	 v7 = this.c;
	 v7 = 	 (( java.lang.String ) p1 ).equalsIgnoreCase ( v7 ); // invoke-virtual {p1, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
	 if ( v7 != null) { // if-eqz v7, :cond_3
		 if ( p2 != null) { // if-eqz p2, :cond_4
		 } // :cond_3
		 v7 = this.c;
		 /* .line 525 */
		 v7 = 		 (( java.lang.String ) p1 ).equalsIgnoreCase ( v7 ); // invoke-virtual {p1, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v7 != null) { // if-eqz v7, :cond_5
			 v7 = this.d;
			 v7 = 			 (( java.lang.String ) p2 ).equalsIgnoreCase ( v7 ); // invoke-virtual {p2, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
			 if ( v7 != null) { // if-eqz v7, :cond_5
				 /* .line 526 */
			 } // :cond_4
			 /* .line 527 */
			 (( org.json.JSONObject ) v5 ).toString ( ); // invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
			 /* .line 528 */
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
		 } // :cond_5
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* :catch_1 */
		 /* move-exception p0 */
		 /* .line 529 */
		 (( java.lang.Exception ) p0 ).printStackTrace ( ); // invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V
		 /* .line 530 */
	 } // :cond_6
	 p0 = android.os.Build.DEVICE;
	 p0 = 	 (( java.lang.String ) p1 ).equals ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( p0 != null) { // if-eqz p0, :cond_7
		 p0 = android.os.Build.MODEL;
		 p0 = 		 (( java.lang.String ) p0 ).equals ( p2 ); // invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_7
			 /* .line 531 */
			 /* new-instance p0, Le/g/a/a/b$b; */
			 v0 = android.os.Build.MANUFACTURER;
			 e.g.a.a.b .a ( );
			 /* invoke-direct {p0, v0, v1, p1, p2}, Le/g/a/a/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
			 /* .line 532 */
		 } // :cond_7
		 /* new-instance p0, Le/g/a/a/b$b; */
		 /* invoke-direct {p0, v4, v4, p1, p2}, Le/g/a/a/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
	 } // .end method
	 public static e.g.a.a.b$c a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Le/g/a/a/b$c; */
		 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, p0, v1}, Le/g/a/a/b$c;-><init>(Landroid/content/Context;Le/g/a/a/a;)V */
	 } // .end method
	 public static java.lang.String a ( ) {
		 /* .locals 3 */
		 /* .line 2 */
		 v0 = android.os.Build.DEVICE;
		 v1 = android.os.Build.MODEL;
		 e.g.a.a.b .a ( v1 );
		 e.g.a.a.b .a ( v0,v1,v2 );
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 8 */
		 /* .line 533 */
		 v0 = 		 android.text.TextUtils .isEmpty ( p0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 534 */
		 } // :cond_0
		 (( java.lang.String ) p0 ).toCharArray ( ); // invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
		 /* .line 535 */
		 /* array-length v0, p0 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 final String v3 = ""; // const-string v3, ""
		 int v4 = 0; // const/4 v4, 0x0
		 int v5 = 1; // const/4 v5, 0x1
	 } // :goto_0
	 /* if-ge v4, v0, :cond_3 */
	 /* aget-char v6, p0, v4 */
	 if ( v5 != null) { // if-eqz v5, :cond_1
		 /* .line 536 */
		 v7 = 		 java.lang.Character .isLetter ( v6 );
		 if ( v7 != null) { // if-eqz v7, :cond_1
			 /* .line 537 */
			 /* new-instance v5, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v3 = 			 java.lang.Character .toUpperCase ( v6 );
			 (( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 int v5 = 0; // const/4 v5, 0x0
			 /* .line 538 */
		 } // :cond_1
		 v7 = 		 java.lang.Character .isWhitespace ( v6 );
		 if ( v7 != null) { // if-eqz v7, :cond_2
			 int v5 = 1; // const/4 v5, 0x1
			 /* .line 539 */
		 } // :cond_2
		 /* new-instance v7, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v7 ).append ( v3 ); // invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).append ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // :goto_1
	 /* add-int/lit8 v4, v4, 0x1 */
} // :cond_3
} // .end method
public static java.lang.String a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 4 */
if ( p0 != null) { // if-eqz p0, :cond_0
	 final String v0 = "walleye"; // const-string v0, "walleye"
	 /* .line 3 */
	 v0 = 	 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 final String p0 = "Pixel 2"; // const-string p0, "Pixel 2"
	 } // :cond_0
	 if ( p0 != null) { // if-eqz p0, :cond_1
		 final String v0 = "taimen"; // const-string v0, "taimen"
		 /* .line 4 */
		 v0 = 		 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 final String p0 = "Pixel 2 XL"; // const-string p0, "Pixel 2 XL"
		 } // :cond_1
		 if ( p0 != null) { // if-eqz p0, :cond_2
			 final String v0 = "blueline"; // const-string v0, "blueline"
			 /* .line 5 */
			 v0 = 			 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 final String p0 = "Pixel 3"; // const-string p0, "Pixel 3"
			 } // :cond_2
			 if ( p0 != null) { // if-eqz p0, :cond_3
				 final String v0 = "crosshatch"; // const-string v0, "crosshatch"
				 /* .line 6 */
				 v0 = 				 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 if ( v0 != null) { // if-eqz v0, :cond_3
					 final String p0 = "Pixel 3 XL"; // const-string p0, "Pixel 3 XL"
				 } // :cond_3
				 if ( p0 != null) { // if-eqz p0, :cond_4
					 final String v0 = "sargo"; // const-string v0, "sargo"
					 /* .line 7 */
					 v0 = 					 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 if ( v0 != null) { // if-eqz v0, :cond_4
						 final String p0 = "Pixel 3a"; // const-string p0, "Pixel 3a"
					 } // :cond_4
					 if ( p0 != null) { // if-eqz p0, :cond_5
						 final String v0 = "bonito"; // const-string v0, "bonito"
						 /* .line 8 */
						 v0 = 						 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
						 if ( v0 != null) { // if-eqz v0, :cond_5
							 final String p0 = "Pixel 3a XL"; // const-string p0, "Pixel 3a XL"
						 } // :cond_5
						 if ( p0 != null) { // if-eqz p0, :cond_6
							 final String v0 = "HWBND-H"; // const-string v0, "HWBND-H"
							 /* .line 9 */
							 v0 = 							 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_7 */
						 } // :cond_6
						 if ( p1 != null) { // if-eqz p1, :cond_8
							 final String v0 = "BND-L21"; // const-string v0, "BND-L21"
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_7 */
							 final String v0 = "BND-L24"; // const-string v0, "BND-L24"
							 /* .line 10 */
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_7 */
							 final String v0 = "BND-L31"; // const-string v0, "BND-L31"
							 /* .line 11 */
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 if ( v0 != null) { // if-eqz v0, :cond_8
							 } // :cond_7
							 final String p0 = "Honor 7X"; // const-string p0, "Honor 7X"
						 } // :cond_8
						 if ( p0 != null) { // if-eqz p0, :cond_9
							 final String v0 = "HWBKL"; // const-string v0, "HWBKL"
							 /* .line 12 */
							 v0 = 							 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_a */
						 } // :cond_9
						 if ( p1 != null) { // if-eqz p1, :cond_b
							 final String v0 = "BKL-L04"; // const-string v0, "BKL-L04"
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_a */
							 final String v0 = "BKL-L09"; // const-string v0, "BKL-L09"
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 if ( v0 != null) { // if-eqz v0, :cond_b
							 } // :cond_a
							 final String p0 = "Honor View 10"; // const-string p0, "Honor View 10"
						 } // :cond_b
						 if ( p0 != null) { // if-eqz p0, :cond_c
							 final String v0 = "HWALP"; // const-string v0, "HWALP"
							 /* .line 13 */
							 v0 = 							 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_d */
						 } // :cond_c
						 if ( p1 != null) { // if-eqz p1, :cond_e
							 final String v0 = "ALP-AL00"; // const-string v0, "ALP-AL00"
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_d */
							 final String v0 = "ALP-L09"; // const-string v0, "ALP-L09"
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_d */
							 final String v0 = "ALP-L29"; // const-string v0, "ALP-L29"
							 /* .line 14 */
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_d */
							 final String v0 = "ALP-TL00"; // const-string v0, "ALP-TL00"
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 if ( v0 != null) { // if-eqz v0, :cond_e
							 } // :cond_d
							 final String p0 = "Mate 10"; // const-string p0, "Mate 10"
						 } // :cond_e
						 if ( p0 != null) { // if-eqz p0, :cond_f
							 final String v0 = "HWMHA"; // const-string v0, "HWMHA"
							 /* .line 15 */
							 v0 = 							 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_10 */
						 } // :cond_f
						 if ( p1 != null) { // if-eqz p1, :cond_11
							 final String v0 = "MHA-AL00"; // const-string v0, "MHA-AL00"
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_10 */
							 final String v0 = "MHA-L09"; // const-string v0, "MHA-L09"
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_10 */
							 final String v0 = "MHA-L29"; // const-string v0, "MHA-L29"
							 /* .line 16 */
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 /* if-nez v0, :cond_10 */
							 final String v0 = "MHA-TL00"; // const-string v0, "MHA-TL00"
							 v0 = 							 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 if ( v0 != null) { // if-eqz v0, :cond_11
							 } // :cond_10
							 final String p0 = "Mate 9"; // const-string p0, "Mate 9"
						 } // :cond_11
						 if ( p0 != null) { // if-eqz p0, :cond_12
							 final String v0 = "angler"; // const-string v0, "angler"
							 /* .line 17 */
							 v0 = 							 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 if ( v0 != null) { // if-eqz v0, :cond_12
								 final String p0 = "Nexus 6P"; // const-string p0, "Nexus 6P"
							 } // :cond_12
							 if ( p0 != null) { // if-eqz p0, :cond_13
								 final String v0 = "h1"; // const-string v0, "h1"
								 /* .line 18 */
								 v0 = 								 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
							 } // :cond_13
							 if ( p1 != null) { // if-eqz p1, :cond_15
								 final String v0 = "LG-F700K"; // const-string v0, "LG-F700K"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-F700L"; // const-string v0, "LG-F700L"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-F700S"; // const-string v0, "LG-F700S"
								 /* .line 19 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-H820"; // const-string v0, "LG-H820"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-H820PR"; // const-string v0, "LG-H820PR"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-H830"; // const-string v0, "LG-H830"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-H831"; // const-string v0, "LG-H831"
								 /* .line 20 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-H850"; // const-string v0, "LG-H850"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-H858"; // const-string v0, "LG-H858"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-H860"; // const-string v0, "LG-H860"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LG-H868"; // const-string v0, "LG-H868"
								 /* .line 21 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LGAS992"; // const-string v0, "LGAS992"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LGLS992"; // const-string v0, "LGLS992"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "LGUS992"; // const-string v0, "LGUS992"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "RS988"; // const-string v0, "RS988"
								 /* .line 22 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_14 */
								 final String v0 = "VS987"; // const-string v0, "VS987"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 if ( v0 != null) { // if-eqz v0, :cond_15
								 } // :cond_14
								 final String p0 = "LG G5"; // const-string p0, "LG G5"
							 } // :cond_15
							 if ( p0 != null) { // if-eqz p0, :cond_16
								 final String v0 = "lucye"; // const-string v0, "lucye"
								 /* .line 23 */
								 v0 = 								 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
							 } // :cond_16
							 if ( p1 != null) { // if-eqz p1, :cond_18
								 final String v0 = "LG-AS993"; // const-string v0, "LG-AS993"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H870"; // const-string v0, "LG-H870"
								 /* .line 24 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H870AR"; // const-string v0, "LG-H870AR"
								 /* .line 25 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H870DS"; // const-string v0, "LG-H870DS"
								 /* .line 26 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H870I"; // const-string v0, "LG-H870I"
								 /* .line 27 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H870S"; // const-string v0, "LG-H870S"
								 /* .line 28 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H871"; // const-string v0, "LG-H871"
								 /* .line 29 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H871S"; // const-string v0, "LG-H871S"
								 /* .line 30 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H872"; // const-string v0, "LG-H872"
								 /* .line 31 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H872PR"; // const-string v0, "LG-H872PR"
								 /* .line 32 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-H873"; // const-string v0, "LG-H873"
								 /* .line 33 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LG-LS993"; // const-string v0, "LG-LS993"
								 /* .line 34 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LGM-G600K"; // const-string v0, "LGM-G600K"
								 /* .line 35 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LGM-G600L"; // const-string v0, "LGM-G600L"
								 /* .line 36 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LGM-G600S"; // const-string v0, "LGM-G600S"
								 /* .line 37 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "LGUS997"; // const-string v0, "LGUS997"
								 /* .line 38 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_17 */
								 final String v0 = "VS988"; // const-string v0, "VS988"
								 /* .line 39 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 if ( v0 != null) { // if-eqz v0, :cond_18
								 } // :cond_17
								 final String p0 = "LG G6"; // const-string p0, "LG G6"
							 } // :cond_18
							 if ( p0 != null) { // if-eqz p0, :cond_19
								 final String v0 = "flashlmdd"; // const-string v0, "flashlmdd"
								 /* .line 40 */
								 v0 = 								 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_1a */
							 } // :cond_19
							 if ( p1 != null) { // if-eqz p1, :cond_1b
								 final String v0 = "LM-V500"; // const-string v0, "LM-V500"
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 /* if-nez v0, :cond_1a */
								 final String v0 = "LM-V500N"; // const-string v0, "LM-V500N"
								 /* .line 41 */
								 v0 = 								 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 if ( v0 != null) { // if-eqz v0, :cond_1b
								 } // :cond_1a
								 final String p0 = "LG V50 ThinQ"; // const-string p0, "LG V50 ThinQ"
							 } // :cond_1b
							 if ( p0 != null) { // if-eqz p0, :cond_1c
								 final String v0 = "mako"; // const-string v0, "mako"
								 /* .line 42 */
								 v0 = 								 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
								 if ( v0 != null) { // if-eqz v0, :cond_1c
									 final String p0 = "Nexus 4"; // const-string p0, "Nexus 4"
								 } // :cond_1c
								 if ( p0 != null) { // if-eqz p0, :cond_1d
									 final String v0 = "hammerhead"; // const-string v0, "hammerhead"
									 /* .line 43 */
									 v0 = 									 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
									 if ( v0 != null) { // if-eqz v0, :cond_1d
										 final String p0 = "Nexus 5"; // const-string p0, "Nexus 5"
									 } // :cond_1d
									 if ( p0 != null) { // if-eqz p0, :cond_1e
										 final String v0 = "bullhead"; // const-string v0, "bullhead"
										 /* .line 44 */
										 v0 = 										 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
										 if ( v0 != null) { // if-eqz v0, :cond_1e
											 final String p0 = "Nexus 5X"; // const-string p0, "Nexus 5X"
										 } // :cond_1e
										 if ( p0 != null) { // if-eqz p0, :cond_1f
											 final String v0 = "griffin"; // const-string v0, "griffin"
											 /* .line 45 */
											 v0 = 											 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
											 /* if-nez v0, :cond_20 */
										 } // :cond_1f
										 if ( p1 != null) { // if-eqz p1, :cond_21
											 final String v0 = "XT1650"; // const-string v0, "XT1650"
											 v0 = 											 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
											 /* if-nez v0, :cond_20 */
											 final String v0 = "XT1650-05"; // const-string v0, "XT1650-05"
											 v0 = 											 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
											 if ( v0 != null) { // if-eqz v0, :cond_21
											 } // :cond_20
											 final String p0 = "Moto Z"; // const-string p0, "Moto Z"
										 } // :cond_21
										 if ( p0 != null) { // if-eqz p0, :cond_22
											 final String v0 = "shamu"; // const-string v0, "shamu"
											 /* .line 46 */
											 v0 = 											 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
											 if ( v0 != null) { // if-eqz v0, :cond_22
												 final String p0 = "Nexus 6"; // const-string p0, "Nexus 6"
											 } // :cond_22
											 if ( p0 != null) { // if-eqz p0, :cond_24
												 final String v0 = "RHD"; // const-string v0, "RHD"
												 /* .line 47 */
												 v0 = 												 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
												 /* if-nez v0, :cond_23 */
												 final String v0 = "ROO"; // const-string v0, "ROO"
												 /* .line 48 */
												 v0 = 												 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
												 /* if-nez v0, :cond_23 */
												 final String v0 = "ROON_sprout"; // const-string v0, "ROON_sprout"
												 /* .line 49 */
												 v0 = 												 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
												 /* if-nez v0, :cond_23 */
												 final String v0 = "ROO_sprout"; // const-string v0, "ROO_sprout"
												 /* .line 50 */
												 v0 = 												 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
												 if ( v0 != null) { // if-eqz v0, :cond_24
												 } // :cond_23
												 final String p0 = "Nokia 3.1 Plus"; // const-string p0, "Nokia 3.1 Plus"
											 } // :cond_24
											 if ( p0 != null) { // if-eqz p0, :cond_25
												 final String v0 = "CTL_sprout"; // const-string v0, "CTL_sprout"
												 /* .line 51 */
												 v0 = 												 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
												 if ( v0 != null) { // if-eqz v0, :cond_25
													 final String p0 = "Nokia 7.1"; // const-string p0, "Nokia 7.1"
												 } // :cond_25
												 if ( p0 != null) { // if-eqz p0, :cond_26
													 final String v0 = "OnePlus6"; // const-string v0, "OnePlus6"
													 /* .line 52 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_27 */
												 } // :cond_26
												 if ( p1 != null) { // if-eqz p1, :cond_28
													 final String v0 = "ONEPLUS A6003"; // const-string v0, "ONEPLUS A6003"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_28
													 } // :cond_27
													 final String p0 = "OnePlus 6"; // const-string p0, "OnePlus 6"
												 } // :cond_28
												 if ( p0 != null) { // if-eqz p0, :cond_29
													 final String v0 = "OnePlus6T"; // const-string v0, "OnePlus6T"
													 /* .line 53 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_2a */
													 final String v0 = "OnePlus6TSingle"; // const-string v0, "OnePlus6TSingle"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_2a */
												 } // :cond_29
												 if ( p1 != null) { // if-eqz p1, :cond_2b
													 final String v0 = "ONEPLUS A6013"; // const-string v0, "ONEPLUS A6013"
													 /* .line 54 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_2b
													 } // :cond_2a
													 final String p0 = "OnePlus 6T"; // const-string p0, "OnePlus 6T"
												 } // :cond_2b
												 if ( p0 != null) { // if-eqz p0, :cond_2c
													 final String v0 = "OnePlus7"; // const-string v0, "OnePlus7"
													 /* .line 55 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_2d */
												 } // :cond_2c
												 if ( p1 != null) { // if-eqz p1, :cond_2e
													 final String v0 = "GM1905"; // const-string v0, "GM1905"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_2e
													 } // :cond_2d
													 final String p0 = "OnePlus 7"; // const-string p0, "OnePlus 7"
												 } // :cond_2e
												 if ( p0 != null) { // if-eqz p0, :cond_2f
													 final String v0 = "OnePlus7Pro"; // const-string v0, "OnePlus7Pro"
													 /* .line 56 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_30 */
													 final String v0 = "OnePlus7ProTMO"; // const-string v0, "OnePlus7ProTMO"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_30 */
												 } // :cond_2f
												 if ( p1 != null) { // if-eqz p1, :cond_31
													 final String v0 = "GM1915"; // const-string v0, "GM1915"
													 /* .line 57 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_30 */
													 final String v0 = "GM1917"; // const-string v0, "GM1917"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_31
													 } // :cond_30
													 final String p0 = "OnePlus 7 Pro"; // const-string p0, "OnePlus 7 Pro"
												 } // :cond_31
												 if ( p0 != null) { // if-eqz p0, :cond_32
													 final String v0 = "a50"; // const-string v0, "a50"
													 /* .line 58 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
												 } // :cond_32
												 if ( p1 != null) { // if-eqz p1, :cond_34
													 final String v0 = "SM-A505F"; // const-string v0, "SM-A505F"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
													 final String v0 = "SM-A505FM"; // const-string v0, "SM-A505FM"
													 /* .line 59 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
													 final String v0 = "SM-A505FN"; // const-string v0, "SM-A505FN"
													 /* .line 60 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
													 final String v0 = "SM-A505G"; // const-string v0, "SM-A505G"
													 /* .line 61 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
													 final String v0 = "SM-A505GN"; // const-string v0, "SM-A505GN"
													 /* .line 62 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
													 final String v0 = "SM-A505GT"; // const-string v0, "SM-A505GT"
													 /* .line 63 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
													 final String v0 = "SM-A505N"; // const-string v0, "SM-A505N"
													 /* .line 64 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
													 final String v0 = "SM-A505U"; // const-string v0, "SM-A505U"
													 /* .line 65 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
													 final String v0 = "SM-A505W"; // const-string v0, "SM-A505W"
													 /* .line 66 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_33 */
													 final String v0 = "SM-A505YN"; // const-string v0, "SM-A505YN"
													 /* .line 67 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_34
													 } // :cond_33
													 final String p0 = "Galaxy A50"; // const-string p0, "Galaxy A50"
												 } // :cond_34
												 if ( p0 != null) { // if-eqz p0, :cond_35
													 final String v0 = "a6elteaio"; // const-string v0, "a6elteaio"
													 /* .line 68 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "a6elteatt"; // const-string v0, "a6elteatt"
													 /* .line 69 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "a6eltemtr"; // const-string v0, "a6eltemtr"
													 /* .line 70 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "a6eltespr"; // const-string v0, "a6eltespr"
													 /* .line 71 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "a6eltetmo"; // const-string v0, "a6eltetmo"
													 /* .line 72 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "a6elteue"; // const-string v0, "a6elteue"
													 /* .line 73 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "a6lte"; // const-string v0, "a6lte"
													 /* .line 74 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "a6lteks"; // const-string v0, "a6lteks"
													 /* .line 75 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
												 } // :cond_35
												 if ( p1 != null) { // if-eqz p1, :cond_37
													 final String v0 = "SM-A600A"; // const-string v0, "SM-A600A"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600AZ"; // const-string v0, "SM-A600AZ"
													 /* .line 76 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600F"; // const-string v0, "SM-A600F"
													 /* .line 77 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600FN"; // const-string v0, "SM-A600FN"
													 /* .line 78 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600G"; // const-string v0, "SM-A600G"
													 /* .line 79 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600GN"; // const-string v0, "SM-A600GN"
													 /* .line 80 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600N"; // const-string v0, "SM-A600N"
													 /* .line 81 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600P"; // const-string v0, "SM-A600P"
													 /* .line 82 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600T"; // const-string v0, "SM-A600T"
													 /* .line 83 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600T1"; // const-string v0, "SM-A600T1"
													 /* .line 84 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_36 */
													 final String v0 = "SM-A600U"; // const-string v0, "SM-A600U"
													 /* .line 85 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_37
													 } // :cond_36
													 final String p0 = "Galaxy A6"; // const-string p0, "Galaxy A6"
												 } // :cond_37
												 final String v0 = "SCV34"; // const-string v0, "SCV34"
												 final String v1 = "SC-01J"; // const-string v1, "SC-01J"
												 if ( p0 != null) { // if-eqz p0, :cond_38
													 /* .line 86 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 /* .line 87 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "gracelte"; // const-string v2, "gracelte"
													 /* .line 88 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceltektt"; // const-string v2, "graceltektt"
													 /* .line 89 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceltelgt"; // const-string v2, "graceltelgt"
													 /* .line 90 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "gracelteskt"; // const-string v2, "gracelteskt"
													 /* .line 91 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqlteacg"; // const-string v2, "graceqlteacg"
													 /* .line 92 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqlteatt"; // const-string v2, "graceqlteatt"
													 /* .line 93 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqltebmc"; // const-string v2, "graceqltebmc"
													 /* .line 94 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqltechn"; // const-string v2, "graceqltechn"
													 /* .line 95 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqltedcm"; // const-string v2, "graceqltedcm"
													 /* .line 96 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqltelra"; // const-string v2, "graceqltelra"
													 /* .line 97 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqltespr"; // const-string v2, "graceqltespr"
													 /* .line 98 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqltetfnvzw"; // const-string v2, "graceqltetfnvzw"
													 /* .line 99 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqltetmo"; // const-string v2, "graceqltetmo"
													 /* .line 100 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqlteue"; // const-string v2, "graceqlteue"
													 /* .line 101 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqlteusc"; // const-string v2, "graceqlteusc"
													 /* .line 102 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 final String v2 = "graceqltevzw"; // const-string v2, "graceqltevzw"
													 /* .line 103 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
												 } // :cond_38
												 if ( p1 != null) { // if-eqz p1, :cond_3a
													 final String v2 = "SAMSUNG-SM-N930A"; // const-string v2, "SAMSUNG-SM-N930A"
													 v2 = 													 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_39 */
													 /* .line 104 */
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_39 */
													 /* .line 105 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SGH-N037"; // const-string v0, "SGH-N037"
													 /* .line 106 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N9300"; // const-string v0, "SM-N9300"
													 /* .line 107 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930F"; // const-string v0, "SM-N930F"
													 /* .line 108 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930K"; // const-string v0, "SM-N930K"
													 /* .line 109 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930L"; // const-string v0, "SM-N930L"
													 /* .line 110 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930P"; // const-string v0, "SM-N930P"
													 /* .line 111 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930R4"; // const-string v0, "SM-N930R4"
													 /* .line 112 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930R6"; // const-string v0, "SM-N930R6"
													 /* .line 113 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930R7"; // const-string v0, "SM-N930R7"
													 /* .line 114 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930S"; // const-string v0, "SM-N930S"
													 /* .line 115 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930T"; // const-string v0, "SM-N930T"
													 /* .line 116 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930U"; // const-string v0, "SM-N930U"
													 /* .line 117 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930V"; // const-string v0, "SM-N930V"
													 /* .line 118 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930VL"; // const-string v0, "SM-N930VL"
													 /* .line 119 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930W8"; // const-string v0, "SM-N930W8"
													 /* .line 120 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_39 */
													 final String v0 = "SM-N930X"; // const-string v0, "SM-N930X"
													 /* .line 121 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_3a
													 } // :cond_39
													 final String p0 = "Galaxy Note7"; // const-string p0, "Galaxy Note7"
												 } // :cond_3a
												 final String v0 = "SCV37"; // const-string v0, "SCV37"
												 final String v1 = "SC-01K"; // const-string v1, "SC-01K"
												 if ( p0 != null) { // if-eqz p0, :cond_3b
													 /* .line 122 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3c */
													 /* .line 123 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3c */
													 final String v2 = "greatlte"; // const-string v2, "greatlte"
													 /* .line 124 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3c */
													 final String v2 = "greatlteks"; // const-string v2, "greatlteks"
													 /* .line 125 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3c */
													 final String v2 = "greatqlte"; // const-string v2, "greatqlte"
													 /* .line 126 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3c */
													 final String v2 = "greatqltechn"; // const-string v2, "greatqltechn"
													 /* .line 127 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3c */
													 final String v2 = "greatqltecmcc"; // const-string v2, "greatqltecmcc"
													 /* .line 128 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3c */
													 final String v2 = "greatqltecs"; // const-string v2, "greatqltecs"
													 /* .line 129 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3c */
													 final String v2 = "greatqlteue"; // const-string v2, "greatqlteue"
													 /* .line 130 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3c */
												 } // :cond_3b
												 if ( p1 != null) { // if-eqz p1, :cond_3d
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_3c */
													 /* .line 131 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3c */
													 final String v0 = "SM-N9500"; // const-string v0, "SM-N9500"
													 /* .line 132 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3c */
													 final String v0 = "SM-N9508"; // const-string v0, "SM-N9508"
													 /* .line 133 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3c */
													 final String v0 = "SM-N950F"; // const-string v0, "SM-N950F"
													 /* .line 134 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3c */
													 final String v0 = "SM-N950N"; // const-string v0, "SM-N950N"
													 /* .line 135 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3c */
													 final String v0 = "SM-N950U"; // const-string v0, "SM-N950U"
													 /* .line 136 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3c */
													 final String v0 = "SM-N950U1"; // const-string v0, "SM-N950U1"
													 /* .line 137 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3c */
													 final String v0 = "SM-N950W"; // const-string v0, "SM-N950W"
													 /* .line 138 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3c */
													 final String v0 = "SM-N950XN"; // const-string v0, "SM-N950XN"
													 /* .line 139 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_3d
													 } // :cond_3c
													 final String p0 = "Galaxy Note8"; // const-string p0, "Galaxy Note8"
												 } // :cond_3d
												 final String v0 = "SCV40"; // const-string v0, "SCV40"
												 final String v1 = "SC-01L"; // const-string v1, "SC-01L"
												 if ( p0 != null) { // if-eqz p0, :cond_3e
													 /* .line 140 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3f */
													 /* .line 141 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3f */
													 final String v2 = "crownlte"; // const-string v2, "crownlte"
													 /* .line 142 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3f */
													 final String v2 = "crownlteks"; // const-string v2, "crownlteks"
													 /* .line 143 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3f */
													 final String v2 = "crownqltechn"; // const-string v2, "crownqltechn"
													 /* .line 144 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3f */
													 final String v2 = "crownqltecs"; // const-string v2, "crownqltecs"
													 /* .line 145 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3f */
													 final String v2 = "crownqltesq"; // const-string v2, "crownqltesq"
													 /* .line 146 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3f */
													 final String v2 = "crownqlteue"; // const-string v2, "crownqlteue"
													 /* .line 147 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_3f */
												 } // :cond_3e
												 if ( p1 != null) { // if-eqz p1, :cond_40
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_3f */
													 /* .line 148 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3f */
													 final String v0 = "SM-N9600"; // const-string v0, "SM-N9600"
													 /* .line 149 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3f */
													 final String v0 = "SM-N960F"; // const-string v0, "SM-N960F"
													 /* .line 150 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3f */
													 final String v0 = "SM-N960N"; // const-string v0, "SM-N960N"
													 /* .line 151 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3f */
													 final String v0 = "SM-N960U"; // const-string v0, "SM-N960U"
													 /* .line 152 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3f */
													 final String v0 = "SM-N960U1"; // const-string v0, "SM-N960U1"
													 /* .line 153 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_3f */
													 final String v0 = "SM-N960W"; // const-string v0, "SM-N960W"
													 /* .line 154 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_40
													 } // :cond_3f
													 final String p0 = "Galaxy Note9"; // const-string p0, "Galaxy Note9"
												 } // :cond_40
												 final String v0 = "SCV41"; // const-string v0, "SCV41"
												 final String v1 = "SC-03L"; // const-string v1, "SC-03L"
												 if ( p0 != null) { // if-eqz p0, :cond_41
													 /* .line 155 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_42 */
													 /* .line 156 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_42 */
													 final String v2 = "beyond1"; // const-string v2, "beyond1"
													 /* .line 157 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_42 */
													 final String v2 = "beyond1q"; // const-string v2, "beyond1q"
													 /* .line 158 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_42 */
												 } // :cond_41
												 if ( p1 != null) { // if-eqz p1, :cond_43
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_42 */
													 /* .line 159 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_42 */
													 final String v0 = "SM-G9730"; // const-string v0, "SM-G9730"
													 /* .line 160 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_42 */
													 final String v0 = "SM-G9738"; // const-string v0, "SM-G9738"
													 /* .line 161 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_42 */
													 final String v0 = "SM-G973F"; // const-string v0, "SM-G973F"
													 /* .line 162 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_42 */
													 final String v0 = "SM-G973N"; // const-string v0, "SM-G973N"
													 /* .line 163 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_42 */
													 final String v0 = "SM-G973U"; // const-string v0, "SM-G973U"
													 /* .line 164 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_42 */
													 final String v0 = "SM-G973U1"; // const-string v0, "SM-G973U1"
													 /* .line 165 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_42 */
													 final String v0 = "SM-G973W"; // const-string v0, "SM-G973W"
													 /* .line 166 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_43
													 } // :cond_42
													 final String p0 = "Galaxy S10"; // const-string p0, "Galaxy S10"
												 } // :cond_43
												 final String v0 = "SCV42"; // const-string v0, "SCV42"
												 final String v1 = "SC-04L"; // const-string v1, "SC-04L"
												 if ( p0 != null) { // if-eqz p0, :cond_44
													 /* .line 167 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_45 */
													 /* .line 168 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_45 */
													 final String v2 = "beyond2"; // const-string v2, "beyond2"
													 /* .line 169 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_45 */
													 final String v2 = "beyond2q"; // const-string v2, "beyond2q"
													 /* .line 170 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_45 */
												 } // :cond_44
												 if ( p1 != null) { // if-eqz p1, :cond_46
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_45 */
													 /* .line 171 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_45 */
													 final String v0 = "SM-G9750"; // const-string v0, "SM-G9750"
													 /* .line 172 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_45 */
													 final String v0 = "SM-G9758"; // const-string v0, "SM-G9758"
													 /* .line 173 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_45 */
													 final String v0 = "SM-G975F"; // const-string v0, "SM-G975F"
													 /* .line 174 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_45 */
													 final String v0 = "SM-G975N"; // const-string v0, "SM-G975N"
													 /* .line 175 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_45 */
													 final String v0 = "SM-G975U"; // const-string v0, "SM-G975U"
													 /* .line 176 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_45 */
													 final String v0 = "SM-G975U1"; // const-string v0, "SM-G975U1"
													 /* .line 177 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_45 */
													 final String v0 = "SM-G975W"; // const-string v0, "SM-G975W"
													 /* .line 178 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_46
													 } // :cond_45
													 final String p0 = "Galaxy S10+"; // const-string p0, "Galaxy S10+"
												 } // :cond_46
												 if ( p0 != null) { // if-eqz p0, :cond_47
													 final String v0 = "beyond0"; // const-string v0, "beyond0"
													 /* .line 179 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_48 */
													 final String v0 = "beyond0q"; // const-string v0, "beyond0q"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_48 */
												 } // :cond_47
												 if ( p1 != null) { // if-eqz p1, :cond_49
													 final String v0 = "SM-G9700"; // const-string v0, "SM-G9700"
													 /* .line 180 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_48 */
													 final String v0 = "SM-G9708"; // const-string v0, "SM-G9708"
													 /* .line 181 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_48 */
													 final String v0 = "SM-G970F"; // const-string v0, "SM-G970F"
													 /* .line 182 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_48 */
													 final String v0 = "SM-G970N"; // const-string v0, "SM-G970N"
													 /* .line 183 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_48 */
													 final String v0 = "SM-G970U"; // const-string v0, "SM-G970U"
													 /* .line 184 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_48 */
													 final String v0 = "SM-G970U1"; // const-string v0, "SM-G970U1"
													 /* .line 185 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_48 */
													 final String v0 = "SM-G970W"; // const-string v0, "SM-G970W"
													 /* .line 186 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_49
													 } // :cond_48
													 final String p0 = "Galaxy S10e"; // const-string p0, "Galaxy S10e"
												 } // :cond_49
												 final String v0 = "SCL23"; // const-string v0, "SCL23"
												 final String v1 = "SC-04F"; // const-string v1, "SC-04F"
												 if ( p0 != null) { // if-eqz p0, :cond_4a
													 /* .line 187 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 /* .line 188 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "k3g"; // const-string v2, "k3g"
													 /* .line 189 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "klte"; // const-string v2, "klte"
													 /* .line 190 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "klteMetroPCS"; // const-string v2, "klteMetroPCS"
													 /* .line 191 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "klteacg"; // const-string v2, "klteacg"
													 /* .line 192 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "klteaio"; // const-string v2, "klteaio"
													 /* .line 193 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "klteatt"; // const-string v2, "klteatt"
													 /* .line 194 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "kltecan"; // const-string v2, "kltecan"
													 /* .line 195 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "klteduoszn"; // const-string v2, "klteduoszn"
													 /* .line 196 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "kltektt"; // const-string v2, "kltektt"
													 /* .line 197 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "kltelgt"; // const-string v2, "kltelgt"
													 /* .line 198 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "kltelra"; // const-string v2, "kltelra"
													 /* .line 199 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "klteskt"; // const-string v2, "klteskt"
													 /* .line 200 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "kltespr"; // const-string v2, "kltespr"
													 /* .line 201 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "kltetfnvzw"; // const-string v2, "kltetfnvzw"
													 /* .line 202 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "kltetmo"; // const-string v2, "kltetmo"
													 /* .line 203 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "klteusc"; // const-string v2, "klteusc"
													 /* .line 204 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "kltevzw"; // const-string v2, "kltevzw"
													 /* .line 205 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "kwifi"; // const-string v2, "kwifi"
													 /* .line 206 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "lentisltektt"; // const-string v2, "lentisltektt"
													 /* .line 207 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "lentisltelgt"; // const-string v2, "lentisltelgt"
													 /* .line 208 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "lentislteskt"; // const-string v2, "lentislteskt"
													 /* .line 209 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
												 } // :cond_4a
												 if ( p1 != null) { // if-eqz p1, :cond_4c
													 final String v2 = "SAMSUNG-SM-G900A"; // const-string v2, "SAMSUNG-SM-G900A"
													 v2 = 													 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 final String v2 = "SAMSUNG-SM-G900AZ"; // const-string v2, "SAMSUNG-SM-G900AZ"
													 /* .line 210 */
													 v2 = 													 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_4b */
													 /* .line 211 */
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_4b */
													 /* .line 212 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G9006W"; // const-string v0, "SM-G9006W"
													 /* .line 213 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G9008W"; // const-string v0, "SM-G9008W"
													 /* .line 214 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G9009W"; // const-string v0, "SM-G9009W"
													 /* .line 215 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900F"; // const-string v0, "SM-G900F"
													 /* .line 216 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900FQ"; // const-string v0, "SM-G900FQ"
													 /* .line 217 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900H"; // const-string v0, "SM-G900H"
													 /* .line 218 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900I"; // const-string v0, "SM-G900I"
													 /* .line 219 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900K"; // const-string v0, "SM-G900K"
													 /* .line 220 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900L"; // const-string v0, "SM-G900L"
													 /* .line 221 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900M"; // const-string v0, "SM-G900M"
													 /* .line 222 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900MD"; // const-string v0, "SM-G900MD"
													 /* .line 223 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900P"; // const-string v0, "SM-G900P"
													 /* .line 224 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900R4"; // const-string v0, "SM-G900R4"
													 /* .line 225 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900R6"; // const-string v0, "SM-G900R6"
													 /* .line 226 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900R7"; // const-string v0, "SM-G900R7"
													 /* .line 227 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900S"; // const-string v0, "SM-G900S"
													 /* .line 228 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900T"; // const-string v0, "SM-G900T"
													 /* .line 229 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900T1"; // const-string v0, "SM-G900T1"
													 /* .line 230 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900T3"; // const-string v0, "SM-G900T3"
													 /* .line 231 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900T4"; // const-string v0, "SM-G900T4"
													 /* .line 232 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900V"; // const-string v0, "SM-G900V"
													 /* .line 233 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900W8"; // const-string v0, "SM-G900W8"
													 /* .line 234 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G900X"; // const-string v0, "SM-G900X"
													 /* .line 235 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G906K"; // const-string v0, "SM-G906K"
													 /* .line 236 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G906L"; // const-string v0, "SM-G906L"
													 /* .line 237 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-G906S"; // const-string v0, "SM-G906S"
													 /* .line 238 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4b */
													 final String v0 = "SM-S903VL"; // const-string v0, "SM-S903VL"
													 /* .line 239 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_4c
													 } // :cond_4b
													 final String p0 = "Galaxy S5"; // const-string p0, "Galaxy S5"
												 } // :cond_4c
												 if ( p0 != null) { // if-eqz p0, :cond_4d
													 final String v0 = "s5neolte"; // const-string v0, "s5neolte"
													 /* .line 240 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4e */
													 final String v0 = "s5neoltecan"; // const-string v0, "s5neoltecan"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4e */
												 } // :cond_4d
												 if ( p1 != null) { // if-eqz p1, :cond_4f
													 final String v0 = "SM-G903F"; // const-string v0, "SM-G903F"
													 /* .line 241 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4e */
													 final String v0 = "SM-G903M"; // const-string v0, "SM-G903M"
													 /* .line 242 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_4e */
													 final String v0 = "SM-G903W"; // const-string v0, "SM-G903W"
													 /* .line 243 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_4f
													 } // :cond_4e
													 final String p0 = "Galaxy S5 Neo"; // const-string p0, "Galaxy S5 Neo"
												 } // :cond_4f
												 final String v0 = "SC-05G"; // const-string v0, "SC-05G"
												 if ( p0 != null) { // if-eqz p0, :cond_50
													 /* .line 244 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zeroflte"; // const-string v1, "zeroflte"
													 /* .line 245 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zeroflteacg"; // const-string v1, "zeroflteacg"
													 /* .line 246 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zeroflteaio"; // const-string v1, "zeroflteaio"
													 /* .line 247 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zeroflteatt"; // const-string v1, "zeroflteatt"
													 /* .line 248 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltebmc"; // const-string v1, "zerofltebmc"
													 /* .line 249 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltechn"; // const-string v1, "zerofltechn"
													 /* .line 250 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltectc"; // const-string v1, "zerofltectc"
													 /* .line 251 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltektt"; // const-string v1, "zerofltektt"
													 /* .line 252 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltelgt"; // const-string v1, "zerofltelgt"
													 /* .line 253 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltelra"; // const-string v1, "zerofltelra"
													 /* .line 254 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltemtr"; // const-string v1, "zerofltemtr"
													 /* .line 255 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zeroflteskt"; // const-string v1, "zeroflteskt"
													 /* .line 256 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltespr"; // const-string v1, "zerofltespr"
													 /* .line 257 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltetfnvzw"; // const-string v1, "zerofltetfnvzw"
													 /* .line 258 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltetmo"; // const-string v1, "zerofltetmo"
													 /* .line 259 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zeroflteusc"; // const-string v1, "zeroflteusc"
													 /* .line 260 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "zerofltevzw"; // const-string v1, "zerofltevzw"
													 /* .line 261 */
													 v1 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
												 } // :cond_50
												 if ( p1 != null) { // if-eqz p1, :cond_52
													 final String v1 = "SAMSUNG-SM-G920A"; // const-string v1, "SAMSUNG-SM-G920A"
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 final String v1 = "SAMSUNG-SM-G920AZ"; // const-string v1, "SAMSUNG-SM-G920AZ"
													 /* .line 262 */
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_51 */
													 /* .line 263 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G9200"; // const-string v0, "SM-G9200"
													 /* .line 264 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G9208"; // const-string v0, "SM-G9208"
													 /* .line 265 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G9209"; // const-string v0, "SM-G9209"
													 /* .line 266 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920F"; // const-string v0, "SM-G920F"
													 /* .line 267 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920I"; // const-string v0, "SM-G920I"
													 /* .line 268 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920K"; // const-string v0, "SM-G920K"
													 /* .line 269 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920L"; // const-string v0, "SM-G920L"
													 /* .line 270 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920P"; // const-string v0, "SM-G920P"
													 /* .line 271 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920R4"; // const-string v0, "SM-G920R4"
													 /* .line 272 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920R6"; // const-string v0, "SM-G920R6"
													 /* .line 273 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920R7"; // const-string v0, "SM-G920R7"
													 /* .line 274 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920S"; // const-string v0, "SM-G920S"
													 /* .line 275 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920T"; // const-string v0, "SM-G920T"
													 /* .line 276 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920T1"; // const-string v0, "SM-G920T1"
													 /* .line 277 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920V"; // const-string v0, "SM-G920V"
													 /* .line 278 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920W8"; // const-string v0, "SM-G920W8"
													 /* .line 279 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-G920X"; // const-string v0, "SM-G920X"
													 /* .line 280 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-S906L"; // const-string v0, "SM-S906L"
													 /* .line 281 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_51 */
													 final String v0 = "SM-S907VL"; // const-string v0, "SM-S907VL"
													 /* .line 282 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_52
													 } // :cond_51
													 final String p0 = "Galaxy S6"; // const-string p0, "Galaxy S6"
												 } // :cond_52
												 final String v0 = "SCV31"; // const-string v0, "SCV31"
												 final String v1 = "SC-04G"; // const-string v1, "SC-04G"
												 final String v2 = "404SC"; // const-string v2, "404SC"
												 if ( p0 != null) { // if-eqz p0, :cond_53
													 /* .line 283 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 /* .line 284 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 /* .line 285 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zerolte"; // const-string v3, "zerolte"
													 /* .line 286 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zerolteacg"; // const-string v3, "zerolteacg"
													 /* .line 287 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zerolteatt"; // const-string v3, "zerolteatt"
													 /* .line 288 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zeroltebmc"; // const-string v3, "zeroltebmc"
													 /* .line 289 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zeroltechn"; // const-string v3, "zeroltechn"
													 /* .line 290 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zeroltektt"; // const-string v3, "zeroltektt"
													 /* .line 291 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zeroltelra"; // const-string v3, "zeroltelra"
													 /* .line 292 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zerolteskt"; // const-string v3, "zerolteskt"
													 /* .line 293 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zeroltespr"; // const-string v3, "zeroltespr"
													 /* .line 294 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zeroltetmo"; // const-string v3, "zeroltetmo"
													 /* .line 295 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zerolteusc"; // const-string v3, "zerolteusc"
													 /* .line 296 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
													 final String v3 = "zeroltevzw"; // const-string v3, "zeroltevzw"
													 /* .line 297 */
													 v3 = 													 (( java.lang.String ) p0 ).equals ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v3, :cond_54 */
												 } // :cond_53
												 if ( p1 != null) { // if-eqz p1, :cond_55
													 v2 = 													 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_54 */
													 final String v2 = "SAMSUNG-SM-G925A"; // const-string v2, "SAMSUNG-SM-G925A"
													 /* .line 298 */
													 v2 = 													 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_54 */
													 /* .line 299 */
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_54 */
													 /* .line 300 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G9250"; // const-string v0, "SM-G9250"
													 /* .line 301 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925I"; // const-string v0, "SM-G925I"
													 /* .line 302 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925K"; // const-string v0, "SM-G925K"
													 /* .line 303 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925P"; // const-string v0, "SM-G925P"
													 /* .line 304 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925R4"; // const-string v0, "SM-G925R4"
													 /* .line 305 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925R6"; // const-string v0, "SM-G925R6"
													 /* .line 306 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925R7"; // const-string v0, "SM-G925R7"
													 /* .line 307 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925S"; // const-string v0, "SM-G925S"
													 /* .line 308 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925T"; // const-string v0, "SM-G925T"
													 /* .line 309 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925V"; // const-string v0, "SM-G925V"
													 /* .line 310 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925W8"; // const-string v0, "SM-G925W8"
													 /* .line 311 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_54 */
													 final String v0 = "SM-G925X"; // const-string v0, "SM-G925X"
													 /* .line 312 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_55
													 } // :cond_54
													 final String p0 = "Galaxy S6 Edge"; // const-string p0, "Galaxy S6 Edge"
												 } // :cond_55
												 if ( p0 != null) { // if-eqz p0, :cond_56
													 final String v0 = "zenlte"; // const-string v0, "zenlte"
													 /* .line 313 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenlteatt"; // const-string v0, "zenlteatt"
													 /* .line 314 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenltebmc"; // const-string v0, "zenltebmc"
													 /* .line 315 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenltechn"; // const-string v0, "zenltechn"
													 /* .line 316 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenltektt"; // const-string v0, "zenltektt"
													 /* .line 317 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenltekx"; // const-string v0, "zenltekx"
													 /* .line 318 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenltelgt"; // const-string v0, "zenltelgt"
													 /* .line 319 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenlteskt"; // const-string v0, "zenlteskt"
													 /* .line 320 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenltespr"; // const-string v0, "zenltespr"
													 /* .line 321 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenltetmo"; // const-string v0, "zenltetmo"
													 /* .line 322 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenlteusc"; // const-string v0, "zenlteusc"
													 /* .line 323 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "zenltevzw"; // const-string v0, "zenltevzw"
													 /* .line 324 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
												 } // :cond_56
												 if ( p1 != null) { // if-eqz p1, :cond_58
													 final String v0 = "SAMSUNG-SM-G928A"; // const-string v0, "SAMSUNG-SM-G928A"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G9280"; // const-string v0, "SM-G9280"
													 /* .line 325 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G9287C"; // const-string v0, "SM-G9287C"
													 /* .line 326 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928C"; // const-string v0, "SM-G928C"
													 /* .line 327 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928G"; // const-string v0, "SM-G928G"
													 /* .line 328 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928I"; // const-string v0, "SM-G928I"
													 /* .line 329 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928K"; // const-string v0, "SM-G928K"
													 /* .line 330 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928L"; // const-string v0, "SM-G928L"
													 /* .line 331 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928N0"; // const-string v0, "SM-G928N0"
													 /* .line 332 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928P"; // const-string v0, "SM-G928P"
													 /* .line 333 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928R4"; // const-string v0, "SM-G928R4"
													 /* .line 334 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928S"; // const-string v0, "SM-G928S"
													 /* .line 335 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928T"; // const-string v0, "SM-G928T"
													 /* .line 336 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928V"; // const-string v0, "SM-G928V"
													 /* .line 337 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928W8"; // const-string v0, "SM-G928W8"
													 /* .line 338 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_57 */
													 final String v0 = "SM-G928X"; // const-string v0, "SM-G928X"
													 /* .line 339 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_58
													 } // :cond_57
													 final String p0 = "Galaxy S6 Edge+"; // const-string p0, "Galaxy S6 Edge+"
												 } // :cond_58
												 if ( p0 != null) { // if-eqz p0, :cond_59
													 final String v0 = "herolte"; // const-string v0, "herolte"
													 /* .line 340 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroltebmc"; // const-string v0, "heroltebmc"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroltektt"; // const-string v0, "heroltektt"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroltelgt"; // const-string v0, "heroltelgt"
													 /* .line 341 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "herolteskt"; // const-string v0, "herolteskt"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqlteacg"; // const-string v0, "heroqlteacg"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqlteaio"; // const-string v0, "heroqlteaio"
													 /* .line 342 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqlteatt"; // const-string v0, "heroqlteatt"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqltecctvzw"; // const-string v0, "heroqltecctvzw"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqltechn"; // const-string v0, "heroqltechn"
													 /* .line 343 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqltelra"; // const-string v0, "heroqltelra"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqltemtr"; // const-string v0, "heroqltemtr"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqltespr"; // const-string v0, "heroqltespr"
													 /* .line 344 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqltetfnvzw"; // const-string v0, "heroqltetfnvzw"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqltetmo"; // const-string v0, "heroqltetmo"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqlteue"; // const-string v0, "heroqlteue"
													 /* .line 345 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqlteusc"; // const-string v0, "heroqlteusc"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "heroqltevzw"; // const-string v0, "heroqltevzw"
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
												 } // :cond_59
												 if ( p1 != null) { // if-eqz p1, :cond_5b
													 final String v0 = "SAMSUNG-SM-G930A"; // const-string v0, "SAMSUNG-SM-G930A"
													 /* .line 346 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SAMSUNG-SM-G930AZ"; // const-string v0, "SAMSUNG-SM-G930AZ"
													 /* .line 347 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G9300"; // const-string v0, "SM-G9300"
													 /* .line 348 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G9308"; // const-string v0, "SM-G9308"
													 /* .line 349 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930F"; // const-string v0, "SM-G930F"
													 /* .line 350 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930K"; // const-string v0, "SM-G930K"
													 /* .line 351 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930L"; // const-string v0, "SM-G930L"
													 /* .line 352 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930P"; // const-string v0, "SM-G930P"
													 /* .line 353 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930R4"; // const-string v0, "SM-G930R4"
													 /* .line 354 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930R6"; // const-string v0, "SM-G930R6"
													 /* .line 355 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930R7"; // const-string v0, "SM-G930R7"
													 /* .line 356 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930S"; // const-string v0, "SM-G930S"
													 /* .line 357 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930T"; // const-string v0, "SM-G930T"
													 /* .line 358 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930T1"; // const-string v0, "SM-G930T1"
													 /* .line 359 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930U"; // const-string v0, "SM-G930U"
													 /* .line 360 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930V"; // const-string v0, "SM-G930V"
													 /* .line 361 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930VC"; // const-string v0, "SM-G930VC"
													 /* .line 362 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930VL"; // const-string v0, "SM-G930VL"
													 /* .line 363 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930W8"; // const-string v0, "SM-G930W8"
													 /* .line 364 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5a */
													 final String v0 = "SM-G930X"; // const-string v0, "SM-G930X"
													 /* .line 365 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_5b
													 } // :cond_5a
													 final String p0 = "Galaxy S7"; // const-string p0, "Galaxy S7"
												 } // :cond_5b
												 final String v0 = "SCV33"; // const-string v0, "SCV33"
												 final String v1 = "SC-02H"; // const-string v1, "SC-02H"
												 if ( p0 != null) { // if-eqz p0, :cond_5c
													 /* .line 366 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 /* .line 367 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2lte"; // const-string v2, "hero2lte"
													 /* .line 368 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2ltebmc"; // const-string v2, "hero2ltebmc"
													 /* .line 369 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2ltektt"; // const-string v2, "hero2ltektt"
													 /* .line 370 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2lteskt"; // const-string v2, "hero2lteskt"
													 /* .line 371 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2qlteatt"; // const-string v2, "hero2qlteatt"
													 /* .line 372 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2qltecctvzw"; // const-string v2, "hero2qltecctvzw"
													 /* .line 373 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2qltespr"; // const-string v2, "hero2qltespr"
													 /* .line 374 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2qltetmo"; // const-string v2, "hero2qltetmo"
													 /* .line 375 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2qlteusc"; // const-string v2, "hero2qlteusc"
													 /* .line 376 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 final String v2 = "hero2qltevzw"; // const-string v2, "hero2qltevzw"
													 /* .line 377 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
												 } // :cond_5c
												 if ( p1 != null) { // if-eqz p1, :cond_5e
													 final String v2 = "SAMSUNG-SM-G935A"; // const-string v2, "SAMSUNG-SM-G935A"
													 v2 = 													 (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_5d */
													 /* .line 378 */
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_5d */
													 /* .line 379 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5d */
													 final String v0 = "SM-G935K"; // const-string v0, "SM-G935K"
													 /* .line 380 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5d */
													 final String v0 = "SM-G935P"; // const-string v0, "SM-G935P"
													 /* .line 381 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5d */
													 final String v0 = "SM-G935R4"; // const-string v0, "SM-G935R4"
													 /* .line 382 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5d */
													 final String v0 = "SM-G935S"; // const-string v0, "SM-G935S"
													 /* .line 383 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5d */
													 final String v0 = "SM-G935T"; // const-string v0, "SM-G935T"
													 /* .line 384 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5d */
													 final String v0 = "SM-G935V"; // const-string v0, "SM-G935V"
													 /* .line 385 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5d */
													 final String v0 = "SM-G935VC"; // const-string v0, "SM-G935VC"
													 /* .line 386 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5d */
													 final String v0 = "SM-G935W8"; // const-string v0, "SM-G935W8"
													 /* .line 387 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_5d */
													 final String v0 = "SM-G935X"; // const-string v0, "SM-G935X"
													 /* .line 388 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_5e
													 } // :cond_5d
													 final String p0 = "Galaxy S7 Edge"; // const-string p0, "Galaxy S7 Edge"
												 } // :cond_5e
												 final String v0 = "SCV36"; // const-string v0, "SCV36"
												 final String v1 = "SC-02J"; // const-string v1, "SC-02J"
												 if ( p0 != null) { // if-eqz p0, :cond_5f
													 /* .line 389 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_60 */
													 /* .line 390 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_60 */
													 final String v2 = "dreamlte"; // const-string v2, "dreamlte"
													 /* .line 391 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_60 */
													 final String v2 = "dreamlteks"; // const-string v2, "dreamlteks"
													 /* .line 392 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_60 */
													 final String v2 = "dreamqltecan"; // const-string v2, "dreamqltecan"
													 /* .line 393 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_60 */
													 final String v2 = "dreamqltechn"; // const-string v2, "dreamqltechn"
													 /* .line 394 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_60 */
													 final String v2 = "dreamqltecmcc"; // const-string v2, "dreamqltecmcc"
													 /* .line 395 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_60 */
													 final String v2 = "dreamqltesq"; // const-string v2, "dreamqltesq"
													 /* .line 396 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_60 */
													 final String v2 = "dreamqlteue"; // const-string v2, "dreamqlteue"
													 /* .line 397 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_60 */
												 } // :cond_5f
												 if ( p1 != null) { // if-eqz p1, :cond_61
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_60 */
													 /* .line 398 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_60 */
													 final String v0 = "SM-G9500"; // const-string v0, "SM-G9500"
													 /* .line 399 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_60 */
													 final String v0 = "SM-G9508"; // const-string v0, "SM-G9508"
													 /* .line 400 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_60 */
													 final String v0 = "SM-G950F"; // const-string v0, "SM-G950F"
													 /* .line 401 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_60 */
													 final String v0 = "SM-G950N"; // const-string v0, "SM-G950N"
													 /* .line 402 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_60 */
													 final String v0 = "SM-G950U"; // const-string v0, "SM-G950U"
													 /* .line 403 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_60 */
													 final String v0 = "SM-G950U1"; // const-string v0, "SM-G950U1"
													 /* .line 404 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_60 */
													 final String v0 = "SM-G950W"; // const-string v0, "SM-G950W"
													 /* .line 405 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_61
													 } // :cond_60
													 final String p0 = "Galaxy S8"; // const-string p0, "Galaxy S8"
												 } // :cond_61
												 final String v0 = "SCV35"; // const-string v0, "SCV35"
												 final String v1 = "SC-03J"; // const-string v1, "SC-03J"
												 if ( p0 != null) { // if-eqz p0, :cond_62
													 /* .line 406 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_63 */
													 /* .line 407 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_63 */
													 final String v2 = "dream2lte"; // const-string v2, "dream2lte"
													 /* .line 408 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_63 */
													 final String v2 = "dream2lteks"; // const-string v2, "dream2lteks"
													 /* .line 409 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_63 */
													 final String v2 = "dream2qltecan"; // const-string v2, "dream2qltecan"
													 /* .line 410 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_63 */
													 final String v2 = "dream2qltechn"; // const-string v2, "dream2qltechn"
													 /* .line 411 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_63 */
													 final String v2 = "dream2qltesq"; // const-string v2, "dream2qltesq"
													 /* .line 412 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_63 */
													 final String v2 = "dream2qlteue"; // const-string v2, "dream2qlteue"
													 /* .line 413 */
													 v2 = 													 (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v2, :cond_63 */
												 } // :cond_62
												 if ( p1 != null) { // if-eqz p1, :cond_64
													 v1 = 													 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v1, :cond_63 */
													 /* .line 414 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_63 */
													 final String v0 = "SM-G9550"; // const-string v0, "SM-G9550"
													 /* .line 415 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_63 */
													 final String v0 = "SM-G955F"; // const-string v0, "SM-G955F"
													 /* .line 416 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_63 */
													 final String v0 = "SM-G955N"; // const-string v0, "SM-G955N"
													 /* .line 417 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_63 */
													 final String v0 = "SM-G955U"; // const-string v0, "SM-G955U"
													 /* .line 418 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_63 */
													 final String v0 = "SM-G955U1"; // const-string v0, "SM-G955U1"
													 /* .line 419 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_63 */
													 final String v0 = "SM-G955W"; // const-string v0, "SM-G955W"
													 /* .line 420 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_64
													 } // :cond_63
													 final String p0 = "Galaxy S8+"; // const-string p0, "Galaxy S8+"
												 } // :cond_64
												 if ( p0 != null) { // if-eqz p0, :cond_65
													 final String v0 = "SC-02K"; // const-string v0, "SC-02K"
													 /* .line 421 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "SCV38"; // const-string v0, "SCV38"
													 /* .line 422 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "starlte"; // const-string v0, "starlte"
													 /* .line 423 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "starlteks"; // const-string v0, "starlteks"
													 /* .line 424 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "starqltechn"; // const-string v0, "starqltechn"
													 /* .line 425 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "starqltecmcc"; // const-string v0, "starqltecmcc"
													 /* .line 426 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "starqltecs"; // const-string v0, "starqltecs"
													 /* .line 427 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "starqltesq"; // const-string v0, "starqltesq"
													 /* .line 428 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "starqlteue"; // const-string v0, "starqlteue"
													 /* .line 429 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
												 } // :cond_65
												 if ( p1 != null) { // if-eqz p1, :cond_67
													 final String v0 = "SC-02K"; // const-string v0, "SC-02K"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "SCV38"; // const-string v0, "SCV38"
													 /* .line 430 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "SM-G9600"; // const-string v0, "SM-G9600"
													 /* .line 431 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "SM-G9608"; // const-string v0, "SM-G9608"
													 /* .line 432 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "SM-G960F"; // const-string v0, "SM-G960F"
													 /* .line 433 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "SM-G960N"; // const-string v0, "SM-G960N"
													 /* .line 434 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "SM-G960U"; // const-string v0, "SM-G960U"
													 /* .line 435 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "SM-G960U1"; // const-string v0, "SM-G960U1"
													 /* .line 436 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_66 */
													 final String v0 = "SM-G960W"; // const-string v0, "SM-G960W"
													 /* .line 437 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_67
													 } // :cond_66
													 final String p0 = "Galaxy S9"; // const-string p0, "Galaxy S9"
												 } // :cond_67
												 if ( p0 != null) { // if-eqz p0, :cond_68
													 final String v0 = "SC-03K"; // const-string v0, "SC-03K"
													 /* .line 438 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "SCV39"; // const-string v0, "SCV39"
													 /* .line 439 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "star2lte"; // const-string v0, "star2lte"
													 /* .line 440 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "star2lteks"; // const-string v0, "star2lteks"
													 /* .line 441 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "star2qltechn"; // const-string v0, "star2qltechn"
													 /* .line 442 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "star2qltecs"; // const-string v0, "star2qltecs"
													 /* .line 443 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "star2qltesq"; // const-string v0, "star2qltesq"
													 /* .line 444 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "star2qlteue"; // const-string v0, "star2qlteue"
													 /* .line 445 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
												 } // :cond_68
												 if ( p1 != null) { // if-eqz p1, :cond_6a
													 final String v0 = "SC-03K"; // const-string v0, "SC-03K"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "SCV39"; // const-string v0, "SCV39"
													 /* .line 446 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "SM-G9650"; // const-string v0, "SM-G9650"
													 /* .line 447 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "SM-G965F"; // const-string v0, "SM-G965F"
													 /* .line 448 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "SM-G965N"; // const-string v0, "SM-G965N"
													 /* .line 449 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "SM-G965U"; // const-string v0, "SM-G965U"
													 /* .line 450 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "SM-G965U1"; // const-string v0, "SM-G965U1"
													 /* .line 451 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_69 */
													 final String v0 = "SM-G965W"; // const-string v0, "SM-G965W"
													 /* .line 452 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_6a
													 } // :cond_69
													 final String p0 = "Galaxy S9+"; // const-string p0, "Galaxy S9+"
												 } // :cond_6a
												 if ( p0 != null) { // if-eqz p0, :cond_6b
													 final String v0 = "802SO"; // const-string v0, "802SO"
													 /* .line 453 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "J8110"; // const-string v0, "J8110"
													 /* .line 454 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "J8170"; // const-string v0, "J8170"
													 /* .line 455 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "J9110"; // const-string v0, "J9110"
													 /* .line 456 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "SO-03L"; // const-string v0, "SO-03L"
													 /* .line 457 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "SOV40"; // const-string v0, "SOV40"
													 /* .line 458 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
												 } // :cond_6b
												 if ( p1 != null) { // if-eqz p1, :cond_6d
													 final String v0 = "802SO"; // const-string v0, "802SO"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "J8110"; // const-string v0, "J8110"
													 /* .line 459 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "J8170"; // const-string v0, "J8170"
													 /* .line 460 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "J9110"; // const-string v0, "J9110"
													 /* .line 461 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "SO-03L"; // const-string v0, "SO-03L"
													 /* .line 462 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6c */
													 final String v0 = "SOV40"; // const-string v0, "SOV40"
													 /* .line 463 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_6d
													 } // :cond_6c
													 final String p0 = "Xperia 1"; // const-string p0, "Xperia 1"
												 } // :cond_6d
												 if ( p0 != null) { // if-eqz p0, :cond_6e
													 final String v0 = "I3113"; // const-string v0, "I3113"
													 /* .line 464 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6f */
													 final String v0 = "I3123"; // const-string v0, "I3123"
													 /* .line 465 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6f */
													 final String v0 = "I4113"; // const-string v0, "I4113"
													 /* .line 466 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6f */
													 final String v0 = "I4193"; // const-string v0, "I4193"
													 /* .line 467 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6f */
												 } // :cond_6e
												 if ( p1 != null) { // if-eqz p1, :cond_70
													 final String v0 = "I3113"; // const-string v0, "I3113"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6f */
													 final String v0 = "I3123"; // const-string v0, "I3123"
													 /* .line 468 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6f */
													 final String v0 = "I4113"; // const-string v0, "I4113"
													 /* .line 469 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_6f */
													 final String v0 = "I4193"; // const-string v0, "I4193"
													 /* .line 470 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_70
													 } // :cond_6f
													 final String p0 = "Xperia 10"; // const-string p0, "Xperia 10"
												 } // :cond_70
												 if ( p0 != null) { // if-eqz p0, :cond_71
													 final String v0 = "I3213"; // const-string v0, "I3213"
													 /* .line 471 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_72 */
													 final String v0 = "I3223"; // const-string v0, "I3223"
													 /* .line 472 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_72 */
													 final String v0 = "I4213"; // const-string v0, "I4213"
													 /* .line 473 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_72 */
													 final String v0 = "I4293"; // const-string v0, "I4293"
													 /* .line 474 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_72 */
												 } // :cond_71
												 if ( p1 != null) { // if-eqz p1, :cond_73
													 final String v0 = "I3213"; // const-string v0, "I3213"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_72 */
													 final String v0 = "I3223"; // const-string v0, "I3223"
													 /* .line 475 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_72 */
													 final String v0 = "I4213"; // const-string v0, "I4213"
													 /* .line 476 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_72 */
													 final String v0 = "I4293"; // const-string v0, "I4293"
													 /* .line 477 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_73
													 } // :cond_72
													 final String p0 = "Xperia 10 Plus"; // const-string p0, "Xperia 10 Plus"
												 } // :cond_73
												 if ( p0 != null) { // if-eqz p0, :cond_74
													 final String v0 = "702SO"; // const-string v0, "702SO"
													 /* .line 478 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "H8216"; // const-string v0, "H8216"
													 /* .line 479 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "H8266"; // const-string v0, "H8266"
													 /* .line 480 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "H8276"; // const-string v0, "H8276"
													 /* .line 481 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "H8296"; // const-string v0, "H8296"
													 /* .line 482 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "SO-03K"; // const-string v0, "SO-03K"
													 /* .line 483 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "SOV37"; // const-string v0, "SOV37"
													 /* .line 484 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
												 } // :cond_74
												 if ( p1 != null) { // if-eqz p1, :cond_76
													 final String v0 = "702SO"; // const-string v0, "702SO"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "H8216"; // const-string v0, "H8216"
													 /* .line 485 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "H8266"; // const-string v0, "H8266"
													 /* .line 486 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "H8276"; // const-string v0, "H8276"
													 /* .line 487 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "H8296"; // const-string v0, "H8296"
													 /* .line 488 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "SO-03K"; // const-string v0, "SO-03K"
													 /* .line 489 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_75 */
													 final String v0 = "SOV37"; // const-string v0, "SOV37"
													 /* .line 490 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_76
													 } // :cond_75
													 final String p0 = "Xperia XZ2"; // const-string p0, "Xperia XZ2"
												 } // :cond_76
												 if ( p0 != null) { // if-eqz p0, :cond_77
													 final String v0 = "H8116"; // const-string v0, "H8116"
													 /* .line 491 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_78 */
													 final String v0 = "H8166"; // const-string v0, "H8166"
													 /* .line 492 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_78 */
													 final String v0 = "SO-04K"; // const-string v0, "SO-04K"
													 /* .line 493 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_78 */
													 final String v0 = "SOV38"; // const-string v0, "SOV38"
													 /* .line 494 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_78 */
												 } // :cond_77
												 if ( p1 != null) { // if-eqz p1, :cond_79
													 final String v0 = "H8116"; // const-string v0, "H8116"
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_78 */
													 final String v0 = "H8166"; // const-string v0, "H8166"
													 /* .line 495 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_78 */
													 final String v0 = "SO-04K"; // const-string v0, "SO-04K"
													 /* .line 496 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_78 */
													 final String v0 = "SOV38"; // const-string v0, "SOV38"
													 /* .line 497 */
													 v0 = 													 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( v0 != null) { // if-eqz v0, :cond_79
													 } // :cond_78
													 final String p0 = "Xperia XZ2 Premium"; // const-string p0, "Xperia XZ2 Premium"
												 } // :cond_79
												 if ( p0 != null) { // if-eqz p0, :cond_7a
													 final String v0 = "801SO"; // const-string v0, "801SO"
													 /* .line 498 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_7b */
													 final String v0 = "H8416"; // const-string v0, "H8416"
													 /* .line 499 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_7b */
													 final String v0 = "H9436"; // const-string v0, "H9436"
													 /* .line 500 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_7b */
													 final String v0 = "H9493"; // const-string v0, "H9493"
													 /* .line 501 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_7b */
													 final String v0 = "SO-01L"; // const-string v0, "SO-01L"
													 /* .line 502 */
													 v0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez v0, :cond_7b */
													 final String v0 = "SOV39"; // const-string v0, "SOV39"
													 /* .line 503 */
													 p0 = 													 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez p0, :cond_7b */
												 } // :cond_7a
												 if ( p1 != null) { // if-eqz p1, :cond_7c
													 final String p0 = "801SO"; // const-string p0, "801SO"
													 p0 = 													 (( java.lang.String ) p1 ).equals ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez p0, :cond_7b */
													 final String p0 = "H8416"; // const-string p0, "H8416"
													 /* .line 504 */
													 p0 = 													 (( java.lang.String ) p1 ).equals ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez p0, :cond_7b */
													 final String p0 = "H9436"; // const-string p0, "H9436"
													 /* .line 505 */
													 p0 = 													 (( java.lang.String ) p1 ).equals ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez p0, :cond_7b */
													 final String p0 = "H9493"; // const-string p0, "H9493"
													 /* .line 506 */
													 p0 = 													 (( java.lang.String ) p1 ).equals ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez p0, :cond_7b */
													 final String p0 = "SO-01L"; // const-string p0, "SO-01L"
													 /* .line 507 */
													 p0 = 													 (( java.lang.String ) p1 ).equals ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 /* if-nez p0, :cond_7b */
													 final String p0 = "SOV39"; // const-string p0, "SOV39"
													 /* .line 508 */
													 p0 = 													 (( java.lang.String ) p1 ).equals ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
													 if ( p0 != null) { // if-eqz p0, :cond_7c
													 } // :cond_7b
													 final String p0 = "Xperia XZ3"; // const-string p0, "Xperia XZ3"
												 } // :cond_7c
											 } // .end method
											 public static java.lang.String b ( java.lang.String p0 ) {
												 /* .locals 4 */
												 /* .annotation system Ldalvik/annotation/Throws; */
												 /* value = { */
												 /* Ljava/io/IOException; */
												 /* } */
											 } // .end annotation
											 /* .line 1 */
											 /* new-instance v0, Ljava/lang/StringBuilder; */
											 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
											 int v1 = 0; // const/4 v1, 0x0
											 /* .line 2 */
											 try { // :try_start_0
												 /* new-instance v2, Ljava/net/URL; */
												 /* invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
												 /* .line 3 */
												 (( java.net.URL ) v2 ).openConnection ( ); // invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
												 /* check-cast p0, Ljava/net/HttpURLConnection; */
												 /* const/16 v2, 0x2710 */
												 /* .line 4 */
												 (( java.net.HttpURLConnection ) p0 ).setReadTimeout ( v2 ); // invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
												 /* const/16 v2, 0x3a98 */
												 /* .line 5 */
												 (( java.net.HttpURLConnection ) p0 ).setConnectTimeout ( v2 ); // invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
												 final String v2 = "GET"; // const-string v2, "GET"
												 /* .line 6 */
												 (( java.net.HttpURLConnection ) p0 ).setRequestMethod ( v2 ); // invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
												 int v2 = 1; // const/4 v2, 0x1
												 /* .line 7 */
												 (( java.net.HttpURLConnection ) p0 ).setDoInput ( v2 ); // invoke-virtual {p0, v2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
												 /* .line 8 */
												 (( java.net.HttpURLConnection ) p0 ).connect ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->connect()V
												 /* .line 9 */
												 v2 = 												 (( java.net.HttpURLConnection ) p0 ).getResponseCode ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I
												 /* const/16 v3, 0xc8 */
												 /* if-ne v2, v3, :cond_1 */
												 /* .line 10 */
												 /* new-instance v2, Ljava/io/BufferedReader; */
												 /* new-instance v3, Ljava/io/InputStreamReader; */
												 (( java.net.HttpURLConnection ) p0 ).getInputStream ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
												 /* invoke-direct {v3, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
												 /* invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
												 /* :try_end_0 */
												 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
												 /* .line 11 */
											 } // :goto_0
											 try { // :try_start_1
												 (( java.io.BufferedReader ) v2 ).readLine ( ); // invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
												 if ( p0 != null) { // if-eqz p0, :cond_0
													 /* .line 12 */
													 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
													 /* const/16 p0, 0xa */
													 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
													 /* :try_end_1 */
													 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
												 } // :cond_0
												 /* move-object v1, v2 */
												 /* :catchall_0 */
												 /* move-exception p0 */
												 /* move-object v1, v2 */
												 /* .line 13 */
											 } // :cond_1
										 } // :goto_1
										 try { // :try_start_2
											 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
											 /* :try_end_2 */
											 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
											 if ( v1 != null) { // if-eqz v1, :cond_2
												 /* .line 14 */
												 (( java.io.BufferedReader ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
											 } // :cond_2
											 /* :catchall_1 */
											 /* move-exception p0 */
										 } // :goto_2
										 if ( v1 != null) { // if-eqz v1, :cond_3
											 (( java.io.BufferedReader ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
										 } // :cond_3
										 /* throw p0 */
									 } // .end method
