public class e.b.a.y.y.r implements e.b.a.y.y.p {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/y/p<", */
	 /* "Ljava/io/InputStream;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.b.a.y.y.r ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public java.io.InputStream a ( java.lang.String p0 ) {
	 /* .locals 4 */
	 final String v0 = "data:image"; // const-string v0, "data:image"
	 /* .line 3 */
	 v0 = 	 (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* const/16 v0, 0x2c */
		 /* .line 4 */
		 v0 = 		 (( java.lang.String ) p1 ).indexOf ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I
		 int v1 = -1; // const/4 v1, -0x1
		 /* if-eq v0, v1, :cond_1 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 5 */
		 (( java.lang.String ) p1 ).substring ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
		 final String v3 = ";base64"; // const-string v3, ";base64"
		 /* .line 6 */
		 v2 = 		 (( java.lang.String ) v2 ).endsWith ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* add-int/lit8 v0, v0, 0x1 */
			 /* .line 7 */
			 (( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
			 /* .line 8 */
			 android.util.Base64 .decode ( p1,v1 );
			 /* .line 9 */
			 /* new-instance v0, Ljava/io/ByteArrayInputStream; */
			 /* invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
			 /* .line 10 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "Not a base64 image data URL."; // const-string v0, "Not a base64 image data URL."
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
		 /* .line 11 */
	 } // :cond_1
	 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
	 final String v0 = "Missing comma in data URL."; // const-string v0, "Missing comma in data URL."
	 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
	 /* .line 12 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "Not a valid image data URL."; // const-string v0, "Not a valid image data URL."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public java.lang.Class a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "Ljava/io/InputStream;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 14 */
/* const-class v0, Ljava/io/InputStream; */
} // .end method
public java.lang.Object a ( java.lang.String p0 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.b.a.y.y.r ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/r;->a(Ljava/lang/String;)Ljava/io/InputStream;
} // .end method
public void a ( java.io.InputStream p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 13 */
(( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
return;
} // .end method
public void a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Ljava/io/InputStream; */
(( e.b.a.y.y.r ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/r;->a(Ljava/io/InputStream;)V
return;
} // .end method
