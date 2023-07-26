public class e.f.c.s.t.f {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.io.File a;
	 public final e.f.c.h b;
	 /* # direct methods */
	 public e.f.c.s.t.f ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/io/File; */
		 /* .line 3 */
		 (( e.f.c.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;
		 (( android.content.Context ) v1 ).getFilesDir ( ); // invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "PersistedInstallation."; // const-string v3, "PersistedInstallation."
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 4 */
		 (( e.f.c.h ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/c/h;->e()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v3 = ".json"; // const-string v3, ".json"
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
		 this.a = v0;
		 /* .line 5 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.f.c.s.t.h a ( Object p0 ) {
		 /* .locals 4 */
		 /* .line 9 */
		 try { // :try_start_0
			 /* new-instance v0, Lorg/json/JSONObject; */
			 /* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
			 final String v1 = "Fid"; // const-string v1, "Fid"
			 /* .line 10 */
			 (( e.f.c.s.t.h ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;
			 (( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
			 final String v1 = "Status"; // const-string v1, "Status"
			 /* .line 11 */
			 (( e.f.c.s.t.h ) p1 ).f ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->f()Le/f/c/s/t/e;
			 v2 = 			 (( java.lang.Enum ) v2 ).ordinal ( ); // invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I
			 (( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
			 final String v1 = "AuthToken"; // const-string v1, "AuthToken"
			 /* .line 12 */
			 (( e.f.c.s.t.h ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->a()Ljava/lang/String;
			 (( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
			 final String v1 = "RefreshToken"; // const-string v1, "RefreshToken"
			 /* .line 13 */
			 (( e.f.c.s.t.h ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->e()Ljava/lang/String;
			 (( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
			 final String v1 = "TokenCreationEpochInSecs"; // const-string v1, "TokenCreationEpochInSecs"
			 /* .line 14 */
			 (( e.f.c.s.t.h ) p1 ).g ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->g()J
			 /* move-result-wide v2 */
			 (( org.json.JSONObject ) v0 ).put ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
			 final String v1 = "ExpiresInSecs"; // const-string v1, "ExpiresInSecs"
			 /* .line 15 */
			 (( e.f.c.s.t.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->b()J
			 /* move-result-wide v2 */
			 (( org.json.JSONObject ) v0 ).put ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
			 final String v1 = "FisError"; // const-string v1, "FisError"
			 /* .line 16 */
			 (( e.f.c.s.t.h ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->d()Ljava/lang/String;
			 (( org.json.JSONObject ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
			 final String v1 = "PersistedInstallation"; // const-string v1, "PersistedInstallation"
			 final String v2 = "tmp"; // const-string v2, "tmp"
			 /* .line 17 */
			 v3 = this.b;
			 /* .line 18 */
			 (( e.f.c.h ) v3 ).b ( ); // invoke-virtual {v3}, Le/f/c/h;->b()Landroid/content/Context;
			 (( android.content.Context ) v3 ).getFilesDir ( ); // invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
			 /* .line 19 */
			 java.io.File .createTempFile ( v1,v2,v3 );
			 /* .line 20 */
			 /* new-instance v2, Ljava/io/FileOutputStream; */
			 /* invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
			 /* .line 21 */
			 (( org.json.JSONObject ) v0 ).toString ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
			 final String v3 = "UTF-8"; // const-string v3, "UTF-8"
			 (( java.lang.String ) v0 ).getBytes ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
			 (( java.io.FileOutputStream ) v2 ).write ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V
			 /* .line 22 */
			 (( java.io.FileOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
			 /* .line 23 */
			 v0 = this.a;
			 v0 = 			 (( java.io.File ) v1 ).renameTo ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 24 */
			 } // :cond_0
			 /* new-instance v0, Ljava/io/IOException; */
			 final String v1 = "unable to rename the tmpfile to PersistedInstallation"; // const-string v1, "unable to rename the tmpfile to PersistedInstallation"
			 /* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
			 /* throw v0 */
			 /* :try_end_0 */
			 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
		 } // :goto_0
	 } // .end method
	 public final org.json.JSONObject a ( ) {
		 /* .locals 6 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/io/ByteArrayOutputStream; */
		 /* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
		 /* const/16 v1, 0x4000 */
		 /* new-array v2, v1, [B */
		 /* .line 2 */
		 try { // :try_start_0
			 /* new-instance v3, Ljava/io/FileInputStream; */
			 v4 = this.a;
			 /* invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 3 */
		 try { // :try_start_1
			 v5 = 			 (( java.io.FileInputStream ) v3 ).read ( v2, v4, v1 ); // invoke-virtual {v3, v2, v4, v1}, Ljava/io/FileInputStream;->read([BII)I
			 /* if-gez v5, :cond_0 */
			 /* .line 4 */
			 /* new-instance v1, Lorg/json/JSONObject; */
			 (( java.io.ByteArrayOutputStream ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
			 /* invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* .line 5 */
			 try { // :try_start_2
				 (( java.io.FileInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
				 /* :try_end_2 */
				 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
				 /* .catch Lorg/json/JSONException; {:try_start_2 ..:try_end_2} :catch_0 */
				 /* .line 6 */
			 } // :cond_0
			 try { // :try_start_3
				 (( java.io.ByteArrayOutputStream ) v0 ).write ( v2, v4, v5 ); // invoke-virtual {v0, v2, v4, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V
				 /* :try_end_3 */
				 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* .line 7 */
				 try { // :try_start_4
					 (( java.io.FileInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
					 /* :try_end_4 */
					 /* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
					 /* :catchall_1 */
					 try { // :try_start_5
						 /* throw v0 */
						 /* :try_end_5 */
						 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_0 */
						 /* .catch Lorg/json/JSONException; {:try_start_5 ..:try_end_5} :catch_0 */
						 /* .line 8 */
						 /* :catch_0 */
						 /* new-instance v0, Lorg/json/JSONObject; */
						 /* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
					 } // .end method
					 public e.f.c.s.t.h b ( ) {
						 /* .locals 11 */
						 /* .line 1 */
						 (( e.f.c.s.t.f ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/s/t/f;->a()Lorg/json/JSONObject;
						 int v1 = 0; // const/4 v1, 0x0
						 final String v2 = "Fid"; // const-string v2, "Fid"
						 /* .line 2 */
						 (( org.json.JSONObject ) v0 ).optString ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
						 /* .line 3 */
						 v3 = e.f.c.s.t.e.b;
						 v3 = 						 (( java.lang.Enum ) v3 ).ordinal ( ); // invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I
						 final String v4 = "Status"; // const-string v4, "Status"
						 v3 = 						 (( org.json.JSONObject ) v0 ).optInt ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
						 final String v4 = "AuthToken"; // const-string v4, "AuthToken"
						 /* .line 4 */
						 (( org.json.JSONObject ) v0 ).optString ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
						 final String v5 = "RefreshToken"; // const-string v5, "RefreshToken"
						 /* .line 5 */
						 (( org.json.JSONObject ) v0 ).optString ( v5, v1 ); // invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
						 /* const-wide/16 v6, 0x0 */
						 final String v8 = "TokenCreationEpochInSecs"; // const-string v8, "TokenCreationEpochInSecs"
						 /* .line 6 */
						 (( org.json.JSONObject ) v0 ).optLong ( v8, v6, v7 ); // invoke-virtual {v0, v8, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J
						 /* move-result-wide v8 */
						 final String v10 = "ExpiresInSecs"; // const-string v10, "ExpiresInSecs"
						 /* .line 7 */
						 (( org.json.JSONObject ) v0 ).optLong ( v10, v6, v7 ); // invoke-virtual {v0, v10, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J
						 /* move-result-wide v6 */
						 final String v10 = "FisError"; // const-string v10, "FisError"
						 /* .line 8 */
						 (( org.json.JSONObject ) v0 ).optString ( v10, v1 ); // invoke-virtual {v0, v10, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
						 /* .line 9 */
						 e.f.c.s.t.h .p ( );
						 /* .line 10 */
						 (( e.f.c.s.t.g ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/s/t/g;->b(Ljava/lang/String;)Le/f/c/s/t/g;
						 /* .line 11 */
						 e.f.c.s.t.e .values ( );
						 /* aget-object v2, v2, v3 */
						 (( e.f.c.s.t.g ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/s/t/g;->a(Le/f/c/s/t/e;)Le/f/c/s/t/g;
						 /* .line 12 */
						 (( e.f.c.s.t.g ) v1 ).a ( v4 ); // invoke-virtual {v1, v4}, Le/f/c/s/t/g;->a(Ljava/lang/String;)Le/f/c/s/t/g;
						 /* .line 13 */
						 (( e.f.c.s.t.g ) v1 ).d ( v5 ); // invoke-virtual {v1, v5}, Le/f/c/s/t/g;->d(Ljava/lang/String;)Le/f/c/s/t/g;
						 /* .line 14 */
						 (( e.f.c.s.t.g ) v1 ).b ( v8, v9 ); // invoke-virtual {v1, v8, v9}, Le/f/c/s/t/g;->b(J)Le/f/c/s/t/g;
						 /* .line 15 */
						 (( e.f.c.s.t.g ) v1 ).a ( v6, v7 ); // invoke-virtual {v1, v6, v7}, Le/f/c/s/t/g;->a(J)Le/f/c/s/t/g;
						 /* .line 16 */
						 (( e.f.c.s.t.g ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/s/t/g;->c(Ljava/lang/String;)Le/f/c/s/t/g;
						 /* .line 17 */
						 (( e.f.c.s.t.g ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/t/g;->a()Le/f/c/s/t/h;
					 } // .end method
