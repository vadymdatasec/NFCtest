public abstract class l.r {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.logging.Logger a;
	 /* # direct methods */
	 public static l.r ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* const-class v0, Ll/r; */
		 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 java.util.logging.Logger .getLogger ( v0 );
		 return;
	 } // .end method
	 public static l.g a ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* new-instance v0, Ll/s; */
		 /* invoke-direct {v0, p0}, Ll/s;-><init>(Ll/x;)V */
	 } // .end method
	 public static l.h a ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ll/t; */
		 /* invoke-direct {v0, p0}, Ll/t;-><init>(Ll/y;)V */
	 } // .end method
	 public static l.x a ( java.io.OutputStream p0, l.a0 p1 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 /* .line 3 */
				 /* new-instance v0, Ll/o; */
				 /* invoke-direct {v0, p1, p0}, Ll/o;-><init>(Ll/a0;Ljava/io/OutputStream;)V */
				 /* .line 4 */
			 } // :cond_0
			 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
			 final String p1 = "timeout == null"; // const-string p1, "timeout == null"
			 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
			 /* throw p0 */
			 /* .line 5 */
		 } // :cond_1
		 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
		 final String p1 = "out == null"; // const-string p1, "out == null"
		 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 public static l.x a ( java.net.Socket p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 if ( p0 != null) { // if-eqz p0, :cond_1
		 /* .line 6 */
		 (( java.net.Socket ) p0 ).getOutputStream ( ); // invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 7 */
			 l.r .c ( p0 );
			 /* .line 8 */
			 (( java.net.Socket ) p0 ).getOutputStream ( ); // invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
			 l.r .a ( p0,v0 );
			 /* .line 9 */
			 (( l.d ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Ll/d;->a(Ll/x;)Ll/x;
			 /* .line 10 */
		 } // :cond_0
		 /* new-instance p0, Ljava/io/IOException; */
		 final String v0 = "socket\'s output stream == null"; // const-string v0, "socket\'s output stream == null"
		 /* invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
		 /* .line 11 */
	 } // :cond_1
	 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
	 final String v0 = "socket == null"; // const-string v0, "socket == null"
	 /* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
} // .end method
public static l.y a ( java.io.File p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/FileNotFoundException; */
	 /* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* .line 16 */
	 /* new-instance v0, Ljava/io/FileInputStream; */
	 /* invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
	 l.r .a ( v0 );
	 /* .line 17 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "file == null"; // const-string v0, "file == null"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static l.y a ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .line 12 */
/* new-instance v0, Ll/a0; */
/* invoke-direct {v0}, Ll/a0;-><init>()V */
l.r .a ( p0,v0 );
} // .end method
public static l.y a ( java.io.InputStream p0, l.a0 p1 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_1
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 13 */
		 /* new-instance v0, Ll/p; */
		 /* invoke-direct {v0, p1, p0}, Ll/p;-><init>(Ll/a0;Ljava/io/InputStream;)V */
		 /* .line 14 */
	 } // :cond_0
	 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
	 final String p1 = "timeout == null"; // const-string p1, "timeout == null"
	 /* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
	 /* .line 15 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "in == null"; // const-string p1, "in == null"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Boolean a ( java.lang.AssertionError p0 ) {
/* .locals 1 */
/* .line 18 */
(( java.lang.AssertionError ) p0 ).getCause ( ); // invoke-virtual {p0}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( java.lang.AssertionError ) p0 ).getMessage ( ); // invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 19 */
		 (( java.lang.AssertionError ) p0 ).getMessage ( ); // invoke-virtual {p0}, Ljava/lang/AssertionError;->getMessage()Ljava/lang/String;
		 final String v0 = "getsockname failed"; // const-string v0, "getsockname failed"
		 p0 = 		 (( java.lang.String ) p0 ).contains ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 int p0 = 1; // const/4 p0, 0x1
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // :goto_0
} // .end method
public static l.y b ( java.net.Socket p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_1
	 /* .line 1 */
	 (( java.net.Socket ) p0 ).getInputStream ( ); // invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 l.r .c ( p0 );
		 /* .line 3 */
		 (( java.net.Socket ) p0 ).getInputStream ( ); // invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;
		 l.r .a ( p0,v0 );
		 /* .line 4 */
		 (( l.d ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Ll/d;->a(Ll/y;)Ll/y;
		 /* .line 5 */
	 } // :cond_0
	 /* new-instance p0, Ljava/io/IOException; */
	 final String v0 = "socket\'s input stream == null"; // const-string v0, "socket\'s input stream == null"
	 /* invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
	 /* .line 6 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String v0 = "socket == null"; // const-string v0, "socket == null"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static l.d c ( java.net.Socket p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ll/q; */
/* invoke-direct {v0, p0}, Ll/q;-><init>(Ljava/net/Socket;)V */
} // .end method
