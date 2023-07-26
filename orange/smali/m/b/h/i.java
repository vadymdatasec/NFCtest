public abstract class m.b.h.i {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String a;
	 /* # direct methods */
	 public static m.b.h.i ( ) {
		 /* .locals 11 */
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = " "; // const-string v1, " "
		 final String v2 = " "; // const-string v2, " "
		 final String v3 = " "; // const-string v3, " "
		 final String v4 = " "; // const-string v4, " "
		 final String v5 = " "; // const-string v5, " "
		 final String v6 = " "; // const-string v6, " "
		 final String v7 = " "; // const-string v7, " "
		 final String v8 = " "; // const-string v8, " "
		 final String v9 = " "; // const-string v9, " "
		 final String v10 = " "; // const-string v10, " "
		 /* .line 1 */
		 /* filled-new-array/range {v0 ..v10}, [Ljava/lang/String; */
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 26 */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/net/URL; */
			 /* invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 27 */
			 try { // :try_start_1
				 m.b.h.i .a ( v0,p1 );
				 (( java.net.URL ) p0 ).toExternalForm ( ); // invoke-virtual {p0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;
				 /* .line 28 */
				 /* :catch_0 */
				 /* new-instance p0, Ljava/net/URL; */
				 /* invoke-direct {p0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
				 /* .line 29 */
				 (( java.net.URL ) p0 ).toExternalForm ( ); // invoke-virtual {p0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;
				 /* :try_end_1 */
				 /* .catch Ljava/net/MalformedURLException; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* :catch_1 */
				 final String p0 = ""; // const-string p0, ""
			 } // .end method
			 public static java.lang.String a ( java.util.Collection p0, java.lang.String p1 ) {
				 /* .locals 0 */
				 /* .line 1 */
				 m.b.h.i .a ( p0,p1 );
			 } // .end method
			 public static java.lang.String a ( java.util.Iterator p0, java.lang.String p1 ) {
				 /* .locals 3 */
				 v0 = 				 /* .line 2 */
				 /* if-nez v0, :cond_0 */
				 final String p0 = ""; // const-string p0, ""
				 /* .line 3 */
			 } // :cond_0
			 (( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
			 v1 = 			 /* .line 4 */
			 /* if-nez v1, :cond_1 */
			 /* .line 5 */
		 } // :cond_1
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* const/16 v2, 0x40 */
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 6 */
	 v0 = 	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 7 */
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 8 */
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 /* .line 9 */
	 } // :cond_2
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.net.URL a ( java.net.URL p0, java.lang.String p1 ) {
	 /* .locals 6 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/net/MalformedURLException; */
	 /* } */
} // .end annotation
final String v0 = "?"; // const-string v0, "?"
/* .line 21 */
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 22 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.net.URL ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljava/net/URL;->getPath()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
/* const/16 v0, 0x2e */
/* .line 23 */
v0 = (( java.lang.String ) p1 ).indexOf ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I
/* if-nez v0, :cond_1 */
(( java.net.URL ) p0 ).getFile ( ); // invoke-virtual {p0}, Ljava/net/URL;->getFile()Ljava/lang/String;
/* const/16 v1, 0x2f */
v0 = (( java.lang.String ) v0 ).indexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 24 */
	 /* new-instance v0, Ljava/net/URL; */
	 (( java.net.URL ) p0 ).getProtocol ( ); // invoke-virtual {p0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;
	 (( java.net.URL ) p0 ).getHost ( ); // invoke-virtual {p0}, Ljava/net/URL;->getHost()Ljava/lang/String;
	 v3 = 	 (( java.net.URL ) p0 ).getPort ( ); // invoke-virtual {p0}, Ljava/net/URL;->getPort()I
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v5 = "/"; // const-string v5, "/"
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.net.URL ) p0 ).getFile ( ); // invoke-virtual {p0}, Ljava/net/URL;->getFile()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v4 ).append ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1, v2, v3, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V */
	 /* move-object p0, v0 */
	 /* .line 25 */
} // :cond_1
/* new-instance v0, Ljava/net/URL; */
/* invoke-direct {v0, p0, p1}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V */
} // .end method
public static void a ( java.lang.StringBuilder p0, java.lang.String p1, Boolean p2 ) {
/* .locals 8 */
/* .line 13 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_4 */
/* .line 14 */
v5 = (( java.lang.String ) p1 ).codePointAt ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->codePointAt(I)I
/* .line 15 */
v6 = m.b.h.i .a ( v5 );
int v7 = 1; // const/4 v7, 0x1
if ( v6 != null) { // if-eqz v6, :cond_2
if ( p2 != null) { // if-eqz p2, :cond_0
	 if ( v3 != null) { // if-eqz v3, :cond_3
	 } // :cond_0
	 if ( v4 != null) { // if-eqz v4, :cond_1
	 } // :cond_1
	 /* const/16 v4, 0x20 */
	 /* .line 16 */
	 (( java.lang.StringBuilder ) p0 ).append ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
	 int v4 = 1; // const/4 v4, 0x1
	 /* .line 17 */
} // :cond_2
(( java.lang.StringBuilder ) p0 ).appendCodePoint ( v5 ); // invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 18 */
} // :cond_3
} // :goto_1
v5 = java.lang.Character .charCount ( v5 );
/* add-int/2addr v2, v5 */
} // :cond_4
return;
} // .end method
public static Boolean a ( Integer p0 ) {
/* .locals 1 */
/* const/16 v0, 0x20 */
/* if-eq p0, v0, :cond_1 */
/* const/16 v0, 0x9 */
/* if-eq p0, v0, :cond_1 */
/* const/16 v0, 0xa */
/* if-eq p0, v0, :cond_1 */
/* const/16 v0, 0xc */
/* if-eq p0, v0, :cond_1 */
/* const/16 v0, 0xd */
/* if-ne p0, v0, :cond_0 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
public static Boolean a ( java.lang.String p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 10 */
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-nez v1, :cond_0 */
/* .line 11 */
} // :cond_0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_2 */
/* .line 12 */
v4 = (( java.lang.String ) p0 ).codePointAt ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->codePointAt(I)I
v4 = m.b.h.i .a ( v4 );
/* if-nez v4, :cond_1 */
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
} // :goto_1
} // .end method
public static Boolean a ( java.lang.String p0, java.lang.String...p1 ) {
/* .locals 4 */
/* .line 19 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* aget-object v3, p1, v2 */
/* .line 20 */
v3 = (( java.lang.String ) v3 ).equals ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public static java.lang.String b ( Integer p0 ) {
/* .locals 3 */
/* if-ltz p0, :cond_2 */
/* .line 1 */
v0 = m.b.h.i.a;
/* array-length v1, v0 */
/* if-ge p0, v1, :cond_0 */
/* .line 2 */
/* aget-object p0, v0, p0 */
/* .line 3 */
} // :cond_0
/* new-array v0, p0, [C */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p0, :cond_1 */
/* const/16 v2, 0x20 */
/* .line 4 */
/* aput-char v2, v0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 5 */
} // :cond_1
java.lang.String .valueOf ( v0 );
/* .line 6 */
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "width must be > 0"; // const-string v0, "width must be > 0"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Boolean b ( java.lang.String p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
if ( p0 != null) { // if-eqz p0, :cond_3
/* .line 7 */
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-nez v1, :cond_0 */
/* .line 8 */
} // :cond_0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_2 */
/* .line 9 */
v3 = (( java.lang.String ) p0 ).codePointAt ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->codePointAt(I)I
v3 = java.lang.Character .isDigit ( v3 );
/* if-nez v3, :cond_1 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
int p0 = 1; // const/4 p0, 0x1
} // :cond_3
} // :goto_1
} // .end method
public static Boolean b ( java.lang.String p0, java.lang.String[] p1 ) {
/* .locals 0 */
/* .line 10 */
p0 = java.util.Arrays .binarySearch ( p1,p0 );
/* if-ltz p0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
