public abstract class e.d.a.a.c.m {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.d.a.a.c.g a ( android.content.Context p0, org.xmlpull.v1.XmlPullParser p1 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/xmlpull/v1/XmlPullParserException;, */
		 /* Ljava/io/IOException;, */
		 /* Ljava/security/cert/CertificateException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 v1 = 	 /* .line 2 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* move-object v3, v2 */
} // :goto_0
int v4 = 1; // const/4 v4, 0x1
/* if-eq v1, v4, :cond_2 */
int v4 = 2; // const/4 v4, 0x2
/* if-ne v1, v4, :cond_1 */
/* .line 3 */
final String v4 = "domain-config"; // const-string v4, "domain-config"
v1 = (( java.lang.String ) v4 ).equals ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 4 */
	 e.d.a.a.c.m .a ( p1,v2 );
	 /* .line 5 */
} // :cond_0
final String v4 = "debug-overrides"; // const-string v4, "debug-overrides"
v1 = (( java.lang.String ) v4 ).equals ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 6 */
	 e.d.a.a.c.m .b ( p0,p1 );
	 /* .line 7 */
} // :cond_1
v1 = } // :goto_1
/* .line 8 */
} // :cond_2
/* new-instance p0, Ljava/util/HashSet; */
/* invoke-direct {p0}, Ljava/util/HashSet;-><init>()V */
/* .line 9 */
} // :cond_3
v0 = } // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_4
/* check-cast v0, Le/d/a/a/c/a; */
/* .line 10 */
(( e.d.a.a.c.a ) v0 ).a ( ); // invoke-virtual {v0}, Le/d/a/a/c/a;->a()Le/d/a/a/c/b;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 11 */
(( java.util.HashSet ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
} // :cond_4
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 12 */
/* new-instance p1, Le/d/a/a/c/g; */
/* iget-boolean v0, v3, Le/d/a/a/c/i;->a:Z */
v1 = this.b;
/* invoke-direct {p1, p0, v0, v1}, Le/d/a/a/c/g;-><init>(Ljava/util/Set;ZLjava/util/Set;)V */
/* .line 13 */
} // :cond_5
/* new-instance p1, Le/d/a/a/c/g; */
/* invoke-direct {p1, p0}, Le/d/a/a/c/g;-><init>(Ljava/util/Set;)V */
} // :goto_3
} // .end method
public static e.d.a.a.c.j a ( org.xmlpull.v1.XmlPullParser p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/xmlpull/v1/XmlPullParserException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
int v1 = 2; // const/4 v1, 0x2
final String v2 = "domain"; // const-string v2, "domain"
/* .line 37 */
/* .line 38 */
/* new-instance v1, Le/d/a/a/c/j; */
/* invoke-direct {v1, v0}, Le/d/a/a/c/j;-><init>(Le/d/a/a/c/h;)V */
final String v2 = "includeSubdomains"; // const-string v2, "includeSubdomains"
/* .line 39 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 40 */
v0 = java.lang.Boolean .parseBoolean ( v0 );
java.lang.Boolean .valueOf ( v0 );
this.a = v0;
/* .line 41 */
} // :cond_0
this.b = p0;
} // .end method
public static java.lang.String a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 4 */
final String v0 = ""; // const-string v0, ""
final String v1 = "@"; // const-string v1, "@"
/* .line 42 */
(( java.lang.String ) p1 ).replace ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
v2 = android.text.TextUtils .isDigitsOnly ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 43 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 44 */
(( java.lang.String ) p1 ).replace ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
p1 = java.lang.Integer .parseInt ( p1 );
(( android.content.res.Resources ) v3 ).getResourceName ( p1 ); // invoke-virtual {v3, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 45 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = ":"; // const-string p0, ":"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.String ) p1 ).replace ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
} // .end method
public static java.util.List a ( org.xmlpull.v1.XmlPullParser p0, Object p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lorg/xmlpull/v1/XmlPullParser;", */
/* "Le/d/a/a/c/a;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/d/a/a/c/a;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 2; // const/4 v0, 0x2
final String v1 = "domain-config"; // const-string v1, "domain-config"
int v2 = 0; // const/4 v2, 0x0
/* .line 14 */
/* .line 15 */
/* new-instance v2, Le/d/a/a/c/a; */
/* invoke-direct {v2}, Le/d/a/a/c/a;-><init>()V */
/* .line 16 */
(( e.d.a.a.c.a ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/d/a/a/c/a;->a(Le/d/a/a/c/a;)Le/d/a/a/c/a;
/* .line 17 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
/* .line 18 */
v3 = /* .line 19 */
} // :goto_0
int v4 = 3; // const/4 v4, 0x3
/* if-ne v3, v4, :cond_1 */
/* .line 20 */
v4 = (( java.lang.String ) v1 ).equals ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_0 */
} // :cond_0
} // :cond_1
} // :goto_1
/* if-ne v3, v0, :cond_5 */
/* .line 21 */
v3 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 22 */
e.d.a.a.c.m .a ( p0,v2 );
/* .line 23 */
} // :cond_2
final String v4 = "domain"; // const-string v4, "domain"
v3 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 24 */
e.d.a.a.c.m .a ( p0 );
/* .line 25 */
v4 = this.b;
(( e.d.a.a.c.a ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Le/d/a/a/c/a;->a(Ljava/lang/String;)Le/d/a/a/c/a;
v3 = this.a;
/* .line 26 */
(( e.d.a.a.c.a ) v2 ).c ( v3 ); // invoke-virtual {v2, v3}, Le/d/a/a/c/a;->c(Ljava/lang/Boolean;)Le/d/a/a/c/a;
/* .line 27 */
} // :cond_3
final String v4 = "pin-set"; // const-string v4, "pin-set"
v3 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 28 */
e.d.a.a.c.m .b ( p0 );
/* .line 29 */
v4 = this.b;
(( e.d.a.a.c.a ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Le/d/a/a/c/a;->a(Ljava/util/Set;)Le/d/a/a/c/a;
v3 = this.a;
/* .line 30 */
(( e.d.a.a.c.a ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/d/a/a/c/a;->a(Ljava/util/Date;)Le/d/a/a/c/a;
/* .line 31 */
} // :cond_4
final String v4 = "trustkit-config"; // const-string v4, "trustkit-config"
v3 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 32 */
e.d.a.a.c.m .c ( p0 );
/* .line 33 */
v4 = this.c;
(( e.d.a.a.c.a ) v2 ).b ( v4 ); // invoke-virtual {v2, v4}, Le/d/a/a/c/a;->b(Ljava/util/Set;)Le/d/a/a/c/a;
v4 = this.a;
/* .line 34 */
(( e.d.a.a.c.a ) v2 ).b ( v4 ); // invoke-virtual {v2, v4}, Le/d/a/a/c/a;->b(Ljava/lang/Boolean;)Le/d/a/a/c/a;
v3 = this.b;
/* .line 35 */
(( e.d.a.a.c.a ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/d/a/a/c/a;->a(Ljava/lang/Boolean;)Le/d/a/a/c/a;
/* .line 36 */
} // :cond_5
v3 = } // :goto_2
} // .end method
public static e.d.a.a.c.i b ( android.content.Context p0, org.xmlpull.v1.XmlPullParser p1 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/cert/CertificateException;, */
/* Ljava/io/IOException;, */
/* Lorg/xmlpull/v1/XmlPullParserException; */
/* } */
} // .end annotation
int v0 = 2; // const/4 v0, 0x2
int v1 = 0; // const/4 v1, 0x0
final String v2 = "debug-overrides"; // const-string v2, "debug-overrides"
/* .line 19 */
/* .line 20 */
/* new-instance v2, Le/d/a/a/c/i; */
/* invoke-direct {v2, v1}, Le/d/a/a/c/i;-><init>(Le/d/a/a/c/h;)V */
/* .line 21 */
/* new-instance v3, Ljava/util/HashSet; */
/* invoke-direct {v3}, Ljava/util/HashSet;-><init>()V */
v4 = /* .line 22 */
/* move-object v5, v1 */
} // :goto_0
int v6 = 3; // const/4 v6, 0x3
/* if-ne v4, v6, :cond_3 */
/* .line 23 */
final String v7 = "trust-anchors"; // const-string v7, "trust-anchors"
v6 = (( java.lang.String ) v7 ).equals ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v6, :cond_0 */
} // :cond_0
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 24 */
p0 = (( java.lang.Boolean ) v5 ).booleanValue ( ); // invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z
/* iput-boolean p0, v2, Le/d/a/a/c/i;->a:Z */
/* .line 25 */
p0 = } // :cond_1
/* if-lez p0, :cond_2 */
/* .line 26 */
this.b = v3;
} // :cond_2
} // :cond_3
} // :goto_1
/* if-ne v4, v0, :cond_6 */
/* .line 27 */
final String v6 = "certificates"; // const-string v6, "certificates"
v4 = (( java.lang.String ) v6 ).equals ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_6
final String v4 = "overridePins"; // const-string v4, "overridePins"
/* .line 28 */
v4 = java.lang.Boolean .parseBoolean ( v4 );
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 29 */
v5 = (( java.lang.Boolean ) v5 ).booleanValue ( ); // invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z
/* if-eq v5, v4, :cond_4 */
int v4 = 0; // const/4 v4, 0x0
/* .line 30 */
java.lang.Boolean .valueOf ( v4 );
final String v5 = "Warning: different values for overridePins are set in the policy but TrustKit only supports one value; using overridePins=false for all connections"; // const-string v5, "Warning: different values for overridePins are set in the policy but TrustKit only supports one value; using overridePins=false for all connections"
/* .line 31 */
e.d.a.a.f.a .b ( v5 );
/* .line 32 */
} // :cond_4
java.lang.Boolean .valueOf ( v4 );
} // :goto_2
/* move-object v5, v4 */
final String v4 = "src"; // const-string v4, "src"
/* .line 33 */
(( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 34 */
e.d.a.a.c.m .a ( p0,v4 );
/* .line 35 */
v6 = android.text.TextUtils .isEmpty ( v4 );
/* if-nez v6, :cond_5 */
final String v6 = "user"; // const-string v6, "user"
v6 = (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v6, :cond_5 */
final String v6 = "system"; // const-string v6, "system"
/* .line 36 */
v6 = (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v6, :cond_5 */
final String v6 = "@raw"; // const-string v6, "@raw"
v6 = (( java.lang.String ) v4 ).startsWith ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 37 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 38 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
final String v8 = "/"; // const-string v8, "/"
/* .line 39 */
(( java.lang.String ) v4 ).split ( v8 ); // invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
int v8 = 1; // const/4 v8, 0x1
/* aget-object v4, v4, v8 */
/* .line 40 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v9 = "raw"; // const-string v9, "raw"
/* .line 41 */
v4 = (( android.content.res.Resources ) v7 ).getIdentifier ( v4, v9, v8 ); // invoke-virtual {v7, v4, v9, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
/* .line 42 */
(( android.content.res.Resources ) v6 ).openRawResource ( v4 ); // invoke-virtual {v6, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
final String v6 = "X.509"; // const-string v6, "X.509"
/* .line 43 */
java.security.cert.CertificateFactory .getInstance ( v6 );
/* .line 44 */
(( java.security.cert.CertificateFactory ) v6 ).generateCertificate ( v4 ); // invoke-virtual {v6, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
/* .line 45 */
} // :cond_5
final String v4 = "No <debug-overrides> certificates found by TrustKit.Please check your @raw folder (TrustKit doesn\'t support system and user installed certificates)."; // const-string v4, "No <debug-overrides> certificates found by TrustKit.Please check your @raw folder (TrustKit doesn\'t support system and user installed certificates)."
/* .line 46 */
e.d.a.a.f.a .a ( v4 );
/* .line 47 */
} // :cond_6
v4 = } // :goto_3
/* goto/16 :goto_0 */
} // .end method
public static e.d.a.a.c.k b ( org.xmlpull.v1.XmlPullParser p0 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/xmlpull/v1/XmlPullParserException; */
/* } */
} // .end annotation
final String v0 = "Invalid expiration date in pin-set"; // const-string v0, "Invalid expiration date in pin-set"
final String v1 = "pin-set"; // const-string v1, "pin-set"
int v2 = 2; // const/4 v2, 0x2
int v3 = 0; // const/4 v3, 0x0
/* .line 1 */
/* .line 2 */
/* new-instance v4, Le/d/a/a/c/k; */
/* invoke-direct {v4, v3}, Le/d/a/a/c/k;-><init>(Le/d/a/a/c/h;)V */
/* .line 3 */
/* new-instance v5, Ljava/util/HashSet; */
/* invoke-direct {v5}, Ljava/util/HashSet;-><init>()V */
this.b = v5;
final String v5 = "expiration"; // const-string v5, "expiration"
/* .line 4 */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 5 */
try { // :try_start_0
/* new-instance v6, Ljava/text/SimpleDateFormat; */
final String v7 = "yyyy-MM-dd"; // const-string v7, "yyyy-MM-dd"
v8 = java.util.Locale.US;
/* invoke-direct {v6, v7, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
int v7 = 0; // const/4 v7, 0x0
/* .line 6 */
(( java.text.SimpleDateFormat ) v6 ).setLenient ( v7 ); // invoke-virtual {v6, v7}, Ljava/text/SimpleDateFormat;->setLenient(Z)V
/* .line 7 */
(( java.text.SimpleDateFormat ) v6 ).parse ( v5 ); // invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 8 */
this.a = v5;
/* .line 9 */
} // :cond_0
/* new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
/* invoke-direct {p0, v0}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* :try_end_0 */
/* .catch Ljava/text/ParseException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 10 */
/* :catch_0 */
/* new-instance p0, Lcom/datatheorem/android/trustkit/config/ConfigurationException; */
/* invoke-direct {p0, v0}, Lcom/datatheorem/android/trustkit/config/ConfigurationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 11 */
} // :cond_1
v0 = } // :goto_0
} // :goto_1
int v5 = 3; // const/4 v5, 0x3
/* if-ne v0, v5, :cond_3 */
/* .line 12 */
v5 = (( java.lang.String ) v1 ).equals ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v5, :cond_2 */
} // :cond_2
} // :cond_3
} // :goto_2
/* if-ne v0, v2, :cond_5 */
/* .line 13 */
final String v5 = "pin"; // const-string v5, "pin"
v0 = (( java.lang.String ) v5 ).equals ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
final String v0 = "digest"; // const-string v0, "digest"
/* .line 14 */
if ( v0 != null) { // if-eqz v0, :cond_4
final String v5 = "SHA-256"; // const-string v5, "SHA-256"
/* .line 15 */
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 16 */
v0 = this.b;
/* .line 17 */
} // :cond_4
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpected digest value: "; // const-string v2, "Unexpected digest value: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 18 */
} // :cond_5
v0 = } // :goto_3
} // .end method
public static e.d.a.a.c.l c ( org.xmlpull.v1.XmlPullParser p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lorg/xmlpull/v1/XmlPullParserException; */
/* } */
} // .end annotation
final String v0 = "trustkit-config"; // const-string v0, "trustkit-config"
int v1 = 2; // const/4 v1, 0x2
int v2 = 0; // const/4 v2, 0x0
/* .line 1 */
/* .line 2 */
/* new-instance v3, Le/d/a/a/c/l; */
/* invoke-direct {v3, v2}, Le/d/a/a/c/l;-><init>(Le/d/a/a/c/h;)V */
/* .line 3 */
/* new-instance v4, Ljava/util/HashSet; */
/* invoke-direct {v4}, Ljava/util/HashSet;-><init>()V */
final String v5 = "enforcePinning"; // const-string v5, "enforcePinning"
/* .line 4 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 5 */
v5 = java.lang.Boolean .parseBoolean ( v5 );
java.lang.Boolean .valueOf ( v5 );
this.a = v5;
} // :cond_0
final String v5 = "disableDefaultReportUri"; // const-string v5, "disableDefaultReportUri"
/* .line 6 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
v2 = java.lang.Boolean .parseBoolean ( v2 );
java.lang.Boolean .valueOf ( v2 );
this.b = v2;
/* .line 8 */
v2 = } // :cond_1
} // :goto_0
int v5 = 3; // const/4 v5, 0x3
/* if-ne v2, v5, :cond_3 */
/* .line 9 */
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v5, :cond_2 */
/* .line 10 */
} // :cond_2
this.c = v4;
} // :cond_3
} // :goto_1
/* if-ne v2, v1, :cond_4 */
/* .line 11 */
final String v5 = "report-uri"; // const-string v5, "report-uri"
v2 = (( java.lang.String ) v5 ).equals ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 12 */
/* .line 13 */
v2 = } // :cond_4
} // .end method
