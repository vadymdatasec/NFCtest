public class inal implements javax.net.ssl.HostnameVerifier {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final k.e1.n.d a;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lk/e1/n/d; */
		 /* invoke-direct {v0}, Lk/e1/n/d;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.util.List a ( java.security.cert.X509Certificate p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/security/cert/X509Certificate;", */
		 /* ")", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/lang/String;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 int v0 = 7; // const/4 v0, 0x7
	 /* .line 4 */
	 k.e1.n.d .a ( p0,v0 );
	 int v1 = 2; // const/4 v1, 0x2
	 /* .line 5 */
	 k.e1.n.d .a ( p0,v1 );
	 /* .line 6 */
	 v3 = 	 v2 = 	 /* new-instance v1, Ljava/util/ArrayList; */
	 /* add-int/2addr v2, v3 */
	 /* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V */
	 /* .line 7 */
	 /* .line 8 */
} // .end method
public static java.util.List a ( java.security.cert.X509Certificate p0, Integer p1 ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/security/cert/X509Certificate;", */
	 /* "I)", */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .line 9 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 10 */
try { // :try_start_0
	 (( java.security.cert.X509Certificate ) p0 ).getSubjectAlternativeNames ( ); // invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;
	 /* if-nez p0, :cond_0 */
	 /* .line 11 */
	 java.util.Collections .emptyList ( );
	 /* .line 12 */
} // :cond_0
} // :cond_1
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 13 */
/* check-cast v1, Ljava/util/List; */
if ( v1 != null) { // if-eqz v1, :cond_1
v2 = /* .line 14 */
int v3 = 2; // const/4 v3, 0x2
/* if-ge v2, v3, :cond_2 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 15 */
/* check-cast v2, Ljava/lang/Integer; */
/* if-nez v2, :cond_3 */
/* .line 16 */
} // :cond_3
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* if-ne v2, p1, :cond_1 */
int v2 = 1; // const/4 v2, 0x1
/* .line 17 */
/* check-cast v1, Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 18 */
/* :try_end_0 */
/* .catch Ljava/security/cert/CertificateParsingException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_4
/* .line 19 */
/* :catch_0 */
java.util.Collections .emptyList ( );
} // .end method
/* # virtual methods */
public Boolean a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 7 */
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_a
/* .line 20 */
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_a
final String v1 = "."; // const-string v1, "."
v2 = (( java.lang.String ) p1 ).startsWith ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v2, :cond_a */
final String v2 = ".."; // const-string v2, ".."
/* .line 21 */
v3 = (( java.lang.String ) p1 ).endsWith ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* goto/16 :goto_0 */
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_a
	 /* .line 22 */
	 v3 = 	 (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
	 if ( v3 != null) { // if-eqz v3, :cond_a
		 v3 = 		 (( java.lang.String ) p2 ).startsWith ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 /* if-nez v3, :cond_a */
		 /* .line 23 */
		 v2 = 		 (( java.lang.String ) p2 ).endsWith ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* goto/16 :goto_0 */
			 /* .line 24 */
		 } // :cond_1
		 v2 = 		 (( java.lang.String ) p1 ).endsWith ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 /* const/16 v3, 0x2e */
		 /* if-nez v2, :cond_2 */
		 /* .line 25 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 26 */
	 } // :cond_2
	 v1 = 	 (( java.lang.String ) p2 ).endsWith ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
	 /* if-nez v1, :cond_3 */
	 /* .line 27 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 28 */
} // :cond_3
v1 = java.util.Locale.US;
(( java.lang.String ) p2 ).toLowerCase ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
final String v1 = "*"; // const-string v1, "*"
/* .line 29 */
v1 = (( java.lang.String ) p2 ).contains ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* if-nez v1, :cond_4 */
/* .line 30 */
p1 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // :cond_4
final String v1 = "*."; // const-string v1, "*."
/* .line 31 */
v2 = (( java.lang.String ) p2 ).startsWith ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_a
/* const/16 v2, 0x2a */
int v4 = 1; // const/4 v4, 0x1
v2 = (( java.lang.String ) p2 ).indexOf ( v2, v4 ); // invoke-virtual {p2, v2, v4}, Ljava/lang/String;->indexOf(II)I
int v5 = -1; // const/4 v5, -0x1
/* if-eq v2, v5, :cond_5 */
/* .line 32 */
} // :cond_5
v2 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
v6 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* if-ge v2, v6, :cond_6 */
/* .line 33 */
} // :cond_6
v1 = (( java.lang.String ) v1 ).equals ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 34 */
} // :cond_7
(( java.lang.String ) p2 ).substring ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 35 */
v1 = (( java.lang.String ) p1 ).endsWith ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v1, :cond_8 */
/* .line 36 */
} // :cond_8
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
p2 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* sub-int/2addr v1, p2 */
/* if-lez v1, :cond_9 */
/* sub-int/2addr v1, v4 */
/* .line 37 */
p1 = (( java.lang.String ) p1 ).lastIndexOf ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I
/* if-eq p1, v5, :cond_9 */
} // :cond_9
} // :cond_a
} // :goto_0
} // .end method
public Boolean a ( java.lang.String p0, java.security.cert.X509Certificate p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = k.e1.e .d ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = (( k.e1.n.d ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lk/e1/n/d;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
/* .line 3 */
} // :cond_0
p1 = (( k.e1.n.d ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lk/e1/n/d;->b(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
} // :goto_0
} // .end method
public final Boolean b ( java.lang.String p0, java.security.cert.X509Certificate p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = java.util.Locale.US;
(( java.lang.String ) p1 ).toLowerCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
int v0 = 2; // const/4 v0, 0x2
/* .line 2 */
k.e1.n.d .a ( p2,v0 );
/* .line 3 */
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Ljava/lang/String; */
/* .line 4 */
v0 = (( k.e1.n.d ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lk/e1/n/d;->a(Ljava/lang/String;Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean c ( java.lang.String p0, java.security.cert.X509Certificate p1 ) {
/* .locals 4 */
int v0 = 7; // const/4 v0, 0x7
/* .line 1 */
k.e1.n.d .a ( p2,v0 );
v0 = /* .line 2 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 3 */
/* check-cast v3, Ljava/lang/String; */
v3 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public Boolean verify ( java.lang.String p0, javax.net.ssl.SSLSession p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
try { // :try_start_0
/* .line 2 */
/* aget-object p2, p2, v0 */
/* check-cast p2, Ljava/security/cert/X509Certificate; */
p1 = (( k.e1.n.d ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lk/e1/n/d;->a(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
/* :try_end_0 */
/* .catch Ljavax/net/ssl/SSLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
