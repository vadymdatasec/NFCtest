public class m.b.h.h implements m.b.f {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public m.b.d a;
	 public m.b.e b;
	 /* # direct methods */
	 public m.b.h.h ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lm/b/h/d; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Lm/b/h/d;-><init>(Lm/b/h/b;)V */
		 this.a = v0;
		 /* .line 3 */
		 /* new-instance v0, Lm/b/h/g; */
		 /* invoke-direct {v0}, Lm/b/h/g;-><init>()V */
		 this.b = v0;
		 return;
	 } // .end method
	 public static java.net.URL a ( java.net.URL p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 m.b.h.h .b ( p0 );
	 } // .end method
	 public static Boolean a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 p0 = 		 m.b.h.h .b ( p0 );
	 } // .end method
	 public static java.net.URL b ( java.net.URL p0 ) {
		 /* .locals 9 */
		 /* .line 1 */
		 try { // :try_start_0
			 /* new-instance v8, Ljava/net/URI; */
			 (( java.net.URL ) p0 ).getProtocol ( ); // invoke-virtual {p0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;
			 (( java.net.URL ) p0 ).getUserInfo ( ); // invoke-virtual {p0}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;
			 (( java.net.URL ) p0 ).getHost ( ); // invoke-virtual {p0}, Ljava/net/URL;->getHost()Ljava/lang/String;
			 v4 = 			 (( java.net.URL ) p0 ).getPort ( ); // invoke-virtual {p0}, Ljava/net/URL;->getPort()I
			 (( java.net.URL ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljava/net/URL;->getPath()Ljava/lang/String;
			 (( java.net.URL ) p0 ).getQuery ( ); // invoke-virtual {p0}, Ljava/net/URL;->getQuery()Ljava/lang/String;
			 (( java.net.URL ) p0 ).getRef ( ); // invoke-virtual {p0}, Ljava/net/URL;->getRef()Ljava/lang/String;
			 /* move-object v0, v8 */
			 /* invoke-direct/range {v0 ..v7}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
			 /* .line 2 */
			 /* new-instance v0, Ljava/net/URL; */
			 (( java.net.URI ) v8 ).toASCIIString ( ); // invoke-virtual {v8}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;
			 /* invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
		 } // .end method
		 public static Boolean b ( Object p0 ) {
			 /* .locals 1 */
			 /* .line 5 */
		 v0 = 		 } // :cond_0
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* check-cast v0, Lm/b/b; */
			 v0 = 			 /* .line 6 */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 int p0 = 1; // const/4 p0, 0x1
			 } // :cond_1
			 int p0 = 0; // const/4 p0, 0x0
		 } // :goto_0
	 } // .end method
	 public static java.lang.String d ( java.lang.String p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 m.b.h.h .f ( p0 );
	 } // .end method
	 public static m.b.f e ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lm/b/h/h; */
		 /* invoke-direct {v0}, Lm/b/h/h;-><init>()V */
		 /* .line 2 */
	 } // .end method
	 public static java.lang.String f ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* if-nez p0, :cond_0 */
		 int p0 = 0; // const/4 p0, 0x0
	 } // :cond_0
	 final String v0 = "\""; // const-string v0, "\""
	 final String v1 = "%22"; // const-string v1, "%22"
	 /* .line 1 */
	 (( java.lang.String ) p0 ).replaceAll ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public static java.lang.String g ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 try { // :try_start_0
		 /* new-instance v0, Ljava/net/URL; */
		 /* invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 m.b.h.h .b ( v0 );
		 (( java.net.URL ) v0 ).toExternalForm ( ); // invoke-virtual {v0}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
	 } // .end method
	 /* # virtual methods */
	 public m.b.e a ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 6 */
	 v0 = this.a;
	 m.b.h.g .b ( v0 );
	 this.b = v0;
} // .end method
public m.b.f a ( Integer p0 ) {
	 /* .locals 1 */
	 /* .line 3 */
	 v0 = this.a;
} // .end method
public m.b.f a ( java.lang.String p0 ) {
	 /* .locals 2 */
	 final String v0 = "Referrer must not be null"; // const-string v0, "Referrer must not be null"
	 /* .line 4 */
	 m.b.h.j .a ( p1,v0 );
	 /* .line 5 */
	 v0 = this.a;
	 final String v1 = "Referer"; // const-string v1, "Referer"
} // .end method
public m.b.f b ( java.lang.String p0 ) {
	 /* .locals 2 */
	 final String v0 = "User agent must not be null"; // const-string v0, "User agent must not be null"
	 /* .line 3 */
	 m.b.h.j .a ( p1,v0 );
	 /* .line 4 */
	 v0 = this.a;
	 final String v1 = "User-Agent"; // const-string v1, "User-Agent"
} // .end method
public m.b.f c ( java.lang.String p0 ) {
	 /* .locals 4 */
	 final String v0 = "Must supply a valid URL"; // const-string v0, "Must supply a valid URL"
	 /* .line 1 */
	 m.b.h.j .a ( p1,v0 );
	 /* .line 2 */
	 try { // :try_start_0
		 v0 = this.a;
		 /* new-instance v1, Ljava/net/URL; */
		 m.b.h.h .g ( p1 );
		 /* invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
		 /* :try_end_0 */
		 /* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 3 */
		 /* new-instance v1, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "Malformed URL: "; // const-string v3, "Malformed URL: "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 public m.b.i.i get ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.a;
	 v1 = m.b.c.c;
	 /* .line 2 */
	 (( m.b.h.h ) p0 ).a ( ); // invoke-virtual {p0}, Lm/b/h/h;->a()Lm/b/e;
	 /* .line 3 */
	 v0 = this.b;
} // .end method
