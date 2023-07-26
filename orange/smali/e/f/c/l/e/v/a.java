public class e.f.c.l.e.v.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 /* # direct methods */
	 public e.f.c.l.e.v.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.io.File a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/io/File; */
		 /* new-instance v1, Le/f/c/l/e/r/i; */
		 v2 = this.a;
		 /* invoke-direct {v1, v2}, Le/f/c/l/e/r/i;-><init>(Landroid/content/Context;)V */
		 (( e.f.c.l.e.r.i ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/r/i;->a()Ljava/io/File;
		 final String v2 = "com.crashlytics.settings.json"; // const-string v2, "com.crashlytics.settings.json"
		 /* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 } // .end method
	 public void a ( Long p0, org.json.JSONObject p1 ) {
		 /* .locals 3 */
		 final String v0 = "Failed to close settings writer."; // const-string v0, "Failed to close settings writer."
		 /* .line 2 */
		 e.f.c.l.e.b .a ( );
		 final String v2 = "Writing settings to cache file..."; // const-string v2, "Writing settings to cache file..."
		 (( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 int v1 = 0; // const/4 v1, 0x0
			 try { // :try_start_0
				 final String v2 = "expires_at"; // const-string v2, "expires_at"
				 /* .line 3 */
				 (( org.json.JSONObject ) p3 ).put ( v2, p1, p2 ); // invoke-virtual {p3, v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
				 /* .line 4 */
				 /* new-instance p1, Ljava/io/FileWriter; */
				 (( e.f.c.l.e.v.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/v/a;->a()Ljava/io/File;
				 /* invoke-direct {p1, p2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V */
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
				 /* .line 5 */
				 try { // :try_start_1
					 (( org.json.JSONObject ) p3 ).toString ( ); // invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
					 (( java.io.FileWriter ) p1 ).write ( p2 ); // invoke-virtual {p1, p2}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V
					 /* .line 6 */
					 (( java.io.FileWriter ) p1 ).flush ( ); // invoke-virtual {p1}, Ljava/io/FileWriter;->flush()V
					 /* :try_end_1 */
					 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
					 /* .line 7 */
					 e.f.c.l.e.m.j .a ( p1,v0 );
					 /* :catchall_0 */
					 /* move-exception p2 */
					 /* move-object v1, p1 */
					 /* :catch_0 */
					 /* move-exception p2 */
					 /* move-object v1, p1 */
					 /* :catchall_1 */
					 /* move-exception p2 */
					 /* :catch_1 */
					 /* move-exception p2 */
					 /* .line 8 */
				 } // :goto_0
				 try { // :try_start_2
					 e.f.c.l.e.b .a ( );
					 final String p3 = "Failed to cache settings"; // const-string p3, "Failed to cache settings"
					 (( e.f.c.l.e.b ) p1 ).b ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
					 /* :try_end_2 */
					 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
					 /* .line 9 */
					 e.f.c.l.e.m.j .a ( v1,v0 );
				 } // :goto_1
				 e.f.c.l.e.m.j .a ( v1,v0 );
				 /* .line 10 */
				 /* throw p2 */
			 } // :cond_0
		 } // :goto_2
		 return;
	 } // .end method
	 public org.json.JSONObject b ( ) {
		 /* .locals 6 */
		 final String v0 = "Error while closing settings cache file."; // const-string v0, "Error while closing settings cache file."
		 /* .line 1 */
		 e.f.c.l.e.b .a ( );
		 final String v2 = "Reading cached settings..."; // const-string v2, "Reading cached settings..."
		 (( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 2 */
		 try { // :try_start_0
			 (( e.f.c.l.e.v.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/v/a;->a()Ljava/io/File;
			 /* .line 3 */
			 v3 = 			 (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
			 if ( v3 != null) { // if-eqz v3, :cond_0
				 /* .line 4 */
				 /* new-instance v3, Ljava/io/FileInputStream; */
				 /* invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 5 */
				 try { // :try_start_1
					 e.f.c.l.e.m.j .b ( v3 );
					 /* .line 6 */
					 /* new-instance v4, Lorg/json/JSONObject; */
					 /* invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
					 /* :try_end_1 */
					 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
					 /* move-object v1, v3 */
					 /* :catch_0 */
					 /* move-exception v2 */
					 /* .line 7 */
				 } // :cond_0
				 try { // :try_start_2
					 e.f.c.l.e.b .a ( );
					 final String v3 = "No cached settings found."; // const-string v3, "No cached settings found."
					 (( e.f.c.l.e.b ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
					 /* :try_end_2 */
					 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
					 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
					 /* move-object v4, v1 */
					 /* .line 8 */
				 } // :goto_0
				 e.f.c.l.e.m.j .a ( v1,v0 );
				 /* move-object v1, v4 */
				 /* :catchall_0 */
				 /* move-exception v2 */
				 /* move-object v3, v1 */
				 /* move-object v1, v2 */
				 /* :catch_1 */
				 /* move-exception v2 */
				 /* move-object v3, v1 */
				 /* .line 9 */
			 } // :goto_1
			 try { // :try_start_3
				 e.f.c.l.e.b .a ( );
				 final String v5 = "Failed to fetch cached settings"; // const-string v5, "Failed to fetch cached settings"
				 (( e.f.c.l.e.b ) v4 ).b ( v5, v2 ); // invoke-virtual {v4, v5, v2}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
				 /* :try_end_3 */
				 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
				 /* .line 10 */
				 e.f.c.l.e.m.j .a ( v3,v0 );
			 } // :goto_2
			 /* :catchall_1 */
			 /* move-exception v1 */
		 } // :goto_3
		 e.f.c.l.e.m.j .a ( v3,v0 );
		 /* .line 11 */
		 /* throw v1 */
	 } // .end method
