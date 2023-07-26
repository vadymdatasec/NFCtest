public class e.h.d.a.a.w.j {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.content.Context a;
	 public java.io.File b;
	 /* # direct methods */
	 public e.h.d.a.a.w.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.File a ( android.content.Context p0 ) {
		 /* .locals 9 */
		 /* .line 3 */
		 (( e.h.d.a.a.w.j ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/w/j;->c(Landroid/content/Context;)Ljava/io/File;
		 /* .line 4 */
		 (( java.io.File ) p1 ).listFiles ( ); // invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 5 */
			 /* array-length v0, p1 */
			 /* if-lez v0, :cond_1 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 6 */
			 /* aget-object v1, p1, v0 */
			 (( java.io.File ) v1 ).lastModified ( ); // invoke-virtual {v1}, Ljava/io/File;->lastModified()J
			 /* move-result-wide v1 */
			 /* .line 7 */
			 /* aget-object v3, p1, v0 */
			 /* .line 8 */
			 /* array-length v4, p1 */
		 } // :goto_0
		 /* if-ge v0, v4, :cond_2 */
		 /* aget-object v5, p1, v0 */
		 /* .line 9 */
		 (( java.io.File ) v5 ).lastModified ( ); // invoke-virtual {v5}, Ljava/io/File;->lastModified()J
		 /* move-result-wide v6 */
		 /* cmp-long v8, v6, v1 */
		 /* if-ltz v8, :cond_0 */
		 /* .line 10 */
		 (( java.io.File ) v5 ).lastModified ( ); // invoke-virtual {v5}, Ljava/io/File;->lastModified()J
		 /* move-result-wide v1 */
		 /* move-object v3, v5 */
	 } // :cond_0
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // :cond_2
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( e.h.d.a.a.w.j ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/w/j;->c(Landroid/content/Context;)Ljava/io/File;
(( e.h.d.a.a.w.j ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/w/j;->a(Ljava/io/File;)V
/* .line 2 */
v0 = this.a;
(( e.h.d.a.a.w.j ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/w/j;->b(Landroid/content/Context;)V
return;
} // .end method
public final void a ( java.io.File p0 ) {
/* .locals 9 */
/* .line 11 */
(( java.io.File ) p1 ).listFiles ( ); // invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 12 */
/* array-length v0, p1 */
/* const/16 v1, 0xa */
/* if-lt v0, v1, :cond_2 */
/* .line 13 */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
int v2 = 0; // const/4 v2, 0x0
/* .line 14 */
/* array-length v3, p1 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v3, :cond_1 */
/* aget-object v5, p1, v4 */
/* .line 15 */
(( java.io.File ) v5 ).lastModified ( ); // invoke-virtual {v5}, Ljava/io/File;->lastModified()J
/* move-result-wide v6 */
/* cmp-long v8, v6, v0 */
/* if-gez v8, :cond_0 */
/* .line 16 */
(( java.io.File ) v5 ).lastModified ( ); // invoke-virtual {v5}, Ljava/io/File;->lastModified()J
/* move-result-wide v0 */
/* move-object v2, v5 */
} // :cond_0
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 17 */
p1 = (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = (( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 18 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " deleted"; // const-string v0, " deleted"
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "LogFilesManager"; // const-string v0, "LogFilesManager"
android.util.Log .d ( v0,p1 );
} // :cond_2
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 19 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 20 */
try { // :try_start_0
	 /* new-instance v0, Ljava/io/FileWriter; */
	 v1 = this.b;
	 int v2 = 1; // const/4 v2, 0x1
	 /* invoke-direct {v0, v1, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V */
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 21 */
	 try { // :try_start_1
		 /* new-instance v1, Ljava/io/BufferedWriter; */
		 /* invoke-direct {v1, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
		 /* .line 22 */
		 try { // :try_start_2
			 (( java.io.BufferedWriter ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
			 /* .line 23 */
			 (( java.io.BufferedWriter ) v1 ).newLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->newLine()V
			 /* .line 24 */
			 (( java.io.BufferedWriter ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 /* .line 25 */
			 try { // :try_start_3
				 (( java.io.BufferedWriter ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
				 /* :try_end_3 */
				 /* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
				 try { // :try_start_4
					 (( java.io.FileWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileWriter;->close()V
					 /* :try_end_4 */
					 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
					 /* :catchall_0 */
					 /* move-exception p1 */
					 /* .line 26 */
					 try { // :try_start_5
						 (( java.io.BufferedWriter ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
						 /* :try_end_5 */
						 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
						 /* :catchall_1 */
						 /* move-exception v1 */
						 try { // :try_start_6
							 (( java.lang.Throwable ) p1 ).addSuppressed ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
						 } // :goto_0
						 /* throw p1 */
						 /* :try_end_6 */
						 /* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
						 /* :catchall_2 */
						 /* move-exception p1 */
						 try { // :try_start_7
							 (( java.io.FileWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileWriter;->close()V
							 /* :try_end_7 */
							 /* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
							 /* :catchall_3 */
							 /* move-exception v0 */
							 try { // :try_start_8
								 (( java.lang.Throwable ) p1 ).addSuppressed ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
							 } // :goto_1
							 /* throw p1 */
							 /* :try_end_8 */
							 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_0 */
							 /* :catch_0 */
							 /* move-exception p1 */
							 /* .line 27 */
							 /* new-instance v0, Ljava/lang/StringBuilder; */
							 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
							 final String v1 = "Can\'t write to packid log file "; // const-string v1, "Can\'t write to packid log file "
							 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
							 v1 = this.b;
							 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
							 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
							 final String v1 = "LogFilesManager"; // const-string v1, "LogFilesManager"
							 android.util.Log .e ( v1,v0,p1 );
						 } // :cond_0
					 } // :goto_2
					 return;
				 } // .end method
				 public void a ( java.lang.String p0, android.content.Context p1, Boolean p2 ) {
					 /* .locals 3 */
					 /* .line 28 */
					 (( e.h.d.a.a.w.j ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/w/j;->a(Landroid/content/Context;)Ljava/io/File;
					 if ( p3 != null) { // if-eqz p3, :cond_0
						 /* .line 29 */
						 /* new-instance p3, Ljava/lang/StringBuilder; */
						 /* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
						 /* new-instance v0, Ljava/text/SimpleDateFormat; */
						 v1 = java.util.Locale.ENGLISH;
						 final String v2 = "HH:mm:ss.SSS"; // const-string v2, "HH:mm:ss.SSS"
						 /* invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
						 /* new-instance v1, Ljava/util/Date; */
						 /* invoke-direct {v1}, Ljava/util/Date;-><init>()V */
						 (( java.text.SimpleDateFormat ) v0 ).format ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
						 (( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 final String v0 = " [--] "; // const-string v0, " [--] "
						 (( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
						 /* .line 30 */
					 } // :cond_0
					 try { // :try_start_0
						 /* new-instance p3, Ljava/io/FileWriter; */
						 int v0 = 1; // const/4 v0, 0x1
						 /* invoke-direct {p3, p2, v0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;Z)V */
						 /* :try_end_0 */
						 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
						 /* .line 31 */
						 try { // :try_start_1
							 /* new-instance v0, Ljava/io/BufferedWriter; */
							 /* invoke-direct {v0, p3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V */
							 /* :try_end_1 */
							 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
							 /* .line 32 */
							 try { // :try_start_2
								 (( java.io.BufferedWriter ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
								 /* .line 33 */
								 (( java.io.BufferedWriter ) v0 ).newLine ( ); // invoke-virtual {v0}, Ljava/io/BufferedWriter;->newLine()V
								 /* .line 34 */
								 (( java.io.BufferedWriter ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V
								 /* :try_end_2 */
								 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
								 /* .line 35 */
								 try { // :try_start_3
									 (( java.io.BufferedWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
									 /* :try_end_3 */
									 /* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
									 try { // :try_start_4
										 (( java.io.FileWriter ) p3 ).close ( ); // invoke-virtual {p3}, Ljava/io/FileWriter;->close()V
										 /* :try_end_4 */
										 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
										 /* :catchall_0 */
										 /* move-exception p1 */
										 /* .line 36 */
										 try { // :try_start_5
											 (( java.io.BufferedWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
											 /* :try_end_5 */
											 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
											 /* :catchall_1 */
											 /* move-exception v0 */
											 try { // :try_start_6
												 (( java.lang.Throwable ) p1 ).addSuppressed ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
											 } // :goto_0
											 /* throw p1 */
											 /* :try_end_6 */
											 /* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
											 /* :catchall_2 */
											 /* move-exception p1 */
											 try { // :try_start_7
												 (( java.io.FileWriter ) p3 ).close ( ); // invoke-virtual {p3}, Ljava/io/FileWriter;->close()V
												 /* :try_end_7 */
												 /* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
												 /* :catchall_3 */
												 /* move-exception p3 */
												 try { // :try_start_8
													 (( java.lang.Throwable ) p1 ).addSuppressed ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
												 } // :goto_1
												 /* throw p1 */
												 /* :try_end_8 */
												 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_0 */
												 /* :catch_0 */
												 /* move-exception p1 */
												 /* .line 37 */
												 /* new-instance p3, Ljava/lang/StringBuilder; */
												 /* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
												 final String v0 = "Can\'t write to packid log file "; // const-string v0, "Can\'t write to packid log file "
												 (( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
												 (( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
												 (( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
												 final String p3 = "LogFilesManager"; // const-string p3, "LogFilesManager"
												 android.util.Log .e ( p3,p2,p1 );
											 } // :goto_2
											 return;
										 } // .end method
										 public final void b ( android.content.Context p0 ) {
											 /* .locals 8 */
											 final String v0 = "LogFilesManager"; // const-string v0, "LogFilesManager"
											 final String v1 = "Can\'t create packid log file "; // const-string v1, "Can\'t create packid log file "
											 /* .line 1 */
											 (( e.h.d.a.a.w.j ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/w/j;->c(Landroid/content/Context;)Ljava/io/File;
											 /* .line 2 */
											 /* new-instance v2, Ljava/util/Date; */
											 /* invoke-direct {v2}, Ljava/util/Date;-><init>()V */
											 /* .line 3 */
											 (( java.io.File ) p1 ).getAbsolutePath ( ); // invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
											 /* .line 4 */
											 /* new-instance v4, Ljava/lang/StringBuilder; */
											 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
											 final String v5 = "packid"; // const-string v5, "packid"
											 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
											 /* new-instance v5, Ljava/text/SimpleDateFormat; */
											 v6 = java.util.Locale.ENGLISH;
											 final String v7 = "yyyyMMdd-HHmmss"; // const-string v7, "yyyyMMdd-HHmmss"
											 /* invoke-direct {v5, v7, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
											 (( java.text.SimpleDateFormat ) v5 ).format ( v2 ); // invoke-virtual {v5, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
											 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
											 final String v5 = ".txt"; // const-string v5, ".txt"
											 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
											 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
											 /* .line 5 */
											 /* new-instance v5, Ljava/io/File; */
											 m.a.a.b.a .a ( v4 );
											 /* invoke-direct {v5, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
											 this.b = v5;
											 /* .line 6 */
											 v3 = 											 (( java.io.File ) v5 ).exists ( ); // invoke-virtual {v5}, Ljava/io/File;->exists()Z
											 /* if-nez v3, :cond_1 */
											 /* .line 7 */
											 try { // :try_start_0
												 v3 = this.b;
												 v3 = 												 (( java.io.File ) v3 ).createNewFile ( ); // invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
												 if ( v3 != null) { // if-eqz v3, :cond_0
													 /* .line 8 */
													 /* new-instance v3, Ljava/lang/StringBuilder; */
													 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
													 final String v4 = "=== New log session started on "; // const-string v4, "=== New log session started on "
													 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
													 /* new-instance v4, Ljava/text/SimpleDateFormat; */
													 /* :try_end_0 */
													 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
													 final String v5 = "HH:mm:ss yyyy/MM/dd"; // const-string v5, "HH:mm:ss yyyy/MM/dd"
													 try { // :try_start_1
														 v6 = java.util.Locale.ENGLISH;
														 /* invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
														 (( java.text.SimpleDateFormat ) v4 ).format ( v2 ); // invoke-virtual {v4, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
														 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
														 final String v2 = " ==="; // const-string v2, " ==="
														 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
														 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
														 (( e.h.d.a.a.w.j ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/w/j;->a(Ljava/lang/String;)V
														 /* .line 9 */
													 } // :cond_0
													 /* new-instance v2, Ljava/lang/StringBuilder; */
													 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
													 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
													 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
													 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
													 android.util.Log .w ( v0,v2 );
													 /* :try_end_1 */
													 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
													 /* :catch_0 */
													 /* move-exception v2 */
													 /* .line 10 */
													 /* new-instance v3, Ljava/lang/StringBuilder; */
													 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
													 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
													 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
													 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
													 android.util.Log .e ( v0,p1,v2 );
												 } // :cond_1
											 } // :goto_0
											 return;
										 } // .end method
										 public final java.io.File c ( android.content.Context p0 ) {
											 /* .locals 1 */
											 final String v0 = "logs"; // const-string v0, "logs"
											 /* .line 1 */
											 (( android.content.Context ) p1 ).getExternalFilesDir ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;
											 /* .line 2 */
											 v0 = 											 (( java.io.File ) p1 ).exists ( ); // invoke-virtual {p1}, Ljava/io/File;->exists()Z
											 /* if-nez v0, :cond_0 */
											 /* .line 3 */
											 (( java.io.File ) p1 ).mkdirs ( ); // invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z
										 } // :cond_0
									 } // .end method
