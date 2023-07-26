public class e.b.a.y.w.w.g {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.b.a.y.w.w.a f;
	 /* # instance fields */
	 public final e.b.a.y.w.w.a a;
	 public final e.b.a.y.w.w.f b;
	 public final e.b.a.y.x.f1.b c;
	 public final android.content.ContentResolver d;
	 public final java.util.List e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.y.w.w.g ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/b/a/y/w/w/a; */
/* invoke-direct {v0}, Le/b/a/y/w/w/a;-><init>()V */
return;
} // .end method
public e.b.a.y.w.w.g ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Le/b/a/y/w/w/a;", */
/* "Le/b/a/y/w/w/f;", */
/* "Le/b/a/y/x/f1/b;", */
/* "Landroid/content/ContentResolver;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
this.a = p2;
/* .line 4 */
this.b = p3;
/* .line 5 */
this.c = p4;
/* .line 6 */
this.d = p5;
/* .line 7 */
this.e = p1;
return;
} // .end method
public e.b.a.y.w.w.g ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Le/b/a/y/w/w/f;", */
/* "Le/b/a/y/x/f1/b;", */
/* "Landroid/content/ContentResolver;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
v2 = e.b.a.y.w.w.g.f;
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Le/b/a/y/w/w/g;-><init>(Ljava/util/List;Le/b/a/y/w/w/a;Le/b/a/y/w/w/f;Le/b/a/y/x/f1/b;Landroid/content/ContentResolver;)V */
return;
} // .end method
/* # virtual methods */
public Integer a ( android.net.Uri p0 ) {
/* .locals 5 */
final String v0 = "ThumbStreamOpener"; // const-string v0, "ThumbStreamOpener"
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
try { // :try_start_0
v2 = this.d;
(( android.content.ContentResolver ) v2 ).openInputStream ( p1 ); // invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
/* .line 2 */
v2 = this.e;
v3 = this.c;
p1 = e.b.a.y.m .a ( v2,v1,v3 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
try { // :try_start_1
	 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
	 /* :try_end_1 */
	 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* :catch_0 */
} // :cond_0
/* :catchall_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception v2 */
/* :catch_2 */
/* move-exception v2 */
} // :goto_0
int v3 = 3; // const/4 v3, 0x3
/* .line 4 */
try { // :try_start_2
v3 = android.util.Log .isLoggable ( v0,v3 );
if ( v3 != null) { // if-eqz v3, :cond_1
	 /* .line 5 */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "Failed to open uri: "; // const-string v4, "Failed to open uri: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,p1,v2 );
	 /* :try_end_2 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 6 */
	 try { // :try_start_3
		 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
		 /* :try_end_3 */
		 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_3 */
		 /* :catch_3 */
	 } // :cond_2
	 int p1 = -1; // const/4 p1, -0x1
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_3
	 try { // :try_start_4
		 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
		 /* :try_end_4 */
		 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_4 */
		 /* .line 7 */
		 /* :catch_4 */
	 } // :cond_3
	 /* throw p1 */
} // .end method
public final Boolean a ( java.io.File p0 ) {
	 /* .locals 4 */
	 /* .line 8 */
	 v0 = this.a;
	 v0 = 	 (( e.b.a.y.w.w.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/w/w/a;->a(Ljava/io/File;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* const-wide/16 v0, 0x0 */
		 v2 = this.a;
		 (( e.b.a.y.w.w.a ) v2 ).b ( p1 ); // invoke-virtual {v2, p1}, Le/b/a/y/w/w/a;->b(Ljava/io/File;)J
		 /* move-result-wide v2 */
		 /* cmp-long p1, v0, v2 */
		 /* if-gez p1, :cond_0 */
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final java.lang.String b ( android.net.Uri p0 ) {
/* .locals 6 */
final String v0 = "ThumbStreamOpener"; // const-string v0, "ThumbStreamOpener"
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
try { // :try_start_0
	 v2 = this.b;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 2 */
			 v3 = 		 try { // :try_start_1
			 if ( v3 != null) { // if-eqz v3, :cond_1
				 int v3 = 0; // const/4 v3, 0x0
				 /* .line 3 */
				 /* :try_end_1 */
				 /* .catch Ljava/lang/SecurityException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
				 if ( v2 != null) { // if-eqz v2, :cond_0
					 /* .line 4 */
				 } // :cond_0
				 /* :catch_0 */
				 /* move-exception v3 */
			 } // :cond_1
			 if ( v2 != null) { // if-eqz v2, :cond_2
			 } // :cond_2
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* :catch_1 */
			 /* move-exception v3 */
			 /* move-object v2, v1 */
		 } // :goto_0
		 int v4 = 3; // const/4 v4, 0x3
		 /* .line 5 */
		 try { // :try_start_2
			 v4 = 			 android.util.Log .isLoggable ( v0,v4 );
			 if ( v4 != null) { // if-eqz v4, :cond_3
				 /* .line 6 */
				 /* new-instance v4, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v5 = "Failed to query for thumbnail for Uri: "; // const-string v5, "Failed to query for thumbnail for Uri: "
				 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 android.util.Log .d ( v0,p1,v3 );
				 /* :try_end_2 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
			 } // :cond_3
			 if ( v2 != null) { // if-eqz v2, :cond_4
				 /* .line 7 */
			 } // :cond_4
			 /* :catchall_1 */
			 /* move-exception p1 */
			 /* move-object v1, v2 */
		 } // :goto_1
		 if ( v1 != null) { // if-eqz v1, :cond_5
			 /* .line 8 */
		 } // :cond_5
		 /* throw p1 */
	 } // .end method
	 public java.io.InputStream c ( android.net.Uri p0 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/FileNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( e.b.a.y.w.w.g ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/w/w/g;->b(Landroid/net/Uri;)Ljava/lang/String;
	 /* .line 2 */
	 v1 = 	 android.text.TextUtils .isEmpty ( v0 );
	 int v2 = 0; // const/4 v2, 0x0
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 3 */
	 } // :cond_0
	 v1 = this.a;
	 (( e.b.a.y.w.w.a ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/b/a/y/w/w/a;->a(Ljava/lang/String;)Ljava/io/File;
	 /* .line 4 */
	 v1 = 	 (( e.b.a.y.w.w.g ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/y/w/w/g;->a(Ljava/io/File;)Z
	 /* if-nez v1, :cond_1 */
	 /* .line 5 */
} // :cond_1
android.net.Uri .fromFile ( v0 );
/* .line 6 */
try { // :try_start_0
	 v1 = this.d;
	 (( android.content.ContentResolver ) v1 ).openInputStream ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .line 7 */
	 /* new-instance v2, Ljava/io/FileNotFoundException; */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "NPE opening uri: "; // const-string v4, "NPE opening uri: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 final String p1 = " -> "; // const-string p1, " -> "
	 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
	 /* .line 8 */
	 (( java.io.FileNotFoundException ) v2 ).initCause ( v1 ); // invoke-virtual {v2, v1}, Ljava/io/FileNotFoundException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
	 /* check-cast p1, Ljava/io/FileNotFoundException; */
	 /* throw p1 */
} // .end method
